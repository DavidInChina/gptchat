package j0;

import c0.AbstractC2275e;
import e0.C2741d;
import e0.C2743f;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kf.AbstractC4281f;
import xf.AbstractC6442e;

/* loaded from: classes.dex */
public final class x implements AbstractC3882G, Map, AbstractC6442e {

    /* renamed from: Y  reason: collision with root package name */
    public w f35937Y;

    /* renamed from: Z  reason: collision with root package name */
    public final q f35938Z = new q(this, 0);

    /* renamed from: h0  reason: collision with root package name */
    public final q f35939h0 = new q(this, 1);

    /* renamed from: i0  reason: collision with root package name */
    public final q f35940i0 = new q(this, 2);

    public x() {
        C2741d c2741d = C2741d.f28685h0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>", c2741d);
        this.f35937Y = new w(c2741d);
    }

    public final w a() {
        w wVar = this.f35937Y;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar);
        return (w) p.s(wVar, this);
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC3893i i10;
        w wVar = this.f35937Y;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar);
        C2741d c2741d = C2741d.f28685h0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>", c2741d);
        if (c2741d != ((w) p.h(wVar)).f35935c) {
            w wVar2 = this.f35937Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar2);
            synchronized (p.f35918b) {
                int i11 = AbstractC3893i.f35891e;
                i10 = p.i();
                w wVar3 = (w) p.v(wVar2, this, i10);
                synchronized (y.f35941a) {
                    wVar3.f35935c = c2741d;
                    wVar3.f35936d++;
                }
            }
            p.m(i10, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a().f35935c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return a().f35935c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f35938Z;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return a().f35935c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((AbstractC4281f) a().f35935c).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f35939h0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c0.f fVar;
        int i10;
        Object put;
        AbstractC3893i i11;
        boolean z10;
        do {
            Object obj3 = y.f35941a;
            synchronized (obj3) {
                w wVar = this.f35937Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar);
                w wVar2 = (w) p.h(wVar);
                fVar = wVar2.f35935c;
                i10 = wVar2.f35936d;
            }
            AbstractC3557B.Z(fVar);
            C2743f c2743f = (C2743f) fVar.builder();
            put = c2743f.put(obj, obj2);
            c0.f f6 = c2743f.f();
            if (AbstractC3557B.K(f6, fVar)) {
                break;
            }
            w wVar3 = this.f35937Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar3);
            synchronized (p.f35918b) {
                int i12 = AbstractC3893i.f35891e;
                i11 = p.i();
                w wVar4 = (w) p.v(wVar3, this, i11);
                synchronized (obj3) {
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
            p.m(i11, this);
        } while (!z10);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c0.f fVar;
        int i10;
        AbstractC3893i i11;
        boolean z10;
        do {
            Object obj = y.f35941a;
            synchronized (obj) {
                w wVar = this.f35937Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar);
                w wVar2 = (w) p.h(wVar);
                fVar = wVar2.f35935c;
                i10 = wVar2.f35936d;
            }
            AbstractC3557B.Z(fVar);
            C2743f c2743f = (C2743f) fVar.builder();
            c2743f.putAll(map);
            c0.f f6 = c2743f.f();
            if (!AbstractC3557B.K(f6, fVar)) {
                w wVar3 = this.f35937Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar3);
                synchronized (p.f35918b) {
                    int i12 = AbstractC3893i.f35891e;
                    i11 = p.i();
                    w wVar4 = (w) p.v(wVar3, this, i11);
                    synchronized (obj) {
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
                p.m(i11, this);
            } else {
                return;
            }
        } while (!z10);
    }

    @Override // j0.AbstractC3882G
    public final AbstractC3884I r() {
        return this.f35937Y;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c0.f fVar;
        int i10;
        Object remove;
        AbstractC3893i i11;
        boolean z10;
        do {
            Object obj2 = y.f35941a;
            synchronized (obj2) {
                w wVar = this.f35937Y;
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar);
                w wVar2 = (w) p.h(wVar);
                fVar = wVar2.f35935c;
                i10 = wVar2.f35936d;
            }
            AbstractC3557B.Z(fVar);
            AbstractC2275e builder = fVar.builder();
            remove = builder.remove(obj);
            c0.f f6 = builder.f();
            if (AbstractC3557B.K(f6, fVar)) {
                break;
            }
            w wVar3 = this.f35937Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", wVar3);
            synchronized (p.f35918b) {
                int i12 = AbstractC3893i.f35891e;
                i11 = p.i();
                w wVar4 = (w) p.v(wVar3, this, i11);
                synchronized (obj2) {
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
            p.m(i11, this);
        } while (!z10);
        return remove;
    }

    @Override // j0.AbstractC3882G
    public final /* synthetic */ AbstractC3884I s(AbstractC3884I abstractC3884I, AbstractC3884I abstractC3884I2, AbstractC3884I abstractC3884I3) {
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        AbstractC4281f abstractC4281f = (AbstractC4281f) a().f35935c;
        abstractC4281f.getClass();
        return ((C2741d) abstractC4281f).f28687Z;
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f35940i0;
    }

    @Override // j0.AbstractC3882G
    public final void y(AbstractC3884I abstractC3884I) {
        this.f35937Y = (w) abstractC3884I;
    }
}
