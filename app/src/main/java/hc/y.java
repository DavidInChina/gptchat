package hc;

import Uc.C1428m;
import Uc.EnumC1427l;
import id.AbstractC3557B;
import java.util.Iterator;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class y extends AbstractC3404t {

    /* renamed from: j  reason: collision with root package name */
    public final Ba.j f32237j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(androidx.lifecycle.P p10, Ba.j jVar) {
        super(new C3403s(r1 == null ? EnumC1427l.f17684Z : r1, null, new T0.z("", 0L, 6), false, false));
        Object obj;
        String str;
        C1428m c1428m = C1428m.f17688i;
        Iterator it = EnumC1427l.f17686i0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                EnumC1427l enumC1427l = (EnumC1427l) obj;
                if (p10 != null) {
                    str = (String) p10.b("instruction");
                } else {
                    str = null;
                }
                if (AbstractC3557B.K(str, enumC1427l.f17687Y)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EnumC1427l enumC1427l2 = (EnumC1427l) obj;
        this.f32237j = jVar;
        L4.a.E0(L4.a.I0(new C3405u(this, null), jVar.f2031c), AbstractC4828h.Q(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(y yVar, AbstractC4825e abstractC4825e) {
        x xVar;
        int i10;
        v0 v0Var;
        Ba.c cVar;
        yVar.getClass();
        if (abstractC4825e instanceof x) {
            xVar = (x) abstractC4825e;
            int i11 = xVar.f32236i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f32236i0 = i11 - Integer.MIN_VALUE;
                Object obj = xVar.f32234Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = xVar.f32236i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        yVar = xVar.f32233Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    yVar.l(C3406v.f32225i0);
                    C3403s c3403s = (C3403s) yVar.f808e.getValue();
                    Ba.c cVar2 = c3403s.f32217b;
                    if (cVar2 == null) {
                        cVar2 = new Ba.c("", "", false);
                    }
                    int ordinal = c3403s.f32216a.ordinal();
                    T0.z zVar = c3403s.f32218c;
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            cVar = Ba.c.a(cVar2, false, null, zVar.f16830a.f12512Y, 3);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        cVar = Ba.c.a(cVar2, false, zVar.f16830a.f12512Y, null, 5);
                    }
                    xVar.f32233Y = yVar;
                    xVar.f32236i0 = 1;
                    obj = yVar.f32237j.c(cVar, xVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof u0)) {
                    jf.y yVar2 = (jf.y) ((u0) v0Var).f48468a;
                    yVar.f(C3395j.f32210a);
                } else if (v0Var instanceof q0) {
                    yVar.f(new C3396k((q0) v0Var));
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                yVar.l(C3406v.f32226j0);
                return jf.y.f36177a;
            }
        }
        xVar = new x(yVar, abstractC4825e);
        Object obj2 = xVar.f32234Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = xVar.f32236i0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (!(v0Var instanceof u0)) {
        }
        yVar.l(C3406v.f32226j0);
        return jf.y.f36177a;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC3402q abstractC3402q = (AbstractC3402q) iVar;
        AbstractC3557B.c0("intent", abstractC3402q);
        boolean z10 = abstractC3402q instanceof C3398m;
        C3395j c3395j = C3395j.f32210a;
        if (z10) {
            if (((C3403s) this.f808e.getValue()).f()) {
                l(C3406v.f32223Z);
            } else {
                f(c3395j);
            }
        } else if (abstractC3402q instanceof C3399n) {
            if (((C3399n) abstractC3402q).f32213a) {
                f(c3395j);
            } else {
                l(C3406v.f32224h0);
            }
        } else if (abstractC3402q instanceof C3400o) {
            h(new w(this, null));
        } else if (abstractC3402q instanceof C3401p) {
            T0.z zVar = ((C3401p) abstractC3402q).f32215a;
            l(new Ra.l(zVar, 20, Lg.o.Z2(1500, zVar.f16830a.f12512Y)));
        }
    }
}
