package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f25203a;

    /* renamed from: b  reason: collision with root package name */
    public static final g0 f25204b;

    /* renamed from: c  reason: collision with root package name */
    public static final g0 f25205c;

    /* renamed from: d  reason: collision with root package name */
    public static final g0 f25206d;

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.glance.appwidget.protobuf.g0, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f25203a = cls;
        f25204b = A(false);
        f25205c = A(true);
        f25206d = new Object();
    }

    public static g0 A(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (g0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(g0 g0Var, Object obj, Object obj2) {
        g0Var.getClass();
        AbstractC2063x abstractC2063x = (AbstractC2063x) obj;
        f0 f0Var = abstractC2063x.unknownFields;
        f0 f0Var2 = ((AbstractC2063x) obj2).unknownFields;
        f0 f0Var3 = f0.f25213f;
        if (!f0Var3.equals(f0Var2)) {
            if (f0Var3.equals(f0Var)) {
                int i10 = f0Var.f25214a + f0Var2.f25214a;
                int[] copyOf = Arrays.copyOf(f0Var.f25215b, i10);
                System.arraycopy(f0Var2.f25215b, 0, copyOf, f0Var.f25214a, f0Var2.f25214a);
                Object[] copyOf2 = Arrays.copyOf(f0Var.f25216c, i10);
                System.arraycopy(f0Var2.f25216c, 0, copyOf2, f0Var.f25214a, f0Var2.f25214a);
                f0Var = new f0(i10, copyOf, copyOf2, true);
            } else {
                f0Var.getClass();
                if (!f0Var2.equals(f0Var3)) {
                    if (f0Var.f25218e) {
                        int i11 = f0Var.f25214a + f0Var2.f25214a;
                        f0Var.a(i11);
                        System.arraycopy(f0Var2.f25215b, 0, f0Var.f25215b, f0Var.f25214a, f0Var2.f25214a);
                        System.arraycopy(f0Var2.f25216c, 0, f0Var.f25216c, f0Var.f25214a, f0Var2.f25214a);
                        f0Var.f25214a = i11;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC2063x.unknownFields = f0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static void D(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).getClass();
                    Logger logger = AbstractC2055o.f25260i;
                    i12++;
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    ((AbstractC2055o) aVar.f5033Z).s2(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2055o) aVar.f5033Z).t2(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static void E(int i10, List list, F4.a aVar) {
        if (list != null && !list.isEmpty()) {
            aVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((AbstractC2055o) aVar.f5033Z).u2(i10, (AbstractC2049i) list.get(i11));
            }
        }
    }

    public static void F(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).getClass();
                    Logger logger = AbstractC2055o.f25260i;
                    i12 += 8;
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    AbstractC2055o abstractC2055o = (AbstractC2055o) aVar.f5033Z;
                    double doubleValue = ((Double) list.get(i11)).doubleValue();
                    abstractC2055o.getClass();
                    abstractC2055o.y2(Double.doubleToRawLongBits(doubleValue));
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                AbstractC2055o abstractC2055o2 = (AbstractC2055o) aVar.f5033Z;
                double doubleValue2 = ((Double) list.get(i11)).doubleValue();
                abstractC2055o2.getClass();
                abstractC2055o2.x2(i10, Double.doubleToRawLongBits(doubleValue2));
                i11++;
            }
        }
    }

    public static void G(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2055o.e2(((Integer) list.get(i13)).intValue());
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    ((AbstractC2055o) aVar.f5033Z).A2(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2055o) aVar.f5033Z).z2(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void H(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    Logger logger = AbstractC2055o.f25260i;
                    i12 += 4;
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    ((AbstractC2055o) aVar.f5033Z).w2(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2055o) aVar.f5033Z).v2(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void I(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).getClass();
                    Logger logger = AbstractC2055o.f25260i;
                    i12 += 8;
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    ((AbstractC2055o) aVar.f5033Z).y2(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2055o) aVar.f5033Z).x2(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void J(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).getClass();
                    Logger logger = AbstractC2055o.f25260i;
                    i12 += 4;
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    AbstractC2055o abstractC2055o = (AbstractC2055o) aVar.f5033Z;
                    float floatValue = ((Float) list.get(i11)).floatValue();
                    abstractC2055o.getClass();
                    abstractC2055o.w2(Float.floatToRawIntBits(floatValue));
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                AbstractC2055o abstractC2055o2 = (AbstractC2055o) aVar.f5033Z;
                float floatValue2 = ((Float) list.get(i11)).floatValue();
                abstractC2055o2.getClass();
                abstractC2055o2.v2(i10, Float.floatToRawIntBits(floatValue2));
                i11++;
            }
        }
    }

    public static void K(int i10, List list, F4.a aVar, b0 b0Var) {
        if (list != null && !list.isEmpty()) {
            aVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                aVar.y(i10, b0Var, list.get(i11));
            }
        }
    }

    public static void L(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2055o.e2(((Integer) list.get(i13)).intValue());
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    ((AbstractC2055o) aVar.f5033Z).A2(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2055o) aVar.f5033Z).z2(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void M(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2055o.q2(((Long) list.get(i13)).longValue());
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    ((AbstractC2055o) aVar.f5033Z).H2(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2055o) aVar.f5033Z).G2(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void N(int i10, List list, F4.a aVar, b0 b0Var) {
        if (list != null && !list.isEmpty()) {
            aVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                aVar.B(i10, b0Var, list.get(i11));
            }
        }
    }

    public static void O(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    Logger logger = AbstractC2055o.f25260i;
                    i12 += 4;
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    ((AbstractC2055o) aVar.f5033Z).w2(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2055o) aVar.f5033Z).v2(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void P(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).getClass();
                    Logger logger = AbstractC2055o.f25260i;
                    i12 += 8;
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    ((AbstractC2055o) aVar.f5033Z).y2(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2055o) aVar.f5033Z).x2(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void Q(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += AbstractC2055o.o2((intValue >> 31) ^ (intValue << 1));
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    ((AbstractC2055o) aVar.f5033Z).F2((intValue2 >> 31) ^ (intValue2 << 1));
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                ((AbstractC2055o) aVar.f5033Z).E2(i10, (intValue3 >> 31) ^ (intValue3 << 1));
                i11++;
            }
        }
    }

    public static void R(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += AbstractC2055o.q2((longValue >> 63) ^ (longValue << 1));
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    ((AbstractC2055o) aVar.f5033Z).H2((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                long longValue3 = ((Long) list.get(i11)).longValue();
                ((AbstractC2055o) aVar.f5033Z).G2(i10, (longValue3 >> 63) ^ (longValue3 << 1));
                i11++;
            }
        }
    }

    public static void S(int i10, List list, F4.a aVar) {
        if (list != null && !list.isEmpty()) {
            aVar.getClass();
            int i11 = 0;
            if (list instanceof F) {
                F f6 = (F) list;
                while (i11 < list.size()) {
                    Object j6 = f6.j(i11);
                    if (j6 instanceof String) {
                        ((AbstractC2055o) aVar.f5033Z).C2(i10, (String) j6);
                    } else {
                        ((AbstractC2055o) aVar.f5033Z).u2(i10, (AbstractC2049i) j6);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                ((AbstractC2055o) aVar.f5033Z).C2(i10, (String) list.get(i11));
                i11++;
            }
        }
    }

    public static void T(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2055o.o2(((Integer) list.get(i13)).intValue());
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    ((AbstractC2055o) aVar.f5033Z).F2(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2055o) aVar.f5033Z).E2(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void U(int i10, List list, F4.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2055o) aVar.f5033Z).D2(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2055o.q2(((Long) list.get(i13)).longValue());
                }
                ((AbstractC2055o) aVar.f5033Z).F2(i12);
                while (i11 < list.size()) {
                    ((AbstractC2055o) aVar.f5033Z).H2(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2055o) aVar.f5033Z).G2(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC2055o.U1(i10) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m22 = AbstractC2055o.m2(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            m22 += AbstractC2055o.W1((AbstractC2049i) list.get(i11));
        }
        return m22;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2055o.m2(i10) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2055o.e2(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC2055o.Z1(i10) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC2055o.a2(i10) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i10, List list, b0 b0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC2055o.c2(i10, (AbstractC2042b) list.get(i12), b0Var);
        }
        return i11;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2055o.m2(i10) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2055o.e2(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC2055o.m2(i10) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2055o.q2(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static int o(int i10, b0 b0Var, Object obj) {
        int m22 = AbstractC2055o.m2(i10);
        int a5 = ((AbstractC2042b) obj).a(b0Var);
        return AbstractC2055o.o2(a5) + a5 + m22;
    }

    public static int p(int i10, List list, b0 b0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m22 = AbstractC2055o.m2(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int a5 = ((AbstractC2042b) list.get(i11)).a(b0Var);
            m22 += AbstractC2055o.o2(a5) + a5;
        }
        return m22;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2055o.m2(i10) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int intValue = ((Integer) list.get(i11)).intValue();
            i10 += AbstractC2055o.o2((intValue >> 31) ^ (intValue << 1));
        }
        return i10;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2055o.m2(i10) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long longValue = ((Long) list.get(i11)).longValue();
            i10 += AbstractC2055o.q2((longValue >> 63) ^ (longValue << 1));
        }
        return i10;
    }

    public static int u(int i10, List list) {
        int l22;
        int l23;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int m22 = AbstractC2055o.m2(i10) * size;
        if (list instanceof F) {
            F f6 = (F) list;
            while (i11 < size) {
                Object j6 = f6.j(i11);
                if (j6 instanceof AbstractC2049i) {
                    l23 = AbstractC2055o.W1((AbstractC2049i) j6);
                } else {
                    l23 = AbstractC2055o.l2((String) j6);
                }
                m22 = l23 + m22;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof AbstractC2049i) {
                    l22 = AbstractC2055o.W1((AbstractC2049i) obj);
                } else {
                    l22 = AbstractC2055o.l2((String) obj);
                }
                m22 = l22 + m22;
                i11++;
            }
        }
        return m22;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2055o.m2(i10) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2055o.o2(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2055o.m2(i10) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2055o.q2(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static Object z(Object obj, int i10, List list, Object obj2, g0 g0Var) {
        return obj2;
    }
}
