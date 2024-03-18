package kf;

import java.util.Iterator;
import xf.AbstractC6438a;

/* renamed from: kf.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4265A implements Iterator, AbstractC6438a {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
