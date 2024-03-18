package io.ktor.utils.io.internal;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.C3961k;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class b implements AbstractC4825e {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33448Y = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "state");

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33449Z = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "jobCancellationHandler");
    private volatile /* synthetic */ Object state = null;
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    public static final void b(b bVar, AbstractC1073l0 abstractC1073l0, Throwable th2) {
        while (true) {
            Object obj = bVar.state;
            if ((obj instanceof AbstractC4825e) && ((AbstractC4825e) obj).getContext().get(C1071k0.f12951Y) == abstractC1073l0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33448Y;
                while (!atomicReferenceFieldUpdater.compareAndSet(bVar, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(bVar) != obj) {
                        break;
                    }
                }
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>", obj);
                ((AbstractC4825e) obj).resumeWith(N.w(th2));
                return;
            }
            return;
        }
    }

    public final void c(Throwable th2) {
        AbstractC3557B.c0(ParameterNames.CAUSE, th2);
        resumeWith(N.w(th2));
        a aVar = (a) f33449Z.getAndSet(this, null);
        if (aVar != null) {
            aVar.a();
        }
    }

    public final Object d(AbstractC4825e abstractC4825e) {
        AbstractC1073l0 abstractC1073l0;
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33448Y;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, abstractC4825e)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                AbstractC1073l0 abstractC1073l02 = (AbstractC1073l0) abstractC4825e.getContext().get(C1071k0.f12951Y);
                a aVar = (a) this.jobCancellationHandler;
                if (aVar != null) {
                    abstractC1073l0 = aVar.f33445Y;
                } else {
                    abstractC1073l0 = null;
                }
                if (abstractC1073l0 != abstractC1073l02) {
                    if (abstractC1073l02 == null) {
                        a aVar2 = (a) f33449Z.getAndSet(this, null);
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                    } else {
                        a aVar3 = new a(this, abstractC1073l02);
                        while (true) {
                            Object obj2 = this.jobCancellationHandler;
                            a aVar4 = (a) obj2;
                            if (aVar4 != null && aVar4.f33445Y == abstractC1073l02) {
                                aVar3.a();
                                break;
                            }
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f33449Z;
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, aVar3)) {
                                if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                    break;
                                }
                            }
                            if (aVar4 != null) {
                                aVar4.a();
                            }
                        }
                    }
                }
                return EnumC5000a.f41328Y;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f33448Y;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    break;
                }
            }
            if (!(obj instanceof Throwable)) {
                return obj;
            }
            throw ((Throwable) obj);
        }
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        AbstractC4825e abstractC4825e;
        AbstractC4831k context;
        Object obj = this.state;
        if (obj instanceof AbstractC4825e) {
            abstractC4825e = (AbstractC4825e) obj;
        } else {
            abstractC4825e = null;
        }
        if (abstractC4825e == null || (context = abstractC4825e.getContext()) == null) {
            return C4832l.f40334Y;
        }
        return context;
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        Object obj2;
        while (true) {
            Object obj3 = this.state;
            if (obj3 == null) {
                obj2 = C3961k.a(obj);
                if (obj2 == null) {
                    N.B0(obj);
                    obj2 = obj;
                }
            } else if (obj3 instanceof AbstractC4825e) {
                obj2 = null;
            } else {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33448Y;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, obj2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    break;
                }
            }
            if (obj3 instanceof AbstractC4825e) {
                ((AbstractC4825e) obj3).resumeWith(obj);
                return;
            }
            return;
        }
    }
}
