package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ListeningPointImpl;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.header.Via;
import android.javax.sip.g;
import java.net.InetAddress;
import java.text.ParseException;

/* loaded from: classes2.dex */
public abstract class MessageProcessor {
    protected static final String IN6_ADDR_ANY = "::0";
    protected static final String IN_ADDR_ANY = "0.0.0.0";
    private static StackLogger logger = CommonLogger.getLogger(MessageProcessor.class);
    private InetAddress ipAddress;
    private ListeningPointImpl listeningPoint;
    private int port;
    private String savedIpAddress;
    private String sentBy;
    private HostPort sentByHostPort;
    private boolean sentBySet;
    protected SIPTransactionStack sipStack;
    protected String transport;

    public MessageProcessor(String str) {
        this.transport = str;
    }

    public static int getDefaultPort(String str) {
        if (str.equalsIgnoreCase("TLS")) {
            return SIPConstants.DEFAULT_TLS_PORT;
        }
        return SIPConstants.DEFAULT_PORT;
    }

    public abstract MessageChannel createMessageChannel(HostPort hostPort);

    public abstract MessageChannel createMessageChannel(InetAddress inetAddress, int i10);

    public abstract int getDefaultTargetPort();

    public InetAddress getIpAddress() {
        return this.ipAddress;
    }

    public ListeningPointImpl getListeningPoint() {
        if (this.listeningPoint == null && logger.isLoggingEnabled()) {
            StackLogger stackLogger = logger;
            stackLogger.logError("getListeningPoint" + this + " returning null listeningpoint");
        }
        return this.listeningPoint;
    }

    public abstract int getMaximumMessageSize();

    public int getPort() {
        return this.port;
    }

    public abstract SIPTransactionStack getSIPStack();

    public String getSavedIpAddress() {
        return this.savedIpAddress;
    }

    public String getSentBy() {
        HostPort hostPort;
        if (this.sentBy == null && (hostPort = this.sentByHostPort) != null) {
            this.sentBy = hostPort.toString();
        }
        return this.sentBy;
    }

    public String getTransport() {
        return this.transport;
    }

    public Via getViaHeader() {
        try {
            Via via = new Via();
            HostPort hostPort = this.sentByHostPort;
            if (hostPort != null) {
                via.setSentBy(hostPort);
                via.setTransport(getTransport());
            } else {
                Host host = new Host();
                host.setHostname(getIpAddress().getHostAddress());
                via.setHost(host);
                via.setPort(getPort());
                via.setTransport(getTransport());
            }
            return via;
        } catch (g e10) {
            e10.printStackTrace();
            return null;
        } catch (ParseException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public abstract boolean inUse();

    public final void initialize(InetAddress inetAddress, int i10, SIPTransactionStack sIPTransactionStack) {
        this.sipStack = sIPTransactionStack;
        this.savedIpAddress = inetAddress.getHostAddress();
        this.ipAddress = inetAddress;
        this.port = i10;
        HostPort hostPort = new HostPort();
        this.sentByHostPort = hostPort;
        hostPort.setHost(new Host(inetAddress.getHostAddress()));
        this.sentByHostPort.setPort(i10);
    }

    public abstract boolean isSecure();

    public boolean isSentBySet() {
        return this.sentBySet;
    }

    public void setIpAddress(InetAddress inetAddress) {
        this.sentByHostPort.setHost(new Host(inetAddress.getHostAddress()));
        this.ipAddress = inetAddress;
    }

    public void setListeningPoint(ListeningPointImpl listeningPointImpl) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("setListeningPoint" + this + " listeningPoint = " + listeningPointImpl);
        }
        if (listeningPointImpl.getPort() != getPort()) {
            InternalErrorHandler.handleException("lp mismatch with provider", logger);
        }
        this.listeningPoint = listeningPointImpl;
    }

    public void setSentBy(String str) {
        int indexOf = str.indexOf(":");
        if (indexOf == -1) {
            HostPort hostPort = new HostPort();
            this.sentByHostPort = hostPort;
            hostPort.setHost(new Host(str));
        } else {
            HostPort hostPort2 = new HostPort();
            this.sentByHostPort = hostPort2;
            hostPort2.setHost(new Host(str.substring(0, indexOf)));
            try {
                this.sentByHostPort.setPort(Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException unused) {
                throw new ParseException("Bad format encountered at ", indexOf);
            }
        }
        this.sentBySet = true;
        this.sentBy = str;
    }

    public abstract void start();

    public abstract void stop();

    public MessageProcessor(InetAddress inetAddress, int i10, String str, SIPTransactionStack sIPTransactionStack) {
        this(str);
        initialize(inetAddress, i10, sIPTransactionStack);
    }
}
