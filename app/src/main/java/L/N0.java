package L;

import B.W0;
import Z.C1718j0;
import Z.C1724m0;
import Z.o1;
import nf.AbstractC4828h;
import q0.C5252d;

/* loaded from: classes2.dex */
public final class N0 {

    /* renamed from: f  reason: collision with root package name */
    public static final i0.r f10004f = AbstractC4828h.X(M0.f9999Y, C0868q.f10276s0);

    /* renamed from: a  reason: collision with root package name */
    public final C1718j0 f10005a;

    /* renamed from: b  reason: collision with root package name */
    public final C1718j0 f10006b = Df.H.h0(0.0f);

    /* renamed from: c  reason: collision with root package name */
    public C5252d f10007c = C5252d.f43624e;

    /* renamed from: d  reason: collision with root package name */
    public long f10008d = N0.D.f12483b;

    /* renamed from: e  reason: collision with root package name */
    public final C1724m0 f10009e;

    public N0(W0 w02, float f6) {
        this.f10005a = Df.H.h0(f6);
        this.f10009e = AbstractC4828h.Z(w02, o1.f22665a);
    }

    public final void a(W0 w02, C5252d c5252d, int i10, int i11) {
        boolean z10;
        float f6;
        float f10;
        int i12;
        float f11 = i11 - i10;
        this.f10006b.i(f11);
        C5252d c5252d2 = this.f10007c;
        float f12 = c5252d2.f43625a;
        float f13 = c5252d.f43625a;
        int i13 = (f13 > f12 ? 1 : (f13 == f12 ? 0 : -1));
        C1718j0 c1718j0 = this.f10005a;
        float f14 = c5252d.f43626b;
        if (i13 != 0 || f14 != c5252d2.f43626b) {
            if (w02 == W0.f1213Y) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f13 = f14;
            }
            if (z10) {
                f6 = c5252d.f43628d;
            } else {
                f6 = c5252d.f43627c;
            }
            float h10 = c1718j0.h();
            float f15 = i10;
            float f16 = h10 + f15;
            if (f6 > f16 || (f13 < h10 && f6 - f13 > f15)) {
                f10 = f6 - f16;
            } else if (i12 < 0 && f6 - f13 <= f15) {
                f10 = f13 - h10;
            } else {
                f10 = 0.0f;
            }
            c1718j0.i(c1718j0.h() + f10);
            this.f10007c = c5252d;
        }
        c1718j0.i(com.google.android.gms.internal.play_billing.N.o(c1718j0.h(), 0.0f, f11));
    }
}
