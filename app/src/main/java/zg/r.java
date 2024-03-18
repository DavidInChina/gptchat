package zg;

import Mf.A;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.P;
import Mf.V;
import Pf.O;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import fg.G;
import hg.AbstractC3427f;
import hg.AbstractC3428g;
import hg.C3430i;
import hg.C3432k;
import id.AbstractC3557B;
import kg.C4294f;
import lg.AbstractC4456a;

/* loaded from: classes.dex */
public final class r extends O implements AbstractC6855b {

    /* renamed from: G0  reason: collision with root package name */
    public final G f52082G0;

    /* renamed from: H0  reason: collision with root package name */
    public final AbstractC3428g f52083H0;

    /* renamed from: I0  reason: collision with root package name */
    public final C3430i f52084I0;

    /* renamed from: J0  reason: collision with root package name */
    public final C3432k f52085J0;

    /* renamed from: K0  reason: collision with root package name */
    public final AbstractC6864k f52086K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC1003l abstractC1003l, P p10, Nf.i iVar, A a5, AbstractC1007p abstractC1007p, boolean z10, C4294f c4294f, int i10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, G g10, AbstractC3428g abstractC3428g, C3430i c3430i, C3432k c3432k, AbstractC6864k abstractC6864k) {
        super(abstractC1003l, p10, iVar, a5, abstractC1007p, z10, c4294f, i10, V.f12075a, z11, z12, z15, false, z13, z14);
        AbstractC3557B.c0("containingDeclaration", abstractC1003l);
        AbstractC3557B.c0("annotations", iVar);
        AbstractC3557B.c0("modality", a5);
        AbstractC3557B.c0("visibility", abstractC1007p);
        AbstractC3557B.c0("name", c4294f);
        AbstractC2469q0.q("kind", i10);
        AbstractC3557B.c0("proto", g10);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        AbstractC3557B.c0("versionRequirementTable", c3432k);
        this.f52082G0 = g10;
        this.f52083H0 = abstractC3428g;
        this.f52084I0 = c3430i;
        this.f52085J0 = c3432k;
        this.f52086K0 = abstractC6864k;
    }

    @Override // zg.AbstractC6865l
    public final C3430i O() {
        return this.f52084I0;
    }

    @Override // zg.AbstractC6865l
    public final AbstractC3428g T() {
        return this.f52083H0;
    }

    @Override // zg.AbstractC6865l
    public final AbstractC6864k U() {
        return this.f52086K0;
    }

    @Override // Pf.O, Mf.AbstractC1016z
    public final boolean isExternal() {
        return AbstractC3427f.f32302E.c(this.f52082G0.f30312i0).booleanValue();
    }

    @Override // zg.AbstractC6865l
    public final AbstractC4456a z() {
        return this.f52082G0;
    }

    @Override // Pf.O
    public final O z0(AbstractC1003l abstractC1003l, A a5, AbstractC1007p abstractC1007p, P p10, int i10, C4294f c4294f) {
        AbstractC3557B.c0("newOwner", abstractC1003l);
        AbstractC3557B.c0("newModality", a5);
        AbstractC3557B.c0("newVisibility", abstractC1007p);
        AbstractC2469q0.q("kind", i10);
        AbstractC3557B.c0("newName", c4294f);
        return new r(abstractC1003l, p10, getAnnotations(), a5, abstractC1007p, this.f14041k0, c4294f, i10, this.f14049s0, this.f14050t0, isExternal(), this.f14054x0, this.f14051u0, this.f52082G0, this.f52083H0, this.f52084I0, this.f52085J0, this.f52086K0);
    }
}
