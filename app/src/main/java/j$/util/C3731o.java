package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.o  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3731o implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f35376a;

    public /* synthetic */ C3731o(Consumer consumer) {
        this.f35376a = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f35376a.accept(Double.valueOf(d10));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
