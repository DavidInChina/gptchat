package A;

import E0.AbstractC0461u;
import G0.AbstractC0591u;
import l0.AbstractC4325q;

/* renamed from: A.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017f0 extends AbstractC4325q implements F0.f, AbstractC0591u {

    /* renamed from: s0  reason: collision with root package name */
    public boolean f199s0;

    /* renamed from: t0  reason: collision with root package name */
    public AbstractC0461u f200t0;

    @Override // F0.f
    public final /* synthetic */ Bi.c M() {
        return F0.b.f5021h;
    }

    @Override // F0.f, F0.h
    public final /* synthetic */ Object a(F0.i iVar) {
        return E9.f.a(this, iVar);
    }

    @Override // G0.AbstractC0591u
    public final void b0(G0.g0 g0Var) {
        wf.k kVar;
        this.f200t0 = g0Var;
        if (!this.f199s0) {
            return;
        }
        wf.k kVar2 = null;
        if (g0Var.G0().f37732r0) {
            AbstractC0461u abstractC0461u = this.f200t0;
            if (abstractC0461u != null && abstractC0461u.i()) {
                if (this.f37732r0) {
                    kVar2 = (wf.k) E9.f.a(this, AbstractC0015e0.f192a);
                }
                if (kVar2 != null) {
                    kVar2.invoke(this.f200t0);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f37732r0) {
            kVar = (wf.k) E9.f.a(this, AbstractC0015e0.f192a);
        } else {
            kVar = null;
        }
        if (kVar != null) {
            kVar.invoke(null);
        }
    }
}
