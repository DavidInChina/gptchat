package Tg;

import Ng.AbstractC1055c0;
import nf.AbstractC4831k;

/* loaded from: classes.dex */
public abstract class h extends AbstractC1055c0 {

    /* renamed from: Z  reason: collision with root package name */
    public final c f17250Z;

    public h(long j6, String str, int i10, int i11) {
        this.f17250Z = new c(j6, str, i10, i11);
    }

    @Override // Ng.B
    public final void O(AbstractC4831k abstractC4831k, Runnable runnable) {
        c.i(this.f17250Z, runnable, true, 2);
    }

    @Override // Ng.B
    public final void r(AbstractC4831k abstractC4831k, Runnable runnable) {
        c.i(this.f17250Z, runnable, false, 6);
    }
}
