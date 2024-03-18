package Ng;

import Sg.AbstractC1389a;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.C3961k;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import of.EnumC5000a;
import pf.AbstractC5157d;

/* renamed from: Ng.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1072l extends P implements AbstractC1070k, AbstractC5157d, P0 {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12952k0 = AtomicIntegerFieldUpdater.newUpdater(C1072l.class, "_decisionAndIndex$volatile");

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12953l0 = AtomicReferenceFieldUpdater.newUpdater(C1072l.class, Object.class, "_state$volatile");

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12954m0 = AtomicReferenceFieldUpdater.newUpdater(C1072l.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC4825e f12955i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC4831k f12956j0;
    private volatile /* synthetic */ int _decisionAndIndex$volatile = 536870911;
    private volatile /* synthetic */ Object _state$volatile = C1052b.f12923Y;

    public C1072l(int i10, AbstractC4825e abstractC4825e) {
        super(i10);
        this.f12955i0 = abstractC4825e;
        this.f12956j0 = abstractC4825e.getContext();
    }

    public static void C(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object G(B0 b02, Object obj, int i10, wf.k kVar) {
        AbstractC1068j abstractC1068j;
        if (!(obj instanceof C1087v) && Bi.c.f1(i10)) {
            if (kVar != null || (b02 instanceof AbstractC1068j)) {
                if (b02 instanceof AbstractC1068j) {
                    abstractC1068j = (AbstractC1068j) b02;
                } else {
                    abstractC1068j = null;
                }
                return new C1086u(obj, abstractC1068j, kVar, (CancellationException) null, 16);
            }
            return obj;
        }
        return obj;
    }

    @Override // Ng.AbstractC1070k
    public final void A(Object obj, wf.k kVar) {
        F(this.f12903h0, obj, kVar);
    }

    @Override // Ng.AbstractC1070k
    public final void B(Object obj) {
        p(this.f12903h0);
    }

    public String D() {
        return "CancellableContinuation";
    }

    public final void E() {
        Sg.i iVar;
        AbstractC4825e abstractC4825e = this.f12955i0;
        Throwable th2 = null;
        if (abstractC4825e instanceof Sg.i) {
            iVar = (Sg.i) abstractC4825e;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Sg.i.f16655m0;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                Q1.u uVar = AbstractC1389a.f16644d;
                if (obj == uVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(iVar, uVar, this)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != uVar) {
                            break;
                        }
                    }
                    break loop0;
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(iVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    th2 = (Throwable) obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th2 != null) {
                n();
                s(th2);
            }
        }
    }

    public final void F(int i10, Object obj, wf.k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12953l0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof B0) {
                Object G10 = G((B0) obj2, obj, i10, kVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, G10)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!z()) {
                    n();
                }
                p(i10);
                return;
            }
            if (obj2 instanceof C1074m) {
                C1074m c1074m = (C1074m) obj2;
                c1074m.getClass();
                if (C1074m.f12958c.compareAndSet(c1074m, 0, 1)) {
                    if (kVar != null) {
                        k(kVar, c1074m.f12988a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final Q1.u H(Object obj, wf.k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12953l0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj2 instanceof B0;
            Q1.u uVar = H.f12873a;
            if (z10) {
                Object G10 = G((B0) obj2, obj, this.f12903h0, kVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, G10)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!z()) {
                    n();
                }
                return uVar;
            }
            boolean z11 = obj2 instanceof C1086u;
            return null;
        }
    }

    @Override // Ng.AbstractC1070k
    public final boolean a() {
        return f12953l0.get(this) instanceof B0;
    }

    @Override // Ng.P
    public final void b(Object obj, CancellationException cancellationException) {
        boolean z10;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12953l0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof B0)) {
                if (obj2 instanceof C1087v) {
                    return;
                }
                if (obj2 instanceof C1086u) {
                    C1086u c1086u = (C1086u) obj2;
                    if (c1086u.f12981e != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        C1086u a5 = C1086u.a(c1086u, null, cancellationException, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a5)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        AbstractC1068j abstractC1068j = c1086u.f12978b;
                        if (abstractC1068j != null) {
                            i(abstractC1068j, cancellationException);
                        }
                        wf.k kVar = c1086u.f12979c;
                        if (kVar != null) {
                            k(kVar, cancellationException);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                C1086u c1086u2 = new C1086u(obj2, (AbstractC1068j) null, (wf.k) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1086u2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            throw new IllegalStateException("Not completed".toString());
        }
    }

    @Override // Ng.P0
    public final void c(Sg.z zVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f12952k0;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        y(zVar);
    }

    @Override // Ng.P
    public final AbstractC4825e d() {
        return this.f12955i0;
    }

    @Override // Ng.P
    public final Throwable e(Object obj) {
        Throwable e10 = super.e(obj);
        if (e10 == null) {
            return null;
        }
        return e10;
    }

    @Override // Ng.P
    public final Object f(Object obj) {
        if (obj instanceof C1086u) {
            return ((C1086u) obj).f12977a;
        }
        return obj;
    }

    @Override // pf.AbstractC5157d
    public final AbstractC5157d getCallerFrame() {
        AbstractC4825e abstractC4825e = this.f12955i0;
        if (abstractC4825e instanceof AbstractC5157d) {
            return (AbstractC5157d) abstractC4825e;
        }
        return null;
    }

    @Override // nf.AbstractC4825e
    public final AbstractC4831k getContext() {
        return this.f12956j0;
    }

    @Override // Ng.P
    public final Object h() {
        return f12953l0.get(this);
    }

    public final void i(AbstractC1068j abstractC1068j, Throwable th2) {
        try {
            abstractC1068j.a(th2);
        } catch (Throwable th3) {
            L4.a.A0(this.f12956j0, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // Ng.AbstractC1070k
    public final boolean j() {
        return !(f12953l0.get(this) instanceof B0);
    }

    public final void k(wf.k kVar, Throwable th2) {
        try {
            kVar.invoke(th2);
        } catch (Throwable th3) {
            L4.a.A0(this.f12956j0, new RuntimeException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void l(Sg.z zVar, Throwable th2) {
        AbstractC4831k abstractC4831k = this.f12956j0;
        int i10 = f12952k0.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                zVar.g(i10, abstractC4831k);
                return;
            } catch (Throwable th3) {
                L4.a.A0(abstractC4831k, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th3));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
    }

    @Override // Ng.AbstractC1070k
    public final boolean m() {
        return f12953l0.get(this) instanceof C1074m;
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12954m0;
        T t10 = (T) atomicReferenceFieldUpdater.get(this);
        if (t10 == null) {
            return;
        }
        t10.dispose();
        atomicReferenceFieldUpdater.set(this, A0.f12861Y);
    }

    @Override // Ng.AbstractC1070k
    public final Q1.u o(Throwable th2) {
        return H(new C1087v(th2, false), null);
    }

    public final void p(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        boolean z10;
        do {
            atomicIntegerFieldUpdater = f12952k0;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (i10 == 4) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AbstractC4825e abstractC4825e = this.f12955i0;
                    if (!z10 && (abstractC4825e instanceof Sg.i) && Bi.c.f1(i10) == Bi.c.f1(this.f12903h0)) {
                        B b10 = ((Sg.i) abstractC4825e).f16656i0;
                        AbstractC4831k context = abstractC4825e.getContext();
                        if (b10.d0(context)) {
                            b10.r(context, this);
                            return;
                        }
                        AbstractC1053b0 a5 = G0.a();
                        if (a5.R0()) {
                            a5.F0(this);
                            return;
                        }
                        a5.P0(true);
                        try {
                            Bi.c.C1(this, abstractC4825e, true);
                            do {
                            } while (a5.T0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                    Bi.c.C1(this, abstractC4825e, z10);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    @Override // Ng.AbstractC1070k
    public final void q(B b10) {
        Sg.i iVar;
        B b11;
        int i10;
        jf.y yVar = jf.y.f36177a;
        AbstractC4825e abstractC4825e = this.f12955i0;
        if (abstractC4825e instanceof Sg.i) {
            iVar = (Sg.i) abstractC4825e;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            b11 = iVar.f16656i0;
        } else {
            b11 = null;
        }
        if (b11 == b10) {
            i10 = 4;
        } else {
            i10 = this.f12903h0;
        }
        F(i10, yVar, null);
    }

    public Throwable r(v0 v0Var) {
        return v0Var.P();
    }

    @Override // nf.AbstractC4825e
    public final void resumeWith(Object obj) {
        Throwable a5 = C3961k.a(obj);
        if (a5 != null) {
            obj = new C1087v(a5, false);
        }
        F(this.f12903h0, obj, null);
    }

    @Override // Ng.AbstractC1070k
    public final boolean s(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12953l0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = false;
            if (!(obj instanceof B0)) {
                return false;
            }
            if ((obj instanceof AbstractC1068j) || (obj instanceof Sg.z)) {
                z10 = true;
            }
            C1074m c1074m = new C1074m(this, th2, z10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1074m)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            B0 b02 = (B0) obj;
            if (b02 instanceof AbstractC1068j) {
                i((AbstractC1068j) obj, th2);
            } else if (b02 instanceof Sg.z) {
                l((Sg.z) obj, th2);
            }
            if (!z()) {
                n();
            }
            p(this.f12903h0);
            return true;
        }
    }

    public final Object t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean z10 = z();
        do {
            atomicIntegerFieldUpdater = f12952k0;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    if (z10) {
                        E();
                    }
                    Object obj = f12953l0.get(this);
                    if (!(obj instanceof C1087v)) {
                        if (Bi.c.f1(this.f12903h0)) {
                            AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) this.f12956j0.get(C1071k0.f12951Y);
                            if (abstractC1073l0 != null && !abstractC1073l0.a()) {
                                CancellationException P = abstractC1073l0.P();
                                b(obj, P);
                                throw P;
                            }
                        }
                        return f(obj);
                    }
                    throw ((C1087v) obj).f12988a;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((T) f12954m0.get(this)) == null) {
            v();
        }
        if (z10) {
            E();
        }
        return EnumC5000a.f41328Y;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(D());
        sb2.append('(');
        sb2.append(H.x(this.f12955i0));
        sb2.append("){");
        Object obj = f12953l0.get(this);
        if (obj instanceof B0) {
            str = "Active";
        } else if (obj instanceof C1074m) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(H.q(this));
        return sb2.toString();
    }

    public final void u() {
        T v10 = v();
        if (v10 != null && j()) {
            v10.dispose();
            f12954m0.set(this, A0.f12861Y);
        }
    }

    public final T v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) this.f12956j0.get(C1071k0.f12951Y);
        if (abstractC1073l0 == null) {
            return null;
        }
        T C02 = L4.a.C0(abstractC1073l0, true, new C1076n(this), 2);
        do {
            atomicReferenceFieldUpdater = f12954m0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, C02)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return C02;
    }

    public final void w(wf.k kVar) {
        AbstractC1068j abstractC1068j;
        if (kVar instanceof AbstractC1068j) {
            abstractC1068j = (AbstractC1068j) kVar;
        } else {
            abstractC1068j = new C1066i(2, kVar);
        }
        y(abstractC1068j);
    }

    @Override // Ng.AbstractC1070k
    public final Q1.u x(Object obj, wf.k kVar) {
        return H(obj, kVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b8, code lost:
        C(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bb, code lost:
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12953l0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C1052b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            Throwable th2 = null;
            if ((obj2 instanceof AbstractC1068j) || (obj2 instanceof Sg.z)) {
                break;
            }
            boolean z10 = obj2 instanceof C1087v;
            if (z10) {
                C1087v c1087v = (C1087v) obj2;
                c1087v.getClass();
                if (C1087v.f12987b.compareAndSet(c1087v, 0, 1)) {
                    if (obj2 instanceof C1074m) {
                        if (!z10) {
                            c1087v = null;
                        }
                        if (c1087v != null) {
                            th2 = c1087v.f12988a;
                        }
                        if (obj instanceof AbstractC1068j) {
                            i((AbstractC1068j) obj, th2);
                            return;
                        }
                        AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>", obj);
                        l((Sg.z) obj, th2);
                        return;
                    }
                    return;
                }
                C(obj, obj2);
                throw null;
            } else if (obj2 instanceof C1086u) {
                C1086u c1086u = (C1086u) obj2;
                if (c1086u.f12978b == null) {
                    if (obj instanceof Sg.z) {
                        return;
                    }
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.CancelHandler", obj);
                    AbstractC1068j abstractC1068j = (AbstractC1068j) obj;
                    Throwable th3 = c1086u.f12981e;
                    if (th3 != null) {
                        i(abstractC1068j, th3);
                        return;
                    }
                    C1086u a5 = C1086u.a(c1086u, abstractC1068j, null, 29);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a5)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    return;
                }
                C(obj, obj2);
                throw null;
            } else if (obj instanceof Sg.z) {
                return;
            } else {
                AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.CancelHandler", obj);
                C1086u c1086u2 = new C1086u(obj2, (AbstractC1068j) obj, (wf.k) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1086u2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
        }
    }

    public final boolean z() {
        if (this.f12903h0 == 2) {
            AbstractC4825e abstractC4825e = this.f12955i0;
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", abstractC4825e);
            if (Sg.i.f16655m0.get((Sg.i) abstractC4825e) != null) {
                return true;
            }
        }
        return false;
    }
}
