package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class PPreferredIdentity extends AddressParametersHeader implements PPreferredIdentityHeader, SIPHeaderNamesIms, AbstractC2266v {
    public PPreferredIdentity(AddressImpl addressImpl) {
        super("P-Preferred-Identity");
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
        return sb2;
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }

    public PPreferredIdentity() {
        super("P-Preferred-Identity");
    }
}
