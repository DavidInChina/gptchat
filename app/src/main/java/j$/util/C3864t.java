package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.t  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3864t implements IntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f35789a;

    public /* synthetic */ C3864t(Consumer consumer) {
        this.f35789a = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f35789a.accept(Integer.valueOf(i10));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }
}
