package F;

import B.W0;
import Z.AbstractC1725n;
import Z.C1723m;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a  reason: collision with root package name */
    public static final float f4902a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final z f4903b = new z(null, 0, false, 0.0f, new K(0), 0.0f, false, kf.v.f37483Y, 0, 0, 0, W0.f1213Y, 0, 0);

    public static final J a(int i10, AbstractC1725n abstractC1725n, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(1470655220);
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        i0.r rVar2 = J.f4870A;
        rVar.W(2079514038);
        boolean e10 = rVar.e(i10) | rVar.e(0);
        Object K10 = rVar.K();
        if (e10 || K10 == C1723m.f22654Y) {
            K10 = new L(i10, 0);
            rVar.h0(K10);
        }
        rVar.t(false);
        J j6 = (J) Ad.l.Y0(objArr, rVar2, (AbstractC6216a) K10, rVar, 4);
        rVar.t(false);
        return j6;
    }
}
