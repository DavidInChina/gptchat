package x8;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: x8.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6357a extends com.google.android.gms.internal.play_billing.C implements ListIterator {

    /* renamed from: Z  reason: collision with root package name */
    public final int f49539Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f49540h0;

    public AbstractC6357a(int i10, int i11) {
        super(1);
        P4.a.u(i11, i10);
        this.f49539Z = i10;
        this.f49540h0 = i11;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        b(obj);
        throw null;
    }

    public final void b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object c(int i10);

    public final void d(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f49540h0 < this.f49539Z) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f49540h0 > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f49540h0;
            this.f49540h0 = i10 + 1;
            return c(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f49540h0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f49540h0 - 1;
            this.f49540h0 = i10;
            return c(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f49540h0 - 1;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        d(obj);
        throw null;
    }
}
