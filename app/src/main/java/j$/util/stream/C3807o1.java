package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.o1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3807o1 extends C3802n1 implements B0 {
    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(double d10) {
        AbstractC3855y0.z();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ void accept(int i10) {
        AbstractC3855y0.G();
        throw null;
    }

    @Override // j$.util.stream.AbstractC3818q2, j$.util.stream.AbstractC3813p2, java.util.function.LongConsumer
    public final void accept(long j6) {
        int i10 = this.f35697b;
        long[] jArr = this.f35696a;
        if (i10 < jArr.length) {
            this.f35697b = 1 + i10;
            jArr[i10] = j6;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.B0, j$.util.stream.C0
    /* renamed from: b */
    public final F0 mo102b() {
        int i10 = this.f35697b;
        long[] jArr = this.f35696a;
        if (i10 >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f35697b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.AbstractC3813p2
    public final /* synthetic */ void j(Long l10) {
        AbstractC3855y0.E(this, l10);
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void k() {
        int i10 = this.f35697b;
        long[] jArr = this.f35696a;
        if (i10 >= jArr.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f35697b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        long[] jArr = this.f35696a;
        if (j6 == jArr.length) {
            this.f35697b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j6), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.C3802n1
    public final String toString() {
        long[] jArr = this.f35696a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.f35697b), Arrays.toString(jArr));
    }
}
