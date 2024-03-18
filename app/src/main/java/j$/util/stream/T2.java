package j$.util.stream;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.AbstractC3732p;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class T2 extends Z2 implements DoubleConsumer {
    @Override // java.util.function.DoubleConsumer
    public void accept(double d10) {
        w();
        int i10 = this.f35614b;
        this.f35614b = i10 + 1;
        ((double[]) this.f35575e)[i10] = d10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.Z2
    public final Object c(int i10) {
        return new double[i10];
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            f((DoubleConsumer) consumer);
        } else if (!Q3.f35509a) {
            AbstractC3732p.a((S2) mo103spliterator(), consumer);
        } else {
            Q3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.f(mo103spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public final void r(Object obj, int i10, int i11, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i10 < i11) {
            doubleConsumer.accept(dArr[i10]);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public final int s(Object obj) {
        return ((double[]) obj).length;
    }

    public final String toString() {
        double[] dArr = (double[]) e();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f35615c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f35615c), Arrays.toString(Arrays.copyOf(dArr, (int) RCHTTPStatusCodes.SUCCESS)));
    }

    @Override // j$.util.stream.Z2
    protected final Object[] v() {
        return new double[8];
    }

    /* renamed from: x */
    public j$.util.F mo103spliterator() {
        return new S2(this, 0, this.f35615c, 0, this.f35614b);
    }
}
