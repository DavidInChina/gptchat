package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.t  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3829t extends AbstractC3783j2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f35727b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC3745c f35728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3829t(AbstractC3745c abstractC3745c, AbstractC3818q2 abstractC3818q2, int i10) {
        super(abstractC3818q2);
        this.f35727b = i10;
        this.f35728c = abstractC3745c;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.function.DoubleToLongFunction, java.util.function.DoublePredicate, java.util.function.DoubleToIntFunction] */
    @Override // j$.util.stream.AbstractC3803n2, j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        int i10 = this.f35727b;
        AbstractC3818q2 abstractC3818q2 = this.f35672a;
        ?? r22 = 0;
        AbstractC3745c abstractC3745c = this.f35728c;
        switch (i10) {
            case 0:
                abstractC3818q2.accept((AbstractC3818q2) ((DoubleFunction) ((C3834u) abstractC3745c).f35734t).apply(d10));
                return;
            case 1:
                abstractC3818q2.accept(((DoubleUnaryOperator) ((C3839v) abstractC3745c).f35748t).applyAsDouble(d10));
                return;
            case 2:
                j$.time.b.b(((C3844w) abstractC3745c).f35756t);
                r22.applyAsInt(d10);
                throw null;
            case 3:
                j$.time.b.b(((C3849x) abstractC3745c).f35763t);
                r22.applyAsLong(d10);
                throw null;
            case 4:
                j$.time.b.b(((C3839v) abstractC3745c).f35748t);
                r22.test(d10);
                throw null;
            default:
                ((DoubleConsumer) ((C3839v) abstractC3745c).f35748t).accept(d10);
                abstractC3818q2.accept(d10);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        int i10 = this.f35727b;
        AbstractC3818q2 abstractC3818q2 = this.f35672a;
        switch (i10) {
            case 4:
                abstractC3818q2.l(-1L);
                return;
            default:
                abstractC3818q2.l(j6);
                return;
        }
    }
}
