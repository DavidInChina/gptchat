package yh;

import th.AbstractC5806n;
import yh.l1;

/* renamed from: yh.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6607f0 extends AbstractC6616i0 {

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6621k0 f51004Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f51005h0;

    /* renamed from: i0  reason: collision with root package name */
    public final l1.a f51006i0;

    /* renamed from: j0  reason: collision with root package name */
    public transient /* synthetic */ l1.a f51007j0;

    public C6607f0(AbstractC6621k0 abstractC6621k0, int i10, l1.a aVar) {
        this.f51004Z = abstractC6621k0;
        this.f51005h0 = i10;
        this.f51006i0 = aVar;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return i1().getDeclaredAnnotations();
    }

    @Override // yh.AbstractC6621k0
    public final l1.a i1() {
        l1.a aVar;
        if (this.f51007j0 != null) {
            aVar = null;
        } else {
            aVar = (l1.a) this.f51004Z.i1().o0().get(this.f51005h0);
        }
        if (aVar == null) {
            return this.f51007j0;
        }
        this.f51007j0 = aVar;
        return aVar;
    }

    @Override // yh.AbstractC6632q
    public final l1 l0() {
        return this.f51006i0.l0();
    }
}
