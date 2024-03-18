package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X1 extends Z1 implements AbstractC3813p2 {
    @Override // j$.util.stream.Z1, j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f35574b++;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t12) {
        this.f35574b += ((Z1) t12).f35574b;
    }

    @Override // j$.util.stream.U1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f35574b);
    }

    @Override // j$.util.stream.AbstractC3813p2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3855y0.E(this, l10);
    }
}
