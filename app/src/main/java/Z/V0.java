package Z;

import id.AbstractC3557B;
import j0.AbstractC3884I;

/* loaded from: classes.dex */
public final class V0 extends AbstractC3884I {

    /* renamed from: c  reason: collision with root package name */
    public long f22577c;

    public V0(long j6) {
        this.f22577c = j6;
    }

    @Override // j0.AbstractC3884I
    public final void a(AbstractC3884I abstractC3884I) {
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord", abstractC3884I);
        this.f22577c = ((V0) abstractC3884I).f22577c;
    }

    @Override // j0.AbstractC3884I
    public final AbstractC3884I b() {
        return new V0(this.f22577c);
    }
}
