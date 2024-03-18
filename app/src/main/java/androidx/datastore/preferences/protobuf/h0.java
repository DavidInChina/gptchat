package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f25053a;

    /* renamed from: b  reason: collision with root package name */
    public static final p0 f25054b;

    /* renamed from: c  reason: collision with root package name */
    public static final p0 f25055c;

    /* renamed from: d  reason: collision with root package name */
    public static final p0 f25056d;

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.datastore.preferences.protobuf.p0, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f25053a = cls;
        f25054b = A(false);
        f25055c = A(true);
        f25056d = new Object();
    }

    public static p0 A(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (p0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(p0 p0Var, Object obj, Object obj2) {
        p0Var.getClass();
        AbstractC2040z abstractC2040z = (AbstractC2040z) obj;
        o0 o0Var = abstractC2040z.unknownFields;
        o0 o0Var2 = ((AbstractC2040z) obj2).unknownFields;
        if (!o0Var2.equals(o0.f25094f)) {
            int i10 = o0Var.f25095a + o0Var2.f25095a;
            int[] copyOf = Arrays.copyOf(o0Var.f25096b, i10);
            System.arraycopy(o0Var2.f25096b, 0, copyOf, o0Var.f25095a, o0Var2.f25095a);
            Object[] copyOf2 = Arrays.copyOf(o0Var.f25097c, i10);
            System.arraycopy(o0Var2.f25097c, 0, copyOf2, o0Var.f25095a, o0Var2.f25095a);
            o0Var = new o0(i10, copyOf, copyOf2, true);
        }
        abstractC2040z.unknownFields = o0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static void D(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).getClass();
                    Logger logger = AbstractC2031p.f25100d;
                    i12++;
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    ((AbstractC2031p) aVar.f8729Y).I(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2031p) aVar.f8729Y).J(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static void E(int i10, List list, J0.a aVar) {
        if (list != null && !list.isEmpty()) {
            aVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((AbstractC2031p) aVar.f8729Y).L(i10, (AbstractC2025j) list.get(i11));
            }
        }
    }

    public static void F(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).getClass();
                    Logger logger = AbstractC2031p.f25100d;
                    i12 += 8;
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    AbstractC2031p abstractC2031p = (AbstractC2031p) aVar.f8729Y;
                    double doubleValue = ((Double) list.get(i11)).doubleValue();
                    abstractC2031p.getClass();
                    abstractC2031p.Q(Double.doubleToRawLongBits(doubleValue));
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                AbstractC2031p abstractC2031p2 = (AbstractC2031p) aVar.f8729Y;
                double doubleValue2 = ((Double) list.get(i11)).doubleValue();
                abstractC2031p2.getClass();
                abstractC2031p2.P(i10, Double.doubleToRawLongBits(doubleValue2));
                i11++;
            }
        }
    }

    public static void G(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2031p.u(((Integer) list.get(i13)).intValue());
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    ((AbstractC2031p) aVar.f8729Y).S(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2031p) aVar.f8729Y).R(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void H(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    Logger logger = AbstractC2031p.f25100d;
                    i12 += 4;
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    ((AbstractC2031p) aVar.f8729Y).O(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2031p) aVar.f8729Y).N(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void I(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).getClass();
                    Logger logger = AbstractC2031p.f25100d;
                    i12 += 8;
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    ((AbstractC2031p) aVar.f8729Y).Q(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2031p) aVar.f8729Y).P(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void J(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).getClass();
                    Logger logger = AbstractC2031p.f25100d;
                    i12 += 4;
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    AbstractC2031p abstractC2031p = (AbstractC2031p) aVar.f8729Y;
                    float floatValue = ((Float) list.get(i11)).floatValue();
                    abstractC2031p.getClass();
                    abstractC2031p.O(Float.floatToRawIntBits(floatValue));
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                AbstractC2031p abstractC2031p2 = (AbstractC2031p) aVar.f8729Y;
                float floatValue2 = ((Float) list.get(i11)).floatValue();
                abstractC2031p2.getClass();
                abstractC2031p2.N(i10, Float.floatToRawIntBits(floatValue2));
                i11++;
            }
        }
    }

    public static void K(int i10, List list, J0.a aVar, AbstractC2022g0 abstractC2022g0) {
        if (list != null && !list.isEmpty()) {
            aVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                aVar.a0(i10, abstractC2022g0, list.get(i11));
            }
        }
    }

    public static void L(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2031p.u(((Integer) list.get(i13)).intValue());
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    ((AbstractC2031p) aVar.f8729Y).S(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2031p) aVar.f8729Y).R(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void M(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2031p.G(((Long) list.get(i13)).longValue());
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    ((AbstractC2031p) aVar.f8729Y).b0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2031p) aVar.f8729Y).a0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void N(int i10, List list, J0.a aVar, AbstractC2022g0 abstractC2022g0) {
        if (list != null && !list.isEmpty()) {
            aVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                aVar.d0(i10, abstractC2022g0, list.get(i11));
            }
        }
    }

    public static void O(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    Logger logger = AbstractC2031p.f25100d;
                    i12 += 4;
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    ((AbstractC2031p) aVar.f8729Y).O(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2031p) aVar.f8729Y).N(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void P(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).getClass();
                    Logger logger = AbstractC2031p.f25100d;
                    i12 += 8;
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    ((AbstractC2031p) aVar.f8729Y).Q(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2031p) aVar.f8729Y).P(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void Q(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += AbstractC2031p.E((intValue >> 31) ^ (intValue << 1));
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    ((AbstractC2031p) aVar.f8729Y).Z((intValue2 >> 31) ^ (intValue2 << 1));
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                ((AbstractC2031p) aVar.f8729Y).Y(i10, (intValue3 >> 31) ^ (intValue3 << 1));
                i11++;
            }
        }
    }

    public static void R(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += AbstractC2031p.G((longValue >> 63) ^ (longValue << 1));
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    ((AbstractC2031p) aVar.f8729Y).b0((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                long longValue3 = ((Long) list.get(i11)).longValue();
                ((AbstractC2031p) aVar.f8729Y).a0(i10, (longValue3 >> 63) ^ (longValue3 << 1));
                i11++;
            }
        }
    }

    public static void S(int i10, List list, J0.a aVar) {
        if (list != null && !list.isEmpty()) {
            aVar.getClass();
            int i11 = 0;
            if (list instanceof H) {
                H h10 = (H) list;
                while (i11 < list.size()) {
                    Object j6 = h10.j(i11);
                    if (j6 instanceof String) {
                        ((AbstractC2031p) aVar.f8729Y).V(i10, (String) j6);
                    } else {
                        ((AbstractC2031p) aVar.f8729Y).L(i10, (AbstractC2025j) j6);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                ((AbstractC2031p) aVar.f8729Y).V(i10, (String) list.get(i11));
                i11++;
            }
        }
    }

    public static void T(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2031p.E(((Integer) list.get(i13)).intValue());
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    ((AbstractC2031p) aVar.f8729Y).Z(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2031p) aVar.f8729Y).Y(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void U(int i10, List list, J0.a aVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2031p) aVar.f8729Y).X(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2031p.G(((Long) list.get(i13)).longValue());
                }
                ((AbstractC2031p) aVar.f8729Y).Z(i12);
                while (i11 < list.size()) {
                    ((AbstractC2031p) aVar.f8729Y).b0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            aVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2031p) aVar.f8729Y).a0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC2031p.k(i10) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int C10 = AbstractC2031p.C(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C10 += AbstractC2031p.m((AbstractC2025j) list.get(i11));
        }
        return C10;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2031p.C(i10) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2031p.u(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC2031p.p(i10) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC2031p.q(i10) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i10, List list, AbstractC2022g0 abstractC2022g0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC2031p.s(i10, (AbstractC2011b) list.get(i12), abstractC2022g0);
        }
        return i11;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2031p.C(i10) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2031p.u(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC2031p.C(i10) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2031p.G(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static int o(int i10, AbstractC2022g0 abstractC2022g0, Object obj) {
        int C10 = AbstractC2031p.C(i10);
        int b10 = ((AbstractC2011b) obj).b(abstractC2022g0);
        return AbstractC2031p.E(b10) + b10 + C10;
    }

    public static int p(int i10, List list, AbstractC2022g0 abstractC2022g0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int C10 = AbstractC2031p.C(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int b10 = ((AbstractC2011b) list.get(i11)).b(abstractC2022g0);
            C10 += AbstractC2031p.E(b10) + b10;
        }
        return C10;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2031p.C(i10) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int intValue = ((Integer) list.get(i11)).intValue();
            i10 += AbstractC2031p.E((intValue >> 31) ^ (intValue << 1));
        }
        return i10;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2031p.C(i10) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            long longValue = ((Long) list.get(i11)).longValue();
            i10 += AbstractC2031p.G((longValue >> 63) ^ (longValue << 1));
        }
        return i10;
    }

    public static int u(int i10, List list) {
        int B10;
        int B11;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int C10 = AbstractC2031p.C(i10) * size;
        if (list instanceof H) {
            H h10 = (H) list;
            while (i11 < size) {
                Object j6 = h10.j(i11);
                if (j6 instanceof AbstractC2025j) {
                    B11 = AbstractC2031p.m((AbstractC2025j) j6);
                } else {
                    B11 = AbstractC2031p.B((String) j6);
                }
                C10 = B11 + C10;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof AbstractC2025j) {
                    B10 = AbstractC2031p.m((AbstractC2025j) obj);
                } else {
                    B10 = AbstractC2031p.B((String) obj);
                }
                C10 = B10 + C10;
                i11++;
            }
        }
        return C10;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2031p.C(i10) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2031p.E(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2031p.C(i10) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += AbstractC2031p.G(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    public static Object z(int i10, List list, Object obj, p0 p0Var) {
        return obj;
    }
}
