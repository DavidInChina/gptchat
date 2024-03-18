package x8;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class y0 implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public final Iterator f49633Y;

    public y0(Iterator it) {
        it.getClass();
        this.f49633Y = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49633Y.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f49633Y.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f49633Y.remove();
    }
}
