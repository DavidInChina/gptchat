package H0;

import A.C0007a0;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes2.dex */
public final class L extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6773Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ O f6774Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(O o10, int i10) {
        super(1);
        this.f6773Y = i10;
        this.f6774Z = o10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f6773Y;
        O o10 = this.f6774Z;
        switch (i10) {
            case 0:
                return Boolean.valueOf(o10.f6818i0.getParent().requestSendAccessibilityEvent(o10.f6818i0, (AccessibilityEvent) obj));
            default:
                R0 r02 = (R0) obj;
                o10.getClass();
                if (r02.f6872Z.contains(r02)) {
                    o10.f6818i0.getSnapshotObserver().a(r02, o10.f6816T0, new C0007a0(r02, 16, o10));
                }
                return jf.y.f36177a;
        }
    }
}
