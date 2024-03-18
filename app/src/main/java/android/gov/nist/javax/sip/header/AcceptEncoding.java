package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.javax.sip.g;
import c.AbstractC2246a;

/* loaded from: classes.dex */
public final class AcceptEncoding extends ParametersHeader implements AbstractC2246a {
    private static final long serialVersionUID = -1476807565552873525L;
    protected String contentCoding;

    public AcceptEncoding() {
        super(SIPHeaderNames.ACCEPT_ENCODING);
    }

    public String encodeBody() {
        return encode(new StringBuilder()).toString();
    }

    public String getEncoding() {
        return this.contentCoding;
    }

    public float getQValue() {
        return getParameterAsFloat("q");
    }

    public void setEncoding(String str) {
        if (str != null) {
            this.contentCoding = str;
            return;
        }
        throw new NullPointerException(" encoding parameter is null");
    }

    public void setQValue(float f6) {
        double d10 = f6;
        if (d10 >= 0.0d && d10 <= 1.0d) {
            super.setParameter("q", f6);
            return;
        }
        throw new g("qvalue out of range!");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.contentCoding;
        if (str != null) {
            sb2.append(str);
        }
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null && !nameValueList.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            sb2.append(this.parameters.encode());
        }
        return sb2;
    }
}
