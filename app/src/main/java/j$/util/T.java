package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class T implements A, LongConsumer, AbstractC3725i {

    /* renamed from: a  reason: collision with root package name */
    boolean f35229a = false;

    /* renamed from: b  reason: collision with root package name */
    long f35230b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ L f35231c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T(L l10) {
        this.f35231c = l10;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j6) {
        this.f35229a = true;
        this.f35230b = j6;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.A, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (f0.f35345a) {
            f0.a(T.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new C3868x(consumer));
    }

    @Override // j$.util.A
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f35229a) {
            this.f35231c.tryAdvance((LongConsumer) this);
        }
        return this.f35229a;
    }

    @Override // j$.util.A, java.util.Iterator
    public final Long next() {
        if (!f0.f35345a) {
            return Long.valueOf(nextLong());
        }
        f0.a(T.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.A
    public final long nextLong() {
        if (this.f35229a || hasNext()) {
            this.f35229a = false;
            return this.f35230b;
        }
        throw new NoSuchElementException();
    }
}
