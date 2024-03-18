package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.o3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3809o3 implements AbstractC3803n2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35707a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f35708b;

    public /* synthetic */ C3809o3(DoubleConsumer doubleConsumer, int i10) {
        this.f35707a = i10;
        this.f35708b = doubleConsumer;
    }

    @Override // j$.util.stream.AbstractC3803n2, j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        int i10 = this.f35707a;
        DoubleConsumer doubleConsumer = this.f35708b;
        switch (i10) {
            case 0:
                ((T2) doubleConsumer).accept(d10);
                return;
            default:
                doubleConsumer.accept(d10);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f35707a) {
            case 0:
                AbstractC3855y0.G();
                throw null;
            default:
                AbstractC3855y0.G();
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        switch (this.f35707a) {
            case 0:
                AbstractC3855y0.H();
                throw null;
            default:
                AbstractC3855y0.H();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f35707a) {
            case 0:
                p((Double) obj);
                return;
            default:
                p((Double) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f35707a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f35707a) {
            case 0:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
            default:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void l(long j6) {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.AbstractC3803n2
    public final /* synthetic */ void p(Double d10) {
        switch (this.f35707a) {
            case 0:
                AbstractC3855y0.A(this, d10);
                return;
            default:
                AbstractC3855y0.A(this, d10);
                return;
        }
    }
}
