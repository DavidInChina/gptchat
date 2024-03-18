package Eh;

import wh.AbstractC6236a;
import wh.AbstractC6250o;
import yh.l1;

/* loaded from: classes.dex */
public final class H implements J {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f4751Y;

    public H(l1 l1Var) {
        this.f4751Y = l1Var;
    }

    @Override // Eh.J
    public final Hh.n b(AbstractC6250o abstractC6250o, AbstractC0522v abstractC0522v) {
        AbstractC6236a abstractC6236a = (AbstractC6236a) abstractC6250o;
        boolean o12 = abstractC6236a.o1();
        l1 l1Var = this.f4751Y;
        if (o12 && (abstractC6236a.h1(8) || abstractC6236a.U() || !abstractC6236a.m0(l1Var) || (!abstractC6236a.o1() ? !abstractC6236a.mo118a().l0().equals(l1Var) : !abstractC6236a.mo118a().l0().f0(l1Var)))) {
            throw new IllegalStateException("Cannot invoke " + abstractC6236a + " on " + l1Var);
        } else if (abstractC6236a.o1()) {
            return E9.f.i(abstractC6236a).f(l1Var);
        } else {
            return E9.f.i(abstractC6236a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        if (this.f4751Y.equals(((H) obj).f4751Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4751Y.hashCode() + (H.class.hashCode() * 31);
    }
}
