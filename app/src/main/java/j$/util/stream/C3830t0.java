package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* renamed from: j$.util.stream.t0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3830t0 extends AbstractC3835u0 implements AbstractC3803n2 {
    @Override // j$.util.stream.AbstractC3835u0, j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        if (this.f35735a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d10);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC3803n2
    public final /* synthetic */ void p(Double d10) {
        AbstractC3855y0.A(this, d10);
    }
}
