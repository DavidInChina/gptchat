package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: io.sentry.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3643f implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public int f34330Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f34331Z = -1;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f34332h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C3646g f34333i0;

    public C3643f(C3646g c3646g) {
        this.f34333i0 = c3646g;
        this.f34330Y = c3646g.f34342Z;
        this.f34332h0 = c3646g.f34344i0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f34332h0 && this.f34330Y == this.f34333i0.f34343h0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i10 = 0;
            this.f34332h0 = false;
            int i11 = this.f34330Y;
            this.f34331Z = i11;
            int i12 = i11 + 1;
            C3646g c3646g = this.f34333i0;
            if (i12 < c3646g.f34345j0) {
                i10 = i12;
            }
            this.f34330Y = i10;
            return c3646g.f34341Y[i11];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        int i11 = this.f34331Z;
        if (i11 != -1) {
            C3646g c3646g = this.f34333i0;
            int i12 = c3646g.f34342Z;
            if (i11 == i12) {
                c3646g.remove();
                this.f34331Z = -1;
                return;
            }
            int i13 = i11 + 1;
            int i14 = c3646g.f34345j0;
            if (i12 < i11 && i13 < (i10 = c3646g.f34343h0)) {
                Object[] objArr = c3646g.f34341Y;
                System.arraycopy(objArr, i13, objArr, i11, i10 - i13);
            } else {
                while (i13 != c3646g.f34343h0) {
                    if (i13 >= i14) {
                        Object[] objArr2 = c3646g.f34341Y;
                        objArr2[i13 - 1] = objArr2[0];
                    } else {
                        Object[] objArr3 = c3646g.f34341Y;
                        int i15 = i13 - 1;
                        if (i15 < 0) {
                            i15 = i14 - 1;
                        }
                        objArr3[i15] = objArr3[i13];
                        i13++;
                        if (i13 >= i14) {
                        }
                    }
                    i13 = 0;
                }
            }
            this.f34331Z = -1;
            int i16 = c3646g.f34343h0 - 1;
            if (i16 < 0) {
                i16 = i14 - 1;
            }
            c3646g.f34343h0 = i16;
            c3646g.f34341Y[i16] = null;
            c3646g.f34344i0 = false;
            int i17 = this.f34330Y - 1;
            if (i17 < 0) {
                i17 = i14 - 1;
            }
            this.f34330Y = i17;
            return;
        }
        throw new IllegalStateException();
    }
}
