package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import xf.AbstractC6438a;

/* renamed from: kotlin.jvm.internal.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4303b implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final float[] f37634Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f37635Z;

    public C4303b(float[] fArr) {
        this.f37634Y = fArr;
    }

    /* renamed from: a */
    public final Object next() {
        try {
            float[] fArr = this.f37634Y;
            int i10 = this.f37635Z;
            this.f37635Z = i10 + 1;
            return Float.valueOf(fArr[i10]);
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f37635Z--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f37635Z < this.f37634Y.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        b();
        throw null;
    }
}
