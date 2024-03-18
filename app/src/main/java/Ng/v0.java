package Ng;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import nf.AbstractC4831k;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public class v0 implements AbstractC1073l0, AbstractC1082q, C0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12989Y = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_state$volatile");

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12990Z = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public v0(boolean z10) {
        V v10;
        if (z10) {
            v10 = H.f12882j;
        } else {
            v10 = H.f12881i;
        }
        this._state$volatile = v10;
    }

    public static C1080p g0(Sg.p pVar) {
        while (pVar.m()) {
            Sg.p f6 = pVar.f();
            if (f6 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Sg.p.f16673Z;
                Object obj = atomicReferenceFieldUpdater.get(pVar);
                while (true) {
                    pVar = (Sg.p) obj;
                    if (!pVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(pVar);
                }
            } else {
                pVar = f6;
            }
        }
        while (true) {
            pVar = pVar.j();
            if (!pVar.m()) {
                if (pVar instanceof C1080p) {
                    return (C1080p) pVar;
                }
                if (pVar instanceof y0) {
                    return null;
                }
            }
        }
    }

    public static String o0(Object obj) {
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (s0Var.d()) {
                return "Cancelling";
            }
            if (!s0Var.f()) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof AbstractC1063g0) {
            if (((AbstractC1063g0) obj).a()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C1087v) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    @Override // Ng.AbstractC1073l0
    public final AbstractC1078o A0(v0 v0Var) {
        T C02 = L4.a.C0(this, true, new C1080p(v0Var), 2);
        AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle", C02);
        return (AbstractC1078o) C02;
    }

    public final boolean C(Object obj) {
        Q1.u uVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Q1.u uVar2 = H.f12876d;
        if (R()) {
            do {
                Object U10 = U();
                if ((U10 instanceof AbstractC1063g0) && (!(U10 instanceof s0) || !((s0) U10).f())) {
                    uVar2 = p0(U10, new C1087v(J(obj), false));
                } else {
                    uVar2 = H.f12876d;
                    break;
                }
            } while (uVar2 == H.f12878f);
            if (uVar2 == H.f12877e) {
                return true;
            }
        }
        if (uVar2 == H.f12876d) {
            Throwable th2 = null;
            Throwable th3 = null;
            loop1: while (true) {
                Object U11 = U();
                if (U11 instanceof s0) {
                    synchronized (U11) {
                        try {
                            if (s0.f12971i0.get((s0) U11) == H.f12880h) {
                                uVar = H.f12879g;
                            } else {
                                boolean d10 = ((s0) U11).d();
                                if (th3 == null) {
                                    th3 = J(obj);
                                }
                                ((s0) U11).b(th3);
                                Throwable c10 = ((s0) U11).c();
                                if (!d10) {
                                    th2 = c10;
                                }
                                if (th2 != null) {
                                    h0(((s0) U11).f12972Y, th2);
                                }
                                uVar = H.f12876d;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                } else if (U11 instanceof AbstractC1063g0) {
                    if (th3 == null) {
                        th3 = J(obj);
                    }
                    AbstractC1063g0 abstractC1063g0 = (AbstractC1063g0) U11;
                    if (abstractC1063g0.a()) {
                        y0 T = T(abstractC1063g0);
                        if (T == null) {
                            continue;
                        } else {
                            s0 s0Var = new s0(T, th3);
                            do {
                                atomicReferenceFieldUpdater = f12989Y;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC1063g0, s0Var)) {
                                    h0(T, th3);
                                    uVar = H.f12876d;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == abstractC1063g0);
                        }
                    } else {
                        Object p02 = p0(U11, new C1087v(th3, false));
                        if (p02 != H.f12876d) {
                            if (p02 != H.f12878f) {
                                uVar2 = p02;
                                break;
                            }
                        } else {
                            throw new IllegalStateException(("Cannot happen in " + U11).toString());
                        }
                    }
                } else {
                    uVar = H.f12879g;
                    break;
                }
            }
            uVar2 = uVar;
        }
        if (uVar2 != H.f12876d && uVar2 != H.f12877e) {
            if (uVar2 == H.f12879g) {
                return false;
            }
            w(uVar2);
        }
        return true;
    }

    public void D(CancellationException cancellationException) {
        C(cancellationException);
    }

    public final boolean E(Throwable th2) {
        if (Z()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        AbstractC1078o abstractC1078o = (AbstractC1078o) f12990Z.get(this);
        if (abstractC1078o != null && abstractC1078o != A0.f12861Y) {
            if (abstractC1078o.c(th2) || z10) {
                return true;
            }
            return false;
        }
        return z10;
    }

    @Override // Ng.AbstractC1073l0
    public final Object F(AbstractC4825e abstractC4825e) {
        Object U10;
        jf.y yVar;
        do {
            U10 = U();
            boolean z10 = U10 instanceof AbstractC1063g0;
            yVar = jf.y.f36177a;
            if (!z10) {
                Ad.l.i0(abstractC4825e.getContext());
                return yVar;
            }
        } while (n0(U10) < 0);
        C1072l c1072l = new C1072l(1, AbstractC5260f.z(abstractC4825e));
        c1072l.u();
        c1072l.w(new C1066i(1, m0(false, true, new U(3, c1072l))));
        Object t10 = c1072l.t();
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        if (t10 == enumC5000a) {
            com.google.android.gms.internal.play_billing.N.k0(abstractC4825e);
        }
        if (t10 != enumC5000a) {
            t10 = yVar;
        }
        if (t10 == enumC5000a) {
            return t10;
        }
        return yVar;
    }

    public String G() {
        return "Job was cancelled";
    }

    public boolean H(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (C(th2) && Q()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, K0.e] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, K0.e] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [Ng.v0, java.lang.Object] */
    public final void I(AbstractC1063g0 abstractC1063g0, Object obj) {
        C1087v c1087v;
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12990Z;
        AbstractC1078o abstractC1078o = (AbstractC1078o) atomicReferenceFieldUpdater.get(this);
        if (abstractC1078o != null) {
            abstractC1078o.dispose();
            atomicReferenceFieldUpdater.set(this, A0.f12861Y);
        }
        ?? r12 = 0;
        if (obj instanceof C1087v) {
            c1087v = (C1087v) obj;
        } else {
            c1087v = null;
        }
        if (c1087v != null) {
            th2 = c1087v.f12988a;
        } else {
            th2 = null;
        }
        if (abstractC1063g0 instanceof AbstractC1081p0) {
            try {
                ((AbstractC1081p0) abstractC1063g0).p(th2);
                return;
            } catch (Throwable th3) {
                X(new RuntimeException("Exception in completion handler " + abstractC1063g0 + " for " + ((Object) this), th3));
                return;
            }
        }
        y0 e10 = abstractC1063g0.e();
        if (e10 != null) {
            Object i10 = e10.i();
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", i10);
            Sg.p pVar = (Sg.p) i10;
            while (!AbstractC3557B.K(pVar, e10)) {
                if (pVar instanceof AbstractC1081p0) {
                    AbstractC1081p0 abstractC1081p0 = (AbstractC1081p0) pVar;
                    try {
                        abstractC1081p0.p(th2);
                    } catch (Throwable th4) {
                        if (r12 != 0) {
                            P4.a.m(r12, th4);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + abstractC1081p0 + " for " + ((Object) this), th4);
                        }
                    }
                }
                pVar = pVar.j();
                r12 = r12;
            }
            if (r12 != 0) {
                X(r12);
            }
        }
    }

    public final Throwable J(Object obj) {
        Throwable th2;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        v0 v0Var = (v0) ((C0) obj);
        Object U10 = v0Var.U();
        CancellationException cancellationException = null;
        if (U10 instanceof s0) {
            th2 = ((s0) U10).c();
        } else if (U10 instanceof C1087v) {
            th2 = ((C1087v) U10).f12988a;
        } else if (!(U10 instanceof AbstractC1063g0)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + U10).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            cancellationException = new C1075m0("Parent job is ".concat(o0(U10)), th2, v0Var);
        }
        return cancellationException;
    }

    public final Object L(s0 s0Var, Object obj) {
        C1087v c1087v;
        boolean d10;
        Throwable N10;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof C1087v) {
            c1087v = (C1087v) obj;
        } else {
            c1087v = null;
        }
        if (c1087v != null) {
            th2 = c1087v.f12988a;
        }
        synchronized (s0Var) {
            d10 = s0Var.d();
            ArrayList<Throwable> g10 = s0Var.g(th2);
            N10 = N(s0Var, g10);
            if (N10 != null && g10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g10.size()));
                for (Throwable th3 : g10) {
                    if (th3 != N10 && th3 != N10 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        P4.a.m(N10, th3);
                    }
                }
            }
        }
        if (N10 != null && N10 != th2) {
            obj = new C1087v(N10, false);
        }
        if (N10 != null && (E(N10) || W(N10))) {
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally", obj);
            C1087v.f12987b.compareAndSet((C1087v) obj, 0, 1);
        }
        if (!d10) {
            i0(N10);
        }
        j0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12989Y;
        if (obj instanceof AbstractC1063g0) {
            obj2 = new C1065h0((AbstractC1063g0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, s0Var, obj2) && atomicReferenceFieldUpdater.get(this) == s0Var) {
        }
        I(s0Var, obj);
        return obj;
    }

    public final Object M() {
        Object U10 = U();
        if (!(U10 instanceof AbstractC1063g0)) {
            if (!(U10 instanceof C1087v)) {
                return H.A(U10);
            }
            throw ((C1087v) U10).f12988a;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final Throwable N(s0 s0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!s0Var.d()) {
                return null;
            }
            return new C1075m0(G(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof J0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof J0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override // Ng.AbstractC1073l0
    public final CancellationException P() {
        Object U10 = U();
        CancellationException cancellationException = null;
        if (U10 instanceof s0) {
            Throwable c10 = ((s0) U10).c();
            if (c10 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c10 instanceof CancellationException) {
                    cancellationException = (CancellationException) c10;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = G();
                    }
                    return new C1075m0(concat, c10, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(U10 instanceof AbstractC1063g0)) {
            if (U10 instanceof C1087v) {
                Throwable th2 = ((C1087v) U10).f12988a;
                if (th2 instanceof CancellationException) {
                    cancellationException = (CancellationException) th2;
                }
                if (cancellationException == null) {
                    return new C1075m0(G(), th2, this);
                }
                return cancellationException;
            }
            return new C1075m0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public boolean Q() {
        return true;
    }

    public boolean R() {
        return this instanceof C1084s;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Sg.p, Ng.y0] */
    public final y0 T(AbstractC1063g0 abstractC1063g0) {
        y0 e10 = abstractC1063g0.e();
        if (e10 == null) {
            if (abstractC1063g0 instanceof V) {
                return new Sg.p();
            }
            if (abstractC1063g0 instanceof AbstractC1081p0) {
                l0((AbstractC1081p0) abstractC1063g0);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + abstractC1063g0).toString());
        }
        return e10;
    }

    public final Object U() {
        while (true) {
            Object obj = f12989Y.get(this);
            if (!(obj instanceof Sg.v)) {
                return obj;
            }
            ((Sg.v) obj).a(this);
        }
    }

    @Override // Ng.AbstractC1073l0
    public final T V(wf.k kVar) {
        return m0(false, true, kVar);
    }

    public boolean W(Throwable th2) {
        return false;
    }

    public final void Y(AbstractC1073l0 abstractC1073l0) {
        A0 a02 = A0.f12861Y;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12990Z;
        if (abstractC1073l0 == null) {
            atomicReferenceFieldUpdater.set(this, a02);
            return;
        }
        abstractC1073l0.start();
        AbstractC1078o A02 = abstractC1073l0.A0(this);
        atomicReferenceFieldUpdater.set(this, A02);
        if (j()) {
            A02.dispose();
            atomicReferenceFieldUpdater.set(this, a02);
        }
    }

    public boolean Z() {
        return this instanceof C1062g;
    }

    @Override // Ng.AbstractC1073l0
    public boolean a() {
        Object U10 = U();
        if ((U10 instanceof AbstractC1063g0) && ((AbstractC1063g0) U10).a()) {
            return true;
        }
        return false;
    }

    public final boolean b0(Object obj) {
        Object p02;
        do {
            p02 = p0(U(), obj);
            if (p02 == H.f12876d) {
                return false;
            }
            if (p02 == H.f12877e) {
                return true;
            }
        } while (p02 == H.f12878f);
        w(p02);
        return true;
    }

    public final Object c0(Object obj) {
        Object p02;
        C1087v c1087v;
        do {
            p02 = p0(U(), obj);
            if (p02 == H.f12876d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                if (obj instanceof C1087v) {
                    c1087v = (C1087v) obj;
                } else {
                    c1087v = null;
                }
                if (c1087v != null) {
                    th2 = c1087v.f12988a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (p02 == H.f12878f);
        return p02;
    }

    public String e0() {
        return getClass().getSimpleName();
    }

    @Override // nf.AbstractC4831k
    public final Object fold(Object obj, wf.n nVar) {
        return AbstractC4344b.j0(this, obj, nVar);
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4829i get(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.s0(this, abstractC4830j);
    }

    @Override // nf.AbstractC4829i
    public final AbstractC4830j getKey() {
        return C1071k0.f12951Y;
    }

    @Override // Ng.AbstractC1073l0
    public final AbstractC1073l0 getParent() {
        AbstractC1078o abstractC1078o = (AbstractC1078o) f12990Z.get(this);
        if (abstractC1078o != null) {
            return abstractC1078o.getParent();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, K0.e] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [Ng.v0, java.lang.Object] */
    public final void h0(y0 y0Var, Throwable th2) {
        i0(th2);
        Object i10 = y0Var.i();
        AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", i10);
        Sg.p pVar = (Sg.p) i10;
        ?? r12 = 0;
        while (!AbstractC3557B.K(pVar, y0Var)) {
            if (pVar instanceof AbstractC1077n0) {
                AbstractC1081p0 abstractC1081p0 = (AbstractC1081p0) pVar;
                try {
                    abstractC1081p0.p(th2);
                } catch (Throwable th3) {
                    if (r12 != 0) {
                        P4.a.m(r12, th3);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + abstractC1081p0 + " for " + ((Object) this), th3);
                    }
                }
            }
            pVar = pVar.j();
            r12 = r12;
        }
        if (r12 != 0) {
            X(r12);
        }
        E(th2);
    }

    @Override // Ng.AbstractC1073l0
    public final boolean j() {
        return !(U() instanceof AbstractC1063g0);
    }

    @Override // Ng.AbstractC1073l0
    public void k(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C1075m0(G(), null, this);
        }
        D(cancellationException);
    }

    public final void l0(AbstractC1081p0 abstractC1081p0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Sg.p pVar = new Sg.p();
        abstractC1081p0.getClass();
        Sg.p.f16673Z.set(pVar, abstractC1081p0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Sg.p.f16672Y;
        atomicReferenceFieldUpdater2.set(pVar, abstractC1081p0);
        loop0: while (true) {
            if (abstractC1081p0.i() == abstractC1081p0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(abstractC1081p0, abstractC1081p0, pVar)) {
                    if (atomicReferenceFieldUpdater2.get(abstractC1081p0) != abstractC1081p0) {
                        break;
                    }
                }
                pVar.g(abstractC1081p0);
                break loop0;
            }
            break;
        }
        Sg.p j6 = abstractC1081p0.j();
        do {
            atomicReferenceFieldUpdater = f12989Y;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC1081p0, j6)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC1081p0);
    }

    @Override // Ng.AbstractC1073l0
    public final boolean m() {
        Object U10 = U();
        if (!(U10 instanceof C1087v) && (!(U10 instanceof s0) || !((s0) U10).d())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Sg.p, Ng.y0] */
    @Override // Ng.AbstractC1073l0
    public final T m0(boolean z10, boolean z11, wf.k kVar) {
        AbstractC1081p0 abstractC1081p0;
        C1061f0 c1061f0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1087v c1087v;
        Throwable th2;
        Throwable th3 = null;
        if (z10) {
            if (kVar instanceof AbstractC1077n0) {
                abstractC1081p0 = (AbstractC1077n0) kVar;
            } else {
                abstractC1081p0 = null;
            }
            if (abstractC1081p0 == null) {
                abstractC1081p0 = new C1069j0(kVar);
            }
        } else {
            if (kVar instanceof AbstractC1081p0) {
                abstractC1081p0 = (AbstractC1081p0) kVar;
            } else {
                abstractC1081p0 = null;
            }
            if (abstractC1081p0 == null) {
                abstractC1081p0 = new U(1, kVar);
            }
        }
        abstractC1081p0.f12963i0 = this;
        while (true) {
            Object U10 = U();
            if (U10 instanceof V) {
                V v10 = (V) U10;
                if (v10.f12912Y) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12989Y;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, U10, abstractC1081p0)) {
                        if (atomicReferenceFieldUpdater2.get(this) != U10) {
                            break;
                        }
                    }
                    return abstractC1081p0;
                }
                ?? pVar = new Sg.p();
                if (v10.f12912Y) {
                    c1061f0 = pVar;
                } else {
                    c1061f0 = new C1061f0(pVar);
                }
                do {
                    atomicReferenceFieldUpdater = f12989Y;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, v10, c1061f0)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == v10);
            } else if (U10 instanceof AbstractC1063g0) {
                y0 e10 = ((AbstractC1063g0) U10).e();
                if (e10 == null) {
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.JobNode", U10);
                    l0((AbstractC1081p0) U10);
                } else {
                    T t10 = A0.f12861Y;
                    if (z10 && (U10 instanceof s0)) {
                        synchronized (U10) {
                            try {
                                th2 = ((s0) U10).c();
                                if (th2 != null) {
                                    if ((kVar instanceof C1080p) && !((s0) U10).f()) {
                                    }
                                }
                                if (v(U10, e10, abstractC1081p0)) {
                                    if (th2 == null) {
                                        return abstractC1081p0;
                                    }
                                    t10 = abstractC1081p0;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    } else {
                        th2 = null;
                    }
                    if (th2 != null) {
                        if (z11) {
                            kVar.invoke(th2);
                        }
                        return t10;
                    } else if (v(U10, e10, abstractC1081p0)) {
                        return abstractC1081p0;
                    }
                }
            } else {
                if (z11) {
                    if (U10 instanceof C1087v) {
                        c1087v = (C1087v) U10;
                    } else {
                        c1087v = null;
                    }
                    if (c1087v != null) {
                        th3 = c1087v.f12988a;
                    }
                    kVar.invoke(th3);
                }
                return A0.f12861Y;
            }
        }
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k minusKey(AbstractC4830j abstractC4830j) {
        return AbstractC4344b.L0(this, abstractC4830j);
    }

    public final int n0(Object obj) {
        boolean z10 = obj instanceof V;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12989Y;
        if (z10) {
            if (((V) obj).f12912Y) {
                return 0;
            }
            V v10 = H.f12882j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, v10)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            k0();
            return 1;
        } else if (!(obj instanceof C1061f0)) {
            return 0;
        } else {
            y0 y0Var = ((C1061f0) obj).f12940Y;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            k0();
            return 1;
        }
    }

    public Object p() {
        return M();
    }

    public final Object p0(Object obj, Object obj2) {
        s0 s0Var;
        C1087v c1087v;
        C1080p c1080p;
        C1065h0 c1065h0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof AbstractC1063g0)) {
            return H.f12876d;
        }
        C1080p c1080p2 = null;
        if (((obj instanceof V) || (obj instanceof AbstractC1081p0)) && !(obj instanceof C1080p) && !(obj2 instanceof C1087v)) {
            AbstractC1063g0 abstractC1063g0 = (AbstractC1063g0) obj;
            if (obj2 instanceof AbstractC1063g0) {
                c1065h0 = new C1065h0((AbstractC1063g0) obj2);
            } else {
                c1065h0 = obj2;
            }
            do {
                atomicReferenceFieldUpdater = f12989Y;
                if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC1063g0, c1065h0)) {
                    i0(null);
                    j0(obj2);
                    I(abstractC1063g0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == abstractC1063g0);
            return H.f12878f;
        }
        AbstractC1063g0 abstractC1063g02 = (AbstractC1063g0) obj;
        y0 T = T(abstractC1063g02);
        if (T == null) {
            return H.f12878f;
        }
        if (abstractC1063g02 instanceof s0) {
            s0Var = (s0) abstractC1063g02;
        } else {
            s0Var = null;
        }
        if (s0Var == null) {
            s0Var = new s0(T, null);
        }
        synchronized (s0Var) {
            try {
                if (s0Var.f()) {
                    return H.f12876d;
                }
                s0.f12969Z.set(s0Var, 1);
                if (s0Var != abstractC1063g02) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12989Y;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC1063g02, s0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != abstractC1063g02) {
                            return H.f12878f;
                        }
                    }
                }
                boolean d10 = s0Var.d();
                if (obj2 instanceof C1087v) {
                    c1087v = (C1087v) obj2;
                } else {
                    c1087v = null;
                }
                if (c1087v != null) {
                    s0Var.b(c1087v.f12988a);
                }
                Throwable c10 = s0Var.c();
                if (!(!d10)) {
                    c10 = null;
                }
                if (c10 != null) {
                    h0(T, c10);
                }
                if (abstractC1063g02 instanceof C1080p) {
                    c1080p = (C1080p) abstractC1063g02;
                } else {
                    c1080p = null;
                }
                if (c1080p == null) {
                    y0 e10 = abstractC1063g02.e();
                    if (e10 != null) {
                        c1080p2 = g0(e10);
                    }
                } else {
                    c1080p2 = c1080p;
                }
                if (c1080p2 != null) {
                    while (L4.a.C0(c1080p2.f12962j0, false, new r0(this, s0Var, c1080p2, obj2), 1) == A0.f12861Y) {
                        c1080p2 = g0(c1080p2);
                        if (c1080p2 == null) {
                            return L(s0Var, obj2);
                        }
                    }
                    return H.f12877e;
                }
                return L(s0Var, obj2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nf.AbstractC4831k
    public final AbstractC4831k plus(AbstractC4831k abstractC4831k) {
        return AbstractC4344b.Q0(this, abstractC4831k);
    }

    @Override // Ng.AbstractC1073l0
    public final boolean start() {
        int n02;
        do {
            n02 = n0(U());
            if (n02 == 0) {
                return false;
            }
        } while (n02 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e0() + '{' + o0(U()) + '}');
        sb2.append('@');
        sb2.append(H.q(this));
        return sb2.toString();
    }

    public final boolean v(Object obj, y0 y0Var, AbstractC1081p0 abstractC1081p0) {
        boolean z10;
        t0 t0Var = new t0(abstractC1081p0, this, obj);
        do {
            Sg.p f6 = y0Var.f();
            if (f6 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Sg.p.f16673Z;
                Object obj2 = atomicReferenceFieldUpdater.get(y0Var);
                while (true) {
                    f6 = (Sg.p) obj2;
                    if (!f6.m()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater.get(f6);
                }
            }
            Sg.p.f16673Z.set(abstractC1081p0, f6);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Sg.p.f16672Y;
            atomicReferenceFieldUpdater2.set(abstractC1081p0, y0Var);
            t0Var.f12974c = y0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(f6, y0Var, t0Var)) {
                    if (t0Var.a(f6) == null) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                } else if (atomicReferenceFieldUpdater2.get(f6) != y0Var) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return true;
            }
        } while (!z10);
        return false;
    }

    public void y(Object obj) {
        w(obj);
    }

    public final Object z(AbstractC4825e abstractC4825e) {
        Object U10;
        do {
            U10 = U();
            if (!(U10 instanceof AbstractC1063g0)) {
                if (!(U10 instanceof C1087v)) {
                    return H.A(U10);
                }
                throw ((C1087v) U10).f12988a;
            }
        } while (n0(U10) < 0);
        C1083q0 c1083q0 = new C1083q0(AbstractC5260f.z(abstractC4825e), this);
        c1083q0.u();
        c1083q0.w(new C1066i(1, m0(false, true, new U(2, c1083q0))));
        Object t10 = c1083q0.t();
        if (t10 == EnumC5000a.f41328Y) {
            com.google.android.gms.internal.play_billing.N.k0(abstractC4825e);
        }
        return t10;
    }

    public void k0() {
    }

    public void X(K0.e eVar) {
        throw eVar;
    }

    public void i0(Throwable th2) {
    }

    public void j0(Object obj) {
    }

    public void w(Object obj) {
    }
}
