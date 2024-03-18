package com.google.protobuf;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class O0 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f27457a;

    static {
        char[] cArr = new char[80];
        f27457a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f27457a, 0, i11);
            i10 -= i11;
        }
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb2, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb2, i10, str, entry);
            }
        } else {
            sb2.append('\n');
            a(i10, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(AbstractC2508h.P(AbstractC2534q.y((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof AbstractC2534q) {
                sb2.append(": \"");
                sb2.append(AbstractC2508h.P((AbstractC2534q) obj));
                sb2.append('\"');
            } else if (obj instanceof AbstractC2497d0) {
                sb2.append(" {");
                c((AbstractC2497d0) obj, sb2, i10 + 2);
                sb2.append(Separators.RETURN);
                a(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i12 = i10 + 2;
                b(sb2, i12, SubscriberAttributeKt.JSON_NAME_KEY, entry2.getKey());
                b(sb2, i12, "value", entry2.getValue());
                sb2.append(Separators.RETURN);
                a(i10, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    public static void c(M0 m02, StringBuilder sb2, int i10) {
        int i11;
        boolean z10;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = m02.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb2, i10, substring.substring(0, substring.length() - 4), AbstractC2497d0.invokeOrDie(method2, m02, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i10, substring.substring(0, substring.length() - 3), AbstractC2497d0.invokeOrDie(method, m02, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object invokeOrDie = AbstractC2497d0.invokeOrDie(method4, m02, new Object[0]);
                    if (method5 == null) {
                        if (invokeOrDie instanceof Boolean) {
                            z10 = !((Boolean) invokeOrDie).booleanValue();
                        } else if (invokeOrDie instanceof Integer) {
                            if (((Integer) invokeOrDie).intValue() == 0) {
                            }
                            b(sb2, i10, substring, invokeOrDie);
                        } else if (invokeOrDie instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) invokeOrDie).floatValue()) == 0) {
                            }
                            b(sb2, i10, substring, invokeOrDie);
                        } else if (invokeOrDie instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) invokeOrDie).doubleValue()) == 0) {
                            }
                            b(sb2, i10, substring, invokeOrDie);
                        } else if (invokeOrDie instanceof String) {
                            z10 = invokeOrDie.equals("");
                        } else if (invokeOrDie instanceof AbstractC2534q) {
                            z10 = invokeOrDie.equals(AbstractC2534q.f27581Z);
                        } else if (invokeOrDie instanceof M0) {
                            if (invokeOrDie == ((M0) invokeOrDie).getDefaultInstanceForType()) {
                            }
                            b(sb2, i10, substring, invokeOrDie);
                        } else {
                            if ((invokeOrDie instanceof java.lang.Enum) && ((java.lang.Enum) invokeOrDie).ordinal() == 0) {
                            }
                            b(sb2, i10, substring, invokeOrDie);
                        }
                        if (z10) {
                        }
                        b(sb2, i10, substring, invokeOrDie);
                    } else {
                        if (!((Boolean) AbstractC2497d0.invokeOrDie(method5, m02, new Object[0])).booleanValue()) {
                        }
                        b(sb2, i10, substring, invokeOrDie);
                    }
                }
            }
            i11 = 3;
        }
        if (m02 instanceof GeneratedMessageLite$ExtendableMessage) {
            Iterator l10 = ((GeneratedMessageLite$ExtendableMessage) m02).extensions.l();
            while (l10.hasNext()) {
                Map.Entry entry2 = (Map.Entry) l10.next();
                b(sb2, i10, android.gov.nist.core.a.l(new StringBuilder("["), ((C2488a0) entry2.getKey()).f27515Z, "]"), entry2.getValue());
            }
        }
        v1 v1Var = ((AbstractC2497d0) m02).unknownFields;
        if (v1Var != null) {
            for (int i13 = 0; i13 < v1Var.f27628a; i13++) {
                b(sb2, i10, String.valueOf(v1Var.f27629b[i13] >>> 3), v1Var.f27630c[i13]);
            }
        }
    }
}
