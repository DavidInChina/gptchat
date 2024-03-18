package j$.util.stream;

/* renamed from: j$.util.stream.t2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3832t2 extends AbstractC3788k2 {

    /* renamed from: b  reason: collision with root package name */
    long f35730b;

    /* renamed from: c  reason: collision with root package name */
    long f35731c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C3837u2 f35732d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3832t2(C3837u2 c3837u2, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35732d = c3837u2;
        this.f35730b = c3837u2.f35744s;
        long j6 = c3837u2.f35745t;
        this.f35731c = j6 < 0 ? Long.MAX_VALUE : j6;
    }

    @Override // j$.util.stream.AbstractC3808o2, j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        long j6 = this.f35730b;
        if (j6 != 0) {
            this.f35730b = j6 - 1;
            return;
        }
        long j10 = this.f35731c;
        if (j10 <= 0) {
            return;
        }
        this.f35731c = j10 - 1;
        this.f35675a.accept(i10);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35675a.l(AbstractC3855y0.W(j6, this.f35732d.f35744s, this.f35731c));
    }

    @Override // j$.util.stream.AbstractC3788k2, j$.util.stream.AbstractC3818q2
    public final boolean n() {
        return this.f35731c == 0 || this.f35675a.n();
    }
}
