package f3;

import L2.r;
import java.io.EOFException;
import p2.O;
import s2.u;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public int f29553a;

    /* renamed from: b  reason: collision with root package name */
    public long f29554b;

    /* renamed from: c  reason: collision with root package name */
    public int f29555c;

    /* renamed from: d  reason: collision with root package name */
    public int f29556d;

    /* renamed from: e  reason: collision with root package name */
    public int f29557e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f29558f = new int[255];

    /* renamed from: g  reason: collision with root package name */
    public final u f29559g = new u(255);

    public final boolean a(r rVar, boolean z10) {
        this.f29553a = 0;
        this.f29554b = 0L;
        this.f29555c = 0;
        this.f29556d = 0;
        this.f29557e = 0;
        u uVar = this.f29559g;
        uVar.C(27);
        try {
            if (rVar.c(uVar.f45193a, 0, 27, z10) && uVar.v() == 1332176723) {
                if (uVar.u() != 0) {
                    if (z10) {
                        return false;
                    }
                    throw O.b("unsupported bit stream revision");
                }
                this.f29553a = uVar.u();
                this.f29554b = uVar.j();
                uVar.l();
                uVar.l();
                uVar.l();
                int u10 = uVar.u();
                this.f29555c = u10;
                this.f29556d = u10 + 27;
                uVar.C(u10);
                try {
                    if (rVar.c(uVar.f45193a, 0, this.f29555c, z10)) {
                        for (int i10 = 0; i10 < this.f29555c; i10++) {
                            int u11 = uVar.u();
                            this.f29558f[i10] = u11;
                            this.f29557e += u11;
                        }
                        return true;
                    }
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                }
                return false;
            }
        } catch (EOFException e11) {
            if (!z10) {
                throw e11;
            }
        }
        return false;
    }

    public final boolean b(r rVar, long j6) {
        boolean z10;
        int i10;
        if (rVar.o() == rVar.d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        u uVar = this.f29559g;
        uVar.C(4);
        while (true) {
            i10 = (j6 > (-1L) ? 1 : (j6 == (-1L) ? 0 : -1));
            if (i10 != 0 && rVar.o() + 4 >= j6) {
                break;
            }
            try {
                if (!rVar.c(uVar.f45193a, 0, 4, true)) {
                    break;
                }
                uVar.F(0);
                if (uVar.v() == 1332176723) {
                    rVar.k();
                    return true;
                }
                rVar.l(1);
            } catch (EOFException unused) {
            }
        }
        do {
            if (i10 != 0 && rVar.o() >= j6) {
                break;
            }
        } while (rVar.f(1) != -1);
        return false;
    }
}
