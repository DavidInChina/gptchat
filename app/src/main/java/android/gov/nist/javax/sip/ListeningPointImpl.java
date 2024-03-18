package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel;
import android.gov.nist.javax.sip.stack.MessageChannel;
import android.gov.nist.javax.sip.stack.MessageProcessor;
import android.javax.sip.h;
import android.javax.sip.r;
import c.AbstractC2257l;
import c.g0;

/* loaded from: classes.dex */
public class ListeningPointImpl implements h, ListeningPointExt {
    private static StackLogger logger = CommonLogger.getLogger(ListeningPointImpl.class);
    protected MessageProcessor messageProcessor;
    int port;
    protected SipProviderImpl sipProvider;
    protected SipStackImpl sipStack;
    protected String transport;

    public ListeningPointImpl(r rVar, int i10, String str) {
        this.sipStack = (SipStackImpl) rVar;
        this.port = i10;
        this.transport = str;
    }

    public static String makeKey(String str, int i10, String str2) {
        return (str + ":" + i10 + Separators.SLASH + str2).toLowerCase();
    }

    public Object clone() {
        ListeningPointImpl listeningPointImpl = new ListeningPointImpl(this.sipStack, this.port, null);
        listeningPointImpl.sipStack = this.sipStack;
        return listeningPointImpl;
    }

    @Override // android.gov.nist.javax.sip.ListeningPointExt
    public AbstractC2257l createContactHeader() {
        try {
            String iPAddress = getIPAddress();
            int port = getPort();
            SipUri sipUri = new SipUri();
            sipUri.setHost(iPAddress);
            sipUri.setPort(port);
            sipUri.setTransportParam(this.transport);
            Contact contact = new Contact();
            AddressImpl addressImpl = new AddressImpl();
            addressImpl.setURI(sipUri);
            contact.setAddress(addressImpl);
            return contact;
        } catch (Exception unused) {
            InternalErrorHandler.handleException("Unexpected exception", logger);
            return null;
        }
    }

    @Override // android.gov.nist.javax.sip.ListeningPointExt
    public g0 createViaHeader() {
        return getViaHeader();
    }

    @Override // android.javax.sip.h
    public String getIPAddress() {
        return this.messageProcessor.getIpAddress().getHostAddress();
    }

    public String getKey() {
        return makeKey(getIPAddress(), this.port, this.transport);
    }

    public MessageProcessor getMessageProcessor() {
        return this.messageProcessor;
    }

    @Override // android.javax.sip.h
    public int getPort() {
        return this.messageProcessor.getPort();
    }

    public SipProviderImpl getProvider() {
        return this.sipProvider;
    }

    @Override // android.gov.nist.javax.sip.ListeningPointExt
    public String getSentBy() {
        return this.messageProcessor.getSentBy();
    }

    @Override // android.javax.sip.h
    public String getTransport() {
        return this.messageProcessor.getTransport();
    }

    public Via getViaHeader() {
        return this.messageProcessor.getViaHeader();
    }

    public boolean isSentBySet() {
        return this.messageProcessor.isSentBySet();
    }

    public void removeSipProvider() {
        this.sipProvider = null;
    }

    @Override // android.gov.nist.javax.sip.ListeningPointExt
    public void sendHeartbeat(String str, int i10) {
        if (!this.sipStack.isAlive()) {
            return;
        }
        HostPort hostPort = new HostPort();
        hostPort.setHost(new Host(str));
        hostPort.setPort(i10);
        MessageChannel createMessageChannel = this.messageProcessor.createMessageChannel(hostPort);
        SIPRequest sIPRequest = new SIPRequest();
        sIPRequest.setNullRequest();
        if (createMessageChannel instanceof ConnectionOrientedMessageChannel) {
            ConnectionOrientedMessageChannel connectionOrientedMessageChannel = (ConnectionOrientedMessageChannel) createMessageChannel;
            long keepAliveTimeout = connectionOrientedMessageChannel.getKeepAliveTimeout();
            if (keepAliveTimeout > 0) {
                connectionOrientedMessageChannel.rescheduleKeepAliveTimeout(keepAliveTimeout);
            }
        }
        createMessageChannel.sendMessage(sIPRequest);
    }

    @Override // android.gov.nist.javax.sip.ListeningPointExt
    public void setSentBy(String str) {
        this.messageProcessor.setSentBy(str);
    }

    public void setSipProvider(SipProviderImpl sipProviderImpl) {
        this.sipProvider = sipProviderImpl;
    }
}
