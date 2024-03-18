package B;

import E0.AbstractC0461u;
import b0.C2104h;
import id.AbstractC3557B;
import l0.AbstractC4325q;
import q0.C5251c;
import q0.C5252d;
import q0.C5254f;

/* loaded from: classes.dex */
public final class S extends AbstractC4325q implements I.h, G0.B {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f1162A0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f1164C0;

    /* renamed from: D0  reason: collision with root package name */
    public final b2 f1165D0;

    /* renamed from: s0  reason: collision with root package name */
    public W0 f1166s0;

    /* renamed from: t0  reason: collision with root package name */
    public AbstractC0168u1 f1167t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f1168u0;

    /* renamed from: v0  reason: collision with root package name */
    public N f1169v0;

    /* renamed from: x0  reason: collision with root package name */
    public AbstractC0461u f1171x0;

    /* renamed from: y0  reason: collision with root package name */
    public AbstractC0461u f1172y0;

    /* renamed from: z0  reason: collision with root package name */
    public C5252d f1173z0;

    /* renamed from: w0  reason: collision with root package name */
    public final K f1170w0 = new K();

    /* renamed from: B0  reason: collision with root package name */
    public long f1163B0 = 0;

    public S(W0 w02, AbstractC0168u1 abstractC0168u1, boolean z10, N n10) {
        this.f1166s0 = w02;
        this.f1167t0 = abstractC0168u1;
        this.f1168u0 = z10;
        this.f1169v0 = n10;
        this.f1165D0 = new b2(this.f1169v0.b());
    }

    public static final float A0(S s10) {
        C5252d c5252d;
        float a5;
        int i10;
        if (Z0.k.a(s10.f1163B0, 0L)) {
            return 0.0f;
        }
        C2104h c2104h = s10.f1170w0.f1120a;
        int i11 = c2104h.f25569h0;
        C5252d c5252d2 = null;
        if (i11 > 0) {
            int i12 = i11 - 1;
            Object[] objArr = c2104h.f25567Y;
            c5252d = null;
            while (true) {
                C5252d c5252d3 = (C5252d) ((O) objArr[i12]).f1142a.mo122invoke();
                if (c5252d3 != null) {
                    long d10 = c5252d3.d();
                    long z10 = Ng.H.z(s10.f1163B0);
                    int ordinal = s10.f1166s0.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            i10 = Float.compare(C5254f.d(d10), C5254f.d(z10));
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        i10 = Float.compare(C5254f.b(d10), C5254f.b(z10));
                    }
                    if (i10 <= 0) {
                        c5252d = c5252d3;
                    } else if (c5252d == null) {
                        c5252d = c5252d3;
                    }
                }
                i12--;
                if (i12 < 0) {
                    break;
                }
            }
        } else {
            c5252d = null;
        }
        if (c5252d == null) {
            if (s10.f1162A0) {
                c5252d2 = s10.B0();
            }
            if (c5252d2 == null) {
                return 0.0f;
            }
            c5252d = c5252d2;
        }
        long z11 = Ng.H.z(s10.f1163B0);
        int ordinal2 = s10.f1166s0.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                N n10 = s10.f1169v0;
                float f6 = c5252d.f43627c;
                float f10 = c5252d.f43625a;
                a5 = n10.a(f10, f6 - f10, C5254f.d(z11));
            } else {
                throw new RuntimeException();
            }
        } else {
            N n11 = s10.f1169v0;
            float f11 = c5252d.f43628d;
            float f12 = c5252d.f43626b;
            a5 = n11.a(f12, f11 - f12, C5254f.b(z11));
        }
        return a5;
    }

    public final C5252d B0() {
        AbstractC0461u abstractC0461u;
        AbstractC0461u abstractC0461u2 = this.f1171x0;
        if (abstractC0461u2 != null) {
            if (!abstractC0461u2.i()) {
                abstractC0461u2 = null;
            }
            if (abstractC0461u2 != null && (abstractC0461u = this.f1172y0) != null) {
                if (!abstractC0461u.i()) {
                    abstractC0461u = null;
                }
                if (abstractC0461u != null) {
                    return abstractC0461u2.F(abstractC0461u, false);
                }
            }
        }
        return null;
    }

    public final boolean C0(long j6, C5252d c5252d) {
        long E02 = E0(j6, c5252d);
        if (Math.abs(C5251c.d(E02)) <= 0.5f && Math.abs(C5251c.e(E02)) <= 0.5f) {
            return true;
        }
        return false;
    }

    public final void D0() {
        if (!this.f1164C0) {
            Ad.l.O0(p0(), null, Ng.G.f12870i0, new Q(this, null), 1);
            return;
        }
        throw new IllegalStateException("launchAnimation called when previous animation was running".toString());
    }

    public final long E0(long j6, C5252d c5252d) {
        long z10 = Ng.H.z(j6);
        int ordinal = this.f1166s0.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                N n10 = this.f1169v0;
                float f6 = c5252d.f43627c;
                float f10 = c5252d.f43625a;
                return R4.b.r(n10.a(f10, f6 - f10, C5254f.d(z10)), 0.0f);
            }
            throw new RuntimeException();
        }
        N n11 = this.f1169v0;
        float f11 = c5252d.f43628d;
        float f12 = c5252d.f43626b;
        return R4.b.r(0.0f, n11.a(f12, f11 - f12, C5254f.b(z10)));
    }

    @Override // G0.B
    public final void I(G0.g0 g0Var) {
        this.f1171x0 = g0Var;
    }

    @Override // G0.B
    public final void o(long j6) {
        int i10;
        C5252d B02;
        long j10 = this.f1163B0;
        this.f1163B0 = j6;
        int ordinal = this.f1166s0.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i10 = AbstractC3557B.e0((int) (j6 >> 32), (int) (j10 >> 32));
            } else {
                throw new RuntimeException();
            }
        } else {
            i10 = AbstractC3557B.e0((int) (j6 & 4294967295L), (int) (4294967295L & j10));
        }
        if (i10 < 0 && (B02 = B0()) != null) {
            C5252d c5252d = this.f1173z0;
            if (c5252d == null) {
                c5252d = B02;
            }
            if (!this.f1164C0 && !this.f1162A0 && C0(j10, c5252d) && !C0(j6, B02)) {
                this.f1162A0 = true;
                D0();
            }
            this.f1173z0 = B02;
        }
    }
}
