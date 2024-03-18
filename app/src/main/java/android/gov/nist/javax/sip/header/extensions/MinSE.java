package android.gov.nist.javax.sip.header.extensions;

import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.g;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes.dex */
public class MinSE extends ParametersHeader implements AbstractC2266v, MinSEHeader {
    public static final String NAME = "Min-SE";
    private static final long serialVersionUID = 3134344915465784267L;
    public int expires;

    public MinSE() {
        super("Min-SE");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Integer.toString(this.expires));
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    public int getExpires() {
        return this.expires;
    }

    public void setExpires(int i10) {
        if (i10 >= 0) {
            this.expires = i10;
            return;
        }
        throw new g(a.e("bad argument ", i10));
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }
}
