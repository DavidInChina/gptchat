package Dg;

import Mf.A;
import Mf.AbstractC0994c;
import Mf.AbstractC1003l;
import Mf.AbstractC1012v;
import Mf.AbstractC1013w;
import Mf.C1008q;
import Mf.V;
import Pf.AbstractC1165x;
import Pf.T;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Collection;
import kg.C4294f;

/* loaded from: classes.dex */
public final class d extends T {
    @Override // Pf.AbstractC1165x, Mf.AbstractC0994c
    public final /* bridge */ /* synthetic */ AbstractC0994c D(AbstractC1003l abstractC1003l, A a5, C1008q c1008q) {
        x0(abstractC1003l, a5, c1008q);
        return this;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC0994c
    public final void h0(Collection collection) {
        AbstractC3557B.c0("overriddenDescriptors", collection);
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC1013w
    public final boolean isSuspend() {
        return false;
    }

    @Override // Pf.T, Pf.AbstractC1165x, Mf.AbstractC1013w
    public final AbstractC1012v m0() {
        return new c(this);
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC0993b
    public final Object q0(Wf.e eVar) {
        return null;
    }

    @Override // Pf.AbstractC1165x
    public final T x0(AbstractC1003l abstractC1003l, A a5, C1008q c1008q) {
        AbstractC3557B.c0("newOwner", abstractC1003l);
        AbstractC3557B.c0("visibility", c1008q);
        AbstractC2469q0.q("kind", 2);
        return this;
    }

    @Override // Pf.T, Pf.AbstractC1165x
    public final AbstractC1165x y0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, V v10, Nf.i iVar, C4294f c4294f) {
        AbstractC3557B.c0("newOwner", abstractC1003l);
        AbstractC2469q0.q("kind", i10);
        AbstractC3557B.c0("annotations", iVar);
        return this;
    }
}
