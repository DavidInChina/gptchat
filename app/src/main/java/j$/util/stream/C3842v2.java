package j$.util.stream;

/* renamed from: j$.util.stream.v2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3842v2 extends AbstractC3793l2 {

    /* renamed from: b  reason: collision with root package name */
    long f35752b;

    /* renamed from: c  reason: collision with root package name */
    long f35753c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C3847w2 f35754d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3842v2(C3847w2 c3847w2, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35754d = c3847w2;
        this.f35752b = c3847w2.f35759s;
        long j6 = c3847w2.f35760t;
        this.f35753c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        long j10 = this.f35752b;
        if (j10 != 0) {
            this.f35752b = j10 - 1;
            return;
        }
        long j11 = this.f35753c;
        if (j11 <= 0) {
            return;
        }
        this.f35753c = j11 - 1;
        this.f35678a.accept(j6);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35678a.l(AbstractC3855y0.W(j6, this.f35754d.f35759s, this.f35753c));
    }

    @Override // j$.util.stream.AbstractC3793l2, j$.util.stream.AbstractC3818q2
    public final boolean n() {
        return this.f35753c == 0 || this.f35678a.n();
    }
}
