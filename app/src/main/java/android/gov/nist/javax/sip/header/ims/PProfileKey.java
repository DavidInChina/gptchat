package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class PProfileKey extends AddressParametersHeader implements PProfileKeyHeader, SIPHeaderNamesIms, AbstractC2266v {
    public PProfileKey() {
        super("P-Profile-Key");
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        return (PProfileKey) super.clone();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (this.address.getAddressType() == 2) {
            sb2.append(Separators.LESS_THAN);
        }
        sb2.append(this.address.encode());
        if (this.address.getAddressType() == 2) {
            sb2.append(Separators.GREATER_THAN);
        }
        if (!this.parameters.isEmpty()) {
            sb2.append(Separators.SEMICOLON + this.parameters.encode());
        }
        return sb2;
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if ((obj instanceof PProfileKey) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }

    public PProfileKey(AddressImpl addressImpl) {
        super("P-Profile-Key");
        this.address = addressImpl;
    }
}
