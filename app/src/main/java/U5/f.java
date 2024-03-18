package u5;

import F5.l;
import K4.C0823k;
import Lg.n;
import M3.H;
import Wh.AbstractC1657b;
import Wh.C1663h;
import Wh.C1664i;
import Wh.C1665j;
import Wh.v;
import Wh.x;
import Z1.o0;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import g.RunnableC3111d;
import id.AbstractC3557B;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import jf.C3963m;
import k6.AbstractC4194d;
import kf.AbstractC4268D;
import kf.t;
import kf.w;
import l8.AbstractC4344b;
import o5.AbstractC4918b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q5.C5271a;
import q5.C5274d;
import r5.AbstractC5366a;
import r5.AbstractC5367b;
import r5.AbstractC5368c;
import s5.AbstractC5577b;
import t5.C5677c;
import v5.C5974a;
import v5.C5975b;
import y.AbstractC6463a;
import y5.AbstractC6542a;
import y5.C6543b;
import y5.C6544c;
import yf.AbstractC6583a;
import z5.C6774a;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: k  reason: collision with root package name */
    public static final long f46428k = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f46429l = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f46430a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46431b;

    /* renamed from: d  reason: collision with root package name */
    public y5.d f46433d;

    /* renamed from: f  reason: collision with root package name */
    public final Context f46435f;

    /* renamed from: h  reason: collision with root package name */
    public B5.c f46437h;

    /* renamed from: i  reason: collision with root package name */
    public final AbstractC5091c f46438i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f46439j;

    /* renamed from: c  reason: collision with root package name */
    public final wf.k f46432c = null;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f46434e = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final C3963m f46436g = R4.b.D1(new X0.b(15, this));

    public f(Context context, String str, String str2) {
        C5842b c5842b = C5842b.f46415Z;
        AbstractC3557B.c0("context", context);
        this.f46430a = str;
        this.f46431b = str2;
        Context applicationContext = context.getApplicationContext();
        AbstractC3557B.b0("context.applicationContext", applicationContext);
        this.f46435f = applicationContext;
        this.f46438i = (AbstractC5091c) c5842b.invoke(this);
    }

    @Override // r5.d
    public final Map a(String str) {
        AbstractC6542a q10 = q();
        if (q10 != null) {
            return q10.a(str);
        }
        return w.f37484Y;
    }

    @Override // r5.d
    public final void b(String str, AbstractC5367b abstractC5367b) {
        AbstractC3557B.c0("featureName", str);
        AbstractC3557B.c0("receiver", abstractC5367b);
        y5.h hVar = (y5.h) this.f46434e.get(str);
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        if (hVar == null) {
            P4.a.m0(this.f46438i, 4, enumC5090b, new C5843c(str, 0), null, false, 56);
            return;
        }
        AtomicReference atomicReference = hVar.f50816e;
        if (atomicReference.get() != null) {
            P4.a.m0(this.f46438i, 4, enumC5090b, new C5843c(str, 1), null, false, 56);
        }
        atomicReference.set(abstractC5367b);
    }

    @Override // u5.g
    public final List c() {
        return t.K2(this.f46434e.values());
    }

    @Override // u5.g
    public final C5274d d() {
        return r().f50788f.R();
    }

    @Override // u5.g
    public final boolean e() {
        return this.f46439j;
    }

    @Override // r5.d
    public final void f(String str) {
        AtomicReference atomicReference;
        AbstractC3557B.c0("featureName", str);
        y5.h hVar = (y5.h) this.f46434e.get(str);
        if (hVar != null && (atomicReference = hVar.f50816e) != null) {
            atomicReference.set(null);
        }
    }

    @Override // p5.AbstractC5092d
    public final String g() {
        return r().f50799q;
    }

    @Override // p5.AbstractC5092d
    public final String getName() {
        return this.f46431b;
    }

    @Override // p5.AbstractC5092d
    public final q5.f getTime() {
        O5.d dVar = r().f50790h;
        long z10 = dVar.z();
        long A10 = dVar.A();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j6 = A10 - z10;
        return new q5.f(timeUnit.toNanos(z10), timeUnit.toNanos(A10), timeUnit.toNanos(j6), j6);
    }

    @Override // r5.d
    public final AbstractC5368c h(String str) {
        AbstractC3557B.c0("featureName", str);
        return (AbstractC5368c) this.f46434e.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r5.d
    public final void i(AbstractC5366a abstractC5366a) {
        C6774a c6774a;
        AtomicBoolean atomicBoolean;
        Context context;
        A5.d dVar;
        y5.h hVar = new y5.h(r(), abstractC5366a, this.f46438i);
        this.f46434e.put(abstractC5366a.getName(), hVar);
        Context context2 = this.f46435f;
        AbstractC3557B.c0("context", context2);
        AbstractC3557B.c0("instanceId", this.f46430a);
        AtomicBoolean atomicBoolean2 = hVar.f50815d;
        if (!atomicBoolean2.get()) {
            AbstractC5366a abstractC5366a2 = hVar.f50813b;
            boolean z10 = abstractC5366a2 instanceof r5.e;
            y5.d dVar2 = hVar.f50812a;
            if (z10) {
                C6774a c6774a2 = new C6774a(dVar2.f50781E, AbstractC4194d.p(dVar2.f50782F));
                r5.e eVar = (r5.e) abstractC5366a2;
                C5677c a5 = eVar.a();
                long r10 = AbstractC4194d.r(dVar2.f50780D);
                dVar2.a();
                a5.getClass();
                G5.e eVar2 = new G5.e(r10, 4194304L, 524288L, 500, 64800000L, 536870912L, 1000L);
                C5.b bVar = new C5.b(abstractC5366a2.getName(), c6774a2, eVar2, hVar.f50814c, dVar2.f50790h);
                if (context2 instanceof Application) {
                    B5.c cVar = new B5.c(bVar);
                    hVar.f50821j = cVar;
                    ((Application) context2).registerActivityLifecycleCallbacks(cVar);
                }
                hVar.f50820i = bVar;
                String name = eVar.getName();
                K5.a aVar = dVar2.f50791i;
                File c10 = dVar2.c();
                ExecutorService b10 = dVar2.b();
                C5.c cVar2 = hVar.f50820i;
                AbstractC3557B.c0("consentProvider", aVar);
                AbstractC3557B.c0("featureName", name);
                AbstractC5091c abstractC5091c = hVar.f50814c;
                AbstractC3557B.c0("internalLogger", abstractC5091c);
                AbstractC3557B.c0("metricsDispatcher", cVar2);
                Locale locale = Locale.US;
                atomicBoolean = atomicBoolean2;
                H5.c cVar3 = new H5.c(aVar, new I5.d(new File(c10, String.format(locale, "%s-pending-v2", Arrays.copyOf(new Object[]{name}, 1))), eVar2, abstractC5091c, cVar2), new I5.d(new File(c10, String.format(locale, "%s-v2", Arrays.copyOf(new Object[]{name}, 1))), eVar2, abstractC5091c, cVar2), new H5.a(new G5.c(abstractC5091c), abstractC5091c), b10, abstractC5091c);
                hVar.f50817f = new F5.f(dVar2.b(), cVar3.f7451Z, cVar3.f7450Y, new I5.k(abstractC5091c), new G5.i(abstractC5091c), new G5.c(abstractC5091c), hVar.f50814c, eVar2, hVar.f50820i);
                c6774a = c6774a2;
                context = context2;
            } else {
                atomicBoolean = atomicBoolean2;
                context = context2;
                c6774a = null;
            }
            abstractC5366a2.e(context);
            if ((abstractC5366a2 instanceof r5.e) && c6774a != null) {
                AbstractC5577b d10 = ((r5.e) abstractC5366a2).d();
                if (dVar2.f50802t) {
                    Wh.w wVar = dVar2.f50794l;
                    if (wVar != null) {
                        String str = dVar2.f50801s;
                        M5.a aVar2 = dVar2.f50778B;
                        if (aVar2 != null) {
                            A5.b bVar2 = new A5.b(d10, hVar.f50814c, wVar, str, aVar2);
                            hVar.f50818g = bVar2;
                            l lVar = hVar.f50817f;
                            AbstractC6542a abstractC6542a = dVar2.f50793k;
                            E5.e eVar3 = dVar2.f50788f;
                            M5.j jVar = dVar2.f50789g;
                            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = dVar2.f50807y;
                            if (scheduledThreadPoolExecutor != null) {
                                dVar = new A5.d(hVar.f50814c, abstractC6542a, c6774a, bVar2, eVar3, lVar, jVar, scheduledThreadPoolExecutor);
                            } else {
                                AbstractC3557B.C2("uploadExecutorService");
                                throw null;
                            }
                        } else {
                            AbstractC3557B.C2("androidInfoProvider");
                            throw null;
                        }
                    } else {
                        AbstractC3557B.C2("okHttpClient");
                        throw null;
                    }
                } else {
                    dVar = new Object();
                }
                hVar.f50819h = dVar;
                dVar.p();
            }
            if (abstractC5366a2 instanceof h6.b) {
                dVar2.f50791i.d((h6.b) abstractC5366a2);
            }
            atomicBoolean.set(true);
        }
        String name2 = abstractC5366a.getName();
        if (AbstractC3557B.K(name2, "logs")) {
            r().f50805w.i(this, d6.c.f28027Z);
        } else if (AbstractC3557B.K(name2, "rum")) {
            r().f50805w.i(this, d6.c.f28026Y);
        }
    }

    @Override // r5.d
    public final void j(String str, wf.k kVar) {
        AbstractC6542a q10;
        y5.h hVar = (y5.h) this.f46434e.get(str);
        if (hVar != null && (q10 = q()) != null) {
            synchronized (hVar) {
                LinkedHashMap m12 = AbstractC4268D.m1(q10.a(str));
                kVar.invoke(m12);
                q10.b(str, m12);
            }
        }
    }

    @Override // u5.g
    public final void k(byte[] bArr) {
        File file = new File(new File(r().c(), "ndk_crash_reports_v2"), "last_view_event");
        File parentFile = file.getParentFile();
        if (parentFile != null && AbstractC4344b.g0(parentFile, this.f46438i)) {
            ((G5.h) this.f46436g.getValue()).b(file, new t5.d(bArr), false);
            return;
        }
        P4.a.m0(this.f46438i, 4, EnumC5090b.f42739Z, new e(file, 0), null, false, 56);
    }

    @Override // r5.d
    public final AbstractC5091c l() {
        return this.f46438i;
    }

    @Override // u5.g
    public final D5.a m() {
        return r().f50787e;
    }

    @Override // u5.g
    public final ExecutorService n() {
        return r().b();
    }

    @Override // u5.g
    public final C5271a o() {
        AbstractC6542a q10 = q();
        if (q10 != null) {
            return q10.getContext();
        }
        return null;
    }

    @Override // p5.AbstractC5092d
    public final void p(String str, String str2, String str3, Map map) {
        r().f50792j.o(new q5.g(str, str2, str3, map));
    }

    public final AbstractC6542a q() {
        if (r().f50785c.get()) {
            return r().f50793k;
        }
        return null;
    }

    public final y5.d r() {
        y5.d dVar = this.f46433d;
        if (dVar != null) {
            return dVar;
        }
        AbstractC3557B.C2("coreFeature");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f6, code lost:
        if (r13 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(C5975b c5975b) {
        boolean z10;
        C5975b c5975b2;
        y5.d dVar;
        Map map;
        Map map2;
        String str;
        C5974a c5974a;
        PackageInfo packageInfo;
        String str2;
        ActivityManager activityManager;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        C1665j c1665j;
        String str3;
        E5.e eVar;
        C0823k c0823k;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ?? r13;
        PackageManager.PackageInfoFlags of2;
        Pattern compile = Pattern.compile("[a-zA-Z0-9_:./-]{0,195}[a-zA-Z0-9_./-]");
        AbstractC3557B.b0("compile(...)", compile);
        String str4 = c5975b.f47254c;
        AbstractC3557B.c0("input", str4);
        if (compile.matcher(str4).matches()) {
            Context context = this.f46435f;
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            C5974a c5974a2 = c5975b.f47252a;
            if (z10 & c5974a2.f47243b) {
                C5974a a5 = C5974a.a(c5974a2, false, null, 1, 1, 2023);
                String str5 = c5975b.f47253b;
                AbstractC3557B.c0("clientToken", str5);
                String str6 = c5975b.f47255d;
                AbstractC3557B.c0("variant", str6);
                Map map3 = c5975b.f47258g;
                AbstractC3557B.c0("additionalConfig", map3);
                C5975b c5975b3 = new C5975b(a5, str5, str4, str6, c5975b.f47256e, c5975b.f47257f, map3);
                this.f46439j = true;
                AbstractC4918b.f40605c = 2;
                c5975b2 = c5975b3;
            } else {
                c5975b2 = c5975b;
            }
            wf.k kVar = this.f46432c;
            AbstractC5091c abstractC5091c = this.f46438i;
            if (kVar != null) {
                dVar = new y5.d(abstractC5091c, kVar);
            } else {
                dVar = new y5.d(abstractC5091c, C6543b.f50765Z);
            }
            this.f46433d = dVar;
            y5.d r10 = r();
            String str7 = this.f46430a;
            AbstractC3557B.c0("sdkInstanceId", str7);
            AtomicBoolean atomicBoolean = r10.f50785c;
            boolean z11 = atomicBoolean.get();
            Map map4 = c5975b2.f47258g;
            if (z11) {
                map = map4;
            } else {
                C5974a c5974a3 = c5975b2.f47252a;
                r10.f50780D = c5974a3.f47245d;
                r10.f50781E = c5974a3.f47246e;
                r10.f50806x = c5974a3.f47249h;
                String packageName = context.getPackageName();
                AbstractC3557B.b0("appContext.packageName", packageName);
                r10.f50797o = packageName;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (Build.VERSION.SDK_INT >= 33) {
                        String str8 = r10.f50797o;
                        of2 = PackageManager.PackageInfoFlags.of(0L);
                        packageInfo = packageManager.getPackageInfo(str8, of2);
                    } else {
                        packageInfo = packageManager.getPackageInfo(r10.f50797o, 0);
                    }
                    str = "appContext.packageName";
                    c5974a = c5974a3;
                    map2 = map4;
                } catch (PackageManager.NameNotFoundException e10) {
                    str = "appContext.packageName";
                    c5974a = c5974a3;
                    map2 = map4;
                    P4.a.m0(r10.f50783a, 5, EnumC5090b.f42738Y, C6544c.f50768Z, e10, false, 48);
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    str2 = packageInfo.versionName;
                    if (str2 == null) {
                        str2 = String.valueOf(packageInfo.versionCode);
                    }
                }
                str2 = Separators.QUESTION;
                r10.f50798p = new M5.g(str2);
                r10.f50796n = c5975b2.f47253b;
                String str9 = c5975b2.f47256e;
                if (str9 == null) {
                    str9 = context.getPackageName();
                    AbstractC3557B.b0(str, str9);
                }
                r10.f50799q = str9;
                r10.f50803u = c5975b2.f47254c;
                r10.f50804v = c5975b2.f47255d;
                r10.f50786d = new WeakReference(context);
                int myPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                if (systemService instanceof ActivityManager) {
                    activityManager = (ActivityManager) systemService;
                } else {
                    activityManager = null;
                }
                if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                    Iterator it = runningAppProcesses.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            r13 = it.next();
                            if (((ActivityManager.RunningAppProcessInfo) r13).pid == myPid) {
                                break;
                            }
                        } else {
                            r13 = 0;
                            break;
                        }
                    }
                    runningAppProcessInfo = r13;
                } else {
                    runningAppProcessInfo = null;
                }
                if (runningAppProcessInfo == null) {
                    r10.f50802t = true;
                } else {
                    r10.f50802t = AbstractC3557B.K(context.getPackageName(), runningAppProcessInfo.processName);
                }
                AbstractC5091c abstractC5091c2 = r10.f50783a;
                r10.f50807y = new N5.a(abstractC5091c2);
                ExecutorService executorService = (ExecutorService) r10.f50784b.invoke(abstractC5091c2);
                AbstractC3557B.c0("<set-?>", executorService);
                r10.f50808z = executorService;
                H.w0(r10.b(), "NTP Sync initialization", Q5.c.f14433a, new RunnableC5841a(r10, 1, context));
                if (c5974a.f47242a) {
                    c1665j = C1665j.f21214g;
                } else {
                    C1664i c1664i = new C1664i(C1665j.f21212e);
                    c1664i.e(Wh.H.TLS_1_2, Wh.H.TLS_1_3);
                    C1663h[] c1663hArr = y5.d.f50776I;
                    c1664i.b((C1663h[]) Arrays.copyOf(c1663hArr, c1663hArr.length));
                    c1665j = c1664i.a();
                }
                v vVar = new v();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                AbstractC3557B.c0("unit", timeUnit);
                long j6 = y5.d.f50774G;
                vVar.f21288w = Xh.b.b("timeout", j6, timeUnit);
                vVar.f21291z = Xh.b.b("timeout", j6, timeUnit);
                vVar.a(AbstractC4344b.G0(x.HTTP_2, x.HTTP_1_1));
                List F02 = AbstractC4344b.F0(c1665j);
                if (!AbstractC3557B.K(F02, vVar.f21283r)) {
                    vVar.f21265C = null;
                }
                vVar.f21283r = Xh.b.x(F02);
                vVar.f21268c.add(new A5.g(abstractC5091c2));
                Proxy proxy = c5974a.f47247f;
                if (proxy != null) {
                    if (!AbstractC3557B.K(proxy, vVar.f21277l)) {
                        c0823k = null;
                        vVar.f21265C = null;
                    } else {
                        c0823k = null;
                    }
                    vVar.f21277l = proxy;
                    AbstractC1657b abstractC1657b = c5974a.f47248g;
                    AbstractC3557B.c0("proxyAuthenticator", abstractC1657b);
                    if (!AbstractC3557B.K(abstractC1657b, vVar.f21279n)) {
                        vVar.f21265C = c0823k;
                    }
                    vVar.f21279n = abstractC1657b;
                }
                A5.i iVar = new A5.i();
                if (!AbstractC3557B.K(iVar, vVar.f21276k)) {
                    vVar.f21265C = null;
                }
                vVar.f21276k = iVar;
                r10.f50794l = new Wh.w(vVar);
                D5.a aVar = r10.f50787e;
                aVar.getClass();
                Map map5 = c5974a.f47244c;
                AbstractC3557B.c0("hostsWithHeaderTypes", map5);
                LinkedHashMap linkedHashMap = aVar.f3417a;
                Set entrySet = map5.entrySet();
                int n02 = P4.a.n0(AbstractC6583a.H1(entrySet, 10));
                if (n02 < 16) {
                    n02 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(n02);
                for (Iterator it2 = entrySet.iterator(); it2.hasNext(); it2 = it2) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Locale locale = Locale.US;
                    linkedHashMap2.put(AbstractC6463a.j("US", locale, (String) entry.getKey(), locale, "this as java.lang.String).toLowerCase(locale)"), entry.getValue());
                }
                aVar.f3417a = AbstractC4268D.e1(linkedHashMap, linkedHashMap2);
                r10.f50778B = new M5.f(context);
                o0 o0Var = new o0(3, context, str7);
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    Object mo122invoke = o0Var.mo122invoke();
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    r10.f50777A = (File) mo122invoke;
                    map = map2;
                    Object obj = map.get("_dd.native_source_type");
                    if (obj instanceof String) {
                        str3 = (String) obj;
                    } else {
                        str3 = null;
                    }
                    if (r10.f50802t) {
                        File c10 = r10.c();
                        ExecutorService b10 = r10.b();
                        d6.f fVar = new d6.f(abstractC5091c2);
                        F5.j jVar = new F5.j(abstractC5091c2);
                        E5.d dVar2 = new E5.d(abstractC5091c2);
                        P5.d dVar3 = new P5.d(abstractC5091c2);
                        I5.k kVar2 = new I5.k(abstractC5091c2);
                        G5.i iVar2 = new G5.i(abstractC5091c2);
                        if (str3 == null) {
                            str3 = "ndk";
                        }
                        d6.b bVar = new d6.b(c10, b10, fVar, jVar, dVar2, dVar3, abstractC5091c2, kVar2, iVar2, str3);
                        r10.f50805w = bVar;
                        bVar.b();
                    }
                    r10.f50791i = new K5.b();
                    M5.c cVar = new M5.c(abstractC5091c2);
                    r10.f50789g = cVar;
                    cVar.F(context);
                    H5.h hVar = new H5.h(new d6.g(r10.c(), r10.f50791i, r10.b(), new G5.i(abstractC5091c2), new G5.c(abstractC5091c2), r10.f50783a, r10.a(), 0), r10.b(), abstractC5091c2);
                    if (Build.VERSION.SDK_INT >= 24) {
                        eVar = new E5.c(hVar, abstractC5091c2);
                    } else {
                        eVar = new E5.a(hVar);
                    }
                    r10.f50788f = eVar;
                    eVar.F(context);
                    r10.f50792j = new P5.a(new H5.h(new d6.g(r10.c(), r10.f50791i, r10.b(), new G5.i(abstractC5091c2), new G5.c(abstractC5091c2), r10.f50783a, r10.a(), 1), r10.b(), abstractC5091c2));
                    atomicBoolean.set(true);
                    r10.f50793k = new y5.e(r10);
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th2;
                }
            }
            Object obj2 = map.get("_dd.source");
            if (obj2 != null && (obj2 instanceof String) && (!n.n2((CharSequence) obj2))) {
                r().f50800r = (String) obj2;
            }
            Object obj3 = map.get("_dd.sdk_version");
            if (obj3 != null && (obj3 instanceof String) && (!n.n2((CharSequence) obj3))) {
                r().f50801s = (String) obj3;
            }
            Object obj4 = map.get("_dd.version");
            if (obj4 != null && (obj4 instanceof String) && (!n.n2((CharSequence) obj4))) {
                r().f50798p.h((String) obj4);
            }
            if (c5975b2.f47257f) {
                i(new T5.a(this));
            }
            if (context instanceof Application) {
                B5.c cVar2 = new B5.c(new B5.a(context, abstractC5091c));
                ((Application) context).registerActivityLifecycleCallbacks(cVar2);
                this.f46437h = cVar2;
            }
            EnumC5090b enumC5090b = EnumC5090b.f42739Z;
            try {
                Runtime.getRuntime().addShutdownHook(new Thread(new RunnableC3111d(27, this), "datadog_shutdown"));
            } catch (IllegalArgumentException e11) {
                P4.a.m0(this.f46438i, 5, enumC5090b, d.f46421h0, e11, false, 48);
            } catch (IllegalStateException e12) {
                P4.a.m0(this.f46438i, 5, enumC5090b, d.f46420Z, e12, false, 48);
                t();
            } catch (SecurityException e13) {
                P4.a.m0(this.f46438i, 5, enumC5090b, d.f46422i0, e13, false, 48);
            }
            RunnableC5841a runnableC5841a = new RunnableC5841a(this, 0, c5975b);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = r().f50807y;
            if (scheduledThreadPoolExecutor != null) {
                H.n0(scheduledThreadPoolExecutor, "Configuration telemetry", f46428k, TimeUnit.MILLISECONDS, this.f46438i, runnableC5841a);
                return;
            } else {
                AbstractC3557B.C2("uploadExecutorService");
                throw null;
            }
        }
        throw new IllegalArgumentException("The environment name should contain maximum 196 of the following allowed characters [a-zA-Z0-9_:./-] and should never finish with a semicolon.In this case the Datadog SDK will not be initialised.");
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [d6.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, K5.a] */
    /* JADX WARN: Type inference failed for: r1v7, types: [y5.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [O5.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, K5.a] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, P5.b] */
    /* JADX WARN: Type inference failed for: r5v13, types: [M5.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [E5.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [M5.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, M5.b] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, A5.j] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, F5.l] */
    /* JADX WARN: Type inference failed for: r6v17, types: [A5.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [C5.c, java.lang.Object] */
    public final void t() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        B5.c cVar;
        Application application;
        LinkedHashMap linkedHashMap = this.f46434e;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            y5.h hVar = (y5.h) entry.getValue();
            AtomicBoolean atomicBoolean = hVar.f50815d;
            if (atomicBoolean.get()) {
                AbstractC5366a abstractC5366a = hVar.f50813b;
                abstractC5366a.c();
                boolean z10 = abstractC5366a instanceof h6.b;
                y5.d dVar = hVar.f50812a;
                if (z10) {
                    dVar.f50791i.x((h6.b) abstractC5366a);
                }
                hVar.f50819h.H();
                hVar.f50819h = new Object();
                hVar.f50817f = new Object();
                hVar.f50818g = new Object();
                hVar.f50820i = new Object();
                Object obj = dVar.f50786d.get();
                if (obj instanceof Application) {
                    application = (Application) obj;
                } else {
                    application = null;
                }
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(hVar.f50821j);
                }
                hVar.f50821j = null;
                atomicBoolean.set(false);
            }
        }
        linkedHashMap.clear();
        Context context = this.f46435f;
        if ((context instanceof Application) && (cVar = this.f46437h) != null) {
            ((Application) context).unregisterActivityLifecycleCallbacks(cVar);
        }
        y5.d r10 = r();
        EnumC5090b enumC5090b = EnumC5090b.f42739Z;
        AtomicBoolean atomicBoolean2 = r10.f50785c;
        if (atomicBoolean2.get()) {
            Context context2 = (Context) r10.f50786d.get();
            if (context2 != null) {
                r10.f50788f.a(context2);
                r10.f50789g.a(context2);
            }
            r10.f50786d.clear();
            r10.f50791i.f();
            r10.f50796n = "";
            r10.f50797o = "";
            r10.f50798p = new Object();
            r10.f50799q = "";
            r10.f50800r = "android";
            r10.f50801s = "2.6.2";
            r10.f50802t = true;
            r10.f50803u = "";
            r10.f50804v = "";
            r10.f50787e = new D5.a(w.f37484Y);
            r10.f50788f = new Object();
            r10.f50789g = new Object();
            r10.f50790h = new Object();
            r10.f50791i = new Object();
            r10.f50792j = new Object();
            r10.f50778B = new Object();
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = r10.f50807y;
            if (scheduledThreadPoolExecutor2 != null) {
                scheduledThreadPoolExecutor2.shutdownNow();
                r10.b().shutdownNow();
                try {
                    try {
                        scheduledThreadPoolExecutor = r10.f50807y;
                    } catch (SecurityException e10) {
                        P4.a.m0(r10.f50783a, 5, enumC5090b, C6544c.f50770i0, e10, false, 48);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                if (scheduledThreadPoolExecutor != null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    scheduledThreadPoolExecutor.awaitTermination(1L, timeUnit);
                    r10.b().awaitTermination(1L, timeUnit);
                    try {
                        X8.a aVar = r10.f50795m;
                        if (aVar != null) {
                            Y8.g gVar = aVar.f21800Y;
                            gVar.a();
                            gVar.f22122a.set(Y8.e.f22119h0);
                            gVar.f22124c.shutdown();
                        }
                    } catch (IllegalStateException e11) {
                        P4.a.m0(r10.f50783a, 4, enumC5090b, C6544c.f50771j0, e11, false, 48);
                    }
                    r10.f50779C.clear();
                    atomicBoolean2.set(false);
                    r10.f50805w = new Object();
                    r10.f50791i = new Object();
                    r10.f50793k = new Object();
                    return;
                }
                AbstractC3557B.C2("uploadExecutorService");
                throw null;
            }
            AbstractC3557B.C2("uploadExecutorService");
            throw null;
        }
    }
}
