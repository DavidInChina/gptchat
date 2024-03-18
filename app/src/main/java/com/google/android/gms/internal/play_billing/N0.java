package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class N0 extends Q {
    private static final N0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private T0 zzh;

    static {
        N0 n02 = new N0();
        zzb = n02;
        Q.i(N0.class, n02);
    }

    public static N0 n(byte[] bArr, J j6) {
        return (N0) Q.f(zzb, bArr, j6);
    }

    public static /* synthetic */ void o(N0 n02, T0 t02) {
        n02.zzh = t02;
        n02.zzd |= 2;
    }

    public static /* synthetic */ void p(N0 n02, f1 f1Var) {
        n02.zzf = f1Var;
        n02.zze = 4;
    }

    public static /* synthetic */ void q(N0 n02, int i10) {
        n02.zzg = i10 - 1;
        n02.zzd |= 1;
    }

    public static M0 r() {
        return (M0) zzb.d();
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
                return new N0();
            }
            return new C2484y0(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", O0.f26875a, "zzh", f1.class});
        }
        return (byte) 1;
    }
}
