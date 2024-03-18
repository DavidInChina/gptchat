package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class PCalledPartyID extends AddressParametersHeader implements PCalledPartyIDHeader, SIPHeaderNamesIms, AbstractC2266v {
    public PCalledPartyID(AddressImpl addressImpl) {
        super("P-Called-Party-ID");
        this.address = addressImpl;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (this.address.getAddressType() == 2) {
            sb2.append(Separators.LESS_THAN);
        }
        this.address.encode(sb2);
        if (this.address.getAddressType() == 2) {
            sb2.append(Separators.GREATER_THAN);
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            return this.parameters.encode(sb2);
        }
        return sb2;
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }

    public PCalledPartyID() {
        super("P-Called-Party-ID");
    }
}
