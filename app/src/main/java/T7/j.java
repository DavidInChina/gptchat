package t7;

import Q1.ThreadFactoryC1173a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.android.vending.licensing.ILicensingService;
import f7.C2942e;
import g7.C3204a;
import g7.C3206c;
import io.sentry.android.core.AbstractC3612c;
import j7.C3920j;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m7.AbstractC4566b;
import o8.AbstractC4952e;
import o8.C4951d;
import q.D1;
import u7.C5848d;
import u8.AbstractC5857g;
import u8.C5855e;

/* loaded from: classes.dex */
public final class j implements Q1.k {

    /* renamed from: b  reason: collision with root package name */
    public static j f45779b;

    /* renamed from: a  reason: collision with root package name */
    public Context f45780a;

    public j(Context context, int i10) {
        if (i10 != 1) {
            if (i10 != 3) {
                if (i10 != 5) {
                    this.f45780a = context.getApplicationContext();
                    return;
                } else {
                    this.f45780a = context.getApplicationContext();
                    return;
                }
            }
            this.f45780a = context;
            return;
        }
        this.f45780a = context.getApplicationContext();
    }

    public static j d(Context context) {
        A7.b.k0(context);
        synchronized (j.class) {
            try {
                if (f45779b == null) {
                    r.a(context);
                    f45779b = new j(context, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f45779b;
    }

    public static final n e(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                AbstractC3612c.r("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < nVarArr.length; i10++) {
                if (nVarArr[i10].equals(oVar)) {
                    return nVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean f(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        n nVar;
        if (z10) {
            if (packageInfo != null) {
                if (ILicensingService.SERVICE_PACKAGE.equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
            } else {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if (!z10) {
                        nVar = e(packageInfo2, q.f45791a);
                    } else {
                        nVar = e(packageInfo2, q.f45791a[0]);
                    }
                    if (nVar == null) {
                        return true;
                    }
                }
                return false;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if (!z10) {
            }
            if (nVar == null) {
            }
        }
        return false;
    }

    @Override // Q1.k
    public final void a(Bi.c cVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1173a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Q1.n(this, cVar, threadPoolExecutor, 0));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, q.D1] */
    public final D1 b() {
        Context context = this.f45780a;
        if (context != null) {
            ?? obj = new Object();
            obj.f43261a = obj;
            obj.f43262b = new J0.a(context);
            AbstractC5857g b10 = C5855e.b(AbstractC4952e.f40942b);
            obj.f43263c = b10;
            AbstractC5857g abstractC5857g = (AbstractC5857g) obj.f43262b;
            C5848d c5848d = AbstractC4952e.f40943c;
            C4951d c4951d = new C4951d(abstractC5857g);
            obj.f43264d = c4951d;
            AbstractC5857g b11 = C5855e.b(new U3.n(abstractC5857g, b10, c4951d, c5848d));
            obj.f43265e = b11;
            AbstractC5857g b12 = C5855e.b(new S4.o(7, b11));
            obj.f43266f = b12;
            obj.f43267g = C5855e.b(new U3.l(b11, 17, b12));
            return obj;
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [e7.j, java.lang.Object] */
    public final e7.j c() {
        Context context = this.f45780a;
        if (context != null) {
            ?? obj = new Object();
            obj.f29009Y = C3204a.a(e7.m.f29017a);
            C3206c c3206c = new C3206c(context);
            obj.f29010Z = c3206c;
            e7.n nVar = AbstractC4566b.f38963a;
            e7.n nVar2 = AbstractC4566b.f38964b;
            obj.f29011h0 = C3204a.a(new f7.g(c3206c, new C2942e(c3206c, nVar, nVar2, 0)));
            C3206c c3206c2 = obj.f29010Z;
            obj.f29012i0 = new C2942e(c3206c2, k7.e.f37175a, k7.e.f37176b, 1);
            p000if.a a5 = C3204a.a(new e7.r(nVar, nVar2, k7.e.f37177c, obj.f29012i0, C3204a.a(new i7.d(c3206c2, 1)), 2));
            obj.f29013j0 = a5;
            i7.d dVar = new i7.d(nVar, 0);
            C3206c c3206c3 = obj.f29010Z;
            i7.e eVar = new i7.e(c3206c3, a5, dVar, nVar2, 0);
            p000if.a aVar = obj.f29009Y;
            p000if.a aVar2 = obj.f29011h0;
            obj.f29014k0 = C3204a.a(new e7.r(nVar, nVar2, new e7.r(aVar, aVar2, eVar, a5, a5, 1), new C3920j(c3206c3, aVar2, a5, eVar, aVar, a5, a5), new i7.e(aVar, a5, eVar, a5, 1), 0));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }
}
