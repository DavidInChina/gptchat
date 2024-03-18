package o2;

import K4.C;
import K4.C0816d;
import K4.C0822j;
import K4.F;
import K4.G;
import K4.H;
import U3.u;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.o1;
import ff.f;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f40521a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f40522b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f40521a = i10;
        this.f40522b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01eb  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Bundle bundle;
        int i10;
        int i11;
        Exception e10;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24 = true;
        switch (this.f40521a) {
            case 0:
                Object obj = this.f40522b;
                RunnableC4904a runnableC4904a = (RunnableC4904a) obj;
                runnableC4904a.f40510i0.set(true);
                try {
                    Process.setThreadPriority(10);
                    ((RunnableC4904a) obj).f40511j0.d();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th2) {
                    try {
                        ((RunnableC4904a) obj).f40509h0.set(true);
                        throw th2;
                    } finally {
                        runnableC4904a.a(null);
                    }
                }
            case 1:
                C c10 = (C) this.f40522b;
                synchronized (c10.f9340a) {
                    try {
                        if (c10.f9341b) {
                            return null;
                        }
                        if (!TextUtils.isEmpty(null)) {
                            bundle = new Bundle();
                            bundle.putString("accountName", null);
                        } else {
                            bundle = null;
                        }
                        int i13 = 3;
                        try {
                            String packageName = c10.f9343d.f9403e.getPackageName();
                            i10 = 3;
                            int i14 = 22;
                            while (true) {
                                if (i14 >= 3) {
                                    if (bundle == null) {
                                        try {
                                            o1 o1Var = (o1) c10.f9343d.f9405g;
                                            Parcel j6 = o1Var.j();
                                            j6.writeInt(i14);
                                            j6.writeString(packageName);
                                            j6.writeString("subs");
                                            Parcel k10 = o1Var.k(j6, 1);
                                            int readInt = k10.readInt();
                                            k10.recycle();
                                            i10 = readInt;
                                        } catch (Exception e11) {
                                            e10 = e11;
                                            i13 = i10;
                                            AbstractC2468q.f("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                            if (e10 instanceof DeadObjectException) {
                                                i12 = 101;
                                            } else if (e10 instanceof RemoteException) {
                                                i12 = 100;
                                            } else if (e10 instanceof SecurityException) {
                                                i12 = 102;
                                            } else {
                                                i12 = 42;
                                            }
                                            i11 = i12;
                                            c10.f9343d.f9399a = 0;
                                            c10.f9343d.f9405g = null;
                                            i10 = i13;
                                            if (i10 != 0) {
                                            }
                                            return null;
                                        }
                                    } else {
                                        i10 = ((o1) c10.f9343d.f9405g).g(i14, packageName, "subs", bundle);
                                    }
                                    if (i10 == 0) {
                                        AbstractC2468q.d("BillingClient", "highestLevelSupportedForSubs: " + i14);
                                    } else {
                                        i14--;
                                    }
                                } else {
                                    i14 = 0;
                                }
                            }
                            C0816d c0816d = c10.f9343d;
                            if (i14 >= 5) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c0816d.f9408j = z10;
                            if (i14 >= 3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c0816d.f9407i = z11;
                            if (i14 < 3) {
                                AbstractC2468q.d("BillingClient", "In-app billing API does not support subscription on this device.");
                                i11 = 9;
                            } else {
                                i11 = 1;
                            }
                            int i15 = 22;
                            while (true) {
                                if (i15 >= 3) {
                                    if (bundle == null) {
                                        o1 o1Var2 = (o1) c10.f9343d.f9405g;
                                        Parcel j10 = o1Var2.j();
                                        j10.writeInt(i15);
                                        j10.writeString(packageName);
                                        j10.writeString("inapp");
                                        Parcel k11 = o1Var2.k(j10, 1);
                                        int readInt2 = k11.readInt();
                                        k11.recycle();
                                        i10 = readInt2;
                                    } else {
                                        i10 = ((o1) c10.f9343d.f9405g).g(i15, packageName, "inapp", bundle);
                                    }
                                    if (i10 == 0) {
                                        c10.f9343d.f9409k = i15;
                                        AbstractC2468q.d("BillingClient", "mHighestLevelSupportedForInApp: " + i15);
                                    } else {
                                        i15--;
                                    }
                                }
                            }
                            C0816d c0816d2 = c10.f9343d;
                            int i16 = c0816d2.f9409k;
                            if (i16 >= 22) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            c0816d2.f9422x = z12;
                            if (i16 >= 21) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            c0816d2.f9421w = z13;
                            if (i16 >= 20) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            c0816d2.f9420v = z14;
                            if (i16 >= 19) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            c0816d2.f9419u = z15;
                            if (i16 >= 18) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            c0816d2.f9418t = z16;
                            if (i16 >= 17) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            c0816d2.f9417s = z17;
                            if (i16 >= 16) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            c0816d2.f9416r = z18;
                            if (i16 >= 15) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            c0816d2.f9415q = z19;
                            if (i16 >= 14) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            c0816d2.f9414p = z20;
                            if (i16 >= 12) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            c0816d2.f9413o = z21;
                            if (i16 >= 9) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            c0816d2.f9412n = z22;
                            if (i16 >= 8) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            c0816d2.f9411m = z23;
                            if (i16 < 6) {
                                z24 = false;
                            }
                            c0816d2.f9410l = z24;
                            if (i16 < 3) {
                                AbstractC2468q.e("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                i11 = 36;
                            }
                            if (i10 == 0) {
                                c10.f9343d.f9399a = 2;
                                if (c10.f9343d.f9402d != null) {
                                    c10.f9343d.f9402d.a(c10.f9343d.f9421w);
                                }
                            } else {
                                c10.f9343d.f9399a = 0;
                                c10.f9343d.f9405g = null;
                            }
                        } catch (Exception e12) {
                            e10 = e12;
                        }
                        if (i10 != 0) {
                            ((u) c10.f9343d.f9404f).T(F.c(6));
                            c10.a(H.f9360i);
                        } else {
                            G g10 = c10.f9343d.f9404f;
                            C0822j c0822j = H.f9352a;
                            ((u) g10).S(F.b(i11, 6, c0822j));
                            c10.a(c0822j);
                        }
                        return null;
                    } finally {
                    }
                }
            default:
                return (f) this.f40522b;
        }
    }
}
