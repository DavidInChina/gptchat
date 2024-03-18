package androidx.datastore.preferences.protobuf;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f25006a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final k0 f25007b = new Object();

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!g(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !g(b12) && !g(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw D.a();
    }

    public static boolean b(byte b10) {
        return b10 >= 0;
    }

    public static void c(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 >= -62 && !g(b11)) {
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
            return;
        }
        throw D.a();
    }

    public static void d(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!g(b11) && ((b10 != -32 || b11 >= -96) && ((b10 != -19 || b11 < -96) && !g(b12)))) {
            cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
            return;
        }
        throw D.a();
    }

    public static final String e(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static String f(AbstractC2025j abstractC2025j) {
        StringBuilder sb2 = new StringBuilder(abstractC2025j.size());
        for (int i10 = 0; i10 < abstractC2025j.size(); i10++) {
            byte f6 = abstractC2025j.f(i10);
            if (f6 != 34) {
                if (f6 != 39) {
                    if (f6 != 92) {
                        switch (f6) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (f6 >= 32 && f6 <= 126) {
                                    sb2.append((char) f6);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((f6 >>> 6) & 3) + 48));
                                    sb2.append((char) (((f6 >>> 3) & 7) + 48));
                                    sb2.append((char) ((f6 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static boolean g(byte b10) {
        return b10 > -65;
    }

    public static final void h(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                h(sb2, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                h(sb2, i10, str, entry);
            }
        } else {
            sb2.append('\n');
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                C2026k c2026k = AbstractC2025j.f25066Z;
                sb2.append(f(new C2026k(((String) obj).getBytes(B.f24959a))));
                sb2.append('\"');
            } else if (obj instanceof AbstractC2025j) {
                sb2.append(": \"");
                sb2.append(f((AbstractC2025j) obj));
                sb2.append('\"');
            } else if (obj instanceof AbstractC2040z) {
                sb2.append(" {");
                i((AbstractC2040z) obj, sb2, i10 + 2);
                sb2.append(Separators.RETURN);
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i13 = i10 + 2;
                h(sb2, i13, SubscriberAttributeKt.JSON_NAME_KEY, entry2.getKey());
                h(sb2, i13, "value", entry2.getValue());
                sb2.append(Separators.RETURN);
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    public static void i(AbstractC2011b abstractC2011b, StringBuilder sb2, int i10) {
        Method[] declaredMethods;
        boolean z10;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : abstractC2011b.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String replaceFirst = str.replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    h(sb2, i10, e(str2), AbstractC2040z.f(method2, abstractC2011b, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    h(sb2, i10, e(str3), AbstractC2040z.f(method3, abstractC2011b, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(replaceFirst))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(replaceFirst));
                Method method5 = (Method) hashMap.get("has".concat(replaceFirst));
                if (method4 != null) {
                    Object f6 = AbstractC2040z.f(method4, abstractC2011b, new Object[0]);
                    if (method5 == null) {
                        if (f6 instanceof Boolean) {
                            z10 = !((Boolean) f6).booleanValue();
                        } else if (f6 instanceof Integer) {
                            if (((Integer) f6).intValue() != 0) {
                                h(sb2, i10, e(str4), f6);
                            }
                        } else if (f6 instanceof Float) {
                            if (((Float) f6).floatValue() != 0.0f) {
                                h(sb2, i10, e(str4), f6);
                            }
                        } else if (f6 instanceof Double) {
                            if (((Double) f6).doubleValue() != 0.0d) {
                                h(sb2, i10, e(str4), f6);
                            }
                        } else if (f6 instanceof String) {
                            z10 = f6.equals("");
                        } else if (f6 instanceof AbstractC2025j) {
                            z10 = f6.equals(AbstractC2025j.f25066Z);
                        } else if (f6 instanceof AbstractC2011b) {
                            if (f6 != ((AbstractC2040z) ((AbstractC2040z) ((AbstractC2011b) f6)).d(6))) {
                                h(sb2, i10, e(str4), f6);
                            }
                        } else {
                            if ((f6 instanceof Enum) && ((Enum) f6).ordinal() == 0) {
                            }
                            h(sb2, i10, e(str4), f6);
                        }
                        if (!z10) {
                            h(sb2, i10, e(str4), f6);
                        }
                    } else if (((Boolean) AbstractC2040z.f(method5, abstractC2011b, new Object[0])).booleanValue()) {
                        h(sb2, i10, e(str4), f6);
                    }
                }
            }
        }
        o0 o0Var = ((AbstractC2040z) abstractC2011b).unknownFields;
        if (o0Var != null) {
            for (int i11 = 0; i11 < o0Var.f25095a; i11++) {
                h(sb2, i10, String.valueOf(o0Var.f25096b[i11] >>> 3), o0Var.f25097c[i11]);
            }
        }
    }

    public abstract void j(byte[] bArr, int i10, int i11);
}
