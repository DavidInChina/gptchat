package W;

import Z.AbstractC1725n;

/* renamed from: W.y1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1642y1 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f20630a = X.u.f21633a;

    public static C1637x1 a(long j6, long j10, long j11, AbstractC1725n abstractC1725n, int i10) {
        long j12;
        long j13;
        long j14;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-352515689);
        if ((i10 & 1) != 0) {
            float f6 = X.u.f21633a;
            j12 = R0.e(35, rVar);
        } else {
            j12 = j6;
        }
        if ((i10 & 2) != 0) {
            j13 = R0.e(X.u.f21648p, rVar);
        } else {
            j13 = j10;
        }
        if ((i10 & 4) != 0) {
            j14 = R0.e(X.u.f21649q, rVar);
        } else {
            j14 = j11;
        }
        C1637x1 c1637x1 = new C1637x1(j12, j13, j14, R0.e(X.u.f21650r, rVar), R0.e(X.u.f21651s, rVar), R0.e(X.u.f21652t, rVar), r0.r.b(R0.e(X.u.f21645m, rVar), X.u.f21634b), r0.r.b(R0.e(X.u.f21646n, rVar), X.u.f21635c), r0.r.b(R0.e(X.u.f21647o, rVar), X.u.f21636d));
        rVar.t(false);
        return c1637x1;
    }
}
