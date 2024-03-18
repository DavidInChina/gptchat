package Sg;

import K4.J;
import Ng.AbstractC1053b0;
import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.C1087v;
import Ng.C1088w;
import Ng.F0;
import Ng.G0;
import Ng.N0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.C3961k;
import nf.AbstractC4825e;
import nf.AbstractC4831k;

/* renamed from: Sg.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1389a {

    /* renamed from: a  reason: collision with root package name */
    public static final Q1.u f16641a = new Q1.u("NO_DECISION", 9, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final Q1.u f16642b = new Q1.u("CLOSED", 9, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final Q1.u f16643c = new Q1.u("UNDEFINED", 9, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final Q1.u f16644d = new Q1.u("REUSABLE_CLAIMED", 9, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final Q1.u f16645e = new Q1.u("CONDITION_FALSE", 9, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final Q1.u f16646f = new Q1.u("NO_THREAD_ELEMENTS", 9, 0);

    public static final Object a(z zVar, long j6, wf.n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (zVar.f16688h0 >= j6 && !zVar.c()) {
                return zVar;
            }
            Object obj = AbstractC1393e.f16650Y.get(zVar);
            Q1.u uVar = f16642b;
            if (obj == uVar) {
                return uVar;
            }
            z zVar2 = (z) ((AbstractC1393e) obj);
            if (zVar2 == null) {
                zVar2 = (z) nVar.invoke(Long.valueOf(zVar.f16688h0 + 1), zVar);
                do {
                    atomicReferenceFieldUpdater = AbstractC1393e.f16650Y;
                    if (atomicReferenceFieldUpdater.compareAndSet(zVar, null, zVar2)) {
                        if (zVar.c()) {
                            zVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(zVar) == null);
            }
            zVar = zVar2;
        }
    }

    public static final void b(AbstractC4831k abstractC4831k, Object obj) {
        if (obj == f16646f) {
            return;
        }
        if (obj instanceof E) {
            E e10 = (E) obj;
            F0[] f0Arr = e10.f16639b;
            int length = f0Arr.length - 1;
            if (length < 0) {
                return;
            }
            F0 f02 = f0Arr[length];
            AbstractC3557B.Z(null);
            Object obj2 = e10.f16638a[length];
            throw null;
        }
        Object fold = abstractC4831k.fold(null, C.f16633h0);
        AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>", fold);
        AbstractC2469q0.p(fold);
        throw null;
    }

    public static final void c(AbstractC4825e abstractC4825e, Object obj, wf.k kVar) {
        Object obj2;
        N0 n02;
        if (abstractC4825e instanceof i) {
            i iVar = (i) abstractC4825e;
            Throwable a5 = C3961k.a(obj);
            if (a5 == null) {
                if (kVar != null) {
                    obj2 = new C1088w(obj, kVar);
                } else {
                    obj2 = obj;
                }
            } else {
                obj2 = new C1087v(a5, false);
            }
            AbstractC4825e abstractC4825e2 = iVar.f16657j0;
            AbstractC4831k context = abstractC4825e2.getContext();
            Ng.B b10 = iVar.f16656i0;
            if (b10.d0(context)) {
                iVar.f16658k0 = obj2;
                iVar.f12903h0 = 1;
                b10.r(abstractC4825e2.getContext(), iVar);
                return;
            }
            AbstractC1053b0 a10 = G0.a();
            if (a10.R0()) {
                iVar.f16658k0 = obj2;
                iVar.f12903h0 = 1;
                a10.F0(iVar);
                return;
            }
            a10.P0(true);
            try {
                AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) abstractC4825e2.getContext().get(C1071k0.f12951Y);
                if (abstractC1073l0 != null && !abstractC1073l0.a()) {
                    CancellationException P = abstractC1073l0.P();
                    iVar.b(obj2, P);
                    iVar.resumeWith(N.w(P));
                } else {
                    Object obj3 = iVar.f16659l0;
                    AbstractC4831k context2 = abstractC4825e2.getContext();
                    Object e10 = e(context2, obj3);
                    if (e10 != f16646f) {
                        n02 = J.j0(abstractC4825e2, context2, e10);
                    } else {
                        n02 = null;
                    }
                    abstractC4825e2.resumeWith(obj);
                    if (n02 == null || n02.t0()) {
                        b(context2, e10);
                    }
                }
                do {
                } while (a10.T0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        abstractC4825e.resumeWith(obj);
    }

    public static final Object d(AbstractC4831k abstractC4831k) {
        Object fold = abstractC4831k.fold(0, C.f16632Z);
        AbstractC3557B.Z(fold);
        return fold;
    }

    public static final Object e(AbstractC4831k abstractC4831k, Object obj) {
        if (obj == null) {
            obj = d(abstractC4831k);
        }
        if (obj == 0) {
            return f16646f;
        }
        if (obj instanceof Integer) {
            return abstractC4831k.fold(new E(abstractC4831k, ((Number) obj).intValue()), C.f16634i0);
        }
        AbstractC2469q0.p(obj);
        throw null;
    }
}
