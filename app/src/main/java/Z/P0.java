package Z;

import java.util.Iterator;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public final class P0 implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public int f22536Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f22537Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Q0 f22538h0;

    public P0(int i10, int i11, Q0 q02) {
        this.f22537Z = i11;
        this.f22538h0 = q02;
        this.f22536Y = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22536Y < this.f22537Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Q0 q02 = this.f22538h0;
            Object[] objArr = q02.f22545c;
            int i10 = this.f22536Y;
            this.f22536Y = i10 + 1;
            return objArr[q02.g(i10)];
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
