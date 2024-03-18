package j0;

import c0.AbstractC2274d;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kf.AbstractC4265A;
import xf.AbstractC6440c;

/* loaded from: classes.dex */
public final class K implements List, AbstractC6440c {

    /* renamed from: Y  reason: collision with root package name */
    public final u f35859Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f35860Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f35861h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f35862i0;

    public K(u uVar, int i10, int i11) {
        this.f35859Y = uVar;
        this.f35860Z = i10;
        this.f35861h0 = uVar.M();
        this.f35862i0 = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        r();
        int i10 = this.f35860Z + this.f35862i0;
        u uVar = this.f35859Y;
        uVar.add(i10, obj);
        this.f35862i0++;
        this.f35861h0 = uVar.M();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f35862i0, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10;
        AbstractC2274d abstractC2274d;
        AbstractC3893i i11;
        boolean z10;
        if (this.f35862i0 > 0) {
            r();
            u uVar = this.f35859Y;
            int i12 = this.f35860Z;
            int i13 = this.f35862i0 + i12;
            uVar.getClass();
            do {
                Object obj = v.f35934a;
                synchronized (obj) {
                    t tVar = uVar.f35933Y;
                    AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
                    t tVar2 = (t) p.h(tVar);
                    i10 = tVar2.f35931d;
                    abstractC2274d = tVar2.f35930c;
                }
                AbstractC3557B.Z(abstractC2274d);
                d0.f builder = abstractC2274d.builder();
                builder.subList(i12, i13).clear();
                AbstractC2274d y10 = builder.y();
                if (AbstractC3557B.K(y10, abstractC2274d)) {
                    break;
                }
                t tVar3 = uVar.f35933Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar3);
                synchronized (p.f35918b) {
                    int i14 = AbstractC3893i.f35891e;
                    i11 = p.i();
                    t tVar4 = (t) p.v(tVar3, uVar, i11);
                    synchronized (obj) {
                        int i15 = tVar4.f35931d;
                        if (i15 == i10) {
                            tVar4.f35930c = y10;
                            tVar4.f35931d = i15 + 1;
                            z10 = true;
                            tVar4.f35932e++;
                        } else {
                            z10 = false;
                        }
                    }
                }
                p.m(i11, uVar);
            } while (!z10);
            this.f35862i0 = 0;
            this.f35861h0 = this.f35859Y.M();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection<Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        r();
        v.a(i10, this.f35862i0);
        return this.f35859Y.get(this.f35860Z + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        r();
        int i10 = this.f35862i0;
        int i11 = this.f35860Z;
        Iterator it = N.D0(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int a5 = ((AbstractC4265A) it).a();
            if (AbstractC3557B.K(obj, this.f35859Y.get(a5))) {
                return a5 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.f35862i0 == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        r();
        int i10 = this.f35862i0;
        int i11 = this.f35860Z;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (AbstractC3557B.K(obj, this.f35859Y.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void r() {
        if (this.f35859Y.M() == this.f35861h0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        while (true) {
            boolean z10 = false;
            for (Object obj : collection) {
                if (remove(obj) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        AbstractC2274d abstractC2274d;
        AbstractC3893i i11;
        boolean z10;
        r();
        u uVar = this.f35859Y;
        int i12 = this.f35860Z;
        int i13 = this.f35862i0 + i12;
        int size = uVar.size();
        do {
            Object obj = v.f35934a;
            synchronized (obj) {
                t tVar = uVar.f35933Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f35931d;
                abstractC2274d = tVar2.f35930c;
            }
            AbstractC3557B.Z(abstractC2274d);
            d0.f builder = abstractC2274d.builder();
            builder.subList(i12, i13).retainAll(collection);
            AbstractC2274d y10 = builder.y();
            if (AbstractC3557B.K(y10, abstractC2274d)) {
                break;
            }
            t tVar3 = uVar.f35933Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar3);
            synchronized (p.f35918b) {
                int i14 = AbstractC3893i.f35891e;
                i11 = p.i();
                t tVar4 = (t) p.v(tVar3, uVar, i11);
                synchronized (obj) {
                    int i15 = tVar4.f35931d;
                    if (i15 == i10) {
                        tVar4.f35930c = y10;
                        tVar4.f35931d = i15 + 1;
                        tVar4.f35932e++;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.m(i11, uVar);
        } while (!z10);
        int size2 = size - uVar.size();
        if (size2 > 0) {
            this.f35861h0 = this.f35859Y.M();
            this.f35862i0 -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        v.a(i10, this.f35862i0);
        r();
        int i11 = i10 + this.f35860Z;
        u uVar = this.f35859Y;
        Object obj2 = uVar.set(i11, obj);
        this.f35861h0 = uVar.M();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f35862i0;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11 && i11 <= this.f35862i0) {
            r();
            int i12 = this.f35860Z;
            return new K(this.f35859Y, i10 + i12, i11 + i12);
        }
        throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.m.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.m.K(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        r();
        int i11 = i10 + this.f35860Z;
        u uVar = this.f35859Y;
        boolean addAll = uVar.addAll(i11, collection);
        if (addAll) {
            this.f35862i0 = collection.size() + this.f35862i0;
            this.f35861h0 = uVar.M();
        }
        return addAll;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.z] */
    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        r();
        ?? obj = new Object();
        obj.f37647Y = i10 - 1;
        return new J((kotlin.jvm.internal.z) obj, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        r();
        int i11 = this.f35860Z + i10;
        u uVar = this.f35859Y;
        Object remove = uVar.remove(i11);
        this.f35862i0--;
        this.f35861h0 = uVar.M();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        r();
        int i11 = this.f35860Z + i10;
        u uVar = this.f35859Y;
        uVar.add(i11, obj);
        this.f35862i0++;
        this.f35861h0 = uVar.M();
    }
}
