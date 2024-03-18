package L;

/* loaded from: classes2.dex */
public final class I extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ P0 f9957Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ T0.A f9958Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f9959h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f9960i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ T0.z f9961j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ T0.o f9962k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ T0.s f9963l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ N.t0 f9964m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f9965n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ I.f f9966o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(P0 p02, T0.A a5, boolean z10, boolean z11, T0.z zVar, T0.o oVar, T0.s sVar, N.t0 t0Var, Ng.F f6, I.f fVar) {
        super(1);
        this.f9957Y = p02;
        this.f9958Z = a5;
        this.f9959h0 = z10;
        this.f9960i0 = z11;
        this.f9961j0 = zVar;
        this.f9962k0 = oVar;
        this.f9963l0 = sVar;
        this.f9964m0 = t0Var;
        this.f9965n0 = f6;
        this.f9966o0 = fVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Q0 d10;
        P0 p02 = this.f9957Y;
        p0.p pVar = (p0.p) ((p0.o) obj);
        if (p02.b() != pVar.a()) {
            p02.f10034f.setValue(Boolean.valueOf(pVar.a()));
            T0.A a5 = this.f9958Z;
            if (a5 != null) {
                if (p02.b() && this.f9959h0 && !this.f9960i0) {
                    kotlin.jvm.internal.m.n(a5, p02, this.f9961j0, this.f9962k0, this.f9963l0);
                } else {
                    kotlin.jvm.internal.m.j(p02);
                }
                if (pVar.a() && (d10 = p02.d()) != null) {
                    Ad.l.O0(this.f9965n0, null, null, new H(this.f9966o0, this.f9961j0, this.f9957Y, d10, this.f9963l0, null), 3);
                }
            }
            if (!pVar.a()) {
                this.f9964m0.f(null);
            }
        }
        return jf.y.f36177a;
    }
}
