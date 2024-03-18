package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class T0 extends Q {
    private static final T0 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        T0 t02 = new T0();
        zzb = t02;
        Q.i(T0.class, t02);
    }

    public static /* synthetic */ void n(T0 t02, int i10) {
        t02.zzd |= 1;
        t02.zze = i10;
    }

    public static /* synthetic */ void o(T0 t02, String str) {
        str.getClass();
        t02.zzd |= 2;
        t02.zzf = str;
    }

    public static /* synthetic */ void p(T0 t02, int i10) {
        t02.zzg = i10 - 1;
        t02.zzd |= 4;
    }

    public static R0 q() {
        return (R0) zzb.d();
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
                return new T0();
            }
            return new C2484y0(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0004\u180c\u0002\u0005\u1008\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", S0.f26881a, "zzh"});
        }
        return (byte) 1;
    }
}
