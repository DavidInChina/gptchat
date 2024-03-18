package wh;

import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import Qh.a0;
import sh.AbstractC5631c;
import th.AbstractC5806n;
import th.h0;
import yh.AbstractC6632q;
import yh.EnumC6628o;
import yh.G1;
import yh.k1;
import yh.l1;
import yh.x1;

/* renamed from: wh.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6248m extends AbstractC6236a implements AbstractC6243h {

    /* renamed from: Z  reason: collision with root package name */
    public final l1.a f48560Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC6250o f48561h0;

    /* renamed from: i0  reason: collision with root package name */
    public final k1 f48562i0;

    public C6248m(l1.a aVar, AbstractC6250o abstractC6250o, k1 k1Var) {
        this.f48560Z = aVar;
        this.f48561h0 = abstractC6250o;
        this.f48562i0 = k1Var;
    }

    @Override // sh.AbstractC5637i.b
    public final String D0() {
        return this.f48561h0.D0();
    }

    @Override // wh.AbstractC6236a, wh.AbstractC6250o
    public final boolean F0() {
        return this.f48561h0.F0();
    }

    @Override // wh.AbstractC6250o
    public final l1.a T() {
        l1.a T = this.f48561h0.T();
        if (T == null) {
            l1.a aVar = l1.a.f51045N;
            return null;
        }
        return (l1.a) T.k(this.f48562i0);
    }

    @Override // wh.AbstractC6236a, wh.AbstractC6250o
    public final boolean U() {
        return this.f48561h0.U();
    }

    @Override // wh.AbstractC6250o
    public final G1 V() {
        return new x1(this.f48561h0.V(), this.f48562i0);
    }

    @Override // wh.AbstractC6236a, wh.AbstractC6250o
    public final boolean W0() {
        return this.f48561h0.W0();
    }

    @Override // wh.AbstractC6250o, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final AbstractC6632q mo118a() {
        return this.f48560Z;
    }

    @Override // wh.AbstractC6250o
    public final h0 f() {
        return this.f48561h0.f();
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f48561h0.getDeclaredAnnotations();
    }

    @Override // wh.AbstractC6250o
    public final AbstractC6235K getParameters() {
        return new C6234J(this, this.f48561h0.getParameters(), this.f48562i0);
    }

    @Override // wh.AbstractC6250o
    public final l1.a getReturnType() {
        return (l1.a) this.f48561h0.getReturnType().k(this.f48562i0);
    }

    @Override // sh.AbstractC5641m
    public final G1 r0() {
        return (G1) ((AbstractC1239q) this.f48561h0.r0().k(this.f48562i0)).f(new a0(AbstractC1235m.a(EnumC6628o.f51061j0)));
    }

    @Override // sh.AbstractC5636h
    public final int u0() {
        return this.f48561h0.u0();
    }

    @Override // sh.AbstractC5631c
    public final AbstractC5631c y() {
        return (AbstractC6242g) this.f48561h0.y();
    }
}
