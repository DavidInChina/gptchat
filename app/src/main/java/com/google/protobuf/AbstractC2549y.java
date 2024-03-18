package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2549y extends AbstractC2508h {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f27642d = Logger.getLogger(AbstractC2549y.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f27643e = C1.f27387e;

    /* renamed from: c  reason: collision with root package name */
    public S4.o f27644c;

    public static int W(int i10) {
        return o0(i10) + 1;
    }

    public static int X(int i10, AbstractC2534q abstractC2534q) {
        return Y(abstractC2534q) + o0(i10);
    }

    public static int Y(AbstractC2534q abstractC2534q) {
        int size = abstractC2534q.size();
        return q0(size) + size;
    }

    public static int Z(int i10) {
        return o0(i10) + 8;
    }

    public static int a0(int i10, int i11) {
        return g0(i11) + o0(i10);
    }

    public static int b0(int i10) {
        return o0(i10) + 4;
    }

    public static int c0(int i10) {
        return o0(i10) + 8;
    }

    public static int d0(int i10) {
        return o0(i10) + 4;
    }

    public static int e0(int i10, M0 m02, AbstractC2504f1 abstractC2504f1) {
        return ((AbstractC2493c) m02).getSerializedSize(abstractC2504f1) + (o0(i10) * 2);
    }

    public static int f0(int i10, int i11) {
        return g0(i11) + o0(i10);
    }

    public static int g0(int i10) {
        if (i10 >= 0) {
            return q0(i10);
        }
        return 10;
    }

    public static int h0(int i10, long j6) {
        return s0(j6) + o0(i10);
    }

    public static int i0(int i10) {
        return o0(i10) + 4;
    }

    public static int j0(int i10) {
        return o0(i10) + 8;
    }

    public static int k0(int i10, int i11) {
        return q0((i11 >> 31) ^ (i11 << 1)) + o0(i10);
    }

    public static int l0(int i10, long j6) {
        return s0((j6 >> 63) ^ (j6 << 1)) + o0(i10);
    }

    public static int m0(int i10, String str) {
        return n0(str) + o0(i10);
    }

    public static int n0(String str) {
        int i10;
        try {
            i10 = F1.b(str);
        } catch (E1 unused) {
            i10 = str.getBytes(AbstractC2536r0.f27584a).length;
        }
        return q0(i10) + i10;
    }

    public static int o0(int i10) {
        return q0(i10 << 3);
    }

    public static int p0(int i10, int i11) {
        return q0(i11) + o0(i10);
    }

    public static int q0(int i10) {
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

    public static int r0(int i10, long j6) {
        return s0(j6) + o0(i10);
    }

    public static int s0(long j6) {
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

    public abstract void A0(int i10, int i11);

    public abstract void B0(int i10);

    public abstract void C0(int i10, long j6);

    public abstract void D0(long j6);

    public abstract void E0(int i10, int i11);

    public abstract void F0(int i10);

    public abstract void G0(int i10, M0 m02, AbstractC2504f1 abstractC2504f1);

    public abstract void H0(M0 m02);

    public abstract void I0(int i10, M0 m02);

    public abstract void J0(int i10, AbstractC2534q abstractC2534q);

    public abstract void K0(int i10, String str);

    public abstract void L0(String str);

    public abstract void M0(int i10, int i11);

    public abstract void N0(int i10, int i11);

    public abstract void O0(int i10);

    public abstract void P0(int i10, long j6);

    public abstract void Q0(long j6);

    public final void t0(String str, E1 e12) {
        f27642d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
        byte[] bytes = str.getBytes(AbstractC2536r0.f27584a);
        try {
            O0(bytes.length);
            V(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new E2.F(e10);
        }
    }

    public abstract int u0();

    public abstract void v0(byte b10);

    public abstract void w0(int i10, boolean z10);

    public abstract void x0(byte[] bArr, int i10);

    public abstract void y0(int i10, AbstractC2534q abstractC2534q);

    public abstract void z0(AbstractC2534q abstractC2534q);
}
