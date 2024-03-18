package android.gov.nist.javax.sdp.fields;

import a.AbstractC1882b;
import android.gov.nist.core.GenericObject;
import android.gov.nist.core.Separators;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public class RepeatField extends SDPField implements AbstractC1882b {
    private static final long serialVersionUID = -6415338212212641819L;
    protected TypedTime activeDuration;
    protected SDPObjectList offsets = new SDPObjectList();
    protected TypedTime repeatInterval;

    public RepeatField() {
        super(SDPFieldNames.REPEAT_FIELD);
    }

    public void addOffset(TypedTime typedTime) {
        this.offsets.add((SDPObject) typedTime);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        RepeatField repeatField = (RepeatField) super.clone();
        TypedTime typedTime = this.repeatInterval;
        if (typedTime != null) {
            repeatField.repeatInterval = (TypedTime) typedTime.clone();
        }
        TypedTime typedTime2 = this.activeDuration;
        if (typedTime2 != null) {
            repeatField.activeDuration = (TypedTime) typedTime2.clone();
        }
        SDPObjectList sDPObjectList = this.offsets;
        if (sDPObjectList != null) {
            repeatField.offsets = (SDPObjectList) sDPObjectList.clone();
        }
        return repeatField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb2 = new StringBuilder(SDPFieldNames.REPEAT_FIELD);
        sb2.append(this.repeatInterval.encode());
        sb2.append(Separators.SP);
        sb2.append(this.activeDuration.encode());
        ListIterator<GenericObject> listIterator = this.offsets.listIterator();
        while (listIterator.hasNext()) {
            sb2.append(Separators.SP);
            sb2.append(((TypedTime) listIterator.next()).encode());
        }
        sb2.append(Separators.NEWLINE);
        return sb2.toString();
    }

    public int getActiveDuration() {
        TypedTime typedTime = this.activeDuration;
        if (typedTime == null) {
            return -1;
        }
        return typedTime.getTime();
    }

    public int[] getOffsetArray() {
        LinkedList offsets = getOffsets();
        int[] iArr = new int[offsets.size()];
        for (int i10 = 0; i10 < offsets.size(); i10++) {
            iArr[i10] = ((TypedTime) offsets.get(i10)).getTime();
        }
        return iArr;
    }

    public LinkedList getOffsets() {
        return this.offsets;
    }

    public int getRepeatInterval() {
        TypedTime typedTime = this.repeatInterval;
        if (typedTime == null) {
            return -1;
        }
        return typedTime.getTime();
    }

    public boolean getTypedTime() {
        return true;
    }

    public void setActiveDuration(TypedTime typedTime) {
        this.activeDuration = typedTime;
    }

    public void setOffsetArray(int[] iArr) {
        for (int i10 : iArr) {
            TypedTime typedTime = new TypedTime();
            typedTime.setTime(i10);
            addOffset(typedTime);
        }
    }

    public void setRepeatInterval(TypedTime typedTime) {
        this.repeatInterval = typedTime;
    }

    public void setTypedTime(boolean z10) {
    }

    public void setActiveDuration(int i10) {
        if (i10 >= 0) {
            if (this.activeDuration == null) {
                this.activeDuration = new TypedTime();
            }
            this.activeDuration.setTime(i10);
            return;
        }
        throw new Exception("The active Duration is <0");
    }

    public void setRepeatInterval(int i10) {
        if (i10 >= 0) {
            if (this.repeatInterval == null) {
                this.repeatInterval = new TypedTime();
            }
            this.repeatInterval.setTime(i10);
            return;
        }
        throw new Exception("The repeat interval is <0");
    }
}
