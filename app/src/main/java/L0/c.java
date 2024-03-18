package L0;

import G0.v0;
import l0.AbstractC4325q;

/* loaded from: classes2.dex */
public final class c extends AbstractC4325q implements v0 {

    /* renamed from: s0  reason: collision with root package name */
    public boolean f10372s0;

    /* renamed from: t0  reason: collision with root package name */
    public final boolean f10373t0;

    /* renamed from: u0  reason: collision with root package name */
    public wf.k f10374u0;

    public c(boolean z10, boolean z11, wf.k kVar) {
        this.f10372s0 = z10;
        this.f10373t0 = z11;
        this.f10374u0 = kVar;
    }

    @Override // G0.v0
    public final boolean B() {
        return this.f10373t0;
    }

    @Override // G0.v0
    public final void W(j jVar) {
        this.f10374u0.invoke(jVar);
    }

    @Override // G0.v0
    public final boolean l0() {
        return this.f10372s0;
    }
}
