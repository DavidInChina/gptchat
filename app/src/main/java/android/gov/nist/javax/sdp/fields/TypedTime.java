package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.a;

/* loaded from: classes.dex */
public class TypedTime extends SDPObject {
    int time;
    String unit;

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = "" + Integer.toString(this.time);
        if (this.unit != null) {
            StringBuilder p10 = a.p(str);
            p10.append(this.unit);
            return p10.toString();
        }
        return str;
    }

    public int getTime() {
        return this.time;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setTime(int i10) {
        this.time = i10;
    }

    public void setUnit(String str) {
        this.unit = str;
    }
}
