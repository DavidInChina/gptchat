package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class c1 extends Q {
    private static final c1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.c1, com.google.android.gms.internal.play_billing.Q] */
    static {
        ?? q10 = new Q();
        zzb = q10;
        Q.i(c1.class, q10);
    }

    public static /* synthetic */ void n(c1 c1Var) {
        c1Var.zzd |= 2;
        c1Var.zzf = false;
    }

    public static b1 o() {
        return (b1) zzb.d();
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
                return new Q();
            }
            return new C2484y0(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
