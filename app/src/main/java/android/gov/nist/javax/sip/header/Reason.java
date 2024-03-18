package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.Utils;
import c.AbstractC2243O;

/* loaded from: classes.dex */
public class Reason extends ParametersHeader implements AbstractC2243O {
    private static final long serialVersionUID = -8903376965568297388L;
    protected String protocol;
    public final String TEXT = ParameterNames.TEXT;
    public final String CAUSE = ParameterNames.CAUSE;

    public Reason() {
        super(SIPHeaderNames.REASON);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.protocol);
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null && !nameValueList.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            return this.parameters.encode(sb2);
        }
        return sb2;
    }

    public int getCause() {
        return getParameterAsInt(ParameterNames.CAUSE);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.HeaderExt
    public String getName() {
        return SIPHeaderNames.REASON;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getText() {
        return this.parameters.getParameter(ParameterNames.TEXT);
    }

    @Override // c.AbstractC2243O
    public void setCause(int i10) {
        this.parameters.set(ParameterNames.CAUSE, Integer.valueOf(i10));
    }

    @Override // c.AbstractC2243O
    public void setProtocol(String str) {
        this.protocol = str;
    }

    @Override // c.AbstractC2243O
    public void setText(String str) {
        if (str != null && str.trim().length() > 0) {
            if (str.charAt(0) != '\"') {
                str = Utils.getQuotedString(str);
            }
            this.parameters.set(ParameterNames.TEXT, str);
        }
    }
}
