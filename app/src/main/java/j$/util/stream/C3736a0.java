package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.a0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3736a0 extends AbstractC3788k2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f35584b;

    /* renamed from: c  reason: collision with root package name */
    W f35585c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C3844w f35586d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3736a0(C3844w c3844w, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35586d = c3844w;
        AbstractC3818q2 abstractC3818q22 = this.f35675a;
        Objects.requireNonNull(abstractC3818q22);
        this.f35585c = new W(abstractC3818q22);
    }

    @Override // j$.util.stream.AbstractC3808o2, j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        IntStream intStream = (IntStream) ((IntFunction) this.f35586d.f35756t).apply(i10);
        if (intStream != null) {
            try {
                boolean z10 = this.f35584b;
                W w10 = this.f35585c;
                if (!z10) {
                    intStream.sequential().forEach(w10);
                } else {
                    j$.util.I spliterator = intStream.sequential().spliterator();
                    while (!this.f35675a.n() && spliterator.tryAdvance((IntConsumer) w10)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    intStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35675a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC3788k2, j$.util.stream.AbstractC3818q2
    public final boolean n() {
        this.f35584b = true;
        return this.f35675a.n();
    }
}
