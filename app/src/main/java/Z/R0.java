package Z;

import id.AbstractC3557B;
import j0.AbstractC3884I;

/* loaded from: classes.dex */
public final class R0 extends AbstractC3884I {

    /* renamed from: c  reason: collision with root package name */
    public float f22565c;

    public R0(float f6) {
        this.f22565c = f6;
    }

    @Override // j0.AbstractC3884I
    public final void a(AbstractC3884I abstractC3884I) {
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord", abstractC3884I);
        this.f22565c = ((R0) abstractC3884I).f22565c;
    }

    @Override // j0.AbstractC3884I
    public final AbstractC3884I b() {
        return new R0(this.f22565c);
    }
}
