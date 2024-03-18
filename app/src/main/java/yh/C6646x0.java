package yh;

import Qh.AbstractC1239q;
import th.AbstractC5806n;
import wh.AbstractC6256u;
import wh.C6255t;
import yh.l1;

/* renamed from: yh.x0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6646x0 extends C0 {

    /* renamed from: Z  reason: collision with root package name */
    public final l1.a f51104Z;

    public C6646x0(l1.a aVar) {
        this.f51104Z = aVar;
    }

    @Override // yh.C0, yh.AbstractC6632q
    public final l1.a L() {
        l1.a L10 = super.L();
        if (L10 == null) {
            return null;
        }
        return new C6619j0(L10, W0.f50975Z, L10);
    }

    @Override // yh.C0, yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ AbstractC6632q mo119g() {
        mo119g();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [th.n, Qh.q] */
    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return new AbstractC1239q(1);
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        l1.a ownerType = this.f51104Z.getOwnerType();
        if (ownerType == null) {
            return null;
        }
        return (l1.a) ownerType.k(W0.f50975Z);
    }

    @Override // yh.C0, yh.l1.a, yh.AbstractC6632q
    public final AbstractC6256u i() {
        return new C6255t(this, super.i(), EnumC6605e1.f50998Y);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return this.f51104Z.l0();
    }

    @Override // yh.C0, yh.AbstractC6632q
    public final G1 o0() {
        return new w1(super.o0(), W0.f50975Z);
    }

    @Override // yh.l1.a
    public final G1 y0() {
        return new x1(this.f51104Z.y0(), EnumC6605e1.f50998Y);
    }
}
