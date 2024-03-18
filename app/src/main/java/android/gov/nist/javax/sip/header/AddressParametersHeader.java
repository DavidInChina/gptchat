package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.address.AddressImpl;
import b.AbstractC2091a;
import c.AbstractC2236H;
import c.AbstractC2269y;

/* loaded from: classes2.dex */
public abstract class AddressParametersHeader extends ParametersHeader {
    protected AddressImpl address;

    public AddressParametersHeader(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        AddressParametersHeader addressParametersHeader = (AddressParametersHeader) super.clone();
        AddressImpl addressImpl = this.address;
        if (addressImpl != null) {
            addressParametersHeader.address = (AddressImpl) addressImpl.clone();
        }
        return addressParametersHeader;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2269y) || !(obj instanceof AbstractC2236H)) {
            return false;
        }
        AbstractC2269y abstractC2269y = (AbstractC2269y) obj;
        if (getAddress().equals(abstractC2269y.getAddress()) && equalParameters((AbstractC2236H) abstractC2269y)) {
            return true;
        }
        return false;
    }

    public AbstractC2091a getAddress() {
        return this.address;
    }

    public void setAddress(AbstractC2091a abstractC2091a) {
        this.address = (AddressImpl) abstractC2091a;
    }

    public AddressParametersHeader(String str, boolean z10) {
        super(str, z10);
    }
}
