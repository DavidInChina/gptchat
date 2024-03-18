package Bh;

import Qh.AbstractC1235m;
import th.AbstractC5806n;
import wh.AbstractC6235K;
import wh.AbstractC6241f;
import wh.AbstractC6250o;
import wh.C6233I;
import yh.AbstractC6632q;
import yh.G1;
import yh.l1;

/* loaded from: classes.dex */
public final class V0 extends AbstractC6241f {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6250o f2295Z;

    /* renamed from: h0  reason: collision with root package name */
    public final l1 f2296h0;

    public V0(AbstractC6250o abstractC6250o, l1 l1Var) {
        this.f2295Z = abstractC6250o;
        this.f2296h0 = l1Var;
    }

    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return this.f2295Z.D0();
    }

    @Override // wh.AbstractC6250o
    public final G1 V() {
        return this.f2295Z.V();
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC6632q mo118a() {
        return this.f2296h0;
    }

    @Override // wh.AbstractC6250o
    public final th.h0 f() {
        return this.f2295Z.f();
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f2295Z.getDeclaredAnnotations();
    }

    @Override // wh.AbstractC6250o
    public final AbstractC6235K getParameters() {
        return new C6233I(this, this.f2295Z.getParameters().b(AbstractC1235m.a(this.f2296h0)));
    }

    @Override // wh.AbstractC6250o
    public final l1.a getReturnType() {
        return this.f2295Z.getReturnType();
    }

    @Override // sh.AbstractC5641m
    public final G1 r0() {
        return this.f2295Z.r0();
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return this.f2295Z.u0();
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        return this.f2296h0;
    }
}
