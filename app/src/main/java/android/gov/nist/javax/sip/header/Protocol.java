package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.Utils;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class Protocol extends SIPObject {
    private static final long serialVersionUID = 2216758055974073280L;
    protected String protocolName = "SIP";
    protected String protocolVersion = "2.0";
    protected String transport = "UDP";

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    public String getProtocol() {
        return this.protocolName + '/' + this.protocolVersion;
    }

    public String getProtocolName() {
        return this.protocolName;
    }

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    public String getTransport() {
        return this.transport;
    }

    public void setProtocol(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf > 0) {
            this.protocolName = str.substring(0, indexOf);
            this.protocolVersion = str.substring(indexOf + 1);
            return;
        }
        throw new ParseException("Missing '/' in protocol", 0);
    }

    public void setProtocolName(String str) {
        this.protocolName = str;
    }

    public void setProtocolVersion(String str) {
        this.protocolVersion = str;
    }

    public void setTransport(String str) {
        this.transport = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        sb2.append(Utils.toUpperCase(this.protocolName));
        sb2.append(Separators.SLASH);
        sb2.append(this.protocolVersion);
        sb2.append(Separators.SLASH);
        sb2.append(this.transport.toUpperCase());
        return sb2;
    }
}
