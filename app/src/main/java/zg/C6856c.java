package zg;

import Mf.AbstractC0997f;
import Mf.AbstractC1002k;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.U;
import Mf.V;
import Pf.AbstractC1165x;
import Pf.C1154l;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import fg.C3044l;
import hg.AbstractC3428g;
import hg.C3430i;
import hg.C3432k;
import id.AbstractC3557B;
import kg.C4294f;
import lg.AbstractC4456a;

/* renamed from: zg.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6856c extends C1154l implements AbstractC6855b {

    /* renamed from: K0  reason: collision with root package name */
    public final C3044l f52020K0;

    /* renamed from: L0  reason: collision with root package name */
    public final AbstractC3428g f52021L0;

    /* renamed from: M0  reason: collision with root package name */
    public final C3430i f52022M0;

    /* renamed from: N0  reason: collision with root package name */
    public final C3432k f52023N0;

    /* renamed from: O0  reason: collision with root package name */
    public final AbstractC6864k f52024O0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6856c(AbstractC0997f abstractC0997f, AbstractC1002k abstractC1002k, Nf.i iVar, boolean z10, int i10, C3044l c3044l, AbstractC3428g abstractC3428g, C3430i c3430i, C3432k c3432k, AbstractC6864k abstractC6864k, V v10) {
        super(abstractC0997f, abstractC1002k, iVar, z10, i10, r6);
        U u10;
        AbstractC3557B.c0("containingDeclaration", abstractC0997f);
        AbstractC3557B.c0("annotations", iVar);
        AbstractC2469q0.q("kind", i10);
        AbstractC3557B.c0("proto", c3044l);
        AbstractC3557B.c0("nameResolver", abstractC3428g);
        AbstractC3557B.c0("typeTable", c3430i);
        AbstractC3557B.c0("versionRequirementTable", c3432k);
        if (v10 == null) {
            u10 = V.f12075a;
        } else {
            u10 = v10;
        }
        this.f52020K0 = c3044l;
        this.f52021L0 = abstractC3428g;
        this.f52022M0 = c3430i;
        this.f52023N0 = c3432k;
        this.f52024O0 = abstractC6864k;
    }

    @Override // Pf.C1154l
    public final /* bridge */ /* synthetic */ C1154l H0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, V v10, Nf.i iVar, C4294f c4294f) {
        return N0(i10, abstractC1003l, abstractC1013w, v10, iVar);
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC1013w
    public final boolean L() {
        return false;
    }

    public final C6856c N0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, V v10, Nf.i iVar) {
        AbstractC3557B.c0("newOwner", abstractC1003l);
        AbstractC2469q0.q("kind", i10);
        AbstractC3557B.c0("annotations", iVar);
        C6856c c6856c = new C6856c((AbstractC0997f) abstractC1003l, (AbstractC1002k) abstractC1013w, iVar, this.f14108J0, i10, this.f52020K0, this.f52021L0, this.f52022M0, this.f52023N0, this.f52024O0, v10);
        c6856c.f14161B0 = this.f14161B0;
        return c6856c;
    }

    @Override // zg.AbstractC6865l
    public final C3430i O() {
        return this.f52022M0;
    }

    @Override // zg.AbstractC6865l
    public final AbstractC3428g T() {
        return this.f52021L0;
    }

    @Override // zg.AbstractC6865l
    public final AbstractC6864k U() {
        return this.f52024O0;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC1016z
    public final boolean isExternal() {
        return false;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC1013w
    public final boolean isInline() {
        return false;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC1013w
    public final boolean isSuspend() {
        return false;
    }

    @Override // Pf.C1154l, Pf.AbstractC1165x
    public final /* bridge */ /* synthetic */ AbstractC1165x y0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, V v10, Nf.i iVar, C4294f c4294f) {
        return N0(i10, abstractC1003l, abstractC1013w, v10, iVar);
    }

    @Override // zg.AbstractC6865l
    public final AbstractC4456a z() {
        return this.f52020K0;
    }
}
