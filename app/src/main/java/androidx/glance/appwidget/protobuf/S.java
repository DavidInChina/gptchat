package androidx.glance.appwidget.protobuf;

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

/* loaded from: classes2.dex */
public abstract class S {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f25170a;

    static {
        char[] cArr = new char[80];
        f25170a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f25170a, 0, i11);
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
                C2050j c2050j = AbstractC2049i.f25223Z;
                sb2.append(Df.H.F(new C2050j(((String) obj).getBytes(A.f25144a))));
                sb2.append('\"');
            } else if (obj instanceof AbstractC2049i) {
                sb2.append(": \"");
                sb2.append(Df.H.F((AbstractC2049i) obj));
                sb2.append('\"');
            } else if (obj instanceof AbstractC2063x) {
                sb2.append(" {");
                c((AbstractC2063x) obj, sb2, i10 + 2);
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

    public static void c(AbstractC2042b abstractC2042b, StringBuilder sb2, int i10) {
        int i11;
        boolean z10;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC2042b.getClass().getDeclaredMethods();
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
                b(sb2, i10, substring.substring(0, substring.length() - 4), AbstractC2063x.f(method2, abstractC2042b, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i10, substring.substring(0, substring.length() - 3), AbstractC2063x.f(method, abstractC2042b, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object f6 = AbstractC2063x.f(method4, abstractC2042b, new Object[0]);
                    if (method5 == null) {
                        if (f6 instanceof Boolean) {
                            z10 = !((Boolean) f6).booleanValue();
                        } else if (f6 instanceof Integer) {
                            if (((Integer) f6).intValue() == 0) {
                            }
                            b(sb2, i10, substring, f6);
                        } else if (f6 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) f6).floatValue()) == 0) {
                            }
                            b(sb2, i10, substring, f6);
                        } else if (f6 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) f6).doubleValue()) == 0) {
                            }
                            b(sb2, i10, substring, f6);
                        } else if (f6 instanceof String) {
                            z10 = f6.equals("");
                        } else if (f6 instanceof AbstractC2049i) {
                            z10 = f6.equals(AbstractC2049i.f25223Z);
                        } else if (f6 instanceof AbstractC2042b) {
                            if (f6 == ((AbstractC2063x) ((AbstractC2063x) ((AbstractC2042b) f6)).d(6))) {
                            }
                            b(sb2, i10, substring, f6);
                        } else {
                            if ((f6 instanceof Enum) && ((Enum) f6).ordinal() == 0) {
                            }
                            b(sb2, i10, substring, f6);
                        }
                        if (z10) {
                        }
                        b(sb2, i10, substring, f6);
                    } else {
                        if (!((Boolean) AbstractC2063x.f(method5, abstractC2042b, new Object[0])).booleanValue()) {
                        }
                        b(sb2, i10, substring, f6);
                    }
                }
            }
            i11 = 3;
        }
        f0 f0Var = ((AbstractC2063x) abstractC2042b).unknownFields;
        if (f0Var != null) {
            for (int i13 = 0; i13 < f0Var.f25214a; i13++) {
                b(sb2, i10, String.valueOf(f0Var.f25215b[i13] >>> 3), f0Var.f25216c[i13]);
            }
        }
    }
}
