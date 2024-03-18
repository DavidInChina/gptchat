package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
final class R3 extends AbstractC3768g2 {

    /* renamed from: s  reason: collision with root package name */
    final /* synthetic */ Predicate f35519s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(AbstractC3745c abstractC3745c, int i10, Predicate predicate) {
        super(abstractC3745c, i10);
        this.f35519s = predicate;
    }

    @Override // j$.util.stream.AbstractC3745c
    final H0 T0(Spliterator spliterator, AbstractC3745c abstractC3745c, IntFunction intFunction) {
        return (H0) new W3(this, abstractC3745c, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC3745c
    final Spliterator U0(AbstractC3745c abstractC3745c, Spliterator spliterator) {
        return EnumC3759e3.ORDERED.s(abstractC3745c.s0()) ? T0(spliterator, abstractC3745c, new C3740b(26)).mo101spliterator() : new X3(abstractC3745c.a1(spliterator), this.f35519s, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        return new C3758e2(this, abstractC3818q2);
    }
}
