package bb;

import Z8.AbstractC1809m0;
import cb.C2350T;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25758Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f25759Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2350T f25760h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i10, C2350T c2350t, wf.k kVar) {
        super(0);
        this.f25758Y = i10;
        this.f25759Z = kVar;
        this.f25760h0 = c2350t;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f25758Y;
        wf.k kVar = this.f25759Z;
        C2350T c2350t = this.f25760h0;
        switch (i10) {
            case 0:
                AbstractC1809m0.a().b(Z8.N.f23262c, kf.w.f37484Y);
                kVar.invoke(new O(c2350t));
                return;
            default:
                kVar.invoke(new N(c2350t));
                return;
        }
    }
}
