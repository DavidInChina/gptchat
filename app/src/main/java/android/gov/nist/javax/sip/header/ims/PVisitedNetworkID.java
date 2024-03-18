package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.core.Token;
import android.gov.nist.javax.sip.header.ParametersHeader;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class PVisitedNetworkID extends ParametersHeader implements PVisitedNetworkIDHeader, SIPHeaderNamesIms, AbstractC2266v {
    private boolean isQuoted;
    private String networkID;

    public PVisitedNetworkID() {
        super("P-Visited-Network-ID");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        PVisitedNetworkID pVisitedNetworkID = (PVisitedNetworkID) super.clone();
        String str = this.networkID;
        if (str != null) {
            pVisitedNetworkID.networkID = str;
        }
        pVisitedNetworkID.isQuoted = this.isQuoted;
        return pVisitedNetworkID;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (getVisitedNetworkID() != null) {
            if (this.isQuoted) {
                sb2.append(Separators.DOUBLE_QUOTE);
                sb2.append(getVisitedNetworkID());
                sb2.append(Separators.DOUBLE_QUOTE);
            } else {
                sb2.append(getVisitedNetworkID());
            }
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!(obj instanceof PVisitedNetworkIDHeader)) {
            return false;
        }
        PVisitedNetworkIDHeader pVisitedNetworkIDHeader = (PVisitedNetworkIDHeader) obj;
        if (!getVisitedNetworkID().equals(pVisitedNetworkIDHeader.getVisitedNetworkID()) || !equalParameters(pVisitedNetworkIDHeader)) {
            return false;
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader
    public String getVisitedNetworkID() {
        return this.networkID;
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader
    public void setVisitedNetworkID(String str) {
        if (str != null) {
            this.networkID = str;
            this.isQuoted = true;
            return;
        }
        throw new NullPointerException(" the networkID parameter is null");
    }

    public PVisitedNetworkID(String str) {
        super("P-Visited-Network-ID");
        setVisitedNetworkID(str);
    }

    public PVisitedNetworkID(Token token) {
        super("P-Visited-Network-ID");
        setVisitedNetworkID(token.getTokenValue());
    }

    @Override // android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader
    public void setVisitedNetworkID(Token token) {
        if (token != null) {
            this.networkID = token.getTokenValue();
            this.isQuoted = false;
            return;
        }
        throw new NullPointerException(" the networkID parameter is null");
    }
}
