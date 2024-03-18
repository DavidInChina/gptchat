package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class D3 extends G3 implements j$.util.F, DoubleConsumer {

    /* renamed from: f  reason: collision with root package name */
    double f35406f;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f35406f = d10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.J3, j$.util.Spliterator] */
    @Override // j$.util.stream.J3
    protected final Spliterator c(Spliterator spliterator) {
        return new J3((j$.util.F) spliterator, this);
    }

    @Override // j$.util.stream.G3
    protected final void e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f35406f);
    }

    @Override // j$.util.stream.G3
    protected final AbstractC3789k3 f(int i10) {
        return new C3774h3(i10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3732p.f(this, consumer);
    }
}
