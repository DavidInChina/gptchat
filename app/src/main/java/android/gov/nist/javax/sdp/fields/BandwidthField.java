package android.gov.nist.javax.sdp.fields;

import R.a;
import a.AbstractC1882b;
import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public class BandwidthField extends SDPField implements AbstractC1882b {
    protected int bandwidth;
    protected String bwtype;

    public BandwidthField() {
        super(SDPFieldNames.BANDWIDTH_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.bwtype;
        String str2 = SDPFieldNames.BANDWIDTH_FIELD;
        if (str != null) {
            str2 = a.t(new StringBuilder(str2), this.bwtype, ":");
        }
        return android.gov.nist.core.a.l(android.gov.nist.core.a.p(str2), this.bandwidth, Separators.NEWLINE);
    }

    public int getBandwidth() {
        return this.bandwidth;
    }

    public String getBwtype() {
        return this.bwtype;
    }

    public String getType() {
        return getBwtype();
    }

    public int getValue() {
        return getBandwidth();
    }

    public void setBandwidth(int i10) {
        this.bandwidth = i10;
    }

    public void setBwtype(String str) {
        this.bwtype = str;
    }

    public void setType(String str) {
        if (str != null) {
            setBwtype(str);
            return;
        }
        throw new Exception("The type is null");
    }

    public void setValue(int i10) {
        setBandwidth(i10);
    }
}
