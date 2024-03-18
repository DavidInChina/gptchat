package kf;

import java.util.Iterator;
import xf.AbstractC6438a;

/* renamed from: kf.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4266B implements Iterator, AbstractC6438a {
    public abstract long a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
