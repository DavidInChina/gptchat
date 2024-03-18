package Mh;

import Eh.AbstractC0510i;
import Eh.AbstractC0511j;
import k6.AbstractC4194d;
import sh.AbstractC5634f;
import wh.AbstractC6236a;
import wh.AbstractC6242g;
import yh.l1;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class f extends Hh.i implements h {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f12153Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6242g f12154Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f12155h0;

    public f(int i10, AbstractC6242g abstractC6242g, l1 l1Var) {
        this.f12155h0 = i10;
        this.f12153Y = l1Var;
        this.f12154Z = abstractC6242g;
    }

    @Override // Mh.h
    public final Hh.n d(l1 l1Var) {
        AbstractC6242g abstractC6242g = this.f12154Z;
        AbstractC6236a abstractC6236a = (AbstractC6236a) abstractC6242g;
        if (!abstractC6236a.h1(8) && (abstractC6236a.h1(2) || abstractC6236a.W0() ? abstractC6236a.mo118a().equals(l1Var) : !(abstractC6236a.h1(1024) || !abstractC6236a.mo118a().l0().f0(l1Var)))) {
            return new f(4, abstractC6242g, l1Var);
        }
        return Hh.k.f7814Y;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        int p10;
        int i10 = this.f12155h0;
        if (E9.f.p(i10) != E9.f.o(i10) && !((AbstractC0510i) abstractC0511j).f4794b.d(ph.f.f43195q0)) {
            p10 = E9.f.o(i10);
        } else {
            p10 = E9.f.p(i10);
        }
        int i11 = p10;
        l1 l1Var = this.f12153Y;
        String D02 = l1Var.D0();
        AbstractC6242g abstractC6242g = this.f12154Z;
        lVar.z(i11, D02, abstractC6242g.D0(), abstractC6242g.getDescriptor(), l1Var.E0());
        int p11 = abstractC6242g.getReturnType().p().f7825Y - ((AbstractC6236a) abstractC6242g).p();
        return new Hh.l(p11, Math.max(0, p11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC6708l.c(this.f12155h0, fVar.f12155h0) && this.f12153Y.equals(fVar.f12153Y) && this.f12154Z.equals(fVar.f12154Z)) {
            return true;
        }
        return false;
    }

    @Override // Mh.h
    public final Hh.n f(l1 l1Var) {
        AbstractC6242g abstractC6242g = this.f12154Z;
        boolean W02 = abstractC6242g.W0();
        Hh.k kVar = Hh.k.f7814Y;
        if (!W02) {
            AbstractC5634f abstractC5634f = (AbstractC5634f) abstractC6242g;
            if (!abstractC5634f.h1(8)) {
                if (abstractC5634f.h1(2)) {
                    if (abstractC6242g.mo118a().equals(l1Var)) {
                        return this;
                    }
                    return kVar;
                } else if (l1Var.E0()) {
                    if (abstractC6242g.mo118a().H(Object.class)) {
                        return this;
                    }
                    return new f(2, abstractC6242g, l1Var);
                } else {
                    return new f(1, abstractC6242g, l1Var);
                }
            }
        }
        return kVar;
    }

    public final int hashCode() {
        int t10 = AbstractC4194d.t(this.f12153Y, f.class.hashCode() * 31, 31);
        return AbstractC6708l.f(this.f12155h0) + ((this.f12154Z.hashCode() + t10) * 31);
    }
}
