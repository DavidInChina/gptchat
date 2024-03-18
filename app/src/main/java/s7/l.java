package s7;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import io.sentry.android.core.AbstractC3612c;
import k6.AbstractC4194d;
import p7.AbstractC5096a;
import s2.s;
import u7.C5850f;
import u7.o;
import v7.v;
import w7.r;

/* loaded from: classes.dex */
public final class l extends F7.c {

    /* renamed from: b  reason: collision with root package name */
    public final Context f45440b;

    public l(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
        this.f45440b = context;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [r7.a, u7.g] */
    @Override // F7.c
    public final boolean h(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10;
        BasePendingResult basePendingResult;
        boolean z11;
        BasePendingResult basePendingResult2;
        Context context = this.f45440b;
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            l();
            j.a(context).b();
        } else {
            l();
            C5581b a5 = C5581b.a(context);
            GoogleSignInAccount b10 = a5.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f26771q0;
            if (b10 != null) {
                googleSignInOptions = a5.c();
            }
            A7.b.k0(googleSignInOptions);
            ?? gVar = new u7.g(context, AbstractC5096a.f42750a, googleSignInOptions, new C5850f(new f8.e(1), Looper.getMainLooper()));
            v vVar = gVar.f46463h;
            Context context2 = gVar.f46456a;
            if (b10 != null) {
                if (gVar.c() == 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i.f45437a.b("Revoking access", new Object[0]);
                String e10 = C5581b.a(context2).e("refreshToken");
                i.a(context2);
                if (z11) {
                    if (e10 == null) {
                        s sVar = RunnableC5582c.f45428h0;
                        Status status = new Status(4, null, null, null);
                        if (!false) {
                            BasePendingResult oVar = new o(status);
                            oVar.J0(status);
                            basePendingResult2 = oVar;
                        } else {
                            throw new IllegalArgumentException("Status code must not be SUCCESS");
                        }
                    } else {
                        RunnableC5582c runnableC5582c = new RunnableC5582c(e10);
                        new Thread(runnableC5582c).start();
                        basePendingResult2 = runnableC5582c.f45430Z;
                    }
                } else {
                    g gVar2 = new g(vVar, 1);
                    vVar.b(gVar2);
                    basePendingResult2 = gVar2;
                }
                basePendingResult2.F0(new r(basePendingResult2, new N7.f(), new f8.e(2)));
            } else {
                if (gVar.c() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i.f45437a.b("Signing out", new Object[0]);
                i.a(context2);
                if (z10) {
                    Status status2 = Status.f26802j0;
                    basePendingResult = new BasePendingResult(vVar);
                    basePendingResult.J0(status2);
                } else {
                    g gVar3 = new g(vVar, 0);
                    vVar.b(gVar3);
                    basePendingResult = gVar3;
                }
                basePendingResult.F0(new r(basePendingResult, new N7.f(), new f8.e(2)));
            }
        }
        return true;
    }

    public final void l() {
        AppOpsManager appOpsManager;
        int callingUid = Binder.getCallingUid();
        Context context = this.f45440b;
        t7.j a5 = A7.c.a(context);
        a5.getClass();
        try {
            appOpsManager = (AppOpsManager) a5.f45780a.getSystemService("appops");
        } catch (SecurityException unused) {
        }
        if (appOpsManager != null) {
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                t7.j d10 = t7.j.d(context);
                d10.getClass();
                if (packageInfo != null) {
                    if (!t7.j.f(packageInfo, false)) {
                        if (t7.j.f(packageInfo, true)) {
                            Context context2 = d10.f45780a;
                            try {
                                if (!t7.i.f45777c) {
                                    try {
                                        PackageInfo packageInfo2 = A7.c.a(context2).f45780a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                        t7.j.d(context2);
                                        if (packageInfo2 != null && !t7.j.f(packageInfo2, false) && t7.j.f(packageInfo2, true)) {
                                            t7.i.f45776b = true;
                                        } else {
                                            t7.i.f45776b = false;
                                        }
                                        t7.i.f45777c = true;
                                    } catch (PackageManager.NameNotFoundException e10) {
                                        AbstractC3612c.s("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                                        t7.i.f45777c = true;
                                    }
                                }
                                if (!t7.i.f45776b && "user".equals(Build.TYPE)) {
                                    AbstractC3612c.r("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                } else {
                                    return;
                                }
                            } catch (Throwable th2) {
                                t7.i.f45777c = true;
                                throw th2;
                            }
                        }
                    } else {
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
            throw new SecurityException(AbstractC4194d.v("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
        throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
    }
}
