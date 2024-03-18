package yh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: yh.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6630p implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC6632q f51066Y;

    public C6630p(AbstractC6632q abstractC6632q) {
        this.f51066Y = abstractC6632q;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f51066Y != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            try {
                AbstractC6632q abstractC6632q = this.f51066Y;
                this.f51066Y = abstractC6632q.L();
                return abstractC6632q;
            } catch (Throwable th2) {
                this.f51066Y = this.f51066Y.L();
                throw th2;
            }
        }
        throw new NoSuchElementException("End of type hierarchy");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
