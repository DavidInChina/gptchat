package android.gov.nist.javax.sdp.fields;

import R.a;
import a.AbstractC1882b;
import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public class PhoneField extends SDPField implements AbstractC1882b {
    protected String name;
    protected String phoneNumber;

    public PhoneField() {
        super(SDPFieldNames.PHONE_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.name;
        String str2 = SDPFieldNames.PHONE_FIELD;
        if (str != null) {
            str2 = a.t(new StringBuilder(str2), this.name, Separators.LESS_THAN);
        }
        StringBuilder p10 = android.gov.nist.core.a.p(str2);
        p10.append(this.phoneNumber);
        String sb2 = p10.toString();
        if (this.name != null) {
            sb2 = android.gov.nist.core.a.g(sb2, Separators.GREATER_THAN);
        }
        return android.gov.nist.core.a.g(sb2, Separators.NEWLINE);
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getValue() {
        return getName();
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setValue(String str) {
        if (str != null) {
            setName(str);
            return;
        }
        throw new Exception("The value parameter is null");
    }
}
