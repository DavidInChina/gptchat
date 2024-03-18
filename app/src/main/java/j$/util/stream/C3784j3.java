package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.j3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3784j3 extends AbstractC3789k3 implements LongConsumer {

    /* renamed from: c  reason: collision with root package name */
    final long[] f35673c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3784j3(int i10) {
        this.f35673c = new long[i10];
    }

    @Override // j$.util.stream.AbstractC3789k3
    public final void a(Object obj, long j6) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i10 = 0; i10 < j6; i10++) {
            longConsumer.accept(this.f35673c[i10]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        int i10 = this.f35676b;
        this.f35676b = i10 + 1;
        this.f35673c[i10] = j6;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }
}
