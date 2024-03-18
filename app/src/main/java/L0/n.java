package L0;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final n f10414Z = new n(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final n f10415h0 = new n(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final n f10416i0 = new n(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10417Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10) {
        super(1);
        this.f10417Y = i10;
    }

    public final Boolean a(androidx.compose.ui.node.a aVar) {
        boolean z10 = true;
        switch (this.f10417Y) {
            case 0:
                j p10 = aVar.p();
                if (p10 == null || !p10.f10410Z) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                j p11 = aVar.p();
                if (p11 == null || !p11.f10410Z) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return Boolean.valueOf(aVar.f24831B0.d(8));
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f10417Y) {
            case 0:
                return a((androidx.compose.ui.node.a) obj);
            case 1:
                return a((androidx.compose.ui.node.a) obj);
            default:
                return a((androidx.compose.ui.node.a) obj);
        }
    }
}
