package yh;

import Qh.AbstractC1239q;
import th.AbstractC5806n;
import yh.l1;

/* renamed from: yh.u0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6640u0 extends C0 {

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f51084Z;

    public C6640u0(l1 l1Var) {
        this.f51084Z = l1Var;
    }

    public static AbstractC6643w i1(l1 l1Var) {
        if (l1Var.V0()) {
            return new C6640u0(l1Var);
        }
        return new C6631p0(l1Var);
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
        l1 mo118a = this.f51084Z.mo118a();
        if (mo118a == null) {
            return null;
        }
        return i1(mo118a);
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return this.f51084Z;
    }

    @Override // yh.l1.a
    public final G1 y0() {
        return new x1(this.f51084Z.r0(), O0.f50961Y);
    }
}
