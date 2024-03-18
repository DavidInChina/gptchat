package Pf;

import Gf.C0631e;
import Mf.AbstractC1003l;
import id.AbstractC3557B;
import kg.C4291c;
import ug.C5928j;

/* loaded from: classes.dex */
public final class A extends AbstractC1158p implements Mf.M {

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f13974m0;

    /* renamed from: h0  reason: collision with root package name */
    public final G f13975h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C4291c f13976i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Ag.l f13977j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Ag.l f13978k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C5928j f13979l0;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f13974m0 = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(A.class), "fragments", "getFragments()Ljava/util/List;")), d10.g(new kotlin.jvm.internal.u(d10.b(A.class), "empty", "getEmpty()Z"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(G g10, C4291c c4291c, Ag.u uVar) {
        super(Nf.h.f12822a, c4291c.g());
        AbstractC3557B.c0("fqName", c4291c);
        this.f13975h0 = g10;
        this.f13976i0 = c4291c;
        Ag.q qVar = (Ag.q) uVar;
        this.f13977j0 = new Ag.l(qVar, new C1167z(this, 1));
        this.f13978k0 = new Ag.l(qVar, new C1167z(this, 0));
        this.f13979l0 = new C5928j(uVar, new C1167z(this, 2));
    }

    public final boolean equals(Object obj) {
        Mf.M m10;
        if (obj instanceof Mf.M) {
            m10 = (Mf.M) obj;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            return false;
        }
        A a5 = (A) m10;
        if (!AbstractC3557B.K(this.f13976i0, a5.f13976i0) || !AbstractC3557B.K(this.f13975h0, a5.f13975h0)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13976i0.hashCode() + (this.f13975h0.hashCode() * 31);
    }

    @Override // Mf.AbstractC1003l
    /* renamed from: k */
    public final AbstractC1003l mo20k() {
        C4291c c4291c = this.f13976i0;
        if (c4291c.d()) {
            return null;
        }
        C4291c e10 = c4291c.e();
        AbstractC3557B.b0("parent(...)", e10);
        return this.f13975h0.r(e10);
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        switch (c0631e.f6407a) {
            case 0:
                return null;
            default:
                StringBuilder sb2 = (StringBuilder) obj;
                mg.m mVar = (mg.m) c0631e.f6408b;
                mg.m mVar2 = mg.m.f39296c;
                mVar.getClass();
                mVar.T(this.f13976i0, "package", sb2);
                if (mVar.f39299a.k()) {
                    sb2.append(" in context of ");
                    mVar.P(this.f13975h0, sb2, false);
                }
                return jf.y.f36177a;
        }
    }
}
