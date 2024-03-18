package H;

import Z.C1718j0;
import Z.C1720k0;
import l8.AbstractC4344b;
import wf.AbstractC6216a;

/* renamed from: H.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0654c extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6610Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F f6611Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0654c(F f6, int i10) {
        super(0);
        this.f6610Y = i10;
        this.f6611Z = f6;
    }

    public final Integer a() {
        int i10;
        int i11;
        int i12 = this.f6610Y;
        F f6 = this.f6611Z;
        switch (i12) {
            case 0:
                return Integer.valueOf(f6.h());
            case 1:
                return Integer.valueOf(f6.h());
            case 2:
                if (f6.f6555j.a()) {
                    i10 = f6.f6564s.h();
                } else {
                    i10 = f6.f6549d.f6527b.h();
                }
                return Integer.valueOf(i10);
            default:
                boolean a5 = f6.f6555j.a();
                A a10 = f6.f6549d;
                if (!a5) {
                    i11 = a10.f6527b.h();
                } else {
                    C1720k0 c1720k0 = f6.f6563r;
                    if (c1720k0.h() != -1) {
                        i11 = c1720k0.h();
                    } else {
                        C1718j0 c1718j0 = f6.f6547b;
                        if (c1718j0.h() == 0.0f) {
                            if (Math.abs(a10.f6528c.h()) >= Math.abs(Math.min(f6.f6561p.R(L.f6581a), f6.i() / 2.0f) / f6.i())) {
                                if (((Boolean) f6.f6548c.getValue()).booleanValue()) {
                                    i11 = f6.f6550e + 1;
                                } else {
                                    i11 = f6.f6550e;
                                }
                            } else {
                                i11 = a10.f6527b.h();
                            }
                        } else {
                            float h10 = c1718j0.h();
                            int i13 = f6.i();
                            i11 = AbstractC4344b.Y0(h10 / (f6.j() + i13)) + a10.f6527b.h();
                        }
                    }
                }
                int i14 = 0;
                if (f6.h() > 0) {
                    i14 = com.google.android.gms.internal.play_billing.N.p(i11, 0, f6.h() - 1);
                }
                return Integer.valueOf(i14);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo122invoke() {
        switch (this.f6610Y) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            default:
                return a();
        }
    }
}
