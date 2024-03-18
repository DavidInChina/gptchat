package e1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n.AbstractC4694e;

/* renamed from: e1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2765e extends AbstractC4694e {

    /* renamed from: Y  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f28727Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f28728Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f28729h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f28730i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f28731j0;

    public C2765e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f28727Y = atomicReferenceFieldUpdater;
        this.f28728Z = atomicReferenceFieldUpdater2;
        this.f28729h0 = atomicReferenceFieldUpdater3;
        this.f28730i0 = atomicReferenceFieldUpdater4;
        this.f28731j0 = atomicReferenceFieldUpdater5;
    }

    @Override // n.AbstractC4694e
    public final boolean g(AbstractC2767g abstractC2767g, C2764d c2764d, C2764d c2764d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f28730i0;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2767g, c2764d, c2764d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2767g) == c2764d);
        return false;
    }

    @Override // n.AbstractC4694e
    public final boolean i(AbstractC2767g abstractC2767g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f28731j0;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2767g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2767g) == obj);
        return false;
    }

    @Override // n.AbstractC4694e
    public final boolean j(AbstractC2767g abstractC2767g, C2766f c2766f, C2766f c2766f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f28729h0;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2767g, c2766f, c2766f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2767g) == c2766f);
        return false;
    }

    @Override // n.AbstractC4694e
    public final void m(C2766f c2766f, C2766f c2766f2) {
        this.f28728Z.lazySet(c2766f, c2766f2);
    }

    @Override // n.AbstractC4694e
    public final void n(C2766f c2766f, Thread thread) {
        this.f28727Y.lazySet(c2766f, thread);
    }
}
