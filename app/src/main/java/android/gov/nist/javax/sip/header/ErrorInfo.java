package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.GenericURI;
import b.AbstractC2096f;
import c.AbstractC2263s;

/* loaded from: classes2.dex */
public final class ErrorInfo extends ParametersHeader implements AbstractC2263s {
    private static final long serialVersionUID = -6347702901964436362L;
    protected GenericURI errorInfo;

    public ErrorInfo() {
        super(SIPHeaderNames.ERROR_INFO);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        ErrorInfo errorInfo = (ErrorInfo) super.clone();
        GenericURI genericURI = this.errorInfo;
        if (genericURI != null) {
            errorInfo.errorInfo = (GenericURI) genericURI.clone();
        }
        return errorInfo;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Separators.LESS_THAN);
        this.errorInfo.encode(sb2);
        sb2.append(Separators.GREATER_THAN);
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    public AbstractC2096f getErrorInfo() {
        return this.errorInfo;
    }

    public String getErrorMessage() {
        return getParameter("message");
    }

    public void setErrorInfo(AbstractC2096f abstractC2096f) {
        this.errorInfo = (GenericURI) abstractC2096f;
    }

    public void setErrorMessage(String str) {
        if (str != null) {
            setParameter("message", str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception , ErrorInfoHeader, setErrorMessage(), the message parameter is null");
    }

    public ErrorInfo(GenericURI genericURI) {
        this();
        this.errorInfo = genericURI;
    }
}
