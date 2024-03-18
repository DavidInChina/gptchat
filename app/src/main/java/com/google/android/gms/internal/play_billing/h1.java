package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class h1 extends Q {
    private static final h1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private a1 zzg;
    private c1 zzh;

    static {
        h1 h1Var = new h1();
        zzb = h1Var;
        Q.i(h1.class, h1Var);
    }

    public static /* synthetic */ void n(h1 h1Var, m1 m1Var) {
        h1Var.zzf = m1Var;
        h1Var.zze = 4;
    }

    public static /* synthetic */ void o(h1 h1Var, Y0 y02) {
        h1Var.zzf = y02;
        h1Var.zze = 5;
    }

    public static /* synthetic */ void p(h1 h1Var, c1 c1Var) {
        h1Var.zzh = c1Var;
        h1Var.zzd |= 2;
    }

    public static /* synthetic */ void q(h1 h1Var, a1 a1Var) {
        h1Var.zzg = a1Var;
        h1Var.zzd |= 1;
    }

    public static /* synthetic */ void r(h1 h1Var, N0 n02) {
        h1Var.zzf = n02;
        h1Var.zze = 2;
    }

    public static /* synthetic */ void s(h1 h1Var, Q0 q02) {
        h1Var.zzf = q02;
        h1Var.zze = 3;
    }

    public static g1 t() {
        return (g1) zzb.d();
    }

    @Override // com.google.android.gms.internal.play_billing.Q
    public final Object m(int i10) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new P(zzb);
                }
                return new h1();
            }
            return new C2484y0(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u1009\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", N0.class, Q0.class, m1.class, Y0.class, "zzh"});
        }
        return (byte) 1;
    }
}
