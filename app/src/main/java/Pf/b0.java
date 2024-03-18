package Pf;

import Bg.j0;
import Gf.C0631e;
import Mf.AbstractC0993b;
import Mf.AbstractC0994c;
import Mf.AbstractC1003l;
import Mf.AbstractC1004m;
import Mf.AbstractC1007p;
import Mf.C1008q;
import Mf.h0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import kg.C4294f;
import pg.AbstractC5170g;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public class b0 extends c0 implements h0 {

    /* renamed from: k0  reason: collision with root package name */
    public final int f14081k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f14082l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f14083m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f14084n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Bg.A f14085o0;

    /* renamed from: p0  reason: collision with root package name */
    public final h0 f14086p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(AbstractC0993b abstractC0993b, h0 h0Var, int i10, Nf.i iVar, C4294f c4294f, Bg.A a5, boolean z10, boolean z11, boolean z12, Bg.A a10, Mf.V v10) {
        super(abstractC0993b, iVar, c4294f, a5, v10);
        h0 h0Var2;
        AbstractC3557B.c0("containingDeclaration", abstractC0993b);
        AbstractC3557B.c0("annotations", iVar);
        AbstractC3557B.c0("name", c4294f);
        AbstractC3557B.c0("outType", a5);
        AbstractC3557B.c0("source", v10);
        this.f14081k0 = i10;
        this.f14082l0 = z10;
        this.f14083m0 = z11;
        this.f14084n0 = z12;
        this.f14085o0 = a10;
        if (h0Var == null) {
            h0Var2 = this;
        } else {
            h0Var2 = h0Var;
        }
        this.f14086p0 = h0Var2;
    }

    @Override // Mf.i0
    public final /* bridge */ /* synthetic */ AbstractC5170g Q() {
        return null;
    }

    @Override // Mf.i0
    public final boolean Y() {
        return false;
    }

    @Override // Mf.X
    public final AbstractC1004m c(j0 j0Var) {
        AbstractC3557B.c0("substitutor", j0Var);
        if (j0Var.f2128a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        C1008q c1008q = Mf.r.f12106f;
        AbstractC3557B.b0("LOCAL", c1008q);
        return c1008q;
    }

    @Override // Mf.AbstractC0993b
    public final Collection m() {
        Collection m10 = mo20k().m();
        AbstractC3557B.b0("getOverriddenDescriptors(...)", m10);
        Collection<AbstractC0993b> collection = m10;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(collection, 10));
        for (AbstractC0993b abstractC0993b : collection) {
            arrayList.add((h0) abstractC0993b.S().get(this.f14081k0));
        }
        return arrayList;
    }

    public h0 s(Kf.f fVar, C4294f c4294f, int i10) {
        Nf.i annotations = getAnnotations();
        AbstractC3557B.b0("<get-annotations>(...)", annotations);
        Bg.A type = getType();
        AbstractC3557B.b0("getType(...)", type);
        boolean w02 = w0();
        Mf.U u10 = Mf.V.f12075a;
        return new b0(fVar, null, i10, annotations, c4294f, type, w02, this.f14083m0, this.f14084n0, this.f14085o0, u10);
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        switch (c0631e.f6407a) {
            case 0:
                return null;
            default:
                mg.m mVar = (mg.m) c0631e.f6408b;
                mg.m mVar2 = mg.m.f39296c;
                mVar.f0(this, true, (StringBuilder) obj, true);
                return jf.y.f36177a;
        }
    }

    public final boolean w0() {
        if (this.f14082l0 && ((AbstractC0994c) mo20k()).e() != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: x0 */
    public final AbstractC0993b mo20k() {
        AbstractC1003l mo20k = super.mo20k();
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor", mo20k);
        return (AbstractC0993b) mo20k;
    }

    /* renamed from: y0 */
    public final h0 p0() {
        h0 h0Var = this.f14086p0;
        if (h0Var == this) {
            return this;
        }
        return ((b0) h0Var).p0();
    }
}
