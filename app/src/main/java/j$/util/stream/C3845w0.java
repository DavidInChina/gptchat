package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3845w0 implements N3 {

    /* renamed from: a  reason: collision with root package name */
    final EnumC3840v0 f35757a;

    /* renamed from: b  reason: collision with root package name */
    final Supplier f35758b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3845w0(EnumC3764f3 enumC3764f3, EnumC3840v0 enumC3840v0, C3800n c3800n) {
        this.f35757a = enumC3840v0;
        this.f35758b = c3800n;
    }

    @Override // j$.util.stream.N3
    public final int h() {
        return EnumC3759e3.f35637u | EnumC3759e3.f35634r;
    }

    @Override // j$.util.stream.N3
    public final Object v(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        return (Boolean) new C3850x0(this, abstractC3855y0, spliterator).invoke();
    }

    @Override // j$.util.stream.N3
    public final Object y(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        AbstractC3835u0 abstractC3835u0 = (AbstractC3835u0) this.f35758b.get();
        abstractC3855y0.I0(spliterator, abstractC3835u0);
        return Boolean.valueOf(abstractC3835u0.f35736b);
    }
}
