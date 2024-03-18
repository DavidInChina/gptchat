package wh;

import java.util.List;
import sh.C5629a;
import th.AbstractC5806n;
import th.C5805m;
import th.h0;
import yh.AbstractC6632q;
import yh.G1;
import yh.X0;
import yh.l1;
import yh.t1;
import yh.v1;
import yh.x1;

/* renamed from: wh.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6245j extends AbstractC6241f {

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f48536Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f48537h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f48538i0;

    /* renamed from: j0  reason: collision with root package name */
    public final List f48539j0;

    /* renamed from: k0  reason: collision with root package name */
    public final l1.a f48540k0;

    /* renamed from: l0  reason: collision with root package name */
    public final List f48541l0;

    /* renamed from: m0  reason: collision with root package name */
    public final List f48542m0;

    /* renamed from: n0  reason: collision with root package name */
    public final List f48543n0;

    /* renamed from: o0  reason: collision with root package name */
    public final h0 f48544o0;

    /* renamed from: p0  reason: collision with root package name */
    public final l1.a f48545p0;

    public C6245j(l1 l1Var, C6247l c6247l) {
        String str = c6247l.f48550a;
        C5629a c5629a = new C5629a(c6247l.f48552c);
        C5629a c5629a2 = new C5629a(c6247l.f48554e);
        t1 t1Var = new t1(c6247l.f48555f);
        C5805m c5805m = new C5805m(0, c6247l.f48556g);
        this.f48536Z = l1Var;
        this.f48537h0 = str;
        this.f48538i0 = c6247l.f48551b;
        this.f48539j0 = c5629a;
        this.f48540k0 = c6247l.f48553d;
        this.f48541l0 = c5629a2;
        this.f48542m0 = t1Var;
        this.f48543n0 = c5805m;
        this.f48544o0 = c6247l.f48557h;
        this.f48545p0 = c6247l.f48558i;
    }

    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return this.f48537h0;
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o
    public final l1.a T() {
        l1.a aVar = this.f48545p0;
        if (aVar == null) {
            return super.T();
        }
        return (l1.a) aVar.k(new X0(mo118a(), this));
    }

    @Override // wh.AbstractC6250o
    public final G1 V() {
        return new x1(this.f48542m0, X0.h(this));
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC6632q mo118a() {
        return this.f48536Z;
    }

    @Override // wh.AbstractC6250o
    public final h0 f() {
        return this.f48544o0;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return new C5805m(0, this.f48543n0);
    }

    @Override // wh.AbstractC6250o
    public final AbstractC6235K getParameters() {
        return new C6233I(this, this.f48541l0);
    }

    @Override // wh.AbstractC6250o
    public final l1.a getReturnType() {
        return (l1.a) this.f48540k0.k(X0.h(this));
    }

    @Override // sh.AbstractC5641m
    public final G1 r0() {
        int i10 = x1.f51105i0;
        return new v1(this, this.f48539j0, new X0(mo118a(), this));
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return this.f48538i0;
    }

    @Override // wh.AbstractC6241f, wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final l1 mo118a() {
        return this.f48536Z;
    }
}
