package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.h3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3774h3 extends AbstractC3789k3 implements DoubleConsumer {

    /* renamed from: c  reason: collision with root package name */
    final double[] f35666c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3774h3(int i10) {
        this.f35666c = new double[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3789k3
    public final void a(Object obj, long j6) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i10 = 0; i10 < j6; i10++) {
            doubleConsumer.accept(this.f35666c[i10]);
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        int i10 = this.f35676b;
        this.f35676b = i10 + 1;
        this.f35666c[i10] = d10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
