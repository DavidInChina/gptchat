package io.ktor.utils.io.internal;

import Ng.AbstractC1073l0;
import Ng.T;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.y;

/* loaded from: classes2.dex */
public final class a implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1073l0 f33445Y;

    /* renamed from: Z  reason: collision with root package name */
    public T f33446Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ b f33447h0;

    public a(b bVar, AbstractC1073l0 abstractC1073l0) {
        this.f33447h0 = bVar;
        this.f33445Y = abstractC1073l0;
        T C02 = L4.a.C0(abstractC1073l0, true, this, 2);
        if (abstractC1073l0.a()) {
            this.f33446Z = C02;
        }
    }

    public final void a() {
        T t10 = this.f33446Z;
        if (t10 != null) {
            this.f33446Z = null;
            t10.dispose();
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th2 = (Throwable) obj;
        b bVar = this.f33447h0;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f33449Z;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, this, null)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == this);
        a();
        if (th2 != null) {
            b.b(bVar, this.f33445Y, th2);
        }
        return y.f36177a;
    }
}
