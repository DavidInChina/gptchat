package Ig;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f8597Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f8598Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ f f8599h0;

    public e(f fVar) {
        int i10;
        this.f8599h0 = fVar;
        i10 = ((AbstractList) fVar).modCount;
        this.f8598Z = i10;
    }

    public final void a() {
        int i10;
        int i11;
        f fVar = this.f8599h0;
        i10 = ((AbstractList) fVar).modCount;
        int i12 = this.f8598Z;
        if (i10 == i12) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("ModCount: ");
        i11 = ((AbstractList) fVar).modCount;
        sb2.append(i11);
        sb2.append("; expected: ");
        sb2.append(i12);
        throw new ConcurrentModificationException(sb2.toString());
    }

    /* renamed from: b */
    public final Object next() {
        if (!this.f8597Y) {
            this.f8597Y = true;
            a();
            return this.f8599h0.f8601Z;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f8597Y;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f8599h0.clear();
    }
}
