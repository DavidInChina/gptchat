package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* renamed from: j$.util.stream.y  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3854y extends AbstractC3783j2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f35770b;

    /* renamed from: c  reason: collision with root package name */
    r f35771c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C3839v f35772d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3854y(C3839v c3839v, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35772d = c3839v;
        AbstractC3818q2 abstractC3818q22 = this.f35672a;
        Objects.requireNonNull(abstractC3818q22);
        this.f35771c = new r(abstractC3818q22);
    }

    @Override // j$.util.stream.AbstractC3803n2, j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        G g10 = (G) ((DoubleFunction) this.f35772d.f35748t).apply(d10);
        if (g10 != null) {
            try {
                boolean z10 = this.f35770b;
                r rVar = this.f35771c;
                if (!z10) {
                    g10.sequential().forEach(rVar);
                } else {
                    j$.util.F spliterator = g10.sequential().spliterator();
                    while (!this.f35672a.n() && spliterator.tryAdvance((DoubleConsumer) rVar)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    g10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (g10 != null) {
            g10.close();
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35672a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC3783j2, j$.util.stream.AbstractC3818q2
    public final boolean n() {
        this.f35770b = true;
        return this.f35672a.n();
    }
}
