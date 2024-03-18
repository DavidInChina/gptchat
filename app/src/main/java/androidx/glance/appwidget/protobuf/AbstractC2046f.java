package androidx.glance.appwidget.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.glance.appwidget.protobuf.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2046f implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        C2045e c2045e = (C2045e) this;
        int i10 = c2045e.f25210Y;
        if (i10 < c2045e.f25211Z) {
            c2045e.f25210Y = i10 + 1;
            return Byte.valueOf(c2045e.f25212h0.I(i10));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
