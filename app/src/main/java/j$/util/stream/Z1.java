package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
abstract class Z1 extends U1 implements T1 {

    /* renamed from: b  reason: collision with root package name */
    long f35574b;

    public /* synthetic */ void accept(double d10) {
        AbstractC3855y0.z();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC3855y0.G();
        throw null;
    }

    public /* synthetic */ void accept(long j6) {
        AbstractC3855y0.H();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        this.f35574b = 0L;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }
}
