package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3762f1 extends C3757e1 implements A0 {
    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(double d10) {
        AbstractC3855y0.z();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void accept(int i10) {
        int i11 = this.f35618b;
        int[] iArr = this.f35617a;
        if (i11 < iArr.length) {
            this.f35618b = 1 + i11;
            iArr[i11] = i10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j6) {
        AbstractC3855y0.H();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.A0, j$.util.stream.C0
    /* renamed from: b */
    public final E0 mo102b() {
        int i10 = this.f35618b;
        int[] iArr = this.f35617a;
        if (i10 >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f35618b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void k() {
        int i10 = this.f35618b;
        int[] iArr = this.f35617a;
        if (i10 >= iArr.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f35618b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        int[] iArr = this.f35617a;
        if (j6 == iArr.length) {
            this.f35618b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j6), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.AbstractC3808o2
    public final /* synthetic */ void m(Integer num) {
        AbstractC3855y0.C(this, num);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.C3757e1
    public final String toString() {
        int[] iArr = this.f35617a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.f35618b), Arrays.toString(iArr));
    }
}
