package d0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends AbstractC2563a {

    /* renamed from: h0  reason: collision with root package name */
    public final Object[] f27820h0;

    public d(int i10, int i11, Object[] objArr) {
        super(i10, i11);
        this.f27820h0 = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f27816Y;
            this.f27816Y = i10 + 1;
            return this.f27820h0[i10];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f27816Y - 1;
            this.f27816Y = i10;
            return this.f27820h0[i10];
        }
        throw new NoSuchElementException();
    }
}
