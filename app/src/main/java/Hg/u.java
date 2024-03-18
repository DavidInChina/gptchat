package Hg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import xf.AbstractC6438a;

/* loaded from: classes2.dex */
public final class u implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7791Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f7792Z = true;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f7793h0;

    public /* synthetic */ u(int i10, Object obj) {
        this.f7791Y = i10;
        this.f7793h0 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7791Y) {
            case 0:
                return this.f7792Z;
            default:
                return this.f7792Z;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f7791Y;
        Object obj = this.f7793h0;
        switch (i10) {
            case 0:
                if (this.f7792Z) {
                    this.f7792Z = false;
                    return ((v) obj).f7794Y;
                }
                throw new NoSuchElementException();
            default:
                if (this.f7792Z) {
                    this.f7792Z = false;
                    return obj;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7791Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
