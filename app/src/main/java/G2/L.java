package g2;

import Ng.AbstractC1073l0;
import java.util.concurrent.atomic.AtomicReference;
import nf.AbstractC4831k;

/* loaded from: classes.dex */
public final class L implements Ng.F {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Ng.F f31053Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicReference f31054Z = new AtomicReference(null);

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ H f31055h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f31056i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.n f31057j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f31058k0;

    public L(Ng.F f6, H h10, Ng.F f10, wf.n nVar, AtomicReference atomicReference) {
        this.f31055h0 = h10;
        this.f31056i0 = f10;
        this.f31057j0 = nVar;
        this.f31058k0 = atomicReference;
        this.f31053Y = f6;
    }

    public final long a() {
        Long l10 = (Long) this.f31054Z.get();
        if (l10 != null) {
            long longValue = l10.longValue();
            ((C3142G) this.f31055h0).getClass();
            long currentTimeMillis = longValue - System.currentTimeMillis();
            Mg.a aVar = Mg.b.f12127Z;
            return Df.H.y0(currentTimeMillis, Mg.d.f12133h0);
        }
        Mg.a aVar2 = Mg.b.f12127Z;
        return Mg.b.f12128h0;
    }

    public final void b(long j6) {
        if (Mg.b.e(j6) <= 0) {
            Ad.l.P(this.f31056i0, new I("Timed out immediately", this.f31057j0.hashCode()));
        } else if (Mg.b.c(a(), j6) < 0) {
        } else {
            AtomicReference atomicReference = this.f31054Z;
            ((C3142G) this.f31055h0).getClass();
            atomicReference.set(Long.valueOf(Mg.b.e(j6) + System.currentTimeMillis()));
            H h10 = this.f31055h0;
            Ng.F f6 = this.f31056i0;
            AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) this.f31058k0.getAndSet(Ad.l.O0(f6, null, null, new K(this, h10, f6, this.f31057j0, null), 3));
            if (abstractC1073l0 != null) {
                abstractC1073l0.k(null);
            }
        }
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f31053Y.i();
    }
}
