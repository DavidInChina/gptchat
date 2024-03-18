package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O extends T implements AbstractC3803n2 {

    /* renamed from: b  reason: collision with root package name */
    final DoubleConsumer f35488b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(DoubleConsumer doubleConsumer, boolean z10) {
        super(z10);
        this.f35488b = doubleConsumer;
    }

    @Override // j$.util.stream.T, j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        this.f35488b.accept(d10);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.AbstractC3803n2
    public final /* synthetic */ void p(Double d10) {
        AbstractC3855y0.A(this, d10);
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
