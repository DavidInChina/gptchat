package G0;

import id.AbstractC3557B;
import l0.AbstractC4325q;

/* renamed from: G0.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0587p extends AbstractC4325q {

    /* renamed from: s0  reason: collision with root package name */
    public final int f5815s0 = AbstractC0579h.m(this);

    /* renamed from: t0  reason: collision with root package name */
    public AbstractC4325q f5816t0;

    public final void A0(AbstractC4325q abstractC4325q) {
        int i10;
        AbstractC4325q abstractC4325q2;
        AbstractC4325q abstractC4325q3 = abstractC4325q.f37720Y;
        if (abstractC4325q3 != abstractC4325q) {
            AbstractC4325q abstractC4325q4 = abstractC4325q.f37724j0;
            if (abstractC4325q3 == this.f37720Y && AbstractC3557B.K(abstractC4325q4, this)) {
                return;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
        } else if (!abstractC4325q3.f37732r0) {
            abstractC4325q3.f37720Y = this.f37720Y;
            int i11 = this.f37722h0;
            int n10 = AbstractC0579h.n(abstractC4325q3);
            abstractC4325q3.f37722h0 = n10;
            int i12 = this.f37722h0;
            int i13 = n10 & 2;
            if (i13 != 0 && (i12 & 2) != 0 && !(this instanceof C)) {
                throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC4325q3).toString());
            }
            abstractC4325q3.f37725k0 = this.f5816t0;
            this.f5816t0 = abstractC4325q3;
            abstractC4325q3.f37724j0 = this;
            int i14 = n10 | i12;
            this.f37722h0 = i14;
            if (i12 != i14) {
                AbstractC4325q abstractC4325q5 = this.f37720Y;
                if (abstractC4325q5 == this) {
                    this.f37723i0 = i14;
                }
                if (this.f37732r0) {
                    AbstractC4325q abstractC4325q6 = this;
                    while (abstractC4325q6 != null) {
                        i14 |= abstractC4325q6.f37722h0;
                        abstractC4325q6.f37722h0 = i14;
                        if (abstractC4325q6 == abstractC4325q5) {
                            break;
                        }
                        abstractC4325q6 = abstractC4325q6.f37724j0;
                    }
                    if (abstractC4325q6 != null && (abstractC4325q2 = abstractC4325q6.f37725k0) != null) {
                        i10 = abstractC4325q2.f37723i0;
                    } else {
                        i10 = 0;
                    }
                    int i15 = i14 | i10;
                    while (abstractC4325q6 != null) {
                        i15 |= abstractC4325q6.f37722h0;
                        abstractC4325q6.f37723i0 = i15;
                        abstractC4325q6 = abstractC4325q6.f37724j0;
                    }
                }
            }
            if (this.f37732r0) {
                if (i13 != 0 && (i11 & 2) == 0) {
                    C0572a0 c0572a0 = AbstractC0579h.A(this).f24831B0;
                    this.f37720Y.z0(null);
                    c0572a0.g();
                } else {
                    z0(this.f37727m0);
                }
                abstractC4325q3.r0();
                abstractC4325q3.x0();
                AbstractC0579h.h(abstractC4325q3);
            }
        } else {
            throw new IllegalStateException("Cannot delegate to an already attached node".toString());
        }
    }

    @Override // l0.AbstractC4325q
    public final void r0() {
        super.r0();
        for (AbstractC4325q abstractC4325q = this.f5816t0; abstractC4325q != null; abstractC4325q = abstractC4325q.f37725k0) {
            abstractC4325q.z0(this.f37727m0);
            if (!abstractC4325q.f37732r0) {
                abstractC4325q.r0();
            }
        }
    }

    @Override // l0.AbstractC4325q
    public final void s0() {
        for (AbstractC4325q abstractC4325q = this.f5816t0; abstractC4325q != null; abstractC4325q = abstractC4325q.f37725k0) {
            abstractC4325q.s0();
        }
        super.s0();
    }

    @Override // l0.AbstractC4325q
    public final void w0() {
        super.w0();
        for (AbstractC4325q abstractC4325q = this.f5816t0; abstractC4325q != null; abstractC4325q = abstractC4325q.f37725k0) {
            abstractC4325q.w0();
        }
    }

    @Override // l0.AbstractC4325q
    public final void x0() {
        for (AbstractC4325q abstractC4325q = this.f5816t0; abstractC4325q != null; abstractC4325q = abstractC4325q.f37725k0) {
            abstractC4325q.x0();
        }
        super.x0();
    }

    @Override // l0.AbstractC4325q
    public final void y0() {
        super.y0();
        for (AbstractC4325q abstractC4325q = this.f5816t0; abstractC4325q != null; abstractC4325q = abstractC4325q.f37725k0) {
            abstractC4325q.y0();
        }
    }

    @Override // l0.AbstractC4325q
    public final void z0(g0 g0Var) {
        this.f37727m0 = g0Var;
        for (AbstractC4325q abstractC4325q = this.f5816t0; abstractC4325q != null; abstractC4325q = abstractC4325q.f37725k0) {
            abstractC4325q.z0(g0Var);
        }
    }
}
