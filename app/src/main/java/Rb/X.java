package Rb;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final /* synthetic */ class X extends kotlin.jvm.internal.k implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15308Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(int i10, O o10) {
        super(1, o10, O.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
        this.f15308Y = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            } else {
                super(1, o10, O.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
                return;
            }
        }
        super(1, o10, O.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0);
    }

    public final void f(AbstractC1279z abstractC1279z) {
        switch (this.f15308Y) {
            case 0:
                AbstractC3557B.c0("p0", abstractC1279z);
                ((O) this.receiver).j(abstractC1279z);
                return;
            case 1:
                AbstractC3557B.c0("p0", abstractC1279z);
                ((O) this.receiver).j(abstractC1279z);
                return;
            default:
                AbstractC3557B.c0("p0", abstractC1279z);
                ((O) this.receiver).j(abstractC1279z);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f15308Y) {
            case 0:
                f((AbstractC1279z) obj);
                return yVar;
            case 1:
                f((AbstractC1279z) obj);
                return yVar;
            default:
                f((AbstractC1279z) obj);
                return yVar;
        }
    }
}
