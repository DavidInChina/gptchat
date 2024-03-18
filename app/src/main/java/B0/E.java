package B0;

import A.C0007a0;
import H0.C0714y;
import android.view.MotionEvent;
import androidx.compose.ui.node.Owner;
import b0.C2104h;

/* loaded from: classes2.dex */
public final class E extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1595Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c1.l f1596Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(c1.q qVar, int i10) {
        super(1);
        this.f1595Y = i10;
        this.f1596Z = qVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        boolean z10;
        C0714y c0714y;
        int i10 = this.f1595Y;
        c1.l lVar = this.f1596Z;
        switch (i10) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        z10 = lVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        z10 = lVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(z10);
            default:
                Owner owner = (Owner) obj;
                if (owner instanceof C0714y) {
                    c0714y = (C0714y) owner;
                } else {
                    c0714y = null;
                }
                if (c0714y != null) {
                    C0007a0 c0007a0 = new C0007a0(c0714y, 15, lVar);
                    C2104h c2104h = c0714y.f7124r1;
                    if (!c2104h.g(c0007a0)) {
                        c2104h.b(c0007a0);
                    }
                }
                lVar.removeAllViewsInLayout();
                return jf.y.f36177a;
        }
    }
}
