package Sg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16675a = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new s(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16675a;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            int a5 = sVar.a(obj);
            if (a5 == 0) {
                return true;
            }
            if (a5 != 1) {
                if (a5 == 2) {
                    return false;
                }
            } else {
                s c10 = sVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c10) && atomicReferenceFieldUpdater.get(this) == sVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16675a;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar.b()) {
                return;
            }
            s c10 = sVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c10) && atomicReferenceFieldUpdater.get(this) == sVar) {
            }
        }
    }

    public final int c() {
        s sVar = (s) f16675a.get(this);
        sVar.getClass();
        long j6 = s.f16678f.get(sVar);
        return (((int) ((j6 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j6))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16675a;
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            Object d10 = sVar.d();
            if (d10 != s.f16679g) {
                return d10;
            }
            s c10 = sVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c10) && atomicReferenceFieldUpdater.get(this) == sVar) {
            }
        }
    }
}
