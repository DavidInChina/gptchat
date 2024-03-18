package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.e2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3758e2 extends AbstractC3798m2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f35619b;

    /* renamed from: c  reason: collision with root package name */
    boolean f35620c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AbstractC3778i2 f35621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3758e2(R3 r32, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35619b = 1;
        this.f35621d = r32;
        this.f35620c = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3758e2(C3753d2 c3753d2, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35619b = 0;
        this.f35621d = c3753d2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f35619b;
        AbstractC3818q2 abstractC3818q2 = this.f35690a;
        AbstractC3778i2 abstractC3778i2 = this.f35621d;
        switch (i10) {
            case 0:
                Stream stream = (Stream) ((C3753d2) abstractC3778i2).f35611t.apply(obj);
                if (stream != null) {
                    try {
                        if (!this.f35620c) {
                            ((Stream) stream.sequential()).forEach(abstractC3818q2);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!abstractC3818q2.n() && spliterator.tryAdvance(abstractC3818q2)) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            stream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (stream == null) {
                    return;
                }
                stream.close();
                return;
            default:
                if (!this.f35620c) {
                    return;
                }
                boolean test = ((R3) abstractC3778i2).f35519s.test(obj);
                this.f35620c = test;
                if (!test) {
                    return;
                }
                abstractC3818q2.accept((AbstractC3818q2) obj);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        int i10 = this.f35619b;
        AbstractC3818q2 abstractC3818q2 = this.f35690a;
        switch (i10) {
            case 0:
                abstractC3818q2.l(-1L);
                return;
            default:
                abstractC3818q2.l(-1L);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final boolean n() {
        int i10 = this.f35619b;
        AbstractC3818q2 abstractC3818q2 = this.f35690a;
        switch (i10) {
            case 0:
                this.f35620c = true;
                return abstractC3818q2.n();
            default:
                return !this.f35620c || abstractC3818q2.n();
        }
    }
}
