package j0;

import c0.AbstractC2273c;
import c0.AbstractC2275e;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kf.AbstractC4281f;
import xf.AbstractC6438a;
import xf.AbstractC6441d;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f35928Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(x xVar, int i10) {
        super(xVar);
        this.f35928Z = i10;
    }

    private boolean r(Collection collection) {
        c0.f fVar;
        int i10;
        boolean z10;
        AbstractC3893i i11;
        Collection<Map.Entry> collection2 = collection;
        int n02 = P4.a.n0(AbstractC6583a.H1(collection2, 10));
        if (n02 < 16) {
            n02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        x xVar = this.f35929Y;
        boolean z11 = false;
        do {
            synchronized (y.f35941a) {
                w wVar = xVar.f35937Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar);
                w wVar2 = (w) p.h(wVar);
                fVar = wVar2.f35935c;
                i10 = wVar2.f35936d;
            }
            AbstractC3557B.Z(fVar);
            AbstractC2275e builder = fVar.builder();
            Iterator it = xVar.f35938Z.iterator();
            while (true) {
                z10 = true;
                if (!((AbstractC3881F) it).hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((C3880E) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC3557B.K(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder.remove(entry2.getKey());
                    z11 = true;
                }
            }
            c0.f f6 = builder.f();
            if (AbstractC3557B.K(f6, fVar)) {
                break;
            }
            w wVar3 = xVar.f35937Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar3);
            synchronized (p.f35918b) {
                int i12 = AbstractC3893i.f35891e;
                i11 = p.i();
                w wVar4 = (w) p.v(wVar3, xVar, i11);
                synchronized (y.f35941a) {
                    int i13 = wVar4.f35936d;
                    if (i13 == i10) {
                        wVar4.f35935c = f6;
                        wVar4.f35936d = i13 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.m(i11, xVar);
        } while (!z10);
        return z11;
    }

    private boolean s(Collection collection) {
        c0.f fVar;
        int i10;
        boolean z10;
        AbstractC3893i i11;
        Set P22 = kf.t.P2(collection);
        x xVar = this.f35929Y;
        boolean z11 = false;
        do {
            synchronized (y.f35941a) {
                w wVar = xVar.f35937Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar);
                w wVar2 = (w) p.h(wVar);
                fVar = wVar2.f35935c;
                i10 = wVar2.f35936d;
            }
            AbstractC3557B.Z(fVar);
            AbstractC2275e builder = fVar.builder();
            Iterator it = xVar.f35938Z.iterator();
            while (true) {
                z10 = true;
                if (!((AbstractC3881F) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((C3880E) it).next();
                if (!P22.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z11 = true;
                }
            }
            c0.f f6 = builder.f();
            if (AbstractC3557B.K(f6, fVar)) {
                break;
            }
            w wVar3 = xVar.f35937Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar3);
            synchronized (p.f35918b) {
                int i12 = AbstractC3893i.f35891e;
                i11 = p.i();
                w wVar4 = (w) p.v(wVar3, xVar, i11);
                synchronized (y.f35941a) {
                    int i13 = wVar4.f35936d;
                    if (i13 == i10) {
                        wVar4.f35935c = f6;
                        wVar4.f35936d = i13 + 1;
                    } else {
                        z10 = false;
                    }
                }
            }
            p.m(i11, xVar);
        } while (!z10);
        return z11;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i10 = this.f35928Z;
        switch (i10) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                y.a();
                throw null;
            case 1:
                switch (i10) {
                    case 1:
                        y.a();
                        throw null;
                    default:
                        y.a();
                        throw null;
                }
            default:
                switch (i10) {
                    case 1:
                        y.a();
                        throw null;
                    default:
                        y.a();
                        throw null;
                }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10 = this.f35928Z;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        y.a();
                        throw null;
                    case 1:
                        y.a();
                        throw null;
                    default:
                        y.a();
                        throw null;
                }
            case 1:
                switch (i10) {
                    case 0:
                        y.a();
                        throw null;
                    case 1:
                        y.a();
                        throw null;
                    default:
                        y.a();
                        throw null;
                }
            default:
                switch (i10) {
                    case 0:
                        y.a();
                        throw null;
                    case 1:
                        y.a();
                        throw null;
                    default:
                        y.a();
                        throw null;
                }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f35928Z;
        x xVar = this.f35929Y;
        switch (i10) {
            case 0:
                if ((obj instanceof Map.Entry) && (!(obj instanceof AbstractC6438a) || (obj instanceof AbstractC6441d))) {
                    Map.Entry entry = (Map.Entry) obj;
                    return AbstractC3557B.K(xVar.get(entry.getKey()), entry.getValue());
                }
                return false;
            case 1:
                return xVar.containsKey(obj);
            default:
                return xVar.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i10 = this.f35928Z;
        x xVar = this.f35929Y;
        switch (i10) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    for (Map.Entry entry : collection2) {
                        if (!contains(entry)) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection<Object> collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    for (Object obj : collection3) {
                        if (!xVar.containsKey(obj)) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection<Object> collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    for (Object obj2 : collection4) {
                        if (!xVar.containsValue(obj2)) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f35928Z;
        x xVar = this.f35929Y;
        switch (i10) {
            case 0:
                return new C3880E(xVar, ((AbstractC2273c) ((AbstractC4281f) xVar.a().f35935c).entrySet()).iterator(), 0);
            case 1:
                return new C3880E(xVar, ((AbstractC2273c) ((AbstractC4281f) xVar.a().f35935c).entrySet()).iterator(), 1);
            default:
                return new C3880E(xVar, ((AbstractC2273c) ((AbstractC4281f) xVar.a().f35935c).entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        int i10 = this.f35928Z;
        x xVar = this.f35929Y;
        switch (i10) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                if (((obj instanceof AbstractC6438a) && !(obj instanceof AbstractC6441d)) || xVar.remove(((Map.Entry) obj).getKey()) == null) {
                    return false;
                }
                return true;
            case 1:
                if (xVar.remove(obj) == null) {
                    return false;
                }
                return true;
            default:
                Iterator it = xVar.f35938Z.iterator();
                while (true) {
                    if (((AbstractC3881F) it).hasNext()) {
                        obj2 = ((C3880E) it).next();
                        if (AbstractC3557B.K(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry == null) {
                    return false;
                }
                xVar.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        c0.f fVar;
        int i10;
        AbstractC3893i i11;
        boolean z10;
        switch (this.f35928Z) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z11 = false;
                    while (it.hasNext()) {
                        if (this.f35929Y.remove(((Map.Entry) it.next()).getKey()) != null || z11) {
                            z11 = true;
                        }
                    }
                    return z11;
                    break;
                }
                break;
            case 1:
                while (true) {
                    boolean z12 = false;
                    for (Object obj : collection) {
                        if (this.f35929Y.remove(obj) != null || z12) {
                            z12 = true;
                        }
                    }
                    return z12;
                    break;
                }
                break;
            default:
                Set P22 = kf.t.P2(collection);
                x xVar = this.f35929Y;
                boolean z13 = false;
                do {
                    synchronized (y.f35941a) {
                        w wVar = xVar.f35937Y;
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar);
                        w wVar2 = (w) p.h(wVar);
                        fVar = wVar2.f35935c;
                        i10 = wVar2.f35936d;
                    }
                    AbstractC3557B.Z(fVar);
                    AbstractC2275e builder = fVar.builder();
                    Iterator it2 = xVar.f35938Z.iterator();
                    while (((AbstractC3881F) it2).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C3880E) it2).next();
                        if (P22.contains(entry.getValue())) {
                            builder.remove(entry.getKey());
                            z13 = true;
                        }
                    }
                    c0.f f6 = builder.f();
                    if (!AbstractC3557B.K(f6, fVar)) {
                        w wVar3 = xVar.f35937Y;
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar3);
                        synchronized (p.f35918b) {
                            int i12 = AbstractC3893i.f35891e;
                            i11 = p.i();
                            w wVar4 = (w) p.v(wVar3, xVar, i11);
                            synchronized (y.f35941a) {
                                int i13 = wVar4.f35936d;
                                if (i13 == i10) {
                                    wVar4.f35935c = f6;
                                    wVar4.f35936d = i13 + 1;
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                        }
                        p.m(i11, xVar);
                    }
                    return z13;
                } while (!z10);
                return z13;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        c0.f fVar;
        int i10;
        boolean z10;
        AbstractC3893i i11;
        switch (this.f35928Z) {
            case 0:
                return r(collection);
            case 1:
                return s(collection);
            default:
                Set P22 = kf.t.P2(collection);
                x xVar = this.f35929Y;
                boolean z11 = false;
                do {
                    synchronized (y.f35941a) {
                        w wVar = xVar.f35937Y;
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar);
                        w wVar2 = (w) p.h(wVar);
                        fVar = wVar2.f35935c;
                        i10 = wVar2.f35936d;
                    }
                    AbstractC3557B.Z(fVar);
                    AbstractC2275e builder = fVar.builder();
                    Iterator it = xVar.f35938Z.iterator();
                    while (true) {
                        z10 = true;
                        if (((AbstractC3881F) it).hasNext()) {
                            Map.Entry entry = (Map.Entry) ((C3880E) it).next();
                            if (!P22.contains(entry.getValue())) {
                                builder.remove(entry.getKey());
                                z11 = true;
                            }
                        } else {
                            c0.f f6 = builder.f();
                            if (!AbstractC3557B.K(f6, fVar)) {
                                w wVar3 = xVar.f35937Y;
                                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar3);
                                synchronized (p.f35918b) {
                                    int i12 = AbstractC3893i.f35891e;
                                    i11 = p.i();
                                    w wVar4 = (w) p.v(wVar3, xVar, i11);
                                    synchronized (y.f35941a) {
                                        int i13 = wVar4.f35936d;
                                        if (i13 == i10) {
                                            wVar4.f35935c = f6;
                                            wVar4.f35936d = i13 + 1;
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                }
                                p.m(i11, xVar);
                            }
                            return z11;
                        }
                    }
                } while (!z10);
                return z11;
        }
    }
}
