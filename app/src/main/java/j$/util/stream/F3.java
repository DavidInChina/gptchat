package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class F3 extends G3 implements j$.util.L, LongConsumer {

    /* renamed from: f  reason: collision with root package name */
    long f35417f;

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f35417f = j6;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.J3, j$.util.Spliterator] */
    @Override // j$.util.stream.J3
    protected final Spliterator c(Spliterator spliterator) {
        return new J3((j$.util.L) spliterator, this);
    }

    @Override // j$.util.stream.G3
    protected final void e(Object obj) {
        ((LongConsumer) obj).accept(this.f35417f);
    }

    @Override // j$.util.stream.G3
    protected final AbstractC3789k3 f(int i10) {
        return new C3784j3(i10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC3732p.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC3732p.h(this, consumer);
    }
}
