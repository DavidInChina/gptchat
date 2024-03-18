package lg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: lg.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4445C implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
