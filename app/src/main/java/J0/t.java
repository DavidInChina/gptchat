package j0;

import c0.AbstractC2274d;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class t extends AbstractC3884I {

    /* renamed from: c  reason: collision with root package name */
    public AbstractC2274d f35930c;

    /* renamed from: d  reason: collision with root package name */
    public int f35931d;

    /* renamed from: e  reason: collision with root package name */
    public int f35932e;

    public t(AbstractC2274d abstractC2274d) {
        this.f35930c = abstractC2274d;
    }

    @Override // j0.AbstractC3884I
    public final void a(AbstractC3884I abstractC3884I) {
        synchronized (v.f35934a) {
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>", abstractC3884I);
            this.f35930c = ((t) abstractC3884I).f35930c;
            this.f35931d = ((t) abstractC3884I).f35931d;
            this.f35932e = ((t) abstractC3884I).f35932e;
        }
    }

    @Override // j0.AbstractC3884I
    public final AbstractC3884I b() {
        return new t(this.f35930c);
    }
}
