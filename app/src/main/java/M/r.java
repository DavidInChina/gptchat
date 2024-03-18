package m;

import D1.C0358j0;
import D1.Z;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class r implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38789Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ LayoutInflater$Factory2C4511H f38790Z;

    public /* synthetic */ r(LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H, int i10) {
        this.f38789Y = i10;
        this.f38790Z = layoutInflater$Factory2C4511H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (D1.K.c(r1) != false) goto L14;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10 = true;
        int i10 = this.f38789Y;
        LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = this.f38790Z;
        switch (i10) {
            case 0:
                if ((1 & layoutInflater$Factory2C4511H.f38646f1) != 0) {
                    layoutInflater$Factory2C4511H.u(0);
                }
                if ((layoutInflater$Factory2C4511H.f38646f1 & 4096) != 0) {
                    layoutInflater$Factory2C4511H.u(108);
                }
                layoutInflater$Factory2C4511H.f38645e1 = false;
                layoutInflater$Factory2C4511H.f38646f1 = 0;
                return;
            default:
                layoutInflater$Factory2C4511H.f38617B0.showAtLocation(layoutInflater$Factory2C4511H.f38616A0, 55, 0, 0);
                C0358j0 c0358j0 = layoutInflater$Factory2C4511H.f38619D0;
                if (c0358j0 != null) {
                    c0358j0.b();
                }
                if (layoutInflater$Factory2C4511H.f38621F0 && (r1 = layoutInflater$Factory2C4511H.f38622G0) != null) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    break;
                }
                z10 = false;
                if (z10) {
                    layoutInflater$Factory2C4511H.f38616A0.setAlpha(0.0f);
                    C0358j0 a5 = Z.a(layoutInflater$Factory2C4511H.f38616A0);
                    a5.a(1.0f);
                    layoutInflater$Factory2C4511H.f38619D0 = a5;
                    a5.d(new C4540u(0, this));
                    return;
                }
                layoutInflater$Factory2C4511H.f38616A0.setAlpha(1.0f);
                layoutInflater$Factory2C4511H.f38616A0.setVisibility(0);
                return;
        }
    }
}
