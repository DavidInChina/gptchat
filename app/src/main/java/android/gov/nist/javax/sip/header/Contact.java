package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.javax.sip.g;
import b.AbstractC2091a;
import c.AbstractC2257l;

/* loaded from: classes2.dex */
public final class Contact extends AddressParametersHeader implements AbstractC2257l {
    public static final String ACTION = "action";
    public static final String EXPIRES = "expires";
    public static final String PROXY = "proxy";
    public static final String Q = "q";
    public static final String REDIRECT = "redirect";
    private static final long serialVersionUID = 1677294871695706288L;
    private ContactList contactList;
    protected boolean wildCardFlag;

    public Contact() {
        super(SIPHeaderNames.CONTACT);
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        Contact contact = (Contact) super.clone();
        ContactList contactList = this.contactList;
        if (contactList != null) {
            contact.contactList = (ContactList) contactList.clone();
        }
        return contact;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if ((obj instanceof AbstractC2257l) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, c.AbstractC2269y
    public AbstractC2091a getAddress() {
        return this.address;
    }

    public ContactList getContactList() {
        return this.contactList;
    }

    public NameValueList getContactParms() {
        return this.parameters;
    }

    public int getExpires() {
        return getParameterAsInt("expires");
    }

    public String getPubGruuParam() {
        return (String) this.parameters.getValue(ParameterNames.PUB_GRUU);
    }

    public float getQValue() {
        return getParameterAsFloat("q");
    }

    public String getSipInstanceParam() {
        return (String) this.parameters.getValue(ParameterNames.SIP_INSTANCE);
    }

    public String getTempGruuParam() {
        return (String) this.parameters.getValue(ParameterNames.TEMP_GRUU);
    }

    public boolean getWildCardFlag() {
        return this.wildCardFlag;
    }

    public boolean isWildCard() {
        return this.address.isWildcard();
    }

    public void removePubGruuParam() {
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null) {
            nameValueList.delete(ParameterNames.PUB_GRUU);
        }
    }

    public void removeSipInstanceParam() {
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null) {
            nameValueList.delete(ParameterNames.SIP_INSTANCE);
        }
    }

    public void removeTempGruuParam() {
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null) {
            nameValueList.delete(ParameterNames.TEMP_GRUU);
        }
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader
    public void setAddress(AbstractC2091a abstractC2091a) {
        if (abstractC2091a != null) {
            this.address = (AddressImpl) abstractC2091a;
            this.wildCardFlag = false;
            return;
        }
        throw new NullPointerException("null address");
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    public void setExpires(int i10) {
        this.parameters.set("expires", Integer.valueOf(i10));
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, c.AbstractC2236H
    public void setParameter(String str, String str2) {
        NameValue nameValue = this.parameters.getNameValue(str);
        if (nameValue != null) {
            nameValue.setValueAsObject(str2);
            return;
        }
        NameValue nameValue2 = new NameValue(str, str2);
        if (str.equalsIgnoreCase("methods")) {
            nameValue2.setQuotedValue();
        }
        this.parameters.set(nameValue2);
    }

    public void setPubGruuParam(String str) {
        this.parameters.set(ParameterNames.PUB_GRUU, str);
    }

    public void setQValue(float f6) {
        if (f6 != -1.0f && (f6 < 0.0f || f6 > 1.0f)) {
            throw new g("JAIN-SIP Exception, Contact, setQValue(), the qValue is not between 0 and 1");
        }
        this.parameters.set("q", Float.valueOf(f6));
    }

    public void setSipInstanceParam(String str) {
        this.parameters.set(ParameterNames.SIP_INSTANCE, str);
    }

    public void setTempGruuParam(String str) {
        this.parameters.set(ParameterNames.TEMP_GRUU, str);
    }

    public void setWildCard() {
        setWildCardFlag(true);
    }

    public void setWildCardFlag(boolean z10) {
        this.wildCardFlag = true;
        AddressImpl addressImpl = new AddressImpl();
        this.address = addressImpl;
        addressImpl.setWildCardFlag();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        if (this.wildCardFlag) {
            sb2.append('*');
        } else {
            if (this.address.getAddressType() == 1) {
                this.address.encode(sb2);
            } else {
                sb2.append('<');
                this.address.encode(sb2);
                sb2.append('>');
            }
            if (!this.parameters.isEmpty()) {
                sb2.append(Separators.SEMICOLON);
                this.parameters.encode(sb2);
            }
        }
        return sb2;
    }
}
