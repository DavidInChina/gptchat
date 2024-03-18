package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3752d1 extends K0 implements C0 {
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
    public final /* synthetic */ void accept(long j6) {
        AbstractC3855y0.H();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i10 = this.f35455b;
        Object[] objArr = this.f35454a;
        if (i10 < objArr.length) {
            this.f35455b = 1 + i10;
            objArr[i10] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.C0
    /* renamed from: b */
    public final H0 mo102b() {
        int i10 = this.f35455b;
        Object[] objArr = this.f35454a;
        if (i10 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f35455b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void k() {
        int i10 = this.f35455b;
        Object[] objArr = this.f35454a;
        if (i10 >= objArr.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f35455b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        Object[] objArr = this.f35454a;
        if (j6 == objArr.length) {
            this.f35455b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j6), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.AbstractC3818q2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final String toString() {
        Object[] objArr = this.f35454a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f35455b), Arrays.toString(objArr));
    }
}
