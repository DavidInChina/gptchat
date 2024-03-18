package wh;

import sh.AbstractC5631c;
import th.AbstractC5806n;
import yh.k1;
import yh.l1;

/* renamed from: wh.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6225A extends AbstractC6257v {

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC6243h f48517h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC6226B f48518i0;

    /* renamed from: j0  reason: collision with root package name */
    public final k1 f48519j0;

    public C6225A(AbstractC6243h abstractC6243h, AbstractC6226B abstractC6226B, k1 k1Var) {
        this.f48517h0 = abstractC6243h;
        this.f48518i0 = abstractC6226B;
        this.f48519j0 = k1Var;
    }

    @Override // wh.AbstractC6226B
    public final AbstractC6250o B0() {
        return this.f48517h0;
    }

    @Override // wh.AbstractC6226B
    public final boolean L0() {
        return this.f48518i0.L0();
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f48518i0.getDeclaredAnnotations();
    }

    @Override // wh.AbstractC6226B
    public final int getIndex() {
        return this.f48518i0.getIndex();
    }

    @Override // wh.AbstractC6257v, sh.AbstractC5637i.b
    public final String getName() {
        return this.f48518i0.getName();
    }

    @Override // wh.AbstractC6226B
    public final l1.a getType() {
        return (l1.a) this.f48518i0.getType().k(this.f48519j0);
    }

    @Override // wh.AbstractC6257v, wh.AbstractC6226B
    public final int s() {
        return this.f48518i0.s();
    }

    @Override // wh.AbstractC6257v, sh.AbstractC5636h
    public final int u0() {
        return this.f48518i0.u0();
    }

    @Override // sh.AbstractC5638j
    public final boolean v0() {
        return this.f48518i0.v0();
    }

    @Override // sh.AbstractC5631c
    public final AbstractC5631c y() {
        return (AbstractC6258w) this.f48518i0.y();
    }
}
