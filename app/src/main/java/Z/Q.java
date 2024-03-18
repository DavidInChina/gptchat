package Z;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public final class Q implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final N0 f22539Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f22540Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f22541h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f22542i0;

    public Q(int i10, int i11, N0 n02) {
        this.f22539Y = n02;
        this.f22540Z = i11;
        this.f22541h0 = i10;
        this.f22542i0 = n02.f22526l0;
        if (!n02.f22525k0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22541h0 < this.f22540Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        N0 n02 = this.f22539Y;
        int i10 = n02.f22526l0;
        int i11 = this.f22542i0;
        if (i10 == i11) {
            int i12 = this.f22541h0;
            this.f22541h0 = M3.H.m(n02.f22520Y, i12) + i12;
            return new O0(i12, i11, n02);
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
