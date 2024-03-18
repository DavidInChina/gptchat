package Ng;

import id.AbstractC3557B;
import java.util.concurrent.locks.LockSupport;
import nf.AbstractC4831k;

/* renamed from: Ng.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1062g extends AbstractC1050a {

    /* renamed from: i0  reason: collision with root package name */
    public final Thread f12941i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC1053b0 f12942j0;

    public C1062g(AbstractC4831k abstractC4831k, Thread thread, AbstractC1053b0 abstractC1053b0) {
        super(abstractC4831k, true, true);
        this.f12941i0 = thread;
        this.f12942j0 = abstractC1053b0;
    }

    @Override // Ng.v0
    public final void w(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f12941i0;
        if (!AbstractC3557B.K(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
