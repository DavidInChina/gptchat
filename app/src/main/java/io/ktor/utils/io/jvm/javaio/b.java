package io.ktor.utils.io.jvm.javaio;

import Ng.AbstractC1073l0;
import Ng.T;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.C3960j;
import jf.C3961k;
import jf.y;
import nf.AbstractC4825e;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class b implements AbstractC4825e {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4831k f33488Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c f33489Z;

    public b(c cVar) {
        AbstractC4831k abstractC4831k;
        this.f33489Z = cVar;
        AbstractC1073l0 abstractC1073l0 = cVar.f33491a;
        if (abstractC1073l0 != null) {
            abstractC4831k = n.f33515Z.plus(abstractC1073l0);
        } else {
            abstractC4831k = n.f33515Z;
        }
        this.f33488Y = abstractC4831k;
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        return this.f33488Y;
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        AbstractC1073l0 abstractC1073l0;
        Throwable a5;
        Object a10 = C3961k.a(obj);
        if (a10 == null) {
            a10 = y.f36177a;
        }
        c cVar = this.f33489Z;
        while (true) {
            Object obj2 = cVar.state;
            boolean z10 = obj2 instanceof Thread;
            if (z10 || (obj2 instanceof AbstractC4825e) || AbstractC3557B.K(obj2, this)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f33490f;
                while (!atomicReferenceFieldUpdater.compareAndSet(cVar, obj2, a10)) {
                    if (atomicReferenceFieldUpdater.get(cVar) != obj2) {
                        break;
                    }
                }
                if (z10) {
                    k.a().b(obj2);
                } else if ((obj2 instanceof AbstractC4825e) && (a5 = C3961k.a(obj)) != null) {
                    ((AbstractC4825e) obj2).resumeWith(N.w(a5));
                }
                if ((obj instanceof C3960j) && !(C3961k.a(obj) instanceof CancellationException) && (abstractC1073l0 = this.f33489Z.f33491a) != null) {
                    abstractC1073l0.k(null);
                }
                T t10 = this.f33489Z.f33493c;
                if (t10 != null) {
                    t10.dispose();
                    return;
                }
                return;
            }
            return;
        }
    }
}
