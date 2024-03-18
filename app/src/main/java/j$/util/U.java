package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U implements AbstractC3734s, DoubleConsumer, AbstractC3725i {

    /* renamed from: a  reason: collision with root package name */
    boolean f35232a = false;

    /* renamed from: b  reason: collision with root package name */
    double f35233b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ F f35234c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(F f6) {
        this.f35234c = f6;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f35232a = true;
        this.f35233b = d10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.AbstractC3734s, java.util.Iterator, j$.util.AbstractC3725i
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (f0.f35345a) {
            f0.a(U.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new C3731o(consumer));
    }

    @Override // j$.util.AbstractC3734s
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f35232a) {
            this.f35234c.tryAdvance((DoubleConsumer) this);
        }
        return this.f35232a;
    }

    @Override // j$.util.AbstractC3734s, java.util.Iterator
    public final Double next() {
        if (!f0.f35345a) {
            return Double.valueOf(nextDouble());
        }
        f0.a(U.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // j$.util.AbstractC3734s
    public final double nextDouble() {
        if (this.f35232a || hasNext()) {
            this.f35232a = false;
            return this.f35233b;
        }
        throw new NoSuchElementException();
    }
}
