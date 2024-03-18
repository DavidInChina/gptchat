package j$.util.stream;

import j$.util.C3728l;
import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
final class I extends M implements AbstractC3803n2 {

    /* renamed from: c  reason: collision with root package name */
    static final H f35430c;

    /* renamed from: d  reason: collision with root package name */
    static final H f35431d;

    static {
        EnumC3764f3 enumC3764f3 = EnumC3764f3.DOUBLE_VALUE;
        f35430c = new H(true, enumC3764f3, C3728l.a(), new N0(23), new C3740b(11));
        f35431d = new H(false, enumC3764f3, C3728l.a(), new N0(23), new C3740b(11));
    }

    @Override // j$.util.stream.M, j$.util.stream.AbstractC3818q2
    public final void accept(double d10) {
        p(Double.valueOf(d10));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f35470a) {
            return C3728l.d(((Double) this.f35471b).doubleValue());
        }
        return null;
    }
}
