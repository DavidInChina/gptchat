package Ng;

import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Ng.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1081p0 extends Sg.p implements T, AbstractC1063g0, wf.k {

    /* renamed from: i0  reason: collision with root package name */
    public v0 f12963i0;

    @Override // Ng.AbstractC1063g0
    public final boolean a() {
        return true;
    }

    @Override // Ng.T
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        v0 o10 = o();
        while (true) {
            Object U10 = o10.U();
            if (U10 instanceof AbstractC1081p0) {
                if (U10 == this) {
                    V v10 = H.f12882j;
                    do {
                        atomicReferenceFieldUpdater2 = v0.f12989Y;
                        if (atomicReferenceFieldUpdater2.compareAndSet(o10, U10, v10)) {
                            return;
                        }
                    } while (atomicReferenceFieldUpdater2.get(o10) == U10);
                } else {
                    return;
                }
            } else if (!(U10 instanceof AbstractC1063g0) || ((AbstractC1063g0) U10).e() == null) {
                return;
            } else {
                while (true) {
                    Object i10 = i();
                    if (i10 instanceof Sg.w) {
                        Sg.p pVar = ((Sg.w) i10).f16685a;
                        return;
                    } else if (i10 == this) {
                        Sg.p pVar2 = (Sg.p) i10;
                        return;
                    } else {
                        AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", i10);
                        Sg.p pVar3 = (Sg.p) i10;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = Sg.p.f16674h0;
                        Sg.w wVar = (Sg.w) atomicReferenceFieldUpdater3.get(pVar3);
                        if (wVar == null) {
                            wVar = new Sg.w(pVar3);
                            atomicReferenceFieldUpdater3.set(pVar3, wVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = Sg.p.f16672Y;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, i10, wVar)) {
                                pVar3.f();
                                return;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == i10);
                    }
                }
            }
        }
    }

    @Override // Ng.AbstractC1063g0
    public final y0 e() {
        return null;
    }

    public AbstractC1073l0 getParent() {
        return o();
    }

    public final v0 o() {
        v0 v0Var = this.f12963i0;
        if (v0Var != null) {
            return v0Var;
        }
        AbstractC3557B.C2("job");
        throw null;
    }

    public abstract void p(Throwable th2);

    @Override // Sg.p
    public final String toString() {
        return getClass().getSimpleName() + '@' + H.q(this) + "[job@" + H.q(o()) + ']';
    }
}
