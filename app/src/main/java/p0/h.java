package p0;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final h f41687Z = new h(2);

    /* renamed from: h0  reason: collision with root package name */
    public static final h f41688h0 = new h(3);

    /* renamed from: i0  reason: collision with root package name */
    public static final h f41689i0 = new h(4);

    /* renamed from: j0  reason: collision with root package name */
    public static final h f41690j0 = new h(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f41691Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f41691Y = i10;
    }

    public final l a() {
        switch (this.f41691Y) {
            case 0:
                return l.f41703b;
            case 1:
                return l.f41703b;
            case 2:
                return l.f41703b;
            default:
                return l.f41703b;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f41691Y;
        switch (i10) {
            case 0:
                int i11 = ((c) obj).f41675a;
                return a();
            case 1:
                int i12 = ((c) obj).f41675a;
                return a();
            case 2:
                int i13 = ((c) obj).f41675a;
                return a();
            case 3:
                int i14 = ((c) obj).f41675a;
                return a();
            case 4:
                q qVar = (q) obj;
                switch (i10) {
                    case 4:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.D(qVar));
                    default:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.D(qVar));
                }
            default:
                q qVar2 = (q) obj;
                switch (i10) {
                    case 4:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.D(qVar2));
                    default:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.D(qVar2));
                }
        }
    }
}
