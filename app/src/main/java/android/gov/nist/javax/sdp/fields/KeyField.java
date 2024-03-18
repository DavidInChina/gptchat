package android.gov.nist.javax.sdp.fields;

import a.AbstractC1884d;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;

/* loaded from: classes.dex */
public class KeyField extends SDPField implements AbstractC1884d {
    protected String keyData;
    protected String type;

    public KeyField() {
        super(SDPFieldNames.KEY_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = SDPFieldNames.KEY_FIELD + this.type;
        if (this.keyData != null) {
            StringBuilder p10 = a.p(a.g(str, ":"));
            p10.append(this.keyData);
            str = p10.toString();
        }
        return a.g(str, Separators.NEWLINE);
    }

    public String getKey() {
        return getKeyData();
    }

    public String getKeyData() {
        return this.keyData;
    }

    public String getMethod() {
        return this.type;
    }

    public String getType() {
        return this.type;
    }

    public boolean hasKey() {
        if (getKeyData() != null) {
            return true;
        }
        return false;
    }

    public void setKey(String str) {
        if (str != null) {
            setKeyData(str);
            return;
        }
        throw new Exception("The key is null");
    }

    public void setKeyData(String str) {
        this.keyData = str;
    }

    public void setMethod(String str) {
        this.type = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
