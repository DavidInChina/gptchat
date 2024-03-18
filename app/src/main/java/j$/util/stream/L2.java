package j$.util.stream;

import j$.util.Comparator;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class L2 extends AbstractC3768g2 {

    /* renamed from: s  reason: collision with root package name */
    private final boolean f35468s;

    /* renamed from: t  reason: collision with root package name */
    private final Comparator f35469t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(AbstractC3745c abstractC3745c) {
        super(abstractC3745c, EnumC3759e3.f35633q | EnumC3759e3.f35631o);
        this.f35468s = true;
        this.f35469t = Comparator.CC.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L2(AbstractC3745c abstractC3745c, java.util.Comparator comparator) {
        super(abstractC3745c, EnumC3759e3.f35633q | EnumC3759e3.f35632p);
        this.f35468s = false;
        this.f35469t = (java.util.Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC3745c
    public final H0 T0(Spliterator spliterator, AbstractC3745c abstractC3745c, IntFunction intFunction) {
        if (!EnumC3759e3.SORTED.s(abstractC3745c.s0()) || !this.f35468s) {
            Object[] o10 = abstractC3745c.K0(spliterator, true, intFunction).o(intFunction);
            Arrays.sort(o10, this.f35469t);
            return new K0(o10);
        }
        return abstractC3745c.K0(spliterator, false, intFunction);
    }

    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        Objects.requireNonNull(abstractC3818q2);
        if (!EnumC3759e3.SORTED.s(i10) || !this.f35468s) {
            boolean s10 = EnumC3759e3.SIZED.s(i10);
            java.util.Comparator comparator = this.f35469t;
            return s10 ? new E2(abstractC3818q2, comparator) : new E2(abstractC3818q2, comparator);
        }
        return abstractC3818q2;
    }
}
