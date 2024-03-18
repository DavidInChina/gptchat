package G9;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6130Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f6131Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(r rVar, int i10) {
        super(0);
        this.f6130Y = i10;
        this.f6131Z = rVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f6130Y;
        r rVar = this.f6131Z;
        switch (i10) {
            case 0:
                rVar.j(new f(false));
                return;
            case 1:
                rVar.j(e.f6125a);
                return;
            default:
                rVar.j(new f(true));
                return;
        }
    }
}
