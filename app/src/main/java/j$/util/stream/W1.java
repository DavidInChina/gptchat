package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W1 extends Z1 implements AbstractC3808o2 {
    @Override // j$.util.stream.Z1, j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        this.f35574b++;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t12) {
        this.f35574b += ((Z1) t12).f35574b;
    }

    @Override // j$.util.stream.U1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f35574b);
    }

    @Override // j$.util.stream.AbstractC3808o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3855y0.C(this, num);
    }
}
