package android.gov.nist.javax.sip.header.extensions;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParametersHeader;
import c.AbstractC2266v;
import java.util.Iterator;

/* loaded from: classes.dex */
public class References extends ParametersHeader implements ReferencesHeader, AbstractC2266v {
    private static final long serialVersionUID = 8536961681006637622L;
    private String callId;

    public References() {
        super(ReferencesHeader.NAME);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (this.parameters.isEmpty()) {
            sb2.append(this.callId);
            return sb2;
        }
        sb2.append(this.callId);
        sb2.append(Separators.SEMICOLON);
        return this.parameters.encode(sb2);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public String getCallId() {
        return this.callId;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.HeaderExt
    public String getName() {
        return ReferencesHeader.NAME;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, c.AbstractC2236H
    public String getParameter(String str) {
        return super.getParameter(str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, c.AbstractC2236H
    public Iterator getParameterNames() {
        return super.getParameterNames();
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public String getRel() {
        return getParameter(ReferencesHeader.REL);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, c.AbstractC2236H
    public void removeParameter(String str) {
        super.removeParameter(str);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public void setCallId(String str) {
        this.callId = str;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, c.AbstractC2236H
    public void setParameter(String str, String str2) {
        super.setParameter(str, str2);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public void setRel(String str) {
        if (str != null) {
            setParameter(ReferencesHeader.REL, str);
        }
    }

    public void setValue(String str) {
        throw new UnsupportedOperationException("operation not supported");
    }
}
