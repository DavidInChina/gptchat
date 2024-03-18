package Pf;

import Gf.C0631e;
import Mf.AbstractC1003l;
import Mf.AbstractC1015y;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jf.C3963m;
import kg.C4291c;
import kg.C4294f;

/* loaded from: classes.dex */
public final class G extends AbstractC1158p implements Mf.B {

    /* renamed from: h0  reason: collision with root package name */
    public final Ag.u f13993h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Jf.l f13994i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f13995j0;

    /* renamed from: k0  reason: collision with root package name */
    public final L f13996k0;

    /* renamed from: l0  reason: collision with root package name */
    public E f13997l0;

    /* renamed from: m0  reason: collision with root package name */
    public Mf.H f13998m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f13999n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Ag.n f14000o0;

    /* renamed from: p0  reason: collision with root package name */
    public final C3963m f14001p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C4294f c4294f, Ag.u uVar, Jf.l lVar, int i10) {
        super(Nf.h.f12822a, c4294f);
        kf.w wVar = kf.w.f37484Y;
        this.f13993h0 = uVar;
        this.f13994i0 = lVar;
        if (c4294f.f37508Z) {
            this.f13995j0 = wVar;
            L.f14015a.getClass();
            L l10 = (L) s0(J.f14013b);
            this.f13996k0 = l10 == null ? K.f14014b : l10;
            this.f13999n0 = true;
            this.f14000o0 = ((Ag.q) uVar).b(new C1147e(this, 2));
            this.f14001p0 = R4.b.D1(new F(this, 0));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + c4294f);
    }

    @Override // Mf.B
    public final List f0() {
        E e10 = this.f13997l0;
        if (e10 != null) {
            return e10.f13990c;
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String str = getName().f37507Y;
        AbstractC3557B.b0("toString(...)", str);
        sb2.append(str);
        sb2.append(" were not set");
        throw new AssertionError(sb2.toString());
    }

    @Override // Mf.B
    public final Jf.l j() {
        return this.f13994i0;
    }

    @Override // Mf.AbstractC1003l
    /* renamed from: k */
    public final AbstractC1003l mo20k() {
        return null;
    }

    @Override // Mf.B
    public final Collection l(C4291c c4291c, wf.k kVar) {
        AbstractC3557B.c0("fqName", c4291c);
        AbstractC3557B.c0("nameFilter", kVar);
        p0();
        p0();
        return ((C1157o) this.f14001p0.getValue()).l(c4291c, kVar);
    }

    public final void p0() {
        if (this.f13999n0) {
            return;
        }
        Q1.u uVar = AbstractC1015y.f12126a;
        AbstractC2469q0.p(s0(AbstractC1015y.f12126a));
        throw new N7.a("Accessing invalid module descriptor " + this, 4);
    }

    @Override // Mf.B
    public final Mf.M r(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        p0();
        return (Mf.M) this.f14000o0.invoke(c4291c);
    }

    @Override // Mf.B
    public final Object s0(Q1.u uVar) {
        AbstractC3557B.c0("capability", uVar);
        Object obj = this.f13995j0.get(uVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // Pf.AbstractC1158p
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractC1158p.k0(this));
        if (!this.f13999n0) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        Mf.H h10 = this.f13998m0;
        if (h10 != null) {
            str = h10.getClass().getSimpleName();
        } else {
            str = null;
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        switch (c0631e.f6407a) {
            case 0:
                return null;
            default:
                mg.m mVar = (mg.m) c0631e.f6408b;
                mg.m mVar2 = mg.m.f39296c;
                mVar.P(this, (StringBuilder) obj, true);
                return jf.y.f36177a;
        }
    }

    @Override // Mf.B
    public final boolean w(Mf.B b10) {
        AbstractC3557B.c0("targetModule", b10);
        if (AbstractC3557B.K(this, b10)) {
            return true;
        }
        E e10 = this.f13997l0;
        AbstractC3557B.Z(e10);
        if (kf.t.X1(e10.f13989b, b10) || f0().contains(b10) || b10.f0().contains(this)) {
            return true;
        }
        return false;
    }
}
