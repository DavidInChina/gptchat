package j$.util.stream;

/* renamed from: j$.util.stream.x2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3852x2 extends AbstractC3783j2 {

    /* renamed from: b  reason: collision with root package name */
    long f35767b;

    /* renamed from: c  reason: collision with root package name */
    long f35768c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C3857y2 f35769d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3852x2(C3857y2 c3857y2, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35769d = c3857y2;
        this.f35767b = c3857y2.f35782s;
        long j6 = c3857y2.f35783t;
        this.f35768c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // j$.util.stream.AbstractC3803n2, j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        long j6 = this.f35767b;
        if (j6 != 0) {
            this.f35767b = j6 - 1;
            return;
        }
        long j10 = this.f35768c;
        if (j10 <= 0) {
            return;
        }
        this.f35768c = j10 - 1;
        this.f35672a.accept(d10);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35672a.l(AbstractC3855y0.W(j6, this.f35769d.f35782s, this.f35768c));
    }

    @Override // j$.util.stream.AbstractC3783j2, j$.util.stream.AbstractC3818q2
    public final boolean n() {
        return this.f35768c == 0 || this.f35672a.n();
    }
}
