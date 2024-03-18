package android.gov.nist.javax.sdp.fields;

import a.AbstractC1882b;
import android.gov.nist.core.GenericObject;
import android.gov.nist.core.Separators;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public class ZoneField extends SDPField implements AbstractC1882b {
    protected SDPObjectList zoneAdjustments = new SDPObjectList();

    public ZoneField() {
        super(SDPFieldNames.ZONE_FIELD);
    }

    public void addZoneAdjustment(ZoneAdjustment zoneAdjustment) {
        this.zoneAdjustments.add((SDPObject) zoneAdjustment);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ZoneField zoneField = (ZoneField) super.clone();
        SDPObjectList sDPObjectList = this.zoneAdjustments;
        if (sDPObjectList != null) {
            zoneField.zoneAdjustments = (SDPObjectList) sDPObjectList.clone();
        }
        return zoneField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb2 = new StringBuilder(SDPFieldNames.ZONE_FIELD);
        ListIterator<GenericObject> listIterator = this.zoneAdjustments.listIterator();
        int i10 = 0;
        while (listIterator.hasNext()) {
            ZoneAdjustment zoneAdjustment = (ZoneAdjustment) listIterator.next();
            if (i10 > 0) {
                sb2.append(Separators.SP);
            }
            sb2.append(zoneAdjustment.encode());
            i10++;
        }
        sb2.append(Separators.NEWLINE);
        return sb2.toString();
    }

    public boolean getTypedTime() {
        return false;
    }

    public SDPObjectList getZoneAdjustments() {
        return this.zoneAdjustments;
    }

    public void setTypedTime(boolean z10) {
    }

    public void setZoneAdjustments(Hashtable hashtable) {
        if (hashtable != null) {
            Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                Object nextElement = keys.nextElement();
                if (nextElement instanceof Date) {
                    ZoneAdjustment zoneAdjustment = new ZoneAdjustment();
                    zoneAdjustment.setTime(((Date) nextElement).getTime());
                    addZoneAdjustment(zoneAdjustment);
                } else {
                    throw new Exception("The map is not well-formated ");
                }
            }
            return;
        }
        throw new Exception("The map is null");
    }

    public Hashtable getZoneAdjustments(boolean z10) {
        Hashtable hashtable = new Hashtable();
        SDPObjectList zoneAdjustments = getZoneAdjustments();
        if (zoneAdjustments == null) {
            if (!z10) {
                return null;
            }
            return new Hashtable();
        }
        while (true) {
            ZoneAdjustment zoneAdjustment = (ZoneAdjustment) zoneAdjustments.next();
            if (zoneAdjustment == null) {
                return hashtable;
            }
            hashtable.put(new Date(zoneAdjustment.getTime()), Integer.valueOf(Long.valueOf(zoneAdjustment.getTime()).toString()));
        }
    }
}
