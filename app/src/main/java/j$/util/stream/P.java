package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P extends T implements AbstractC3808o2 {

    /* renamed from: b  reason: collision with root package name */
    final IntConsumer f35494b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P(IntConsumer intConsumer, boolean z10) {
        super(z10);
        this.f35494b = intConsumer;
    }

    @Override // j$.util.stream.T, j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        this.f35494b.accept(i10);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.AbstractC3808o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3855y0.C(this, num);
    }

    @Override // j$.util.stream.N3
    public final /* bridge */ /* synthetic */ Object v(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        a(abstractC3855y0, spliterator);
        return null;
    }

    @Override // j$.util.stream.N3
    public final Object y(AbstractC3855y0 abstractC3855y0, Spliterator spliterator) {
        abstractC3855y0.I0(spliterator, this);
        return null;
    }
}
