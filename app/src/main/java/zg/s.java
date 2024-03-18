package zg;

import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.U;
import Mf.V;
import Pf.AbstractC1165x;
import Pf.T;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import fg.C3056y;
import hg.AbstractC3428g;
import hg.C3430i;
import hg.C3432k;
import id.AbstractC3557B;
import kg.C4294f;
import lg.AbstractC4456a;

/* loaded from: classes.dex */
public final class s extends T implements AbstractC6855b {

    /* renamed from: J0  reason: collision with root package name */
    public final C3056y f52087J0;

    /* renamed from: K0  reason: collision with root package name */
    public final AbstractC3428g f52088K0;

    /* renamed from: L0  reason: collision with root package name */
    public final C3430i f52089L0;

    /* renamed from: M0  reason: collision with root package name */
    public final C3432k f52090M0;

    /* renamed from: N0  reason: collision with root package name */
    public final AbstractC6864k f52091N0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(AbstractC1003l abstractC1003l, T t10, Nf.i iVar, C4294f c4294f, int i10, C3056y c3056y, AbstractC3428g abstractC3428g, C3430i c3430i, C3432k c3432k, AbstractC6864k abstractC6864k, V v10) {
        super(abstractC1003l, t10, iVar, c4294f, i10, r6);
        U u10;
        AbstractC3557B.c0("containingDeclaration", abstractC1003l);
        AbstractC3557B.c0("annotations", iVar);
        AbstractC2469q0.q("kind", i10);
        AbstractC3557B.c0("proto", c3056y);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        AbstractC3557B.c0("versionRequirementTable", c3432k);
        if (v10 == null) {
            u10 = V.f12075a;
        } else {
            u10 = v10;
        }
        this.f52087J0 = c3056y;
        this.f52088K0 = abstractC3428g;
        this.f52089L0 = c3430i;
        this.f52090M0 = c3432k;
        this.f52091N0 = abstractC6864k;
    }

    @Override // zg.AbstractC6865l
    public final C3430i O() {
        return this.f52089L0;
    }

    @Override // zg.AbstractC6865l
    public final AbstractC3428g T() {
        return this.f52088K0;
    }

    @Override // zg.AbstractC6865l
    public final AbstractC6864k U() {
        return this.f52091N0;
    }

    @Override // Pf.T, Pf.AbstractC1165x
    public final AbstractC1165x y0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, V v10, Nf.i iVar, C4294f c4294f) {
        C4294f c4294f2;
        AbstractC3557B.c0("newOwner", abstractC1003l);
        AbstractC2469q0.q("kind", i10);
        AbstractC3557B.c0("annotations", iVar);
        T t10 = (T) abstractC1013w;
        if (c4294f == null) {
            C4294f name = getName();
            AbstractC3557B.b0("getName(...)", name);
            c4294f2 = name;
        } else {
            c4294f2 = c4294f;
        }
        s sVar = new s(abstractC1003l, t10, iVar, c4294f2, i10, this.f52087J0, this.f52088K0, this.f52089L0, this.f52090M0, this.f52091N0, v10);
        sVar.f14161B0 = this.f14161B0;
        return sVar;
    }

    @Override // zg.AbstractC6865l
    public final AbstractC4456a z() {
        return this.f52087J0;
    }
}
