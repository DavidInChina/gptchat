package V;

import G0.J;
import Ng.F;
import Z.AbstractC1710f0;
import Z.G0;
import Z.l1;
import id.AbstractC3557B;
import j0.AbstractC3881F;
import j0.C3880E;
import java.util.Iterator;
import java.util.Map;
import q0.C5251c;
import q0.C5254f;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.C5643b;
import t0.C5644c;
import z.C6694e;

/* renamed from: V.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1458c extends u implements G0 {

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f17919Z;

    /* renamed from: h0  reason: collision with root package name */
    public final float f17920h0;

    /* renamed from: i0  reason: collision with root package name */
    public final l1 f17921i0;

    /* renamed from: j0  reason: collision with root package name */
    public final l1 f17922j0;

    /* renamed from: k0  reason: collision with root package name */
    public final j0.x f17923k0 = new j0.x();

    public C1458c(boolean z10, float f6, AbstractC1710f0 abstractC1710f0, AbstractC1710f0 abstractC1710f02) {
        super(z10, abstractC1710f02);
        this.f17919Z = z10;
        this.f17920h0 = f6;
        this.f17921i0 = abstractC1710f0;
        this.f17922j0 = abstractC1710f02;
    }

    @Override // Z.G0
    public final void a() {
        this.f17923k0.clear();
    }

    @Override // A.AbstractC0042s0
    public final void b(AbstractC5646e abstractC5646e) {
        long j6;
        float f6;
        Float f10;
        C1458c c1458c = this;
        long j10 = ((r0.r) c1458c.f17921i0.getValue()).f44265a;
        J j11 = (J) abstractC5646e;
        j11.a();
        c1458c.f(j11, c1458c.f17920h0, j10);
        Iterator it = c1458c.f17923k0.f35938Z.iterator();
        while (((AbstractC3881F) it).hasNext()) {
            p pVar = (p) ((Map.Entry) ((C3880E) it).next()).getValue();
            float f11 = ((h) c1458c.f17922j0.getValue()).f17935d;
            if (f11 == 0.0f) {
                j6 = j10;
            } else {
                long b10 = r0.r.b(j10, f11);
                Float f12 = pVar.f17955d;
                C5644c c5644c = j11.f5596Y;
                if (f12 == null) {
                    long g10 = c5644c.g();
                    float f13 = q.f17964a;
                    pVar.f17955d = Float.valueOf(Math.max(C5254f.d(g10), C5254f.b(g10)) * 0.3f);
                }
                Float f14 = pVar.f17956e;
                boolean z10 = pVar.f17954c;
                if (f14 == null) {
                    float f15 = pVar.f17953b;
                    if (Float.isNaN(f15)) {
                        f10 = Float.valueOf(q.a(j11, z10, c5644c.g()));
                    } else {
                        f10 = Float.valueOf(j11.R(f15));
                    }
                    pVar.f17956e = f10;
                }
                if (pVar.f17952a == null) {
                    pVar.f17952a = new C5251c(c5644c.c0());
                }
                if (pVar.f17957f == null) {
                    pVar.f17957f = new C5251c(R4.b.r(C5254f.d(c5644c.g()) / 2.0f, C5254f.b(c5644c.g()) / 2.0f));
                }
                if (((Boolean) pVar.f17963l.getValue()).booleanValue() && !((Boolean) pVar.f17962k.getValue()).booleanValue()) {
                    f6 = 1.0f;
                } else {
                    f6 = ((Number) pVar.f17958g.e()).floatValue();
                }
                Float f16 = pVar.f17955d;
                AbstractC3557B.Z(f16);
                float floatValue = f16.floatValue();
                Float f17 = pVar.f17956e;
                AbstractC3557B.Z(f17);
                float L10 = K4.J.L(floatValue, f17.floatValue(), ((Number) pVar.f17959h.e()).floatValue());
                C5251c c5251c = pVar.f17952a;
                AbstractC3557B.Z(c5251c);
                float d10 = C5251c.d(c5251c.f43623a);
                C5251c c5251c2 = pVar.f17957f;
                AbstractC3557B.Z(c5251c2);
                float d11 = C5251c.d(c5251c2.f43623a);
                C6694e c6694e = pVar.f17960i;
                float L11 = K4.J.L(d10, d11, ((Number) c6694e.e()).floatValue());
                C5251c c5251c3 = pVar.f17952a;
                AbstractC3557B.Z(c5251c3);
                j6 = j10;
                float e10 = C5251c.e(c5251c3.f43623a);
                C5251c c5251c4 = pVar.f17957f;
                AbstractC3557B.Z(c5251c4);
                long r10 = R4.b.r(L11, K4.J.L(e10, C5251c.e(c5251c4.f43623a), ((Number) c6694e.e()).floatValue()));
                long b11 = r0.r.b(b10, r0.r.d(b10) * f6);
                if (z10) {
                    float d12 = C5254f.d(c5644c.g());
                    float b12 = C5254f.b(c5644c.g());
                    C5643b c5643b = c5644c.f45612Z;
                    long b13 = c5643b.b();
                    c5643b.a().h();
                    c5643b.f45609a.a(0.0f, 0.0f, d12, b12, 1);
                    AbstractC5648g.c(j11, b11, L10, r10, null, 120);
                    c5643b.a().q();
                    c5643b.c(b13);
                } else {
                    AbstractC5648g.c(j11, b11, L10, r10, null, 120);
                }
            }
            c1458c = this;
            j10 = j6;
        }
    }

    @Override // Z.G0
    public final void c() {
        this.f17923k0.clear();
    }

    @Override // V.u
    public final void e(D.p pVar, F f6) {
        C5251c c5251c;
        j0.x xVar = this.f17923k0;
        Iterator it = xVar.f35938Z.iterator();
        while (it.hasNext()) {
            p pVar2 = (p) ((Map.Entry) it.next()).getValue();
            pVar2.f17963l.setValue(Boolean.TRUE);
            pVar2.f17961j.b0(jf.y.f36177a);
        }
        boolean z10 = this.f17919Z;
        if (z10) {
            c5251c = new C5251c(pVar.f3192a);
        } else {
            c5251c = null;
        }
        p pVar3 = new p(c5251c, this.f17920h0, z10);
        xVar.put(pVar, pVar3);
        Ad.l.O0(f6, null, null, new C1457b(pVar3, this, pVar, null), 3);
    }

    @Override // V.u
    public final void g(D.p pVar) {
        p pVar2 = (p) this.f17923k0.get(pVar);
        if (pVar2 != null) {
            pVar2.f17963l.setValue(Boolean.TRUE);
            pVar2.f17961j.b0(jf.y.f36177a);
        }
    }

    @Override // Z.G0
    public final void d() {
    }
}
