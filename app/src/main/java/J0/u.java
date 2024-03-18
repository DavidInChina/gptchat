package j0;

import c0.AbstractC2274d;
import d0.AbstractC2565c;
import d0.C2564b;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kf.AbstractC4276a;
import xf.AbstractC6440c;

/* loaded from: classes.dex */
public final class u implements AbstractC3882G, List, RandomAccess, AbstractC6440c {

    /* renamed from: Y  reason: collision with root package name */
    public t f35933Y = new t(d0.j.f27840Z);

    public final t I() {
        t tVar = this.f35933Y;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
        return (t) p.s(tVar, this);
    }

    public final int M() {
        t tVar = this.f35933Y;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
        return ((t) p.h(tVar)).f35932e;
    }

    public final boolean T(wf.k kVar) {
        int i10;
        AbstractC2274d abstractC2274d;
        Object invoke;
        AbstractC3893i i11;
        boolean z10;
        do {
            Object obj = v.f35934a;
            synchronized (obj) {
                t tVar = this.f35933Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f35931d;
                abstractC2274d = tVar2.f35930c;
            }
            AbstractC3557B.Z(abstractC2274d);
            d0.f builder = abstractC2274d.builder();
            invoke = kVar.invoke(builder);
            AbstractC2274d y10 = builder.y();
            if (AbstractC3557B.K(y10, abstractC2274d)) {
                break;
            }
            t tVar3 = this.f35933Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar3);
            synchronized (p.f35918b) {
                int i12 = AbstractC3893i.f35891e;
                i11 = p.i();
                t tVar4 = (t) p.v(tVar3, this, i11);
                synchronized (obj) {
                    int i13 = tVar4.f35931d;
                    if (i13 == i10) {
                        tVar4.f35930c = y10;
                        tVar4.f35931d = i13 + 1;
                        z10 = true;
                        tVar4.f35932e++;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.m(i11, this);
        } while (!z10);
        return ((Boolean) invoke).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        AbstractC2274d abstractC2274d;
        boolean z10;
        AbstractC3893i i11;
        do {
            Object obj2 = v.f35934a;
            synchronized (obj2) {
                t tVar = this.f35933Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f35931d;
                abstractC2274d = tVar2.f35930c;
            }
            AbstractC3557B.Z(abstractC2274d);
            AbstractC2274d add = abstractC2274d.add(obj);
            z10 = false;
            if (AbstractC3557B.K(add, abstractC2274d)) {
                return false;
            }
            t tVar3 = this.f35933Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar3);
            synchronized (p.f35918b) {
                int i12 = AbstractC3893i.f35891e;
                i11 = p.i();
                t tVar4 = (t) p.v(tVar3, this, i11);
                synchronized (obj2) {
                    int i13 = tVar4.f35931d;
                    if (i13 == i10) {
                        tVar4.f35930c = add;
                        tVar4.f35932e++;
                        tVar4.f35931d = i13 + 1;
                        z10 = true;
                    }
                }
            }
            p.m(i11, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return T(new E.J(i10, collection, 1));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC3893i i10;
        t tVar = this.f35933Y;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
        synchronized (p.f35918b) {
            int i11 = AbstractC3893i.f35891e;
            i10 = p.i();
            t tVar2 = (t) p.v(tVar, this, i10);
            synchronized (v.f35934a) {
                tVar2.f35930c = d0.j.f27840Z;
                tVar2.f35931d++;
                tVar2.f35932e++;
            }
        }
        p.m(i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return ((AbstractC2565c) I().f35930c).contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((AbstractC2565c) I().f35930c).containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return I().f35930c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return I().f35930c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return ((AbstractC4276a) I().f35930c).isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return I().f35930c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C3878C(this, 0);
    }

    @Override // j0.AbstractC3882G
    public final AbstractC3884I r() {
        return this.f35933Y;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        AbstractC2274d abstractC2274d;
        AbstractC3893i i12;
        boolean z10;
        Object obj = get(i10);
        do {
            Object obj2 = v.f35934a;
            synchronized (obj2) {
                t tVar = this.f35933Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
                t tVar2 = (t) p.h(tVar);
                i11 = tVar2.f35931d;
                abstractC2274d = tVar2.f35930c;
            }
            AbstractC3557B.Z(abstractC2274d);
            AbstractC2274d Z10 = abstractC2274d.Z(i10);
            if (AbstractC3557B.K(Z10, abstractC2274d)) {
                break;
            }
            t tVar3 = this.f35933Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar3);
            synchronized (p.f35918b) {
                int i13 = AbstractC3893i.f35891e;
                i12 = p.i();
                t tVar4 = (t) p.v(tVar3, this, i12);
                synchronized (obj2) {
                    int i14 = tVar4.f35931d;
                    if (i14 == i11) {
                        tVar4.f35930c = Z10;
                        z10 = true;
                        tVar4.f35932e++;
                        tVar4.f35931d = i14 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.m(i12, this);
        } while (!z10);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        AbstractC2274d abstractC2274d;
        boolean z10;
        AbstractC3893i i11;
        do {
            Object obj = v.f35934a;
            synchronized (obj) {
                t tVar = this.f35933Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f35931d;
                abstractC2274d = tVar2.f35930c;
            }
            AbstractC3557B.Z(abstractC2274d);
            z10 = false;
            AbstractC2274d P = ((AbstractC2565c) abstractC2274d).P(new C2564b(0, collection));
            if (AbstractC3557B.K(P, abstractC2274d)) {
                return false;
            }
            t tVar3 = this.f35933Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar3);
            synchronized (p.f35918b) {
                int i12 = AbstractC3893i.f35891e;
                i11 = p.i();
                t tVar4 = (t) p.v(tVar3, this, i11);
                synchronized (obj) {
                    int i13 = tVar4.f35931d;
                    if (i13 == i10) {
                        tVar4.f35930c = P;
                        tVar4.f35932e++;
                        tVar4.f35931d = i13 + 1;
                        z10 = true;
                    }
                }
            }
            p.m(i11, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return T(new C2564b(2, collection));
    }

    @Override // j0.AbstractC3882G
    public final /* synthetic */ AbstractC3884I s(AbstractC3884I abstractC3884I, AbstractC3884I abstractC3884I2, AbstractC3884I abstractC3884I3) {
        return null;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        AbstractC2274d abstractC2274d;
        AbstractC3893i i12;
        boolean z10;
        Object obj2 = get(i10);
        do {
            Object obj3 = v.f35934a;
            synchronized (obj3) {
                t tVar = this.f35933Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
                t tVar2 = (t) p.h(tVar);
                i11 = tVar2.f35931d;
                abstractC2274d = tVar2.f35930c;
            }
            AbstractC3557B.Z(abstractC2274d);
            AbstractC2274d abstractC2274d2 = abstractC2274d.set(i10, obj);
            if (AbstractC3557B.K(abstractC2274d2, abstractC2274d)) {
                break;
            }
            t tVar3 = this.f35933Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar3);
            synchronized (p.f35918b) {
                int i13 = AbstractC3893i.f35891e;
                i12 = p.i();
                t tVar4 = (t) p.v(tVar3, this, i12);
                synchronized (obj3) {
                    int i14 = tVar4.f35931d;
                    if (i14 == i11) {
                        tVar4.f35930c = abstractC2274d2;
                        tVar4.f35931d = i14 + 1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.m(i12, this);
        } while (!z10);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ((AbstractC4276a) I().f35930c).r();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11 && i11 <= size()) {
            return new K(this, i10, i11);
        }
        throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.m.J(this);
    }

    @Override // j0.AbstractC3882G
    public final void y(AbstractC3884I abstractC3884I) {
        abstractC3884I.f35855b = this.f35933Y;
        this.f35933Y = (t) abstractC3884I;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        AbstractC2274d abstractC2274d;
        boolean z10;
        AbstractC3893i i11;
        do {
            Object obj = v.f35934a;
            synchronized (obj) {
                t tVar = this.f35933Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f35931d;
                abstractC2274d = tVar2.f35930c;
            }
            AbstractC3557B.Z(abstractC2274d);
            AbstractC2274d addAll = abstractC2274d.addAll(collection);
            z10 = false;
            if (AbstractC3557B.K(addAll, abstractC2274d)) {
                return false;
            }
            t tVar3 = this.f35933Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar3);
            synchronized (p.f35918b) {
                int i12 = AbstractC3893i.f35891e;
                i11 = p.i();
                t tVar4 = (t) p.v(tVar3, this, i11);
                synchronized (obj) {
                    int i13 = tVar4.f35931d;
                    if (i13 == i10) {
                        tVar4.f35930c = addAll;
                        tVar4.f35932e++;
                        tVar4.f35931d = i13 + 1;
                        z10 = true;
                    }
                }
            }
            p.m(i11, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C3878C(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.m.K(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        AbstractC2274d abstractC2274d;
        AbstractC3893i i12;
        boolean z10;
        do {
            Object obj2 = v.f35934a;
            synchronized (obj2) {
                t tVar = this.f35933Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
                t tVar2 = (t) p.h(tVar);
                i11 = tVar2.f35931d;
                abstractC2274d = tVar2.f35930c;
            }
            AbstractC3557B.Z(abstractC2274d);
            AbstractC2274d add = abstractC2274d.add(i10, obj);
            if (AbstractC3557B.K(add, abstractC2274d)) {
                return;
            }
            t tVar3 = this.f35933Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar3);
            synchronized (p.f35918b) {
                int i13 = AbstractC3893i.f35891e;
                i12 = p.i();
                t tVar4 = (t) p.v(tVar3, this, i12);
                synchronized (obj2) {
                    int i14 = tVar4.f35931d;
                    if (i14 == i11) {
                        tVar4.f35930c = add;
                        z10 = true;
                        tVar4.f35932e++;
                        tVar4.f35931d = i14 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.m(i12, this);
        } while (!z10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        AbstractC2274d abstractC2274d;
        boolean z10;
        AbstractC3893i i11;
        do {
            Object obj2 = v.f35934a;
            synchronized (obj2) {
                t tVar = this.f35933Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar);
                t tVar2 = (t) p.h(tVar);
                i10 = tVar2.f35931d;
                abstractC2274d = tVar2.f35930c;
            }
            AbstractC3557B.Z(abstractC2274d);
            AbstractC2565c abstractC2565c = (AbstractC2565c) abstractC2274d;
            int indexOf = abstractC2565c.indexOf(obj);
            AbstractC2274d abstractC2274d2 = abstractC2565c;
            if (indexOf != -1) {
                abstractC2274d2 = abstractC2565c.Z(indexOf);
            }
            z10 = false;
            if (AbstractC3557B.K(abstractC2274d2, abstractC2274d)) {
                return false;
            }
            t tVar3 = this.f35933Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>", tVar3);
            synchronized (p.f35918b) {
                int i12 = AbstractC3893i.f35891e;
                i11 = p.i();
                t tVar4 = (t) p.v(tVar3, this, i11);
                synchronized (obj2) {
                    int i13 = tVar4.f35931d;
                    if (i13 == i10) {
                        tVar4.f35930c = abstractC2274d2;
                        tVar4.f35932e++;
                        tVar4.f35931d = i13 + 1;
                        z10 = true;
                    }
                }
            }
            p.m(i11, this);
        } while (!z10);
        return true;
    }
}
