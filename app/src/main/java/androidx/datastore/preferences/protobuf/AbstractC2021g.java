package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2021g implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        C2019f c2019f = (C2019f) this;
        int i10 = c2019f.f25049Y;
        if (i10 < c2019f.f25050Z) {
            c2019f.f25049Y = i10 + 1;
            return Byte.valueOf(c2019f.f25051h0.I(i10));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
