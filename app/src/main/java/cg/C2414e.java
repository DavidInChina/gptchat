package cg;

import Bg.A;
import Bg.AbstractC0222o;
import Bg.AbstractC0227u;
import Bg.C0213f;
import Bg.D;
import Bg.Q;
import Bg.m0;
import Bg.o0;
import id.AbstractC3557B;

/* renamed from: cg.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2414e extends Bg.r implements AbstractC0222o {

    /* renamed from: Z  reason: collision with root package name */
    public final D f26627Z;

    public C2414e(D d10) {
        AbstractC3557B.c0("delegate", d10);
        this.f26627Z = d10;
    }

    @Override // Bg.D, Bg.o0
    public final o0 E0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        return new C2414e(this.f26627Z.E0(q10));
    }

    @Override // Bg.D
    public final D F0(boolean z10) {
        if (z10) {
            return this.f26627Z.C0(true);
        }
        return this;
    }

    @Override // Bg.D
    public final D G0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        return new C2414e(this.f26627Z.E0(q10));
    }

    @Override // Bg.r
    public final D H0() {
        return this.f26627Z;
    }

    @Override // Bg.r
    public final Bg.r J0(D d10) {
        return new C2414e(d10);
    }

    @Override // Bg.AbstractC0222o
    public final boolean k0() {
        return true;
    }

    @Override // Bg.AbstractC0222o
    public final o0 p0(A a5) {
        AbstractC3557B.c0("replacement", a5);
        o0 B02 = a5.B0();
        if (!m0.g(B02) && !m0.f(B02)) {
            return B02;
        }
        if (B02 instanceof D) {
            D d10 = (D) B02;
            D C02 = d10.C0(false);
            if (m0.g(d10)) {
                return new C2414e(C02);
            }
            return C02;
        } else if (B02 instanceof AbstractC0227u) {
            AbstractC0227u abstractC0227u = (AbstractC0227u) B02;
            D d11 = abstractC0227u.f2158Z;
            D C03 = d11.C0(false);
            if (m0.g(d11)) {
                C03 = new C2414e(C03);
            }
            D d12 = abstractC0227u.f2159h0;
            D C04 = d12.C0(false);
            if (m0.g(d12)) {
                C04 = new C2414e(C04);
            }
            return L4.a.Z0(C0213f.f(C03, C04), L4.a.u0(B02));
        } else {
            throw new IllegalStateException(("Incorrect type: " + B02).toString());
        }
    }

    @Override // Bg.r, Bg.A
    public final boolean z0() {
        return false;
    }
}
