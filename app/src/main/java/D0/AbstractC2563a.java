package d0;

import java.util.ListIterator;
import xf.AbstractC6438a;

/* renamed from: d0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2563a implements ListIterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public int f27816Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f27817Z;

    public AbstractC2563a(int i10, int i11) {
        this.f27816Y = i10;
        this.f27817Z = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f27816Y < this.f27817Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f27816Y > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27816Y;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27816Y - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
