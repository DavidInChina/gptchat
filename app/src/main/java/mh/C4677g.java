package mh;

import E0.AbstractC0454m;
import E0.j0;
import id.AbstractC3557B;
import jh.L1;
import l0.AbstractC4313e;
import oh.C5020g;
import oh.C5024k;
import q0.C5251c;
import q0.C5252d;
import q0.C5254f;
import wf.AbstractC6216a;

/* renamed from: mh.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4677g extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39443Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4686p f39444Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4677g(C4686p c4686p, int i10) {
        super(0);
        this.f39443Y = i10;
        this.f39444Z = c4686p;
    }

    public final C5252d a() {
        C5252d c5252d;
        v vVar;
        C5252d c5252d2 = C5252d.f43624e;
        int i10 = this.f39443Y;
        C4686p c4686p = this.f39444Z;
        switch (i10) {
            case 3:
                w f6 = c4686p.f();
                if (((oh.l) f6).f41425a) {
                    C5252d h10 = c4686p.h();
                    int i11 = r0.P.f44226c;
                    long h11 = androidx.compose.ui.graphics.a.h(0.0f, 0.0f);
                    C4685o c4685o = new C4685o(f6, 0);
                    AbstractC3557B.c0("$this$withOrigin", h10);
                    long r10 = R4.b.r(r0.P.a(h11) * C5254f.d(h10.d()), r0.P.b(h11) * C5254f.b(h10.d()));
                    return ((C5252d) c4685o.invoke(h10.i(C5251c.k(r10)))).i(r10);
                }
                C5020g c5020g = (C5020g) c4686p.f39494n.getValue();
                if (c5020g != null) {
                    Z0.k kVar = (Z0.k) c5020g.f41419b.getValue();
                    if (kVar != null) {
                        long j6 = C5254f.f43638c;
                        long j10 = c5020g.f41418a;
                        if (j10 != j6) {
                            vVar = new C4687q(j10, (AbstractC0454m) c4686p.f39484d.getValue(), (AbstractC4313e) c4686p.f39485e.getValue());
                        } else {
                            vVar = t.f39507a;
                        }
                        c5252d = vVar.b(Ng.H.z(kVar.f22804a), (Z0.l) c4686p.f39489i.getValue());
                    } else {
                        c5252d = null;
                    }
                    if (c5252d != null) {
                        return c5252d;
                    }
                    return c5252d2;
                }
                return c5252d2;
            default:
                if (c4686p.k()) {
                    return c4686p.i().b(c4686p.e(), (Z0.l) c4686p.f39489i.getValue());
                }
                return c5252d2;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        long a5;
        boolean z10 = false;
        int i10 = this.f39443Y;
        float f6 = 1.0f;
        C4686p c4686p = this.f39444Z;
        switch (i10) {
            case 0:
                if (!c4686p.k()) {
                    return null;
                }
                long a10 = ((AbstractC0454m) c4686p.f39484d.getValue()).a(c4686p.h().d(), c4686p.e());
                C4671a c4671a = new C4671a(a10);
                int i11 = j0.f4070b;
                if (a10 == androidx.compose.ui.layout.a.a(0.0f, 0.0f)) {
                    z10 = true;
                }
                if (!z10) {
                    return c4671a;
                }
                throw new IllegalStateException(("Base zoom shouldn't be zero. content bounds = " + c4686p.h() + ", layout size = " + C5254f.g(c4686p.e())).toString());
            case 1:
                C4671a d10 = c4686p.d();
                C4674d g10 = c4686p.g();
                if (g10 != null && d10 != null) {
                    long j6 = d10.f39433a;
                    float a11 = j0.a(j6);
                    float f10 = g10.f39438b;
                    return new oh.l(true, androidx.compose.ui.layout.a.a(a11 * f10, j0.b(j6) * f10), new C5024k(j6, f10), P4.a.L0(C5251c.k(g10.f39437a), androidx.compose.ui.layout.a.a(j0.a(j6) * f10, j0.b(j6) * f10)), new C5251c(g10.f39439c), g10.f39440d);
                }
                long j10 = C5254f.f43637b;
                if (c4686p.f39481a) {
                    a5 = androidx.compose.ui.layout.a.a(1.0f, 1.0f);
                } else {
                    int i12 = j0.f4070b;
                    a5 = androidx.compose.ui.layout.a.a(0.0f, 0.0f);
                }
                long j11 = a5;
                int i13 = j0.f4070b;
                return new oh.l(false, j11, new C5024k(androidx.compose.ui.layout.a.a(0.0f, 0.0f), 0.0f), C5251c.f43619b, null, j10);
            case 2:
                if (C5254f.c(c4686p.e()) > 0.0f) {
                    long a12 = c4686p.i().a(c4686p.e());
                    if (a12 != C5254f.f43638c && C5254f.c(a12) > 0.0f) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case 3:
                return a();
            case 4:
                return a();
            default:
                C4674d g11 = c4686p.g();
                C4671a d11 = c4686p.d();
                if (g11 == null || d11 == null) {
                    return null;
                }
                r rVar = c4686p.j().f39506d;
                long j12 = d11.f39433a;
                C4672b n10 = L1.n(j12, rVar);
                C4672b m10 = L1.m(j12, c4686p.j().f39506d);
                float f11 = g11.f39438b;
                float f12 = n10.f39435b;
                float f13 = m10.f39435b;
                float o10 = com.google.android.gms.internal.play_billing.N.o(f11, f12, f13);
                if (Float.compare(o10, f12) != 0 || Float.compare(f12, f13) != 0) {
                    f6 = com.google.android.gms.internal.play_billing.N.o((o10 - f12) / (f13 - f12), 0.0f, 1.0f);
                }
                return Float.valueOf(f6);
        }
    }
}
