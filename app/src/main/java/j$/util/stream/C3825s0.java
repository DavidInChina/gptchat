package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* renamed from: j$.util.stream.s0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3825s0 extends AbstractC3835u0 implements AbstractC3813p2 {
    @Override // j$.util.stream.AbstractC3835u0, j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        if (this.f35735a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j6);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC3813p2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3855y0.E(this, l10);
    }
}
