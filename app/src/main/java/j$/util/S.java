package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class S implements AbstractC3867w, IntConsumer, AbstractC3725i {

    /* renamed from: a  reason: collision with root package name */
    boolean f35221a = false;

    /* renamed from: b  reason: collision with root package name */
    int f35222b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ I f35223c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S(I i10) {
        this.f35223c = i10;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f35221a = true;
        this.f35222b = i10;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.AbstractC3867w, java.util.Iterator, j$.util.AbstractC3725i
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (f0.f35345a) {
            f0.a(S.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new C3864t(consumer));
    }

    @Override // j$.util.AbstractC3867w
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f35221a) {
            this.f35223c.tryAdvance((IntConsumer) this);
        }
        return this.f35221a;
    }

    @Override // j$.util.AbstractC3867w, java.util.Iterator
    public final Integer next() {
        if (!f0.f35345a) {
            return Integer.valueOf(nextInt());
        }
        f0.a(S.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.AbstractC3867w
    public final int nextInt() {
        if (this.f35221a || hasNext()) {
            this.f35221a = false;
            return this.f35222b;
        }
        throw new NoSuchElementException();
    }
}
