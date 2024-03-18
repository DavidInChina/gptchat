package android.gov.nist.javax.sip.header.extensions;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.CallIdentifier;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.ParametersHeader;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Replaces extends ParametersHeader implements AbstractC2266v, ReplacesHeader {
    public static final String NAME = "Replaces";
    private static final long serialVersionUID = 8765762413224043300L;
    public String callId;
    public CallIdentifier callIdentifier;

    public Replaces() {
        super("Replaces");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String str = this.callId;
        if (str == null) {
            return sb2;
        }
        sb2.append(str);
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReplacesHeader
    public String getCallId() {
        return this.callId;
    }

    public CallIdentifier getCallIdentifer() {
        return this.callIdentifier;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReplacesHeader
    public String getFromTag() {
        if (this.parameters == null) {
            return null;
        }
        return getParameter(ParameterNames.FROM_TAG);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReplacesHeader
    public String getToTag() {
        if (this.parameters == null) {
            return null;
        }
        return getParameter(ParameterNames.TO_TAG);
    }

    public boolean hasFromTag() {
        return hasParameter(ParameterNames.FROM_TAG);
    }

    public boolean hasToTag() {
        return hasParameter(ParameterNames.TO_TAG);
    }

    public void removeFromTag() {
        this.parameters.delete(ParameterNames.FROM_TAG);
    }

    public void removeToTag() {
        this.parameters.delete(ParameterNames.TO_TAG);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReplacesHeader
    public void setCallId(String str) {
        this.callId = str;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReplacesHeader
    public void setFromTag(String str) {
        if (str != null) {
            if (!str.trim().equals("")) {
                setParameter(ParameterNames.FROM_TAG, str);
                return;
            }
            throw new ParseException("bad tag", 0);
        }
        throw new NullPointerException("null tag ");
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReplacesHeader
    public void setToTag(String str) {
        if (str != null) {
            if (!str.trim().equals("")) {
                setParameter(ParameterNames.TO_TAG, str);
                return;
            }
            throw new ParseException("bad tag", 0);
        }
        throw new NullPointerException("null tag ");
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }

    public Replaces(String str) {
        super("Replaces");
        this.callIdentifier = new CallIdentifier(str);
    }
}
