package j$.util.stream;

import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.w3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3848w3 implements IntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35761a;

    public /* synthetic */ C3848w3(int i10) {
        this.f35761a = i10;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f35761a) {
            case 0:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
            default:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
        }
    }
}
