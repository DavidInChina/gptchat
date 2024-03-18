package z8;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: z8.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6779a extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final int[] f51755Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f51756Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f51757h0;

    public C6779a(int i10, int i11, int[] iArr) {
        this.f51755Y = iArr;
        this.f51756Z = i10;
        this.f51757h0 = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f51756Z;
            while (true) {
                if (i10 >= this.f51757h0) {
                    break;
                } else if (this.f51755Y[i10] == intValue) {
                    if (i10 != -1) {
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6779a) {
            C6779a c6779a = (C6779a) obj;
            int size = size();
            if (c6779a.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f51755Y[this.f51756Z + i10] != c6779a.f51755Y[c6779a.f51756Z + i10]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        P4.a.r(i10, size());
        return Integer.valueOf(this.f51755Y[this.f51756Z + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f51756Z; i11 < this.f51757h0; i11++) {
            i10 = (i10 * 31) + this.f51755Y[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f51756Z;
            int i11 = i10;
            while (true) {
                if (i11 < this.f51757h0) {
                    if (this.f51755Y[i11] == intValue) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i11 = this.f51757h0;
            while (true) {
                i11--;
                i10 = this.f51756Z;
                if (i11 >= i10) {
                    if (this.f51755Y[i11] == intValue) {
                        break;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        P4.a.r(i10, size());
        int i11 = this.f51756Z + i10;
        int[] iArr = this.f51755Y;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51757h0 - this.f51756Z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        P4.a.v(i10, i11, size());
        if (i10 == i11) {
            return Collections.emptyList();
        }
        int i12 = this.f51756Z;
        return new C6779a(i10 + i12, i12 + i11, this.f51755Y);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f51755Y;
        int i10 = this.f51756Z;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 < this.f51757h0) {
                sb2.append(", ");
                sb2.append(iArr[i10]);
            } else {
                sb2.append(']');
                return sb2.toString();
            }
        }
    }
}
