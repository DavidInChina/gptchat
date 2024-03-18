package L2;

/* renamed from: L2.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0884e implements B {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0886g f10587a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10588b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10589c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final long f10590d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10591e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10592f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10593g;

    public C0884e(AbstractC0886g abstractC0886g, long j6, long j10, long j11, long j12, long j13) {
        this.f10587a = abstractC0886g;
        this.f10588b = j6;
        this.f10590d = j10;
        this.f10591e = j11;
        this.f10592f = j12;
        this.f10593g = j13;
    }

    @Override // L2.B
    public final boolean e() {
        return true;
    }

    @Override // L2.B
    public final A i(long j6) {
        C c10 = new C(j6, C0885f.a(this.f10587a.e(j6), this.f10589c, this.f10590d, this.f10591e, this.f10592f, this.f10593g));
        return new A(c10, c10);
    }

    @Override // L2.B
    public final long j() {
        return this.f10588b;
    }
}
