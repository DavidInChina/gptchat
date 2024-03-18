package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.javax.sip.g;
import c.i0;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Warning extends SIPHeader implements i0 {
    private static final long serialVersionUID = -3433328864230783899L;
    protected String agent;
    protected int code;
    protected String text;

    public Warning() {
        super(SIPHeaderNames.WARNING);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str;
        if (this.text != null) {
            sb2.append(Integer.toString(this.code));
            sb2.append(Separators.SP);
            sb2.append(this.agent);
            sb2.append(Separators.SP);
            str = Separators.DOUBLE_QUOTE;
            sb2.append(str);
            sb2.append(this.text);
        } else {
            sb2.append(Integer.toString(this.code));
            sb2.append(Separators.SP);
            str = this.agent;
        }
        sb2.append(str);
        return sb2;
    }

    public String getAgent() {
        return this.agent;
    }

    public int getCode() {
        return this.code;
    }

    public String getText() {
        return this.text;
    }

    public void setAgent(String str) {
        if (str != null) {
            this.agent = str;
            return;
        }
        throw new NullPointerException("the host parameter in the Warning header is null");
    }

    public void setCode(int i10) {
        if (i10 > 99 && i10 < 1000) {
            this.code = i10;
            return;
        }
        throw new g(a.e("Code parameter in the Warning header is invalid: code=", i10));
    }

    public void setText(String str) {
        if (str != null) {
            this.text = str;
            return;
        }
        throw new ParseException("The text parameter in the Warning header is null", 0);
    }
}
