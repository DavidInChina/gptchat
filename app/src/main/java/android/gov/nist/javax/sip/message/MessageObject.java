package android.gov.nist.javax.sip.message;

import android.gov.nist.core.GenericObject;
import android.gov.nist.core.GenericObjectList;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class MessageObject extends GenericObject {
    @Override // android.gov.nist.core.GenericObject
    public void dbgPrint() {
        super.dbgPrint();
    }

    @Override // android.gov.nist.core.GenericObject
    public String debugDump() {
        Field[] declaredFields;
        this.stringRepresentation = "";
        Class<?> cls = getClass();
        sprint(cls.getName());
        sprint("{");
        for (Field field : cls.getDeclaredFields()) {
            if (field.getModifiers() != 2) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (name.compareTo("stringRepresentation") != 0 && name.compareTo("indentation") != 0) {
                    sprint(name.concat(":"));
                    try {
                        if (type.isPrimitive()) {
                            String cls2 = type.toString();
                            sprint(cls2 + ":");
                            if (cls2.compareTo("int") == 0) {
                                sprint(field.getInt(this));
                            } else if (cls2.compareTo("short") == 0) {
                                sprint(field.getShort(this));
                            } else if (cls2.compareTo("char") == 0) {
                                sprint(field.getChar(this));
                            } else if (cls2.compareTo("long") == 0) {
                                sprint(field.getLong(this));
                            } else if (cls2.compareTo("boolean") == 0) {
                                sprint(field.getBoolean(this));
                            } else if (cls2.compareTo("double") == 0) {
                                sprint(field.getDouble(this));
                            } else if (cls2.compareTo("float") == 0) {
                                sprint(field.getFloat(this));
                            }
                        } else if (GenericObject.class.isAssignableFrom(type)) {
                            if (field.get(this) != null) {
                                sprint(((GenericObject) field.get(this)).debugDump(this.indentation + 1));
                            } else {
                                sprint("<null>");
                            }
                        } else if (GenericObjectList.class.isAssignableFrom(type)) {
                            if (field.get(this) != null) {
                                sprint(((GenericObjectList) field.get(this)).debugDump(this.indentation + 1));
                            } else {
                                sprint("<null>");
                            }
                        } else {
                            if (field.get(this) != null) {
                                sprint(field.get(this).getClass().getName() + ":");
                            } else {
                                sprint(type.getName() + ":");
                            }
                            sprint("{");
                            if (field.get(this) != null) {
                                sprint(field.get(this).toString());
                            } else {
                                sprint("<null>");
                            }
                            sprint("}");
                        }
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
        }
        sprint("}");
        return this.stringRepresentation;
    }

    @Override // android.gov.nist.core.GenericObject
    public abstract String encode();

    public String dbgPrint(int i10) {
        int i11 = this.indentation;
        this.indentation = i10;
        String obj = toString();
        this.indentation = i11;
        return obj;
    }
}
