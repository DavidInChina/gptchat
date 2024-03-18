package io.sentry.android.core;

import android.os.Looper;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.A1;
import io.sentry.B1;
import io.sentry.C1;
import io.sentry.C3686u;
import io.sentry.EnumC3665m0;
import io.sentry.Z0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class O implements io.sentry.r {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f34011Y = false;

    /* renamed from: Z  reason: collision with root package name */
    public final C3614e f34012Z;

    /* renamed from: h0  reason: collision with root package name */
    public final SentryAndroidOptions f34013h0;

    public O(SentryAndroidOptions sentryAndroidOptions, C3614e c3614e) {
        Ad.l.Z0("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f34013h0 = sentryAndroidOptions;
        this.f34012Z = c3614e;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, io.sentry.android.core.performance.c] */
    public static void b(io.sentry.android.core.performance.b bVar, io.sentry.protocol.z zVar) {
        A1 a5;
        B1 b1;
        if (bVar.f34208a != io.sentry.android.core.performance.a.COLD || (a5 = zVar.f33837Z.a()) == null) {
            return;
        }
        ArrayList arrayList = zVar.f34678x0;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                io.sentry.protocol.v vVar = (io.sentry.protocol.v) it.next();
                if (vVar.f34633k0.contentEquals("app.start.cold")) {
                    b1 = vVar.f34631i0;
                    break;
                }
            } else {
                b1 = null;
                break;
            }
        }
        long j6 = io.sentry.android.core.performance.b.f34206i;
        io.sentry.android.core.performance.c cVar = bVar.f34209b;
        boolean b10 = cVar.b();
        io.sentry.protocol.s sVar = a5.f33714Y;
        if (b10 && Math.abs(j6 - cVar.f34218h0) <= 10000) {
            ?? obj = new Object();
            obj.c(cVar.f34218h0);
            obj.f34217Z = cVar.f34217Z;
            obj.f34219i0 = j6;
            obj.f34216Y = "Process Initialization";
            arrayList.add(d(obj, b1, sVar, "process.load"));
        }
        ArrayList arrayList2 = new ArrayList(bVar.f34212e.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(d((io.sentry.android.core.performance.c) it2.next(), b1, sVar, "contentprovider.load"));
            }
        }
        io.sentry.android.core.performance.c cVar2 = bVar.f34211d;
        if (cVar2.f34219i0 != 0) {
            arrayList.add(d(cVar2, b1, sVar, "application.load"));
        }
        ArrayList arrayList3 = new ArrayList(bVar.f34213f);
        Collections.sort(arrayList3);
        if (!arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                AbstractC2469q0.p(it3.next());
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(io.sentry.protocol.z zVar) {
        Iterator it = zVar.f34678x0.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.v vVar = (io.sentry.protocol.v) it.next();
            if (vVar.f34633k0.contentEquals("app.start.cold") || vVar.f34633k0.contentEquals("app.start.warm")) {
                return true;
            }
            while (it.hasNext()) {
            }
        }
        A1 a5 = zVar.f33837Z.a();
        if (a5 != null) {
            String str = a5.f33718j0;
            if (str.equals("app.start.cold") || str.equals("app.start.warm")) {
                return true;
            }
        }
        return false;
    }

    public static io.sentry.protocol.v d(io.sentry.android.core.performance.c cVar, B1 b1, io.sentry.protocol.s sVar, String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        hashMap.put("thread.name", "main");
        Double valueOf = Double.valueOf(cVar.f34217Z / 1000.0d);
        long j6 = 0;
        if (cVar.b()) {
            long j10 = cVar.f34217Z;
            long j11 = cVar.f34219i0;
            if (j11 != 0) {
                j6 = j11 - cVar.f34218h0;
            }
            j6 += j10;
        }
        return new io.sentry.protocol.v(valueOf, Double.valueOf(j6 / 1000.0d), sVar, new B1(), b1, str, cVar.f34216Y, C1.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), hashMap);
    }

    @Override // io.sentry.r
    public final Z0 a(Z0 z02, C3686u c3686u) {
        return z02;
    }

    @Override // io.sentry.r
    public final synchronized io.sentry.protocol.z h(io.sentry.protocol.z zVar, C3686u c3686u) {
        Map e10;
        long j6;
        String str;
        try {
            if (!this.f34013h0.isTracingEnabled()) {
                return zVar;
            }
            if (!this.f34011Y && c(zVar)) {
                io.sentry.android.core.performance.c a5 = io.sentry.android.core.performance.b.b().a(this.f34013h0);
                long j10 = a5.f34219i0;
                if (j10 != 0) {
                    j6 = j10 - a5.f34218h0;
                } else {
                    j6 = 0;
                }
                if (j6 != 0) {
                    io.sentry.protocol.j jVar = new io.sentry.protocol.j(Float.valueOf((float) j6), EnumC3665m0.MILLISECOND.apiName());
                    if (io.sentry.android.core.performance.b.b().f34208a == io.sentry.android.core.performance.a.COLD) {
                        str = "app_start_cold";
                    } else {
                        str = "app_start_warm";
                    }
                    zVar.f34679y0.put(str, jVar);
                    b(io.sentry.android.core.performance.b.b(), zVar);
                    this.f34011Y = true;
                }
            }
            io.sentry.protocol.s sVar = zVar.f33836Y;
            A1 a10 = zVar.f33837Z.a();
            if (sVar != null && a10 != null && a10.f33718j0.contentEquals("ui.load") && (e10 = this.f34012Z.e(sVar)) != null) {
                zVar.f34679y0.putAll(e10);
            }
            return zVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
