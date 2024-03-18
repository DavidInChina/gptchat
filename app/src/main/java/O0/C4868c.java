package o0;

import A.C0007a0;
import G0.AbstractC0579h;
import G0.j0;
import Ng.H;
import Z0.l;
import id.AbstractC3557B;
import l0.AbstractC4325q;
import t0.AbstractC5646e;

/* renamed from: o0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4868c extends AbstractC4325q implements AbstractC4867b, j0, AbstractC4866a {

    /* renamed from: s0  reason: collision with root package name */
    public final C4869d f40412s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f40413t0;

    /* renamed from: u0  reason: collision with root package name */
    public wf.k f40414u0;

    public C4868c(C4869d c4869d, wf.k kVar) {
        this.f40412s0 = c4869d;
        this.f40414u0 = kVar;
        c4869d.f40415Y = this;
    }

    public final void A0() {
        this.f40413t0 = false;
        this.f40412s0.f40416Z = null;
        AbstractC0579h.t(this);
    }

    @Override // G0.AbstractC0590t
    public final void G() {
        A0();
    }

    @Override // G0.j0
    public final void X() {
        A0();
    }

    @Override // o0.AbstractC4866a
    public final Z0.b b() {
        return AbstractC0579h.A(this).f24859w0;
    }

    @Override // G0.AbstractC0590t
    public final void f(AbstractC5646e abstractC5646e) {
        boolean z10 = this.f40413t0;
        C4869d c4869d = this.f40412s0;
        if (!z10) {
            c4869d.f40416Z = null;
            AbstractC0579h.y(this, new C0007a0(this, 9, c4869d));
            if (c4869d.f40416Z != null) {
                this.f40413t0 = true;
            } else {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
        }
        C4872g c4872g = c4869d.f40416Z;
        AbstractC3557B.Z(c4872g);
        c4872g.f40418a.invoke(abstractC5646e);
    }

    @Override // o0.AbstractC4866a
    public final long g() {
        return H.z(AbstractC0579h.z(this, 128).f4055h0);
    }

    @Override // o0.AbstractC4866a
    public final l getLayoutDirection() {
        return AbstractC0579h.A(this).f24860x0;
    }
}
