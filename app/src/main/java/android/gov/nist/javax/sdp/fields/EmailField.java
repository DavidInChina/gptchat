package android.gov.nist.javax.sdp.fields;

import a.AbstractC1882b;
import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public class EmailField extends SDPField implements AbstractC1882b {
    protected EmailAddress emailAddress = new EmailAddress();

    public EmailField() {
        super(SDPFieldNames.EMAIL_FIELD);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        EmailField emailField = (EmailField) super.clone();
        EmailAddress emailAddress = this.emailAddress;
        if (emailAddress != null) {
            emailField.emailAddress = (EmailAddress) emailAddress.clone();
        }
        return emailField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return SDPFieldNames.EMAIL_FIELD + this.emailAddress.encode() + Separators.NEWLINE;
    }

    public EmailAddress getEmailAddress() {
        return this.emailAddress;
    }

    public String getValue() {
        EmailAddress emailAddress = this.emailAddress;
        if (emailAddress == null) {
            return null;
        }
        return emailAddress.getDisplayName();
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setValue(String str) {
        if (str != null) {
            this.emailAddress.setDisplayName(str);
            return;
        }
        throw new Exception("The value is null");
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject
    public String toString() {
        return encode();
    }
}
