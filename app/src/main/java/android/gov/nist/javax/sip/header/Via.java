package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.stack.HopImpl;
import android.javax.sip.g;
import b.AbstractC2092b;
import c.g0;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class Via extends ParametersHeader implements g0, ViaHeaderExt {
    public static final String BRANCH = "branch";
    public static final String MADDR = "maddr";
    public static final String RECEIVED = "received";
    public static final String RPORT = "rport";
    public static final String TTL = "ttl";
    private static final long serialVersionUID = 5281728373401351378L;
    protected String comment;
    protected HostPort sentBy;
    protected Protocol sentProtocol = new Protocol();

    public Via() {
        super(SIPHeaderNames.VIA);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        Via via = (Via) super.clone();
        Protocol protocol = this.sentProtocol;
        if (protocol != null) {
            via.sentProtocol = (Protocol) protocol.clone();
        }
        HostPort hostPort = this.sentBy;
        if (hostPort != null) {
            via.sentBy = (HostPort) hostPort.clone();
        }
        if (getRPort() != -1) {
            via.setParameter("rport", getRPort());
        }
        return via;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (getProtocol().equalsIgnoreCase(g0Var.getProtocol()) && getTransport().equalsIgnoreCase(g0Var.getTransport()) && getHost().equalsIgnoreCase(g0Var.getHost()) && getPort() == g0Var.getPort() && equalParameters(g0Var)) {
            return true;
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getBranch() {
        return getParameter("branch");
    }

    public String getComment() {
        return this.comment;
    }

    public AbstractC2092b getHop() {
        return new HopImpl(this.sentBy.getHost().getHostname(), this.sentBy.getPort(), this.sentProtocol.getTransport());
    }

    @Override // c.g0, android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getHost() {
        Host host;
        HostPort hostPort = this.sentBy;
        if (hostPort == null || (host = hostPort.getHost()) == null) {
            return null;
        }
        return host.getHostname();
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getMAddr() {
        return getParameter("maddr");
    }

    @Override // c.g0, android.gov.nist.javax.sip.header.ViaHeaderExt
    public int getPort() {
        HostPort hostPort = this.sentBy;
        if (hostPort == null) {
            return -1;
        }
        return hostPort.getPort();
    }

    @Override // c.g0, android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getProtocol() {
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            return null;
        }
        return protocol.getProtocol();
    }

    public String getProtocolVersion() {
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            return null;
        }
        return protocol.getProtocolVersion();
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public int getRPort() {
        String parameter = getParameter("rport");
        if (parameter != null && !parameter.equals("")) {
            return Integer.valueOf(parameter).intValue();
        }
        return -1;
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getReceived() {
        return getParameter("received");
    }

    public HostPort getSentBy() {
        return this.sentBy;
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getSentByField() {
        HostPort hostPort = this.sentBy;
        if (hostPort != null) {
            return hostPort.encode();
        }
        return null;
    }

    public Protocol getSentProtocol() {
        return this.sentProtocol;
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getSentProtocolField() {
        Protocol protocol = this.sentProtocol;
        if (protocol != null) {
            return protocol.encode();
        }
        return null;
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public int getTTL() {
        return getParameterAsInt("ttl");
    }

    @Override // c.g0, android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getTransport() {
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            return null;
        }
        return protocol.getTransport();
    }

    public NameValueList getViaParms() {
        return this.parameters;
    }

    public boolean hasComment() {
        if (this.comment != null) {
            return true;
        }
        return false;
    }

    public boolean hasPort() {
        return getSentBy().hasPort();
    }

    public void removeComment() {
        this.comment = null;
    }

    public void removePort() {
        this.sentBy.removePort();
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public void setBranch(String str) {
        if (str != null && str.length() != 0) {
            setParameter("branch", str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, Via, setBranch(), the branch parameter is null or length 0.");
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setHost(Host host) {
        if (this.sentBy == null) {
            this.sentBy = new HostPort();
        }
        this.sentBy.setHost(host);
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public void setMAddr(String str) {
        if (str != null) {
            Host host = new Host();
            host.setAddress(str);
            setParameter(new NameValue("maddr", host));
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, Via, setMAddr(), the mAddr parameter is null.");
    }

    @Override // c.g0, android.gov.nist.javax.sip.header.ViaHeaderExt
    public void setPort(int i10) {
        if (i10 != -1 && (i10 < 1 || i10 > 65535)) {
            throw new g("Port value out of range -1, [1..65535]");
        }
        if (this.sentBy == null) {
            this.sentBy = new HostPort();
        }
        this.sentBy.setPort(i10);
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public void setProtocol(String str) {
        if (str != null) {
            if (this.sentProtocol == null) {
                this.sentProtocol = new Protocol();
            }
            this.sentProtocol.setProtocol(str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, Via, setProtocol(), the protocol parameter is null.");
    }

    public void setProtocolVersion(String str) {
        if (this.sentProtocol == null) {
            this.sentProtocol = new Protocol();
        }
        this.sentProtocol.setProtocolVersion(str);
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public void setRPort() {
        try {
            setParameter("rport", (String) null);
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public void setReceived(String str) {
        if (str != null) {
            setParameter("received", str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, Via, setReceived(), the received parameter is null.");
    }

    public void setSentBy(HostPort hostPort) {
        this.sentBy = hostPort;
    }

    public void setSentProtocol(Protocol protocol) {
        this.sentProtocol = protocol;
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public void setTTL(int i10) {
        if (i10 < 0 && i10 != -1) {
            throw new g("JAIN-SIP Exception, Via, setTTL(), the ttl parameter is < 0");
        }
        setParameter(new NameValue("ttl", Integer.valueOf(i10)));
    }

    @Override // c.g0, android.gov.nist.javax.sip.header.ViaHeaderExt
    public void setTransport(String str) {
        if (str != null) {
            if (this.sentProtocol == null) {
                this.sentProtocol = new Protocol();
            }
            this.sentProtocol.setTransport(str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception, Via, setTransport(), the transport parameter is null.");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        this.sentProtocol.encode(sb2);
        sb2.append(Separators.SP);
        this.sentBy.encode(sb2);
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        if (this.comment != null) {
            sb2.append(Separators.SP);
            sb2.append(Separators.LPAREN);
            sb2.append(this.comment);
            sb2.append(Separators.RPAREN);
        }
        return sb2;
    }

    @Override // c.g0, android.gov.nist.javax.sip.header.ViaHeaderExt
    public void setHost(String str) {
        if (this.sentBy == null) {
            this.sentBy = new HostPort();
        }
        try {
            this.sentBy.setHost(new Host(str));
        } catch (Exception unused) {
            throw new NullPointerException(" host parameter is null");
        }
    }
}
