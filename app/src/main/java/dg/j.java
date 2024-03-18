package Dg;

import Bg.A;
import Bg.D;
import Bg.Q;
import Bg.Y;
import Bg.o0;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends D {

    /* renamed from: Z  reason: collision with root package name */
    public final Y f3667Z;

    /* renamed from: h0  reason: collision with root package name */
    public final ug.n f3668h0;

    /* renamed from: i0  reason: collision with root package name */
    public final l f3669i0;

    /* renamed from: j0  reason: collision with root package name */
    public final List f3670j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f3671k0;

    /* renamed from: l0  reason: collision with root package name */
    public final String[] f3672l0;

    /* renamed from: m0  reason: collision with root package name */
    public final String f3673m0;

    public j(Y y10, ug.n nVar, l lVar, List list, boolean z10, String... strArr) {
        AbstractC3557B.c0("constructor", y10);
        AbstractC3557B.c0("memberScope", nVar);
        AbstractC3557B.c0("kind", lVar);
        AbstractC3557B.c0("arguments", list);
        AbstractC3557B.c0("formatParams", strArr);
        this.f3667Z = y10;
        this.f3668h0 = nVar;
        this.f3669i0 = lVar;
        this.f3670j0 = list;
        this.f3671k0 = z10;
        this.f3672l0 = strArr;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.f3673m0 = String.format(lVar.f3707Y, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // Bg.A
    public final A A0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        return this;
    }

    @Override // Bg.o0
    public final o0 D0(Cg.i iVar) {
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        return this;
    }

    @Override // Bg.D, Bg.o0
    public final o0 E0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        return this;
    }

    @Override // Bg.D
    public final D F0(boolean z10) {
        String[] strArr = this.f3672l0;
        return new j(this.f3667Z, this.f3668h0, this.f3669i0, this.f3670j0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // Bg.D
    public final D G0(Q q10) {
        AbstractC3557B.c0("newAttributes", q10);
        return this;
    }

    @Override // Bg.A
    public final ug.n R() {
        return this.f3668h0;
    }

    @Override // Bg.A
    public final List w0() {
        return this.f3670j0;
    }

    @Override // Bg.A
    public final Q x0() {
        Q.f2084Z.getClass();
        return Q.f2085h0;
    }

    @Override // Bg.A
    public final Y y0() {
        return this.f3667Z;
    }

    @Override // Bg.A
    public final boolean z0() {
        return this.f3671k0;
    }
}
