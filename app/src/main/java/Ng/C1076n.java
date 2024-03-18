package Ng;

import Sg.AbstractC1389a;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nf.AbstractC4825e;

/* renamed from: Ng.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076n extends AbstractC1077n0 {

    /* renamed from: j0  reason: collision with root package name */
    public final C1072l f12960j0;

    public C1076n(C1072l c1072l) {
        this.f12960j0 = c1072l;
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        p((Throwable) obj);
        return jf.y.f36177a;
    }

    @Override // Ng.AbstractC1081p0
    public final void p(Throwable th2) {
        v0 o10 = o();
        C1072l c1072l = this.f12960j0;
        Throwable r10 = c1072l.r(o10);
        if (c1072l.z()) {
            AbstractC4825e abstractC4825e = c1072l.f12955i0;
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", abstractC4825e);
            Sg.i iVar = (Sg.i) abstractC4825e;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Sg.i.f16655m0;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                Q1.u uVar = AbstractC1389a.f16644d;
                if (AbstractC3557B.K(obj, uVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(iVar, uVar, r10)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != uVar) {
                            break;
                        }
                    }
                    return;
                } else if (!(obj instanceof Throwable)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    return;
                }
            }
        }
        c1072l.s(r10);
        if (!c1072l.z()) {
            c1072l.n();
        }
    }
}
