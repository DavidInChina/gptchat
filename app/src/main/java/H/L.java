package H;

import B.W0;
import Z.AbstractC1725n;
import Z.C1723m;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public abstract class L {

    /* renamed from: a  reason: collision with root package name */
    public static final float f6581a = 56;

    /* renamed from: b  reason: collision with root package name */
    public static final x f6582b = new x(kf.v.f37483Y, 0, 0, 0, W0.f1214Z, 0, 0, 0, null, null, 0.0f, 0, false, new F.K(1), false);

    /* renamed from: c  reason: collision with root package name */
    public static final J f6583c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final A9.a f6584d = new A9.a(1);

    public static final I a(int i10, H h10, AbstractC1725n abstractC1725n) {
        i0.r rVar;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-1210768637);
        Object[] objArr = new Object[0];
        switch (I.f6575E.f29664Y) {
            case 14:
                rVar = I.f6576F;
                break;
            default:
                rVar = i0.j.f32420e;
                break;
        }
        rVar2.W(1614659192);
        boolean e10 = rVar2.e(i10) | rVar2.d(0.0f) | rVar2.i(h10);
        Object K10 = rVar2.K();
        if (e10 || K10 == C1723m.f22654Y) {
            K10 = new K(i10, 0.0f, h10);
            rVar2.h0(K10);
        }
        rVar2.t(false);
        I i11 = (I) Ad.l.Y0(objArr, rVar, (AbstractC6216a) K10, rVar2, 4);
        i11.f6577D.setValue(h10);
        rVar2.t(false);
        return i11;
    }
}
