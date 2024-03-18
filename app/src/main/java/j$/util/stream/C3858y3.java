package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.y3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3858y3 implements LongConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35784a;

    public /* synthetic */ C3858y3(int i10) {
        this.f35784a = i10;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f35784a) {
            case 0:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
            default:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
        }
    }
}
