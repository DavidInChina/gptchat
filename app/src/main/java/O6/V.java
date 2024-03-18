package o6;

/* loaded from: classes2.dex */
public final class V implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f40728a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a0 f40729b;

    public /* synthetic */ V(a0 a0Var, int i10) {
        this.f40728a = i10;
        this.f40729b = a0Var;
    }

    @Override // w6.l
    public final void a(w6.k kVar) {
        int i10 = this.f40728a;
        a0 a0Var = this.f40729b;
        switch (i10) {
            case 0:
                a0Var.f40777K = kVar;
                return;
            default:
                a0Var.f40776J = kVar;
                return;
        }
    }
}
