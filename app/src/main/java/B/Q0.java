package B;

import l0.AbstractC4325q;

/* loaded from: classes2.dex */
public final class Q0 extends AbstractC4325q implements F0.f {

    /* renamed from: s0  reason: collision with root package name */
    public boolean f1154s0;

    /* renamed from: t0  reason: collision with root package name */
    public final F0.j f1155t0;

    public Q0(boolean z10) {
        this.f1154s0 = z10;
        F0.i iVar = androidx.compose.foundation.gestures.a.f24694c;
        Boolean bool = Boolean.TRUE;
        F0.j jVar = new F0.j(iVar);
        jVar.f5030i.setValue(bool);
        this.f1155t0 = jVar;
    }

    @Override // F0.f
    public final Bi.c M() {
        if (this.f1154s0) {
            return this.f1155t0;
        }
        return F0.b.f5021h;
    }

    @Override // F0.f, F0.h
    public final /* synthetic */ Object a(F0.i iVar) {
        return E9.f.a(this, iVar);
    }
}
