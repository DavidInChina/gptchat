package android.gov.nist.javax.sdp.fields;

import R.a;
import a.AbstractC1891k;
import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public class SessionNameField extends SDPField implements AbstractC1891k {
    protected String sessionName;

    public SessionNameField() {
        super(SDPFieldNames.SESSION_NAME_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return a.t(new StringBuilder(SDPFieldNames.SESSION_NAME_FIELD), this.sessionName, Separators.NEWLINE);
    }

    public String getSessionName() {
        return this.sessionName;
    }

    public String getValue() {
        return getSessionName();
    }

    public void setSessionName(String str) {
        this.sessionName = str;
    }

    public void setValue(String str) {
        if (str != null) {
            setSessionName(str);
            return;
        }
        throw new Exception("The value is null");
    }
}
