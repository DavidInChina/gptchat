package Tg;

import Ng.B;
import nf.AbstractC4831k;

/* loaded from: classes.dex */
public final class l extends B {

    /* renamed from: Z  reason: collision with root package name */
    public static final l f17262Z = new B();

    @Override // Ng.B
    public final void O(AbstractC4831k abstractC4831k, Runnable runnable) {
        e eVar = e.f17248h0;
        eVar.f17250Z.h(runnable, k.f17261h, true);
    }

    @Override // Ng.B
    public final void r(AbstractC4831k abstractC4831k, Runnable runnable) {
        e eVar = e.f17248h0;
        eVar.f17250Z.h(runnable, k.f17261h, false);
    }

    @Override // Ng.B
    public final B u0(int i10) {
        R4.b.V(i10);
        if (i10 >= k.f17257d) {
            return this;
        }
        return super.u0(i10);
    }
}
