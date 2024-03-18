package W;

import X.AbstractC1667a;

/* renamed from: W.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1527b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f19925a = AbstractC1667a.f21475a;

    public static A0 a(P0 p02) {
        A0 a02 = p02.Q;
        if (a02 == null) {
            long j6 = r0.r.f44262j;
            long d10 = R0.d(p02, AbstractC1667a.f21482h);
            int i10 = AbstractC1667a.f21484j;
            long d11 = R0.d(p02, i10);
            long d12 = R0.d(p02, i10);
            long b10 = r0.r.b(R0.d(p02, 18), 0.38f);
            int i11 = AbstractC1667a.f21483i;
            A0 a03 = new A0(j6, d10, d11, d12, j6, b10, r0.r.b(R0.d(p02, i11), 0.38f), r0.r.b(R0.d(p02, i11), 0.38f));
            p02.Q = a03;
            return a03;
        }
        return a02;
    }
}
