package A;

import G0.AbstractC0590t;
import id.AbstractC3557B;
import l0.AbstractC4325q;
import nf.AbstractC4828h;
import q0.AbstractC5249a;
import q0.C5252d;
import q0.C5253e;
import q0.C5254f;
import r0.AbstractC5350n;
import r0.C5336C;
import r0.C5344h;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.AbstractC5650i;
import t0.C5644c;
import t0.C5649h;
import t0.C5653l;

/* renamed from: A.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0038q extends AbstractC4325q implements AbstractC0590t {

    /* renamed from: s0  reason: collision with root package name */
    public long f275s0;

    /* renamed from: t0  reason: collision with root package name */
    public AbstractC5350n f276t0;

    /* renamed from: u0  reason: collision with root package name */
    public float f277u0;

    /* renamed from: v0  reason: collision with root package name */
    public r0.L f278v0;

    /* renamed from: w0  reason: collision with root package name */
    public C5254f f279w0;

    /* renamed from: x0  reason: collision with root package name */
    public Z0.l f280x0;

    /* renamed from: y0  reason: collision with root package name */
    public r0.G f281y0;

    /* renamed from: z0  reason: collision with root package name */
    public r0.L f282z0;

    @Override // G0.AbstractC0590t
    public final void f(AbstractC5646e abstractC5646e) {
        r0.G g10;
        if (this.f278v0 == r0.G.f44171a) {
            if (!r0.r.c(this.f275s0, r0.r.f44263k)) {
                AbstractC5648g.k(abstractC5646e, this.f275s0, 0L, 0L, 0.0f, 126);
            }
            AbstractC5350n abstractC5350n = this.f276t0;
            if (abstractC5350n != null) {
                AbstractC5648g.j(abstractC5646e, abstractC5350n, 0L, 0L, this.f277u0, null, 118);
            }
        } else {
            G0.J j6 = (G0.J) abstractC5646e;
            long g11 = j6.f5596Y.g();
            C5254f c5254f = this.f279w0;
            int i10 = C5254f.f43639d;
            boolean z10 = c5254f instanceof C5254f;
            C5644c c5644c = j6.f5596Y;
            if (z10 && g11 == c5254f.f43640a && j6.getLayoutDirection() == this.f280x0 && AbstractC3557B.K(this.f282z0, this.f278v0)) {
                g10 = this.f281y0;
                AbstractC3557B.Z(g10);
            } else {
                g10 = this.f278v0.c(c5644c.g(), j6.getLayoutDirection(), abstractC5646e);
            }
            boolean c10 = r0.r.c(this.f275s0, r0.r.f44263k);
            C5653l c5653l = C5653l.f45622a;
            if (!c10) {
                long j10 = this.f275s0;
                AbstractC5650i.f45621D.getClass();
                int i11 = C5649h.f45619b;
                if (g10 instanceof C5336C) {
                    C5252d c5252d = ((C5336C) g10).f44168k;
                    j6.m0(j10, R4.b.r(c5252d.f43625a, c5252d.f43626b), AbstractC4828h.i(c5252d.f(), c5252d.c()), 1.0f, c5653l, null, i11);
                } else if (g10 instanceof r0.D) {
                    r0.D d10 = (r0.D) g10;
                    C5344h c5344h = d10.f44170l;
                    if (c5344h != null) {
                        j6.r(c5344h, j10, 1.0f, c5653l, null, i11);
                    } else {
                        C5253e c5253e = d10.f44169k;
                        float b10 = AbstractC5249a.b(c5253e.f43636h);
                        j6.k(j10, R4.b.r(c5253e.f43629a, c5253e.f43630b), AbstractC4828h.i(c5253e.b(), c5253e.a()), Ng.H.b(b10, b10), c5653l, 1.0f, null, i11);
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            AbstractC5350n abstractC5350n2 = this.f276t0;
            if (abstractC5350n2 != null) {
                float f6 = this.f277u0;
                AbstractC5650i.f45621D.getClass();
                int i12 = C5649h.f45619b;
                if (g10 instanceof C5336C) {
                    C5252d c5252d2 = ((C5336C) g10).f44168k;
                    j6.Y(abstractC5350n2, R4.b.r(c5252d2.f43625a, c5252d2.f43626b), AbstractC4828h.i(c5252d2.f(), c5252d2.c()), f6, c5653l, null, i12);
                } else if (g10 instanceof r0.D) {
                    r0.D d11 = (r0.D) g10;
                    C5344h c5344h2 = d11.f44170l;
                    if (c5344h2 != null) {
                        j6.f0(c5344h2, abstractC5350n2, f6, c5653l, null, i12);
                    } else {
                        C5253e c5253e2 = d11.f44169k;
                        float b11 = AbstractC5249a.b(c5253e2.f43636h);
                        j6.L(abstractC5350n2, R4.b.r(c5253e2.f43629a, c5253e2.f43630b), AbstractC4828h.i(c5253e2.b(), c5253e2.a()), Ng.H.b(b11, b11), f6, c5653l, null, i12);
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            this.f281y0 = g10;
            this.f279w0 = new C5254f(c5644c.g());
            this.f280x0 = j6.getLayoutDirection();
            this.f282z0 = this.f278v0;
        }
        ((G0.J) abstractC5646e).a();
    }

    @Override // G0.AbstractC0590t
    public final /* synthetic */ void G() {
    }
}
