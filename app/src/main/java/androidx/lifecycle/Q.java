package androidx.lifecycle;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class Q implements AbstractC2084t {

    /* renamed from: Y  reason: collision with root package name */
    public final String f25322Y;

    /* renamed from: Z  reason: collision with root package name */
    public final P f25323Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f25324h0;

    public Q(String str, P p10) {
        this.f25322Y = str;
        this.f25323Z = p10;
    }

    public final void a(A3.d dVar, S s10) {
        AbstractC3557B.c0("registry", dVar);
        AbstractC3557B.c0("lifecycle", s10);
        if (!this.f25324h0) {
            this.f25324h0 = true;
            s10.a(this);
            dVar.c(this.f25322Y, this.f25323Z.f25312e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        if (enumC2081p == EnumC2081p.ON_DESTROY) {
            this.f25324h0 = false;
            abstractC2086v.h().g(this);
        }
    }
}
