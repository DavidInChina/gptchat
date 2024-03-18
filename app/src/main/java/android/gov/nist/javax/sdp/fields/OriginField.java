package android.gov.nist.javax.sdp.fields;

import a.AbstractC1886f;
import android.gov.nist.core.Host;
import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public class OriginField extends SDPField implements AbstractC1886f {
    protected Host address;
    protected String addrtype;
    protected String nettype;
    private String sessIdString;
    private String sessVersionString;
    protected String username;

    public OriginField() {
        super(SDPFieldNames.ORIGIN_FIELD);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        OriginField originField = (OriginField) super.clone();
        Host host = this.address;
        if (host != null) {
            originField.address = (Host) host.clone();
        }
        return originField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str;
        Host host = this.address;
        if (host != null) {
            str = host.encode();
            if (Host.isIPv6Reference(str)) {
                str = str.substring(1, str.length() - 1);
            }
        } else {
            str = null;
        }
        return SDPFieldNames.ORIGIN_FIELD + this.username + Separators.SP + this.sessIdString + Separators.SP + this.sessVersionString + Separators.SP + this.nettype + Separators.SP + this.addrtype + Separators.SP + str + Separators.NEWLINE;
    }

    public String getAddress() {
        Host host = getHost();
        if (host == null) {
            return null;
        }
        return host.getAddress();
    }

    public String getAddressType() {
        return getAddrtype();
    }

    public String getAddrtype() {
        return this.addrtype;
    }

    public Host getHost() {
        return this.address;
    }

    public String getNettype() {
        return this.nettype;
    }

    public String getNetworkType() {
        return getNettype();
    }

    public long getSessId() {
        return Long.valueOf(this.sessIdString).longValue();
    }

    public String getSessIdAsString() {
        return this.sessIdString;
    }

    public long getSessVersion() {
        return Long.valueOf(this.sessVersionString).longValue();
    }

    public String getSessVersionAsString() {
        return this.sessVersionString;
    }

    public long getSessionId() {
        return getSessId();
    }

    public long getSessionVersion() {
        return getSessVersion();
    }

    public String getUsername() {
        return this.username;
    }

    public void setAddress(Host host) {
        this.address = host;
    }

    public void setAddressType(String str) {
        if (str != null) {
            setAddrtype(str);
            return;
        }
        throw new Exception("The type parameter is <0");
    }

    public void setAddrtype(String str) {
        this.addrtype = str;
    }

    public void setNettype(String str) {
        this.nettype = str;
    }

    public void setNetworkType(String str) {
        if (str != null) {
            setNettype(str);
            return;
        }
        throw new Exception("The type parameter is <0");
    }

    public void setSessId(long j6) {
        this.sessIdString = Long.toString(j6);
    }

    public void setSessVersion(long j6) {
        this.sessVersionString = Long.toString(j6);
    }

    public void setSessionId(String str) {
        this.sessIdString = str;
    }

    public void setSessionVersion(long j6) {
        if (j6 >= 0) {
            setSessVersion(j6);
            return;
        }
        throw new Exception("The version parameter is <0");
    }

    public void setUsername(String str) {
        if (str != null) {
            this.username = str;
            return;
        }
        throw new Exception("The user parameter is null");
    }

    public void setAddress(String str) {
        if (str != null) {
            Host host = getHost();
            if (host == null) {
                host = new Host();
            }
            host.setAddress(str);
            setAddress(host);
            return;
        }
        throw new Exception("The addr parameter is null");
    }

    public void setSessVersion(String str) {
        this.sessVersionString = str;
    }

    public void setSessionId(long j6) {
        if (j6 >= 0) {
            setSessId(j6);
            return;
        }
        throw new Exception("The is parameter is <0");
    }
}
