package kf;

import G0.C0588q;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import jf.C3959i;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public abstract class q extends AbstractC3557B {
    public static ArrayList A3(int[] iArr) {
        AbstractC3557B.c0("<this>", iArr);
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static Set B3(Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(P4.a.n0(objArr.length));
                y3(linkedHashSet, objArr);
                return linkedHashSet;
            }
            return R4.b.W1(objArr[0]);
        }
        return x.f37485Y;
    }

    public static o C3(Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        return new o(new zc.u(17, objArr));
    }

    public static ArrayList D3(Object[] objArr, Object[] objArr2) {
        AbstractC3557B.c0("<this>", objArr);
        AbstractC3557B.c0("other", objArr2);
        int min = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i10 = 0; i10 < min; i10++) {
            arrayList.add(new C3959i(objArr[i10], objArr2[i10]));
        }
        return arrayList;
    }

    public static Iterable P2(Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        if (objArr.length == 0) {
            return v.f37483Y;
        }
        return new o(0, objArr);
    }

    public static List Q2(Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        List asList = Arrays.asList(objArr);
        AbstractC3557B.b0("asList(...)", asList);
        return asList;
    }

    public static Kg.k R2(Object[] objArr) {
        if (objArr.length == 0) {
            return Kg.d.f9815a;
        }
        return new p(0, objArr);
    }

    public static boolean S2(Object obj, Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        if (o3(obj, objArr) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean T2(char[] cArr, char c10) {
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                if (i10 < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean U2(int[] iArr, int i10) {
        AbstractC3557B.c0("<this>", iArr);
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                if (i11 < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static void V2(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        AbstractC3557B.c0("<this>", iArr);
        AbstractC3557B.c0("destination", iArr2);
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
    }

    public static void W2(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        AbstractC3557B.c0("<this>", objArr);
        AbstractC3557B.c0("destination", objArr2);
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static void X2(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        AbstractC3557B.c0("<this>", bArr);
        AbstractC3557B.c0("destination", bArr2);
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static void Y2(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        AbstractC3557B.c0("<this>", cArr);
        AbstractC3557B.c0("destination", cArr2);
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
    }

    public static /* synthetic */ void Z2(int[] iArr, int[] iArr2, int i10, int i11) {
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        V2(0, 0, i10, iArr, iArr2);
    }

    public static /* synthetic */ void a3(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        W2(0, i10, i11, objArr, objArr2);
    }

    public static byte[] b3(byte[] bArr, int i10, int i11) {
        AbstractC3557B.c0("<this>", bArr);
        AbstractC3557B.n0(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        AbstractC3557B.b0("copyOfRange(...)", copyOfRange);
        return copyOfRange;
    }

    public static Object[] c3(int i10, int i11, Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        AbstractC3557B.n0(i11, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        AbstractC3557B.b0("copyOfRange(...)", copyOfRange);
        return copyOfRange;
    }

    public static void d3(int i10, int i11, Object obj, Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static void e3(int[] iArr) {
        Arrays.fill(iArr, 0, iArr.length, -1);
    }

    public static void f3(long[] jArr) {
        int length = jArr.length;
        AbstractC3557B.c0("<this>", jArr);
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static ArrayList h3(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object i3(Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object j3(Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Cf.g, Cf.e] */
    public static Cf.g k3(int[] iArr) {
        return new Cf.e(0, iArr.length - 1, 1);
    }

    public static int l3(Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        return objArr.length - 1;
    }

    public static Integer m3(int[] iArr, int i10) {
        AbstractC3557B.c0("<this>", iArr);
        if (i10 >= 0 && i10 <= iArr.length - 1) {
            return Integer.valueOf(iArr[i10]);
        }
        return null;
    }

    public static Object n3(int i10, Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        if (i10 >= 0 && i10 <= l3(objArr)) {
            return objArr[i10];
        }
        return null;
    }

    public static int o3(Object obj, Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (AbstractC3557B.K(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final void p3(Object[] objArr, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, wf.k kVar) {
        AbstractC3557B.c0("<this>", objArr);
        AbstractC3557B.c0("separator", charSequence);
        AbstractC3557B.c0("prefix", charSequence2);
        AbstractC3557B.c0("postfix", charSequence3);
        AbstractC3557B.c0("truncated", charSequence4);
        sb2.append(charSequence2);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                sb2.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            Bi.c.R(sb2, obj, kVar);
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(charSequence4);
        }
        sb2.append(charSequence3);
    }

    public static String q3(byte[] bArr, String str, wf.k kVar, int i10) {
        if ((i10 & 32) != 0) {
            kVar = null;
        }
        AbstractC3557B.c0("<this>", bArr);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            if (kVar != null) {
                sb2.append((CharSequence) kVar.invoke(Byte.valueOf(b10)));
            } else {
                sb2.append((CharSequence) String.valueOf((int) b10));
            }
        }
        sb2.append((CharSequence) "");
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public static String r3(Object[] objArr, String str, String str2, String str3, wf.k kVar, int i10) {
        String str4;
        String str5;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i10 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i10 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i10 & 32) != 0) {
            kVar = null;
        }
        AbstractC3557B.c0("<this>", objArr);
        AbstractC3557B.c0("separator", str6);
        AbstractC3557B.c0("prefix", str4);
        AbstractC3557B.c0("postfix", str5);
        StringBuilder sb2 = new StringBuilder();
        p3(objArr, sb2, str6, str4, str5, -1, "...", kVar);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public static Object s3(Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        if (objArr.length != 0) {
            return objArr[l3(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static byte[] t3(byte[] bArr, byte[] bArr2) {
        AbstractC3557B.c0("<this>", bArr);
        AbstractC3557B.c0("elements", bArr2);
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        AbstractC3557B.Z(copyOf);
        return copyOf;
    }

    public static char u3(char[] cArr) {
        AbstractC3557B.c0("<this>", cArr);
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object v3(Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        int length = objArr.length;
        if (length != 0) {
            if (length == 1) {
                return objArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static void w3(Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static List x3(Object[] objArr, C0588q c0588q) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            AbstractC3557B.b0("copyOf(...)", objArr);
            if (objArr.length > 1) {
                Arrays.sort(objArr, c0588q);
            }
        }
        return Q2(objArr);
    }

    public static final void y3(LinkedHashSet linkedHashSet, Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List z3(Object[] objArr) {
        AbstractC3557B.c0("<this>", objArr);
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new C4287l(objArr, false));
            }
            return AbstractC4344b.F0(objArr[0]);
        }
        return v.f37483Y;
    }
}
