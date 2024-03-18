package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2031p extends V {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f25100d = Logger.getLogger(AbstractC2031p.class.getName());

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f25101e = x0.f25134f;

    /* renamed from: c  reason: collision with root package name */
    public J0.a f25102c;

    public static int A(int i10, String str) {
        return B(str) + C(i10);
    }

    public static int B(String str) {
        int i10;
        try {
            i10 = A0.b(str);
        } catch (z0 unused) {
            i10 = str.getBytes(B.f24959a).length;
        }
        return E(i10) + i10;
    }

    public static int C(int i10) {
        return E(i10 << 3);
    }

    public static int D(int i10, int i11) {
        return E(i11) + C(i10);
    }

    public static int E(int i10) {
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

    public static int F(int i10, long j6) {
        return G(j6) + C(i10);
    }

    public static int G(long j6) {
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

    public static int k(int i10) {
        return C(i10) + 1;
    }

    public static int l(int i10, AbstractC2025j abstractC2025j) {
        return m(abstractC2025j) + C(i10);
    }

    public static int m(AbstractC2025j abstractC2025j) {
        int size = abstractC2025j.size();
        return E(size) + size;
    }

    public static int n(int i10) {
        return C(i10) + 8;
    }

    public static int o(int i10, int i11) {
        return u(i11) + C(i10);
    }

    public static int p(int i10) {
        return C(i10) + 4;
    }

    public static int q(int i10) {
        return C(i10) + 8;
    }

    public static int r(int i10) {
        return C(i10) + 4;
    }

    public static int s(int i10, AbstractC2011b abstractC2011b, AbstractC2022g0 abstractC2022g0) {
        return abstractC2011b.b(abstractC2022g0) + (C(i10) * 2);
    }

    public static int t(int i10, int i11) {
        return u(i11) + C(i10);
    }

    public static int u(int i10) {
        if (i10 >= 0) {
            return E(i10);
        }
        return 10;
    }

    public static int v(int i10, long j6) {
        return G(j6) + C(i10);
    }

    public static int w(int i10) {
        return C(i10) + 4;
    }

    public static int x(int i10) {
        return C(i10) + 8;
    }

    public static int y(int i10, int i11) {
        return E((i11 >> 31) ^ (i11 << 1)) + C(i10);
    }

    public static int z(int i10, long j6) {
        return G((j6 >> 63) ^ (j6 << 1)) + C(i10);
    }

    public final void H(String str, z0 z0Var) {
        f25100d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) z0Var);
        byte[] bytes = str.getBytes(B.f24959a);
        try {
            Z(bytes.length);
            j(bytes, 0, bytes.length);
        } catch (C2029n e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new C2029n(e11);
        }
    }

    public abstract void I(byte b10);

    public abstract void J(int i10, boolean z10);

    public abstract void K(byte[] bArr, int i10);

    public abstract void L(int i10, AbstractC2025j abstractC2025j);

    public abstract void M(AbstractC2025j abstractC2025j);

    public abstract void N(int i10, int i11);

    public abstract void O(int i10);

    public abstract void P(int i10, long j6);

    public abstract void Q(long j6);

    public abstract void R(int i10, int i11);

    public abstract void S(int i10);

    public abstract void T(int i10, AbstractC2011b abstractC2011b, AbstractC2022g0 abstractC2022g0);

    public abstract void U(AbstractC2011b abstractC2011b);

    public abstract void V(int i10, String str);

    public abstract void W(String str);

    public abstract void X(int i10, int i11);

    public abstract void Y(int i10, int i11);

    public abstract void Z(int i10);

    public abstract void a0(int i10, long j6);

    public abstract void b0(long j6);
}
