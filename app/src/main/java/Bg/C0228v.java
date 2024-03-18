package Bg;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Bg.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0228v extends AbstractC0227u implements AbstractC0222o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228v(D d10, D d11) {
        super(d10, d11);
        AbstractC3557B.c0("lowerBound", d10);
        AbstractC3557B.c0("upperBound", d11);
    }

    @Override // Bg.A
    public final A A0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        D d10 = this.f2158Z;
        AbstractC3557B.c0("type", d10);
        D d11 = this.f2159h0;
        AbstractC3557B.c0("type", d11);
        return new C0228v(d10, d11);
    }

    @Override // Bg.o0
    public final o0 C0(boolean z10) {
        return C0213f.f(this.f2158Z.C0(z10), this.f2159h0.C0(z10));
    }

    @Override // Bg.o0
    public final o0 D0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        D d10 = this.f2158Z;
        AbstractC3557B.c0("type", d10);
        D d11 = this.f2159h0;
        AbstractC3557B.c0("type", d11);
        return new C0228v(d10, d11);
    }

    @Override // Bg.o0
    public final o0 E0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        return C0213f.f(this.f2158Z.E0(q10), this.f2159h0.E0(q10));
    }

    @Override // Bg.AbstractC0227u
    public final D F0() {
        return this.f2158Z;
    }

    @Override // Bg.AbstractC0227u
    public final String G0(mg.m mVar, mg.o oVar) {
        AbstractC3557B.c0("renderer", mVar);
        AbstractC3557B.c0("options", oVar);
        boolean k10 = oVar.k();
        D d10 = this.f2159h0;
        D d11 = this.f2158Z;
        if (k10) {
            return Separators.LPAREN + mVar.Y(d11) + ".." + mVar.Y(d10) + ')';
        }
        return mVar.E(mVar.Y(d11), mVar.Y(d10), Bi.c.P0(this));
    }

    @Override // Bg.AbstractC0222o
    public final boolean k0() {
        D d10 = this.f2158Z;
        if ((d10.y0().k() instanceof Mf.b0) && AbstractC3557B.K(d10.y0(), this.f2159h0.y0())) {
            return true;
        }
        return false;
    }

    @Override // Bg.AbstractC0222o
    public final o0 p0(A a5) {
        o0 o0Var;
        AbstractC3557B.c0("replacement", a5);
        o0 B02 = a5.B0();
        if (B02 instanceof AbstractC0227u) {
            o0Var = B02;
        } else if (B02 instanceof D) {
            D d10 = (D) B02;
            o0Var = C0213f.f(d10, d10.C0(true));
        } else {
            throw new RuntimeException();
        }
        return L4.a.B0(o0Var, B02);
    }

    @Override // Bg.AbstractC0227u
    public final String toString() {
        return Separators.LPAREN + this.f2158Z + ".." + this.f2159h0 + ')';
    }
}
