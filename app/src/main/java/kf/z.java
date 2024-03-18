package kf;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l8.AbstractC4344b;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public final class z implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37488Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final Iterator f37489Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f37490h0;

    public z(Iterator it) {
        AbstractC3557B.c0("iterator", it);
        this.f37489Z = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f37488Y;
        Iterator it = this.f37489Z;
        switch (i10) {
            case 0:
                return it.hasNext();
            case 1:
                break;
            default:
                if (this.f37490h0 > 0 && it.hasNext()) {
                    return true;
                }
                return false;
        }
        while (this.f37490h0 > 0 && it.hasNext()) {
            it.next();
            this.f37490h0--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f37488Y;
        Iterator it = this.f37489Z;
        switch (i10) {
            case 0:
                int i11 = this.f37490h0;
                this.f37490h0 = i11 + 1;
                if (i11 >= 0) {
                    return new y(i11, it.next());
                }
                AbstractC4344b.d1();
                throw null;
            case 1:
                break;
            default:
                int i12 = this.f37490h0;
                if (i12 != 0) {
                    this.f37490h0 = i12 - 1;
                    return it.next();
                }
                throw new NoSuchElementException();
        }
        while (this.f37490h0 > 0 && it.hasNext()) {
            it.next();
            this.f37490h0--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f37488Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(Kg.b bVar, int i10) {
        this.f37490h0 = bVar.f9814c;
        this.f37489Z = bVar.f9813b.iterator();
    }

    public z(Kg.b bVar) {
        this.f37489Z = bVar.f9813b.iterator();
        this.f37490h0 = bVar.f9814c;
    }
}
