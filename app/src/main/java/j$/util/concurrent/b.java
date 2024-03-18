package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap f35288a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ConcurrentHashMap concurrentHashMap) {
        this.f35288a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f35288a.clear();
    }

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean containsAll(Collection collection) {
        if (collection != this) {
            for (Object obj : collection) {
                if (obj == null || !contains(obj)) {
                    return false;
                }
                while (r2.hasNext()) {
                }
            }
            return true;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f35288a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        l[] lVarArr = this.f35288a.f35273a;
        boolean z10 = false;
        if (lVarArr == null) {
            return false;
        }
        if (!(collection instanceof Set) || collection.size() <= lVarArr.length) {
            for (Object obj : collection) {
                z10 |= remove(obj);
            }
        } else {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f35288a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long j6 = this.f35288a.j();
        if (j6 < 0) {
            j6 = 0;
        }
        if (j6 <= 2147483639) {
            int i10 = (int) j6;
            Object[] objArr = new Object[i10];
            Iterator it = iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i11 == i10) {
                    int i12 = 2147483639;
                    if (i10 >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    if (i10 < 1073741819) {
                        i12 = (i10 >>> 1) + 1 + i10;
                    }
                    objArr = Arrays.copyOf(objArr, i12);
                    i10 = i12;
                }
                objArr[i11] = next;
                i11++;
            }
            return i11 == i10 ? objArr : Arrays.copyOf(objArr, i11);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long j6 = this.f35288a.j();
        if (j6 < 0) {
            j6 = 0;
        }
        if (j6 <= 2147483639) {
            int i10 = (int) j6;
            Object[] objArr2 = objArr.length >= i10 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
            int length = objArr2.length;
            Iterator it = iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i11 == length) {
                    int i12 = 2147483639;
                    if (length >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    if (length < 1073741819) {
                        i12 = (length >>> 1) + 1 + length;
                    }
                    objArr2 = Arrays.copyOf(objArr2, i12);
                    length = i12;
                }
                objArr2[i11] = next;
                i11++;
            }
            if (objArr != objArr2 || i11 >= length) {
                return i11 == length ? objArr2 : Arrays.copyOf(objArr2, i11);
            }
            objArr2[i11] = null;
            return objArr2;
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb2.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
