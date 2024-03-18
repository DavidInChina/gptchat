package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import q0.C5251c;

/* renamed from: W.i1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1563i1 implements A0.a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1568j1 f20132Y;

    public C1563i1(C1568j1 c1568j1) {
        this.f20132Y = c1568j1;
    }

    @Override // A0.a
    public final long F(int i10, long j6) {
        C1568j1 c1568j1 = this.f20132Y;
        int i11 = c1568j1.f20168a;
        if (((Boolean) c1568j1.f20170c.mo122invoke()).booleanValue() && C5251c.e(j6) <= 0.0f) {
            o4 o4Var = c1568j1.f20169b;
            float h10 = o4Var.f20268c.h();
            o4Var.d(C5251c.e(j6) + o4Var.f20268c.h());
            if (h10 == o4Var.f20268c.h()) {
                return C5251c.f43619b;
            }
            return C5251c.a(j6, 2);
        }
        return C5251c.f43619b;
    }

    @Override // A0.a
    public final Object T(long j6, AbstractC4825e abstractC4825e) {
        return new Z0.p(Z0.p.f22813b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    @Override // A0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(long j6, long j10, AbstractC4825e abstractC4825e) {
        C1558h1 c1558h1;
        Object obj;
        Object obj2;
        int i10;
        long j11;
        C1563i1 c1563i1;
        if (abstractC4825e instanceof C1558h1) {
            c1558h1 = (C1558h1) abstractC4825e;
            int i11 = c1558h1.f20114j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1558h1.f20114j0 = i11 - Integer.MIN_VALUE;
                obj = c1558h1.f20112h0;
                obj2 = EnumC5000a.f41328Y;
                i10 = c1558h1.f20114j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            j11 = c1558h1.f20111Z;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return new Z0.p(Z0.p.e(j11, ((Z0.p) obj).f22815a));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = c1558h1.f20111Z;
                    c1563i1 = c1558h1.f20110Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c1558h1.f20110Y = this;
                    c1558h1.f20111Z = j10;
                    c1558h1.f20114j0 = 1;
                    obj = new Z0.p(Z0.p.f22813b);
                    if (obj == obj2) {
                        return obj2;
                    }
                    c1563i1 = this;
                }
                long j12 = ((Z0.p) obj).f22815a;
                C1568j1 c1568j1 = c1563i1.f20132Y;
                int i12 = c1568j1.f20168a;
                float c10 = Z0.p.c(j10);
                C1568j1 c1568j12 = c1563i1.f20132Y;
                int i13 = c1568j12.f20168a;
                c1558h1.f20110Y = null;
                c1558h1.f20111Z = j12;
                c1558h1.f20114j0 = 2;
                obj = AbstractC1522a0.g(c1568j1.f20169b, c10, c1568j12.f20173f, c1568j12.f20172e, c1558h1);
                if (obj != obj2) {
                    return obj2;
                }
                j11 = j12;
                return new Z0.p(Z0.p.e(j11, ((Z0.p) obj).f22815a));
            }
        }
        c1558h1 = new C1558h1(this, abstractC4825e);
        obj = c1558h1.f20112h0;
        obj2 = EnumC5000a.f41328Y;
        i10 = c1558h1.f20114j0;
        if (i10 == 0) {
        }
        long j122 = ((Z0.p) obj).f22815a;
        C1568j1 c1568j13 = c1563i1.f20132Y;
        int i122 = c1568j13.f20168a;
        float c102 = Z0.p.c(j10);
        C1568j1 c1568j122 = c1563i1.f20132Y;
        int i132 = c1568j122.f20168a;
        c1558h1.f20110Y = null;
        c1558h1.f20111Z = j122;
        c1558h1.f20114j0 = 2;
        obj = AbstractC1522a0.g(c1568j13.f20169b, c102, c1568j122.f20173f, c1568j122.f20172e, c1558h1);
        if (obj != obj2) {
        }
    }

    @Override // A0.a
    public final long u(long j6, int i10, long j10) {
        C1568j1 c1568j1 = this.f20132Y;
        int i11 = c1568j1.f20168a;
        if (!((Boolean) c1568j1.f20170c.mo122invoke()).booleanValue()) {
            return C5251c.f43619b;
        }
        o4 o4Var = c1568j1.f20169b;
        o4Var.f20267b.i(C5251c.e(j6) + o4Var.f20267b.h());
        if (C5251c.e(j10) >= 0.0f && C5251c.e(j6) >= 0.0f) {
            if (C5251c.e(j6) == 0.0f && C5251c.e(j10) > 0.0f) {
                o4Var.f20267b.i(0.0f);
            }
            if (C5251c.e(j10) > 0.0f) {
                float h10 = o4Var.f20268c.h();
                o4Var.d(C5251c.e(j10) + o4Var.f20268c.h());
                return R4.b.r(0.0f, o4Var.f20268c.h() - h10);
            }
            return C5251c.f43619b;
        }
        float h11 = o4Var.f20268c.h();
        o4Var.d(C5251c.e(j6) + o4Var.f20268c.h());
        return R4.b.r(0.0f, o4Var.f20268c.h() - h11);
    }
}
