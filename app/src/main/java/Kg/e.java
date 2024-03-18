package Kg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import xf.AbstractC6438a;

/* loaded from: classes2.dex */
public final class e implements Iterator, AbstractC6438a {

    /* renamed from: Z  reason: collision with root package name */
    public final Iterator f9817Z;

    /* renamed from: i0  reason: collision with root package name */
    public Object f9819i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ k f9820j0;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9816Y = 0;

    /* renamed from: h0  reason: collision with root package name */
    public int f9818h0 = -1;

    public e(f fVar) {
        this.f9820j0 = fVar;
        this.f9817Z = fVar.f9821a.iterator();
    }

    public final void a() {
        Object next;
        k kVar;
        do {
            Iterator it = this.f9817Z;
            if (it.hasNext()) {
                next = it.next();
                kVar = this.f9820j0;
            } else {
                this.f9818h0 = 0;
                return;
            }
        } while (((Boolean) ((f) kVar).f9823c.invoke(next)).booleanValue() != ((f) kVar).f9822b);
        this.f9819i0 = next;
        this.f9818h0 = 1;
    }

    public final void b() {
        Iterator it = this.f9817Z;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((wf.k) ((j) this.f9820j0).f9836b).invoke(next)).booleanValue()) {
                this.f9818h0 = 1;
                this.f9819i0 = next;
                return;
            }
        }
        this.f9818h0 = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9816Y) {
            case 0:
                if (this.f9818h0 == -1) {
                    a();
                }
                if (this.f9818h0 != 1) {
                    return false;
                }
                return true;
            default:
                if (this.f9818h0 == -1) {
                    b();
                }
                if (this.f9818h0 != 1) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9816Y) {
            case 0:
                if (this.f9818h0 == -1) {
                    a();
                }
                if (this.f9818h0 != 0) {
                    Object obj = this.f9819i0;
                    this.f9819i0 = null;
                    this.f9818h0 = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                if (this.f9818h0 == -1) {
                    b();
                }
                if (this.f9818h0 != 0) {
                    Object obj2 = this.f9819i0;
                    this.f9819i0 = null;
                    this.f9818h0 = -1;
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9816Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(j jVar) {
        this.f9820j0 = jVar;
        this.f9817Z = ((k) jVar.f9837c).iterator();
    }
}
