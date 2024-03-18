package E0;

import H0.A1;
import Z.AbstractC1699a;
import Z.AbstractC1719k;
import Z.AbstractC1738u;
import Z.AbstractC1746y;
import Z.C1744x;
import Z.I0;
import Z.o1;
import android.view.ViewGroup;
import b0.C2104h;
import h0.C3288a;
import id.AbstractC3557B;
import j0.AbstractC3893i;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class J implements AbstractC1719k {

    /* renamed from: Y  reason: collision with root package name */
    public final androidx.compose.ui.node.a f4012Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC1738u f4013Z;

    /* renamed from: h0  reason: collision with root package name */
    public q0 f4014h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f4015i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f4016j0;

    /* renamed from: s0  reason: collision with root package name */
    public int f4025s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f4026t0;

    /* renamed from: k0  reason: collision with root package name */
    public final HashMap f4017k0 = new HashMap();

    /* renamed from: l0  reason: collision with root package name */
    public final HashMap f4018l0 = new HashMap();

    /* renamed from: m0  reason: collision with root package name */
    public final E f4019m0 = new E(this);

    /* renamed from: n0  reason: collision with root package name */
    public final C f4020n0 = new C(this);

    /* renamed from: o0  reason: collision with root package name */
    public final HashMap f4021o0 = new HashMap();

    /* renamed from: p0  reason: collision with root package name */
    public final p0 f4022p0 = new p0();

    /* renamed from: q0  reason: collision with root package name */
    public final LinkedHashMap f4023q0 = new LinkedHashMap();

    /* renamed from: r0  reason: collision with root package name */
    public final C2104h f4024r0 = new C2104h(new Object[16]);

    /* renamed from: u0  reason: collision with root package name */
    public final String f4027u0 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public J(androidx.compose.ui.node.a aVar, q0 q0Var) {
        this.f4012Y = aVar;
        this.f4014h0 = q0Var;
    }

    public static I0 h(I0 i02, androidx.compose.ui.node.a aVar, boolean z10, AbstractC1738u abstractC1738u, C3288a c3288a) {
        if (i02 == null || ((C1744x) i02).f22766x0) {
            ViewGroup.LayoutParams layoutParams = A1.f6713a;
            AbstractC1699a abstractC1699a = new AbstractC1699a(aVar);
            Object obj = AbstractC1746y.f22769a;
            i02 = new C1744x(abstractC1738u, abstractC1699a);
        }
        if (!z10) {
            ((C1744x) i02).n(c3288a);
        } else {
            C1744x c1744x = (C1744x) i02;
            Z.r rVar = c1744x.f22765w0;
            rVar.f22720y = 100;
            rVar.f22719x = true;
            c1744x.n(c3288a);
            if (!rVar.f22685E && rVar.f22720y == 100) {
                rVar.f22720y = -1;
                rVar.f22719x = false;
            } else {
                throw new IllegalArgumentException("Cannot disable reuse from root if it was caused by other groups".toString());
            }
        }
        return i02;
    }

    @Override // Z.AbstractC1719k
    public final void a() {
        androidx.compose.ui.node.a aVar = this.f4012Y;
        aVar.f24853q0 = true;
        HashMap hashMap = this.f4017k0;
        for (B b10 : hashMap.values()) {
            I0 i02 = b10.f3987c;
            if (i02 != null) {
                ((C1744x) i02).dispose();
            }
        }
        aVar.j0();
        aVar.f24853q0 = false;
        hashMap.clear();
        this.f4018l0.clear();
        this.f4026t0 = 0;
        this.f4025s0 = 0;
        this.f4021o0.clear();
        d();
    }

    @Override // Z.AbstractC1719k
    public final void b() {
        e(true);
    }

    public final void c(int i10) {
        this.f4025s0 = 0;
        androidx.compose.ui.node.a aVar = this.f4012Y;
        int size = (aVar.r().size() - this.f4026t0) - 1;
        if (i10 <= size) {
            p0 p0Var = this.f4022p0;
            p0Var.clear();
            HashMap hashMap = this.f4017k0;
            Set set = p0Var.f4088Y;
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    Object obj = hashMap.get((androidx.compose.ui.node.a) aVar.r().get(i11));
                    AbstractC3557B.Z(obj);
                    set.add(((B) obj).f3985a);
                    if (i11 == size) {
                        break;
                    }
                    i11++;
                }
            }
            this.f4014h0.b(p0Var);
            int i12 = AbstractC3893i.f35891e;
            AbstractC3893i d10 = io.sentry.hints.i.d();
            try {
                AbstractC3893i j6 = d10.j();
                boolean z10 = false;
                while (size >= i10) {
                    androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) aVar.r().get(size);
                    Object obj2 = hashMap.get(aVar2);
                    AbstractC3557B.Z(obj2);
                    B b10 = (B) obj2;
                    Object obj3 = b10.f3985a;
                    if (set.contains(obj3)) {
                        this.f4025s0++;
                        if (((Boolean) b10.f3990f.getValue()).booleanValue()) {
                            aVar2.z().f5634p0 = 3;
                            G0.L y10 = aVar2.y();
                            if (y10 != null) {
                                y10.f5606n0 = 3;
                            }
                            b10.f3990f.setValue(Boolean.FALSE);
                            z10 = true;
                        }
                    } else {
                        aVar.f24853q0 = true;
                        hashMap.remove(aVar2);
                        I0 i02 = b10.f3987c;
                        if (i02 != null) {
                            ((C1744x) i02).dispose();
                        }
                        aVar.k0(size, 1);
                        aVar.f24853q0 = false;
                    }
                    this.f4018l0.remove(obj3);
                    size--;
                }
                AbstractC3893i.p(j6);
                d10.c();
                if (z10) {
                    int i13 = AbstractC3893i.f35891e;
                    io.sentry.hints.i.h();
                }
            } catch (Throwable th2) {
                d10.c();
                throw th2;
            }
        }
        d();
    }

    public final void d() {
        int size = this.f4012Y.r().size();
        HashMap hashMap = this.f4017k0;
        if (hashMap.size() == size) {
            if ((size - this.f4025s0) - this.f4026t0 >= 0) {
                HashMap hashMap2 = this.f4021o0;
                if (hashMap2.size() == this.f4026t0) {
                    return;
                }
                throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f4026t0 + ". Map size " + hashMap2.size()).toString());
            }
            StringBuilder q10 = android.gov.nist.core.a.q("Incorrect state. Total children ", size, ". Reusable children ");
            q10.append(this.f4025s0);
            q10.append(". Precomposed children ");
            q10.append(this.f4026t0);
            throw new IllegalArgumentException(q10.toString().toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + hashMap.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    public final void e(boolean z10) {
        this.f4026t0 = 0;
        this.f4021o0.clear();
        androidx.compose.ui.node.a aVar = this.f4012Y;
        int size = aVar.r().size();
        if (this.f4025s0 != size) {
            this.f4025s0 = size;
            int i10 = AbstractC3893i.f35891e;
            AbstractC3893i d10 = io.sentry.hints.i.d();
            try {
                AbstractC3893i j6 = d10.j();
                for (int i11 = 0; i11 < size; i11++) {
                    androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) aVar.r().get(i11);
                    B b10 = (B) this.f4017k0.get(aVar2);
                    if (b10 != null && ((Boolean) b10.f3990f.getValue()).booleanValue()) {
                        aVar2.z().f5634p0 = 3;
                        G0.L y10 = aVar2.y();
                        if (y10 != null) {
                            y10.f5606n0 = 3;
                        }
                        if (z10) {
                            I0 i02 = b10.f3987c;
                            if (i02 != null) {
                                ((C1744x) i02).o();
                            }
                            b10.f3990f = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
                        } else {
                            b10.f3990f.setValue(Boolean.FALSE);
                        }
                        b10.f3985a = k0.f4072a;
                    }
                }
                AbstractC3893i.p(j6);
                d10.c();
                this.f4018l0.clear();
            } catch (Throwable th2) {
                d10.c();
                throw th2;
            }
        }
        d();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [E0.l0, java.lang.Object] */
    public final l0 f(Object obj, wf.n nVar) {
        androidx.compose.ui.node.a aVar = this.f4012Y;
        if (!aVar.S()) {
            return new Object();
        }
        d();
        if (!this.f4018l0.containsKey(obj)) {
            this.f4023q0.remove(obj);
            HashMap hashMap = this.f4021o0;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = j(obj);
                if (obj2 != null) {
                    int indexOf = aVar.r().indexOf(obj2);
                    int size = aVar.r().size();
                    aVar.f24853q0 = true;
                    aVar.d0(indexOf, size, 1);
                    aVar.f24853q0 = false;
                    this.f4026t0++;
                } else {
                    int size2 = aVar.r().size();
                    androidx.compose.ui.node.a aVar2 = new androidx.compose.ui.node.a(2, true, 0);
                    aVar.f24853q0 = true;
                    aVar.L(size2, aVar2);
                    aVar.f24853q0 = false;
                    this.f4026t0++;
                    obj2 = aVar2;
                }
                hashMap.put(obj, obj2);
            }
            g((androidx.compose.ui.node.a) obj2, obj, nVar);
        }
        return new I(this, obj);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, E0.B] */
    public final void g(androidx.compose.ui.node.a aVar, Object obj, wf.n nVar) {
        boolean z10;
        HashMap hashMap = this.f4017k0;
        Object obj2 = hashMap.get(aVar);
        Object obj3 = obj2;
        if (obj2 == null) {
            C3288a c3288a = AbstractC0451j.f4068a;
            ?? obj4 = new Object();
            obj4.f3985a = obj;
            obj4.f3986b = c3288a;
            obj4.f3987c = null;
            obj4.f3990f = AbstractC4828h.Z(Boolean.TRUE, o1.f22665a);
            hashMap.put(aVar, obj4);
            obj3 = obj4;
        }
        B b10 = (B) obj3;
        I0 i02 = b10.f3987c;
        if (i02 != null) {
            C1744x c1744x = (C1744x) i02;
            synchronized (c1744x.f22751i0) {
                if (c1744x.f22760r0.f25556c > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = true;
        }
        if (b10.f3986b != nVar || z10 || b10.f3988d) {
            b10.f3986b = nVar;
            int i10 = AbstractC3893i.f35891e;
            AbstractC3893i d10 = io.sentry.hints.i.d();
            try {
                AbstractC3893i j6 = d10.j();
                androidx.compose.ui.node.a aVar2 = this.f4012Y;
                aVar2.f24853q0 = true;
                wf.n nVar2 = b10.f3986b;
                I0 i03 = b10.f3987c;
                AbstractC1738u abstractC1738u = this.f4013Z;
                if (abstractC1738u != null) {
                    b10.f3987c = h(i03, aVar, b10.f3989e, abstractC1738u, new C3288a(new androidx.compose.foundation.layout.c(b10, 8, nVar2), true, -1750409193));
                    b10.f3989e = false;
                    aVar2.f24853q0 = false;
                    AbstractC3893i.p(j6);
                    d10.c();
                    b10.f3988d = false;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set".toString());
            } catch (Throwable th2) {
                d10.c();
                throw th2;
            }
        }
    }

    @Override // Z.AbstractC1719k
    public final void i() {
        e(false);
    }

    public final androidx.compose.ui.node.a j(Object obj) {
        HashMap hashMap;
        int i10;
        if (this.f4025s0 == 0) {
            return null;
        }
        androidx.compose.ui.node.a aVar = this.f4012Y;
        int size = aVar.r().size() - this.f4026t0;
        int i11 = size - this.f4025s0;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            hashMap = this.f4017k0;
            if (i13 >= i11) {
                Object obj2 = hashMap.get((androidx.compose.ui.node.a) aVar.r().get(i13));
                AbstractC3557B.Z(obj2);
                if (AbstractC3557B.K(((B) obj2).f3985a, obj)) {
                    i10 = i13;
                    break;
                }
                i13--;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            while (i12 >= i11) {
                Object obj3 = hashMap.get((androidx.compose.ui.node.a) aVar.r().get(i12));
                AbstractC3557B.Z(obj3);
                B b10 = (B) obj3;
                Object obj4 = b10.f3985a;
                if (obj4 != k0.f4072a && !this.f4014h0.a(obj, obj4)) {
                    i12--;
                } else {
                    b10.f3985a = obj;
                    i13 = i12;
                    i10 = i13;
                    break;
                }
            }
            i13 = i12;
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            aVar.f24853q0 = true;
            aVar.d0(i13, i11, 1);
            aVar.f24853q0 = false;
        }
        this.f4025s0--;
        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) aVar.r().get(i11);
        Object obj5 = hashMap.get(aVar2);
        AbstractC3557B.Z(obj5);
        B b11 = (B) obj5;
        b11.f3990f = AbstractC4828h.Z(Boolean.TRUE, o1.f22665a);
        b11.f3989e = true;
        b11.f3988d = true;
        return aVar2;
    }
}
