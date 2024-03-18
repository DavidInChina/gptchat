package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import b.AbstractC2096f;
import java.text.ParseException;

/* loaded from: classes.dex */
public abstract class AuthenticationHeader extends ParametersHeader {
    public static final String ALGORITHM = "algorithm";
    public static final String CK = "ck";
    public static final String CNONCE = "cnonce";
    public static final String DOMAIN = "domain";
    public static final String IK = "ik";
    public static final String INTEGRITY_PROTECTED = "integrity-protected";
    public static final String NC = "nc";
    public static final String NONCE = "nonce";
    public static final String OPAQUE = "opaque";
    public static final String QOP = "qop";
    public static final String REALM = "realm";
    public static final String RESPONSE = "response";
    public static final String SIGNATURE = "signature";
    public static final String SIGNED_BY = "signed-by";
    public static final String STALE = "stale";
    public static final String URI = "uri";
    public static final String USERNAME = "username";
    protected String scheme;

    public AuthenticationHeader(String str) {
        super(str);
        this.parameters.setSeparator(Separators.COMMA);
        this.scheme = "Digest";
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        this.parameters.setSeparator(Separators.COMMA);
        sb2.append(this.scheme);
        sb2.append(Separators.SP);
        return this.parameters.encode(sb2);
    }

    public String getAlgorithm() {
        return getParameter("algorithm");
    }

    public String getCK() {
        return getParameter("ck");
    }

    public String getCNonce() {
        return getParameter("cnonce");
    }

    public String getDomain() {
        return getParameter("domain");
    }

    public String getIK() {
        return getParameter("ik");
    }

    public String getIntegrityProtected() {
        return getParameter("integrity-protected");
    }

    public String getNonce() {
        return getParameter("nonce");
    }

    public int getNonceCount() {
        return getParameterAsHexInt("nc");
    }

    public String getOpaque() {
        return getParameter("opaque");
    }

    public String getQop() {
        return getParameter("qop");
    }

    public String getRealm() {
        return getParameter("realm");
    }

    public String getResponse() {
        return (String) getParameterValue("response");
    }

    public String getScheme() {
        return this.scheme;
    }

    public AbstractC2096f getURI() {
        return getParameterAsURI("uri");
    }

    public String getUsername() {
        return getParameter("username");
    }

    public boolean isStale() {
        return getParameterAsBoolean("stale");
    }

    public void setAlgorithm(String str) {
        if (str != null) {
            setParameter("algorithm", str);
            return;
        }
        throw new NullPointerException("null arg");
    }

    public void setCK(String str) {
        if (str != null) {
            setParameter("ck", str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception,  AuthenticationHeader, setCk(), The auth-param CK parameter is null");
    }

    public void setCNonce(String str) {
        setParameter("cnonce", str);
    }

    public void setChallenge(Challenge challenge) {
        this.scheme = challenge.scheme;
        this.parameters = challenge.authParams;
    }

    public void setDomain(String str) {
        if (str != null) {
            setParameter("domain", str);
            return;
        }
        throw new NullPointerException("null arg");
    }

    public void setIK(String str) {
        if (str != null) {
            setParameter("ik", str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception,  AuthenticationHeader, setIk(), The auth-param IK parameter is null");
    }

    public void setIntegrityProtected(String str) {
        if (str != null) {
            setParameter("integrity-protected", str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception,  AuthenticationHeader, setIntegrityProtected(), The integrity-protected parameter is null");
    }

    public void setNonce(String str) {
        if (str != null) {
            setParameter("nonce", str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception,  AuthenticationHeader, setNonce(), The nonce parameter is null");
    }

    public void setNonceCount(int i10) {
        if (i10 >= 0) {
            String hexString = Integer.toHexString(i10);
            setParameter("nc", "00000000".substring(0, 8 - hexString.length()) + hexString);
            return;
        }
        throw new ParseException("bad value", 0);
    }

    public void setOpaque(String str) {
        if (str != null) {
            setParameter("opaque", str);
            return;
        }
        throw new NullPointerException("null arg");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, c.AbstractC2236H
    public void setParameter(String str, String str2) {
        NameValue nameValue = this.parameters.getNameValue(str.toLowerCase());
        if (nameValue == null) {
            NameValue nameValue2 = new NameValue(str, str2);
            if (str.equalsIgnoreCase("qop") || str.equalsIgnoreCase("realm") || str.equalsIgnoreCase("cnonce") || str.equalsIgnoreCase("nonce") || str.equalsIgnoreCase("username") || str.equalsIgnoreCase("domain") || str.equalsIgnoreCase("opaque") || str.equalsIgnoreCase(ParameterNames.NEXT_NONCE) || str.equalsIgnoreCase("uri") || str.equalsIgnoreCase("response") || str.equalsIgnoreCase("ik") || str.equalsIgnoreCase("ck") || str.equalsIgnoreCase("integrity-protected")) {
                if ((!(this instanceof Authorization) && !(this instanceof ProxyAuthorization)) || !str.equalsIgnoreCase("qop")) {
                    nameValue2.setQuotedValue();
                }
                if (str2 != null) {
                    if (str2.startsWith(Separators.DOUBLE_QUOTE)) {
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
    }

    public void setQop(String str) {
        if (str != null) {
            setParameter("qop", str);
            return;
        }
        throw new NullPointerException("null arg");
    }

    public void setRealm(String str) {
        if (str != null) {
            setParameter("realm", str);
            return;
        }
        throw new NullPointerException("JAIN-SIP Exception,  AuthenticationHeader, setRealm(), The realm parameter is null");
    }

    public void setResponse(String str) {
        if (str != null) {
            setParameter("response", str);
            return;
        }
        throw new NullPointerException("Null parameter");
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setStale(boolean z10) {
        setParameter(new NameValue("stale", Boolean.valueOf(z10)));
    }

    public void setURI(AbstractC2096f abstractC2096f) {
        if (abstractC2096f != null) {
            NameValue nameValue = new NameValue("uri", abstractC2096f);
            nameValue.setQuotedValue();
            this.parameters.set(nameValue);
            return;
        }
        throw new NullPointerException("Null URI");
    }

    public void setUsername(String str) {
        setParameter("username", str);
    }

    public AuthenticationHeader() {
        this.parameters.setSeparator(Separators.COMMA);
    }
}
