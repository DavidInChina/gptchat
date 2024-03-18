package yh;

import Qh.AbstractC1239q;
import th.AbstractC5806n;
import yh.l1;

/* renamed from: yh.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6631p0 extends AbstractC6638t0 {

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f51067Z;

    public C6631p0(l1 l1Var) {
        this.f51067Z = l1Var;
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        l1 mo119g = this.f51067Z.mo119g();
        if (mo119g == null) {
            return null;
        }
        return mo119g.w0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [th.n, Qh.q] */
    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return new AbstractC1239q(1);
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        l1 mo118a = this.f51067Z.mo118a();
        if (mo118a == null) {
            return null;
        }
        return mo118a.w0();
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return this.f51067Z;
    }
}
