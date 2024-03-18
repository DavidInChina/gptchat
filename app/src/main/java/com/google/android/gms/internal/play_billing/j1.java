package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class j1 extends Q {
    private static final j1 zzb;
    private int zzd;
    private int zzf;
    private X zze = C2482x0.f26988i0;
    private String zzg = "";

    static {
        j1 j1Var = new j1();
        zzb = j1Var;
        Q.i(j1.class, j1Var);
    }

    public static void n(j1 j1Var, ArrayList arrayList) {
        int i10;
        X x10 = j1Var.zze;
        if (!((AbstractC2483y) x10).f26991Y) {
            int size = x10.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            j1Var.zze = x10.u(i10);
        }
        X x11 = j1Var.zze;
        Charset charset = Y.f26890a;
        if (arrayList instanceof AbstractC2443d0) {
            List E10 = ((AbstractC2443d0) arrayList).E();
            AbstractC2443d0 abstractC2443d0 = (AbstractC2443d0) x11;
            int size2 = x11.size();
            for (Object obj : E10) {
                if (obj == null) {
                    String v10 = AbstractC4194d.v("Element at index ", abstractC2443d0.size() - size2, " is null.");
                    int size3 = abstractC2443d0.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            break;
                        }
                        abstractC2443d0.remove(size3);
                    }
                    throw new NullPointerException(v10);
                } else if (obj instanceof E) {
                    abstractC2443d0.R((E) obj);
                } else {
                    abstractC2443d0.add((String) obj);
                }
            }
        } else if (!(arrayList instanceof AbstractC2478v0)) {
            if (x11 instanceof ArrayList) {
                ((ArrayList) x11).ensureCapacity(arrayList.size() + x11.size());
            }
            int size4 = x11.size();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next == null) {
                    String v11 = AbstractC4194d.v("Element at index ", x11.size() - size4, " is null.");
                    int size5 = x11.size();
                    while (true) {
                        size5--;
                        if (size5 < size4) {
                            break;
                        }
                        x11.remove(size5);
                    }
                    throw new NullPointerException(v11);
                }
                x11.add(next);
            }
        } else {
            x11.addAll(arrayList);
        }
    }

    public static /* synthetic */ void o(j1 j1Var, int i10) {
        j1Var.zzd |= 1;
        j1Var.zzf = i10;
    }

    public static /* synthetic */ void p(j1 j1Var, String str) {
        str.getClass();
        j1Var.zzd |= 2;
        j1Var.zzg = str;
    }

    public static i1 q() {
        return (i1) zzb.d();
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
                return new j1();
            }
            return new C2484y0(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002\u1004\u0000\u0003\u1008\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
