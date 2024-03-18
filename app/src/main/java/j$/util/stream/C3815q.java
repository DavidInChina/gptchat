package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3815q extends AbstractC3768g2 {
    static L0 b1(AbstractC3745c abstractC3745c, Spliterator spliterator) {
        N0 n02 = new N0(15);
        N0 n03 = new N0(16);
        N0 n04 = new N0(17);
        Objects.requireNonNull(n02);
        Objects.requireNonNull(n03);
        Objects.requireNonNull(n04);
        return new L0((Collection) new D1(EnumC3764f3.REFERENCE, n04, n03, n02, 3).v(abstractC3745c, spliterator));
    }

    @Override // j$.util.stream.AbstractC3745c
    final H0 T0(Spliterator spliterator, AbstractC3745c abstractC3745c, IntFunction intFunction) {
        if (EnumC3759e3.DISTINCT.s(abstractC3745c.s0())) {
            return abstractC3745c.K0(spliterator, false, intFunction);
        }
        if (EnumC3759e3.ORDERED.s(abstractC3745c.s0())) {
            return b1(abstractC3745c, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C3800n c3800n = new C3800n(0, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(c3800n);
        new S(c3800n, false).a(abstractC3745c, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new L0(keySet);
    }

    @Override // j$.util.stream.AbstractC3745c
    final Spliterator U0(AbstractC3745c abstractC3745c, Spliterator spliterator) {
        return EnumC3759e3.DISTINCT.s(abstractC3745c.s0()) ? abstractC3745c.a1(spliterator) : EnumC3759e3.ORDERED.s(abstractC3745c.s0()) ? b1(abstractC3745c, spliterator).mo101spliterator() : new C3804n3(abstractC3745c.a1(spliterator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3745c
    public final AbstractC3818q2 W0(int i10, AbstractC3818q2 abstractC3818q2) {
        Objects.requireNonNull(abstractC3818q2);
        return EnumC3759e3.DISTINCT.s(i10) ? abstractC3818q2 : EnumC3759e3.SORTED.s(i10) ? new C3805o(this, abstractC3818q2) : new AbstractC3798m2(abstractC3818q2);
    }
}
