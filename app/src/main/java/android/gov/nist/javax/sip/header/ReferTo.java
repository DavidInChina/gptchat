package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import c.AbstractC2245Q;

/* loaded from: classes.dex */
public final class ReferTo extends AddressParametersHeader implements AbstractC2245Q {
    private static final long serialVersionUID = -1666700428440034851L;

    public ReferTo() {
        super("Refer-To");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        AddressImpl addressImpl = this.address;
        if (addressImpl == null) {
            return null;
        }
        if (addressImpl.getAddressType() == 2) {
            sb2.append(Separators.LESS_THAN);
        }
        this.address.encode(sb2);
        if (this.address.getAddressType() == 2) {
            sb2.append(Separators.GREATER_THAN);
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.parameters.encode(sb2);
        }
        return sb2;
    }
}
