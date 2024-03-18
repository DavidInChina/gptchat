package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
final class J2 extends AbstractC3751d0 {
    @Override // j$.util.stream.AbstractC3745c
    public final H0 T0(Spliterator spliterator, AbstractC3745c abstractC3745c, IntFunction intFunction) {
        if (EnumC3759e3.SORTED.s(abstractC3745c.s0())) {
            return abstractC3745c.K0(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((E0) abstractC3745c.K0(spliterator, true, intFunction)).e();
        Arrays.sort(iArr);
        return new C3757e1(iArr);
    }

    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        Objects.requireNonNull(abstractC3818q2);
        return EnumC3759e3.SORTED.s(i10) ? abstractC3818q2 : EnumC3759e3.SIZED.s(i10) ? new AbstractC3788k2(abstractC3818q2) : new AbstractC3788k2(abstractC3818q2);
    }
}
