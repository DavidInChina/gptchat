package android.gov.nist.javax.sdp.fields;

import a.AbstractC1892l;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import java.util.Date;

/* loaded from: classes2.dex */
public class TimeField extends SDPField implements AbstractC1892l {
    protected long startTime;
    protected long stopTime;

    public TimeField() {
        super(SDPFieldNames.TIME_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb2 = new StringBuilder(SDPFieldNames.TIME_FIELD);
        sb2.append(this.startTime);
        sb2.append(Separators.SP);
        return a.m(sb2, this.stopTime, Separators.NEWLINE);
    }

    public Date getStart() {
        return new Date((this.startTime - 2208988800L) * 1000);
    }

    public long getStartTime() {
        return this.startTime;
    }

    public Date getStop() {
        return new Date((this.stopTime - 2208988800L) * 1000);
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public boolean getTypedTime() {
        return false;
    }

    public boolean isZero() {
        if (getStartTime() == 0 && getStopTime() == 0) {
            return true;
        }
        return false;
    }

    public void setStart(Date date) {
        if (date != null) {
            this.startTime = (date.getTime() / 1000) + 2208988800L;
            return;
        }
        throw new Exception("The date is null");
    }

    public void setStartTime(long j6) {
        this.startTime = j6;
    }

    public void setStop(Date date) {
        if (date != null) {
            this.stopTime = (date.getTime() / 1000) + 2208988800L;
            return;
        }
        throw new Exception("The date is null");
    }

    public void setStopTime(long j6) {
        this.stopTime = j6;
    }

    public void setTypedTime(boolean z10) {
    }

    public void setZero() {
        setStopTime(0L);
        setStartTime(0L);
    }
}
