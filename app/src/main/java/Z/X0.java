package Z;

import id.AbstractC3557B;
import j0.AbstractC3884I;

/* loaded from: classes2.dex */
public final class X0 extends AbstractC3884I {

    /* renamed from: c  reason: collision with root package name */
    public Object f22587c;

    public X0(Object obj) {
        this.f22587c = obj;
    }

    @Override // j0.AbstractC3884I
    public final void a(AbstractC3884I abstractC3884I) {
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>", abstractC3884I);
        this.f22587c = ((X0) abstractC3884I).f22587c;
    }

    @Override // j0.AbstractC3884I
    public final AbstractC3884I b() {
        return new X0(this.f22587c);
    }
}
