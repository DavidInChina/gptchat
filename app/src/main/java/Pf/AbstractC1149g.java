package Pf;

import Bg.m0;
import Gf.C0631e;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.AbstractC1004m;
import Mf.AbstractC1007p;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import kg.C4294f;

/* renamed from: Pf.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1149g extends AbstractC1159q implements Mf.a0 {

    /* renamed from: j0  reason: collision with root package name */
    public final Ag.u f14091j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC1007p f14092k0;

    /* renamed from: l0  reason: collision with root package name */
    public List f14093l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C1148f f14094m0 = new C1148f(this);

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        d10.g(new kotlin.jvm.internal.u(d10.b(AbstractC1149g.class), "constructors", "getConstructors()Ljava/util/Collection;"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC1149g(Ag.u uVar, AbstractC1003l abstractC1003l, Nf.i iVar, C4294f c4294f, AbstractC1007p abstractC1007p) {
        super(abstractC1003l, iVar, c4294f, r0);
        Mf.U u10 = Mf.V.f12075a;
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("containingDeclaration", abstractC1003l);
        AbstractC3557B.c0("visibilityImpl", abstractC1007p);
        this.f14091j0 = uVar;
        this.f14092k0 = abstractC1007p;
        ((Ag.q) uVar).a(new F(this, 1));
    }

    @Override // Mf.AbstractC1016z
    public final boolean H() {
        return false;
    }

    @Override // Mf.AbstractC1001j
    public final boolean I() {
        return m0.c(((zg.t) this).y0(), new C1147e(this, 1));
    }

    @Override // Pf.AbstractC1159q, Pf.AbstractC1158p, Mf.AbstractC1003l
    /* renamed from: a */
    public final AbstractC1000i mo24a() {
        return this;
    }

    @Override // Mf.AbstractC1000i
    public final Bg.Y f() {
        return this.f14094m0;
    }

    @Override // Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        return this.f14092k0;
    }

    @Override // Mf.AbstractC1016z
    public final boolean isExternal() {
        return false;
    }

    @Override // Mf.AbstractC1001j
    public final List o() {
        List list = this.f14093l0;
        if (list != null) {
            return list;
        }
        AbstractC3557B.C2("declaredTypeParametersImpl");
        throw null;
    }

    @Override // Mf.AbstractC1016z
    public final boolean o0() {
        return false;
    }

    @Override // Pf.AbstractC1158p
    public final String toString() {
        return "typealias " + getName().b();
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
                mVar.y(sb2, this, null);
                AbstractC1007p abstractC1007p = this.f14092k0;
                AbstractC3557B.b0("getVisibility(...)", abstractC1007p);
                mVar.h0(abstractC1007p, sb2);
                mVar.K(this, sb2);
                sb2.append(mVar.I("typealias"));
                sb2.append(Separators.SP);
                mVar.P(this, sb2, true);
                mVar.d0(o(), sb2, false);
                mVar.z(this, sb2);
                sb2.append(" = ");
                sb2.append(mVar.Y(((zg.t) this).y0()));
                return jf.y.f36177a;
        }
    }

    @Override // Pf.AbstractC1159q, Pf.AbstractC1158p, Mf.AbstractC1003l
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC1003l mo24a() {
        return this;
    }

    @Override // Pf.AbstractC1159q
    public final AbstractC1004m p0() {
        return this;
    }
}
