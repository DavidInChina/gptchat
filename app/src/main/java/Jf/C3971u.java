package jf;

import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import w.C6053E;
import xf.AbstractC6438a;

/* renamed from: jf.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3971u implements Collection, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final long[] f36173Y;

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
        if (!(obj instanceof C3970t)) {
            return false;
        }
        long j6 = ((C3970t) obj).f36172Y;
        long[] jArr = this.f36173Y;
        AbstractC3557B.c0("<this>", jArr);
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j6 == jArr[i10]) {
                if (i10 < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r6 < 0) goto L19;
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
            if (obj instanceof C3970t) {
                long j6 = ((C3970t) obj).f36172Y;
                long[] jArr = this.f36173Y;
                AbstractC3557B.c0("<this>", jArr);
                int length = jArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break loop0;
                    } else if (j6 == jArr[i10]) {
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
        if (!(obj instanceof C3971u)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f36173Y, ((C3971u) obj).f36173Y)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f36173Y);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f36173Y.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6053E(this.f36173Y);
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
        return this.f36173Y.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.m.J(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f36173Y) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC3557B.c0("array", objArr);
        return kotlin.jvm.internal.m.K(this, objArr);
    }
}
