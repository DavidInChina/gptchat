package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class A0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f26825a;

    /* renamed from: b  reason: collision with root package name */
    public static final D0 f26826b;

    /* renamed from: c  reason: collision with root package name */
    public static final D0 f26827c;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.play_billing.D0, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        D0 d02 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f26825a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                d02 = (D0) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f26826b = d02;
        f26827c = new Object();
    }

    public static void A(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += H.E1(((Integer) list.get(i14)).intValue());
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    if (intValue >= 0) {
                        h10.x1(intValue);
                    } else {
                        h10.z1(intValue);
                    }
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                int intValue2 = ((Integer) list.get(i12)).intValue();
                h10.x1(i10 << 3);
                if (intValue2 >= 0) {
                    h10.x1(intValue2);
                } else {
                    h10.z1(intValue2);
                }
                i12++;
            }
        }
    }

    public static void B(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += H.E1(((Long) list.get(i14)).longValue());
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    h10.z1(((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                h10.y1(i10, ((Long) list.get(i12)).longValue());
                i12++;
            }
        }
    }

    public static void C(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    h10.s1(((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                h10.r1(i10, ((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
    }

    public static void a(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    h10.u1(((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                h10.t1(i10, ((Long) list.get(i12)).longValue());
                i12++;
            }
        }
    }

    public static void b(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    int intValue = ((Integer) list.get(i14)).intValue();
                    i13 += H.D1((intValue >> 31) ^ (intValue + intValue));
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    int intValue2 = ((Integer) list.get(i12)).intValue();
                    h10.x1((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                int intValue3 = ((Integer) list.get(i12)).intValue();
                h10.x1(i10 << 3);
                h10.x1((intValue3 >> 31) ^ (intValue3 + intValue3));
                i12++;
            }
        }
    }

    public static void c(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    long longValue = ((Long) list.get(i14)).longValue();
                    i13 += H.E1((longValue >> 63) ^ (longValue + longValue));
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    long longValue2 = ((Long) list.get(i12)).longValue();
                    h10.z1((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                long longValue3 = ((Long) list.get(i12)).longValue();
                h10.y1(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i12++;
            }
        }
    }

    public static void d(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += H.D1(((Integer) list.get(i14)).intValue());
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    h10.x1(((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                int intValue = ((Integer) list.get(i12)).intValue();
                h10.x1(i10 << 3);
                h10.x1(intValue);
                i12++;
            }
        }
    }

    public static void e(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += H.E1(((Long) list.get(i14)).longValue());
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    h10.z1(((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                h10.y1(i10, ((Long) list.get(i12)).longValue());
                i12++;
            }
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int g(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S) {
            S s10 = (S) list;
            i10 = 0;
            while (i11 < size) {
                s10.y(i11);
                i10 += H.E1(s10.f26879Z[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += H.E1(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (H.D1(i10 << 3) + 4) * size;
    }

    public static int i(List list) {
        return list.size() * 4;
    }

    public static int j(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (H.D1(i10 << 3) + 8) * size;
    }

    public static int k(List list) {
        return list.size() * 8;
    }

    public static int l(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S) {
            S s10 = (S) list;
            i10 = 0;
            while (i11 < size) {
                s10.y(i11);
                i10 += H.E1(s10.f26879Z[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += H.E1(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += H.E1(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static int n(int i10, AbstractC2486z0 abstractC2486z0, Object obj) {
        return H.B1((AbstractC2481x) obj, abstractC2486z0) + H.D1(i10 << 3);
    }

    public static int o(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S) {
            S s10 = (S) list;
            i10 = 0;
            while (i11 < size) {
                s10.y(i11);
                int i12 = s10.f26879Z[i11];
                i10 += H.D1((i12 >> 31) ^ (i12 + i12));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += H.D1((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long longValue = ((Long) list.get(i11)).longValue();
            i10 += H.E1((longValue >> 63) ^ (longValue + longValue));
        }
        return i10;
    }

    public static int q(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S) {
            S s10 = (S) list;
            i10 = 0;
            while (i11 < size) {
                s10.y(i11);
                i10 += H.D1(s10.f26879Z[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += H.D1(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += H.E1(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r5 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object s(Object obj, int i10, int i11, Object obj2, D0 d02) {
        C0 c02;
        if (obj2 == null) {
            d02.getClass();
            Q q10 = (Q) obj;
            C0 c03 = q10.zzc;
            c02 = c03;
            if (c03 == C0.f26832f) {
                C0 b10 = C0.b();
                q10.zzc = b10;
                c02 = b10;
            }
        }
        d02.getClass();
        ((C0) c02).c(i10 << 3, Long.valueOf(i11));
        return c02;
    }

    public static void t(D0 d02, Object obj, Object obj2) {
        d02.getClass();
        Q q10 = (Q) obj;
        C0 c02 = q10.zzc;
        C0 c03 = ((Q) obj2).zzc;
        C0 c04 = C0.f26832f;
        if (!c04.equals(c03)) {
            if (c04.equals(c02)) {
                int i10 = c02.f26833a + c03.f26833a;
                int[] copyOf = Arrays.copyOf(c02.f26834b, i10);
                System.arraycopy(c03.f26834b, 0, copyOf, c02.f26833a, c03.f26833a);
                Object[] copyOf2 = Arrays.copyOf(c02.f26835c, i10);
                System.arraycopy(c03.f26835c, 0, copyOf2, c02.f26833a, c03.f26833a);
                c02 = new C0(i10, copyOf, copyOf2, true);
            } else {
                c02.getClass();
                if (!c03.equals(c04)) {
                    if (c02.f26837e) {
                        int i11 = c02.f26833a + c03.f26833a;
                        c02.e(i11);
                        System.arraycopy(c03.f26834b, 0, c02.f26834b, c02.f26833a, c03.f26833a);
                        System.arraycopy(c03.f26835c, 0, c02.f26835c, c02.f26833a, c03.f26833a);
                        c02.f26833a = i11;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        q10.zzc = c02;
    }

    public static void u(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Boolean) list.get(i14)).getClass();
                    i13++;
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    h10.o1(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i12)).booleanValue();
                h10.x1(i10 << 3);
                h10.o1(booleanValue ? (byte) 1 : (byte) 0);
                i12++;
            }
        }
    }

    public static void v(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Double) list.get(i14)).getClass();
                    i13 += 8;
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    h10.u1(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                h10.t1(i10, Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
                i12++;
            }
        }
    }

    public static void w(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += H.E1(((Integer) list.get(i14)).intValue());
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    int intValue = ((Integer) list.get(i12)).intValue();
                    if (intValue >= 0) {
                        h10.x1(intValue);
                    } else {
                        h10.z1(intValue);
                    }
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                int intValue2 = ((Integer) list.get(i12)).intValue();
                h10.x1(i10 << 3);
                if (intValue2 >= 0) {
                    h10.x1(intValue2);
                } else {
                    h10.z1(intValue2);
                }
                i12++;
            }
        }
    }

    public static void x(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    h10.s1(((Integer) list.get(i12)).intValue());
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                h10.r1(i10, ((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
    }

    public static void y(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    h10.u1(((Long) list.get(i12)).longValue());
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                h10.t1(i10, ((Long) list.get(i12)).longValue());
                i12++;
            }
        }
    }

    public static void z(int i10, List list, I i11, boolean z10) {
        if (list != null && !list.isEmpty()) {
            H h10 = i11.f26849a;
            int i12 = 0;
            if (z10) {
                h10.w1(i10, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Float) list.get(i14)).getClass();
                    i13 += 4;
                }
                h10.x1(i13);
                while (i12 < list.size()) {
                    h10.s1(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                    i12++;
                }
                return;
            }
            while (i12 < list.size()) {
                h10.r1(i10, Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
                i12++;
            }
        }
    }
}
