package Cd;

import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2986Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ J f2987Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(J j6, int i10) {
        super(0);
        this.f2986Y = i10;
        this.f2987Z = j6;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f2986Y;
        J j6 = this.f2987Z;
        switch (i10) {
            case 0:
                j6.j(new C0331p(Ed.n.f4691h0));
                return;
            case 1:
                j6.j(new C0335u(true));
                return;
            case 2:
                j6.j(new C0335u(false));
                return;
            case 3:
                j6.j(new C0334t(false));
                return;
            case 4:
                j6.j(new C0331p(Ed.n.f4690Z));
                return;
            case 5:
                j6.j(new C0335u(false));
                return;
            default:
                j6.j(new C0334t(false));
                return;
        }
    }
}
