package Sg;

import Ng.C1072l;
import Ng.J;
import Ng.M;
import Ng.T;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class n extends Ng.B implements M {

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16666l0 = AtomicIntegerFieldUpdater.newUpdater(n.class, "runningWorkers$volatile");

    /* renamed from: Z  reason: collision with root package name */
    public final Ng.B f16667Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f16668h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ M f16669i0;

    /* renamed from: j0  reason: collision with root package name */
    public final q f16670j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f16671k0;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public n(Ng.B b10, int i10) {
        M m10;
        this.f16667Z = b10;
        this.f16668h0 = i10;
        if (b10 instanceof M) {
            m10 = (M) b10;
        } else {
            m10 = null;
        }
        this.f16669i0 = m10 == null ? J.f12891a : m10;
        this.f16670j0 = new q();
        this.f16671k0 = new Object();
    }

    public final boolean F0() {
        synchronized (this.f16671k0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16666l0;
            if (atomicIntegerFieldUpdater.get(this) >= this.f16668h0) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // Ng.B
    public final void O(AbstractC4831k abstractC4831k, Runnable runnable) {
        Runnable w02;
        this.f16670j0.a(runnable);
        if (f16666l0.get(this) < this.f16668h0 && F0() && (w02 = w0()) != null) {
            this.f16667Z.O(this, new m(this, w02));
        }
    }

    @Override // Ng.M
    public final void h(long j6, C1072l c1072l) {
        this.f16669i0.h(j6, c1072l);
    }

    @Override // Ng.M
    public final T i(long j6, Runnable runnable, AbstractC4831k abstractC4831k) {
        return this.f16669i0.i(j6, runnable, abstractC4831k);
    }

    @Override // Ng.B
    public final void r(AbstractC4831k abstractC4831k, Runnable runnable) {
        Runnable w02;
        this.f16670j0.a(runnable);
        if (f16666l0.get(this) < this.f16668h0 && F0() && (w02 = w0()) != null) {
            this.f16667Z.r(this, new m(this, w02));
        }
    }

    public final Runnable w0() {
        while (true) {
            Runnable runnable = (Runnable) this.f16670j0.d();
            if (runnable == null) {
                synchronized (this.f16671k0) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16666l0;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f16670j0.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }
}
