package android.gov.nist.core;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class GenericObject implements Serializable, Cloneable {
    protected static final String AND = "&";
    protected static final String AT = "@";
    protected static final String COLON = ":";
    protected static final String COMMA = ",";
    protected static final String DOT = ".";
    protected static final String DOUBLE_QUOTE = "\"";
    protected static final String EQUALS = "=";
    protected static final String GREATER_THAN = ">";
    protected static final String HT = "\t";
    protected static final String LESS_THAN = "<";
    protected static final String LPAREN = "(";
    protected static final String NEWLINE = "\r\n";
    protected static final String PERCENT = "%";
    protected static final String POUND = "#";
    protected static final String QUESTION = "?";
    protected static final String QUOTE = "'";
    protected static final String RETURN = "\n";
    protected static final String RPAREN = ")";
    protected static final String SEMICOLON = ";";
    protected static final String SLASH = "/";
    protected static final String SP = " ";
    protected static final String STAR = "*";
    protected Match matchExpression;
    protected static final Set<Class<?>> immutableClasses = new HashSet(10);
    static final String[] immutableClassNames = {"String", "Character", "Boolean", "Byte", "Short", "Integer", "Long", "Float", "Double"};
    protected int indentation = 0;
    protected String stringRepresentation = "";

    static {
        String[] strArr;
        int i10 = 0;
        while (true) {
            try {
                if (i10 < immutableClassNames.length) {
                    immutableClasses.add(Class.forName("java.lang." + strArr[i10]));
                    i10++;
                } else {
                    return;
                }
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("Internal error", e10);
            }
        }
    }

    public static Class<?> getClassFromName(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e10) {
            InternalErrorHandler.handleException(e10);
            return null;
        }
    }

    public static boolean isMySubclass(Class<?> cls) {
        return GenericObject.class.isAssignableFrom(cls);
    }

    public static Object makeClone(Object obj) {
        Object obj2;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (immutableClasses.contains(cls)) {
                return obj;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (!componentType.isPrimitive()) {
                    return ((Object[]) obj).clone();
                }
                if (componentType == Character.TYPE) {
                    obj2 = ((char[]) obj).clone();
                } else if (componentType == Boolean.TYPE) {
                    obj2 = ((boolean[]) obj).clone();
                } else {
                    obj2 = obj;
                }
                if (componentType == Byte.TYPE) {
                    return ((byte[]) obj).clone();
                }
                if (componentType == Short.TYPE) {
                    return ((short[]) obj).clone();
                }
                if (componentType == Integer.TYPE) {
                    return ((int[]) obj).clone();
                }
                if (componentType == Long.TYPE) {
                    return ((long[]) obj).clone();
                }
                if (componentType == Float.TYPE) {
                    return ((float[]) obj).clone();
                }
                if (componentType == Double.TYPE) {
                    return ((double[]) obj).clone();
                }
                return obj2;
            } else if (GenericObject.class.isAssignableFrom(cls)) {
                return ((GenericObject) obj).clone();
            } else {
                if (GenericObjectList.class.isAssignableFrom(cls)) {
                    return ((GenericObjectList) obj).clone();
                }
                if (Cloneable.class.isAssignableFrom(cls)) {
                    try {
                        return cls.getMethod("clone", null).invoke(obj, null);
                    } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
                        return obj;
                    } catch (IllegalArgumentException e10) {
                        InternalErrorHandler.handleException(e10);
                        return obj;
                    }
                }
                return obj;
            }
        }
        throw new NullPointerException("null obj!");
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException("Internal error");
        }
    }

    public void dbgPrint() {
        Debug.println(debugDump());
    }

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
                    } catch (Exception e10) {
                        InternalErrorHandler.handleException(e10);
                    }
                }
            }
        }
        sprint("}");
        return this.stringRepresentation;
    }

    public abstract String encode();

    public StringBuilder encode(StringBuilder sb2) {
        sb2.append(encode());
        return sb2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
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
                                    if (field.getInt(this) != field2.getInt(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("short") == 0) {
                                    if (field.getShort(this) != field2.getShort(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("char") == 0) {
                                    if (field.getChar(this) != field2.getChar(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("long") == 0) {
                                    if (field.getLong(this) != field2.getLong(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("boolean") == 0) {
                                    if (field.getBoolean(this) != field2.getBoolean(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("double") == 0) {
                                    if (field.getDouble(this) != field2.getDouble(obj)) {
                                        return false;
                                    }
                                } else if (cls3.compareTo("float") == 0 && field.getFloat(this) != field2.getFloat(obj)) {
                                    return false;
                                }
                            } else if (field2.get(obj) == field.get(this)) {
                                return true;
                            } else {
                                if (field.get(this) == null || field2.get(obj) == null) {
                                    return false;
                                }
                                if ((field2.get(obj) == null && field.get(this) != null) || !field.get(this).equals(field2.get(obj))) {
                                    return false;
                                }
                            }
                        } catch (IllegalAccessException e10) {
                            InternalErrorHandler.handleException(e10);
                        }
                    }
                }
            }
            if (cls.equals(GenericObject.class)) {
                return true;
            }
            cls = cls.getSuperclass();
            cls2 = cls2.getSuperclass();
        }
    }

    public String getIndentation() {
        char[] cArr = new char[this.indentation];
        Arrays.fill(cArr, ' ');
        return new String(cArr);
    }

    public Match getMatcher() {
        return this.matchExpression;
    }

    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        GenericObject genericObject = (GenericObject) obj;
        Field[] declaredFields = getClass().getDeclaredFields();
        Field[] declaredFields2 = obj.getClass().getDeclaredFields();
        for (int i10 = 0; i10 < declaredFields.length; i10++) {
            Field field = declaredFields[i10];
            Field field2 = declaredFields2[i10];
            if ((field.getModifiers() & 2) != 2) {
                Class<?> type = field.getType();
                String name = field.getName();
                if (name.compareTo("stringRepresentation") != 0 && name.compareTo("indentation") != 0) {
                    try {
                        if (type.isPrimitive()) {
                            String cls = type.toString();
                            if (cls.compareTo("int") == 0) {
                                if (field.getInt(this) != field2.getInt(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("short") == 0) {
                                if (field.getShort(this) != field2.getShort(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("char") == 0) {
                                if (field.getChar(this) != field2.getChar(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("long") == 0) {
                                if (field.getLong(this) != field2.getLong(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("boolean") == 0) {
                                if (field.getBoolean(this) != field2.getBoolean(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("double") == 0) {
                                if (field.getDouble(this) != field2.getDouble(genericObject)) {
                                    return false;
                                }
                            } else if (cls.compareTo("float") == 0 && field.getFloat(this) != field2.getFloat(genericObject)) {
                                return false;
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
                                } else if (isMySubclass(obj2.getClass()) && !((GenericObject) obj2).match(obj3)) {
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
        return true;
    }

    public void merge(Object obj) {
        Field[] declaredFields;
        if (obj == null) {
            return;
        }
        if (obj.getClass().equals(getClass())) {
            Class<?> cls = getClass();
            do {
                for (Field field : cls.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if (!Modifier.isPrivate(modifiers) && !Modifier.isStatic(modifiers) && !Modifier.isInterface(modifiers)) {
                        Class<?> type = field.getType();
                        String cls2 = type.toString();
                        try {
                            if (type.isPrimitive()) {
                                if (cls2.compareTo("int") == 0) {
                                    field.setInt(this, field.getInt(obj));
                                } else if (cls2.compareTo("short") == 0) {
                                    field.setShort(this, field.getShort(obj));
                                } else if (cls2.compareTo("char") == 0) {
                                    field.setChar(this, field.getChar(obj));
                                } else if (cls2.compareTo("long") == 0) {
                                    field.setLong(this, field.getLong(obj));
                                } else if (cls2.compareTo("boolean") == 0) {
                                    field.setBoolean(this, field.getBoolean(obj));
                                } else if (cls2.compareTo("double") == 0) {
                                    field.setDouble(this, field.getDouble(obj));
                                } else if (cls2.compareTo("float") == 0) {
                                    field.setFloat(this, field.getFloat(obj));
                                }
                            } else {
                                Object obj2 = field.get(this);
                                Object obj3 = field.get(obj);
                                if (obj3 != null) {
                                    if (obj2 == null) {
                                        field.set(this, obj3);
                                    } else if (obj2 instanceof GenericObject) {
                                        ((GenericObject) obj2).merge(obj3);
                                    } else {
                                        field.set(this, obj3);
                                    }
                                }
                            }
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        }
                    }
                }
                cls = cls.getSuperclass();
            } while (!cls.equals(GenericObject.class));
            return;
        }
        throw new IllegalArgumentException("Bad override object");
    }

    public void setMatcher(Match match) {
        if (match != null) {
            this.matchExpression = match;
            return;
        }
        throw new IllegalArgumentException("null arg!");
    }

    public void sprint(String str) {
        if (str == null) {
            this.stringRepresentation += getIndentation();
            this.stringRepresentation = R.a.t(new StringBuilder(), this.stringRepresentation, "<null>\n");
            return;
        }
        if (str.compareTo("}") == 0 || str.compareTo("]") == 0) {
            this.indentation--;
        }
        this.stringRepresentation += getIndentation();
        this.stringRepresentation = R.a.t(new StringBuilder(), this.stringRepresentation, str);
        this.stringRepresentation = R.a.t(new StringBuilder(), this.stringRepresentation, "\n");
        if (str.compareTo("{") != 0 && str.compareTo("[") != 0) {
            return;
        }
        this.indentation++;
    }

    public void dbgPrint(String str) {
        Debug.println(str);
    }

    public void sprint(Object obj) {
        sprint(obj.toString());
    }

    public void sprint(int i10) {
        sprint(String.valueOf(i10));
    }

    public void sprint(short s10) {
        sprint(String.valueOf((int) s10));
    }

    public void sprint(char c10) {
        sprint(String.valueOf(c10));
    }

    public void sprint(long j6) {
        sprint(String.valueOf(j6));
    }

    public void sprint(boolean z10) {
        sprint(String.valueOf(z10));
    }

    public void sprint(double d10) {
        sprint(String.valueOf(d10));
    }

    public void sprint(float f6) {
        sprint(String.valueOf(f6));
    }

    public String debugDump(int i10) {
        this.indentation = i10;
        String debugDump = debugDump();
        this.indentation = 0;
        return debugDump;
    }
}
