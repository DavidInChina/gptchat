package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.r0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3820r0 extends AbstractC3835u0 implements AbstractC3808o2 {
    @Override // j$.util.stream.AbstractC3835u0, j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        if (this.f35735a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i10);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC3808o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3855y0.C(this, num);
    }
}
