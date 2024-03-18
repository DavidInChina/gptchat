package com.google.protobuf;

import java.util.AbstractList;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.g1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2507g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f27547a;

    /* renamed from: b  reason: collision with root package name */
    public static final w1 f27548b;

    /* renamed from: c  reason: collision with root package name */
    public static final w1 f27549c;

    /* renamed from: d  reason: collision with root package name */
    public static final w1 f27550d;

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.w1, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f27547a = cls;
        f27548b = B(false);
        f27549c = B(true);
        f27550d = new Object();
    }

    public static Object A(Object obj, int i10, List list, Object obj2, w1 w1Var) {
        return obj2;
    }

    public static w1 B(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (w1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void C(w1 w1Var, Object obj, Object obj2) {
        w1Var.getClass();
        AbstractC2497d0 abstractC2497d0 = (AbstractC2497d0) obj;
        v1 v1Var = abstractC2497d0.unknownFields;
        v1 v1Var2 = ((AbstractC2497d0) obj2).unknownFields;
        v1 v1Var3 = v1.f27627f;
        if (!v1Var3.equals(v1Var2)) {
            if (v1Var3.equals(v1Var)) {
                v1Var = v1.e(v1Var, v1Var2);
            } else {
                v1Var.getClass();
                if (!v1Var2.equals(v1Var3)) {
                    v1Var.a();
                    int i10 = v1Var.f27628a + v1Var2.f27628a;
                    v1Var.b(i10);
                    System.arraycopy(v1Var2.f27629b, 0, v1Var.f27629b, v1Var.f27628a, v1Var2.f27628a);
                    System.arraycopy(v1Var2.f27630c, 0, v1Var.f27630c, v1Var.f27628a, v1Var2.f27628a);
                    v1Var.f27628a = i10;
                }
            }
        }
        abstractC2497d0.unknownFields = v1Var;
    }

    public static boolean D(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static Object E(Object obj, int i10, int i11, Object obj2, w1 w1Var) {
        if (obj2 == null) {
            w1Var.getClass();
            obj2 = w1.a(obj);
        }
        w1Var.getClass();
        ((v1) obj2).f(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void F(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).getClass();
                    Logger logger = AbstractC2549y.f27642d;
                    i12++;
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    ((AbstractC2549y) oVar.f16184Z).v0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2549y) oVar.f16184Z).w0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static void G(int i10, List list, S4.o oVar) {
        if (list != null && !list.isEmpty()) {
            oVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((AbstractC2549y) oVar.f16184Z).y0(i10, (AbstractC2534q) list.get(i11));
            }
        }
    }

    public static void H(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).getClass();
                    Logger logger = AbstractC2549y.f27642d;
                    i12 += 8;
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    AbstractC2549y abstractC2549y = (AbstractC2549y) oVar.f16184Z;
                    double doubleValue = ((Double) list.get(i11)).doubleValue();
                    abstractC2549y.getClass();
                    abstractC2549y.D0(Double.doubleToRawLongBits(doubleValue));
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                AbstractC2549y abstractC2549y2 = (AbstractC2549y) oVar.f16184Z;
                double doubleValue2 = ((Double) list.get(i11)).doubleValue();
                abstractC2549y2.getClass();
                abstractC2549y2.C0(i10, Double.doubleToRawLongBits(doubleValue2));
                i11++;
            }
        }
    }

    public static void I(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2549y.g0(((Integer) list.get(i13)).intValue());
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    ((AbstractC2549y) oVar.f16184Z).F0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2549y) oVar.f16184Z).E0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void J(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    Logger logger = AbstractC2549y.f27642d;
                    i12 += 4;
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    ((AbstractC2549y) oVar.f16184Z).B0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2549y) oVar.f16184Z).A0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void K(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).getClass();
                    Logger logger = AbstractC2549y.f27642d;
                    i12 += 8;
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    ((AbstractC2549y) oVar.f16184Z).D0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2549y) oVar.f16184Z).C0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void L(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).getClass();
                    Logger logger = AbstractC2549y.f27642d;
                    i12 += 4;
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    AbstractC2549y abstractC2549y = (AbstractC2549y) oVar.f16184Z;
                    float floatValue = ((Float) list.get(i11)).floatValue();
                    abstractC2549y.getClass();
                    abstractC2549y.B0(Float.floatToRawIntBits(floatValue));
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                AbstractC2549y abstractC2549y2 = (AbstractC2549y) oVar.f16184Z;
                float floatValue2 = ((Float) list.get(i11)).floatValue();
                abstractC2549y2.getClass();
                abstractC2549y2.A0(i10, Float.floatToRawIntBits(floatValue2));
                i11++;
            }
        }
    }

    public static void M(int i10, List list, S4.o oVar, AbstractC2504f1 abstractC2504f1) {
        if (list != null && !list.isEmpty()) {
            oVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                oVar.x(i10, abstractC2504f1, list.get(i11));
            }
        }
    }

    public static void N(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2549y.g0(((Integer) list.get(i13)).intValue());
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    ((AbstractC2549y) oVar.f16184Z).F0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2549y) oVar.f16184Z).E0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void O(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2549y.s0(((Long) list.get(i13)).longValue());
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    ((AbstractC2549y) oVar.f16184Z).Q0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2549y) oVar.f16184Z).P0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void P(int i10, List list, S4.o oVar, AbstractC2504f1 abstractC2504f1) {
        if (list != null && !list.isEmpty()) {
            oVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                oVar.A(i10, abstractC2504f1, list.get(i11));
            }
        }
    }

    public static void Q(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).getClass();
                    Logger logger = AbstractC2549y.f27642d;
                    i12 += 4;
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    ((AbstractC2549y) oVar.f16184Z).B0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2549y) oVar.f16184Z).A0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void R(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).getClass();
                    Logger logger = AbstractC2549y.f27642d;
                    i12 += 8;
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    ((AbstractC2549y) oVar.f16184Z).D0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2549y) oVar.f16184Z).C0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void S(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += AbstractC2549y.q0((intValue >> 31) ^ (intValue << 1));
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    ((AbstractC2549y) oVar.f16184Z).O0((intValue2 >> 31) ^ (intValue2 << 1));
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                ((AbstractC2549y) oVar.f16184Z).N0(i10, (intValue3 >> 31) ^ (intValue3 << 1));
                i11++;
            }
        }
    }

    public static void T(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += AbstractC2549y.s0((longValue >> 63) ^ (longValue << 1));
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    ((AbstractC2549y) oVar.f16184Z).Q0((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                long longValue3 = ((Long) list.get(i11)).longValue();
                ((AbstractC2549y) oVar.f16184Z).P0(i10, (longValue3 >> 63) ^ (longValue3 << 1));
                i11++;
            }
        }
    }

    public static void U(int i10, List list, S4.o oVar) {
        if (list != null && !list.isEmpty()) {
            oVar.getClass();
            int i11 = 0;
            if (list instanceof AbstractC2546w0) {
                AbstractC2546w0 abstractC2546w0 = (AbstractC2546w0) list;
                while (i11 < list.size()) {
                    Object j6 = abstractC2546w0.j(i11);
                    if (j6 instanceof String) {
                        ((AbstractC2549y) oVar.f16184Z).K0(i10, (String) j6);
                    } else {
                        ((AbstractC2549y) oVar.f16184Z).y0(i10, (AbstractC2534q) j6);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                ((AbstractC2549y) oVar.f16184Z).K0(i10, (String) list.get(i11));
                i11++;
            }
        }
    }

    public static void V(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2549y.q0(((Integer) list.get(i13)).intValue());
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    ((AbstractC2549y) oVar.f16184Z).O0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2549y) oVar.f16184Z).N0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void W(int i10, List list, S4.o oVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                ((AbstractC2549y) oVar.f16184Z).M0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += AbstractC2549y.s0(((Long) list.get(i13)).longValue());
                }
                ((AbstractC2549y) oVar.f16184Z).O0(i12);
                while (i11 < list.size()) {
                    ((AbstractC2549y) oVar.f16184Z).Q0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            oVar.getClass();
            while (i11 < list.size()) {
                ((AbstractC2549y) oVar.f16184Z).P0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC2549y.W(i10) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int o02 = AbstractC2549y.o0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            o02 += AbstractC2549y.Y((AbstractC2534q) list.get(i11));
        }
        return o02;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2549y.o0(i10) * size) + e(list);
    }

    public static int e(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2506g0) {
            C2506g0 c2506g0 = (C2506g0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2549y.g0(c2506g0.I(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2549y.g0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC2549y.b0(i10) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC2549y.c0(i10) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i10, List list, AbstractC2504f1 abstractC2504f1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC2549y.e0(i10, (M0) list.get(i12), abstractC2504f1);
        }
        return i11;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2549y.o0(i10) * size) + l(list);
    }

    public static int l(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2506g0) {
            C2506g0 c2506g0 = (C2506g0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2549y.g0(c2506g0.I(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2549y.g0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC2549y.o0(i10) * list.size()) + n(list);
    }

    public static int n(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B0) {
            B0 b02 = (B0) list;
            i10 = 0;
            while (i11 < size) {
                b02.y(i11);
                i10 += AbstractC2549y.s0(b02.f27380Z[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2549y.s0(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int o(int i10, AbstractC2504f1 abstractC2504f1, Object obj) {
        int o02 = AbstractC2549y.o0(i10);
        int serializedSize = ((AbstractC2493c) ((M0) obj)).getSerializedSize(abstractC2504f1);
        return AbstractC2549y.q0(serializedSize) + serializedSize + o02;
    }

    public static int p(int i10, List list, AbstractC2504f1 abstractC2504f1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int o02 = AbstractC2549y.o0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            int serializedSize = ((AbstractC2493c) ((M0) list.get(i11))).getSerializedSize(abstractC2504f1);
            o02 += AbstractC2549y.q0(serializedSize) + serializedSize;
        }
        return o02;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2549y.o0(i10) * size) + r(list);
    }

    public static int r(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2506g0) {
            C2506g0 c2506g0 = (C2506g0) list;
            i10 = 0;
            while (i11 < size) {
                int I10 = c2506g0.I(i11);
                i10 += AbstractC2549y.q0((I10 >> 31) ^ (I10 << 1));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += AbstractC2549y.q0((intValue >> 31) ^ (intValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2549y.o0(i10) * size) + t(list);
    }

    public static int t(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B0) {
            B0 b02 = (B0) list;
            i10 = 0;
            while (i11 < size) {
                b02.y(i11);
                long j6 = b02.f27380Z[i11];
                i10 += AbstractC2549y.s0((j6 >> 63) ^ (j6 << 1));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += AbstractC2549y.s0((longValue >> 63) ^ (longValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static int u(int i10, List list) {
        int n02;
        int n03;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int o02 = AbstractC2549y.o0(i10) * size;
        if (list instanceof AbstractC2546w0) {
            AbstractC2546w0 abstractC2546w0 = (AbstractC2546w0) list;
            while (i11 < size) {
                Object j6 = abstractC2546w0.j(i11);
                if (j6 instanceof AbstractC2534q) {
                    n03 = AbstractC2549y.Y((AbstractC2534q) j6);
                } else {
                    n03 = AbstractC2549y.n0((String) j6);
                }
                o02 = n03 + o02;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof AbstractC2534q) {
                    n02 = AbstractC2549y.Y((AbstractC2534q) obj);
                } else {
                    n02 = AbstractC2549y.n0((String) obj);
                }
                o02 = n02 + o02;
                i11++;
            }
        }
        return o02;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2549y.o0(i10) * size) + w(list);
    }

    public static int w(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2506g0) {
            C2506g0 c2506g0 = (C2506g0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2549y.q0(c2506g0.I(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2549y.q0(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC2549y.o0(i10) * size) + y(list);
    }

    public static int y(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof B0) {
            B0 b02 = (B0) list;
            i10 = 0;
            while (i11 < size) {
                b02.y(i11);
                i10 += AbstractC2549y.s0(b02.f27380Z[i11]);
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC2549y.s0(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static Object z(Object obj, int i10, AbstractList abstractList, AbstractC2518k0 abstractC2518k0, Object obj2, w1 w1Var) {
        if (abstractC2518k0 == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) abstractList.get(i12);
            int intValue = num.intValue();
            if (abstractC2518k0.a(intValue) != null) {
                if (i12 != i11) {
                    abstractList.set(i11, num);
                }
                i11++;
            } else {
                obj2 = E(obj, i10, intValue, obj2, w1Var);
            }
        }
        if (i11 != size) {
            abstractList.subList(i11, size).clear();
        }
        return obj2;
    }
}
