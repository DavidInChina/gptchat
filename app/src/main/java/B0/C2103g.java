package b0;

import java.util.List;
import java.util.ListIterator;
import xf.AbstractC6438a;

/* renamed from: b0.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2103g implements ListIterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final List f25565Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f25566Z;

    public C2103g(int i10, List list) {
        this.f25565Y = list;
        this.f25566Z = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f25565Y.add(this.f25566Z, obj);
        this.f25566Z++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f25566Z < this.f25565Y.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f25566Z > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i10 = this.f25566Z;
        this.f25566Z = i10 + 1;
        return this.f25565Y.get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25566Z;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i10 = this.f25566Z - 1;
        this.f25566Z = i10;
        return this.f25565Y.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25566Z - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i10 = this.f25566Z - 1;
        this.f25566Z = i10;
        this.f25565Y.remove(i10);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f25565Y.set(this.f25566Z, obj);
    }
}
