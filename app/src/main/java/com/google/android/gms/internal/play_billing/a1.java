package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class a1 extends Q {
    private static final a1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        a1 a1Var = new a1();
        zzb = a1Var;
        Q.i(a1.class, a1Var);
    }

    public static /* synthetic */ void n(a1 a1Var, String str) {
        str.getClass();
        a1Var.zzd |= 1;
        a1Var.zze = str;
    }

    public static /* synthetic */ void o(a1 a1Var, String str) {
        str.getClass();
        a1Var.zzd |= 2;
        a1Var.zzf = str;
    }

    public static Z0 p() {
        return (Z0) zzb.d();
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
                return new a1();
            }
            return new C2484y0(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
