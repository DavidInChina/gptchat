package mh;

import A.B0;
import E0.AbstractC0454m;
import E0.C0453l;
import E0.j0;
import F.C0534h;
import Z.C1724m0;
import Z.o1;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import jf.C3959i;
import jh.L1;
import l0.AbstractC4313e;
import l0.C4310b;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import oh.C5018e;
import q0.C5251c;
import q0.C5252d;
import q0.C5254f;

/* renamed from: mh.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4686p implements P {

    /* renamed from: r  reason: collision with root package name */
    public static final i0.r f39480r;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f39481a;

    /* renamed from: b  reason: collision with root package name */
    public final Z.I f39482b;

    /* renamed from: c  reason: collision with root package name */
    public final C1724m0 f39483c;

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f39484d;

    /* renamed from: e  reason: collision with root package name */
    public final C1724m0 f39485e;

    /* renamed from: f  reason: collision with root package name */
    public final Z.I f39486f;

    /* renamed from: g  reason: collision with root package name */
    public final C1724m0 f39487g;

    /* renamed from: h  reason: collision with root package name */
    public final C1724m0 f39488h;

    /* renamed from: i  reason: collision with root package name */
    public final C1724m0 f39489i;

    /* renamed from: j  reason: collision with root package name */
    public final C1724m0 f39490j;

    /* renamed from: k  reason: collision with root package name */
    public final C1724m0 f39491k;

    /* renamed from: l  reason: collision with root package name */
    public final Z.I f39492l;

    /* renamed from: m  reason: collision with root package name */
    public final Z.I f39493m;

    /* renamed from: n  reason: collision with root package name */
    public final C1724m0 f39494n;

    /* renamed from: o  reason: collision with root package name */
    public final Z.I f39495o;

    /* renamed from: p  reason: collision with root package name */
    public final Z.I f39496p;

    /* renamed from: q  reason: collision with root package name */
    public final C5018e f39497q;

    static {
        C4675e c4675e = C4675e.f39441Y;
        C4676f c4676f = C4676f.f39442Y;
        i0.r rVar = i0.s.f32436a;
        f39480r = new i0.r(c4675e, c4676f);
    }

    public C4686p(C4674d c4674d, boolean z10, boolean z11, int i10) {
        c4674d = (i10 & 1) != 0 ? null : c4674d;
        z10 = (i10 & 2) != 0 ? true : z10;
        this.f39481a = (i10 & 4) != 0 ? false : z11;
        this.f39482b = AbstractC4828h.E(new C4677g(this, 1));
        Boolean valueOf = Boolean.valueOf(z10);
        o1 o1Var = o1.f22665a;
        this.f39483c = AbstractC4828h.Z(valueOf, o1Var);
        this.f39484d = AbstractC4828h.Z(C0453l.f4074b, o1Var);
        this.f39485e = AbstractC4828h.Z(C4310b.f37697j0, o1Var);
        this.f39486f = AbstractC4828h.E(new C4677g(this, 5));
        this.f39487g = AbstractC4828h.Z(c4674d, o1Var);
        this.f39488h = AbstractC4828h.Z(new C4688s(0.0f, 7), o1Var);
        this.f39489i = AbstractC4828h.Z(Z0.l.f22805Y, o1Var);
        this.f39490j = AbstractC4828h.Z(t.f39507a, o1Var);
        this.f39491k = AbstractC4828h.Z(new C5254f(C5254f.f43637b), o1Var);
        this.f39492l = AbstractC4828h.E(new C4677g(this, 4));
        this.f39493m = AbstractC4828h.E(new C4677g(this, 0));
        this.f39494n = AbstractC4828h.Z(null, o1Var);
        this.f39495o = AbstractC4828h.E(new C4677g(this, 3));
        this.f39496p = AbstractC4828h.E(new C4677g(this, 2));
        this.f39497q = new C5018e(new C0534h(6, this));
    }

    public final boolean a(long j6) {
        C4671a d10;
        C4674d g10;
        float e10;
        if (!j().f39505c || (d10 = d()) == null || (g10 = g()) == null) {
            return false;
        }
        C4672b c4672b = new C4672b(d10.f39433a, g10.f39438b);
        long J10 = P4.a.J(j6, c4672b);
        long g11 = C5251c.g(g10.f39437a, J10);
        if (R4.b.v1(g11)) {
            long g12 = C5251c.g(J10, C5251c.g(b(g11, c4672b), g11));
            if (Math.abs(C5251c.d(J10)) > Math.abs(C5251c.e(J10))) {
                e10 = C5251c.d(g12);
            } else {
                e10 = C5251c.e(g12);
            }
            if (Math.abs(e10) > 0.01f) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Offset can't be infinite ".concat(c(new C3959i("panDelta", new C5251c(j6)))).toString());
    }

    public final long b(long j6, C4672b c4672b) {
        if (R4.b.v1(j6)) {
            long L02 = P4.a.L0(h().e(), c4672b.b());
            long b10 = c4672b.b();
            long a5 = androidx.compose.ui.layout.a.a(j0.a(b10) * (-1.0f), j0.b(b10) * (-1.0f));
            long g10 = C5251c.g(((C5251c) new C4678h(this, 0, c4672b).invoke(new C5251c(C5251c.h(P4.a.L0(j6, a5), L02)))).f43623a, L02);
            return R4.b.r(C5251c.d(g10) / j0.a(a5), C5251c.e(g10) / j0.b(a5));
        }
        throw new IllegalStateException("Can't coerce an infinite offset ".concat(c(new C3959i("proposedZoom", c4672b))).toString());
    }

    public final String c(C3959i... c3959iArr) {
        StringBuilder sb2 = new StringBuilder(Separators.RETURN);
        for (C3959i c3959i : c3959iArr) {
            StringBuilder r10 = android.gov.nist.core.a.r((String) c3959i.f36155Y, " = ");
            r10.append(c3959i.f36156Z);
            sb2.append(r10.toString());
            sb2.append('\n');
        }
        sb2.append("gestureState = " + g());
        sb2.append('\n');
        sb2.append("contentTransformation = " + f());
        sb2.append('\n');
        sb2.append("contentScale = " + ((AbstractC0454m) this.f39484d.getValue()));
        sb2.append('\n');
        sb2.append("contentAlignment = " + ((AbstractC4313e) this.f39485e.getValue()));
        sb2.append('\n');
        sb2.append("isReadyToInteract = " + k());
        sb2.append('\n');
        sb2.append("unscaledContentLocation = " + i());
        sb2.append('\n');
        sb2.append("unscaledContentBounds = " + h());
        sb2.append('\n');
        sb2.append("contentLayoutSize = " + C5254f.g(e()));
        sb2.append('\n');
        sb2.append("zoomSpec = " + j());
        sb2.append("\nPlease share this error message to https://github.com/saket/telephoto/issues/41?\n");
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public final C4671a d() {
        return (C4671a) this.f39493m.getValue();
    }

    public final long e() {
        return ((C5254f) this.f39491k.getValue()).f43640a;
    }

    public final w f() {
        return (w) this.f39482b.getValue();
    }

    public final C4674d g() {
        return (C4674d) this.f39487g.getValue();
    }

    public final C5252d h() {
        return (C5252d) this.f39492l.getValue();
    }

    public final v i() {
        return (v) this.f39490j.getValue();
    }

    public final C4688s j() {
        return (C4688s) this.f39488h.getValue();
    }

    public final boolean k() {
        return ((Boolean) this.f39496p.getValue()).booleanValue();
    }

    public final boolean l() {
        C4674d g10;
        C4671a d10 = d();
        if (d10 == null || (g10 = g()) == null) {
            return false;
        }
        r rVar = j().f39506d;
        AbstractC3557B.c0("range", rVar);
        long j6 = d10.f39433a;
        C4672b n10 = L1.n(j6, rVar);
        C4672b m10 = L1.m(j6, rVar);
        float f6 = 1;
        float f10 = (f6 - 0.0f) * n10.f39435b;
        float f11 = (f6 + 0.0f) * m10.f39435b;
        float f12 = g10.f39438b;
        if (Math.abs(f12 - new C4672b(j6, com.google.android.gms.internal.play_billing.N.o(f12, f10, f11)).f39435b) <= 0.01f) {
            return false;
        }
        return true;
    }

    public final long m(long j6, long j10, long j11, C4672b c4672b, C4672b c4672b2) {
        if (R4.b.v1(j6)) {
            long g10 = C5251c.g(C5251c.h(j6, P4.a.J(j10, c4672b)), C5251c.h(P4.a.J(j10, c4672b2), P4.a.J(j11, c4672b)));
            if (R4.b.v1(g10)) {
                return g10;
            }
            throw new IllegalStateException("retainCentroidPositionAfterZoom() generated an infinite value. ".concat(c(new C3959i("centroid", new C5251c(j10)), new C3959i("panDelta", new C5251c(j11)), new C3959i("oldZoom", c4672b), new C3959i("newZoom", c4672b2))).toString());
        }
        throw new IllegalStateException("Can't center around an infinite offset ".concat(c(new C3959i[0])).toString());
    }

    public final Object n(AbstractC4825e abstractC4825e) {
        if (k()) {
            C4674d g10 = g();
            AbstractC3557B.Z(g10);
            C4671a d10 = d();
            AbstractC3557B.Z(d10);
            r rVar = j().f39506d;
            AbstractC3557B.c0("range", rVar);
            long j6 = d10.f39433a;
            float f6 = 1;
            Object a5 = this.f39497q.a(B0.f14Y, new C4682l(g10, new C4672b(j6, com.google.android.gms.internal.play_billing.N.o(g10.f39438b, (f6 - 0.0f) * L1.n(j6, rVar).f39435b, (f6 + 0.0f) * L1.m(j6, rVar).f39435b)).f39435b, null), abstractC4825e);
            if (a5 == EnumC5000a.f41328Y) {
                return a5;
            }
            return jf.y.f36177a;
        }
        throw new IllegalStateException("shouldn't have gotten called".toString());
    }
}
