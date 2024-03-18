package io.sentry;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import g.RunnableC3115h;
import io.sentry.android.core.C3617h;
import j$.util.concurrent.ConcurrentHashMap;
import j7.RunnableC3921k;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public abstract class L0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f33815a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static volatile G f33816b = C3681r0.f34689b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f33817c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f33818d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public static final long f33819e = System.currentTimeMillis();

    public static synchronized void a() {
        synchronized (L0.class) {
            G c10 = c();
            f33816b = C3681r0.f34689b;
            f33815a.remove();
            c10.c(false);
        }
    }

    public static void b(long j6) {
        c().l(j6);
    }

    public static G c() {
        if (f33817c) {
            return f33816b;
        }
        ThreadLocal threadLocal = f33815a;
        G g10 = (G) threadLocal.get();
        if (g10 == null || (g10 instanceof C3681r0)) {
            G mo84clone = f33816b.mo84clone();
            threadLocal.set(mo84clone);
            return mo84clone;
        }
        return g10;
    }

    public static S d() {
        if (f33817c && io.sentry.util.d.f34775a) {
            return c().v();
        }
        return c().q();
    }

    public static void e(S4.o oVar, C3617h c3617h) {
        final r1 r1Var = (r1) ((Class) oVar.f16184Z).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        try {
            c3617h.a(r1Var);
        } catch (Throwable th2) {
            r1Var.getLogger().d(EnumC3642e1.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th2);
        }
        synchronized (L0.class) {
            try {
                if (g()) {
                    r1Var.getLogger().f(EnumC3642e1.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                }
                if (f(r1Var)) {
                    r1Var.getLogger().f(EnumC3642e1.INFO, "GlobalHubMode: '%s'", String.valueOf(true));
                    f33817c = true;
                    G c10 = c();
                    if (r1Var.getDsn() != null && !r1Var.getDsn().isEmpty()) {
                        f33816b = new C3696z(r1Var, new U3.e(r1Var.getLogger(), new D1(r1Var, new P0(r1Var), new D0(r1Var))));
                        f33815a.set(f33816b);
                        c10.c(true);
                        if (r1Var.getExecutorService().f()) {
                            r1Var.setExecutorService(new C3609a1());
                        }
                        for (X x10 : r1Var.getIntegrations()) {
                            x10.h(r1Var);
                        }
                        r1Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.J0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i10 = r2;
                                r1 r1Var2 = r1Var;
                                switch (i10) {
                                    case 0:
                                        String cacheDirPathWithoutDsn = r1Var2.getCacheDirPathWithoutDsn();
                                        if (cacheDirPathWithoutDsn != null) {
                                            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                                            try {
                                                com.google.android.gms.internal.play_billing.N.x(file);
                                                if (r1Var2.isEnableAppStartProfiling()) {
                                                    if (!r1Var2.isTracingEnabled()) {
                                                        r1Var2.getLogger().f(EnumC3642e1.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                                    } else if (file.createNewFile()) {
                                                        M0 m02 = new M0(r1Var2, new H1(r1Var2).a(new U3.e(new I1("app.launch", io.sentry.protocol.B.CUSTOM, "profile", null))));
                                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, L0.f33818d));
                                                        r1Var2.getSerializer().n(m02, bufferedWriter);
                                                        bufferedWriter.close();
                                                        fileOutputStream.close();
                                                    }
                                                }
                                                return;
                                            } catch (Throwable th3) {
                                                r1Var2.getLogger().d(EnumC3642e1.ERROR, "Unable to create app start profiling config file. ", th3);
                                                return;
                                            }
                                        }
                                        return;
                                    default:
                                        Iterator<J> it = r1Var2.getOptionsObservers().iterator();
                                        while (it.hasNext()) {
                                            String release = r1Var2.getRelease();
                                            io.sentry.cache.e eVar = (io.sentry.cache.e) it.next();
                                            if (release == null) {
                                                io.sentry.cache.a.a(eVar.f34295a, ".options-cache", "release.json");
                                            } else {
                                                eVar.b("release.json", release);
                                            }
                                            String proguardUuid = r1Var2.getProguardUuid();
                                            if (proguardUuid == null) {
                                                io.sentry.cache.a.a(eVar.f34295a, ".options-cache", "proguard-uuid.json");
                                            } else {
                                                eVar.b("proguard-uuid.json", proguardUuid);
                                            }
                                            io.sentry.protocol.q sdkVersion = r1Var2.getSdkVersion();
                                            if (sdkVersion == null) {
                                                io.sentry.cache.a.a(eVar.f34295a, ".options-cache", "sdk-version.json");
                                            } else {
                                                eVar.b("sdk-version.json", sdkVersion);
                                            }
                                            String dist = r1Var2.getDist();
                                            if (dist == null) {
                                                io.sentry.cache.a.a(eVar.f34295a, ".options-cache", "dist.json");
                                            } else {
                                                eVar.b("dist.json", dist);
                                            }
                                            String environment = r1Var2.getEnvironment();
                                            if (environment == null) {
                                                io.sentry.cache.a.a(eVar.f34295a, ".options-cache", "environment.json");
                                            } else {
                                                eVar.b("environment.json", environment);
                                            }
                                            eVar.b("tags.json", r1Var2.getTags());
                                        }
                                        return;
                                }
                            }
                        });
                        r1Var.getExecutorService().submit(new A0(r1Var));
                        r1Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.J0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i10 = r2;
                                r1 r1Var2 = r1Var;
                                switch (i10) {
                                    case 0:
                                        String cacheDirPathWithoutDsn = r1Var2.getCacheDirPathWithoutDsn();
                                        if (cacheDirPathWithoutDsn != null) {
                                            File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                                            try {
                                                com.google.android.gms.internal.play_billing.N.x(file);
                                                if (r1Var2.isEnableAppStartProfiling()) {
                                                    if (!r1Var2.isTracingEnabled()) {
                                                        r1Var2.getLogger().f(EnumC3642e1.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                                    } else if (file.createNewFile()) {
                                                        M0 m02 = new M0(r1Var2, new H1(r1Var2).a(new U3.e(new I1("app.launch", io.sentry.protocol.B.CUSTOM, "profile", null))));
                                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, L0.f33818d));
                                                        r1Var2.getSerializer().n(m02, bufferedWriter);
                                                        bufferedWriter.close();
                                                        fileOutputStream.close();
                                                    }
                                                }
                                                return;
                                            } catch (Throwable th3) {
                                                r1Var2.getLogger().d(EnumC3642e1.ERROR, "Unable to create app start profiling config file. ", th3);
                                                return;
                                            }
                                        }
                                        return;
                                    default:
                                        Iterator<J> it = r1Var2.getOptionsObservers().iterator();
                                        while (it.hasNext()) {
                                            String release = r1Var2.getRelease();
                                            io.sentry.cache.e eVar = (io.sentry.cache.e) it.next();
                                            if (release == null) {
                                                io.sentry.cache.a.a(eVar.f34295a, ".options-cache", "release.json");
                                            } else {
                                                eVar.b("release.json", release);
                                            }
                                            String proguardUuid = r1Var2.getProguardUuid();
                                            if (proguardUuid == null) {
                                                io.sentry.cache.a.a(eVar.f34295a, ".options-cache", "proguard-uuid.json");
                                            } else {
                                                eVar.b("proguard-uuid.json", proguardUuid);
                                            }
                                            io.sentry.protocol.q sdkVersion = r1Var2.getSdkVersion();
                                            if (sdkVersion == null) {
                                                io.sentry.cache.a.a(eVar.f34295a, ".options-cache", "sdk-version.json");
                                            } else {
                                                eVar.b("sdk-version.json", sdkVersion);
                                            }
                                            String dist = r1Var2.getDist();
                                            if (dist == null) {
                                                io.sentry.cache.a.a(eVar.f34295a, ".options-cache", "dist.json");
                                            } else {
                                                eVar.b("dist.json", dist);
                                            }
                                            String environment = r1Var2.getEnvironment();
                                            if (environment == null) {
                                                io.sentry.cache.a.a(eVar.f34295a, ".options-cache", "environment.json");
                                            } else {
                                                eVar.b("environment.json", environment);
                                            }
                                            eVar.b("tags.json", r1Var2.getTags());
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    throw new IllegalArgumentException("Hub requires a DSN to be instantiated. Considering using the NoOpHub if no DSN is available.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0332 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x030a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x032c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0280 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x031e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c A[LOOP:0: B:46:0x0176->B:48:0x017c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cb A[LOOP:1: B:53:0x01c5->B:55:0x01cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e7 A[LOOP:2: B:57:0x01e1->B:59:0x01e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0248 A[LOOP:4: B:79:0x0242->B:81:0x0248, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c A[LOOP:5: B:83:0x0266->B:85:0x026c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c0  */
    /* JADX WARN: Type inference failed for: r0v16, types: [U3.e, java.lang.Object, io.sentry.internal.debugmeta.a] */
    /* JADX WARN: Type inference failed for: r11v2, types: [io.sentry.o1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [io.sentry.m1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(r1 r1Var) {
        io.sentry.cache.d dVar;
        Properties properties;
        Properties w10;
        io.sentry.config.b bVar;
        String a5;
        Double valueOf;
        String a10;
        Double valueOf2;
        String a11;
        String a12;
        List<String> list;
        String a13;
        Long valueOf3;
        String a14;
        Long valueOf4;
        String a15;
        Long valueOf5;
        String a16;
        Long valueOf6;
        String a17;
        InputStream resourceAsStream;
        Properties w11;
        Properties w12;
        if (r1Var.isEnableExternalConfiguration()) {
            jh.H1 h12 = new jh.H1(1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new io.sentry.config.a("sentry.", System.getProperties()));
            arrayList.add(new Object());
            String property = System.getProperty("sentry.properties.file");
            if (property != null && (w12 = new U3.c(property, 24, h12).w()) != null) {
                arrayList.add(new io.sentry.config.e(w12));
            }
            String str = System.getenv("SENTRY_PROPERTIES_FILE");
            if (str != null && (w11 = new U3.c(str, 24, h12).w()) != null) {
                arrayList.add(new io.sentry.config.e(w11));
            }
            ClassLoader classLoader = io.sentry.android.core.z.class.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            Long l10 = null;
            try {
                resourceAsStream = classLoader.getResourceAsStream("sentry.properties");
            } catch (IOException e10) {
                h12.b(EnumC3642e1.ERROR, e10, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
            }
            if (resourceAsStream != null) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                resourceAsStream.close();
                if (properties != null) {
                    arrayList.add(new io.sentry.config.e(properties));
                }
                w10 = new U3.c("sentry.properties", 24, h12).w();
                if (w10 != null) {
                    arrayList.add(new io.sentry.config.e(w10));
                }
                bVar = new io.sentry.config.b(arrayList);
                H logger = r1Var.getLogger();
                C3682s c3682s = new C3682s();
                c3682s.f34694a = bVar.a("dsn");
                c3682s.f34695b = bVar.a("environment");
                c3682s.f34696c = bVar.a("release");
                c3682s.f34697d = bVar.a("dist");
                c3682s.f34698e = bVar.a("servername");
                c3682s.f34699f = bVar.c("uncaught.handler.enabled");
                c3682s.f34714u = bVar.c("uncaught.handler.print-stacktrace");
                c3682s.f34702i = bVar.c("enable-tracing");
                a5 = bVar.a("traces-sample-rate");
                if (a5 != null) {
                    try {
                        valueOf = Double.valueOf(a5);
                    } catch (NumberFormatException unused) {
                    }
                    c3682s.f34703j = valueOf;
                    a10 = bVar.a("profiles-sample-rate");
                    if (a10 != null) {
                        try {
                            valueOf2 = Double.valueOf(a10);
                        } catch (NumberFormatException unused2) {
                        }
                        c3682s.f34704k = valueOf2;
                        c3682s.f34700g = bVar.c("debug");
                        c3682s.f34701h = bVar.c("enable-deduplication");
                        c3682s.f34715v = bVar.c("send-client-reports");
                        a11 = bVar.a("max-request-body-size");
                        if (a11 != null) {
                            p1.valueOf(a11.toUpperCase(Locale.ROOT));
                        }
                        for (Map.Entry entry : ((ConcurrentHashMap) bVar.b()).entrySet()) {
                            c3682s.f34705l.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        a12 = bVar.a("proxy.host");
                        String a18 = bVar.a("proxy.user");
                        String a19 = bVar.a("proxy.pass");
                        String d10 = bVar.d();
                        if (a12 != null) {
                            ?? obj = new Object();
                            obj.f34456a = a12;
                            obj.f34457b = d10;
                            obj.f34458c = a18;
                            obj.f34459d = a19;
                            c3682s.f34706m = obj;
                        }
                        for (String str2 : AbstractC2469q0.a(bVar, "in-app-includes")) {
                            c3682s.f34708o.add(str2);
                        }
                        for (String str3 : AbstractC2469q0.a(bVar, "in-app-excludes")) {
                            c3682s.f34707n.add(str3);
                        }
                        if (bVar.a("trace-propagation-targets") == null) {
                            list = AbstractC2469q0.a(bVar, "trace-propagation-targets");
                        } else {
                            list = null;
                        }
                        if (list == null && bVar.a("tracing-origins") != null) {
                            list = AbstractC2469q0.a(bVar, "tracing-origins");
                        }
                        if (list != null) {
                            for (String str4 : list) {
                                if (c3682s.f34709p == null) {
                                    c3682s.f34709p = new CopyOnWriteArrayList();
                                }
                                if (!str4.isEmpty()) {
                                    c3682s.f34709p.add(str4);
                                }
                            }
                        }
                        for (String str5 : AbstractC2469q0.a(bVar, "context-tags")) {
                            c3682s.f34710q.add(str5);
                        }
                        c3682s.f34711r = bVar.a("proguard-uuid");
                        for (String str6 : AbstractC2469q0.a(bVar, "bundle-ids")) {
                            c3682s.f34716w.add(str6);
                        }
                        a13 = bVar.a("idle-timeout");
                        if (a13 != null) {
                            try {
                                valueOf3 = Long.valueOf(a13);
                            } catch (NumberFormatException unused3) {
                            }
                            c3682s.f34712s = valueOf3;
                            c3682s.f34717x = bVar.c("enabled");
                            c3682s.f34718y = bVar.c("enable-pretty-serialization-output");
                            c3682s.f34691A = bVar.c("send-modules");
                            c3682s.f34719z = AbstractC2469q0.a(bVar, "ignored-checkins");
                            c3682s.f34692B = bVar.c("enable-backpressure-handling");
                            for (String str7 : AbstractC2469q0.a(bVar, "ignored-exceptions-for-type")) {
                                try {
                                    Class<?> cls = Class.forName(str7);
                                    if (Throwable.class.isAssignableFrom(cls)) {
                                        c3682s.f34713t.add(cls);
                                    } else {
                                        logger.f(EnumC3642e1.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str7, str7);
                                    }
                                } catch (ClassNotFoundException unused4) {
                                    logger.f(EnumC3642e1.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str7, str7);
                                }
                            }
                            a14 = bVar.a("cron.default-checkin-margin");
                            if (a14 != null) {
                                try {
                                    valueOf4 = Long.valueOf(a14);
                                } catch (NumberFormatException unused5) {
                                }
                                a15 = bVar.a("cron.default-max-runtime");
                                if (a15 != null) {
                                    try {
                                        valueOf5 = Long.valueOf(a15);
                                    } catch (NumberFormatException unused6) {
                                    }
                                    String a20 = bVar.a("cron.default-timezone");
                                    a16 = bVar.a("cron.default-failure-issue-threshold");
                                    if (a16 != null) {
                                        try {
                                            valueOf6 = Long.valueOf(a16);
                                        } catch (NumberFormatException unused7) {
                                        }
                                        a17 = bVar.a("cron.default-recovery-threshold");
                                        if (a17 != null) {
                                            try {
                                                l10 = Long.valueOf(a17);
                                            } catch (NumberFormatException unused8) {
                                            }
                                        }
                                        if (valueOf4 == null || valueOf5 != null || a20 != null || valueOf6 != null || l10 != null) {
                                            ?? obj2 = new Object();
                                            obj2.f34424a = valueOf4;
                                            obj2.f34425b = valueOf5;
                                            obj2.f34426c = a20;
                                            obj2.f34427d = valueOf6;
                                            obj2.f34428e = l10;
                                            c3682s.f34693C = obj2;
                                        }
                                        r1Var.merge(c3682s);
                                    }
                                    valueOf6 = null;
                                    a17 = bVar.a("cron.default-recovery-threshold");
                                    if (a17 != null) {
                                    }
                                    if (valueOf4 == null) {
                                    }
                                    ?? obj22 = new Object();
                                    obj22.f34424a = valueOf4;
                                    obj22.f34425b = valueOf5;
                                    obj22.f34426c = a20;
                                    obj22.f34427d = valueOf6;
                                    obj22.f34428e = l10;
                                    c3682s.f34693C = obj22;
                                    r1Var.merge(c3682s);
                                }
                                valueOf5 = null;
                                String a202 = bVar.a("cron.default-timezone");
                                a16 = bVar.a("cron.default-failure-issue-threshold");
                                if (a16 != null) {
                                }
                                valueOf6 = null;
                                a17 = bVar.a("cron.default-recovery-threshold");
                                if (a17 != null) {
                                }
                                if (valueOf4 == null) {
                                }
                                ?? obj222 = new Object();
                                obj222.f34424a = valueOf4;
                                obj222.f34425b = valueOf5;
                                obj222.f34426c = a202;
                                obj222.f34427d = valueOf6;
                                obj222.f34428e = l10;
                                c3682s.f34693C = obj222;
                                r1Var.merge(c3682s);
                            }
                            valueOf4 = null;
                            a15 = bVar.a("cron.default-max-runtime");
                            if (a15 != null) {
                            }
                            valueOf5 = null;
                            String a2022 = bVar.a("cron.default-timezone");
                            a16 = bVar.a("cron.default-failure-issue-threshold");
                            if (a16 != null) {
                            }
                            valueOf6 = null;
                            a17 = bVar.a("cron.default-recovery-threshold");
                            if (a17 != null) {
                            }
                            if (valueOf4 == null) {
                            }
                            ?? obj2222 = new Object();
                            obj2222.f34424a = valueOf4;
                            obj2222.f34425b = valueOf5;
                            obj2222.f34426c = a2022;
                            obj2222.f34427d = valueOf6;
                            obj2222.f34428e = l10;
                            c3682s.f34693C = obj2222;
                            r1Var.merge(c3682s);
                        }
                        valueOf3 = null;
                        c3682s.f34712s = valueOf3;
                        c3682s.f34717x = bVar.c("enabled");
                        c3682s.f34718y = bVar.c("enable-pretty-serialization-output");
                        c3682s.f34691A = bVar.c("send-modules");
                        c3682s.f34719z = AbstractC2469q0.a(bVar, "ignored-checkins");
                        c3682s.f34692B = bVar.c("enable-backpressure-handling");
                        while (r6.hasNext()) {
                        }
                        a14 = bVar.a("cron.default-checkin-margin");
                        if (a14 != null) {
                        }
                        valueOf4 = null;
                        a15 = bVar.a("cron.default-max-runtime");
                        if (a15 != null) {
                        }
                        valueOf5 = null;
                        String a20222 = bVar.a("cron.default-timezone");
                        a16 = bVar.a("cron.default-failure-issue-threshold");
                        if (a16 != null) {
                        }
                        valueOf6 = null;
                        a17 = bVar.a("cron.default-recovery-threshold");
                        if (a17 != null) {
                        }
                        if (valueOf4 == null) {
                        }
                        ?? obj22222 = new Object();
                        obj22222.f34424a = valueOf4;
                        obj22222.f34425b = valueOf5;
                        obj22222.f34426c = a20222;
                        obj22222.f34427d = valueOf6;
                        obj22222.f34428e = l10;
                        c3682s.f34693C = obj22222;
                        r1Var.merge(c3682s);
                    }
                    valueOf2 = null;
                    c3682s.f34704k = valueOf2;
                    c3682s.f34700g = bVar.c("debug");
                    c3682s.f34701h = bVar.c("enable-deduplication");
                    c3682s.f34715v = bVar.c("send-client-reports");
                    a11 = bVar.a("max-request-body-size");
                    if (a11 != null) {
                    }
                    while (r6.hasNext()) {
                    }
                    a12 = bVar.a("proxy.host");
                    String a182 = bVar.a("proxy.user");
                    String a192 = bVar.a("proxy.pass");
                    String d102 = bVar.d();
                    if (a12 != null) {
                    }
                    while (r6.hasNext()) {
                    }
                    while (r6.hasNext()) {
                    }
                    if (bVar.a("trace-propagation-targets") == null) {
                    }
                    if (list == null) {
                        list = AbstractC2469q0.a(bVar, "tracing-origins");
                    }
                    if (list != null) {
                    }
                    while (r6.hasNext()) {
                    }
                    c3682s.f34711r = bVar.a("proguard-uuid");
                    while (r6.hasNext()) {
                    }
                    a13 = bVar.a("idle-timeout");
                    if (a13 != null) {
                    }
                    valueOf3 = null;
                    c3682s.f34712s = valueOf3;
                    c3682s.f34717x = bVar.c("enabled");
                    c3682s.f34718y = bVar.c("enable-pretty-serialization-output");
                    c3682s.f34691A = bVar.c("send-modules");
                    c3682s.f34719z = AbstractC2469q0.a(bVar, "ignored-checkins");
                    c3682s.f34692B = bVar.c("enable-backpressure-handling");
                    while (r6.hasNext()) {
                    }
                    a14 = bVar.a("cron.default-checkin-margin");
                    if (a14 != null) {
                    }
                    valueOf4 = null;
                    a15 = bVar.a("cron.default-max-runtime");
                    if (a15 != null) {
                    }
                    valueOf5 = null;
                    String a202222 = bVar.a("cron.default-timezone");
                    a16 = bVar.a("cron.default-failure-issue-threshold");
                    if (a16 != null) {
                    }
                    valueOf6 = null;
                    a17 = bVar.a("cron.default-recovery-threshold");
                    if (a17 != null) {
                    }
                    if (valueOf4 == null) {
                    }
                    ?? obj222222 = new Object();
                    obj222222.f34424a = valueOf4;
                    obj222222.f34425b = valueOf5;
                    obj222222.f34426c = a202222;
                    obj222222.f34427d = valueOf6;
                    obj222222.f34428e = l10;
                    c3682s.f34693C = obj222222;
                    r1Var.merge(c3682s);
                }
                valueOf = null;
                c3682s.f34703j = valueOf;
                a10 = bVar.a("profiles-sample-rate");
                if (a10 != null) {
                }
                valueOf2 = null;
                c3682s.f34704k = valueOf2;
                c3682s.f34700g = bVar.c("debug");
                c3682s.f34701h = bVar.c("enable-deduplication");
                c3682s.f34715v = bVar.c("send-client-reports");
                a11 = bVar.a("max-request-body-size");
                if (a11 != null) {
                }
                while (r6.hasNext()) {
                }
                a12 = bVar.a("proxy.host");
                String a1822 = bVar.a("proxy.user");
                String a1922 = bVar.a("proxy.pass");
                String d1022 = bVar.d();
                if (a12 != null) {
                }
                while (r6.hasNext()) {
                }
                while (r6.hasNext()) {
                }
                if (bVar.a("trace-propagation-targets") == null) {
                }
                if (list == null) {
                }
                if (list != null) {
                }
                while (r6.hasNext()) {
                }
                c3682s.f34711r = bVar.a("proguard-uuid");
                while (r6.hasNext()) {
                }
                a13 = bVar.a("idle-timeout");
                if (a13 != null) {
                }
                valueOf3 = null;
                c3682s.f34712s = valueOf3;
                c3682s.f34717x = bVar.c("enabled");
                c3682s.f34718y = bVar.c("enable-pretty-serialization-output");
                c3682s.f34691A = bVar.c("send-modules");
                c3682s.f34719z = AbstractC2469q0.a(bVar, "ignored-checkins");
                c3682s.f34692B = bVar.c("enable-backpressure-handling");
                while (r6.hasNext()) {
                }
                a14 = bVar.a("cron.default-checkin-margin");
                if (a14 != null) {
                }
                valueOf4 = null;
                a15 = bVar.a("cron.default-max-runtime");
                if (a15 != null) {
                }
                valueOf5 = null;
                String a2022222 = bVar.a("cron.default-timezone");
                a16 = bVar.a("cron.default-failure-issue-threshold");
                if (a16 != null) {
                }
                valueOf6 = null;
                a17 = bVar.a("cron.default-recovery-threshold");
                if (a17 != null) {
                }
                if (valueOf4 == null) {
                }
                ?? obj2222222 = new Object();
                obj2222222.f34424a = valueOf4;
                obj2222222.f34425b = valueOf5;
                obj2222222.f34426c = a2022222;
                obj2222222.f34427d = valueOf6;
                obj2222222.f34428e = l10;
                c3682s.f34693C = obj2222222;
                r1Var.merge(c3682s);
            } else {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                properties = null;
                if (properties != null) {
                }
                w10 = new U3.c("sentry.properties", 24, h12).w();
                if (w10 != null) {
                }
                bVar = new io.sentry.config.b(arrayList);
                H logger2 = r1Var.getLogger();
                C3682s c3682s2 = new C3682s();
                c3682s2.f34694a = bVar.a("dsn");
                c3682s2.f34695b = bVar.a("environment");
                c3682s2.f34696c = bVar.a("release");
                c3682s2.f34697d = bVar.a("dist");
                c3682s2.f34698e = bVar.a("servername");
                c3682s2.f34699f = bVar.c("uncaught.handler.enabled");
                c3682s2.f34714u = bVar.c("uncaught.handler.print-stacktrace");
                c3682s2.f34702i = bVar.c("enable-tracing");
                a5 = bVar.a("traces-sample-rate");
                if (a5 != null) {
                }
                valueOf = null;
                c3682s2.f34703j = valueOf;
                a10 = bVar.a("profiles-sample-rate");
                if (a10 != null) {
                }
                valueOf2 = null;
                c3682s2.f34704k = valueOf2;
                c3682s2.f34700g = bVar.c("debug");
                c3682s2.f34701h = bVar.c("enable-deduplication");
                c3682s2.f34715v = bVar.c("send-client-reports");
                a11 = bVar.a("max-request-body-size");
                if (a11 != null) {
                }
                while (r6.hasNext()) {
                }
                a12 = bVar.a("proxy.host");
                String a18222 = bVar.a("proxy.user");
                String a19222 = bVar.a("proxy.pass");
                String d10222 = bVar.d();
                if (a12 != null) {
                }
                while (r6.hasNext()) {
                }
                while (r6.hasNext()) {
                }
                if (bVar.a("trace-propagation-targets") == null) {
                }
                if (list == null) {
                }
                if (list != null) {
                }
                while (r6.hasNext()) {
                }
                c3682s2.f34711r = bVar.a("proguard-uuid");
                while (r6.hasNext()) {
                }
                a13 = bVar.a("idle-timeout");
                if (a13 != null) {
                }
                valueOf3 = null;
                c3682s2.f34712s = valueOf3;
                c3682s2.f34717x = bVar.c("enabled");
                c3682s2.f34718y = bVar.c("enable-pretty-serialization-output");
                c3682s2.f34691A = bVar.c("send-modules");
                c3682s2.f34719z = AbstractC2469q0.a(bVar, "ignored-checkins");
                c3682s2.f34692B = bVar.c("enable-backpressure-handling");
                while (r6.hasNext()) {
                }
                a14 = bVar.a("cron.default-checkin-margin");
                if (a14 != null) {
                }
                valueOf4 = null;
                a15 = bVar.a("cron.default-max-runtime");
                if (a15 != null) {
                }
                valueOf5 = null;
                String a20222222 = bVar.a("cron.default-timezone");
                a16 = bVar.a("cron.default-failure-issue-threshold");
                if (a16 != null) {
                }
                valueOf6 = null;
                a17 = bVar.a("cron.default-recovery-threshold");
                if (a17 != null) {
                }
                if (valueOf4 == null) {
                }
                ?? obj22222222 = new Object();
                obj22222222.f34424a = valueOf4;
                obj22222222.f34425b = valueOf5;
                obj22222222.f34426c = a20222222;
                obj22222222.f34427d = valueOf6;
                obj22222222.f34428e = l10;
                c3682s2.f34693C = obj22222222;
                r1Var.merge(c3682s2);
            }
        }
        String dsn = r1Var.getDsn();
        if (r1Var.isEnabled() && (dsn == null || !dsn.isEmpty())) {
            if (dsn != null) {
                new s3.z(dsn);
                H logger3 = r1Var.getLogger();
                if (r1Var.isDebug() && (logger3 instanceof C3683s0)) {
                    r1Var.setLogger(new jh.H1(1));
                    logger3 = r1Var.getLogger();
                }
                EnumC3642e1 enumC3642e1 = EnumC3642e1.INFO;
                logger3.f(enumC3642e1, "Initializing SDK with DSN: '%s'", r1Var.getDsn());
                String outboxPath = r1Var.getOutboxPath();
                if (outboxPath != null) {
                    new File(outboxPath).mkdirs();
                } else {
                    logger3.f(enumC3642e1, "No outbox dir path is defined in options.", new Object[0]);
                }
                String cacheDirPath = r1Var.getCacheDirPath();
                if (cacheDirPath != null) {
                    new File(cacheDirPath).mkdirs();
                    if (r1Var.getEnvelopeDiskCache() instanceof io.sentry.transport.j) {
                        Charset charset = io.sentry.cache.c.f34288l0;
                        String cacheDirPath2 = r1Var.getCacheDirPath();
                        int maxCacheItems = r1Var.getMaxCacheItems();
                        if (cacheDirPath2 == null) {
                            r1Var.getLogger().f(EnumC3642e1.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                            dVar = io.sentry.transport.j.f34748Y;
                        } else {
                            dVar = new io.sentry.cache.c(r1Var, cacheDirPath2, maxCacheItems);
                        }
                        r1Var.setEnvelopeDiskCache(dVar);
                    }
                }
                String profilingTracesDirPath = r1Var.getProfilingTracesDirPath();
                if (r1Var.isProfilingEnabled() && profilingTracesDirPath != null) {
                    File file = new File(profilingTracesDirPath);
                    file.mkdirs();
                    try {
                        r1Var.getExecutorService().submit(new RunnableC3921k(9, file));
                    } catch (RejectedExecutionException e11) {
                        r1Var.getLogger().d(EnumC3642e1.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e11);
                    }
                }
                io.sentry.internal.modules.a modulesLoader = r1Var.getModulesLoader();
                if (!r1Var.isSendModules()) {
                    r1Var.setModulesLoader(io.sentry.internal.modules.e.f34400a);
                } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
                    r1Var.setModulesLoader(new io.sentry.android.core.internal.modules.a(Arrays.asList(new io.sentry.internal.modules.c(r1Var.getLogger()), new io.sentry.android.core.internal.modules.a(r1Var.getLogger())), r1Var.getLogger(), 1));
                }
                if (r1Var.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
                    H logger4 = r1Var.getLogger();
                    ClassLoader classLoader2 = U3.e.class.getClassLoader();
                    ?? obj3 = new Object();
                    obj3.f17400Y = logger4;
                    if (classLoader2 == null) {
                        classLoader2 = ClassLoader.getSystemClassLoader();
                    }
                    obj3.f17401Z = classLoader2;
                    r1Var.setDebugMetaLoader(obj3);
                }
                List<Properties> d11 = r1Var.getDebugMetaLoader().d();
                if (d11 != null) {
                    if (r1Var.getBundleIds().isEmpty()) {
                        for (Properties properties2 : d11) {
                            String property2 = properties2.getProperty("io.sentry.bundle-ids");
                            r1Var.getLogger().f(EnumC3642e1.DEBUG, "Bundle IDs found: %s", property2);
                            if (property2 != null) {
                                for (String str8 : property2.split(Separators.COMMA, -1)) {
                                    r1Var.addBundleId(str8);
                                }
                            }
                        }
                    }
                    if (r1Var.getProguardUuid() == null) {
                        Iterator it = d11.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String property3 = ((Properties) it.next()).getProperty("io.sentry.ProguardUuids");
                            if (property3 != null) {
                                r1Var.getLogger().f(EnumC3642e1.DEBUG, "Proguard UUID found: %s", property3);
                                r1Var.setProguardUuid(property3);
                                break;
                            }
                        }
                    }
                }
                if (r1Var.getMainThreadChecker() instanceof io.sentry.util.thread.c) {
                    r1Var.setMainThreadChecker(io.sentry.util.thread.b.f34779Z);
                }
                if (r1Var.getPerformanceCollectors().isEmpty()) {
                    r1Var.addPerformanceCollector(new Y());
                }
                if (r1Var.isEnableBackpressureHandling()) {
                    r1Var.setBackpressureMonitor(new RunnableC3115h(r1Var));
                    r1Var.getBackpressureMonitor().start();
                }
                return true;
            }
            throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        a();
        return false;
    }

    public static boolean g() {
        return c().isEnabled();
    }

    public static void h(String str, String str2) {
        c().a(str, str2);
    }

    public static void i(io.sentry.protocol.C c10) {
        c().h(c10);
    }
}
