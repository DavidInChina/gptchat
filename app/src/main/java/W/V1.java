package W;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class V1 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19741Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1550f3 f19742Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f19743h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f19744i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V1(C1550f3 c1550f3, Ng.F f6, AbstractC6216a abstractC6216a, int i10) {
        super(0);
        this.f19741Y = i10;
        this.f19742Z = c1550f3;
        this.f19743h0 = f6;
        this.f19744i0 = abstractC6216a;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        Ng.F f6 = this.f19743h0;
        int i10 = this.f19741Y;
        AbstractC6216a abstractC6216a = this.f19744i0;
        C1550f3 c1550f3 = this.f19742Z;
        switch (i10) {
            case 0:
                if (((EnumC1555g3) c1550f3.f20062c.f18997f.getValue()) == EnumC1555g3.f20079Z) {
                    F1 d10 = c1550f3.f20062c.d();
                    if (d10.f19126a.containsKey(EnumC1555g3.f20080h0)) {
                        Ad.l.O0(f6, null, null, new S1(c1550f3, null), 3);
                        return;
                    }
                }
                Ad.l.O0(f6, null, null, new T1(c1550f3, null), 3).V(new U1(abstractC6216a, 0));
                return;
            default:
                if (!((Boolean) c1550f3.f20062c.f18994c.invoke(EnumC1555g3.f20078Y)).booleanValue()) {
                    return;
                }
                Ad.l.O0(f6, null, null, new C1544e2(c1550f3, null), 3).V(new C1549f2(c1550f3, abstractC6216a, 0));
                return;
        }
    }
}
