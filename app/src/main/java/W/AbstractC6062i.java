package w;

import java.util.Iterator;
import java.util.NoSuchElementException;
import xf.AbstractC6438a;

/* renamed from: w.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6062i implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public int f47591Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f47592Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f47593h0;

    public AbstractC6062i(int i10) {
        this.f47591Y = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f47592Z < this.f47591Y) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        if (hasNext()) {
            int i10 = this.f47592Z;
            C6055b c6055b = (C6055b) this;
            int i11 = c6055b.f47573i0;
            Object obj2 = c6055b.f47574j0;
            switch (i11) {
                case 0:
                    obj = ((C6059f) obj2).g(i10);
                    break;
                case 1:
                    obj = ((C6059f) obj2).j(i10);
                    break;
                default:
                    obj = ((C6060g) obj2).f47585Z[i10];
                    break;
            }
            this.f47592Z++;
            this.f47593h0 = true;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f47593h0) {
            int i10 = this.f47592Z - 1;
            this.f47592Z = i10;
            C6055b c6055b = (C6055b) this;
            int i11 = c6055b.f47573i0;
            Object obj = c6055b.f47574j0;
            switch (i11) {
                case 0:
                    ((C6059f) obj).h(i10);
                    break;
                case 1:
                    ((C6059f) obj).h(i10);
                    break;
                default:
                    ((C6060g) obj).r(i10);
                    break;
            }
            this.f47591Y--;
            this.f47593h0 = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.".toString());
    }
}
