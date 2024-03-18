package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class m1 extends Q {
    private static final m1 zzb;
    private int zzd;
    private int zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.Q, com.google.android.gms.internal.play_billing.m1] */
    static {
        ?? q10 = new Q();
        zzb = q10;
        Q.i(m1.class, q10);
    }

    public static m1 n() {
        return zzb;
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
            return new C2484y0(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", new Object[]{"zzd", "zze", l1.f26941a});
        }
        return (byte) 1;
    }
}
