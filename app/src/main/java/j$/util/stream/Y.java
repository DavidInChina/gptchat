package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class Y extends AbstractC3788k2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f35563b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC3745c f35564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractC3745c abstractC3745c, AbstractC3818q2 abstractC3818q2, int i10) {
        super(abstractC3818q2);
        this.f35563b = i10;
        this.f35564c = abstractC3745c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.function.IntToLongFunction, java.util.function.IntToDoubleFunction, java.util.function.IntUnaryOperator, java.util.function.IntPredicate] */
    @Override // j$.util.stream.AbstractC3808o2, j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        int i11 = this.f35563b;
        AbstractC3818q2 abstractC3818q2 = this.f35675a;
        AbstractC3745c abstractC3745c = this.f35564c;
        ?? r32 = 0;
        switch (i11) {
            case 0:
                abstractC3818q2.accept((AbstractC3818q2) ((IntFunction) ((C3834u) abstractC3745c).f35734t).apply(i10));
                return;
            case 1:
                ((IntConsumer) ((C3844w) abstractC3745c).f35756t).accept(i10);
                abstractC3818q2.accept(i10);
                return;
            case 2:
                abstractC3818q2.accept(i10);
                return;
            case 3:
                abstractC3818q2.accept(i10);
                return;
            case 4:
                j$.time.b.b(((C3844w) abstractC3745c).f35756t);
                r32.applyAsInt(i10);
                throw null;
            case 5:
                j$.time.b.b(((C3849x) abstractC3745c).f35763t);
                r32.applyAsLong(i10);
                throw null;
            case 6:
                j$.time.b.b(((C3839v) abstractC3745c).f35748t);
                r32.applyAsDouble(i10);
                throw null;
            default:
                j$.time.b.b(((C3844w) abstractC3745c).f35756t);
                r32.test(i10);
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        int i10 = this.f35563b;
        AbstractC3818q2 abstractC3818q2 = this.f35675a;
        switch (i10) {
            case 7:
                abstractC3818q2.l(-1L);
                return;
            default:
                abstractC3818q2.l(j6);
                return;
        }
    }
}
