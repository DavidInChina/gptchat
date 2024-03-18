package j$.util.stream;

import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.i3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3779i3 extends AbstractC3789k3 implements IntConsumer {

    /* renamed from: c  reason: collision with root package name */
    final int[] f35670c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3779i3(int i10) {
        this.f35670c = new int[i10];
    }

    @Override // j$.util.stream.AbstractC3789k3
    public final void a(Object obj, long j6) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i10 = 0; i10 < j6; i10++) {
            intConsumer.accept(this.f35670c[i10]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        int i11 = this.f35676b;
        this.f35676b = i11 + 1;
        this.f35670c[i11] = i10;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }
}
