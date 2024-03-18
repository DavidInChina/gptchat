package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* renamed from: j$.util.stream.i0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3776i0 extends AbstractC3793l2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f35667b;

    /* renamed from: c  reason: collision with root package name */
    C3766g0 f35668c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C3849x f35669d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3776i0(C3849x c3849x, AbstractC3818q2 abstractC3818q2) {
        super(abstractC3818q2);
        this.f35669d = c3849x;
        AbstractC3818q2 abstractC3818q22 = this.f35678a;
        Objects.requireNonNull(abstractC3818q22);
        this.f35668c = new C3766g0(abstractC3818q22);
    }

    @Override // j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        AbstractC3811p0 abstractC3811p0 = (AbstractC3811p0) ((LongFunction) this.f35669d.f35763t).apply(j6);
        if (abstractC3811p0 != null) {
            try {
                boolean z10 = this.f35667b;
                C3766g0 c3766g0 = this.f35668c;
                if (!z10) {
                    abstractC3811p0.sequential().forEach(c3766g0);
                } else {
                    j$.util.L spliterator = abstractC3811p0.sequential().spliterator();
                    while (!this.f35678a.n() && spliterator.tryAdvance((LongConsumer) c3766g0)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    abstractC3811p0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (abstractC3811p0 != null) {
            abstractC3811p0.close();
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35678a.l(-1L);
    }

    @Override // j$.util.stream.AbstractC3793l2, j$.util.stream.AbstractC3818q2
    public final boolean n() {
        this.f35667b = true;
        return this.f35678a.n();
    }
}
