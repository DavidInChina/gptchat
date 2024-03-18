package B;

import q0.C5251c;

/* renamed from: B.f0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0123f0 implements X0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1313a;

    public /* synthetic */ C0123f0(int i10) {
        this.f1313a = i10;
    }

    public final float a(long j6) {
        switch (this.f1313a) {
            case 0:
                return C5251c.c(j6);
            case 1:
                return Math.abs(C5251c.d(j6));
            default:
                return Math.abs(C5251c.e(j6));
        }
    }

    public final long b(float f6, long j6) {
        switch (this.f1313a) {
            case 0:
                float a5 = a(j6);
                return C5251c.g(j6, C5251c.i(f6, R4.b.r(C5251c.d(j6) / a5, C5251c.e(j6) / a5)));
            case 1:
                return R4.b.r(C5251c.d(j6) - (Math.signum(C5251c.d(j6)) * f6), C5251c.e(j6));
            default:
                return R4.b.r(C5251c.d(j6), C5251c.e(j6) - (Math.signum(C5251c.e(j6)) * f6));
        }
    }
}
