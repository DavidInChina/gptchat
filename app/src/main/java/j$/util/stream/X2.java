package j$.util.stream;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.AbstractC3732p;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class X2 extends Z2 implements LongConsumer {
    @Override // java.util.function.LongConsumer
    public void accept(long j6) {
        w();
        int i10 = this.f35614b;
        this.f35614b = i10 + 1;
        ((long[]) this.f35575e)[i10] = j6;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.Z2
    public final Object c(int i10) {
        return new long[i10];
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            f((LongConsumer) consumer);
        } else if (!Q3.f35509a) {
            AbstractC3732p.c((W2) mo103spliterator(), consumer);
        } else {
            Q3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.h(mo103spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public final void r(Object obj, int i10, int i11, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i10 < i11) {
            longConsumer.accept(jArr[i10]);
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.Z2
    public final int s(Object obj) {
        return ((long[]) obj).length;
    }

    public final String toString() {
        long[] jArr = (long[]) e();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f35615c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f35615c), Arrays.toString(Arrays.copyOf(jArr, (int) RCHTTPStatusCodes.SUCCESS)));
    }

    @Override // j$.util.stream.Z2
    protected final Object[] v() {
        return new long[8];
    }

    /* renamed from: x */
    public j$.util.L mo103spliterator() {
        return new W2(this, 0, this.f35615c, 0, this.f35614b);
    }
}
