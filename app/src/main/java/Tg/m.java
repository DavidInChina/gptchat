package Tg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17263b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17264c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17265d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17266e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f17267a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17264c;
        if (atomicIntegerFieldUpdater.get(this) - f17265d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f17252Z.f36244Y == 1) {
            f17266e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f17267a;
            if (atomicReferenceArray.get(i10) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i10, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17265d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f17264c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (iVar = (i) this.f17267a.getAndSet(i11, null)) != null) {
                if (iVar.f17252Z.f36244Y == 1) {
                    f17266e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i10, boolean z10) {
        int i11 = i10 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f17267a;
        i iVar = (i) atomicReferenceArray.get(i11);
        if (iVar != null) {
            boolean z11 = true;
            if (iVar.f17252Z.f36244Y != 1) {
                z11 = false;
            }
            if (z11 == z10) {
                while (!atomicReferenceArray.compareAndSet(i11, iVar, null)) {
                    if (atomicReferenceArray.get(i11) != iVar) {
                    }
                }
                if (z10) {
                    f17266e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
