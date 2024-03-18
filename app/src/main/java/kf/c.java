package Kf;

import Ag.u;
import Bg.Y;
import Bg.p0;
import Jf.q;
import Mf.A;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.C1008q;
import Mf.EnumC0998g;
import Mf.G;
import Mf.V;
import Mf.f0;
import Mf.r;
import Pf.AbstractC1144b;
import Pf.Z;
import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jf.y;
import kf.t;
import kf.v;
import kg.C4290b;
import kg.C4294f;
import ug.AbstractC5926h;
import ug.n;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class c extends AbstractC1144b {

    /* renamed from: q0  reason: collision with root package name */
    public static final C4290b f9790q0 = new C4290b(q.f9204k, C4294f.e("Function"));

    /* renamed from: r0  reason: collision with root package name */
    public static final C4290b f9791r0 = new C4290b(q.f9202i, C4294f.e("KFunction"));

    /* renamed from: j0  reason: collision with root package name */
    public final u f9792j0;

    /* renamed from: k0  reason: collision with root package name */
    public final G f9793k0;

    /* renamed from: l0  reason: collision with root package name */
    public final k f9794l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f9795m0;

    /* renamed from: n0  reason: collision with root package name */
    public final b f9796n0 = new b(this);

    /* renamed from: o0  reason: collision with root package name */
    public final e f9797o0;

    /* renamed from: p0  reason: collision with root package name */
    public final List f9798p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v2, types: [Kf.e, ug.h] */
    public c(u uVar, Jf.d dVar, k kVar, int i10) {
        super(uVar, kVar.a(i10));
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("containingDeclaration", dVar);
        AbstractC3557B.c0("functionTypeKind", kVar);
        this.f9792j0 = uVar;
        this.f9793k0 = dVar;
        this.f9794l0 = kVar;
        this.f9795m0 = i10;
        this.f9797o0 = new AbstractC5926h(uVar, this);
        ArrayList arrayList = new ArrayList();
        Cf.e eVar = new Cf.e(1, i10, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(eVar, 10));
        Cf.f it = eVar.iterator();
        while (it.f3111h0) {
            int a5 = it.a();
            p0 p0Var = p0.f2147i0;
            arrayList.add(Z.A0(this, p0Var, C4294f.e("P" + a5), arrayList.size(), this.f9792j0));
            arrayList2.add(y.f36177a);
        }
        arrayList.add(Z.A0(this, p0.f2148j0, C4294f.e(TokenNames.f24318R), arrayList.size(), this.f9792j0));
        this.f9798p0 = t.K2(arrayList);
        Cf.h hVar = d.f9799Y;
        k kVar2 = this.f9794l0;
        hVar.getClass();
        AbstractC3557B.c0("functionTypeKind", kVar2);
        if (!AbstractC3557B.K(kVar2, g.f9801c) && !AbstractC3557B.K(kVar2, j.f9804c) && !AbstractC3557B.K(kVar2, h.f9802c)) {
            AbstractC3557B.K(kVar2, i.f9803c);
        }
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
        return false;
    }

    @Override // Mf.AbstractC0997f
    public final /* bridge */ /* synthetic */ AbstractC0996e M() {
        return null;
    }

    @Override // Mf.AbstractC0997f
    public final /* bridge */ /* synthetic */ n N() {
        return ug.m.f46797b;
    }

    @Override // Mf.AbstractC0997f
    public final /* bridge */ /* synthetic */ AbstractC0997f P() {
        return null;
    }

    @Override // Mf.AbstractC0997f
    public final EnumC0998g e() {
        return EnumC0998g.f12085Z;
    }

    @Override // Mf.AbstractC1000i
    public final Y f() {
        return this.f9796n0;
    }

    @Override // Mf.AbstractC1004m
    public final V g() {
        return V.f12075a;
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
        return A.f12054j0;
    }

    @Override // Mf.AbstractC0997f
    public final /* bridge */ /* synthetic */ Collection i() {
        return v.f37483Y;
    }

    @Override // Mf.AbstractC1016z
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

    @Override // Mf.AbstractC1003l
    /* renamed from: k */
    public final AbstractC1003l mo20k() {
        return this.f9793k0;
    }

    @Override // Pf.D
    public final n k0(Cg.i iVar) {
        return this.f9797o0;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1001j
    public final List o() {
        return this.f9798p0;
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
        String b10 = getName().b();
        AbstractC3557B.b0("asString(...)", b10);
        return b10;
    }

    @Override // Mf.AbstractC0997f
    public final /* bridge */ /* synthetic */ Collection u() {
        return v.f37483Y;
    }

    @Override // Mf.AbstractC0997f
    public final boolean y() {
        return false;
    }
}
