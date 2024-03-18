package Pg;

import Ng.AbstractC1050a;
import Ng.C1075m0;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;

/* loaded from: classes.dex */
public abstract class p extends AbstractC1050a implements o {

    /* renamed from: i0  reason: collision with root package name */
    public final o f14244i0;

    public p(AbstractC4831k abstractC4831k, k kVar, boolean z10, boolean z11) {
        super(abstractC4831k, z10, z11);
        this.f14244i0 = kVar;
    }

    @Override // Ng.v0
    public final void D(CancellationException cancellationException) {
        this.f14244i0.k(cancellationException);
        C(cancellationException);
    }

    @Override // Pg.C
    public final Ug.c b() {
        return this.f14244i0.b();
    }

    @Override // Pg.C
    public final Ug.c c() {
        return this.f14244i0.c();
    }

    @Override // Pg.D
    public final void d(Xf.f fVar) {
        this.f14244i0.d(fVar);
    }

    @Override // Pg.C
    public final Object e() {
        return this.f14244i0.e();
    }

    @Override // Pg.C
    public final Object f(AbstractC4825e abstractC4825e) {
        Object f6 = this.f14244i0.f(abstractC4825e);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        return f6;
    }

    @Override // Pg.C
    public final Object g(AbstractC4825e abstractC4825e) {
        return this.f14244i0.g(abstractC4825e);
    }

    @Override // Pg.C
    public final C1171d iterator() {
        return this.f14244i0.iterator();
    }

    @Override // Ng.v0, Ng.AbstractC1073l0
    public final void k(CancellationException cancellationException) {
        if (m()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C1075m0(G(), null, this);
        }
        D(cancellationException);
    }

    @Override // Pg.D
    public boolean l(Throwable th2) {
        return this.f14244i0.l(th2);
    }

    @Override // Pg.D
    public Object n(Object obj, AbstractC4825e abstractC4825e) {
        return this.f14244i0.n(obj, abstractC4825e);
    }

    @Override // Pg.D
    public Object t(Object obj) {
        return this.f14244i0.t(obj);
    }

    @Override // Pg.D
    public final boolean u() {
        return this.f14244i0.u();
    }
}
