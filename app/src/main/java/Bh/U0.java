package Bh;

import Qh.AbstractC1239q;
import th.AbstractC5806n;
import wh.AbstractC6235K;
import wh.AbstractC6241f;
import wh.AbstractC6250o;
import wh.C6229E;
import wh.C6249n;
import yh.AbstractC6632q;
import yh.EnumC6605e1;
import yh.G1;
import yh.l1;

/* loaded from: classes.dex */
public final class U0 extends AbstractC6241f {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6250o f2286Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C6249n f2287h0;

    /* renamed from: i0  reason: collision with root package name */
    public final l1 f2288i0;

    public U0(AbstractC6250o abstractC6250o, C6249n c6249n, l1 l1Var) {
        this.f2286Z = abstractC6250o;
        this.f2287h0 = c6249n;
        this.f2288i0 = l1Var;
    }

    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return this.f2286Z.D0();
    }

    @Override // wh.AbstractC6250o
    public final G1 V() {
        return this.f2286Z.V().k(EnumC6605e1.f50998Y);
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC6632q mo118a() {
        return this.f2288i0;
    }

    @Override // wh.AbstractC6250o
    public final th.h0 f() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [th.n, Qh.q] */
    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return new AbstractC1239q(1);
    }

    @Override // wh.AbstractC6250o
    public final AbstractC6235K getParameters() {
        return new C6229E(this, this.f2287h0.f48564b);
    }

    @Override // wh.AbstractC6250o
    public final l1.a getReturnType() {
        return this.f2287h0.f48563a.w0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yh.G1, Qh.q] */
    @Override // sh.AbstractC5641m
    public final G1 r0() {
        return new AbstractC1239q(1);
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return (this.f2286Z.u0() | 4160) & (-1281);
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        return this.f2288i0;
    }
}
