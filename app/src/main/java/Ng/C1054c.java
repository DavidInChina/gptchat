package Ng;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Ng.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1054c extends AbstractC1081p0 {

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12928m0 = AtomicReferenceFieldUpdater.newUpdater(C1054c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC1070k f12929j0;

    /* renamed from: k0  reason: collision with root package name */
    public T f12930k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C1058e f12931l0;

    public C1054c(C1058e c1058e, C1072l c1072l) {
        this.f12931l0 = c1058e;
        this.f12929j0 = c1072l;
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        p((Throwable) obj);
        return jf.y.f36177a;
    }

    @Override // Ng.AbstractC1081p0
    public final void p(Throwable th2) {
        AbstractC1070k abstractC1070k = this.f12929j0;
        if (th2 != null) {
            Q1.u o10 = abstractC1070k.o(th2);
            if (o10 != null) {
                abstractC1070k.B(o10);
                C1056d c1056d = (C1056d) f12928m0.get(this);
                if (c1056d != null) {
                    c1056d.e();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1058e.f12934b;
        C1058e c1058e = this.f12931l0;
        if (atomicIntegerFieldUpdater.decrementAndGet(c1058e) == 0) {
            K[] kArr = c1058e.f12935a;
            ArrayList arrayList = new ArrayList(kArr.length);
            for (K k10 : kArr) {
                arrayList.add(k10.p());
            }
            abstractC1070k.resumeWith(arrayList);
        }
    }
}
