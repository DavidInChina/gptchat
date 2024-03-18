package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import id.AbstractC3557B;
import io.sentry.A1;
import io.sentry.C3637d;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.Z0;
import io.sentry.protocol.C3674a;
import io.sentry.protocol.C3676c;
import io.sentry.protocol.C3677d;
import io.sentry.protocol.DebugImage;
import io.sentry.s1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: io.sentry.android.core.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3629u implements io.sentry.r {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f34252Y;

    /* renamed from: Z  reason: collision with root package name */
    public final SentryAndroidOptions f34253Z;

    /* renamed from: h0  reason: collision with root package name */
    public final B f34254h0;

    /* renamed from: i0  reason: collision with root package name */
    public final S4.o f34255i0;

    public C3629u(Context context, B b10, SentryAndroidOptions sentryAndroidOptions) {
        this.f34252Y = context;
        this.f34253Z = sentryAndroidOptions;
        this.f34254h0 = b10;
        this.f34255i0 = new S4.o(new s1(sentryAndroidOptions));
    }

    public static boolean b(Object obj) {
        if (obj instanceof io.sentry.hints.a) {
            return "anr_background".equals(((io.sentry.hints.a) obj).c());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0553 A[Catch: all -> 0x0590, TryCatch #0 {all -> 0x0590, blocks: (B:229:0x0549, B:231:0x0553, B:233:0x0567, B:234:0x056c, B:235:0x0574, B:237:0x057a), top: B:242:0x0549 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x052e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, io.sentry.protocol.k] */
    /* JADX WARN: Type inference failed for: r0v31, types: [io.sentry.protocol.C, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v11, types: [io.sentry.protocol.y] */
    /* JADX WARN: Type inference failed for: r11v7, types: [io.sentry.protocol.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, io.sentry.protocol.m] */
    /* JADX WARN: Type inference failed for: r14v10, types: [io.sentry.protocol.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, io.sentry.protocol.x] */
    @Override // io.sentry.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Z0 a(Z0 z02, C3686u c3686u) {
        String str;
        List<??> list;
        ArrayList arrayList;
        Object obj;
        C3677d c3677d;
        C3677d c3677d2;
        List list2;
        C3674a c3674a;
        PackageInfo i10;
        String str2;
        Map map;
        io.sentry.protocol.C c10;
        io.sentry.protocol.C c11;
        String str3;
        x3.z q10;
        String str4;
        int i11;
        String str5;
        ArrayList arrayList2;
        ArrayList arrayList3;
        DisplayMetrics displayMetrics;
        String str6;
        String str7;
        Object v12 = AbstractC3557B.v1(c3686u);
        boolean z10 = v12 instanceof io.sentry.hints.b;
        SentryAndroidOptions sentryAndroidOptions = this.f34253Z;
        if (!z10) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return z02;
        }
        ?? obj2 = new Object();
        x xVar = (x) ((io.sentry.hints.b) v12);
        if (!xVar.f34261e) {
            obj2.f34565Y = "HistoricalAppExitInfo";
        } else {
            obj2.f34565Y = "AppExitInfo";
        }
        if (b(v12)) {
            str = "Background ANR";
        } else {
            str = "ANR";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(Thread.currentThread(), str);
        C4.c cVar = z02.f33902x0;
        if (cVar != null) {
            list = cVar.f2667Y;
        } else {
            list = null;
        }
        if (list != null) {
            for (io.sentry.protocol.y yVar : list) {
                String str8 = yVar.f34665h0;
                if (str8 != null && str8.equals("main")) {
                    break;
                }
            }
        }
        yVar = 0;
        if (yVar == 0) {
            yVar = new Object();
            yVar.f34671n0 = new Object();
        }
        this.f34255i0.getClass();
        io.sentry.protocol.x xVar2 = yVar.f34671n0;
        if (xVar2 == null) {
            arrayList = new ArrayList(0);
        } else {
            ArrayList arrayList4 = new ArrayList(1);
            arrayList4.add(S4.o.n(applicationNotResponding, obj2, yVar.f34663Y, xVar2.f34659Y, true));
            arrayList = arrayList4;
        }
        z02.f33903y0 = new C4.c(2, arrayList);
        if (z02.f33843m0 == null) {
            z02.f33843m0 = "java";
        }
        C3676c c3676c = z02.f33837Z;
        io.sentry.protocol.m mVar = (io.sentry.protocol.m) c3676c.c(io.sentry.protocol.m.class, "os");
        ?? obj3 = new Object();
        obj3.f34577Y = "Android";
        obj3.f34578Z = Build.VERSION.RELEASE;
        obj3.f34580i0 = Build.DISPLAY;
        try {
            obj3.f34581j0 = AbstractC3612c.g(sentryAndroidOptions.getLogger());
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting OperatingSystem.", th2);
        }
        c3676c.put("os", obj3);
        if (mVar != null) {
            String str9 = mVar.f34577Y;
            if (str9 != null && !str9.isEmpty()) {
                str7 = "os_" + str9.trim().toLowerCase(Locale.ROOT);
            } else {
                str7 = "os_1";
            }
            c3676c.put(str7, mVar);
        }
        io.sentry.protocol.f fVar = (io.sentry.protocol.f) c3676c.c(io.sentry.protocol.f.class, "device");
        Context context = this.f34252Y;
        B b10 = this.f34254h0;
        if (fVar == null) {
            ?? obj4 = new Object();
            if (sentryAndroidOptions.isSendDefaultPii()) {
                obj4.f34526Y = Settings.Global.getString(context.getContentResolver(), "device_name");
            }
            obj4.f34527Z = Build.MANUFACTURER;
            obj4.f34528h0 = Build.BRAND;
            obj4.f34529i0 = AbstractC3612c.f(sentryAndroidOptions.getLogger());
            obj4.f34530j0 = Build.MODEL;
            obj4.f34531k0 = Build.ID;
            b10.getClass();
            obj4.f34532l0 = Build.SUPPORTED_ABIS;
            ActivityManager.MemoryInfo h10 = AbstractC3612c.h(context, sentryAndroidOptions.getLogger());
            obj = v12;
            if (h10 != null) {
                obj4.f34538r0 = Long.valueOf(h10.totalMem);
            }
            obj4.f34537q0 = b10.a();
            io.sentry.H logger = sentryAndroidOptions.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th3) {
                logger.d(EnumC3642e1.ERROR, "Error getting DisplayMetrics.", th3);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                obj4.f34546z0 = Integer.valueOf(displayMetrics.widthPixels);
                obj4.f34512A0 = Integer.valueOf(displayMetrics.heightPixels);
                obj4.f34513B0 = Float.valueOf(displayMetrics.density);
                obj4.f34514C0 = Integer.valueOf(displayMetrics.densityDpi);
            }
            if (obj4.f34517F0 == null) {
                try {
                    str6 = J.a(context);
                } catch (Throwable th4) {
                    sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting installationId.", th4);
                    str6 = null;
                }
                obj4.f34517F0 = str6;
            }
            ArrayList a5 = io.sentry.android.core.internal.util.c.f34157b.a();
            if (!a5.isEmpty()) {
                obj4.f34523L0 = Double.valueOf(((Integer) Collections.max(a5)).doubleValue());
                obj4.f34522K0 = Integer.valueOf(a5.size());
            }
            c3676c.put("device", obj4);
        } else {
            obj = v12;
        }
        if (!xVar.f34261e) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return z02;
        }
        if (z02.f33839i0 == null) {
            z02.f33839i0 = (io.sentry.protocol.n) io.sentry.cache.f.g(sentryAndroidOptions, "request.json", io.sentry.protocol.n.class);
        }
        if (z02.f33844n0 == null) {
            z02.f33844n0 = (io.sentry.protocol.C) io.sentry.cache.f.g(sentryAndroidOptions, "user.json", io.sentry.protocol.C.class);
        }
        Map map2 = (Map) io.sentry.cache.f.g(sentryAndroidOptions, "tags.json", Map.class);
        if (map2 != null) {
            if (z02.f33840j0 == null) {
                z02.f33840j0 = new HashMap(new HashMap(map2));
            } else {
                for (Map.Entry entry : map2.entrySet()) {
                    if (!z02.f33840j0.containsKey(entry.getKey())) {
                        z02.a((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        List list3 = (List) io.sentry.cache.a.b(sentryAndroidOptions, ".scope-cache", "breadcrumbs.json", List.class, new C3637d(0));
        if (list3 != null) {
            List list4 = z02.f33848r0;
            if (list4 == null) {
                z02.f33848r0 = new ArrayList(new ArrayList(list3));
            } else {
                list4.addAll(list3);
            }
        }
        Map map3 = (Map) io.sentry.cache.f.g(sentryAndroidOptions, "extras.json", Map.class);
        if (map3 != null) {
            if (z02.f33850t0 == null) {
                z02.f33850t0 = new HashMap(new HashMap(map3));
            } else {
                for (Map.Entry entry2 : map3.entrySet()) {
                    if (!z02.f33850t0.containsKey(entry2.getKey())) {
                        z02.f33850t0.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
        }
        C3676c c3676c2 = (C3676c) io.sentry.cache.f.g(sentryAndroidOptions, "contexts.json", C3676c.class);
        if (c3676c2 != null) {
            Iterator it = new C3676c(c3676c2).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it.next();
                Object value = entry3.getValue();
                if ((!"trace".equals(entry3.getKey()) || !(value instanceof A1)) && !c3676c.containsKey(entry3.getKey())) {
                    c3676c.put((String) entry3.getKey(), value);
                }
            }
        }
        String str10 = (String) io.sentry.cache.f.g(sentryAndroidOptions, "transaction.json", String.class);
        if (z02.f33895A0 == null) {
            z02.f33895A0 = str10;
        }
        List list5 = (List) io.sentry.cache.f.g(sentryAndroidOptions, "fingerprint.json", List.class);
        if (z02.f33896B0 == null) {
            if (list5 != null) {
                arrayList3 = new ArrayList(list5);
            } else {
                arrayList3 = null;
            }
            z02.f33896B0 = arrayList3;
        }
        boolean b11 = b(obj);
        if (z02.f33896B0 == null) {
            String[] strArr = new String[2];
            strArr[0] = "{{ default }}";
            if (b11) {
                str5 = "background-anr";
            } else {
                str5 = "foreground-anr";
            }
            strArr[1] = str5;
            List asList = Arrays.asList(strArr);
            if (asList != null) {
                arrayList2 = new ArrayList(asList);
            } else {
                arrayList2 = null;
            }
            z02.f33896B0 = arrayList2;
        }
        EnumC3642e1 enumC3642e1 = (EnumC3642e1) io.sentry.cache.f.g(sentryAndroidOptions, "level.json", EnumC3642e1.class);
        if (z02.f33904z0 == null) {
            z02.f33904z0 = enumC3642e1;
        }
        A1 a12 = (A1) io.sentry.cache.f.g(sentryAndroidOptions, "trace.json", A1.class);
        if (c3676c.a() == null && a12 != null && a12.f33715Z != null && a12.f33714Y != null) {
            c3676c.b(a12);
        }
        if (z02.f33841k0 == null) {
            z02.f33841k0 = (String) io.sentry.cache.e.a(sentryAndroidOptions, "release.json", String.class);
        }
        if (z02.f33842l0 == null) {
            String str11 = (String) io.sentry.cache.e.a(sentryAndroidOptions, "environment.json", String.class);
            if (str11 == null) {
                str11 = sentryAndroidOptions.getEnvironment();
            }
            z02.f33842l0 = str11;
        }
        if (z02.f33847q0 == null) {
            z02.f33847q0 = (String) io.sentry.cache.e.a(sentryAndroidOptions, "dist.json", String.class);
        }
        if (z02.f33847q0 == null && (str4 = (String) io.sentry.cache.e.a(sentryAndroidOptions, "release.json", String.class)) != null) {
            try {
                i11 = 1;
                try {
                    z02.f33847q0 = str4.substring(str4.indexOf(43) + 1);
                } catch (Throwable unused) {
                    io.sentry.H logger2 = sentryAndroidOptions.getLogger();
                    EnumC3642e1 enumC3642e12 = EnumC3642e1.WARNING;
                    Object[] objArr = new Object[i11];
                    objArr[0] = str4;
                    logger2.f(enumC3642e12, "Failed to parse release from scope cache: %s", objArr);
                    c3677d = z02.f33849s0;
                    c3677d2 = c3677d;
                    if (c3677d == null) {
                    }
                    if (c3677d2.f34510Z == null) {
                    }
                    list2 = c3677d2.f34510Z;
                    if (list2 != null) {
                    }
                    if (z02.f33838h0 == null) {
                    }
                    c3674a = (C3674a) c3676c.c(C3674a.class, "app");
                    C3674a c3674a2 = c3674a;
                    if (c3674a == null) {
                    }
                    c3674a2.f34498j0 = AbstractC3612c.e(context, sentryAndroidOptions.getLogger());
                    c3674a2.f34503o0 = Boolean.valueOf(!b(obj));
                    i10 = AbstractC3612c.i(context, 0, sentryAndroidOptions.getLogger(), b10);
                    if (i10 != null) {
                    }
                    str2 = z02.f33841k0;
                    if (str2 == null) {
                    }
                    if (str2 != null) {
                    }
                    c3676c.put("app", c3674a2);
                    map = (Map) io.sentry.cache.a.b(sentryAndroidOptions, ".options-cache", "tags.json", Map.class, null);
                    if (map != null) {
                    }
                    c10 = z02.f33844n0;
                    io.sentry.protocol.C c12 = c10;
                    if (c10 == null) {
                    }
                    c11 = c12;
                    if (c11.f34471Z == null) {
                    }
                    if (c11.f34474j0 == null) {
                    }
                    q10 = AbstractC3612c.q(context, sentryAndroidOptions.getLogger(), b10);
                    if (q10 != null) {
                    }
                    return z02;
                }
            } catch (Throwable unused2) {
                i11 = 1;
            }
        }
        c3677d = z02.f33849s0;
        c3677d2 = c3677d;
        if (c3677d == null) {
            c3677d2 = new Object();
        }
        if (c3677d2.f34510Z == null) {
            c3677d2.f34510Z = new ArrayList(new ArrayList());
        }
        list2 = c3677d2.f34510Z;
        if (list2 != null) {
            String str12 = (String) io.sentry.cache.e.a(sentryAndroidOptions, "proguard-uuid.json", String.class);
            if (str12 != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str12);
                list2.add(debugImage);
            }
            z02.f33849s0 = c3677d2;
        }
        if (z02.f33838h0 == null) {
            z02.f33838h0 = (io.sentry.protocol.q) io.sentry.cache.e.a(sentryAndroidOptions, "sdk-version.json", io.sentry.protocol.q.class);
        }
        c3674a = (C3674a) c3676c.c(C3674a.class, "app");
        C3674a c3674a22 = c3674a;
        if (c3674a == null) {
            c3674a22 = new Object();
        }
        c3674a22.f34498j0 = AbstractC3612c.e(context, sentryAndroidOptions.getLogger());
        c3674a22.f34503o0 = Boolean.valueOf(!b(obj));
        i10 = AbstractC3612c.i(context, 0, sentryAndroidOptions.getLogger(), b10);
        if (i10 != null) {
            c3674a22.f34494Y = i10.packageName;
        }
        str2 = z02.f33841k0;
        if (str2 == null) {
            str2 = (String) io.sentry.cache.a.b(sentryAndroidOptions, ".options-cache", "release.json", String.class, null);
        }
        if (str2 != null) {
            try {
                String substring = str2.substring(str2.indexOf(64) + 1, str2.indexOf(43));
                String substring2 = str2.substring(str2.indexOf(43) + 1);
                c3674a22.f34499k0 = substring;
                c3674a22.f34500l0 = substring2;
            } catch (Throwable unused3) {
                sentryAndroidOptions.getLogger().f(EnumC3642e1.WARNING, "Failed to parse release from scope cache: %s", str2);
            }
        }
        c3676c.put("app", c3674a22);
        map = (Map) io.sentry.cache.a.b(sentryAndroidOptions, ".options-cache", "tags.json", Map.class, null);
        if (map != null) {
            if (z02.f33840j0 == null) {
                z02.f33840j0 = new HashMap(new HashMap(map));
            } else {
                for (Map.Entry entry4 : map.entrySet()) {
                    if (!z02.f33840j0.containsKey(entry4.getKey())) {
                        z02.a((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
        }
        c10 = z02.f33844n0;
        io.sentry.protocol.C c122 = c10;
        if (c10 == null) {
            ?? obj5 = new Object();
            z02.f33844n0 = obj5;
            c122 = obj5;
        }
        c11 = c122;
        if (c11.f34471Z == null) {
            try {
                str3 = J.a(context);
            } catch (Throwable th5) {
                sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting installationId.", th5);
                str3 = null;
            }
            c11.f34471Z = str3;
        }
        if (c11.f34474j0 == null) {
            c11.f34474j0 = "{{auto}}";
        }
        try {
            q10 = AbstractC3612c.q(context, sentryAndroidOptions.getLogger(), b10);
            if (q10 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("isSideLoaded", String.valueOf(q10.f48763c));
                String str13 = q10.f48762b;
                if (str13 != null) {
                    hashMap.put("installerStore", str13);
                }
                for (Map.Entry entry5 : hashMap.entrySet()) {
                    z02.a((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
        } catch (Throwable th6) {
            sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting side loaded info.", th6);
        }
        return z02;
    }

    @Override // io.sentry.r
    public final io.sentry.protocol.z h(io.sentry.protocol.z zVar, C3686u c3686u) {
        return zVar;
    }
}
