package j0;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class w extends AbstractC3884I {

    /* renamed from: c  reason: collision with root package name */
    public c0.f f35935c;

    /* renamed from: d  reason: collision with root package name */
    public int f35936d;

    public w(c0.f fVar) {
        this.f35935c = fVar;
    }

    @Override // j0.AbstractC3884I
    public final void a(AbstractC3884I abstractC3884I) {
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>", abstractC3884I);
        w wVar = (w) abstractC3884I;
        synchronized (y.f35941a) {
            this.f35935c = wVar.f35935c;
            this.f35936d = wVar.f35936d;
        }
    }

    @Override // j0.AbstractC3884I
    public final AbstractC3884I b() {
        return new w(this.f35935c);
    }
}
