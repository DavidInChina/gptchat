package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class K1 extends AbstractC3855y0 {

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f35456h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ BiConsumer f35457i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Supplier f35458j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ Collector f35459k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(EnumC3764f3 enumC3764f3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super(enumC3764f3);
        this.f35456h = binaryOperator;
        this.f35457i = biConsumer;
        this.f35458j = supplier;
        this.f35459k = collector;
    }

    @Override // j$.util.stream.AbstractC3855y0
    public final T1 G0() {
        return new L1(this.f35458j, this.f35457i, this.f35456h);
    }

    @Override // j$.util.stream.AbstractC3855y0, j$.util.stream.N3
    public final int h() {
        if (this.f35459k.characteristics().contains(EnumC3780j.UNORDERED)) {
            return EnumC3759e3.f35634r;
        }
        return 0;
    }
}
