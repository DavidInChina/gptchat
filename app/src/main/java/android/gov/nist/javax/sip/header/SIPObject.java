package android.gov.nist.javax.sip.header;

import android.gov.nist.core.GenericObject;
import android.gov.nist.core.GenericObjectList;
import android.gov.nist.core.InternalErrorHandler;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public abstract class SIPObject extends GenericObject {
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
            if ((field.getModifiers() & 2) != 2) {
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

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        sb2.append(encode());
        return sb2;
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        SIPObject sIPObject = (SIPObject) obj;
        Class<?> cls = getClass();
        Class<?> cls2 = obj.getClass();
        while (true) {
            Field[] declaredFields = cls.getDeclaredFields();
            if (!cls2.equals(cls)) {
                return false;
            }
            Field[] declaredFields2 = cls2.getDeclaredFields();
            for (int i10 = 0; i10 < declaredFields.length; i10++) {
                Field field = declaredFields[i10];
                Field field2 = declaredFields2[i10];
                int modifiers = field.getModifiers();
                if ((modifiers & 2) != 2) {
                    Class<?> type = field.getType();
                    String name = field.getName();
                    if (name.compareTo("stringRepresentation") != 0 && name.compareTo("indentation") != 0) {
                        try {
                            if (type.isPrimitive()) {
                                String cls3 = type.toString();
                                if (cls3.compareTo("int") == 0) {
                                    if (field.getInt(this) != field2.getInt(sIPObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("short") == 0) {
                                    if (field.getShort(this) != field2.getShort(sIPObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("char") == 0) {
                                    if (field.getChar(this) != field2.getChar(sIPObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("long") == 0) {
                                    if (field.getLong(this) != field2.getLong(sIPObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("boolean") == 0) {
                                    if (field.getBoolean(this) != field2.getBoolean(sIPObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("double") == 0) {
                                    if (field.getDouble(this) != field2.getDouble(sIPObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("float") == 0 && field.getFloat(this) != field2.getFloat(sIPObject)) {
                                    return false;
                                }
                            } else if (field2.get(sIPObject) != field.get(this)) {
                                if (field.get(this) == null && field2.get(sIPObject) != null) {
                                    return false;
                                }
                                if ((field2.get(sIPObject) == null && field.get(this) != null) || !field.get(this).equals(field2.get(sIPObject))) {
                                    return false;
                                }
                            }
                        } catch (IllegalAccessException e10) {
                            PrintStream printStream = System.out;
                            printStream.println("accessed field ".concat(name));
                            printStream.println("modifier  " + modifiers);
                            printStream.println("modifier.private  2");
                            InternalErrorHandler.handleException(e10);
                        }
                    }
                }
            }
            if (cls.equals(SIPObject.class)) {
                return true;
            }
            cls = cls.getSuperclass();
            cls2 = cls2.getSuperclass();
        }
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        GenericObject genericObject = (GenericObject) obj;
        Class<?> cls = getClass();
        Class<?> cls2 = obj.getClass();
        while (true) {
            Field[] declaredFields = cls.getDeclaredFields();
            Field[] declaredFields2 = cls2.getDeclaredFields();
            for (int i10 = 0; i10 < declaredFields.length; i10++) {
                Field field = declaredFields[i10];
                Field field2 = declaredFields2[i10];
                if ((field.getModifiers() & 2) != 2) {
                    Class<?> type = field.getType();
                    String name = field.getName();
                    if (name.compareTo("stringRepresentation") != 0 && name.compareTo("indentation") != 0) {
                        try {
                            if (type.isPrimitive()) {
                                String cls3 = type.toString();
                                if (cls3.compareTo("int") == 0) {
                                    if (field.getInt(this) != field2.getInt(genericObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("short") == 0) {
                                    if (field.getShort(this) != field2.getShort(genericObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("char") == 0) {
                                    if (field.getChar(this) != field2.getChar(genericObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("long") == 0) {
                                    if (field.getLong(this) != field2.getLong(genericObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("boolean") == 0) {
                                    if (field.getBoolean(this) != field2.getBoolean(genericObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("double") == 0) {
                                    if (field.getDouble(this) != field2.getDouble(genericObject)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("float") == 0) {
                                    if (field.getFloat(this) != field2.getFloat(genericObject)) {
                                        return false;
                                    }
                                } else {
                                    InternalErrorHandler.handleException("unknown type");
                                }
                            } else {
                                Object obj2 = field.get(this);
                                Object obj3 = field2.get(genericObject);
                                if (obj3 != null && obj2 == null) {
                                    return false;
                                }
                                if ((obj3 != null || obj2 == null) && (obj3 != null || obj2 != null)) {
                                    if ((obj3 instanceof String) && (obj2 instanceof String)) {
                                        if (!((String) obj3).trim().equals("") && ((String) obj2).compareToIgnoreCase((String) obj3) != 0) {
                                            return false;
                                        }
                                    } else if (obj3 != null && GenericObject.isMySubclass(obj2.getClass()) && GenericObject.isMySubclass(obj3.getClass()) && obj2.getClass().equals(obj3.getClass()) && ((GenericObject) obj3).getMatcher() != null) {
                                        if (!((GenericObject) obj3).getMatcher().match(((GenericObject) obj2).encode())) {
                                            return false;
                                        }
                                    } else if (GenericObject.isMySubclass(obj2.getClass()) && !((GenericObject) obj2).match(obj3)) {
                                        return false;
                                    } else {
                                        if (GenericObjectList.isMySubclass(obj2.getClass()) && !((GenericObjectList) obj2).match(obj3)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        } catch (IllegalAccessException e10) {
                            InternalErrorHandler.handleException(e10);
                        }
                    }
                }
            }
            if (cls.equals(SIPObject.class)) {
                return true;
            }
            cls = cls.getSuperclass();
            cls2 = cls2.getSuperclass();
        }
    }

    public String toString() {
        return encode();
    }

    @Override // android.gov.nist.core.GenericObject
    public String debugDump(int i10) {
        int i11 = this.indentation;
        this.indentation = i10;
        String debugDump = debugDump();
        this.indentation = i11;
        return debugDump;
    }
}
