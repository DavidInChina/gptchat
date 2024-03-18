package Cf;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.NoSuchElementException;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public final class b implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final int f3100Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f3101Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3102h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3103i0;

    public b(char c10, char c11, int i10) {
        this.f3100Y = i10;
        this.f3101Z = c11;
        boolean z10 = true;
        if (i10 <= 0 ? AbstractC3557B.e0(c10, c11) < 0 : AbstractC3557B.e0(c10, c11) > 0) {
            z10 = false;
        }
        this.f3102h0 = z10;
        this.f3103i0 = !z10 ? c11 : c10;
    }

    /* renamed from: a */
    public final Object next() {
        int i10 = this.f3103i0;
        if (i10 == this.f3101Z) {
            if (this.f3102h0) {
                this.f3102h0 = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f3103i0 = this.f3100Y + i10;
        }
        return Character.valueOf((char) i10);
    }

    public final void b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3102h0;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        b();
        throw null;
    }
}
