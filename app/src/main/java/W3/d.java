package W3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends r.f {

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20704f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20705g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20706h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20707i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20708j;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f20704f = atomicReferenceFieldUpdater;
        this.f20705g = atomicReferenceFieldUpdater2;
        this.f20706h = atomicReferenceFieldUpdater3;
        this.f20707i = atomicReferenceFieldUpdater4;
        this.f20708j = atomicReferenceFieldUpdater5;
    }

    @Override // r.f
    public final void S(f fVar, f fVar2) {
        this.f20705g.lazySet(fVar, fVar2);
    }

    @Override // r.f
    public final void T(f fVar, Thread thread) {
        this.f20704f.lazySet(fVar, thread);
    }

    @Override // r.f
    public final boolean i(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f20707i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // r.f
    public final boolean j(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f20708j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // r.f
    public final boolean k(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f20706h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
