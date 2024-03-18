package android.gov.nist.javax.sdp.fields;

import R.a;
import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public class EmailAddress extends SDPObject {
    protected String displayName;
    protected Email email;

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        EmailAddress emailAddress = (EmailAddress) super.clone();
        Email email = this.email;
        if (email != null) {
            emailAddress.email = (Email) email.clone();
        }
        return emailAddress;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str;
        if (this.displayName != null) {
            str = a.t(new StringBuilder(), this.displayName, Separators.LESS_THAN);
        } else {
            str = "";
        }
        StringBuilder p10 = android.gov.nist.core.a.p(str);
        p10.append(this.email.encode());
        String sb2 = p10.toString();
        if (this.displayName != null) {
            return android.gov.nist.core.a.g(sb2, Separators.GREATER_THAN);
        }
        return sb2;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
