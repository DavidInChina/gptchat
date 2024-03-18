package B;

import nf.AbstractC4825e;
import of.EnumC5000a;
import q0.C5251c;

/* renamed from: B.q1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0157q1 implements A0.a {

    /* renamed from: Y  reason: collision with root package name */
    public final A1 f1466Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f1467Z;

    public C0157q1(A1 a12, boolean z10) {
        this.f1466Y = a12;
        this.f1467Z = z10;
    }

    @Override // A0.a
    public final long F(int i10, long j6) {
        if (Ad.l.k0(i10, 2)) {
            this.f1466Y.f1028g.setValue(Boolean.TRUE);
        }
        return C5251c.f43619b;
    }

    @Override // A0.a
    public final Object T(long j6, AbstractC4825e abstractC4825e) {
        return new Z0.p(Z0.p.f22813b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // A0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(long j6, long j10, AbstractC4825e abstractC4825e) {
        C0154p1 c0154p1;
        int i10;
        long j11;
        C0157q1 c0157q1;
        if (abstractC4825e instanceof C0154p1) {
            c0154p1 = (C0154p1) abstractC4825e;
            int i11 = c0154p1.f1456j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0154p1.f1456j0 = i11 - Integer.MIN_VALUE;
                Object obj = c0154p1.f1454h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0154p1.f1456j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        j10 = c0154p1.f1453Z;
                        c0157q1 = c0154p1.f1452Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (this.f1467Z) {
                        c0154p1.f1452Y = this;
                        c0154p1.f1453Z = j10;
                        c0154p1.f1456j0 = 1;
                        obj = this.f1466Y.b(j10, c0154p1);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        c0157q1 = this;
                    } else {
                        j11 = Z0.p.f22813b;
                        c0157q1 = this;
                        Z0.p pVar = new Z0.p(j11);
                        A1 a12 = c0157q1.f1466Y;
                        a12.f1028g.setValue(Boolean.FALSE);
                        return pVar;
                    }
                }
                j11 = Z0.p.d(j10, ((Z0.p) obj).f22815a);
                Z0.p pVar2 = new Z0.p(j11);
                A1 a122 = c0157q1.f1466Y;
                a122.f1028g.setValue(Boolean.FALSE);
                return pVar2;
            }
        }
        c0154p1 = new C0154p1(this, abstractC4825e);
        Object obj2 = c0154p1.f1454h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0154p1.f1456j0;
        if (i10 == 0) {
        }
        j11 = Z0.p.d(j10, ((Z0.p) obj2).f22815a);
        Z0.p pVar22 = new Z0.p(j11);
        A1 a1222 = c0157q1.f1466Y;
        a1222.f1028g.setValue(Boolean.FALSE);
        return pVar22;
    }

    @Override // A0.a
    public final long u(long j6, int i10, long j10) {
        float f6;
        if (this.f1467Z) {
            A1 a12 = this.f1466Y;
            if (a12.f1022a.a()) {
                return C5251c.f43619b;
            }
            AbstractC0168u1 abstractC0168u1 = a12.f1022a;
            if (a12.f1023b == W0.f1214Z) {
                f6 = C5251c.d(j10);
            } else {
                f6 = C5251c.e(j10);
            }
            if (a12.f1025d) {
                f6 *= -1;
            }
            float e10 = abstractC0168u1.e(f6);
            if (a12.f1025d) {
                e10 *= -1;
            }
            return a12.d(e10);
        }
        return C5251c.f43619b;
    }
}
