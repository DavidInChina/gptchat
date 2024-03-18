package com.google.android.gms.internal.play_billing;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.play_billing.p0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2467p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f26953a;

    static {
        char[] cArr = new char[80];
        f26953a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb2, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb2, i10, str, entry);
            }
        } else {
            sb2.append('\n');
            b(i10, sb2);
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
                sb2.append(A7.b.X1(new F(((String) obj).getBytes(Y.f26890a))));
                sb2.append('\"');
            } else if (obj instanceof E) {
                sb2.append(": \"");
                sb2.append(A7.b.X1((E) obj));
                sb2.append('\"');
            } else if (obj instanceof Q) {
                sb2.append(" {");
                c((Q) obj, sb2, i10 + 2);
                sb2.append(Separators.RETURN);
                b(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                int i12 = i10 + 2;
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                a(sb2, i12, SubscriberAttributeKt.JSON_NAME_KEY, entry2.getKey());
                a(sb2, i12, "value", entry2.getValue());
                sb2.append(Separators.RETURN);
                b(i10, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    public static void b(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f26953a, 0, i11);
            i10 -= i11;
        }
    }

    public static void c(AbstractC2481x abstractC2481x, StringBuilder sb2, int i10) {
        int i11;
        boolean z10;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC2481x.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
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
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb2, i10, substring.substring(0, substring.length() - 4), Q.g(abstractC2481x, method2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i10, substring.substring(0, substring.length() - 3), Q.g(abstractC2481x, method, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object g10 = Q.g(abstractC2481x, method4, new Object[0]);
                    if (method5 == null) {
                        if (g10 instanceof Boolean) {
                            if (!((Boolean) g10).booleanValue()) {
                            }
                            a(sb2, i10, substring, g10);
                        } else if (g10 instanceof Integer) {
                            if (((Integer) g10).intValue() == 0) {
                            }
                            a(sb2, i10, substring, g10);
                        } else if (g10 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) g10).floatValue()) == 0) {
                            }
                            a(sb2, i10, substring, g10);
                        } else if (g10 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) g10).doubleValue()) == 0) {
                            }
                            a(sb2, i10, substring, g10);
                        } else {
                            if (g10 instanceof String) {
                                z10 = g10.equals("");
                            } else if (g10 instanceof E) {
                                z10 = g10.equals(E.f26839Z);
                            } else if (g10 instanceof AbstractC2481x) {
                                if (g10 == ((Q) ((Q) ((AbstractC2481x) g10)).m(6))) {
                                }
                                a(sb2, i10, substring, g10);
                            } else {
                                if ((g10 instanceof Enum) && ((Enum) g10).ordinal() == 0) {
                                }
                                a(sb2, i10, substring, g10);
                            }
                            if (z10) {
                            }
                            a(sb2, i10, substring, g10);
                        }
                    } else {
                        if (!((Boolean) Q.g(abstractC2481x, method5, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i10, substring, g10);
                    }
                }
            }
            i11 = 3;
        }
        C0 c02 = ((Q) abstractC2481x).zzc;
        if (c02 != null) {
            for (int i13 = 0; i13 < c02.f26833a; i13++) {
                a(sb2, i10, String.valueOf(c02.f26834b[i13] >>> 3), c02.f26835c[i13]);
            }
        }
    }
}
