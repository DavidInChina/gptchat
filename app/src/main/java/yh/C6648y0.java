package yh;

import java.util.List;
import th.AbstractC5806n;
import th.AbstractC5808p;
import yh.l1;

/* renamed from: yh.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6648y0 extends C0 {

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f51108Z;

    /* renamed from: h0  reason: collision with root package name */
    public final l1.a f51109h0;

    /* renamed from: i0  reason: collision with root package name */
    public final List f51110i0;

    /* renamed from: j0  reason: collision with root package name */
    public final AbstractC5808p f51111j0;

    public C6648y0(l1 l1Var, l1.a aVar, List list, AbstractC5808p abstractC5808p) {
        this.f51108Z = l1Var;
        this.f51109h0 = aVar;
        this.f51110i0 = list;
        this.f51111j0 = abstractC5808p;
    }

    @Override // yh.C0, yh.AbstractC6643w, yh.l1.a, yh.AbstractC6632q
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ AbstractC6632q mo119g() {
        mo119g();
        throw null;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f51111j0.getDeclaredAnnotations();
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        return this.f51109h0;
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return this.f51108Z;
    }

    @Override // yh.l1.a
    public final G1 y0() {
        return new t1(this.f51110i0);
    }
}
