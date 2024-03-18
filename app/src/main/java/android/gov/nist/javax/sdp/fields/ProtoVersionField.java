package android.gov.nist.javax.sdp.fields;

import a.AbstractC1894n;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;

/* loaded from: classes2.dex */
public class ProtoVersionField extends SDPField implements AbstractC1894n {
    protected int protoVersion;

    public ProtoVersionField() {
        super(SDPFieldNames.PROTO_VERSION_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return a.l(new StringBuilder(SDPFieldNames.PROTO_VERSION_FIELD), this.protoVersion, Separators.NEWLINE);
    }

    public int getProtoVersion() {
        return this.protoVersion;
    }

    public int getVersion() {
        return getProtoVersion();
    }

    public void setProtoVersion(int i10) {
        this.protoVersion = i10;
    }

    public void setVersion(int i10) {
        if (i10 >= 0) {
            setProtoVersion(i10);
            return;
        }
        throw new Exception("The value is <0");
    }
}
