package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2438b extends J7.n {

    /* renamed from: Z  reason: collision with root package name */
    public final int f26897Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f26898h0;

    public AbstractC2438b(int i10, int i11) {
        super(1);
        A7.b.Z1(i11, i10);
        this.f26897Z = i10;
        this.f26898h0 = i11;
    }

    public abstract Object c(int i10);

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f26898h0 < this.f26897Z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f26898h0 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f26898h0;
            this.f26898h0 = i10 + 1;
            return c(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f26898h0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f26898h0 - 1;
            this.f26898h0 = i10;
            return c(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f26898h0 - 1;
    }
}
