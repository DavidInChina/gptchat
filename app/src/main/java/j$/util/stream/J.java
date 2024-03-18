package j$.util.stream;

import j$.util.C3729m;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
final class J extends M implements AbstractC3808o2 {

    /* renamed from: c  reason: collision with root package name */
    static final H f35439c;

    /* renamed from: d  reason: collision with root package name */
    static final H f35440d;

    static {
        EnumC3764f3 enumC3764f3 = EnumC3764f3.INT_VALUE;
        f35439c = new H(true, enumC3764f3, C3729m.a(), new N0(24), new C3740b(12));
        f35440d = new H(false, enumC3764f3, C3729m.a(), new N0(24), new C3740b(12));
    }

    @Override // j$.util.stream.M, j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        p(Integer.valueOf(i10));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f35470a) {
            return C3729m.d(((Integer) this.f35471b).intValue());
        }
        return null;
    }
}
