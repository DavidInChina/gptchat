package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class Q0 extends Q {
    private static final Q0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        Q0 q02 = new Q0();
        zzb = q02;
        Q.i(Q0.class, q02);
    }

    public static /* synthetic */ void n(Q0 q02, f1 f1Var) {
        q02.zzf = f1Var;
        q02.zze = 2;
    }

    public static /* synthetic */ void o(Q0 q02, int i10) {
        q02.zzg = i10 - 1;
        q02.zzd |= 1;
    }

    public static P0 p() {
        return (P0) zzb.d();
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
                return new Q0();
            }
            return new C2484y0(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", O0.f26875a, f1.class});
        }
        return (byte) 1;
    }
}
