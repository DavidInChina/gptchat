package H0;

import android.os.SystemClock;
import android.view.MotionEvent;
import wf.AbstractC6216a;

/* renamed from: H0.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0710w extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7057Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0714y f7058Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0710w(C0714y c0714y, int i10) {
        super(0);
        this.f7057Y = i10;
        this.f7058Z = c0714y;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int actionMasked;
        C0699q c0699q;
        int i10 = this.f7057Y;
        C0714y c0714y = this.f7058Z;
        switch (i10) {
            case 0:
                MotionEvent motionEvent = c0714y.f7118o1;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c0714y.f7120p1 = SystemClock.uptimeMillis();
                    c0714y.post(c0714y.f7126s1);
                }
                return jf.y.f36177a;
            default:
                c0699q = c0714y.get_viewTreeOwners();
                return c0699q;
        }
    }
}
