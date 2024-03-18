package androidx.compose.ui.layout;

import E0.AbstractC0461u;
import E0.AbstractC0463w;
import E0.C0462v;
import E0.C0465y;
import E0.M;
import E0.Z;
import E0.j0;
import G0.T;
import G0.g0;
import R4.b;
import com.google.android.gms.internal.play_billing.N;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5252d;
import q0.C5254f;
import wf.k;
import wf.o;

/* loaded from: classes2.dex */
public abstract class a {
    public static final long a(float f6, float f10) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        int i10 = j0.f4070b;
        return floatToRawIntBits;
    }

    public static final C5252d b(AbstractC0461u abstractC0461u) {
        AbstractC0461u x10 = abstractC0461u.x();
        if (x10 != null) {
            return x10.F(abstractC0461u, true);
        }
        return new C5252d(0.0f, 0.0f, (int) (abstractC0461u.j() >> 32), (int) (abstractC0461u.j() & 4294967295L));
    }

    public static final C5252d c(AbstractC0461u abstractC0461u) {
        AbstractC0461u d10 = d(abstractC0461u);
        C5252d F10 = d(abstractC0461u).F(abstractC0461u, true);
        float j6 = (int) (d10.j() >> 32);
        float j10 = (int) (d10.j() & 4294967295L);
        float o10 = N.o(F10.f43625a, 0.0f, j6);
        float o11 = N.o(F10.f43626b, 0.0f, j10);
        float o12 = N.o(F10.f43627c, 0.0f, j6);
        float o13 = N.o(F10.f43628d, 0.0f, j10);
        if (o10 == o12 || o11 == o13) {
            return C5252d.f43624e;
        }
        long d11 = d10.d(b.r(o10, o11));
        long d12 = d10.d(b.r(o12, o11));
        long d13 = d10.d(b.r(o12, o13));
        long d14 = d10.d(b.r(o10, o13));
        float d15 = C5251c.d(d11);
        float[] fArr = {C5251c.d(d12), C5251c.d(d14), C5251c.d(d13)};
        for (int i10 = 0; i10 < 3; i10++) {
            d15 = Math.min(d15, fArr[i10]);
        }
        float e10 = C5251c.e(d11);
        float[] fArr2 = {C5251c.e(d12), C5251c.e(d14), C5251c.e(d13)};
        float f6 = e10;
        for (int i11 = 0; i11 < 3; i11++) {
            f6 = Math.min(f6, fArr2[i11]);
        }
        float d16 = C5251c.d(d11);
        float[] fArr3 = {C5251c.d(d12), C5251c.d(d14), C5251c.d(d13)};
        float f10 = d16;
        for (int i12 = 0; i12 < 3; i12++) {
            f10 = Math.max(f10, fArr3[i12]);
        }
        float e11 = C5251c.e(d11);
        float[] fArr4 = {C5251c.e(d12), C5251c.e(d14), C5251c.e(d13)};
        for (int i13 = 0; i13 < 3; i13++) {
            e11 = Math.max(e11, fArr4[i13]);
        }
        return new C5252d(d15, f6, f10, e11);
    }

    public static final AbstractC0461u d(AbstractC0461u abstractC0461u) {
        AbstractC0461u abstractC0461u2;
        g0 g0Var;
        AbstractC0461u x10 = abstractC0461u.x();
        while (true) {
            AbstractC0461u abstractC0461u3 = x10;
            abstractC0461u2 = abstractC0461u;
            abstractC0461u = abstractC0461u3;
            if (abstractC0461u == null) {
                break;
            }
            x10 = abstractC0461u.x();
        }
        if (abstractC0461u2 instanceof g0) {
            g0Var = (g0) abstractC0461u2;
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            return abstractC0461u2;
        }
        g0 g0Var2 = g0Var.f5772p0;
        while (true) {
            g0 g0Var3 = g0Var2;
            g0 g0Var4 = g0Var;
            g0Var = g0Var3;
            if (g0Var != null) {
                g0Var2 = g0Var.f5772p0;
            } else {
                return g0Var4;
            }
        }
    }

    public static final Object e(M m10) {
        AbstractC0463w abstractC0463w;
        Object u10 = m10.u();
        if (u10 instanceof AbstractC0463w) {
            abstractC0463w = (AbstractC0463w) u10;
        } else {
            abstractC0463w = null;
        }
        if (abstractC0463w == null) {
            return null;
        }
        return ((C0462v) abstractC0463w).f4091s0;
    }

    public static final T f(T t10) {
        androidx.compose.ui.node.a aVar;
        androidx.compose.ui.node.a aVar2 = t10.f5673n0.f5770n0;
        while (true) {
            androidx.compose.ui.node.a E10 = aVar2.E();
            androidx.compose.ui.node.a aVar3 = null;
            if (E10 != null) {
                aVar = E10.f24844h0;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                androidx.compose.ui.node.a E11 = aVar2.E();
                if (E11 != null) {
                    aVar3 = E11.f24844h0;
                }
                AbstractC3557B.Z(aVar3);
                androidx.compose.ui.node.a E12 = aVar2.E();
                AbstractC3557B.Z(E12);
                aVar2 = E12.f24844h0;
                AbstractC3557B.Z(aVar2);
            } else {
                T E02 = aVar2.f24831B0.f5702c.E0();
                AbstractC3557B.Z(E02);
                return E02;
            }
        }
    }

    public static final AbstractC4326r g(AbstractC4326r abstractC4326r, o oVar) {
        return abstractC4326r.g(new LayoutElement(oVar));
    }

    public static final AbstractC4326r h(AbstractC4326r abstractC4326r, String str) {
        return abstractC4326r.g(new LayoutIdElement(str));
    }

    public static final C3288a i(AbstractC4326r abstractC4326r) {
        return new C3288a(new C0465y(abstractC4326r, 0), true, -1586257396);
    }

    public static final AbstractC4326r j(AbstractC4326r abstractC4326r, k kVar) {
        return abstractC4326r.g(new OnGloballyPositionedElement(kVar));
    }

    public static final AbstractC4326r k(AbstractC4326r abstractC4326r, k kVar) {
        return abstractC4326r.g(new Z(kVar));
    }

    public static final long l(AbstractC0461u abstractC0461u) {
        int i10 = C5251c.f43622e;
        return abstractC0461u.M(C5251c.f43619b);
    }

    public static final long m(long j6, long j10) {
        return AbstractC4828h.i(j0.a(j10) * C5254f.d(j6), j0.b(j10) * C5254f.b(j6));
    }
}
