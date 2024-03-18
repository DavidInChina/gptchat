package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import android.javax.sip.g;
import c.c0;

/* loaded from: classes.dex */
public class TimeStamp extends SIPHeader implements c0 {
    private static final long serialVersionUID = -3711322366481232720L;
    protected long timeStamp = -1;
    protected float delayFloat = -1.0f;
    private float timeStampFloat = -1.0f;
    protected int delay = -1;

    public TimeStamp() {
        super(SIPHeaderNames.TIMESTAMP);
    }

    private String getDelayAsString() {
        int i10 = this.delay;
        if (i10 == -1 && this.delayFloat == -1.0f) {
            return "";
        }
        if (i10 != -1) {
            return Integer.toString(i10);
        }
        return Float.toString(this.delayFloat);
    }

    private String getTimeStampAsString() {
        long j6 = this.timeStamp;
        if (j6 == -1 && this.timeStampFloat == -1.0f) {
            return "";
        }
        if (j6 != -1) {
            return Long.toString(j6);
        }
        return Float.toString(this.timeStampFloat);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        String timeStampAsString = getTimeStampAsString();
        String delayAsString = getDelayAsString();
        if (timeStampAsString.equals("") && delayAsString.equals("")) {
            sb2.append("");
            return sb2;
        }
        if (!timeStampAsString.equals("")) {
            sb2.append(timeStampAsString);
        }
        if (!delayAsString.equals("")) {
            sb2.append(Separators.SP);
            sb2.append(delayAsString);
        }
        return sb2;
    }

    public float getDelay() {
        float f6 = this.delayFloat;
        if (f6 == -1.0f) {
            return this.delay;
        }
        return f6;
    }

    @Override // c.c0
    public long getTime() {
        long j6 = this.timeStamp;
        if (j6 == -1) {
            return this.timeStampFloat;
        }
        return j6;
    }

    public int getTimeDelay() {
        int i10 = this.delay;
        if (i10 == -1) {
            return (int) this.delayFloat;
        }
        return i10;
    }

    public float getTimeStamp() {
        float f6 = this.timeStampFloat;
        if (f6 == -1.0f) {
            return (float) this.timeStamp;
        }
        return f6;
    }

    public boolean hasDelay() {
        if (this.delay != -1) {
            return true;
        }
        return false;
    }

    public void removeDelay() {
        this.delay = -1;
    }

    public void setDelay(float f6) {
        if (f6 < 0.0f && f6 != -1.0f) {
            throw new g("JAIN-SIP Exception, TimeStamp, setDelay(), the delay parameter is <0");
        }
        this.delayFloat = f6;
        this.delay = -1;
    }

    public void setTime(long j6) {
        if (j6 >= -1) {
            this.timeStamp = j6;
            this.timeStampFloat = -1.0f;
            return;
        }
        throw new g("Illegal timestamp");
    }

    public void setTimeDelay(int i10) {
        if (i10 >= -1) {
            this.delay = i10;
            this.delayFloat = -1.0f;
            return;
        }
        throw new g(a.e("Value out of range ", i10));
    }

    public void setTimeStamp(float f6) {
        if (f6 >= 0.0f) {
            this.timeStamp = -1L;
            this.timeStampFloat = f6;
            return;
        }
        throw new g("JAIN-SIP Exception, TimeStamp, setTimeStamp(), the timeStamp parameter is <0");
    }
}
