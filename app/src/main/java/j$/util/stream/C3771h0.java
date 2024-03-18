package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* renamed from: j$.util.stream.h0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3771h0 extends AbstractC3793l2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f35664b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AbstractC3745c f35665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3771h0(AbstractC3745c abstractC3745c, AbstractC3818q2 abstractC3818q2, int i10) {
        super(abstractC3818q2);
        this.f35664b = i10;
        this.f35665c = abstractC3745c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.function.LongToIntFunction, java.util.function.LongUnaryOperator, java.util.function.LongPredicate, java.util.function.LongToDoubleFunction] */
    @Override // j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        int i10 = this.f35664b;
        AbstractC3818q2 abstractC3818q2 = this.f35678a;
        AbstractC3745c abstractC3745c = this.f35665c;
        ?? r32 = 0;
        switch (i10) {
            case 0:
                abstractC3818q2.accept((AbstractC3818q2) ((LongFunction) ((C3834u) abstractC3745c).f35734t).apply(j6));
                return;
            case 1:
                abstractC3818q2.accept(j6);
                return;
            case 2:
                j$.time.b.b(((C3849x) abstractC3745c).f35763t);
                r32.applyAsLong(j6);
                throw null;
            case 3:
                j$.time.b.b(((C3844w) abstractC3745c).f35756t);
                r32.applyAsInt(j6);
                throw null;
            case 4:
                j$.time.b.b(((C3839v) abstractC3745c).f35748t);
                r32.applyAsDouble(j6);
                throw null;
            case 5:
                j$.time.b.b(((C3849x) abstractC3745c).f35763t);
                r32.test(j6);
                throw null;
            default:
                ((LongConsumer) ((C3849x) abstractC3745c).f35763t).accept(j6);
                abstractC3818q2.accept(j6);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        int i10 = this.f35664b;
        AbstractC3818q2 abstractC3818q2 = this.f35678a;
        switch (i10) {
            case 5:
                abstractC3818q2.l(-1L);
                return;
            default:
                abstractC3818q2.l(j6);
                return;
        }
    }
}
