package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import b.AbstractC2096f;
import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PAssociatedURI extends AddressParametersHeader implements PAssociatedURIHeader, SIPHeaderNamesIms, AbstractC2266v {
    public PAssociatedURI() {
        super("P-Associated-URI");
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        PAssociatedURI pAssociatedURI = (PAssociatedURI) super.clone();
        AddressImpl addressImpl = this.address;
        if (addressImpl != null) {
            pAssociatedURI.address = (AddressImpl) addressImpl.clone();
        }
        return pAssociatedURI;
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

    @Override // android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader
    public AbstractC2096f getAssociatedURI() {
        return this.address.getURI();
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader
    public void setAssociatedURI(AbstractC2096f abstractC2096f) {
        if (abstractC2096f != null) {
            this.address.setURI(abstractC2096f);
            return;
        }
        throw new NullPointerException("null URI");
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }

    public PAssociatedURI(AddressImpl addressImpl) {
        super("P-Associated-URI");
        this.address = addressImpl;
    }

    public PAssociatedURI(GenericURI genericURI) {
        super("P-Associated-URI");
        AddressImpl addressImpl = new AddressImpl();
        this.address = addressImpl;
        addressImpl.setURI(genericURI);
    }
}
