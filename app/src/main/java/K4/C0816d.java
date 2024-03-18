package K4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import com.android.vending.licensing.ILicensingService;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.M0;
import com.google.android.gms.internal.play_billing.N0;
import com.google.android.gms.internal.play_billing.P0;
import com.google.android.gms.internal.play_billing.Q0;
import com.google.android.gms.internal.play_billing.R0;
import com.google.android.gms.internal.play_billing.T0;
import com.google.android.gms.internal.play_billing.Z0;
import com.google.android.gms.internal.play_billing.a1;
import com.google.android.gms.internal.play_billing.d1;
import com.google.android.gms.internal.play_billing.f1;
import com.google.android.gms.internal.play_billing.q1;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import q.RunnableC5216j;

/* renamed from: K4.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0816d extends AbstractC0815c {

    /* renamed from: b  reason: collision with root package name */
    public final String f9400b;

    /* renamed from: d  reason: collision with root package name */
    public volatile L f9402d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f9403e;

    /* renamed from: f  reason: collision with root package name */
    public final G f9404f;

    /* renamed from: g  reason: collision with root package name */
    public volatile q1 f9405g;

    /* renamed from: h  reason: collision with root package name */
    public volatile C f9406h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9407i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9408j;

    /* renamed from: l  reason: collision with root package name */
    public boolean f9410l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f9411m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9412n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f9413o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f9414p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f9415q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9416r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9417s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9418t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9419u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9420v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9421w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f9422x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f9423y;

    /* renamed from: z  reason: collision with root package name */
    public ExecutorService f9424z;

    /* renamed from: a  reason: collision with root package name */
    public volatile int f9399a = 0;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f9401c = new Handler(Looper.getMainLooper());

    /* renamed from: k  reason: collision with root package name */
    public int f9409k = 0;

    public C0816d(Context context, t tVar) {
        String i10 = i();
        this.f9400b = i10;
        this.f9403e = context.getApplicationContext();
        Z0 p10 = a1.p();
        p10.e();
        a1.n((a1) p10.f26877Z, i10);
        String packageName = this.f9403e.getPackageName();
        p10.e();
        a1.o((a1) p10.f26877Z, packageName);
        this.f9404f = new U3.u(this.f9403e, (a1) p10.c());
        if (tVar == null) {
            AbstractC2468q.e("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f9402d = new L(this.f9403e, tVar, this.f9404f);
        this.f9423y = false;
        this.f9403e.getPackageName();
    }

    public static String i() {
        try {
            return (String) L4.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "6.2.0";
        }
    }

    @Override // K4.AbstractC0815c
    public final void a() {
        ((U3.u) this.f9404f).T(F.c(12));
        try {
            try {
                if (this.f9402d != null) {
                    L l10 = this.f9402d;
                    K k10 = l10.f9394d;
                    Context context = l10.f9391a;
                    k10.b(context);
                    l10.f9395e.b(context);
                }
                if (this.f9406h != null) {
                    C c10 = this.f9406h;
                    synchronized (c10.f9340a) {
                        c10.f9342c = null;
                        c10.f9341b = true;
                    }
                }
                if (this.f9406h != null && this.f9405g != null) {
                    AbstractC2468q.d("BillingClient", "Unbinding from service.");
                    this.f9403e.unbindService(this.f9406h);
                    this.f9406h = null;
                }
                this.f9405g = null;
                ExecutorService executorService = this.f9424z;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f9424z = null;
                }
            } catch (Exception e10) {
                AbstractC2468q.f("BillingClient", "There was an exception while ending connection!", e10);
            }
            this.f9399a = 3;
        } catch (Throwable th2) {
            this.f9399a = 3;
            throw th2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // K4.AbstractC0815c
    public final C0822j b(String str) {
        char c10;
        C0822j c0822j;
        C0822j c0822j2;
        C0822j c0822j3;
        C0822j c0822j4;
        C0822j c0822j5;
        C0822j c0822j6;
        C0822j c0822j7;
        C0822j c0822j8;
        C0822j c0822j9;
        C0822j c0822j10;
        C0822j c0822j11;
        C0822j c0822j12;
        C0822j c0822j13;
        C0822j c0822j14;
        if (!c()) {
            C0822j c0822j15 = H.f9361j;
            if (c0822j15.f9439a != 0) {
                ((U3.u) this.f9404f).S(F.b(2, 5, c0822j15));
            } else {
                ((U3.u) this.f9404f).T(F.c(5));
            }
            return c0822j15;
        }
        C0822j c0822j16 = H.f9352a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    c10 = 1;
                    break;
                }
                c10 = '\uffff';
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c10 = 4;
                    break;
                }
                c10 = '\uffff';
                break;
            case 97314:
                if (str.equals("bbb")) {
                    c10 = 3;
                    break;
                }
                c10 = '\uffff';
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c10 = 6;
                    break;
                }
                c10 = '\uffff';
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c10 = 5;
                    break;
                }
                c10 = '\uffff';
                break;
            case 100293:
                if (str.equals("eee")) {
                    c10 = 7;
                    break;
                }
                c10 = '\uffff';
                break;
            case 101286:
                if (str.equals("fff")) {
                    c10 = '\b';
                    break;
                }
                c10 = '\uffff';
                break;
            case 102279:
                if (str.equals("ggg")) {
                    c10 = '\t';
                    break;
                }
                c10 = '\uffff';
                break;
            case 103272:
                if (str.equals("hhh")) {
                    c10 = '\n';
                    break;
                }
                c10 = '\uffff';
                break;
            case 104265:
                if (str.equals("iii")) {
                    c10 = 11;
                    break;
                }
                c10 = '\uffff';
                break;
            case 105258:
                if (str.equals("jjj")) {
                    c10 = '\f';
                    break;
                }
                c10 = '\uffff';
                break;
            case 106251:
                if (str.equals("kkk")) {
                    c10 = '\r';
                    break;
                }
                c10 = '\uffff';
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    c10 = 2;
                    break;
                }
                c10 = '\uffff';
                break;
            case 1987365622:
                if (str.equals(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS)) {
                    c10 = 0;
                    break;
                }
                c10 = '\uffff';
                break;
            default:
                c10 = '\uffff';
                break;
        }
        switch (c10) {
            case 0:
                if (this.f9407i) {
                    c0822j = H.f9360i;
                } else {
                    c0822j = H.f9363l;
                }
                k(9, 2, c0822j);
                return c0822j;
            case 1:
                if (this.f9408j) {
                    c0822j2 = H.f9360i;
                } else {
                    c0822j2 = H.f9364m;
                }
                k(10, 3, c0822j2);
                return c0822j2;
            case 2:
                if (this.f9411m) {
                    c0822j3 = H.f9360i;
                } else {
                    c0822j3 = H.f9366o;
                }
                k(35, 4, c0822j3);
                return c0822j3;
            case 3:
                if (this.f9413o) {
                    c0822j4 = H.f9360i;
                } else {
                    c0822j4 = H.f9371t;
                }
                k(30, 5, c0822j4);
                return c0822j4;
            case 4:
                if (this.f9415q) {
                    c0822j5 = H.f9360i;
                } else {
                    c0822j5 = H.f9367p;
                }
                k(31, 6, c0822j5);
                return c0822j5;
            case 5:
                if (this.f9414p) {
                    c0822j6 = H.f9360i;
                } else {
                    c0822j6 = H.f9369r;
                }
                k(21, 7, c0822j6);
                return c0822j6;
            case 6:
                if (this.f9416r) {
                    c0822j7 = H.f9360i;
                } else {
                    c0822j7 = H.f9368q;
                }
                k(19, 8, c0822j7);
                return c0822j7;
            case 7:
                if (this.f9416r) {
                    c0822j8 = H.f9360i;
                } else {
                    c0822j8 = H.f9368q;
                }
                k(61, 9, c0822j8);
                return c0822j8;
            case '\b':
                if (this.f9417s) {
                    c0822j9 = H.f9360i;
                } else {
                    c0822j9 = H.f9370s;
                }
                k(20, 10, c0822j9);
                return c0822j9;
            case '\t':
                if (this.f9418t) {
                    c0822j10 = H.f9360i;
                } else {
                    c0822j10 = H.f9374w;
                }
                k(32, 11, c0822j10);
                return c0822j10;
            case '\n':
                if (this.f9418t) {
                    c0822j11 = H.f9360i;
                } else {
                    c0822j11 = H.f9375x;
                }
                k(33, 12, c0822j11);
                return c0822j11;
            case 11:
                if (this.f9420v) {
                    c0822j12 = H.f9360i;
                } else {
                    c0822j12 = H.f9377z;
                }
                k(60, 13, c0822j12);
                return c0822j12;
            case '\f':
                if (this.f9421w) {
                    c0822j13 = H.f9360i;
                } else {
                    c0822j13 = H.f9350A;
                }
                k(66, 14, c0822j13);
                return c0822j13;
            case '\r':
                if (this.f9422x) {
                    c0822j14 = H.f9360i;
                } else {
                    c0822j14 = H.f9372u;
                }
                k(103, 18, c0822j14);
                return c0822j14;
            default:
                AbstractC2468q.e("BillingClient", "Unsupported feature: ".concat(str));
                C0822j c0822j17 = H.f9373v;
                k(34, 1, c0822j17);
                return c0822j17;
        }
    }

    @Override // K4.AbstractC0815c
    public final boolean c() {
        if (this.f9399a == 2 && this.f9405g != null && this.f9406h != null) {
            return true;
        }
        return false;
    }

    @Override // K4.AbstractC0815c
    public final void d(v vVar, com.revenuecat.purchases.google.usecase.c cVar) {
        if (!c()) {
            G g10 = this.f9404f;
            C0822j c0822j = H.f9361j;
            ((U3.u) g10).S(F.b(2, 7, c0822j));
            cVar.a(c0822j, new ArrayList());
        } else if (!this.f9417s) {
            AbstractC2468q.e("BillingClient", "Querying product details is not supported.");
            G g11 = this.f9404f;
            C0822j c0822j2 = H.f9370s;
            ((U3.u) g11).S(F.b(20, 7, c0822j2));
            cVar.a(c0822j2, new ArrayList());
        } else if (j(new y(this, vVar, cVar, 1), 30000L, new RunnableC5216j(this, cVar, 16), f()) == null) {
            C0822j h10 = h();
            ((U3.u) this.f9404f).S(F.b(25, 7, h10));
            cVar.a(h10, new ArrayList());
        }
    }

    @Override // K4.AbstractC0815c
    public final void e(AbstractC0817e abstractC0817e) {
        if (c()) {
            AbstractC2468q.d("BillingClient", "Service connection is valid. No need to re-initialize.");
            ((U3.u) this.f9404f).T(F.c(6));
            abstractC0817e.onBillingSetupFinished(H.f9360i);
            return;
        }
        int i10 = 1;
        if (this.f9399a == 1) {
            AbstractC2468q.e("BillingClient", "Client is already in the process of connecting to billing service.");
            G g10 = this.f9404f;
            C0822j c0822j = H.f9355d;
            ((U3.u) g10).S(F.b(37, 6, c0822j));
            abstractC0817e.onBillingSetupFinished(c0822j);
        } else if (this.f9399a == 3) {
            AbstractC2468q.e("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            G g11 = this.f9404f;
            C0822j c0822j2 = H.f9361j;
            ((U3.u) g11).S(F.b(38, 6, c0822j2));
            abstractC0817e.onBillingSetupFinished(c0822j2);
        } else {
            this.f9399a = 1;
            AbstractC2468q.d("BillingClient", "Starting in-app billing setup.");
            this.f9406h = new C(this, abstractC0817e);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage(ILicensingService.SERVICE_PACKAGE);
            List<ResolveInfo> queryIntentServices = this.f9403e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (ILicensingService.SERVICE_PACKAGE.equals(str) && str2 != null) {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.f9400b);
                        if (this.f9403e.bindService(intent2, this.f9406h, 1)) {
                            AbstractC2468q.d("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            AbstractC2468q.e("BillingClient", "Connection to Billing service is blocked.");
                            i10 = 39;
                        }
                    } else {
                        AbstractC2468q.e("BillingClient", "The device doesn't have valid Play Store.");
                        i10 = 40;
                    }
                }
            } else {
                i10 = 41;
            }
            this.f9399a = 0;
            AbstractC2468q.d("BillingClient", "Billing service unavailable on device.");
            G g12 = this.f9404f;
            C0822j c0822j3 = H.f9354c;
            ((U3.u) g12).S(F.b(i10, 6, c0822j3));
            abstractC0817e.onBillingSetupFinished(c0822j3);
        }
    }

    public final Handler f() {
        if (Looper.myLooper() == null) {
            return this.f9401c;
        }
        return new Handler(Looper.myLooper());
    }

    public final void g(C0822j c0822j) {
        if (Thread.interrupted()) {
            return;
        }
        this.f9401c.post(new RunnableC5216j(this, c0822j, 17));
    }

    public final C0822j h() {
        if (this.f9399a != 0 && this.f9399a != 3) {
            return H.f9359h;
        }
        return H.f9361j;
    }

    public final Future j(Callable callable, long j6, Runnable runnable, Handler handler) {
        if (this.f9424z == null) {
            this.f9424z = Executors.newFixedThreadPool(AbstractC2468q.f26955a, new r.c());
        }
        try {
            Future submit = this.f9424z.submit(callable);
            handler.postDelayed(new RunnableC5216j(submit, runnable, 20), (long) (j6 * 0.95d));
            return submit;
        } catch (Exception e10) {
            AbstractC2468q.f("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public final void k(int i10, int i11, C0822j c0822j) {
        Q0 q02 = null;
        N0 n02 = null;
        if (c0822j.f9439a != 0) {
            G g10 = this.f9404f;
            int i12 = F.f9348a;
            try {
                M0 r10 = N0.r();
                R0 q10 = T0.q();
                int i13 = c0822j.f9439a;
                q10.e();
                T0.n((T0) q10.f26877Z, i13);
                String str = c0822j.f9440b;
                q10.e();
                T0.o((T0) q10.f26877Z, str);
                q10.e();
                T0.p((T0) q10.f26877Z, i10);
                r10.e();
                N0.o((N0) r10.f26877Z, (T0) q10.c());
                r10.e();
                N0.q((N0) r10.f26877Z, 5);
                d1 o10 = f1.o();
                o10.e();
                f1.n((f1) o10.f26877Z, i11);
                r10.e();
                N0.p((N0) r10.f26877Z, (f1) o10.c());
                n02 = (N0) r10.c();
            } catch (Exception e10) {
                AbstractC2468q.f("BillingLogger", "Unable to create logging payload", e10);
            }
            ((U3.u) g10).S(n02);
            return;
        }
        G g11 = this.f9404f;
        int i14 = F.f9348a;
        try {
            P0 p10 = Q0.p();
            p10.e();
            Q0.o((Q0) p10.f26877Z, 5);
            d1 o11 = f1.o();
            o11.e();
            f1.n((f1) o11.f26877Z, i11);
            p10.e();
            Q0.n((Q0) p10.f26877Z, (f1) o11.c());
            q02 = (Q0) p10.c();
        } catch (Exception e11) {
            AbstractC2468q.f("BillingLogger", "Unable to create logging payload", e11);
        }
        ((U3.u) g11).T(q02);
    }
}
