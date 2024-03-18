package android.gov.nist.core;

import java.net.InetAddress;

/* loaded from: classes.dex */
public final class HostPort extends GenericObject {
    private static final long serialVersionUID = -7103412227431884523L;
    protected Host host = null;
    protected int port = -1;

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        HostPort hostPort = (HostPort) super.clone();
        Host host = this.host;
        if (host != null) {
            hostPort.host = (Host) host.clone();
        }
        return hostPort;
    }

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == null || HostPort.class != obj.getClass()) {
            return false;
        }
        HostPort hostPort = (HostPort) obj;
        if (this.port != hostPort.port || !this.host.equals(hostPort.host)) {
            return false;
        }
        return true;
    }

    public Host getHost() {
        return this.host;
    }

    public InetAddress getInetAddress() {
        Host host = this.host;
        if (host == null) {
            return null;
        }
        return host.getInetAddress();
    }

    public int getPort() {
        return this.port;
    }

    public boolean hasPort() {
        if (this.port != -1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.host.hashCode() + this.port;
    }

    @Override // android.gov.nist.core.GenericObject
    public void merge(Object obj) {
        super.merge(obj);
        if (this.port == -1) {
            this.port = ((HostPort) obj).port;
        }
    }

    public void removePort() {
        this.port = -1;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public void setPort(int i10) {
        this.port = i10;
    }

    public String toString() {
        return encode();
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        this.host.encode(sb2);
        if (this.port != -1) {
            sb2.append(":");
            sb2.append(this.port);
        }
        return sb2;
    }
}
