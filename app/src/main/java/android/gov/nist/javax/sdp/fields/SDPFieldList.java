package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.GenericObject;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class SDPFieldList extends SDPField {
    protected SDPObjectList sdpFields;

    public SDPFieldList() {
    }

    public void add(SDPField sDPField) {
        this.sdpFields.add((SDPObject) sDPField);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        SDPFieldList sDPFieldList = (SDPFieldList) super.clone();
        SDPObjectList sDPObjectList = this.sdpFields;
        if (sDPObjectList != null) {
            sDPFieldList.sdpFields = (SDPObjectList) sDPObjectList.clone();
        }
        return sDPFieldList;
    }

    @Override // android.gov.nist.core.GenericObject
    public String debugDump(int i10) {
        this.stringRepresentation = "";
        String indentation = new Indentation(i10).getIndentation();
        String name = getClass().getName();
        sprint(indentation + name);
        sprint(indentation + "{");
        sprint(indentation + this.sdpFields.debugDump(i10));
        sprint(indentation + "}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb2 = new StringBuilder();
        ListIterator<GenericObject> listIterator = this.sdpFields.listIterator();
        while (listIterator.hasNext()) {
            sb2.append(((SDPField) listIterator.next()).encode());
        }
        return sb2.toString();
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        SDPFieldList sDPFieldList = (SDPFieldList) obj;
        SDPObjectList sDPObjectList = this.sdpFields;
        if (sDPObjectList == null) {
            if (sDPFieldList.sdpFields != null) {
                return false;
            }
            return true;
        }
        return sDPObjectList.equals(sDPFieldList.sdpFields);
    }

    public SDPObject first() {
        return (SDPObject) this.sdpFields.first();
    }

    public ListIterator listIterator() {
        return this.sdpFields.listIterator();
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        SDPObjectList sDPObjectList = this.sdpFields;
        SDPObjectList sDPObjectList2 = ((SDPFieldList) obj).sdpFields;
        if (sDPObjectList == sDPObjectList2) {
            return true;
        }
        if (sDPObjectList == null) {
            return false;
        }
        return sDPObjectList.match(sDPObjectList2);
    }

    public SDPObject next() {
        return (SDPObject) this.sdpFields.next();
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject
    public String toString() {
        return encode();
    }

    public SDPFieldList(String str) {
        super(str);
        this.sdpFields = new SDPObjectList(str);
    }

    public SDPFieldList(String str, String str2) {
        super(str);
        this.sdpFields = new SDPObjectList(str, str2);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String debugDump() {
        return debugDump(0);
    }
}
