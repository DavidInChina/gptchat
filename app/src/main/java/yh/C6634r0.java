package yh;

import Qh.AbstractC1239q;
import th.AbstractC5806n;
import wh.AbstractC6256u;
import wh.C6255t;
import yh.l1;

/* renamed from: yh.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6634r0 extends AbstractC6638t0 {

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f51073Z;

    public C6634r0(l1 l1Var) {
        this.f51073Z = l1Var;
    }

    public static AbstractC6638t0 i1(l1 l1Var) {
        if (l1Var.V0()) {
            return new C6634r0(l1Var);
        }
        return new C6631p0(l1Var);
    }

    @Override // yh.AbstractC6638t0, yh.AbstractC6632q
    public final l1.a L() {
        l1.a L10 = this.f51073Z.L();
        if (L10 == null) {
            return null;
        }
        return new C6619j0(L10, W0.f50975Z, L10);
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        l1 mo119g = this.f51073Z.mo119g();
        if (mo119g == null) {
            return null;
        }
        return i1(mo119g);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [th.n, Qh.q] */
    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return new AbstractC1239q(1);
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        l1 mo118a = this.f51073Z.mo118a();
        if (mo118a == null) {
            return null;
        }
        return i1(mo118a);
    }

    @Override // yh.AbstractC6638t0, yh.l1.a, yh.AbstractC6632q
    public final AbstractC6256u i() {
        return new C6255t(this, this.f51073Z.i(), EnumC6605e1.f50998Y);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return this.f51073Z;
    }

    @Override // yh.AbstractC6638t0, yh.AbstractC6632q
    public final G1 o0() {
        return new w1(this.f51073Z.o0(), W0.f50975Z);
    }
}
