package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.ListeningPointExt;
import java.net.InetAddress;
import java.nio.channels.SocketChannel;
import javax.net.ssl.SSLContext;

/* loaded from: classes2.dex */
public class NioTlsWebSocketMessageProcessor extends NioWebSocketMessageProcessor {
    private static StackLogger logger = CommonLogger.getLogger(NioTlsWebSocketMessageProcessor.class);
    SSLContext sslClientCtx;
    SSLContext sslServerCtx;

    public NioTlsWebSocketMessageProcessor(InetAddress inetAddress, SIPTransactionStack sIPTransactionStack, int i10) {
        super(inetAddress, sIPTransactionStack, i10);
        this.transport = ListeningPointExt.WSS;
        try {
            init();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioWebSocketMessageProcessor, android.gov.nist.javax.sip.stack.NioTcpMessageProcessor
    public NioTcpMessageChannel createMessageChannel(NioTcpMessageProcessor nioTcpMessageProcessor, SocketChannel socketChannel) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("NioTlsWebSocketMessageProcessor::createMessageChannel: " + nioTcpMessageProcessor + " client " + socketChannel);
        }
        NioTlsWebSocketMessageChannel nioTlsWebSocketMessageChannel = (NioTlsWebSocketMessageChannel) this.nioHandler.getMessageChannel(socketChannel);
        if (nioTlsWebSocketMessageChannel == null) {
            NioTlsWebSocketMessageChannel nioTlsWebSocketMessageChannel2 = new NioTlsWebSocketMessageChannel(this.sipStack, nioTcpMessageProcessor, socketChannel);
            this.nioHandler.putMessageChannel(socketChannel, nioTlsWebSocketMessageChannel2);
            return nioTlsWebSocketMessageChannel2;
        }
        return nioTlsWebSocketMessageChannel;
    }

    public void init() {
        if (this.sipStack.securityManagerProvider.getKeyManagers(false) != null && this.sipStack.securityManagerProvider.getTrustManagers(false) != null && this.sipStack.securityManagerProvider.getTrustManagers(true) != null) {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            this.sslServerCtx = sSLContext;
            sSLContext.init(this.sipStack.securityManagerProvider.getKeyManagers(false), this.sipStack.securityManagerProvider.getTrustManagers(false), null);
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            this.sslClientCtx = sSLContext2;
            sSLContext2.init(this.sipStack.securityManagerProvider.getKeyManagers(true), this.sipStack.securityManagerProvider.getTrustManagers(true), null);
        } else if (logger.isLoggingEnabled(32)) {
            logger.logDebug("TLS initialization failed due to NULL security config");
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageProcessor, android.gov.nist.javax.sip.stack.MessageProcessor
    public MessageChannel createMessageChannel(HostPort hostPort) {
        Throwable th2;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("NioTlsWebSocketMessageProcessor::createMessageChannel: " + hostPort);
        }
        NioTlsWebSocketMessageChannel nioTlsWebSocketMessageChannel = null;
        try {
            String key = MessageChannel.getKey(hostPort, this.transport);
            if (this.messageChannels.get(key) != null) {
                NioTlsWebSocketMessageChannel nioTlsWebSocketMessageChannel2 = (NioTlsWebSocketMessageChannel) this.messageChannels.get(key);
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("MessageChannel::createMessageChannel - exit " + nioTlsWebSocketMessageChannel2);
                }
                return nioTlsWebSocketMessageChannel2;
            }
            NioTlsWebSocketMessageChannel nioTlsWebSocketMessageChannel3 = new NioTlsWebSocketMessageChannel(hostPort.getInetAddress(), hostPort.getPort(), this.sipStack, this);
            try {
                synchronized (this.messageChannels) {
                    this.messageChannels.put(key, nioTlsWebSocketMessageChannel3);
                }
                nioTlsWebSocketMessageChannel3.isCached = true;
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger3 = logger;
                    stackLogger3.logDebug("key " + key);
                    StackLogger stackLogger4 = logger;
                    stackLogger4.logDebug("Creating " + nioTlsWebSocketMessageChannel3);
                }
                this.selector.wakeup();
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger5 = logger;
                    stackLogger5.logDebug("MessageChannel::createMessageChannel - exit " + nioTlsWebSocketMessageChannel3);
                }
                return nioTlsWebSocketMessageChannel3;
            } catch (Throwable th3) {
                th2 = th3;
                nioTlsWebSocketMessageChannel = nioTlsWebSocketMessageChannel3;
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger6 = logger;
                    stackLogger6.logDebug("MessageChannel::createMessageChannel - exit " + nioTlsWebSocketMessageChannel);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageProcessor, android.gov.nist.javax.sip.stack.MessageProcessor
    public MessageChannel createMessageChannel(InetAddress inetAddress, int i10) {
        String key = MessageChannel.getKey(inetAddress, i10, this.transport);
        if (this.messageChannels.get(key) != null) {
            return this.messageChannels.get(key);
        }
        NioTlsWebSocketMessageChannel nioTlsWebSocketMessageChannel = new NioTlsWebSocketMessageChannel(inetAddress, i10, this.sipStack, this);
        this.selector.wakeup();
        this.messageChannels.put(key, nioTlsWebSocketMessageChannel);
        nioTlsWebSocketMessageChannel.isCached = true;
        if (logger.isLoggingEnabled(32)) {
            a.w("key ", key, logger);
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Creating " + nioTlsWebSocketMessageChannel);
        }
        return nioTlsWebSocketMessageChannel;
    }
}
