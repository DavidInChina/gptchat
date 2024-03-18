package Ng;

import Sg.AbstractC1389a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public final class O extends Sg.y {

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12901j0 = AtomicIntegerFieldUpdater.newUpdater(O.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // Sg.y, Ng.v0
    public final void w(Object obj) {
        y(obj);
    }

    @Override // Sg.y, Ng.v0
    public final void y(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f12901j0;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC1389a.c(AbstractC5260f.z(this.f16686i0), P4.a.z0(obj), null);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
