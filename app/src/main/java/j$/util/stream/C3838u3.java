package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.u3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3838u3 implements DoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35746a;

    public /* synthetic */ C3838u3(int i10) {
        this.f35746a = i10;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f35746a) {
            case 0:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
            default:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
        }
    }
}
