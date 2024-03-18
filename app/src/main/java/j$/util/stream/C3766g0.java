package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.g0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3766g0 implements LongConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC3818q2 f35653a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f35653a.accept(j6);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }
}
