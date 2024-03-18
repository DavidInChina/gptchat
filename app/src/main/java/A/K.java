package A;

import l0.AbstractC4325q;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class K extends AbstractC4325q implements G0.v0 {

    /* renamed from: s0  reason: collision with root package name */
    public boolean f82s0;

    /* renamed from: t0  reason: collision with root package name */
    public String f83t0;

    /* renamed from: u0  reason: collision with root package name */
    public L0.g f84u0;

    /* renamed from: v0  reason: collision with root package name */
    public AbstractC6216a f85v0;

    /* renamed from: w0  reason: collision with root package name */
    public String f86w0;

    /* renamed from: x0  reason: collision with root package name */
    public AbstractC6216a f87x0;

    public K(boolean z10, String str, L0.g gVar, AbstractC6216a abstractC6216a, String str2, AbstractC6216a abstractC6216a2) {
        this.f82s0 = z10;
        this.f83t0 = str;
        this.f84u0 = gVar;
        this.f85v0 = abstractC6216a;
        this.f86w0 = str2;
        this.f87x0 = abstractC6216a2;
    }

    @Override // G0.v0
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // G0.v0
    public final void W(L0.j jVar) {
        L0.g gVar = this.f84u0;
        if (gVar != null) {
            L0.t.e(jVar, gVar.f10380a);
        }
        String str = this.f83t0;
        J j6 = new J(this, 0);
        Df.v[] vVarArr = L0.t.f10472a;
        jVar.y(L0.i.f10385b, new L0.a(str, j6));
        if (this.f87x0 != null) {
            jVar.y(L0.i.f10386c, new L0.a(this.f86w0, new J(this, 1)));
        }
        if (!this.f82s0) {
            jVar.y(L0.r.f10454j, jf.y.f36177a);
        }
    }

    @Override // G0.v0
    public final boolean l0() {
        return true;
    }
}
