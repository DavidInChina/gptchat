package android.gov.nist.javax.sdp.fields;

import R.a;
import a.AbstractC1883c;
import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public class InformationField extends SDPField implements AbstractC1883c {
    protected String information;

    public InformationField() {
        super(SDPFieldNames.INFORMATION_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return a.t(new StringBuilder(SDPFieldNames.INFORMATION_FIELD), this.information, Separators.NEWLINE);
    }

    public String getInformation() {
        return this.information;
    }

    public String getValue() {
        return this.information;
    }

    public void setInformation(String str) {
        this.information = str;
    }

    public void setValue(String str) {
        if (str != null) {
            setInformation(str);
            return;
        }
        throw new Exception("The value is null");
    }
}
