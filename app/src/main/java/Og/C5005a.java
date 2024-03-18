package og;

import Bg.A;
import Bg.D;
import Bg.Q;
import Bg.Y;
import Bg.d0;
import Bg.o0;
import Cg.i;
import Dg.m;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import kf.v;
import ug.n;

/* renamed from: og.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5005a extends D implements Eg.c {

    /* renamed from: Z  reason: collision with root package name */
    public final d0 f41338Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5006b f41339h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f41340i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Q f41341j0;

    public C5005a(d0 d0Var, AbstractC5006b abstractC5006b, boolean z10, Q q10) {
        AbstractC3557B.c0("typeProjection", d0Var);
        AbstractC3557B.c0("constructor", abstractC5006b);
        AbstractC3557B.c0("attributes", q10);
        this.f41338Z = d0Var;
        this.f41339h0 = abstractC5006b;
        this.f41340i0 = z10;
        this.f41341j0 = q10;
    }

    @Override // Bg.A
    public final A A0(i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        return new C5005a(this.f41338Z.a(iVar), this.f41339h0, this.f41340i0, this.f41341j0);
    }

    @Override // Bg.D, Bg.o0
    public final o0 C0(boolean z10) {
        if (z10 == this.f41340i0) {
            return this;
        }
        return new C5005a(this.f41338Z, this.f41339h0, z10, this.f41341j0);
    }

    @Override // Bg.o0
    public final o0 D0(i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        return new C5005a(this.f41338Z.a(iVar), this.f41339h0, this.f41340i0, this.f41341j0);
    }

    @Override // Bg.D
    public final D F0(boolean z10) {
        if (z10 == this.f41340i0) {
            return this;
        }
        return new C5005a(this.f41338Z, this.f41339h0, z10, this.f41341j0);
    }

    @Override // Bg.D
    public final D G0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        return new C5005a(this.f41338Z, this.f41339h0, this.f41340i0, q10);
    }

    @Override // Bg.A
    public final n R() {
        return m.a(Dg.i.f3660Z, true, new String[0]);
    }

    @Override // Bg.D
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f41338Z);
        sb2.append(')');
        if (this.f41340i0) {
            str = Separators.QUESTION;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // Bg.A
    public final List w0() {
        return v.f37483Y;
    }

    @Override // Bg.A
    public final Q x0() {
        return this.f41341j0;
    }

    @Override // Bg.A
    public final Y y0() {
        return this.f41339h0;
    }

    @Override // Bg.A
    public final boolean z0() {
        return this.f41340i0;
    }
}
