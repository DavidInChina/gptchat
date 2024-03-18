package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.ListeningPointExt;
import android.gov.nist.javax.sip.SipStackImpl;
import java.net.InetAddress;

/* loaded from: classes2.dex */
public class NioMessageProcessorFactory implements MessageProcessorFactory {
    @Override // android.gov.nist.javax.sip.stack.MessageProcessorFactory
    public MessageProcessor createMessageProcessor(SIPTransactionStack sIPTransactionStack, InetAddress inetAddress, int i10, String str) {
        if (str.equalsIgnoreCase("UDP")) {
            UDPMessageProcessor uDPMessageProcessor = new UDPMessageProcessor(inetAddress, sIPTransactionStack, i10);
            sIPTransactionStack.udpFlag = true;
            return uDPMessageProcessor;
        } else if (str.equalsIgnoreCase("TCP")) {
            return new NioTcpMessageProcessor(inetAddress, sIPTransactionStack, i10);
        } else {
            if (str.equalsIgnoreCase("TLS")) {
                return new NioTlsMessageProcessor(inetAddress, sIPTransactionStack, i10);
            }
            if (str.equalsIgnoreCase("SCTP")) {
                try {
                    MessageProcessor messageProcessor = (MessageProcessor) ClassLoader.getSystemClassLoader().loadClass("android.gov.nist.javax.sip.stack.sctp.SCTPMessageProcessor").newInstance();
                    messageProcessor.initialize(inetAddress, i10, sIPTransactionStack);
                    return messageProcessor;
                } catch (ClassNotFoundException unused) {
                    throw new IllegalArgumentException("SCTP not supported (needs Java 7 and SCTP jar in classpath)");
                } catch (IllegalAccessException e10) {
                    throw new IllegalArgumentException("Error initializing SCTP", e10);
                } catch (InstantiationException e11) {
                    throw new IllegalArgumentException("Error initializing SCTP", e11);
                }
            } else if (str.equalsIgnoreCase(ListeningPointExt.WS)) {
                if ("true".equals(((SipStackImpl) sIPTransactionStack).getConfigurationProperties().getProperty("android.gov.nist.javax.sip.USE_TLS_GATEWAY"))) {
                    NioTlsWebSocketMessageProcessor nioTlsWebSocketMessageProcessor = new NioTlsWebSocketMessageProcessor(inetAddress, sIPTransactionStack, i10);
                    nioTlsWebSocketMessageProcessor.transport = ListeningPointExt.WS;
                    return nioTlsWebSocketMessageProcessor;
                }
                NioWebSocketMessageProcessor nioWebSocketMessageProcessor = new NioWebSocketMessageProcessor(inetAddress, sIPTransactionStack, i10);
                nioWebSocketMessageProcessor.transport = ListeningPointExt.WS;
                return nioWebSocketMessageProcessor;
            } else if (str.equalsIgnoreCase(ListeningPointExt.WSS)) {
                if ("true".equals(((SipStackImpl) sIPTransactionStack).getConfigurationProperties().getProperty("android.gov.nist.javax.sip.USE_TLS_GATEWAY"))) {
                    NioWebSocketMessageProcessor nioWebSocketMessageProcessor2 = new NioWebSocketMessageProcessor(inetAddress, sIPTransactionStack, i10);
                    nioWebSocketMessageProcessor2.transport = ListeningPointExt.WSS;
                    return nioWebSocketMessageProcessor2;
                }
                NioTlsWebSocketMessageProcessor nioTlsWebSocketMessageProcessor2 = new NioTlsWebSocketMessageProcessor(inetAddress, sIPTransactionStack, i10);
                nioTlsWebSocketMessageProcessor2.transport = ListeningPointExt.WSS;
                return nioTlsWebSocketMessageProcessor2;
            } else {
                throw new IllegalArgumentException("bad transport");
            }
        }
    }
}
