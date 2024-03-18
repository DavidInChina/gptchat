package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class S extends T {

    /* renamed from: b  reason: collision with root package name */
    final Consumer f35520b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(Consumer consumer, boolean z10) {
        super(z10);
        this.f35520b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f35520b.accept(obj);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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
