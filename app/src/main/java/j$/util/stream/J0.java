package j$.util.stream;

/* loaded from: classes3.dex */
abstract class J0 implements H0 {

    /* renamed from: a  reason: collision with root package name */
    protected final H0 f35441a;

    /* renamed from: b  reason: collision with root package name */
    protected final H0 f35442b;

    /* renamed from: c  reason: collision with root package name */
    private final long f35443c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J0(H0 h02, H0 h03) {
        this.f35441a = h02;
        this.f35442b = h03;
        this.f35443c = h02.count() + h03.count();
    }

    @Override // j$.util.stream.H0
    public final H0 a(int i10) {
        if (i10 == 0) {
            return this.f35441a;
        }
        if (i10 != 1) {
            throw new IndexOutOfBoundsException();
        }
        return this.f35442b;
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f35443c;
    }

    @Override // j$.util.stream.H0
    public final int q() {
        return 2;
    }
}
