package J7;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public abstract class n implements ListIterator, Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8892Y;

    public n(int i10) {
        this.f8892Y = i10;
    }

    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f8892Y) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        switch (this.f8892Y) {
            case 0:
                a();
                throw null;
            default:
                b();
                throw null;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f8892Y) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
