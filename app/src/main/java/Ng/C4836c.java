package ng;

import Mf.AbstractC0993b;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.AbstractC1016z;
import Mf.G;
import Mf.V;
import Mf.b0;
import Pf.I;
import id.AbstractC3557B;
import java.util.Collection;
import kf.t;
import n2.C4711b;

/* renamed from: ng.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4836c {

    /* renamed from: a  reason: collision with root package name */
    public static final C4836c f40338a = new Object();

    public static V d(AbstractC0993b abstractC0993b) {
        while (abstractC0993b instanceof AbstractC0994c) {
            AbstractC0994c abstractC0994c = (AbstractC0994c) abstractC0993b;
            if (abstractC0994c.e() != 2) {
                break;
            }
            Collection m10 = abstractC0994c.m();
            AbstractC3557B.b0("getOverriddenDescriptors(...)", m10);
            abstractC0993b = (AbstractC0994c) t.C2(m10);
            if (abstractC0993b == null) {
                return null;
            }
        }
        return abstractC0993b.g();
    }

    public final boolean a(AbstractC1003l abstractC1003l, AbstractC1003l abstractC1003l2, boolean z10, boolean z11) {
        boolean z12;
        if ((abstractC1003l instanceof AbstractC0997f) && (abstractC1003l2 instanceof AbstractC0997f)) {
            return AbstractC3557B.K(((AbstractC0997f) abstractC1003l).f(), ((AbstractC0997f) abstractC1003l2).f());
        }
        if ((abstractC1003l instanceof b0) && (abstractC1003l2 instanceof b0)) {
            return b((b0) abstractC1003l, (b0) abstractC1003l2, z10, C4835b.f40337Y);
        }
        if ((abstractC1003l instanceof AbstractC0993b) && (abstractC1003l2 instanceof AbstractC0993b)) {
            AbstractC0993b abstractC0993b = (AbstractC0993b) abstractC1003l;
            AbstractC0993b abstractC0993b2 = (AbstractC0993b) abstractC1003l2;
            AbstractC3557B.c0("a", abstractC0993b);
            AbstractC3557B.c0("b", abstractC0993b2);
            boolean z13 = true;
            if (!AbstractC3557B.K(abstractC0993b, abstractC0993b2)) {
                if (AbstractC3557B.K(abstractC0993b.getName(), abstractC0993b2.getName()) && ((!z11 || !(abstractC0993b instanceof AbstractC1016z) || !(abstractC0993b2 instanceof AbstractC1016z) || ((AbstractC1016z) abstractC0993b).H() == ((AbstractC1016z) abstractC0993b2).H()) && ((!AbstractC3557B.K(abstractC0993b.mo20k(), abstractC0993b2.mo20k()) || (z10 && AbstractC3557B.K(d(abstractC0993b), d(abstractC0993b2)))) && !AbstractC4838e.o(abstractC0993b) && !AbstractC4838e.o(abstractC0993b2)))) {
                    AbstractC1003l mo20k = abstractC0993b.mo20k();
                    AbstractC1003l mo20k2 = abstractC0993b2.mo20k();
                    if (!(mo20k instanceof AbstractC0994c) && !(mo20k2 instanceof AbstractC0994c)) {
                        z12 = a(mo20k, mo20k2, z10, true);
                    } else {
                        z12 = Boolean.FALSE.booleanValue();
                    }
                    if (z12) {
                        C4846m c4846m = new C4846m(new C4711b(abstractC0993b, abstractC0993b2, z10));
                        if (c4846m.m(abstractC0993b, abstractC0993b2, null, true).c() != 1 || c4846m.m(abstractC0993b2, abstractC0993b, null, true).c() != 1) {
                            z13 = false;
                        }
                    }
                }
                return false;
            }
            return z13;
        } else if ((abstractC1003l instanceof G) && (abstractC1003l2 instanceof G)) {
            return AbstractC3557B.K(((I) ((G) abstractC1003l)).f14010j0, ((I) ((G) abstractC1003l2)).f14010j0);
        } else {
            return AbstractC3557B.K(abstractC1003l, abstractC1003l2);
        }
    }

    public final boolean b(b0 b0Var, b0 b0Var2, boolean z10, wf.n nVar) {
        AbstractC3557B.c0("a", b0Var);
        AbstractC3557B.c0("b", b0Var2);
        AbstractC3557B.c0("equivalentCallables", nVar);
        if (AbstractC3557B.K(b0Var, b0Var2)) {
            return true;
        }
        if (!AbstractC3557B.K(b0Var.mo20k(), b0Var2.mo20k()) && c(b0Var, b0Var2, nVar, z10) && b0Var.getIndex() == b0Var2.getIndex()) {
            return true;
        }
        return false;
    }

    public final boolean c(AbstractC1003l abstractC1003l, AbstractC1003l abstractC1003l2, wf.n nVar, boolean z10) {
        AbstractC1003l mo20k = abstractC1003l.mo20k();
        AbstractC1003l mo20k2 = abstractC1003l2.mo20k();
        if (!(mo20k instanceof AbstractC0994c) && !(mo20k2 instanceof AbstractC0994c)) {
            return a(mo20k, mo20k2, z10, true);
        }
        return ((Boolean) nVar.invoke(mo20k, mo20k2)).booleanValue();
    }
}
