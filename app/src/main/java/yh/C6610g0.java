package yh;

import th.AbstractC5806n;
import yh.l1;

/* renamed from: yh.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6610g0 extends AbstractC6616i0 {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6621k0 f51012Z;

    /* renamed from: h0  reason: collision with root package name */
    public transient /* synthetic */ l1.a f51013h0;

    public C6610g0(AbstractC6621k0 abstractC6621k0) {
        this.f51012Z = abstractC6621k0;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return i1().getDeclaredAnnotations();
    }

    @Override // yh.AbstractC6621k0
    public final l1.a i1() {
        l1.a aVar;
        if (this.f51013h0 != null) {
            aVar = null;
        } else {
            aVar = this.f51012Z.i1().L();
        }
        if (aVar == null) {
            return this.f51013h0;
        }
        this.f51013h0 = aVar;
        return aVar;
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return this.f51012Z.l0().L().l0();
    }
}
