package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class W implements IntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC3818q2 f35553a;

    public /* synthetic */ W(AbstractC3818q2 abstractC3818q2) {
        this.f35553a = abstractC3818q2;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f35553a.accept(i10);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }
}
