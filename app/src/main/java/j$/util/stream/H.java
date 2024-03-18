package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes3.dex */
final class H implements N3 {

    /* renamed from: a  reason: collision with root package name */
    final int f35422a;

    /* renamed from: b  reason: collision with root package name */
    final Object f35423b;

    /* renamed from: c  reason: collision with root package name */
    final Predicate f35424c;

    /* renamed from: d  reason: collision with root package name */
    final Supplier f35425d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H(boolean z10, EnumC3764f3 enumC3764f3, Object obj, N0 n02, C3740b c3740b) {
        this.f35422a = (z10 ? 0 : EnumC3759e3.f35634r) | EnumC3759e3.f35637u;
        this.f35423b = obj;
        this.f35424c = n02;
        this.f35425d = c3740b;
    }

    @Override // j$.util.stream.N3
    public final int h() {
        return this.f35422a;
    }

    @Override // j$.util.stream.N3
    public final Object v(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        return new N(this, EnumC3759e3.ORDERED.s(abstractC3855y0.s0()), abstractC3855y0, spliterator).invoke();
    }

    @Override // j$.util.stream.N3
    public final Object y(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        O3 o32 = (O3) this.f35425d.get();
        abstractC3855y0.I0(spliterator, o32);
        Object obj = o32.get();
        return obj != null ? obj : this.f35423b;
    }
}
