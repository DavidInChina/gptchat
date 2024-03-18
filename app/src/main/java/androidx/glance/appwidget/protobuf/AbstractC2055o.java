package androidx.glance.appwidget.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.glance.appwidget.protobuf.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2055o extends Bi.c {

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f25260i = Logger.getLogger(AbstractC2055o.class.getName());

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f25261j = m0.f25252e;

    /* renamed from: h  reason: collision with root package name */
    public F4.a f25262h;

    public static int U1(int i10) {
        return m2(i10) + 1;
    }

    public static int V1(int i10, AbstractC2049i abstractC2049i) {
        return W1(abstractC2049i) + m2(i10);
    }

    public static int W1(AbstractC2049i abstractC2049i) {
        int size = abstractC2049i.size();
        return o2(size) + size;
    }

    public static int X1(int i10) {
        return m2(i10) + 8;
    }

    public static int Y1(int i10, int i11) {
        return e2(i11) + m2(i10);
    }

    public static int Z1(int i10) {
        return m2(i10) + 4;
    }

    public static int a2(int i10) {
        return m2(i10) + 8;
    }

    public static int b2(int i10) {
        return m2(i10) + 4;
    }

    public static int c2(int i10, AbstractC2042b abstractC2042b, b0 b0Var) {
        return abstractC2042b.a(b0Var) + (m2(i10) * 2);
    }

    public static int d2(int i10, int i11) {
        return e2(i11) + m2(i10);
    }

    public static int e2(int i10) {
        if (i10 >= 0) {
            return o2(i10);
        }
        return 10;
    }

    public static int f2(int i10, long j6) {
        return q2(j6) + m2(i10);
    }

    public static int g2(int i10) {
        return m2(i10) + 4;
    }

    public static int h2(int i10) {
        return m2(i10) + 8;
    }

    public static int i2(int i10, int i11) {
        return o2((i11 >> 31) ^ (i11 << 1)) + m2(i10);
    }

    public static int j2(int i10, long j6) {
        return q2((j6 >> 63) ^ (j6 << 1)) + m2(i10);
    }

    public static int k2(int i10, String str) {
        return l2(str) + m2(i10);
    }

    public static int l2(String str) {
        int i10;
        try {
            i10 = p0.b(str);
        } catch (o0 unused) {
            i10 = str.getBytes(A.f25144a).length;
        }
        return o2(i10) + i10;
    }

    public static int m2(int i10) {
        return o2(i10 << 3);
    }

    public static int n2(int i10, int i11) {
        return o2(i11) + m2(i10);
    }

    public static int o2(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int p2(int i10, long j6) {
        return q2(j6) + m2(i10);
    }

    public static int q2(long j6) {
        int i10;
        if (((-128) & j6) == 0) {
            return 1;
        }
        if (j6 < 0) {
            return 10;
        }
        if (((-34359738368L) & j6) != 0) {
            j6 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j6) != 0) {
            i10 += 2;
            j6 >>>= 14;
        }
        return (j6 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public abstract void A2(int i10);

    public abstract void B2(int i10, AbstractC2042b abstractC2042b, b0 b0Var);

    public abstract void C2(int i10, String str);

    public abstract void D2(int i10, int i11);

    public abstract void E2(int i10, int i11);

    public abstract void F2(int i10);

    public abstract void G2(int i10, long j6);

    public abstract void H2(long j6);

    public final void r2(String str, o0 o0Var) {
        f25260i.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) o0Var);
        byte[] bytes = str.getBytes(A.f25144a);
        try {
            F2(bytes.length);
            T1(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new E2.F(e10);
        }
    }

    public abstract void s2(byte b10);

    public abstract void t2(int i10, boolean z10);

    public abstract void u2(int i10, AbstractC2049i abstractC2049i);

    public abstract void v2(int i10, int i11);

    public abstract void w2(int i10);

    public abstract void x2(int i10, long j6);

    public abstract void y2(long j6);

    public abstract void z2(int i10, int i11);
}
