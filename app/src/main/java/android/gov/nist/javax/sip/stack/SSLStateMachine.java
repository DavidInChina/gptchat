package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public class SSLStateMachine {
    protected NioTlsChannelInterface channel;
    protected SSLEngine sslEngine;
    protected ByteBuffer tlsRecordBuffer;
    private static StackLogger logger = CommonLogger.getLogger(SSLStateMachine.class);
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.wrap(new byte[0]);
    protected Queue<MessageSendItem> pendingOutboundBuffers = new LinkedList();
    private Object unwrapLock = new Object();
    private Object wrapLock = new Object();

    /* renamed from: android.gov.nist.javax.sip.stack.SSLStateMachine$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus;

        static {
            int[] iArr = new int[SSLEngineResult.HandshakeStatus.values().length];
            $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus = iArr;
            try {
                iArr[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface MessageSendCallback {
        void doSend(byte[] bArr);
    }

    /* loaded from: classes2.dex */
    public static class MessageSendItem {
        private MessageSendCallback callback;
        private ByteBuffer message;

        public MessageSendItem(ByteBuffer byteBuffer, MessageSendCallback messageSendCallback) {
            this.message = byteBuffer;
            this.callback = messageSendCallback;
        }

        public MessageSendCallback getCallBack() {
            return this.callback;
        }

        public String toString() {
            return MessageSendItem.class.getSimpleName() + " [" + this.message + ", " + this.callback + "]";
        }
    }

    public SSLStateMachine(SSLEngine sSLEngine, NioTlsChannelInterface nioTlsChannelInterface) {
        this.sslEngine = sSLEngine;
        this.channel = nioTlsChannelInterface;
    }

    private void clearBuffer() {
        this.tlsRecordBuffer = null;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Buffer cleared");
        }
    }

    private ByteBuffer normalizeTlsRecordBuffer(ByteBuffer byteBuffer) {
        if (this.tlsRecordBuffer == null) {
            return byteBuffer;
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Normalize buffer " + byteBuffer + " into record buffer " + this.tlsRecordBuffer);
        }
        ByteBuffer byteBuffer2 = this.tlsRecordBuffer;
        byteBuffer2.position(byteBuffer2.limit());
        ByteBuffer byteBuffer3 = this.tlsRecordBuffer;
        byteBuffer3.limit(byteBuffer3.capacity());
        this.tlsRecordBuffer.put(byteBuffer);
        this.tlsRecordBuffer.flip();
        return this.tlsRecordBuffer;
    }

    private void runDelegatedTasks(SSLEngineResult sSLEngineResult) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Running delegated task for " + sSLEngineResult);
        }
        if (sSLEngineResult.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_TASK) {
            while (true) {
                Runnable delegatedTask = this.sslEngine.getDelegatedTask();
                if (delegatedTask == null) {
                    break;
                }
                delegatedTask.run();
            }
            SSLEngineResult.HandshakeStatus handshakeStatus = this.sslEngine.getHandshakeStatus();
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("Handshake status after delegated tasks " + handshakeStatus);
            }
            if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_TASK) {
                throw new IOException("handshake shouldn't need additional tasks");
            }
        }
    }

    private void startBuffer(ByteBuffer byteBuffer) {
        if (this.tlsRecordBuffer == null) {
            ByteBuffer allocateDirect = ByteBufferFactory.getInstance().allocateDirect(33270);
            this.tlsRecordBuffer = allocateDirect;
            allocateDirect.put(byteBuffer);
            this.tlsRecordBuffer.flip();
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Allocated record buffer for reading " + this.tlsRecordBuffer + " for src = " + byteBuffer);
            }
        }
    }

    private void wrapNonAppData() {
        SSLEngineResult wrap;
        ByteBuffer prepareEncryptedDataBuffer = this.channel.prepareEncryptedDataBuffer();
        do {
            wrap = this.sslEngine.wrap(EMPTY_BUFFER, prepareEncryptedDataBuffer);
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("NonAppWrap result " + wrap + " buffers size " + this.pendingOutboundBuffers.size());
            }
            if (wrap.bytesProduced() > 0) {
                prepareEncryptedDataBuffer.flip();
                byte[] bArr = new byte[prepareEncryptedDataBuffer.remaining()];
                prepareEncryptedDataBuffer.get(bArr);
                sendSSLMetadata(bArr);
                prepareEncryptedDataBuffer.clear();
            }
            int i10 = AnonymousClass1.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[wrap.getHandshakeStatus().ordinal()];
            if (i10 != 3) {
                if (i10 == 4) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Handshake complete!");
                    }
                    NioTlsChannelInterface nioTlsChannelInterface = this.channel;
                    if (nioTlsChannelInterface instanceof NioTlsMessageChannel) {
                        ((NioTlsMessageChannel) nioTlsChannelInterface).setHandshakeCompleted(true);
                        if (this.sslEngine.getSession() != null) {
                            if (!ClientAuthType.Disabled.equals(this.channel.getSIPStack().getClientAuth()) && !ClientAuthType.DisabledAll.equals(this.channel.getSIPStack().getClientAuth())) {
                                try {
                                    ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setPeerCertificates(this.sslEngine.getSession().getPeerCertificates());
                                } catch (SSLPeerUnverifiedException unused) {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("sslEngine.getSession().getPeerCertificates() are not available, which is normal if running with android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE=Disabled");
                                    }
                                } catch (SSLException e10) {
                                    throw e10;
                                }
                            }
                            ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setLocalCertificates(this.sslEngine.getSession().getLocalCertificates());
                            ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setCipherSuite(this.sslEngine.getSession().getCipherSuite());
                        }
                    }
                }
            } else {
                runDelegatedTasks(wrap);
            }
        } while (wrap.bytesProduced() != 0);
    }

    public void sendSSLMetadata(byte[] bArr) {
        this.channel.sendEncryptedData(bArr);
    }

    public void unwrap(ByteBuffer byteBuffer) {
        unwrap(byteBuffer, this.channel.prepareAppDataBuffer());
    }

    public void wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, MessageSendCallback messageSendCallback) {
        synchronized (this.wrapLock) {
            try {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    stackLogger.logDebug("Wrapping " + byteBuffer + ", buffers size " + this.pendingOutboundBuffers.size());
                }
                if (byteBuffer != null) {
                    this.pendingOutboundBuffers.offer(new MessageSendItem(byteBuffer, messageSendCallback));
                }
            } catch (Throwable th2) {
                throw th2;
            }
            while (true) {
                MessageSendItem peek = this.pendingOutboundBuffers.peek();
                if (peek == null) {
                    break;
                }
                SSLEngineResult wrap = this.sslEngine.wrap(peek.message, byteBuffer2);
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("Wrap result " + wrap + " buffers size " + this.pendingOutboundBuffers.size());
                }
                if (!peek.message.hasRemaining()) {
                    this.pendingOutboundBuffers.remove();
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger3 = logger;
                        stackLogger3.logDebug("REMOVED item from encryption queue because it has no more data, all is done, buffers size now is " + this.pendingOutboundBuffers.size() + " current buffer is " + peek);
                    }
                }
                int remaining = peek.message.remaining();
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger4 = logger;
                    stackLogger4.logDebug("Remaining " + remaining + " queue size is " + this.pendingOutboundBuffers.size());
                }
                if (wrap.bytesProduced() > 0) {
                    byteBuffer2.flip();
                    byte[] bArr = new byte[byteBuffer2.remaining()];
                    byteBuffer2.get(bArr);
                    if (peek.getCallBack() != null) {
                        peek.getCallBack().doSend(bArr);
                    } else {
                        sendSSLMetadata(bArr);
                    }
                    byteBuffer2.clear();
                } else {
                    int i10 = AnonymousClass1.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[wrap.getHandshakeStatus().ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            break;
                        } else if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    break;
                                }
                            } else {
                                NioTlsChannelInterface nioTlsChannelInterface = this.channel;
                                if (nioTlsChannelInterface instanceof NioTlsMessageChannel) {
                                    ((NioTlsMessageChannel) nioTlsChannelInterface).setHandshakeCompleted(true);
                                    if (this.sslEngine.getSession() != null) {
                                        if (!ClientAuthType.Disabled.equals(this.channel.getSIPStack().getClientAuth()) && !ClientAuthType.DisabledAll.equals(this.channel.getSIPStack().getClientAuth())) {
                                            try {
                                                ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setPeerCertificates(this.sslEngine.getSession().getPeerCertificates());
                                            } catch (SSLPeerUnverifiedException unused) {
                                                if (logger.isLoggingEnabled(32)) {
                                                    logger.logDebug("sslEngine.getSession().getPeerCertificates() are not available, which is normal if running with android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE=Disabled");
                                                }
                                            }
                                        }
                                        ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setLocalCertificates(this.sslEngine.getSession().getLocalCertificates());
                                        ((NioTlsMessageChannel) this.channel).getHandshakeCompletedListener().setCipherSuite(this.sslEngine.getSession().getCipherSuite());
                                    }
                                }
                            }
                        } else {
                            runDelegatedTasks(wrap);
                        }
                    } else if (!peek.message.hasRemaining()) {
                        break;
                    }
                    throw th2;
                }
            }
        }
    }

    public void wrapRemaining() {
        wrap(null, this.channel.prepareEncryptedDataBuffer(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c6, code lost:
        if (android.gov.nist.javax.sip.stack.SSLStateMachine.logger.isLoggingEnabled(32) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c8, code lost:
        android.gov.nist.javax.sip.stack.SSLStateMachine.logger.logDebug("Handshake passed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01cf, code lost:
        r7 = r6.channel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d3, code lost:
        if ((r7 instanceof android.gov.nist.javax.sip.stack.NioTlsMessageChannel) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d5, code lost:
        ((android.gov.nist.javax.sip.stack.NioTlsMessageChannel) r7).setHandshakeCompleted(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e0, code lost:
        if (r6.sslEngine.getSession() == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f2, code lost:
        if (android.gov.nist.javax.sip.stack.ClientAuthType.Disabled.equals(r6.channel.getSIPStack().getClientAuth()) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0204, code lost:
        if (android.gov.nist.javax.sip.stack.ClientAuthType.DisabledAll.equals(r6.channel.getSIPStack().getClientAuth()) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0206, code lost:
        ((android.gov.nist.javax.sip.stack.NioTlsMessageChannel) r6.channel).getHandshakeCompletedListener().setPeerCertificates(r6.sslEngine.getSession().getPeerCertificates());
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0222, code lost:
        if (android.gov.nist.javax.sip.stack.SSLStateMachine.logger.isLoggingEnabled(32) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0224, code lost:
        android.gov.nist.javax.sip.stack.SSLStateMachine.logger.logDebug("sslEngine.getSession().getPeerCertificates() are not available, which is normal if running with android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE=Disabled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022b, code lost:
        ((android.gov.nist.javax.sip.stack.NioTlsMessageChannel) r6.channel).getHandshakeCompletedListener().setLocalCertificates(r6.sslEngine.getSession().getLocalCertificates());
        ((android.gov.nist.javax.sip.stack.NioTlsMessageChannel) r6.channel).getHandshakeCompletedListener().setCipherSuite(r6.sslEngine.getSession().getCipherSuite());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0255, code lost:
        r6.channel.getSIPStack().getTlsSecurityPolicy().enforceTlsPolicy(r6.channel.getEncapsulatedClientTransaction());
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x026e, code lost:
        if (android.gov.nist.javax.sip.stack.SSLStateMachine.logger.isLoggingEnabled(32) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0270, code lost:
        android.gov.nist.javax.sip.stack.SSLStateMachine.logger.logDebug("TLS Security policy passed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0278, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0282, code lost:
        throw new java.io.IOException(r7.getMessage());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        synchronized (this.unwrapLock) {
            while (true) {
                byteBuffer = normalizeTlsRecordBuffer(byteBuffer);
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    stackLogger.logDebug("Unwrap src " + byteBuffer + " dst " + byteBuffer2);
                }
                try {
                    SSLEngineResult unwrap = this.sslEngine.unwrap(byteBuffer, byteBuffer2);
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = logger;
                        stackLogger2.logDebug("Unwrap result " + unwrap + " buffers size " + this.pendingOutboundBuffers.size() + " src=" + byteBuffer + " dst=" + byteBuffer2);
                    }
                    if (unwrap.getStatus().equals(SSLEngineResult.Status.BUFFER_UNDERFLOW)) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Buffer underflow, wait for the next inbound chunk of data to feed the SSL engine");
                        }
                        startBuffer(byteBuffer);
                    } else {
                        clearBuffer();
                        if (unwrap.getStatus().equals(SSLEngineResult.Status.BUFFER_OVERFLOW)) {
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger3 = logger;
                                stackLogger3.logDebug("Buffer overflow , must prepare the buffer again. outNetBuffer remaining: " + byteBuffer2.remaining() + " outNetBuffer postion: " + byteBuffer2.position() + " Packet buffer size: " + this.sslEngine.getSession().getPacketBufferSize() + " new buffer size: " + this.sslEngine.getSession().getPacketBufferSize() + byteBuffer2.position());
                            }
                            byteBuffer2 = this.channel.prepareAppDataBuffer(this.sslEngine.getSession().getPacketBufferSize());
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger4 = logger;
                                stackLogger4.logDebug(" new outNetBuffer remaining: " + byteBuffer2.remaining() + " new outNetBuffer postion: " + byteBuffer2.position());
                            }
                        } else {
                            if (unwrap.bytesProduced() > 0) {
                                byteBuffer2.flip();
                                byte[] bArr = new byte[byteBuffer2.remaining()];
                                byteBuffer2.get(bArr);
                                this.channel.addPlaintextBytes(bArr);
                            }
                            int i10 = AnonymousClass1.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[unwrap.getHandshakeStatus().ordinal()];
                            if (i10 == 1) {
                                wrapNonAppData();
                            } else if (i10 == 2) {
                                if (logger.isLoggingEnabled(32)) {
                                    StackLogger stackLogger5 = logger;
                                    stackLogger5.logDebug("Unwrap has remaining: " + byteBuffer.hasRemaining() + " buffer " + byteBuffer);
                                }
                                if (!byteBuffer.hasRemaining()) {
                                    break;
                                }
                            } else if (i10 == 3) {
                                runDelegatedTasks(unwrap);
                            } else if (i10 == 4) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Handshaking just finnished, but has remaining. Will try to wrap the queues app items.");
                                }
                                wrapRemaining();
                                if (!byteBuffer.hasRemaining()) {
                                    break;
                                }
                            } else if (i10 == 5) {
                                wrapRemaining();
                                if (logger.isLoggingEnabled(32)) {
                                    StackLogger stackLogger6 = logger;
                                    stackLogger6.logDebug("Not handshaking, but has remaining: " + byteBuffer.hasRemaining() + " buffer " + byteBuffer);
                                }
                                if (!byteBuffer.hasRemaining()) {
                                    break;
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger7 = logger;
                        stackLogger7.logDebug("A problem occured while trying to unwrap the message " + e10.getMessage());
                    }
                    throw e10;
                }
            }
        }
    }
}
