package c1;

import G0.r0;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26065Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f26066Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(q qVar, int i10) {
        super(0);
        this.f26065Y = i10;
        this.f26066Z = qVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        r0 snapshotObserver;
        int i10 = this.f26065Y;
        l lVar = this.f26066Z;
        switch (i10) {
            case 0:
                lVar.getLayoutNode().M();
                return;
            default:
                if (!lVar.f26075l0 || !lVar.isAttachedToWindow()) {
                    return;
                }
                snapshotObserver = lVar.getSnapshotObserver();
                snapshotObserver.a(lVar, e.f26044Z, lVar.getUpdate());
                return;
        }
    }
}
