package d0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends AbstractC2563a {

    /* renamed from: h0  reason: collision with root package name */
    public final Object f27839h0;

    public i(int i10, Object obj) {
        super(i10, 1);
        this.f27839h0 = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f27816Y++;
            return this.f27839h0;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.f27816Y--;
            return this.f27839h0;
        }
        throw new NoSuchElementException();
    }
}
