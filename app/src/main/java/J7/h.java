package J7;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class h extends n {

    /* renamed from: Z  reason: collision with root package name */
    public final int f8881Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f8882h0;

    public h(int i10, int i11) {
        super(0);
        if (i11 >= 0 && i11 <= i10) {
            this.f8881Z = i10;
            this.f8882h0 = i11;
            return;
        }
        throw new IndexOutOfBoundsException(P4.a.Y0(i11, i10, "index"));
    }

    public abstract Object c(int i10);

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f8882h0 < this.f8881Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f8882h0 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f8882h0;
            this.f8882h0 = i10 + 1;
            return c(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8882h0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f8882h0 - 1;
            this.f8882h0 = i10;
            return c(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8882h0 - 1;
    }
}
