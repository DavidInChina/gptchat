package j$.util.stream;

/* renamed from: j$.util.stream.x1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3851x1 extends AbstractC3856y1 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f35765c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f35766d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3851x1(G0 g02, Object obj) {
        this(g02, obj, 0);
        this.f35765c = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3851x1(H0 h02, Object obj, int i10) {
        super(h02);
        this.f35765c = i10;
        this.f35766d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3851x1(H0 h02, Object[] objArr) {
        this(h02, objArr, 1);
        this.f35765c = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3851x1(C3851x1 c3851x1, G0 g02, int i10) {
        super(c3851x1, g02, i10);
        this.f35765c = 0;
        this.f35766d = c3851x1.f35766d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3851x1(C3851x1 c3851x1, H0 h02, int i10) {
        super(c3851x1, h02, i10);
        this.f35765c = 1;
        this.f35766d = (Object[]) c3851x1.f35766d;
    }

    @Override // j$.util.stream.AbstractC3856y1
    final void a() {
        switch (this.f35765c) {
            case 0:
                ((G0) this.f35780a).d(this.f35766d, this.f35781b);
                return;
            default:
                this.f35780a.i((Object[]) this.f35766d, this.f35781b);
                return;
        }
    }
}
