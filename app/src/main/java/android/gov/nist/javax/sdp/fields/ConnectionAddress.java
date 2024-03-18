package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Host;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;

/* loaded from: classes2.dex */
public class ConnectionAddress extends SDPObject {
    protected Host address;
    protected int port;
    protected int ttl;

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ConnectionAddress connectionAddress = (ConnectionAddress) super.clone();
        Host host = this.address;
        if (host != null) {
            connectionAddress.address = (Host) host.clone();
        }
        return connectionAddress;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str;
        Host host = this.address;
        if (host != null) {
            str = host.encode();
            if (Host.isIPv6Reference(str)) {
                str = str.substring(1, str.length() - 1);
            }
        } else {
            str = "";
        }
        int i10 = this.ttl;
        if (i10 != 0 && this.port != 0) {
            StringBuilder r10 = a.r(str, Separators.SLASH);
            r10.append(this.ttl);
            r10.append(Separators.SLASH);
            r10.append(this.port);
            return r10.toString();
        } else if (i10 != 0) {
            StringBuilder r11 = a.r(str, Separators.SLASH);
            r11.append(this.ttl);
            return r11.toString();
        } else {
            return str;
        }
    }

    public Host getAddress() {
        return this.address;
    }

    public int getPort() {
        return this.port;
    }

    public int getTtl() {
        return this.ttl;
    }

    public void setAddress(Host host) {
        this.address = host;
    }

    public void setPort(int i10) {
        this.port = i10;
    }

    public void setTtl(int i10) {
        this.ttl = i10;
    }
}
