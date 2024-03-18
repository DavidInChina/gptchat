package jf;

import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import w.C6053E;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public final class x implements Collection, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final short[] f36176Y;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        short s10 = ((w) obj).f36175Y;
        short[] sArr = this.f36176Y;
        AbstractC3557B.c0("<this>", sArr);
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                if (i10 < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r5 < 0) goto L19;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        loop0: for (Object obj : collection2) {
            if (obj instanceof w) {
                short s10 = ((w) obj).f36175Y;
                short[] sArr = this.f36176Y;
                AbstractC3557B.c0("<this>", sArr);
                int length = sArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break loop0;
                    } else if (s10 == sArr[i10]) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f36176Y, ((x) obj).f36176Y)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f36176Y);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f36176Y.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6053E(this.f36176Y);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f36176Y.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.m.J(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f36176Y) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC3557B.c0("array", objArr);
        return kotlin.jvm.internal.m.K(this, objArr);
    }
}
