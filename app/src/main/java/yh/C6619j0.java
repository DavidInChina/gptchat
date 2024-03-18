package yh;

import th.AbstractC5806n;
import th.AbstractC5808p;
import yh.l1;

/* renamed from: yh.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6619j0 extends AbstractC6601d0 {

    /* renamed from: Z  reason: collision with root package name */
    public final l1.a f51016Z;

    /* renamed from: h0  reason: collision with root package name */
    public final k1 f51017h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC5808p f51018i0;

    /* renamed from: j0  reason: collision with root package name */
    public transient /* synthetic */ l1.a f51019j0;

    public C6619j0(l1.a aVar, k1 k1Var, AbstractC5808p abstractC5808p) {
        this.f51016Z = aVar;
        this.f51017h0 = k1Var;
        this.f51018i0 = abstractC5808p;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return this.f51018i0.getDeclaredAnnotations();
    }

    @Override // yh.AbstractC6621k0
    public final l1.a i1() {
        l1.a aVar;
        if (this.f51019j0 != null) {
            aVar = null;
        } else {
            aVar = (l1.a) this.f51016Z.k(this.f51017h0);
        }
        if (aVar == null) {
            return this.f51019j0;
        }
        this.f51019j0 = aVar;
        return aVar;
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return this.f51016Z.l0();
    }
}
