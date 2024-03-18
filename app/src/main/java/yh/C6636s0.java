package yh;

import th.AbstractC5806n;
import th.AbstractC5808p;
import yh.l1;

/* renamed from: yh.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6636s0 extends AbstractC6638t0 {

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f51077Z;

    /* renamed from: h0  reason: collision with root package name */
    public final l1.a f51078h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC5808p f51079i0;

    public C6636s0(l1 l1Var, l1.a aVar, AbstractC5808p abstractC5808p) {
        this.f51077Z = l1Var;
        this.f51078h0 = aVar;
        this.f51079i0 = abstractC5808p;
    }

    @Override // yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final l1.a mo119g() {
        l1 mo119g = this.f51077Z.mo119g();
        if (mo119g == null) {
            return null;
        }
        return mo119g.w0();
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f51079i0.getDeclaredAnnotations();
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        return this.f51078h0;
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return this.f51077Z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6636s0(l1 l1Var, AbstractC5808p abstractC5808p) {
        this(l1Var, r0 == null ? null : r0.w0(), abstractC5808p);
        l1 mo118a = l1Var.mo118a();
    }
}
