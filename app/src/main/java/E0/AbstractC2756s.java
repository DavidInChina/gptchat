package e0;

import java.util.Iterator;
import xf.AbstractC6438a;

/* renamed from: e0.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2756s implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public Object[] f28715Y = C2755r.f28710e.f28714d;

    /* renamed from: Z  reason: collision with root package name */
    public int f28716Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f28717h0;

    public final void a(int i10, int i11, Object[] objArr) {
        this.f28715Y = objArr;
        this.f28716Z = i10;
        this.f28717h0 = i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f28717h0 < this.f28716Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
