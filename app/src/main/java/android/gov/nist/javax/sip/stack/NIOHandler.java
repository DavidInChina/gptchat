package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class NIOHandler {
    private static StackLogger logger = CommonLogger.getLogger(NIOHandler.class);
    private NioTcpMessageProcessor messageProcessor;
    private SipStackImpl sipStack;
    protected SocketTimeoutAuditor socketTimeoutAuditor;
    private AtomicBoolean stopped = new AtomicBoolean(false);
    private final ConcurrentHashMap<String, SocketChannel> socketTable = new ConcurrentHashMap<>();
    protected HashMap<SocketChannel, NioTcpMessageChannel> channelMap = new HashMap<>();
    KeyedSemaphore keyedSemaphore = new KeyedSemaphore();

    public NIOHandler(SIPTransactionStack sIPTransactionStack, NioTcpMessageProcessor nioTcpMessageProcessor) {
        this.socketTimeoutAuditor = null;
        this.sipStack = (SipStackImpl) sIPTransactionStack;
        this.messageProcessor = nioTcpMessageProcessor;
        if (sIPTransactionStack.nioSocketMaxIdleTime > 0 && (nioTcpMessageProcessor instanceof ConnectionOrientedMessageProcessor)) {
            this.socketTimeoutAuditor = new SocketTimeoutAuditor(sIPTransactionStack.nioSocketMaxIdleTime, this);
            SipTimer timer = sIPTransactionStack.getTimer();
            SocketTimeoutAuditor socketTimeoutAuditor = this.socketTimeoutAuditor;
            long j6 = sIPTransactionStack.nioSocketMaxIdleTime;
            timer.scheduleWithFixedDelay(socketTimeoutAuditor, j6, j6);
        }
    }

    public static String makeKey(InetAddress inetAddress, int i10) {
        return inetAddress.getHostAddress() + ":" + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3 A[Catch: all -> 0x016e, TRY_LEAVE, TryCatch #8 {all -> 0x016e, blocks: (B:63:0x0159, B:65:0x015f, B:67:0x0165, B:73:0x0171, B:75:0x017e, B:76:0x0195, B:77:0x01a9, B:79:0x01b3), top: B:96:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private SocketChannel openOutgoingConnection(InetAddress inetAddress, InetAddress inetAddress2, int i10, boolean z10, String str) {
        char c10;
        boolean z11;
        boolean z12;
        IOException e10;
        Throwable th2;
        int i11;
        SocketChannel socketChannel;
        String str2 = str;
        if (z10) {
            c10 = 2;
        } else {
            c10 = 1;
        }
        boolean z13 = false;
        try {
            this.keyedSemaphore.enterIOCriticalSection(str2);
            try {
                SocketChannel socket = getSocket(str2);
                if (socket != null) {
                    if (socket.isConnected()) {
                        if (!socket.isOpen()) {
                        }
                    }
                    if (!socket.isConnectionPending()) {
                        removeSocket(str2, false);
                        socket = null;
                    }
                }
                if (socket == null) {
                    if (c10 > 0 && socket == null) {
                        try {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("inaddr = " + inetAddress2);
                                logger.logDebug("port = " + i10);
                            }
                            try {
                                socket = this.messageProcessor.connect(new InetSocketAddress(inetAddress2, i10), inetAddress, this.messageProcessor.sipStack.connTimeout);
                                putSocket(str2, socket);
                            } catch (SocketException e11) {
                                if (logger.isLoggingEnabled(16)) {
                                    logger.logInfo("Problem connecting " + inetAddress2 + Separators.SP + i10 + Separators.SP + inetAddress);
                                }
                                removeSocket(str2, false);
                                throw new SocketException(e11.getClass() + Separators.SP + e11.getMessage() + Separators.SP + e11.getCause() + " Problem connecting " + inetAddress2 + Separators.SP + i10 + Separators.SP + inetAddress);
                            }
                        } catch (IOException e12) {
                            e10 = e12;
                            z12 = true;
                            z11 = true;
                            try {
                                if (logger.isLoggingEnabled(16)) {
                                    logger.logInfo("Problem OpeningConn:  inAddr " + inetAddress2.getHostAddress() + " port = " + i10 + " retry " + z10);
                                }
                                removeSocket(str2, false);
                                if (!z10) {
                                    if (i10 <= 0) {
                                        i11 = SIPConstants.DEFAULT_PORT;
                                    } else {
                                        i11 = i10;
                                    }
                                    String makeKey = makeKey(inetAddress2, i11);
                                    try {
                                        SocketChannel socket2 = getSocket(makeKey);
                                        if (socket2 != null && socket2.isConnected() && socket2.isOpen()) {
                                            socketChannel = socket2;
                                            if (logger.isLoggingEnabled(32)) {
                                                logger.logDebug("sending to " + makeKey);
                                            }
                                            if (z12) {
                                                if (z11) {
                                                    removeSocket(makeKey, true);
                                                }
                                                this.keyedSemaphore.leaveIOCriticalSection(makeKey);
                                            }
                                            return socketChannel;
                                        }
                                        removeSocket(makeKey, false);
                                        if (logger.isLoggingEnabled(32)) {
                                            logger.logDebug("inaddr = " + inetAddress2 + " port = " + i11);
                                        }
                                        socketChannel = this.messageProcessor.connect(new InetSocketAddress(inetAddress2, i11), inetAddress, this.messageProcessor.sipStack.connTimeout);
                                        putSocket(makeKey, socketChannel);
                                        if (logger.isLoggingEnabled(32)) {
                                        }
                                        if (z12) {
                                        }
                                        return socketChannel;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        str2 = makeKey;
                                        z13 = z12;
                                        if (z13) {
                                            if (z11) {
                                                removeSocket(str2, true);
                                            }
                                            this.keyedSemaphore.leaveIOCriticalSection(str2);
                                        }
                                        throw th2;
                                    }
                                }
                                logger.logError("IOException occured at ", e10);
                                throw e10;
                            } catch (Throwable th4) {
                                th2 = th4;
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            z11 = true;
                            z13 = true;
                            if (z13) {
                            }
                            throw th2;
                        }
                    }
                    z13 = true;
                }
                if (z13) {
                    removeSocket(str2, true);
                }
                this.keyedSemaphore.leaveIOCriticalSection(str2);
                return socket;
            } catch (IOException e13) {
                e10 = e13;
                z11 = false;
                z12 = true;
            } catch (Throwable th6) {
                th2 = th6;
                z11 = false;
            }
        } catch (IOException e14) {
            e10 = e14;
            z12 = false;
            z11 = false;
        } catch (Throwable th7) {
            th2 = th7;
            z11 = false;
        }
    }

    private void removeSocket(String str, boolean z10) {
        Throwable th2;
        IOException e10;
        boolean z11 = false;
        try {
            try {
                this.keyedSemaphore.enterIOCriticalSection(str);
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (IOException e11) {
            e10 = e11;
        }
        try {
            SocketChannel remove = this.socketTable.remove(str);
            if (logger.isLoggingEnabled(32)) {
                boolean z12 = remove != null;
                logger.logDebug("removed Socket for key " + str + ", removed:" + z12);
            }
            if (z10) {
                this.keyedSemaphore.remove(str);
                if (logger.isLoggingEnabled(32)) {
                    if (remove != null) {
                        z11 = true;
                    }
                    logger.logDebug("removed Semaphore for key " + str + ", removed:" + z11);
                }
            }
        } catch (IOException e12) {
            e10 = e12;
            z11 = true;
            if (logger.isLoggingEnabled(32)) {
                logger.logError("Failed on putting socket", e10);
            }
            if (!z11) {
                return;
            }
            this.keyedSemaphore.leaveIOCriticalSection(str);
        } catch (Throwable th4) {
            th2 = th4;
            z11 = true;
            if (z11) {
                this.keyedSemaphore.leaveIOCriticalSection(str);
            }
            throw th2;
        }
        this.keyedSemaphore.leaveIOCriticalSection(str);
    }

    private void writeChunks(SocketChannel socketChannel, byte[] bArr, int i10) {
        this.messageProcessor.send(socketChannel, bArr);
    }

    public void closeAll() {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Closing " + this.socketTable.size() + " sockets from IOHandler");
        }
        Enumeration<SocketChannel> elements = this.socketTable.elements();
        while (elements.hasMoreElements()) {
            try {
                elements.nextElement().close();
            } catch (IOException unused) {
            }
        }
    }

    public SocketChannel createOrReuseSocket(InetAddress inetAddress, int i10) {
        SocketChannel socketChannel = null;
        if (this.stopped.get()) {
            return null;
        }
        String makeKey = makeKey(inetAddress, i10);
        SocketChannel socket = getSocket(makeKey);
        if (socket != null && ((!socket.isConnected() || !socket.isOpen()) && !socket.isConnectionPending())) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Channel disconnected " + socket);
            }
        } else {
            socketChannel = socket;
        }
        if (socketChannel == null) {
            socketChannel = openOutgoingConnection(this.messageProcessor.getIpAddress(), inetAddress, i10, false, makeKey);
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger2 = logger;
            stackLogger2.logDebug("Returning socket " + makeKey + " channel = " + socketChannel);
        }
        return socketChannel;
    }

    public int getCurrentChannelSize() {
        return this.channelMap.size();
    }

    public NioTcpMessageChannel getMessageChannel(SocketChannel socketChannel) {
        return this.channelMap.get(socketChannel);
    }

    public SocketChannel getSocket(String str) {
        return this.socketTable.get(str);
    }

    public void putMessageChannel(SocketChannel socketChannel, NioTcpMessageChannel nioTcpMessageChannel) {
        this.channelMap.put(socketChannel, nioTcpMessageChannel);
    }

    public void putSocket(String str, SocketChannel socketChannel) {
        if (this.stopped.get()) {
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            a.w("adding socket for key ", str, logger);
        }
        boolean z10 = false;
        try {
            try {
                this.keyedSemaphore.enterIOCriticalSection(str);
                z10 = true;
                this.socketTable.put(str, socketChannel);
            } catch (IOException e10) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logError("Failed on putting socket", e10);
                }
                if (!z10) {
                    return;
                }
            }
            this.keyedSemaphore.leaveIOCriticalSection(str);
        } catch (Throwable th2) {
            if (z10) {
                this.keyedSemaphore.leaveIOCriticalSection(str);
            }
            throw th2;
        }
    }

    public void removeMessageChannel(SocketChannel socketChannel) {
        this.channelMap.remove(socketChannel);
    }

    public SocketChannel sendBytes(InetAddress inetAddress, InetAddress inetAddress2, int i10, String str, byte[] bArr, boolean z10, NioTcpMessageChannel nioTcpMessageChannel) {
        boolean z11;
        SocketChannel socketChannel = null;
        if (this.stopped.get()) {
            return null;
        }
        int length = bArr.length;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            StringBuilder s10 = a.s("sendBytes ", str, " inAddr ");
            s10.append(inetAddress2.getHostAddress());
            s10.append(" port = ");
            s10.append(i10);
            s10.append(" length = ");
            s10.append(length);
            s10.append(" retry ");
            s10.append(z10);
            stackLogger.logDebug(s10.toString());
        }
        if (logger.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            logger.logStackTrace(16);
        }
        String makeKey = makeKey(inetAddress2, i10);
        SocketChannel socket = getSocket(makeKey);
        if (socket == null || ((socket.isConnected() && socket.isOpen()) || socket.isConnectionPending())) {
            socketChannel = socket;
        }
        if (socketChannel == null) {
            socketChannel = openOutgoingConnection(inetAddress, inetAddress2, i10, z10, makeKey);
            nioTcpMessageChannel.peerPort = i10;
            z11 = true;
        } else {
            z11 = false;
        }
        if (socketChannel != null) {
            if (z11 && (nioTcpMessageChannel instanceof NioTlsMessageChannel)) {
                NioTlsMessageChannel nioTlsMessageChannel = (NioTlsMessageChannel) nioTcpMessageChannel;
                nioTlsMessageChannel.setHandshakeCompletedListener(new HandshakeCompletedListenerImpl(nioTlsMessageChannel, socketChannel));
            } else {
                writeChunks(socketChannel, bArr, length);
            }
        }
        if (socketChannel == null) {
            if (logger.isLoggingEnabled(4)) {
                logger.logError(this.socketTable.toString());
                StackLogger stackLogger2 = logger;
                stackLogger2.logError("Could not connect to " + inetAddress2 + ":" + i10);
            }
            throw new IOException("Could not connect to " + inetAddress2 + ":" + i10);
        }
        return socketChannel;
    }

    public void stop() {
        this.stopped.set(true);
        try {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("keys to check for inactivity removal " + this.channelMap.keySet());
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("existing socket in NIOHandler " + this.socketTable.keySet());
            }
            Iterator<Map.Entry<SocketChannel, NioTcpMessageChannel>> it = this.channelMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<SocketChannel, NioTcpMessageChannel> next = it.next();
                SocketChannel key = next.getKey();
                NioTcpMessageChannel value = next.getValue();
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger3 = logger;
                    stackLogger3.logDebug("stop() : Removing socket " + value.key + " socketChannel = " + key);
                }
                value.close();
                this.channelMap.remove(key);
                it = this.channelMap.entrySet().iterator();
            }
        } catch (Exception unused) {
        }
    }

    public static String makeKey(String str, int i10) {
        return str + ":" + i10;
    }

    public void removeSocket(SocketChannel socketChannel) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Trying to remove cached socketChannel without key" + this + " socketChannel = " + socketChannel);
        }
        LinkedList linkedList = new LinkedList();
        for (Map.Entry<String, SocketChannel> entry : this.socketTable.entrySet()) {
            if (entry.getValue().equals(socketChannel)) {
                linkedList.add(entry.getKey());
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("Removing cached socketChannel without key" + this + " socketChannel = " + socketChannel + " key = " + str);
            }
            removeSocket(str, true);
        }
    }
}
