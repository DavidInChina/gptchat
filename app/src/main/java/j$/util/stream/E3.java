package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class E3 extends G3 implements j$.util.I, IntConsumer {

    /* renamed from: f  reason: collision with root package name */
    int f35413f;

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f35413f = i10;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.J3, j$.util.Spliterator] */
    @Override // j$.util.stream.J3
    protected final Spliterator c(Spliterator spliterator) {
        return new J3((j$.util.I) spliterator, this);
    }

    @Override // j$.util.stream.G3
    protected final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f35413f);
    }

    @Override // j$.util.stream.G3
    protected final AbstractC3789k3 f(int i10) {
        return new C3779i3(i10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3732p.g(this, consumer);
    }
}
