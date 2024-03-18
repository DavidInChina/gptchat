package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q extends T implements AbstractC3813p2 {

    /* renamed from: b  reason: collision with root package name */
    final LongConsumer f35503b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(LongConsumer longConsumer, boolean z10) {
        super(z10);
        this.f35503b = longConsumer;
    }

    @Override // j$.util.stream.T, j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f35503b.accept(j6);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.AbstractC3813p2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3855y0.E(this, l10);
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
