package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Looper;
import id.AbstractC3557B;
import io.sentry.C3648g1;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.O0;
import io.sentry.Z0;
import io.sentry.protocol.C3674a;
import io.sentry.protocol.C3676c;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import v4.CallableC5972b;

/* loaded from: classes2.dex */
public final class D implements io.sentry.r {

    /* renamed from: Y  reason: collision with root package name */
    public final Context f33955Y;

    /* renamed from: Z  reason: collision with root package name */
    public final B f33956Z;

    /* renamed from: h0  reason: collision with root package name */
    public final SentryAndroidOptions f33957h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Future f33958i0;

    public D(Context context, B b10, SentryAndroidOptions sentryAndroidOptions) {
        this.f33955Y = context;
        this.f33956Z = b10;
        Ad.l.Z0("The options object is required.", sentryAndroidOptions);
        this.f33957h0 = sentryAndroidOptions;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f33958i0 = newSingleThreadExecutor.submit(new CallableC5972b(context, 6, sentryAndroidOptions));
        newSingleThreadExecutor.shutdown();
    }

    @Override // io.sentry.r
    public final Z0 a(Z0 z02, C3686u c3686u) {
        boolean z10;
        io.sentry.protocol.x xVar;
        List list;
        List list2;
        List<io.sentry.protocol.y> list3;
        boolean z11;
        if (AbstractC3557B.u2(c3686u)) {
            z10 = true;
        } else {
            this.f33957h0.getLogger().f(EnumC3642e1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", z02.f33836Y);
            z10 = false;
        }
        List list4 = null;
        if (z10) {
            b(z02, c3686u);
            C4.c cVar = z02.f33902x0;
            if (cVar != null) {
                list2 = cVar.f2667Y;
            } else {
                list2 = null;
            }
            if (list2 != null) {
                boolean L12 = AbstractC3557B.L1(c3686u);
                C4.c cVar2 = z02.f33902x0;
                if (cVar2 != null) {
                    list3 = cVar2.f2667Y;
                } else {
                    list3 = null;
                }
                for (io.sentry.protocol.y yVar : list3) {
                    Long l10 = yVar.f34663Y;
                    if (l10 != null && Looper.getMainLooper().getThread().getId() == l10.longValue()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (yVar.f34668k0 == null) {
                        yVar.f34668k0 = Boolean.valueOf(z11);
                    }
                    if (!L12 && yVar.f34670m0 == null) {
                        yVar.f34670m0 = Boolean.valueOf(z11);
                    }
                }
            }
        }
        c(z02, true, z10);
        C4.c cVar3 = z02.f33903y0;
        if (cVar3 != null) {
            list4 = cVar3.f2667Y;
        }
        if (list4 != null && list4.size() > 1) {
            io.sentry.protocol.r rVar = (io.sentry.protocol.r) list4.get(list4.size() - 1);
            if ("java.lang".equals(rVar.f34614h0) && (xVar = rVar.f34616j0) != null && (list = xVar.f34659Y) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.w) it.next()).f34643h0)) {
                        Collections.reverse(list4);
                        break;
                    }
                }
            }
        }
        return z02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(O0 o02, C3686u c3686u) {
        String str;
        Boolean bool;
        C3648g1 c3648g1;
        C3674a c3674a = (C3674a) o02.f33837Z.c(C3674a.class, "app");
        C3674a c3674a2 = c3674a;
        if (c3674a == null) {
            c3674a2 = new Object();
        }
        SentryAndroidOptions sentryAndroidOptions = this.f33957h0;
        io.sentry.H logger = sentryAndroidOptions.getLogger();
        Context context = this.f33955Y;
        c3674a2.f34498j0 = AbstractC3612c.e(context, logger);
        io.sentry.android.core.performance.c a5 = io.sentry.android.core.performance.b.b().a(sentryAndroidOptions);
        if (a5.b()) {
            Date date = null;
            if (a5.b()) {
                c3648g1 = new C3648g1(a5.f34217Z * 1000000);
            } else {
                c3648g1 = null;
            }
            if (c3648g1 != null) {
                date = r.f.B(Double.valueOf(c3648g1.f34347Y / 1000000.0d).longValue());
            }
            c3674a2.f34495Z = date;
        }
        if (!AbstractC3557B.L1(c3686u) && c3674a2.f34503o0 == null && (bool = A.f33913b.f33914a) != null) {
            c3674a2.f34503o0 = Boolean.valueOf(!bool.booleanValue());
        }
        io.sentry.H logger2 = sentryAndroidOptions.getLogger();
        B b10 = this.f33956Z;
        PackageInfo i10 = AbstractC3612c.i(context, 4096, logger2, b10);
        if (i10 != null) {
            String j6 = AbstractC3612c.j(i10, b10);
            if (o02.f33847q0 == null) {
                o02.f33847q0 = j6;
            }
            c3674a2.f34494Y = i10.packageName;
            c3674a2.f34499k0 = i10.versionName;
            c3674a2.f34500l0 = AbstractC3612c.j(i10, b10);
            HashMap hashMap = new HashMap();
            String[] strArr = i10.requestedPermissions;
            int[] iArr = i10.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    String str2 = strArr[i11];
                    String substring = str2.substring(str2.lastIndexOf(46) + 1);
                    if ((iArr[i11] & 2) == 2) {
                        str = "granted";
                    } else {
                        str = "not_granted";
                    }
                    hashMap.put(substring, str);
                }
            }
            c3674a2.f34501m0 = hashMap;
        }
        o02.f33837Z.put("app", c3674a2);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [io.sentry.protocol.C, java.lang.Object] */
    public final void c(O0 o02, boolean z10, boolean z11) {
        String str;
        io.sentry.protocol.C c10 = o02.f33844n0;
        io.sentry.protocol.C c11 = c10;
        if (c10 == null) {
            ?? obj = new Object();
            o02.f33844n0 = obj;
            c11 = obj;
        }
        if (c11.f34471Z == null) {
            c11.f34471Z = J.a(this.f33955Y);
        }
        if (c11.f34474j0 == null) {
            c11.f34474j0 = "{{auto}}";
        }
        C3676c c3676c = o02.f33837Z;
        io.sentry.protocol.f fVar = (io.sentry.protocol.f) c3676c.c(io.sentry.protocol.f.class, "device");
        Future future = this.f33958i0;
        SentryAndroidOptions sentryAndroidOptions = this.f33957h0;
        if (fVar == null) {
            try {
                c3676c.put("device", ((F) future.get()).a(z10, z11));
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Failed to retrieve device info", th2);
            }
            io.sentry.protocol.m mVar = (io.sentry.protocol.m) c3676c.c(io.sentry.protocol.m.class, "os");
            try {
                c3676c.put("os", ((F) future.get()).f33970f);
            } catch (Throwable th3) {
                sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Failed to retrieve os system", th3);
            }
            if (mVar != null) {
                String str2 = mVar.f34577Y;
                if (str2 != null && !str2.isEmpty()) {
                    str = "os_" + str2.trim().toLowerCase(Locale.ROOT);
                } else {
                    str = "os_1";
                }
                c3676c.put(str, mVar);
            }
        }
        try {
            x3.z zVar = ((F) future.get()).f33969e;
            if (zVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("isSideLoaded", String.valueOf(zVar.f48763c));
                String str3 = zVar.f48762b;
                if (str3 != null) {
                    hashMap.put("installerStore", str3);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    o02.a((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting side loaded info.", th4);
        }
    }

    @Override // io.sentry.r
    public final io.sentry.protocol.z h(io.sentry.protocol.z zVar, C3686u c3686u) {
        boolean z10 = true;
        if (!AbstractC3557B.u2(c3686u)) {
            this.f33957h0.getLogger().f(EnumC3642e1.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", zVar.f33836Y);
            z10 = false;
        }
        if (z10) {
            b(zVar, c3686u);
        }
        c(zVar, false, z10);
        return zVar;
    }
}
