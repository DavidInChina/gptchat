package Bh;

import Qh.AbstractC1239q;
import th.AbstractC5806n;
import wh.AbstractC6235K;
import wh.AbstractC6241f;
import wh.AbstractC6250o;
import wh.C6229E;
import yh.AbstractC6632q;
import yh.G1;
import yh.l1;

/* loaded from: classes.dex */
public final class X0 extends AbstractC6241f {

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f2303Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC6250o f2304h0;

    public X0(AbstractC6250o abstractC6250o, l1 l1Var) {
        this.f2303Z = l1Var;
        this.f2304h0 = abstractC6250o;
    }

    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return this.f2304h0.getName();
    }

    @Override // wh.AbstractC6250o
    public final G1 V() {
        return this.f2304h0.V().C();
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC6632q mo118a() {
        return this.f2303Z;
    }

    @Override // wh.AbstractC6250o
    public final th.h0 f() {
        return null;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f2304h0.getDeclaredAnnotations();
    }

    @Override // wh.AbstractC6250o
    public final AbstractC6235K getParameters() {
        return new C6229E(this, this.f2304h0.getParameters().I0().C());
    }

    @Override // wh.AbstractC6250o
    public final l1.a getReturnType() {
        return this.f2304h0.getReturnType().p0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yh.G1, Qh.q] */
    @Override // sh.AbstractC5641m
    public final G1 r0() {
        return new AbstractC1239q(1);
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return (this.f2304h0.u0() | 4160) & (-257);
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        return this.f2303Z;
    }
}
