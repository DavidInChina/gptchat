package Rb;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class P extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15287Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f15288Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1272s f15289h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P(wf.k kVar, C1272s c1272s, int i10) {
        super(0);
        this.f15287Y = i10;
        this.f15288Z = kVar;
        this.f15289h0 = c1272s;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        C1272s c1272s = this.f15289h0;
        int i10 = this.f15287Y;
        wf.k kVar = this.f15288Z;
        switch (i10) {
            case 0:
                kVar.invoke(new C1274u(C1272s.a(c1272s, 6)));
                return;
            default:
                kVar.invoke(new C1274u(C1272s.a(c1272s, 1)));
                return;
        }
    }
}
