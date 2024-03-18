package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class f1 extends Q {
    private static final f1 zzb;
    private int zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.f1, com.google.android.gms.internal.play_billing.Q] */
    static {
        ?? q10 = new Q();
        zzb = q10;
        Q.i(f1.class, q10);
    }

    public static /* synthetic */ void n(f1 f1Var, int i10) {
        f1Var.zze = i10 - 1;
        f1Var.zzd |= 1;
    }

    public static d1 o() {
        return (d1) zzb.d();
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
            return new C2484y0(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", new Object[]{"zzd", "zze", e1.f26918a});
        }
        return (byte) 1;
    }
}
