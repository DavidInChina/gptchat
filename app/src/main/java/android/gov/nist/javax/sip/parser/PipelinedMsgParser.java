package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel;
import android.gov.nist.javax.sip.stack.QueuedMessageDispatchBase;
import android.gov.nist.javax.sip.stack.SIPEventInterceptor;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class PipelinedMsgParser implements Runnable {
    private static final String CRLF = "\r\n";
    private static StackLogger logger = CommonLogger.getLogger(PipelinedMsgParser.class);
    private static int uid = 0;
    boolean isRunning;
    private int maxMessageSize;
    private ConcurrentHashMap<String, CallIDOrderingStructure> messagesOrderingMap;
    private Thread mythread;
    private Pipeline rawInputStream;
    protected SIPMessageListener sipMessageListener;
    private SIPTransactionStack sipStack;
    private int sizeCounter;
    private MessageParser smp;

    /* loaded from: classes.dex */
    public class CallIDOrderingStructure {
        private Semaphore semaphore = new Semaphore(1, true);
        private Queue<SIPMessage> messagesForCallID = new ConcurrentLinkedQueue();

        public CallIDOrderingStructure() {
        }

        public Queue<SIPMessage> getMessagesForCallID() {
            return this.messagesForCallID;
        }

        public Semaphore getSemaphore() {
            return this.semaphore;
        }
    }

    /* loaded from: classes.dex */
    public class Dispatch implements Runnable, QueuedMessageDispatchBase {
        CallIDOrderingStructure callIDOrderingStructure;
        String callId;
        long time = System.currentTimeMillis();

        public Dispatch(CallIDOrderingStructure callIDOrderingStructure, String str) {
            this.callIDOrderingStructure = callIDOrderingStructure;
            this.callId = str;
        }

        @Override // android.gov.nist.javax.sip.stack.QueuedMessageDispatchBase
        public long getReceptionTime() {
            return this.time;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
            if (r7.this$0.sipStack.sipEventInterceptor != null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
            r7.this$0.sipStack.sipEventInterceptor.afterMessage(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x018c, code lost:
            if (r7.this$0.sipStack.sipEventInterceptor == null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0198, code lost:
            if (android.gov.nist.javax.sip.parser.PipelinedMsgParser.logger.isLoggingEnabled(32) == false) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x019a, code lost:
            r0 = android.gov.nist.javax.sip.parser.PipelinedMsgParser.logger;
            r0.logDebug("dispatch task done on " + r2 + " threadname " + r7.this$0.mythread.getName());
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x01c1, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Semaphore semaphore = this.callIDOrderingStructure.getSemaphore();
            Queue<SIPMessage> messagesForCallID = this.callIDOrderingStructure.getMessagesForCallID();
            if (PipelinedMsgParser.this.sipStack.sipEventInterceptor != null) {
                PipelinedMsgParser.this.sipStack.sipEventInterceptor.beforeMessage(messagesForCallID.peek());
            }
            try {
                semaphore.acquire();
            } catch (InterruptedException e10) {
                StackLogger stackLogger = PipelinedMsgParser.logger;
                stackLogger.logError("Semaphore acquisition for callId " + this.callId + " interrupted", e10);
            }
            SIPMessage poll = messagesForCallID.poll();
            if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = PipelinedMsgParser.logger;
                stackLogger2.logDebug("semaphore acquired for message " + poll);
            }
            try {
                try {
                    PipelinedMsgParser.this.sipMessageListener.processMessage(poll);
                    if (messagesForCallID.size() <= 0) {
                        PipelinedMsgParser.this.messagesOrderingMap.remove(this.callId);
                        if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger3 = PipelinedMsgParser.logger;
                            stackLogger3.logDebug("CallIDOrderingStructure removed for message " + this.callId);
                        }
                    }
                    if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger4 = PipelinedMsgParser.logger;
                        stackLogger4.logDebug("releasing semaphore for message " + poll);
                    }
                    semaphore.release();
                    if (PipelinedMsgParser.this.messagesOrderingMap.isEmpty()) {
                        synchronized (PipelinedMsgParser.this.messagesOrderingMap) {
                            PipelinedMsgParser.this.messagesOrderingMap.notify();
                        }
                    }
                } catch (Exception e11) {
                    PipelinedMsgParser.logger.logError("Error occured processing message", e11);
                    if (messagesForCallID.size() <= 0) {
                        PipelinedMsgParser.this.messagesOrderingMap.remove(this.callId);
                        if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger5 = PipelinedMsgParser.logger;
                            stackLogger5.logDebug("CallIDOrderingStructure removed for message " + this.callId);
                        }
                    }
                    if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger6 = PipelinedMsgParser.logger;
                        stackLogger6.logDebug("releasing semaphore for message " + poll);
                    }
                    semaphore.release();
                    if (PipelinedMsgParser.this.messagesOrderingMap.isEmpty()) {
                        synchronized (PipelinedMsgParser.this.messagesOrderingMap) {
                            PipelinedMsgParser.this.messagesOrderingMap.notify();
                        }
                    }
                }
            } catch (Throwable th2) {
                if (messagesForCallID.size() <= 0) {
                    PipelinedMsgParser.this.messagesOrderingMap.remove(this.callId);
                    if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger7 = PipelinedMsgParser.logger;
                        stackLogger7.logDebug("CallIDOrderingStructure removed for message " + this.callId);
                    }
                }
                if (PipelinedMsgParser.logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger8 = PipelinedMsgParser.logger;
                    stackLogger8.logDebug("releasing semaphore for message " + poll);
                }
                semaphore.release();
                if (PipelinedMsgParser.this.messagesOrderingMap.isEmpty()) {
                    synchronized (PipelinedMsgParser.this.messagesOrderingMap) {
                        PipelinedMsgParser.this.messagesOrderingMap.notify();
                    }
                }
                if (PipelinedMsgParser.this.sipStack.sipEventInterceptor != null) {
                    PipelinedMsgParser.this.sipStack.sipEventInterceptor.afterMessage(poll);
                }
                throw th2;
            }
        }
    }

    public PipelinedMsgParser() {
        this.smp = null;
        this.messagesOrderingMap = new ConcurrentHashMap<>();
        this.isRunning = false;
    }

    private void cleanMessageOrderingMap() {
        this.messagesOrderingMap.clear();
        synchronized (this.messagesOrderingMap) {
            this.messagesOrderingMap.notifyAll();
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("cleaned the messagesOrderingMap " + this + " threadname " + this.mythread.getName());
        }
    }

    private static synchronized int getNewUid() {
        int i10;
        synchronized (PipelinedMsgParser.class) {
            i10 = uid;
            uid = i10 + 1;
        }
        return i10;
    }

    private String readLine(InputStream inputStream) {
        int i10 = 1024;
        byte[] bArr = new byte[1024];
        byte[] bArr2 = new byte[2];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                int i13 = read & 255;
                char c10 = (char) i13;
                if (this.maxMessageSize > 0) {
                    int i14 = this.sizeCounter - 1;
                    this.sizeCounter = i14;
                    if (i14 <= 0) {
                        throw new IOException("Max size exceeded!");
                    }
                }
                if (c10 != '\r') {
                    bArr[i11] = (byte) i13;
                    i11++;
                } else if (i11 == 0) {
                    bArr2[i12] = 13;
                    i12++;
                }
                if (c10 == '\n') {
                    if (i11 == 1 && i12 > 0) {
                        bArr2[i12] = 10;
                        i12++;
                    }
                    if (i11 == 1 && i12 > 0) {
                        return new String(bArr2, 0, i12, "UTF-8");
                    }
                    return new String(bArr, 0, i11, "UTF-8");
                } else if (i11 == i10) {
                    int i15 = i10 + 1024;
                    byte[] bArr3 = new byte[i15];
                    System.arraycopy(bArr, 0, bArr3, 0, i10);
                    i10 = i15;
                    bArr = bArr3;
                }
            } else {
                throw new IOException("End of stream");
            }
        }
    }

    public Object clone() {
        PipelinedMsgParser pipelinedMsgParser = new PipelinedMsgParser();
        pipelinedMsgParser.rawInputStream = this.rawInputStream;
        pipelinedMsgParser.sipMessageListener = this.sipMessageListener;
        new Thread(pipelinedMsgParser).setName("PipelineThread");
        return pipelinedMsgParser;
    }

    public void close() {
        this.isRunning = false;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Closing pipelinedmsgparser " + this + " threadname " + this.mythread.getName());
        }
        try {
            this.rawInputStream.close();
        } catch (IOException unused) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("Couldn't close the rawInputStream " + this + " threadname " + this.mythread.getName() + " already closed ? " + this.rawInputStream.isClosed());
            }
        }
        if (PostParseExecutorServices.getPostParseExecutor() != null) {
            cleanMessageOrderingMap();
            synchronized (this.mythread) {
                this.mythread.notifyAll();
                this.mythread.interrupt();
            }
        }
    }

    public void processInput() {
        this.mythread.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x027a, code lost:
        if (android.gov.nist.javax.sip.parser.PipelinedMsgParser.logger.isLoggingEnabled(32) != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x027c, code lost:
        android.gov.nist.javax.sip.parser.PipelinedMsgParser.logger.logDebug("Detected a parsing issue " + r3.toString() + android.gov.nist.core.Separators.SP + r4.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (android.gov.nist.javax.sip.parser.PipelinedMsgParser.logger.isLoggingEnabled(32) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        android.gov.nist.javax.sip.parser.PipelinedMsgParser.logger.logDebug("KeepAlive Double CRLF received, sending single CRLF as defined per RFC 5626 Section 4.4.1");
        android.gov.nist.javax.sip.parser.PipelinedMsgParser.logger.logDebug("~~~ setting isPreviousLineCRLF=false");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
        r12.sipMessageListener.sendSingleCLRF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
        android.gov.nist.javax.sip.parser.PipelinedMsgParser.logger.logError("A problem occured while trying to send a single CLRF in response to a double CLRF", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00db, code lost:
        throw new java.io.IOException("Pre-content-length headers size exceeded. The size of the message of the headers prior to Content-Length is too large. This must be an invalid message. Limit is MAX_MESSAGE_SIZE/2=" + (r12.maxMessageSize / 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00eb, code lost:
        r12.rawInputStream.stopTimer();
        r3.append(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
        if (r1.isLoggingEnabled(32) == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f9, code lost:
        r1.logDebug("About to parse : " + r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0112, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0115, code lost:
        r6 = r3.toString().getBytes("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0120, code lost:
        r6 = r3.toString().getBytes();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ac, code lost:
        r6.removeContent();
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0007 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        int i10;
        String readLine;
        byte[] bArr;
        SIPMessage parseSIPMessage;
        int i11;
        Pipeline pipeline;
        int read;
        Pipeline pipeline2 = this.rawInputStream;
        StackLogger stackLogger = logger;
        try {
            this.isRunning = true;
            loop0: while (this.isRunning) {
                this.sizeCounter = this.maxMessageSize;
                StringBuilder sb2 = new StringBuilder();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Starting to parse.");
                }
                i10 = 0;
                while (true) {
                    boolean z10 = false;
                    while (true) {
                        try {
                            readLine = readLine(pipeline2);
                            if (readLine.equals(Separators.RETURN)) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Discarding blank line");
                                }
                            } else if (!"\r\n".equals(readLine)) {
                                break;
                            } else if (z10) {
                                break;
                            } else {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Received CRLF");
                                }
                                SIPMessageListener sIPMessageListener = this.sipMessageListener;
                                if (sIPMessageListener != null && (sIPMessageListener instanceof ConnectionOrientedMessageChannel)) {
                                    ((ConnectionOrientedMessageChannel) sIPMessageListener).cancelPingKeepAliveTimeoutTaskIfStarted();
                                }
                                z10 = true;
                            }
                        } catch (IOException unused) {
                            if (PostParseExecutorServices.getPostParseExecutor() != null && this.isRunning) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("waiting for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                                }
                                synchronized (this.messagesOrderingMap) {
                                    try {
                                        this.messagesOrderingMap.wait(64000L);
                                    } catch (InterruptedException unused2) {
                                    }
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("got notified for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                                    }
                                }
                            }
                            this.rawInputStream.stopTimer();
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("thread ending for threadname " + this.mythread.getName());
                            }
                            if (logger.isLoggingEnabled(32)) {
                                logger.logStackTrace(32);
                            }
                            try {
                                cleanMessageOrderingMap();
                                if (!pipeline2.isClosed()) {
                                    pipeline2.close();
                                    return;
                                }
                                return;
                            } catch (IOException e10) {
                                InternalErrorHandler.handleException(e10);
                                return;
                            }
                        }
                    }
                }
                sb2.append(readLine);
                this.rawInputStream.startTimer();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Reading Input stream.");
                }
                int i12 = 0;
                while (true) {
                    try {
                        String readLine2 = readLine(pipeline2);
                        i12 += readLine2.length();
                        int i13 = this.maxMessageSize;
                        if (i13 > 0 && i12 > i13 / 2) {
                            break loop0;
                        }
                        sb2.append(readLine2);
                        if (readLine2.trim().equals("")) {
                            break;
                        }
                    } catch (IOException unused3) {
                        if (PostParseExecutorServices.getPostParseExecutor() != null && this.isRunning) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("waiting for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                            }
                            synchronized (this.messagesOrderingMap) {
                                try {
                                    this.messagesOrderingMap.wait(64000L);
                                } catch (InterruptedException unused4) {
                                }
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("got notified for messagesOrderingMap " + this + " threadname " + this.mythread.getName());
                                }
                            }
                        }
                        this.rawInputStream.stopTimer();
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("thread ending for threadname " + this.mythread.getName());
                        }
                        if (logger.isLoggingEnabled(32)) {
                            logger.logStackTrace(32);
                        }
                        try {
                            cleanMessageOrderingMap();
                            if (!pipeline2.isClosed()) {
                                pipeline2.close();
                                return;
                            }
                            return;
                        } catch (IOException e11) {
                            InternalErrorHandler.handleException(e11);
                            return;
                        }
                    }
                }
            }
            try {
                cleanMessageOrderingMap();
                if (!pipeline2.isClosed()) {
                    pipeline2.close();
                    return;
                }
                return;
            } catch (IOException e12) {
                InternalErrorHandler.handleException(e12);
                return;
            }
            pipeline.stopTimer();
            parseSIPMessage.setMessageContent(r7);
            if (this.sipMessageListener == null) {
                try {
                    if (PostParseExecutorServices.getPostParseExecutor() == null) {
                        SIPEventInterceptor sIPEventInterceptor = this.sipStack.sipEventInterceptor;
                        if (sIPEventInterceptor != null) {
                            sIPEventInterceptor.beforeMessage(parseSIPMessage);
                        }
                        this.sipMessageListener.processMessage(parseSIPMessage);
                        SIPEventInterceptor sIPEventInterceptor2 = this.sipStack.sipEventInterceptor;
                        if (sIPEventInterceptor2 != null) {
                            sIPEventInterceptor2.afterMessage(parseSIPMessage);
                        }
                    } else {
                        String callId = parseSIPMessage.getCallId().getCallId();
                        CallIDOrderingStructure callIDOrderingStructure = this.messagesOrderingMap.get(callId);
                        if (callIDOrderingStructure == null) {
                            callIDOrderingStructure = new CallIDOrderingStructure();
                            CallIDOrderingStructure putIfAbsent = this.messagesOrderingMap.putIfAbsent(callId, callIDOrderingStructure);
                            if (putIfAbsent == null) {
                                if (stackLogger.isLoggingEnabled(32)) {
                                    stackLogger.logDebug("new CallIDOrderingStructure added for message " + parseSIPMessage);
                                }
                            } else {
                                callIDOrderingStructure = putIfAbsent;
                            }
                        }
                        callIDOrderingStructure.getMessagesForCallID().offer(parseSIPMessage);
                        PostParseExecutorServices.getPostParseExecutor().execute(new Dispatch(callIDOrderingStructure, callId));
                    }
                } catch (Exception unused5) {
                }
            } else {
                continue;
            }
            parseSIPMessage = this.smp.parseSIPMessage(bArr, false, false, this.sipMessageListener);
            if (parseSIPMessage == null) {
                this.rawInputStream.stopTimer();
            } else {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Completed parsing message");
                }
                String headerAsFormattedString = parseSIPMessage.getHeaderAsFormattedString(SIPHeaderNames.CONTENT_LENGTH);
                if (headerAsFormattedString.length() <= 30) {
                    ContentLength contentLength = (ContentLength) parseSIPMessage.getContentLength();
                    if (contentLength != null) {
                        i11 = contentLength.getContentLength();
                    } else {
                        i11 = 0;
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Content length = " + i11);
                    }
                    int i14 = this.maxMessageSize;
                    if (i14 > 0 && i11 > i14) {
                        throw new RuntimeException("Max content size Exceeded! :" + i11 + " allowed max size is " + this.maxMessageSize);
                    }
                    if (i14 == 0 || i11 < this.sizeCounter) {
                        byte[] bArr2 = new byte[i11];
                        while (i10 < i11) {
                            this.rawInputStream.startTimer();
                            try {
                                read = pipeline2.read(bArr2, i10, i11 - i10);
                            } catch (IOException e13) {
                                stackLogger.logError("Exception Reading Content", e13);
                                pipeline = this.rawInputStream;
                            }
                            if (read > 0) {
                                i10 += read;
                                this.rawInputStream.stopTimer();
                            } else {
                                pipeline = this.rawInputStream;
                                pipeline.stopTimer();
                                break;
                            }
                        }
                        parseSIPMessage.setMessageContent(bArr2);
                    }
                    if (this.sipMessageListener == null) {
                    }
                } else {
                    throw new RuntimeException("Bad content lenght header " + headerAsFormattedString);
                }
            }
        } catch (Throwable th2) {
            try {
                cleanMessageOrderingMap();
                if (!pipeline2.isClosed()) {
                    pipeline2.close();
                }
            } catch (IOException e14) {
                InternalErrorHandler.handleException(e14);
            }
            throw th2;
        }
    }

    public void setMessageListener(SIPMessageListener sIPMessageListener) {
        this.sipMessageListener = sIPMessageListener;
    }

    public PipelinedMsgParser(SIPTransactionStack sIPTransactionStack, SIPMessageListener sIPMessageListener, Pipeline pipeline, boolean z10, int i10) {
        this();
        this.sipStack = sIPTransactionStack;
        this.smp = sIPTransactionStack.getMessageParserFactory().createMessageParser(sIPTransactionStack);
        this.sipMessageListener = sIPMessageListener;
        this.rawInputStream = pipeline;
        this.maxMessageSize = i10;
        Thread thread = new Thread(this);
        this.mythread = thread;
        thread.setName("PipelineThread-" + getNewUid());
    }

    public PipelinedMsgParser(SIPTransactionStack sIPTransactionStack, SIPMessageListener sIPMessageListener, Pipeline pipeline, int i10) {
        this(sIPTransactionStack, sIPMessageListener, pipeline, false, i10);
    }

    public PipelinedMsgParser(SIPTransactionStack sIPTransactionStack, Pipeline pipeline) {
        this(sIPTransactionStack, null, pipeline, false, 0);
    }
}
