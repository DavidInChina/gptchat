package Kg;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l8.AbstractC4344b;
import wf.AbstractC6216a;
import xf.AbstractC6438a;

/* loaded from: classes2.dex */
public final class i implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9831Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f9832Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f9833h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ k f9834i0;

    public i(j jVar) {
        this.f9831Y = 2;
        this.f9834i0 = jVar;
        this.f9833h0 = ((k) jVar.f9837c).iterator();
    }

    public final void a() {
        Object obj;
        int i10;
        int i11 = this.f9832Z;
        j jVar = (j) this.f9834i0;
        if (i11 == -2) {
            obj = ((AbstractC6216a) jVar.f9837c).mo122invoke();
        } else {
            Object obj2 = this.f9833h0;
            AbstractC3557B.Z(obj2);
            obj = ((wf.k) jVar.f9836b).invoke(obj2);
        }
        this.f9833h0 = obj;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f9832Z = i10;
    }

    public final void b() {
        while (this.f9832Z < ((r) this.f9834i0).f9848b && ((Iterator) this.f9833h0).hasNext()) {
            ((Iterator) this.f9833h0).next();
            this.f9832Z++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9831Y) {
            case 0:
                if (this.f9832Z < 0) {
                    a();
                }
                if (this.f9832Z != 1) {
                    return false;
                }
                return true;
            case 1:
                b();
                if (this.f9832Z >= ((r) this.f9834i0).f9849c || !((Iterator) this.f9833h0).hasNext()) {
                    return false;
                }
                return true;
            default:
                return ((Iterator) this.f9833h0).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f9831Y;
        k kVar = this.f9834i0;
        switch (i10) {
            case 0:
                if (this.f9832Z < 0) {
                    a();
                }
                if (this.f9832Z != 0) {
                    Object obj = this.f9833h0;
                    AbstractC3557B.a0("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj);
                    this.f9832Z = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            case 1:
                b();
                int i11 = this.f9832Z;
                if (i11 < ((r) kVar).f9849c) {
                    this.f9832Z = i11 + 1;
                    return ((Iterator) this.f9833h0).next();
                }
                throw new NoSuchElementException();
            default:
                wf.n nVar = (wf.n) ((j) kVar).f9836b;
                int i12 = this.f9832Z;
                this.f9832Z = i12 + 1;
                if (i12 >= 0) {
                    return nVar.invoke(Integer.valueOf(i12), ((Iterator) this.f9833h0).next());
                }
                AbstractC4344b.d1();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9831Y) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(r rVar) {
        this.f9831Y = 1;
        this.f9834i0 = rVar;
        this.f9833h0 = rVar.f9847a.iterator();
    }

    public i(j jVar, int i10) {
        this.f9831Y = 0;
        this.f9834i0 = jVar;
        this.f9832Z = -2;
    }
}
