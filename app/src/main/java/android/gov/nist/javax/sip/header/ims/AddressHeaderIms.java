package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.SIPHeader;
import b.AbstractC2091a;

/* loaded from: classes.dex */
public abstract class AddressHeaderIms extends SIPHeader {
    protected AddressImpl address;

    public AddressHeaderIms(String str) {
        super(str);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        AddressHeaderIms addressHeaderIms = (AddressHeaderIms) super.clone();
        AddressImpl addressImpl = this.address;
        if (addressImpl != null) {
            addressHeaderIms.address = (AddressImpl) addressImpl.clone();
        }
        return addressHeaderIms;
    }

    public abstract String encodeBody();

    public AbstractC2091a getAddress() {
        return this.address;
    }

    public void setAddress(AbstractC2091a abstractC2091a) {
        this.address = (AddressImpl) abstractC2091a;
    }
}
