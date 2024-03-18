package j$.util.stream;

import j$.util.C3730n;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class K extends M implements AbstractC3813p2 {

    /* renamed from: c  reason: collision with root package name */
    static final H f35452c;

    /* renamed from: d  reason: collision with root package name */
    static final H f35453d;

    static {
        EnumC3764f3 enumC3764f3 = EnumC3764f3.LONG_VALUE;
        f35452c = new H(true, enumC3764f3, C3730n.a(), new N0(25), new C3740b(13));
        f35453d = new H(false, enumC3764f3, C3730n.a(), new N0(25), new C3740b(13));
    }

    @Override // j$.util.stream.M, j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        p(Long.valueOf(j6));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f35470a) {
            return C3730n.d(((Long) this.f35471b).longValue());
        }
        return null;
    }
}
