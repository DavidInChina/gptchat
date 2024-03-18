package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C3649h;
import io.sentry.C3668n0;
import io.sentry.C3697z0;
import io.sentry.EnumC3642e1;
import java.io.File;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.core.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3626q {

    /* renamed from: b  reason: collision with root package name */
    public final File f34221b;

    /* renamed from: c  reason: collision with root package name */
    public final int f34222c;

    /* renamed from: f  reason: collision with root package name */
    public String f34225f;

    /* renamed from: h  reason: collision with root package name */
    public final io.sentry.android.core.internal.util.k f34227h;

    /* renamed from: m  reason: collision with root package name */
    public final B f34232m;

    /* renamed from: n  reason: collision with root package name */
    public final io.sentry.P f34233n;

    /* renamed from: o  reason: collision with root package name */
    public final io.sentry.H f34234o;

    /* renamed from: a  reason: collision with root package name */
    public long f34220a = 0;

    /* renamed from: d  reason: collision with root package name */
    public Future f34223d = null;

    /* renamed from: e  reason: collision with root package name */
    public File f34224e = null;

    /* renamed from: g  reason: collision with root package name */
    public volatile C3625p f34226g = null;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayDeque f34228i = new ArrayDeque();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayDeque f34229j = new ArrayDeque();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayDeque f34230k = new ArrayDeque();

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f34231l = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    public boolean f34235p = false;

    public C3626q(String str, int i10, io.sentry.android.core.internal.util.k kVar, io.sentry.P p10, io.sentry.H h10, B b10) {
        Ad.l.Z0("TracesFilesDirPath is required", str);
        this.f34221b = new File(str);
        this.f34222c = i10;
        Ad.l.Z0("Logger is required", h10);
        this.f34234o = h10;
        Ad.l.Z0("ExecutorService is required.", p10);
        this.f34233n = p10;
        Ad.l.Z0("SentryFrameMetricsCollector is required", kVar);
        this.f34227h = kVar;
        Ad.l.Z0("The BuildInfoProvider is required.", b10);
        this.f34232m = b10;
    }

    public final synchronized C3625p a(List list, boolean z10) {
        if (this.f34226g != null) {
            return this.f34226g;
        } else if (!this.f34235p) {
            this.f34234o.f(EnumC3642e1.WARNING, "Profiler not running", new Object[0]);
            return null;
        } else {
            this.f34232m.getClass();
            Debug.stopMethodTracing();
            this.f34235p = false;
            this.f34227h.a(this.f34225f);
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.f34224e == null) {
                this.f34234o.f(EnumC3642e1.ERROR, "Trace file does not exists", new Object[0]);
                return null;
            }
            if (!this.f34229j.isEmpty()) {
                this.f34231l.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f34229j));
            }
            if (!this.f34230k.isEmpty()) {
                this.f34231l.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f34230k));
            }
            if (!this.f34228i.isEmpty()) {
                this.f34231l.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f34228i));
            }
            b(list);
            Future future = this.f34223d;
            if (future != null) {
                future.cancel(true);
                this.f34223d = null;
            }
            return new C3625p(elapsedRealtimeNanos, elapsedCpuTime, z10, this.f34224e, this.f34231l);
        }
    }

    public final void b(List list) {
        this.f34232m.getClass();
        long elapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f34220a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C3697z0 c3697z0 = (C3697z0) it.next();
                        C3649h c3649h = c3697z0.f34858b;
                        C3668n0 c3668n0 = c3697z0.f34857a;
                        if (c3649h != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c3649h.f34348a) + elapsedRealtimeNanos), Double.valueOf(c3649h.f34349b)));
                        }
                        if (c3668n0 != null && c3668n0.f34442b > -1) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c3668n0.f34441a) + elapsedRealtimeNanos), Long.valueOf(c3668n0.f34442b)));
                        }
                        if (c3668n0 != null && c3668n0.f34443c > -1) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(c3668n0.f34441a) + elapsedRealtimeNanos), Long.valueOf(c3668n0.f34443c)));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.f34231l.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.f34231l.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (!arrayDeque2.isEmpty()) {
                this.f34231l.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
            }
        }
    }
}
