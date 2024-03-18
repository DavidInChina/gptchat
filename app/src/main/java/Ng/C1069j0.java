package Ng;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Ng.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1069j0 extends AbstractC1077n0 {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12949k0 = AtomicIntegerFieldUpdater.newUpdater(C1069j0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: j0  reason: collision with root package name */
    public final wf.k f12950j0;

    public C1069j0(wf.k kVar) {
        this.f12950j0 = kVar;
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        p((Throwable) obj);
        return jf.y.f36177a;
    }

    @Override // Ng.AbstractC1081p0
    public final void p(Throwable th2) {
        if (f12949k0.compareAndSet(this, 0, 1)) {
            this.f12950j0.invoke(th2);
        }
    }
}
