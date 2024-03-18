package Ci;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public final CharSequence f3168Y;

    /* renamed from: Z  reason: collision with root package name */
    public final a f3169Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f3170h0 = 0;

    /* renamed from: i0  reason: collision with root package name */
    public Di.a f3171i0 = null;

    public b(CharSequence charSequence, a aVar) {
        this.f3168Y = charSequence;
        this.f3169Z = aVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3170h0 < this.f3168Y.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            if (this.f3171i0 == null) {
                a aVar = this.f3169Z;
                if (aVar.hasNext()) {
                    if (aVar.hasNext()) {
                        Di.a aVar2 = aVar.f3164Z;
                        aVar.f3164Z = null;
                        this.f3171i0 = aVar2;
                    } else {
                        throw new NoSuchElementException();
                    }
                } else {
                    int length = this.f3168Y.length();
                    Di.c cVar = new Di.c(this.f3170h0, length);
                    this.f3170h0 = length;
                    return cVar;
                }
            }
            int i10 = this.f3170h0;
            Di.a aVar3 = this.f3171i0;
            int i11 = aVar3.f3729b;
            if (i10 < i11) {
                Di.c cVar2 = new Di.c(i10, i11);
                this.f3170h0 = i11;
                return cVar2;
            }
            this.f3170h0 = aVar3.f3730c;
            this.f3171i0 = null;
            return aVar3;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
