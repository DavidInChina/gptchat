package Sg;

import Ng.B0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public abstract class z extends AbstractC1393e implements B0 {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16687i0 = AtomicIntegerFieldUpdater.newUpdater(z.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: h0  reason: collision with root package name */
    public final long f16688h0;

    public z(long j6, z zVar, int i10) {
        super(zVar);
        this.f16688h0 = j6;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // Sg.AbstractC1393e
    public final boolean c() {
        if (f16687i0.get(this) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f16687i0.addAndGet(this, -65536) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i10, AbstractC4831k abstractC4831k);

    public final void h() {
        if (f16687i0.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f16687i0;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
