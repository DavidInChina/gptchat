package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3853x3 extends A3 implements j$.util.I {
    /* JADX WARN: Type inference failed for: r10v0, types: [j$.util.stream.C3, j$.util.Spliterator] */
    @Override // j$.util.stream.C3
    protected final Spliterator a(Spliterator spliterator, long j6, long j10, long j11, long j12) {
        return new C3((j$.util.I) spliterator, j6, j10, j11, j12);
    }

    @Override // j$.util.stream.A3
    protected final Object b() {
        return new C3848w3(0);
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
