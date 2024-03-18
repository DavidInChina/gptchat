package android.gov.nist.javax.sip.stack;

import java.net.InetAddress;

/* loaded from: classes.dex */
public class OIOMessageProcessorFactory implements MessageProcessorFactory {
    @Override // android.gov.nist.javax.sip.stack.MessageProcessorFactory
    public MessageProcessor createMessageProcessor(SIPTransactionStack sIPTransactionStack, InetAddress inetAddress, int i10, String str) {
        if (str.equalsIgnoreCase("UDP")) {
            UDPMessageProcessor uDPMessageProcessor = new UDPMessageProcessor(inetAddress, sIPTransactionStack, i10);
            sIPTransactionStack.udpFlag = true;
            return uDPMessageProcessor;
        } else if (str.equalsIgnoreCase("TCP")) {
            return new TCPMessageProcessor(inetAddress, sIPTransactionStack, i10);
        } else {
            if (str.equalsIgnoreCase("TLS")) {
                return new TLSMessageProcessor(inetAddress, sIPTransactionStack, i10);
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
            }
            throw new IllegalArgumentException("bad transport");
        }
    }
}
