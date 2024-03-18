package androidx.compose.foundation.layout;

import A.C0033n0;
import E.AbstractC0434s;
import E.C0428l;
import E.C0439x;
import E.M;
import E.V;
import E.g0;
import E.i0;
import E.o0;
import E.v0;
import E0.AbstractC0445d;
import E0.N;
import E0.k0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.AbstractC1649z3;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import Z.r;
import Z0.l;
import id.AbstractC3557B;
import java.util.List;
import l0.AbstractC4313e;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import l8.AbstractC4344b;
import s1.C5523e;
import wf.k;
import wf.n;
import wf.o;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC4326r abstractC4326r, AbstractC4313e abstractC4313e, boolean z10, o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4313e abstractC4313e2;
        int i13;
        boolean z11;
        AbstractC4326r abstractC4326r3;
        AbstractC4313e abstractC4313e3;
        boolean i14;
        Object K10;
        C1741v0 v10;
        int i15;
        int i16;
        int i17;
        int i18;
        r rVar = (r) abstractC1725n;
        rVar.X(1781813501);
        int i19 = i11 & 1;
        if (i19 != 0) {
            i12 = i10 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i10 & 14) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            abstractC4326r2 = abstractC4326r;
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4313e2 = abstractC4313e;
            if (rVar.g(abstractC4313e)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                z11 = z10;
                if (rVar.h(z10)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i12 |= i16;
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (rVar.i(oVar)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 5851) != 1170 && rVar.B()) {
                    rVar.P();
                    abstractC4326r3 = abstractC4326r2;
                    abstractC4313e3 = abstractC4313e2;
                } else {
                    if (i19 != 0) {
                        abstractC4326r3 = C4323o.f37719b;
                    } else {
                        abstractC4326r3 = abstractC4326r2;
                    }
                    if (i20 != 0) {
                        abstractC4313e3 = C4310b.f37693Y;
                    } else {
                        abstractC4313e3 = abstractC4313e2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    N c10 = AbstractC0434s.c(abstractC4313e3, z11, rVar);
                    rVar.W(-1765292870);
                    i14 = rVar.i(oVar) | rVar.g(c10);
                    K10 = rVar.K();
                    if (!i14 || K10 == C1723m.f22654Y) {
                        K10 = new c(c10, oVar, 1);
                        rVar.h0(K10);
                    }
                    rVar.t(false);
                    k0.b(abstractC4326r3, (n) K10, rVar, i12 & 14, 0);
                }
                boolean z12 = z11;
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new C0439x(abstractC4326r3, abstractC4313e3, z12, oVar, i10, i11);
                    return;
                }
                return;
            }
            z11 = z10;
            if ((i11 & 8) != 0) {
            }
            if ((i12 & 5851) != 1170) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if (i13 != 0) {
            }
            N c102 = AbstractC0434s.c(abstractC4313e3, z11, rVar);
            rVar.W(-1765292870);
            i14 = rVar.i(oVar) | rVar.g(c102);
            K10 = rVar.K();
            if (!i14) {
            }
            K10 = new c(c102, oVar, 1);
            rVar.h0(K10);
            rVar.t(false);
            k0.b(abstractC4326r3, (n) K10, rVar, i12 & 14, 0);
            boolean z122 = z11;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4313e2 = abstractC4313e;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((i11 & 8) != 0) {
        }
        if ((i12 & 5851) != 1170) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if (i13 != 0) {
        }
        N c1022 = AbstractC0434s.c(abstractC4313e3, z11, rVar);
        rVar.W(-1765292870);
        i14 = rVar.i(oVar) | rVar.g(c1022);
        K10 = rVar.K();
        if (!i14) {
        }
        K10 = new c(c1022, oVar, 1);
        rVar.h0(K10);
        rVar.t(false);
        k0.b(abstractC4326r3, (n) K10, rVar, i12 & 14, 0);
        boolean z1222 = z11;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static i0 b(float f6, int i10) {
        if ((i10 & 1) != 0) {
            f6 = 0;
        }
        float f10 = 0;
        return new i0(f6, f10, f6, f10);
    }

    public static i0 c(float f6, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f6 = 0;
        }
        float f12 = 0;
        if ((i10 & 4) != 0) {
            f10 = 0;
        }
        if ((i10 & 8) != 0) {
            f11 = 0;
        }
        return new i0(f6, f12, f10, f11);
    }

    public static final void d(AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n) {
        r rVar = (r) abstractC1725n;
        rVar.W(-72882467);
        v0 v0Var = v0.f3968a;
        rVar.W(544976794);
        int i10 = rVar.P;
        AbstractC4326r f02 = U3.f.f0(rVar, abstractC4326r);
        AbstractC1732q0 p10 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        rVar.W(1405779621);
        if (rVar.f22696a instanceof AbstractC1707e) {
            rVar.Z();
            if (rVar.f22695O) {
                rVar.o(new C0033n0(c0582k, 2));
            } else {
                rVar.k0();
            }
            U3.f.n0(rVar, v0Var, C0583l.f5808f);
            U3.f.n0(rVar, p10, C0583l.f5807e);
            U3.f.n0(rVar, f02, C0583l.f5806d);
            C0581j c0581j = C0583l.f5809g;
            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i10))) {
                AbstractC6463a.q(i10, rVar, i10, c0581j);
            }
            AbstractC6463a.v(rVar, true, false, false, false);
            return;
        }
        R4.b.r1();
        throw null;
    }

    public static final int e(List list, C0428l c0428l, C0428l c0428l2, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = 0;
        if (i12 == i13) {
            if (list.isEmpty()) {
                return 0;
            }
            int size = list.size();
            float f6 = 0.0f;
            int i17 = 0;
            int i18 = 0;
            while (i16 < size) {
                E0.r rVar = (E0.r) list.get(i16);
                float l10 = l(k(rVar));
                int intValue = ((Number) c0428l.invoke(rVar, Integer.valueOf(i10))).intValue();
                if (l10 == 0.0f) {
                    i18 += intValue;
                } else if (l10 > 0.0f) {
                    f6 += l10;
                    i17 = Math.max(i17, AbstractC4344b.Y0(intValue / l10));
                }
                i16++;
            }
            return ((list.size() - 1) * i11) + AbstractC4344b.Y0(i17 * f6) + i18;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            int min = Math.min((list.size() - 1) * i11, i10);
            int size2 = list.size();
            float f10 = 0.0f;
            int i19 = 0;
            for (int i20 = 0; i20 < size2; i20++) {
                E0.r rVar2 = (E0.r) list.get(i20);
                float l11 = l(k(rVar2));
                if (l11 == 0.0f) {
                    int min2 = Math.min(((Number) c0428l2.invoke(rVar2, Integer.MAX_VALUE)).intValue(), i10 - min);
                    min += min2;
                    i19 = Math.max(i19, ((Number) c0428l.invoke(rVar2, Integer.valueOf(min2))).intValue());
                } else if (l11 > 0.0f) {
                    f10 += l11;
                }
            }
            if (f10 == 0.0f) {
                i14 = 0;
            } else if (i10 == Integer.MAX_VALUE) {
                i14 = Integer.MAX_VALUE;
            } else {
                i14 = AbstractC4344b.Y0(Math.max(i10 - min, 0) / f10);
            }
            int size3 = list.size();
            while (i16 < size3) {
                E0.r rVar3 = (E0.r) list.get(i16);
                float l12 = l(k(rVar3));
                if (l12 > 0.0f) {
                    if (i14 != Integer.MAX_VALUE) {
                        i15 = AbstractC4344b.Y0(i14 * l12);
                    } else {
                        i15 = Integer.MAX_VALUE;
                    }
                    i19 = Math.max(i19, ((Number) c0428l.invoke(rVar3, Integer.valueOf(i15))).intValue());
                }
                i16++;
            }
            return i19;
        }
    }

    public static AbstractC4326r f(AbstractC4326r abstractC4326r) {
        return abstractC4326r.g(new AspectRatioElement(false));
    }

    public static final float g(g0 g0Var, l lVar) {
        if (lVar == l.f22805Y) {
            return g0Var.c(lVar);
        }
        return g0Var.b(lVar);
    }

    public static final float h(g0 g0Var, l lVar) {
        if (lVar == l.f22805Y) {
            return g0Var.b(lVar);
        }
        return g0Var.c(lVar);
    }

    public static long i(long j6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (i10 == 1) {
            i11 = Z0.a.j(j6);
        } else {
            i11 = Z0.a.i(j6);
        }
        if (i10 == 1) {
            i12 = Z0.a.h(j6);
        } else {
            i12 = Z0.a.g(j6);
        }
        if (i10 == 1) {
            i13 = Z0.a.i(j6);
        } else {
            i13 = Z0.a.j(j6);
        }
        if (i10 == 1) {
            i14 = Z0.a.g(j6);
        } else {
            i14 = Z0.a.h(j6);
        }
        return A7.b.m(i11, i12, i13, i14);
    }

    public static long j(long j6, int i10, int i11, int i12) {
        int i13;
        if ((i12 & 2) != 0) {
            i11 = Z0.a.h(j6);
        }
        if ((i12 & 4) != 0) {
            i13 = Z0.a.i(j6);
        } else {
            i13 = 0;
        }
        return A7.b.m(i10, i11, i13, Z0.a.g(j6));
    }

    public static final o0 k(E0.r rVar) {
        Object u10 = rVar.u();
        if (u10 instanceof o0) {
            return (o0) u10;
        }
        return null;
    }

    public static final float l(o0 o0Var) {
        if (o0Var != null) {
            return o0Var.f3931a;
        }
        return 0.0f;
    }

    public static final AbstractC4326r m(AbstractC4326r abstractC4326r) {
        return abstractC4326r.g(new IntrinsicHeightElement());
    }

    public static final AbstractC4326r n(AbstractC4326r abstractC4326r) {
        return U3.f.o(abstractC4326r, new M(16));
    }

    public static final AbstractC4326r o(AbstractC4326r abstractC4326r, k kVar) {
        return abstractC4326r.g(new OffsetPxElement(kVar));
    }

    public static AbstractC4326r p(AbstractC4326r abstractC4326r, float f6) {
        return abstractC4326r.g(new OffsetElement(0, f6));
    }

    public static final AbstractC4326r q(AbstractC4326r abstractC4326r, g0 g0Var) {
        return abstractC4326r.g(new PaddingValuesElement(g0Var));
    }

    public static final AbstractC4326r r(AbstractC4326r abstractC4326r, float f6) {
        return abstractC4326r.g(new PaddingElement(f6, f6, f6, f6));
    }

    public static final AbstractC4326r s(AbstractC4326r abstractC4326r, float f6, float f10) {
        return abstractC4326r.g(new PaddingElement(f6, f10, f6, f10));
    }

    public static AbstractC4326r t(AbstractC4326r abstractC4326r, float f6, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f6 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        return s(abstractC4326r, f6, f10);
    }

    public static final AbstractC4326r u(AbstractC4326r abstractC4326r, float f6, float f10, float f11, float f12) {
        return abstractC4326r.g(new PaddingElement(f6, f10, f11, f12));
    }

    public static AbstractC4326r v(AbstractC4326r abstractC4326r, float f6, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f6 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        if ((i10 & 4) != 0) {
            f11 = 0;
        }
        if ((i10 & 8) != 0) {
            f12 = 0;
        }
        return u(abstractC4326r, f6, f10, f11, f12);
    }

    public static final AbstractC4326r w() {
        AbstractC4326r abstractC4326r;
        float f6 = AbstractC1649z3.f20664b;
        float f10 = AbstractC1649z3.f20670h;
        boolean a5 = Z0.e.a(f6, Float.NaN);
        AbstractC4326r abstractC4326r2 = C4323o.f37719b;
        if (!a5) {
            abstractC4326r = new AlignmentLineOffsetDpElement(AbstractC0445d.f4051a, f6, Float.NaN);
        } else {
            abstractC4326r = abstractC4326r2;
        }
        if (!Z0.e.a(f10, Float.NaN)) {
            abstractC4326r2 = new AlignmentLineOffsetDpElement(AbstractC0445d.f4052b, Float.NaN, f10);
        }
        return abstractC4326r.g(abstractC4326r2);
    }

    public static final long x(long j6, int i10) {
        if (i10 == 1) {
            return A7.b.m(Z0.a.j(j6), Z0.a.h(j6), Z0.a.i(j6), Z0.a.g(j6));
        }
        return A7.b.m(Z0.a.i(j6), Z0.a.g(j6), Z0.a.j(j6), Z0.a.h(j6));
    }

    public static final V y(C5523e c5523e) {
        return new V(c5523e.f45106a, c5523e.f45107b, c5523e.f45108c, c5523e.f45109d);
    }

    public static final AbstractC4326r z(AbstractC4326r abstractC4326r) {
        return abstractC4326r.g(new IntrinsicWidthElement());
    }
}
