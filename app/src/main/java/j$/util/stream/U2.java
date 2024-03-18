package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class U2 extends Y2 implements j$.util.I {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ V2 f35541g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(V2 v22, int i10, int i11, int i12, int i13) {
        super(v22, i10, i11, i12, i13);
        this.f35541g = v22;
    }

    @Override // j$.util.stream.Y2
    final void a(int i10, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i10]);
    }

    @Override // j$.util.stream.Y2
    final j$.util.O b(Object obj, int i10, int i11) {
        return Spliterators.k((int[]) obj, i10, i11 + i10);
    }

    @Override // j$.util.stream.Y2
    final j$.util.O c(int i10, int i11, int i12, int i13) {
        return new U2(this.f35541g, i10, i11, i12, i13);
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
