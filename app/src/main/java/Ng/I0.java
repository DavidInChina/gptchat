package Ng;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class I0 implements wf.k {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12888h0 = AtomicIntegerFieldUpdater.newUpdater(I0.class, "_state$volatile");

    /* renamed from: Y  reason: collision with root package name */
    public final Thread f12889Y = Thread.currentThread();

    /* renamed from: Z  reason: collision with root package name */
    public T f12890Z;
    private volatile /* synthetic */ int _state$volatile;

    public I0(AbstractC1073l0 abstractC1073l0) {
    }

    public static void c(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void a() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12888h0;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        c(i10);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 1)) {
                T t10 = this.f12890Z;
                if (t10 != null) {
                    t10.dispose();
                    return;
                }
                return;
            }
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12888h0;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    c(i10);
                    throw null;
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 2)) {
                this.f12889Y.interrupt();
                atomicIntegerFieldUpdater.set(this, 3);
                break;
            }
        }
        return jf.y.f36177a;
    }
}
