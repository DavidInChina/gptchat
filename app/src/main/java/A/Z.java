package A;

import E0.AbstractC0461u;
import G0.AbstractC0579h;
import G0.AbstractC0587p;
import G0.AbstractC0591u;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import l0.AbstractC4325q;

/* loaded from: classes2.dex */
public final class Z extends AbstractC0587p implements p0.d, G0.B, G0.v0, AbstractC0591u {

    /* renamed from: A0  reason: collision with root package name */
    public final I.g f143A0;

    /* renamed from: u0  reason: collision with root package name */
    public p0.p f144u0;

    /* renamed from: v0  reason: collision with root package name */
    public final C0011c0 f145v0;

    /* renamed from: w0  reason: collision with root package name */
    public final W f146w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C0009b0 f147x0;

    /* renamed from: y0  reason: collision with root package name */
    public final C0017f0 f148y0;

    /* renamed from: z0  reason: collision with root package name */
    public final I.f f149z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [A.c0, l0.q] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l0.q, A.W] */
    /* JADX WARN: Type inference failed for: r3v1, types: [A.b0, l0.q] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l0.q, A.f0] */
    public Z(D.m mVar) {
        ?? abstractC4325q = new AbstractC4325q();
        new LinkedHashMap();
        A0(abstractC4325q);
        this.f145v0 = abstractC4325q;
        ?? abstractC4325q2 = new AbstractC4325q();
        abstractC4325q2.f128s0 = mVar;
        A0(abstractC4325q2);
        this.f146w0 = abstractC4325q2;
        ?? abstractC4325q3 = new AbstractC4325q();
        A0(abstractC4325q3);
        this.f147x0 = abstractC4325q3;
        ?? abstractC4325q4 = new AbstractC4325q();
        A0(abstractC4325q4);
        this.f148y0 = abstractC4325q4;
        I.f fVar = new I.f();
        this.f149z0 = fVar;
        I.g gVar = new I.g(fVar);
        A0(gVar);
        this.f143A0 = gVar;
    }

    @Override // G0.v0
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // G0.B
    public final void I(G0.g0 g0Var) {
        this.f143A0.f7912t0 = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [D.k, java.lang.Object, D.d] */
    @Override // p0.d
    public final void U(p0.p pVar) {
        wf.k kVar;
        wf.k kVar2;
        if (!AbstractC3557B.K(this.f144u0, pVar)) {
            boolean a5 = pVar.a();
            G.M m10 = null;
            if (a5) {
                Ad.l.O0(p0(), null, null, new Y(this, null), 3);
            }
            if (this.f37732r0) {
                AbstractC0579h.v(this);
            }
            W w10 = this.f146w0;
            D.m mVar = w10.f128s0;
            if (mVar != null) {
                if (a5) {
                    D.d dVar = w10.f129t0;
                    if (dVar != null) {
                        w10.A0(mVar, new D.e(dVar));
                        w10.f129t0 = null;
                    }
                    ?? obj = new Object();
                    w10.A0(mVar, obj);
                    w10.f129t0 = obj;
                } else {
                    D.d dVar2 = w10.f129t0;
                    if (dVar2 != null) {
                        w10.A0(mVar, new D.e(dVar2));
                        w10.f129t0 = null;
                    }
                }
            }
            C0017f0 c0017f0 = this.f148y0;
            if (a5 != c0017f0.f199s0) {
                if (!a5) {
                    if (c0017f0.f37732r0) {
                        kVar2 = (wf.k) E9.f.a(c0017f0, AbstractC0015e0.f192a);
                    } else {
                        kVar2 = null;
                    }
                    if (kVar2 != null) {
                        kVar2.invoke(null);
                    }
                } else {
                    AbstractC0461u abstractC0461u = c0017f0.f200t0;
                    if (abstractC0461u != null && abstractC0461u.i()) {
                        if (c0017f0.f37732r0) {
                            kVar = (wf.k) E9.f.a(c0017f0, AbstractC0015e0.f192a);
                        } else {
                            kVar = null;
                        }
                        if (kVar != null) {
                            kVar.invoke(c0017f0.f200t0);
                        }
                    }
                }
                c0017f0.f199s0 = a5;
            }
            C0009b0 c0009b0 = this.f147x0;
            if (a5) {
                c0009b0.getClass();
                ?? obj2 = new Object();
                AbstractC0579h.y(c0009b0, new C0007a0(obj2, 0, c0009b0));
                G.M m11 = (G.M) obj2.f37622Y;
                if (m11 != null) {
                    m11.a();
                    m10 = m11;
                }
                c0009b0.f172s0 = m10;
            } else {
                G.M m12 = c0009b0.f172s0;
                if (m12 != null) {
                    m12.b();
                }
                c0009b0.f172s0 = null;
            }
            c0009b0.f173t0 = a5;
            this.f145v0.f180s0 = a5;
            this.f144u0 = pVar;
        }
    }

    @Override // G0.v0
    public final void W(L0.j jVar) {
        this.f145v0.W(jVar);
    }

    @Override // G0.AbstractC0591u
    public final void b0(G0.g0 g0Var) {
        this.f148y0.b0(g0Var);
    }

    @Override // G0.v0
    public final /* synthetic */ boolean l0() {
        return false;
    }

    @Override // G0.B
    public final /* synthetic */ void o(long j6) {
    }
}
