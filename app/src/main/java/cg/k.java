package Cg;

import Bg.D;
import Bg.Q;
import Bg.Y;
import Bg.o0;
import id.AbstractC3557B;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends D implements Eg.c {

    /* renamed from: Z  reason: collision with root package name */
    public final Eg.b f3129Z;

    /* renamed from: h0  reason: collision with root package name */
    public final l f3130h0;

    /* renamed from: i0  reason: collision with root package name */
    public final o0 f3131i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Q f3132j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f3133k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f3134l0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(Eg.b bVar, l lVar, o0 o0Var, Q q10, boolean z10, int i10) {
        this(bVar, lVar, o0Var, q10, (i10 & 16) != 0 ? false : z10, false);
        if ((i10 & 8) != 0) {
            Q.f2084Z.getClass();
            q10 = Q.f2085h0;
        }
    }

    @Override // Bg.D, Bg.o0
    public final o0 C0(boolean z10) {
        return new k(this.f3129Z, this.f3130h0, this.f3131i0, this.f3132j0, z10, 32);
    }

    @Override // Bg.D
    public final D F0(boolean z10) {
        return new k(this.f3129Z, this.f3130h0, this.f3131i0, this.f3132j0, z10, 32);
    }

    @Override // Bg.D
    public final D G0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        return new k(this.f3129Z, this.f3130h0, this.f3131i0, q10, this.f3133k0, this.f3134l0);
    }

    /* renamed from: H0 */
    public final k D0(i iVar) {
        o0 o0Var;
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        l b10 = this.f3130h0.b(iVar);
        o0 o0Var2 = this.f3131i0;
        if (o0Var2 != null) {
            o0Var = o0Var2.B0();
        } else {
            o0Var = null;
        }
        return new k(this.f3129Z, b10, o0Var, this.f3132j0, this.f3133k0, 32);
    }

    @Override // Bg.A
    public final ug.n R() {
        return Dg.m.a(Dg.i.f3660Z, true, new String[0]);
    }

    @Override // Bg.A
    public final List w0() {
        return kf.v.f37483Y;
    }

    @Override // Bg.A
    public final Q x0() {
        return this.f3132j0;
    }

    @Override // Bg.A
    public final Y y0() {
        return this.f3130h0;
    }

    @Override // Bg.A
    public final boolean z0() {
        return this.f3133k0;
    }

    public k(Eg.b bVar, l lVar, o0 o0Var, Q q10, boolean z10, boolean z11) {
        AbstractC3557B.c0("captureStatus", bVar);
        AbstractC3557B.c0("constructor", lVar);
        AbstractC3557B.c0("attributes", q10);
        this.f3129Z = bVar;
        this.f3130h0 = lVar;
        this.f3131i0 = o0Var;
        this.f3132j0 = q10;
        this.f3133k0 = z10;
        this.f3134l0 = z11;
    }
}
