package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q implements Iterator, Consumer {

    /* renamed from: a  reason: collision with root package name */
    boolean f35218a = false;

    /* renamed from: b  reason: collision with root package name */
    Object f35219b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Spliterator f35220c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(Spliterator spliterator) {
        this.f35220c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f35218a = true;
        this.f35219b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f35218a) {
            this.f35220c.tryAdvance(this);
        }
        return this.f35218a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f35218a || hasNext()) {
            this.f35218a = false;
            return this.f35219b;
        }
        throw new NoSuchElementException();
    }
}
