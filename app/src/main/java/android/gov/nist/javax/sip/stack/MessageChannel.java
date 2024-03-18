package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.ThreadAffinityTask;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.MessageFactoryImpl;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import b.AbstractC2092b;
import c.AbstractC2257l;
import c.Y;
import java.io.IOException;
import java.net.InetAddress;
import java.text.ParseException;

/* loaded from: classes2.dex */
public abstract class MessageChannel {
    private static StackLogger logger = CommonLogger.getLogger(MessageChannel.class);
    static ThreadLocal<String> messageTxId = new ThreadLocal<>();
    private SIPClientTransaction encapsulatedClientTransaction;
    protected transient MessageProcessor messageProcessor;
    protected int useCount;

    private static final boolean copyHeader(String str, String str2, StringBuilder sb2) {
        int indexOf;
        int indexOf2 = str2.indexOf(str);
        if (indexOf2 != -1 && (indexOf = str2.indexOf(Separators.NEWLINE, indexOf2)) != -1) {
            sb2.append(str2.subSequence(indexOf2 - 2, indexOf));
            return true;
        }
        return false;
    }

    private static final boolean copyViaHeaders(String str, StringBuilder sb2) {
        int indexOf = str.indexOf(SIPHeaderNames.VIA);
        boolean z10 = false;
        while (indexOf != -1) {
            int indexOf2 = str.indexOf(Separators.NEWLINE, indexOf);
            if (indexOf2 == -1) {
                return false;
            }
            sb2.append(str.subSequence(indexOf - 2, indexOf2));
            indexOf = str.indexOf(SIPHeaderNames.VIA, indexOf2);
            z10 = true;
        }
        return z10;
    }

    public static String getKey(InetAddress inetAddress, int i10, String str) {
        StringBuilder r10 = a.r(str, ":");
        r10.append(inetAddress.getHostAddress().replaceAll("[\\[\\]]", ""));
        r10.append(":");
        r10.append(i10);
        return r10.toString().toLowerCase();
    }

    public abstract void close();

    public final String createBadReqRes(String str, ParseException parseException) {
        StringBuilder sb2 = new StringBuilder(512);
        sb2.append("SIP/2.0 400 Bad Request (" + parseException.getLocalizedMessage() + ')');
        if (!copyViaHeaders(str, sb2) || !copyHeader(SIPHeaderNames.CSEQ, str, sb2) || !copyHeader(SIPHeaderNames.CALL_ID, str, sb2) || !copyHeader(SIPHeaderNames.FROM, str, sb2) || !copyHeader(SIPHeaderNames.TO, str, sb2)) {
            return null;
        }
        int indexOf = sb2.indexOf(SIPHeaderNames.TO);
        if (indexOf != -1 && sb2.indexOf(ParameterNames.TAG, indexOf) == -1) {
            sb2.append(";tag=badreq");
        }
        Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
        if (defaultServerHeader != null) {
            sb2.append(Separators.NEWLINE + defaultServerHeader.toString());
        }
        int length = str.length();
        if ((this instanceof UDPMessageChannel) && sb2.length() + length + 45 >= 1300) {
            ContentLength contentLength = new ContentLength(0);
            sb2.append(Separators.NEWLINE + contentLength.toString());
        } else {
            ContentType contentType = new ContentType("message", "sipfrag");
            sb2.append(Separators.NEWLINE + contentType.toString());
            ContentLength contentLength2 = new ContentLength(length);
            sb2.append(Separators.NEWLINE + contentLength2.toString());
            sb2.append("\r\n\r\n".concat(str));
        }
        return sb2.toString();
    }

    public SIPClientTransaction getEncapsulatedClientTransaction() {
        return this.encapsulatedClientTransaction;
    }

    public String getHost() {
        return getMessageProcessor().getIpAddress().getHostAddress();
    }

    public HostPort getHostPort() {
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(getHost()));
        hostPort.setPort(getPort());
        return hostPort;
    }

    public abstract String getKey();

    public MessageProcessor getMessageProcessor() {
        return this.messageProcessor;
    }

    public abstract String getPeerAddress();

    public HostPort getPeerHostPort() {
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(getPeerAddress()));
        hostPort.setPort(getPeerPort());
        return hostPort;
    }

    public abstract InetAddress getPeerInetAddress();

    public abstract InetAddress getPeerPacketSourceAddress();

    public abstract int getPeerPacketSourcePort();

    public abstract int getPeerPort();

    public abstract String getPeerProtocol();

    public int getPort() {
        MessageProcessor messageProcessor = this.messageProcessor;
        if (messageProcessor != null) {
            return messageProcessor.getPort();
        }
        return -1;
    }

    public String getRawIpSourceAddress() {
        try {
            return InetAddress.getByName(getPeerAddress()).getHostAddress();
        } catch (Exception e10) {
            InternalErrorHandler.handleException(e10);
            return null;
        }
    }

    public abstract SIPTransactionStack getSIPStack();

    public abstract String getTransport();

    public Via getViaHeader() {
        Via via = new Via();
        try {
            via.setTransport(getTransport());
        } catch (ParseException unused) {
        }
        via.setSentBy(getHostPort());
        return via;
    }

    public abstract String getViaHost();

    public HostPort getViaHostPort() {
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(getViaHost()));
        hostPort.setPort(getViaPort());
        return hostPort;
    }

    public abstract int getViaPort();

    public abstract boolean isReliable();

    public abstract boolean isSecure();

    public void logMessage(SIPMessage sIPMessage, InetAddress inetAddress, int i10, long j6) {
        if (!logger.isLoggingEnabled(16)) {
            return;
        }
        if (i10 == -1) {
            i10 = SIPConstants.DEFAULT_PORT;
        }
        getSIPStack().serverLogger.logMessage(sIPMessage, getHost() + ":" + getPort(), inetAddress.getHostAddress().toString() + ":" + i10, true, j6);
    }

    public void logResponse(SIPResponse sIPResponse, long j6, String str) {
        int peerPort = getPeerPort();
        if (peerPort == 0 && sIPResponse.getContactHeaders() != null) {
            peerPort = ((AddressImpl) ((AbstractC2257l) sIPResponse.getContactHeaders().getFirst()).getAddress()).getPort();
        }
        getSIPStack().serverLogger.logMessage(sIPResponse, getPeerAddress().toString() + ":" + peerPort, getHost() + ":" + getPort(), str, false, j6);
    }

    public abstract void sendMessage(SIPMessage sIPMessage);

    public void sendMessage(final SIPMessage sIPMessage, AbstractC2092b abstractC2092b) {
        MessageProcessor[] messageProcessors;
        long currentTimeMillis = System.currentTimeMillis();
        InetAddress byName = InetAddress.getByName(abstractC2092b.getHost());
        try {
            try {
                for (MessageProcessor messageProcessor : getSIPStack().getMessageProcessors()) {
                    if (messageProcessor.getIpAddress().equals(byName) && messageProcessor.getPort() == abstractC2092b.getPort() && messageProcessor.getTransport().equalsIgnoreCase(abstractC2092b.getTransport())) {
                        MessageChannel createMessageChannel = messageProcessor.createMessageChannel(byName, abstractC2092b.getPort());
                        if (createMessageChannel instanceof RawMessageChannel) {
                            final RawMessageChannel rawMessageChannel = (RawMessageChannel) createMessageChannel;
                            getSIPStack().getSelfRoutingThreadpoolExecutor().execute(new ThreadAffinityTask() { // from class: android.gov.nist.javax.sip.stack.MessageChannel.1
                                @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                                public Object getThreadHash() {
                                    return sIPMessage.getCallId().getCallId();
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        rawMessageChannel.processMessage((SIPMessage) sIPMessage.clone());
                                    } catch (Exception e10) {
                                        if (MessageChannel.logger.isLoggingEnabled(4)) {
                                            MessageChannel.logger.logError("Error self routing message cause by: ", e10);
                                        }
                                    }
                                }
                            });
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Self routing message");
                            }
                            messageTxId.remove();
                            if (!logger.isLoggingEnabled(16)) {
                                return;
                            }
                            logMessage(sIPMessage, byName, abstractC2092b.getPort(), currentTimeMillis);
                            return;
                        }
                    }
                }
                messageTxId.set(sIPMessage.getTransactionId());
                sendMessage(sIPMessage.encodeAsBytes(getTransport()), byName, abstractC2092b.getPort(), sIPMessage instanceof SIPRequest);
                sIPMessage.setRemoteAddress(byName);
                sIPMessage.setRemotePort(abstractC2092b.getPort());
                sIPMessage.setLocalPort(getPort());
                sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
                messageTxId.remove();
                if (!logger.isLoggingEnabled(16)) {
                    return;
                }
                logMessage(sIPMessage, byName, abstractC2092b.getPort(), currentTimeMillis);
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                if (logger.isLoggingEnabled(4)) {
                    logger.logError("Error self routing message cause by: ", e11);
                }
                throw new IOException("Error self routing message");
            }
        } catch (Throwable th2) {
            messageTxId.remove();
            if (logger.isLoggingEnabled(16)) {
                logMessage(sIPMessage, byName, abstractC2092b.getPort(), currentTimeMillis);
            }
            throw th2;
        }
    }

    public abstract void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z10);

    public void setEncapsulatedClientTransaction(SIPClientTransaction sIPClientTransaction) {
        this.encapsulatedClientTransaction = sIPClientTransaction;
    }

    public void uncache() {
    }

    public static String getKey(HostPort hostPort, String str) {
        String ipAddress = hostPort.getHost().getIpAddress();
        if (ipAddress == null) {
            ipAddress = hostPort.getHost().getHostname();
        }
        StringBuilder r10 = a.r(str, ":");
        r10.append(ipAddress.replaceAll("[\\[\\]]", ""));
        r10.append(":");
        r10.append(hostPort.getPort());
        return r10.toString().toLowerCase();
    }

    public void sendMessage(SIPMessage sIPMessage, InetAddress inetAddress, int i10) {
        long currentTimeMillis = System.currentTimeMillis();
        byte[] encodeAsBytes = sIPMessage.encodeAsBytes(getTransport());
        messageTxId.set(sIPMessage.getTransactionId());
        try {
            sendMessage(encodeAsBytes, inetAddress, i10, sIPMessage instanceof SIPRequest);
            messageTxId.remove();
            sIPMessage.setRemoteAddress(inetAddress);
            sIPMessage.setRemotePort(i10);
            sIPMessage.setLocalPort(getPort());
            sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
            logMessage(sIPMessage, inetAddress, i10, currentTimeMillis);
        } catch (Throwable th2) {
            messageTxId.remove();
            throw th2;
        }
    }
}
