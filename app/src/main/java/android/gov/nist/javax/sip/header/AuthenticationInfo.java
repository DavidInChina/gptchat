package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import c.AbstractC2252g;
import java.text.ParseException;

/* loaded from: classes2.dex */
public final class AuthenticationInfo extends ParametersHeader implements AbstractC2252g {
    private static final long serialVersionUID = -4371927900917127057L;
    private String scheme;

    public AuthenticationInfo() {
        super(SIPHeaderNames.AUTHENTICATION_INFO);
        this.parameters.setSeparator(Separators.COMMA);
    }

    public void add(NameValue nameValue) {
        this.parameters.set(nameValue);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.scheme;
        if (str != null) {
            sb2.append(str);
            sb2.append(' ');
        }
        return this.parameters.encode(sb2);
    }

    public NameValue getAuthInfo(String str) {
        return this.parameters.getNameValue(str);
    }

    public String getAuthenticationInfo() {
        return encodeBody(new StringBuilder()).toString();
    }

    public String getCNonce() {
        return getParameter("cnonce");
    }

    public String getNextNonce() {
        return getParameter(ParameterNames.NEXT_NONCE);
    }

    public int getNonceCount() {
        return getParameterAsInt("nc");
    }

    public String getQop() {
        return getParameter("qop");
    }

    public String getResponse() {
        return getParameter(ParameterNames.RESPONSE_AUTH);
    }

    public String getSNum() {
        return getParameter(ParameterNames.SNUM);
    }

    public String getSRand() {
        return getParameter(ParameterNames.SRAND);
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getTargetName() {
        return getParameter(ParameterNames.TARGET_NAME);
    }

    public void setCNonce(String str) {
        setParameter("cnonce", str);
    }

    public void setNextNonce(String str) {
        setParameter(ParameterNames.NEXT_NONCE, str);
    }

    public void setNonceCount(int i10) {
        if (i10 >= 0) {
            String hexString = Integer.toHexString(i10);
            setParameter("nc", "00000000".substring(0, 8 - hexString.length()) + hexString);
            return;
        }
        throw new ParseException("bad value", 0);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, c.AbstractC2236H
    public void setParameter(String str, String str2) {
        if (str != null) {
            NameValue nameValue = this.parameters.getNameValue(str.toLowerCase());
            if (nameValue == null) {
                NameValue nameValue2 = new NameValue(str, str2);
                if (str.equalsIgnoreCase("qop") || str.equalsIgnoreCase(ParameterNames.NEXT_NONCE) || str.equalsIgnoreCase("realm") || str.equalsIgnoreCase("cnonce") || str.equalsIgnoreCase("nonce") || str.equalsIgnoreCase("opaque") || str.equalsIgnoreCase("username") || str.equalsIgnoreCase("domain") || str.equalsIgnoreCase(ParameterNames.NEXT_NONCE) || str.equalsIgnoreCase(ParameterNames.RESPONSE_AUTH) || str.equalsIgnoreCase(ParameterNames.SRAND) || str.equalsIgnoreCase(ParameterNames.SNUM) || str.equalsIgnoreCase(ParameterNames.TARGET_NAME)) {
                    if (str2 != null) {
                        if (!str2.startsWith(Separators.DOUBLE_QUOTE)) {
                            nameValue2.setQuotedValue();
                        } else {
                            throw new ParseException(str2.concat(" : Unexpected DOUBLE_QUOTE"), 0);
                        }
                    } else {
                        throw new NullPointerException("null value");
                    }
                }
                super.setParameter(nameValue2);
                return;
            }
            nameValue.setValueAsObject(str2);
            return;
        }
        throw new NullPointerException("null name");
    }

    public void setQop(String str) {
        setParameter("qop", str);
    }

    public void setResponse(String str) {
        setParameter(ParameterNames.RESPONSE_AUTH, str);
    }

    public void setSNum(String str) {
        setParameter(ParameterNames.SNUM, str);
    }

    public void setSRand(String str) {
        setParameter(ParameterNames.SRAND, str);
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setTargetName(String str) {
        setParameter(ParameterNames.TARGET_NAME, str);
    }
}
