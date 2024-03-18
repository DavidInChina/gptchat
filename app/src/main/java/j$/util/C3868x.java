package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.x  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3868x implements LongConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f35792a;

    public /* synthetic */ C3868x(Consumer consumer) {
        this.f35792a = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f35792a.accept(Long.valueOf(j6));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }
}
