package H0;

/* renamed from: H0.z0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0717z0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7150Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Pg.o f7151Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0717z0(Pg.k kVar, int i10) {
        super(1);
        this.f7150Y = i10;
        this.f7151Z = kVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        Pg.o oVar = this.f7151Z;
        int i10 = this.f7150Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        if (A0.f6712b.compareAndSet(false, true)) {
                            oVar.t(yVar);
                            break;
                        }
                        break;
                    default:
                        oVar.t(yVar);
                        break;
                }
                return yVar;
            default:
                switch (i10) {
                    case 0:
                        if (A0.f6712b.compareAndSet(false, true)) {
                            oVar.t(yVar);
                            break;
                        }
                        break;
                    default:
                        oVar.t(yVar);
                        break;
                }
                return yVar;
        }
    }
}
