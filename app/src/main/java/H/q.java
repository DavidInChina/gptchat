package H;

import B.W0;
import q0.C5251c;
import z.AbstractC6696f;
import z.C6736z;

/* loaded from: classes2.dex */
public final class q implements C.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ F f6661a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f6662b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6736z f6663c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ B f6664d;

    public q(float f6, C6736z c6736z, B b10, F f10) {
        this.f6661a = f10;
        this.f6662b = f6;
        this.f6663c = c6736z;
        this.f6664d = b10;
    }

    @Override // C.o
    public final float a(float f6) {
        int i10;
        F f10 = this.f6661a;
        int j6 = f10.j() + f10.i();
        float j10 = AbstractC6696f.j(this.f6663c, f6);
        if (f6 < 0.0f) {
            i10 = f10.f6550e + 1;
        } else {
            i10 = f10.f6550e;
        }
        int i11 = 0;
        int p10 = com.google.android.gms.internal.play_billing.N.p(((int) (j10 / j6)) + i10, 0, f10.h());
        f10.i();
        f10.j();
        int i12 = ((C) this.f6664d).f6532a;
        int abs = Math.abs((com.google.android.gms.internal.play_billing.N.p(com.google.android.gms.internal.play_billing.N.p(p10, i10 - i12, i12 + i10), 0, f10.h()) - i10) * j6) - j6;
        if (abs >= 0) {
            i11 = abs;
        }
        if (i11 == 0) {
            return i11;
        }
        return Math.signum(f6) * i11;
    }

    @Override // C.o
    public final float b(float f6) {
        float f10;
        boolean z10;
        float f11;
        float f12;
        F f13 = this.f6661a;
        int j6 = f13.j() + f13.i();
        A a5 = f13.f6549d;
        int h10 = a5.f6527b.h();
        int q10 = kotlin.jvm.internal.m.q(f13, j6);
        int size = ((x) f13.g()).f6694a.size() / 2;
        int i10 = h10;
        int i11 = q10;
        float f14 = Float.POSITIVE_INFINITY;
        float f15 = Float.NEGATIVE_INFINITY;
        while (true) {
            int i12 = h10 - size;
            if (i12 < 0) {
                i12 = 0;
            }
            if (i10 < i12) {
                break;
            }
            float f02 = A7.b.f0(A7.b.T0(f13.g()), -((x) f13.g()).f6699f, ((x) f13.g()).f6697d, ((x) f13.g()).f6695b, i11, L.f6584d);
            if (f02 <= 0.0f && f02 > f15) {
                f15 = f02;
            }
            if (f02 >= 0.0f && f02 < f14) {
                f14 = f02;
            }
            i11 -= j6;
            i10--;
        }
        int i13 = h10 + 1;
        int i14 = q10 + j6;
        while (true) {
            int i15 = h10 + size;
            int h11 = f13.h() - 1;
            if (i15 > h11) {
                i15 = h11;
            }
            if (i13 > i15) {
                break;
            }
            float f03 = A7.b.f0(A7.b.T0(f13.g()), -((x) f13.g()).f6699f, ((x) f13.g()).f6697d, ((x) f13.g()).f6695b, i14, L.f6584d);
            if (f03 >= 0.0f && f03 < f14) {
                f14 = f03;
            }
            if (f03 <= 0.0f && f03 > f15) {
                f15 = f03;
            }
            i14 += j6;
            i13++;
        }
        if (f15 == Float.NEGATIVE_INFINITY) {
            f15 = f14;
        }
        if (f14 == Float.POSITIVE_INFINITY) {
            f14 = f15;
        }
        Float valueOf = Float.valueOf(f15);
        Float valueOf2 = Float.valueOf(f14);
        float floatValue = valueOf.floatValue();
        float floatValue2 = valueOf2.floatValue();
        W0 w02 = ((x) f13.g()).f6698e;
        W0 w03 = W0.f1214Z;
        if (w02 == w03) {
            f10 = C5251c.d(f13.k());
        } else {
            f10 = C5251c.e(f13.k());
        }
        if (f10 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((x) f13.g()).f6698e == w03) {
            f11 = C5251c.d(f13.k());
        } else {
            f11 = C5251c.e(f13.k());
        }
        float f16 = (f11 / ((x) f13.g()).f6695b) - ((int) f12);
        int M10 = R4.b.M(f6, f13.f6561p);
        if (!L4.a.k0(M10, 0)) {
            if (!L4.a.k0(M10, 1)) {
                if (!L4.a.k0(M10, 2)) {
                    floatValue = 0.0f;
                }
            }
        } else {
            floatValue = Math.abs(f16) > this.f6662b ? floatValue2 : floatValue2;
        }
        if (floatValue == Float.POSITIVE_INFINITY || floatValue == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return floatValue;
    }
}
