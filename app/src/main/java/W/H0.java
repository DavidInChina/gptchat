package W;

/* loaded from: classes.dex */
public final class H0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19175Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f19176Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f19177h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19178i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ int f19179j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19180k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f19181l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(E0.d0 d0Var, int i10, int i11, E0.d0 d0Var2, int i12, E0.d0 d0Var3, int i13) {
        super(1);
        this.f19175Y = d0Var;
        this.f19176Z = i10;
        this.f19177h0 = i11;
        this.f19178i0 = d0Var2;
        this.f19179j0 = i12;
        this.f19180k0 = d0Var3;
        this.f19181l0 = i13;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        E0.c0 c0Var = (E0.c0) obj;
        int i10 = this.f19177h0;
        E0.d0 d0Var = this.f19175Y;
        if (d0Var != null) {
            E0.c0.g(c0Var, d0Var, 0, R.a.m(1, 0.0f, (i10 - this.f19176Z) / 2.0f));
        }
        E0.d0 d0Var2 = this.f19178i0;
        int i11 = this.f19179j0;
        E0.c0.g(c0Var, d0Var2, i11, 0);
        E0.d0 d0Var3 = this.f19180k0;
        if (d0Var3 != null) {
            E0.c0.g(c0Var, d0Var3, i11 + d0Var2.f4053Y, R.a.m(1, 0.0f, (i10 - this.f19181l0) / 2.0f));
        }
        return jf.y.f36177a;
    }
}
