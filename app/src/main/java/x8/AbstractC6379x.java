package x8;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: x8.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6379x implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public int f49625Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f49626Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f49627h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C6356A f49628i0;

    public AbstractC6379x(C6356A c6356a) {
        int i10;
        this.f49628i0 = c6356a;
        this.f49625Y = c6356a.f49502j0;
        if (c6356a.isEmpty()) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        this.f49626Z = i10;
        this.f49627h0 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f49626Z >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C6380y c6380y;
        C6356A c6356a = this.f49628i0;
        if (c6356a.f49502j0 == this.f49625Y) {
            if (hasNext()) {
                int i10 = this.f49626Z;
                this.f49627h0 = i10;
                C6377v c6377v = (C6377v) this;
                int i11 = c6377v.f49620j0;
                C6356A c6356a2 = c6377v.f49621k0;
                switch (i11) {
                    case 0:
                        c6380y = c6356a2.j()[i10];
                        break;
                    case 1:
                        c6380y = new C6380y(c6356a2, i10);
                        break;
                    default:
                        c6380y = c6356a2.k()[i10];
                        break;
                }
                int i12 = this.f49626Z + 1;
                if (i12 >= c6356a.f49503k0) {
                    i12 = -1;
                }
                this.f49626Z = i12;
                return c6380y;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C6356A c6356a = this.f49628i0;
        int i10 = c6356a.f49502j0;
        int i11 = this.f49625Y;
        if (i10 == i11) {
            int i12 = this.f49627h0;
            if (i12 >= 0) {
                this.f49625Y = i11 + 32;
                c6356a.remove(c6356a.j()[i12]);
                this.f49626Z--;
                this.f49627h0 = -1;
                return;
            }
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        throw new ConcurrentModificationException();
    }
}
