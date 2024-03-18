package j$.util.stream;

/* renamed from: j$.util.stream.r2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3822r2 extends AbstractC3798m2 {

    /* renamed from: b  reason: collision with root package name */
    long f35717b;

    /* renamed from: c  reason: collision with root package name */
    long f35718c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C3827s2 f35719d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3822r2(C3827s2 c3827s2, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35719d = c3827s2;
        this.f35717b = c3827s2.f35723s;
        long j6 = c3827s2.f35724t;
        this.f35718c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j6 = this.f35717b;
        if (j6 != 0) {
            this.f35717b = j6 - 1;
            return;
        }
        long j10 = this.f35718c;
        if (j10 <= 0) {
            return;
        }
        this.f35718c = j10 - 1;
        this.f35690a.accept((AbstractC3818q2) obj);
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35690a.l(AbstractC3855y0.W(j6, this.f35719d.f35723s, this.f35718c));
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final boolean n() {
        return this.f35718c == 0 || this.f35690a.n();
    }
}
