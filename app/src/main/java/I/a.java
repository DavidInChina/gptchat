package I;

import E0.AbstractC0461u;
import G0.AbstractC0585n;
import G0.B;
import G0.g0;
import l0.AbstractC4325q;

/* loaded from: classes2.dex */
public abstract class a extends AbstractC4325q implements F0.f, B, AbstractC0585n {

    /* renamed from: s0  reason: collision with root package name */
    public final n f7911s0 = new n(this);

    /* renamed from: t0  reason: collision with root package name */
    public AbstractC0461u f7912t0;

    public final AbstractC0461u A0() {
        AbstractC0461u abstractC0461u = this.f7912t0;
        if (abstractC0461u == null || !abstractC0461u.i()) {
            return null;
        }
        return abstractC0461u;
    }

    @Override // G0.B
    public final void I(g0 g0Var) {
        this.f7912t0 = g0Var;
    }

    @Override // F0.f
    public /* synthetic */ Bi.c M() {
        return F0.b.f5021h;
    }

    @Override // F0.f, F0.h
    public final /* synthetic */ Object a(F0.i iVar) {
        return E9.f.a(this, iVar);
    }

    @Override // G0.B
    public final /* synthetic */ void o(long j6) {
    }
}
