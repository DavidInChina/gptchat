package com.google.android.gms.internal.play_billing;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Y0 extends Q {
    private static final W zzb = new Object();
    private static final Y0 zzd;
    private int zze;
    private int zzg;
    private T0 zzj;
    private boolean zzk;
    private boolean zzl;
    private String zzf = "";
    private V zzh = S.f26878i0;
    private X zzi = C2482x0.f26988i0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.play_billing.W, java.lang.Object] */
    static {
        Y0 y02 = new Y0();
        zzd = y02;
        Q.i(Y0.class, y02);
    }

    public static Y0 n(byte[] bArr, J j6) {
        return (Y0) Q.f(zzd, bArr, j6);
    }

    public static void o(Y0 y02, j1 j1Var) {
        int i10;
        X x10 = y02.zzi;
        if (!((AbstractC2483y) x10).f26991Y) {
            int size = x10.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            y02.zzi = x10.u(i10);
        }
        y02.zzi.add(j1Var);
    }

    public static /* synthetic */ void p(Y0 y02, T0 t02) {
        y02.zzj = t02;
        y02.zze |= 4;
    }

    public static /* synthetic */ void q(Y0 y02, boolean z10) {
        y02.zze |= 8;
        y02.zzk = z10;
    }

    public static /* synthetic */ void r(Y0 y02) {
        y02.zze |= 16;
        y02.zzl = false;
    }

    public static void s(Y0 y02, AbstractCollection abstractCollection) {
        int i10;
        V v10 = y02.zzh;
        if (!((AbstractC2483y) v10).f26991Y) {
            S s10 = (S) v10;
            int i11 = s10.f26880h0;
            if (i11 == 0) {
                i10 = 10;
            } else {
                i10 = i11 + i11;
            }
            if (i10 >= i11) {
                y02.zzh = new S(Arrays.copyOf(s10.f26879Z, i10), s10.f26880h0, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            ((S) y02.zzh).s(((V0) it.next()).f26888Y);
        }
    }

    public static /* synthetic */ void t(Y0 y02, int i10) {
        y02.zzg = i10 - 1;
        y02.zze |= 2;
    }

    public static W0 u() {
        return (W0) zzd.d();
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
                        return zzd;
                    }
                    return new P(zzd);
                }
                return new Y0();
            }
            return new C2484y0(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u082c\u0004\u001b\u0005\u1009\u0002\u0006\u1007\u0003\u0007\u1007\u0004", new Object[]{"zze", "zzf", "zzg", X0.f26889a, "zzh", U0.f26882a, "zzi", j1.class, "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
