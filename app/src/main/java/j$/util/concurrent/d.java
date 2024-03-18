package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class d extends AbstractC3719a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f35307b;
        if (lVar != null) {
            Object obj = lVar.f35299b;
            Object obj2 = lVar.f35300c;
            this.f35287j = lVar;
            a();
            return new k(obj, obj2, this.f35286i);
        }
        throw new NoSuchElementException();
    }
}
