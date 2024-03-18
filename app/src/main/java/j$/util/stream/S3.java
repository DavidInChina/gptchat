package j$.util.stream;

/* loaded from: classes3.dex */
final class S3 extends AbstractC3798m2 {

    /* renamed from: b  reason: collision with root package name */
    long f35525b;

    /* renamed from: c  reason: collision with root package name */
    boolean f35526c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f35527d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ T3 f35528e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(T3 t32, AbstractC3818q2 abstractC3818q2, boolean z10) {
        super(abstractC3818q2);
        this.f35528e = t32;
        this.f35527d = z10;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z10 = true;
        if (!this.f35526c) {
            boolean z11 = !this.f35528e.f35531s.test(obj);
            this.f35526c = z11;
            if (!z11) {
                z10 = false;
            }
        }
        boolean z12 = this.f35527d;
        if (z12 && !z10) {
            this.f35525b++;
        }
        if (z12 || z10) {
            this.f35690a.accept((AbstractC3818q2) obj);
        }
    }
}
