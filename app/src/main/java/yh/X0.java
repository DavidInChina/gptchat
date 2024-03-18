package yh;

import k6.AbstractC4194d;
import sh.AbstractC5641m;
import wh.AbstractC6250o;
import yh.l1;

/* loaded from: classes.dex */
public final class X0 extends AbstractC6602d1 {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f50979Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC5641m f50980Z;

    public X0(l1 l1Var, AbstractC5641m abstractC5641m) {
        this.f50979Y = l1Var;
        this.f50980Z = abstractC5641m;
    }

    public static X0 h(AbstractC6250o abstractC6250o) {
        return new X0(abstractC6250o.mo118a(), abstractC6250o);
    }

    @Override // yh.k1
    public final Object a(l1.a aVar) {
        return new C6627n0((l1.a) aVar.mo119g().k(this), aVar);
    }

    @Override // yh.k1
    public final Object b(l1.a aVar) {
        if (aVar.T0()) {
            return new C6627n0((l1.a) aVar.mo119g().k(this), aVar);
        }
        return i(aVar);
    }

    @Override // yh.k1
    public final Object e(l1.a aVar) {
        return new G0(this.f50980Z.O0(aVar.A0()), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X0.class != obj.getClass()) {
            return false;
        }
        X0 x02 = (X0) obj;
        if (this.f50979Y.equals(x02.f50979Y) && this.f50980Z.equals(x02.f50980Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50980Z.hashCode() + AbstractC4194d.t(this.f50979Y, X0.class.hashCode() * 31, 31);
    }

    public final l1.a i(l1.a aVar) {
        if (aVar.H(zh.H.class)) {
            return new C6636s0(this.f50979Y, aVar);
        }
        return aVar;
    }

    public X0(AbstractC6632q abstractC6632q, AbstractC5641m abstractC5641m) {
        this(abstractC6632q.l0(), abstractC5641m);
    }
}
