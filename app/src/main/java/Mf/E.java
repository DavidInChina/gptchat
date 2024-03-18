package Mf;

import Bg.C0221n;
import Pf.AbstractC1155m;
import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kg.C4294f;
import rg.AbstractC5493d;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class E extends AbstractC1155m {

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f12060m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ArrayList f12061n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C0221n f12062o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Ag.u uVar, AbstractC0999h abstractC0999h, C4294f c4294f, boolean z10, int i10) {
        super(uVar, abstractC0999h, c4294f, V.f12075a);
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("container", abstractC0999h);
        this.f12060m0 = z10;
        Cf.g D02 = com.google.android.gms.internal.play_billing.N.D0(0, i10);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(D02, 10));
        Cf.f it = D02.iterator();
        while (it.f3111h0) {
            int a5 = it.a();
            Bg.p0 p0Var = Bg.p0.f2146h0;
            arrayList.add(Pf.Z.A0(this, p0Var, C4294f.e(TokenNames.T + a5), a5, uVar));
        }
        this.f12061n0 = arrayList;
        this.f12062o0 = new C0221n(this, AbstractC3557B.i0(this), R4.b.W1(AbstractC5493d.j(this).j().e()), uVar);
    }

    @Override // Mf.AbstractC0997f
    public final boolean F() {
        return false;
    }

    @Override // Mf.AbstractC1016z
    public final boolean H() {
        return false;
    }

    @Override // Mf.AbstractC1001j
    public final boolean I() {
        return this.f12060m0;
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC0996e M() {
        return null;
    }

    @Override // Mf.AbstractC0997f
    public final /* bridge */ /* synthetic */ ug.n N() {
        return ug.m.f46797b;
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC0997f P() {
        return null;
    }

    @Override // Mf.AbstractC0997f
    public final EnumC0998g e() {
        return EnumC0998g.f12084Y;
    }

    @Override // Mf.AbstractC1000i
    public final Bg.Y f() {
        return this.f12062o0;
    }

    @Override // Nf.a
    public final Nf.i getAnnotations() {
        return Nf.h.f12822a;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        C1008q c1008q = r.f12105e;
        AbstractC3557B.b0("PUBLIC", c1008q);
        return c1008q;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1016z
    public final A h() {
        return A.f12051Z;
    }

    @Override // Mf.AbstractC0997f
    public final Collection i() {
        return kf.v.f37483Y;
    }

    @Override // Pf.AbstractC1155m, Mf.AbstractC1016z
    public final boolean isExternal() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final boolean isInline() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final f0 j0() {
        return null;
    }

    @Override // Pf.D
    public final ug.n k0(Cg.i iVar) {
        return ug.m.f46797b;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1001j
    public final List o() {
        return this.f12061n0;
    }

    @Override // Mf.AbstractC1016z
    public final boolean o0() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final boolean q() {
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final boolean t0() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // Mf.AbstractC0997f
    public final Collection u() {
        return kf.x.f37485Y;
    }

    @Override // Mf.AbstractC0997f
    public final boolean y() {
        return false;
    }
}
