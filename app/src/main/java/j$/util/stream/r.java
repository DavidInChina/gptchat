package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC3818q2 f35715a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f35715a.accept(d10);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }
}
