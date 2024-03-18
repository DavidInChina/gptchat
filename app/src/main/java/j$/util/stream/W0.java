package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class W0 extends V0 implements AbstractC3860z0 {
    @Override // j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        int i10 = this.f35547b;
        double[] dArr = this.f35546a;
        if (i10 < dArr.length) {
            this.f35547b = 1 + i10;
            dArr[i10] = d10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(int i10) {
        AbstractC3855y0.G();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        AbstractC3855y0.H();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC3860z0, j$.util.stream.C0
    /* renamed from: b */
    public final D0 mo102b() {
        int i10 = this.f35547b;
        double[] dArr = this.f35546a;
        if (i10 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f35547b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void k() {
        int i10 = this.f35547b;
        double[] dArr = this.f35546a;
        if (i10 >= dArr.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f35547b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        double[] dArr = this.f35546a;
        if (j6 == dArr.length) {
            this.f35547b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j6), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.AbstractC3803n2
    public final /* synthetic */ void p(Double d10) {
        AbstractC3855y0.A(this, d10);
    }

    @Override // j$.util.stream.V0
    public final String toString() {
        double[] dArr = this.f35546a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f35547b), Arrays.toString(dArr));
    }
}
