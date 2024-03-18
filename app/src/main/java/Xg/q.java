package xg;

import fg.C3032C;
import gg.C3270a;
import hg.AbstractC3423b;
import hg.C3429h;
import id.AbstractC3557B;
import kg.C4291c;
import zg.AbstractC6864k;

/* loaded from: classes2.dex */
public abstract class q extends Pf.I {

    /* renamed from: l0  reason: collision with root package name */
    public final AbstractC3423b f50035l0;

    /* renamed from: m0  reason: collision with root package name */
    public final AbstractC6864k f50036m0 = null;

    /* renamed from: n0  reason: collision with root package name */
    public final C3429h f50037n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C6444A f50038o0;

    /* renamed from: p0  reason: collision with root package name */
    public fg.E f50039p0;

    /* renamed from: q0  reason: collision with root package name */
    public zg.q f50040q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C4291c c4291c, Ag.u uVar, Mf.B b10, fg.E e10, C3270a c3270a) {
        super(b10, c4291c);
        AbstractC3557B.c0("fqName", c4291c);
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("module", b10);
        this.f50035l0 = c3270a;
        fg.L l10 = e10.f30287i0;
        AbstractC3557B.b0("getStrings(...)", l10);
        fg.K k10 = e10.f30288j0;
        AbstractC3557B.b0("getQualifiedNames(...)", k10);
        C3429h c3429h = new C3429h(l10, k10);
        this.f50037n0 = c3429h;
        this.f50038o0 = new C6444A(e10, c3429h, c3270a, new Xf.f(11, this));
        this.f50039p0 = e10;
    }

    @Override // Mf.G
    public final ug.n R() {
        zg.q qVar = this.f50040q0;
        if (qVar != null) {
            return qVar;
        }
        AbstractC3557B.C2("_memberScope");
        throw null;
    }

    public final void x0(m mVar) {
        fg.E e10 = this.f50039p0;
        if (e10 != null) {
            this.f50039p0 = null;
            C3032C c3032c = e10.f30289k0;
            AbstractC3557B.b0("getPackage(...)", c3032c);
            this.f50040q0 = new zg.q(this, c3032c, this.f50037n0, this.f50035l0, this.f50036m0, mVar, "scope of " + this, new Uf.A(10, this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }
}
