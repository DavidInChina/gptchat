package f0;

import e0.C2741d;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import xf.AbstractC6438a;

/* renamed from: f0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2932c implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public Object f29519Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Map f29520Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f29521h0;

    public C2932c(Object obj, C2741d c2741d) {
        this.f29519Y = obj;
        this.f29520Z = c2741d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f29521h0 < this.f29520Z.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object obj = this.f29519Y;
            this.f29521h0++;
            Object obj2 = this.f29520Z.get(obj);
            if (obj2 != null) {
                this.f29519Y = ((C2930a) obj2).f29514b;
                return obj;
            }
            throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
