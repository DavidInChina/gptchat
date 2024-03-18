package Z;

import id.AbstractC3557B;
import j0.AbstractC3884I;

/* loaded from: classes.dex */
public final class T0 extends AbstractC3884I {

    /* renamed from: c  reason: collision with root package name */
    public int f22570c;

    public T0(int i10) {
        this.f22570c = i10;
    }

    @Override // j0.AbstractC3884I
    public final void a(AbstractC3884I abstractC3884I) {
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord", abstractC3884I);
        this.f22570c = ((T0) abstractC3884I).f22570c;
    }

    @Override // j0.AbstractC3884I
    public final AbstractC3884I b() {
        return new T0(this.f22570c);
    }
}
