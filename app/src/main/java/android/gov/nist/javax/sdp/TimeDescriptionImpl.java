package android.gov.nist.javax.sdp;

import a.AbstractC1892l;
import android.gov.nist.core.a;
import android.gov.nist.javax.sdp.fields.RepeatField;
import android.gov.nist.javax.sdp.fields.TimeField;
import java.io.Serializable;
import java.util.Vector;

/* loaded from: classes.dex */
public class TimeDescriptionImpl implements Serializable, Cloneable {
    private Vector repeatList;
    private TimeField timeImpl;

    public TimeDescriptionImpl() {
        this.timeImpl = new TimeField();
        this.repeatList = new Vector();
    }

    public void addRepeatField(RepeatField repeatField) {
        if (repeatField != null) {
            this.repeatList.add(repeatField);
            return;
        }
        throw new NullPointerException("null repeatField");
    }

    public Vector getRepeatTimes(boolean z10) {
        return this.repeatList;
    }

    public AbstractC1892l getTime() {
        return this.timeImpl;
    }

    public void setRepeatTimes(Vector vector) {
        this.repeatList = vector;
    }

    public void setTime(AbstractC1892l abstractC1892l) {
        if (abstractC1892l != null) {
            if (abstractC1892l instanceof TimeField) {
                this.timeImpl = (TimeField) abstractC1892l;
                return;
            }
            throw new Exception("The parameter is not an instance of TimeField");
        }
        throw new Exception("The parameter is null");
    }

    public String toString() {
        String encode = this.timeImpl.encode();
        for (int i10 = 0; i10 < this.repeatList.size(); i10++) {
            StringBuilder p10 = a.p(encode);
            p10.append(((RepeatField) this.repeatList.elementAt(i10)).encode());
            encode = p10.toString();
        }
        return encode;
    }

    public TimeDescriptionImpl(TimeField timeField) {
        this.timeImpl = timeField;
        this.repeatList = new Vector();
    }
}
