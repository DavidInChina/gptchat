package io.sentry.android.core;

import android.view.Choreographer;
import io.sentry.C3651h1;
import io.sentry.C3685t0;
import io.sentry.C3687u0;
import io.sentry.R0;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import v.C5934c;

/* loaded from: classes2.dex */
public final class V implements io.sentry.L, io.sentry.android.core.internal.util.j {

    /* renamed from: h  reason: collision with root package name */
    public static final long f34062h = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: i  reason: collision with root package name */
    public static final C3651h1 f34063i = new C3651h1(new Date(0), 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f34064a;

    /* renamed from: c  reason: collision with root package name */
    public final io.sentry.android.core.internal.util.k f34066c;

    /* renamed from: d  reason: collision with root package name */
    public volatile String f34067d;

    /* renamed from: b  reason: collision with root package name */
    public final Object f34065b = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final TreeSet f34068e = new TreeSet(new C5934c(24));

    /* renamed from: f  reason: collision with root package name */
    public final ConcurrentSkipListSet f34069f = new ConcurrentSkipListSet();

    /* renamed from: g  reason: collision with root package name */
    public long f34070g = 16666666;

    public V(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.k kVar) {
        boolean z10;
        this.f34066c = kVar;
        if (sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34064a = z10;
    }

    @Override // io.sentry.android.core.internal.util.j
    public final void b(long j6, long j10, long j11, long j12, boolean z10, boolean z11, float f6) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f34069f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j13 = (long) (f34062h / f6);
        this.f34070g = j13;
        concurrentSkipListSet.add(new U(j6, j10, j11, j12, z10, z11, j13));
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0135 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:4:0x0007, B:6:0x000f, B:10:0x0014, B:12:0x001a, B:14:0x001c, B:16:0x002e, B:18:0x0030, B:20:0x003c, B:21:0x0056, B:23:0x005c, B:28:0x0070, B:30:0x0076, B:32:0x0084, B:34:0x008b, B:35:0x0090, B:39:0x009b, B:43:0x00a5, B:45:0x00ab, B:49:0x00dd, B:53:0x00e6, B:55:0x00ea, B:57:0x00f1, B:58:0x00f6, B:59:0x00f8, B:61:0x010d, B:63:0x0117, B:65:0x011b, B:67:0x0123, B:70:0x012d, B:72:0x0135, B:76:0x013e, B:78:0x0148, B:79:0x014d, B:82:0x0154, B:84:0x015d, B:86:0x0161, B:88:0x0195, B:89:0x01b9), top: B:94:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015d A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:4:0x0007, B:6:0x000f, B:10:0x0014, B:12:0x001a, B:14:0x001c, B:16:0x002e, B:18:0x0030, B:20:0x003c, B:21:0x0056, B:23:0x005c, B:28:0x0070, B:30:0x0076, B:32:0x0084, B:34:0x008b, B:35:0x0090, B:39:0x009b, B:43:0x00a5, B:45:0x00ab, B:49:0x00dd, B:53:0x00e6, B:55:0x00ea, B:57:0x00f1, B:58:0x00f6, B:59:0x00f8, B:61:0x010d, B:63:0x0117, B:65:0x011b, B:67:0x0123, B:70:0x012d, B:72:0x0135, B:76:0x013e, B:78:0x0148, B:79:0x014d, B:82:0x0154, B:84:0x015d, B:86:0x0161, B:88:0x0195, B:89:0x01b9), top: B:94:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:4:0x0007, B:6:0x000f, B:10:0x0014, B:12:0x001a, B:14:0x001c, B:16:0x002e, B:18:0x0030, B:20:0x003c, B:21:0x0056, B:23:0x005c, B:28:0x0070, B:30:0x0076, B:32:0x0084, B:34:0x008b, B:35:0x0090, B:39:0x009b, B:43:0x00a5, B:45:0x00ab, B:49:0x00dd, B:53:0x00e6, B:55:0x00ea, B:57:0x00f1, B:58:0x00f6, B:59:0x00f8, B:61:0x010d, B:63:0x0117, B:65:0x011b, B:67:0x0123, B:70:0x012d, B:72:0x0135, B:76:0x013e, B:78:0x0148, B:79:0x014d, B:82:0x0154, B:84:0x015d, B:86:0x0161, B:88:0x0195, B:89:0x01b9), top: B:94:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(io.sentry.S s10) {
        long j6;
        long j10;
        long j11;
        int i10;
        int i11;
        int i12;
        long j12;
        long max;
        int i13;
        long j13;
        int i14;
        boolean z10;
        Field field;
        Long l10;
        long j14;
        Iterator it;
        boolean z11;
        boolean z12;
        synchronized (this.f34065b) {
            try {
                if (!this.f34068e.remove(s10)) {
                    return;
                }
                R0 t10 = s10.t();
                if (t10 == null) {
                    return;
                }
                C3651h1 c3651h1 = f34063i;
                long b10 = t10.b(c3651h1);
                long b11 = s10.x().b(c3651h1);
                if (b11 >= b10) {
                    return;
                }
                long j15 = b10 - b11;
                long j16 = this.f34070g;
                if (!this.f34069f.isEmpty()) {
                    Iterator it2 = this.f34069f.tailSet((ConcurrentSkipListSet) new U(b11)).iterator();
                    i12 = 0;
                    i11 = 0;
                    i10 = 0;
                    j11 = 0;
                    j10 = 0;
                    j6 = 0;
                    while (it2.hasNext()) {
                        U u10 = (U) it2.next();
                        long j17 = u10.f34051Y;
                        if (j17 > b10) {
                            break;
                        }
                        if (j17 >= b11 && u10.f34052Z <= b10) {
                            long j18 = u10.f34053h0;
                            long j19 = u10.f34054i0;
                            it = it2;
                            boolean z13 = u10.f34055j0;
                            j11 += j18;
                            if (u10.f34056k0) {
                                j6 += j19;
                                i10++;
                            } else if (z13) {
                                j10 += j19;
                                i11++;
                            } else {
                                i12++;
                            }
                        } else {
                            it = it2;
                            if ((b11 > j17 && b11 < u10.f34052Z) || (b10 > j17 && b10 < u10.f34052Z)) {
                                long min = Math.min(u10.f34054i0 - Math.max(0L, Math.max(0L, b11 - j17) - u10.f34057l0), j15);
                                j14 = b11;
                                long min2 = Math.min(b10, u10.f34052Z) - Math.max(b11, u10.f34051Y);
                                long j20 = u10.f34057l0;
                                int i15 = io.sentry.android.core.internal.util.k.f34181u0;
                                if (min2 > j20) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (min2 > io.sentry.android.core.internal.util.k.f34180t0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                j11 += min2;
                                if (z12) {
                                    j6 += min;
                                    i10++;
                                } else if (z11) {
                                    j10 += min;
                                    i11++;
                                } else {
                                    i12++;
                                }
                                j16 = u10.f34057l0;
                                it2 = it;
                                b11 = j14;
                            }
                        }
                        j14 = b11;
                        j16 = u10.f34057l0;
                        it2 = it;
                        b11 = j14;
                    }
                } else {
                    i12 = 0;
                    i11 = 0;
                    i10 = 0;
                    j11 = 0;
                    j10 = 0;
                    j6 = 0;
                }
                int i16 = i12 + i11 + i10;
                io.sentry.android.core.internal.util.k kVar = this.f34066c;
                Choreographer choreographer = kVar.f34191o0;
                if (choreographer != null && (field = kVar.f34192p0) != null) {
                    try {
                        l10 = (Long) field.get(choreographer);
                    } catch (IllegalAccessException unused) {
                    }
                    if (l10 != null) {
                        j12 = l10.longValue();
                        max = Math.max(0L, b10 - j12);
                        if (max <= j16) {
                            if (max > io.sentry.android.core.internal.util.k.f34180t0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            long max2 = Math.max(0L, max - j16);
                            j11 += max;
                            if (z10) {
                                j6 += max2;
                                i10++;
                            } else {
                                j10 += max2;
                                i11++;
                            }
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        int i17 = i16 + i13;
                        j13 = j15 - j11;
                        if (j13 <= 0) {
                            i14 = (int) (j13 / j16);
                        } else {
                            i14 = 0;
                        }
                        int i18 = i17 + i14;
                        double d10 = (j10 + j6) / 1.0E9d;
                        s10.e("frames.total", Integer.valueOf(i18));
                        s10.e("frames.slow", Integer.valueOf(i11));
                        s10.e("frames.frozen", Integer.valueOf(i10));
                        s10.e("frames.delay", Double.valueOf(d10));
                        if (s10 instanceof io.sentry.T) {
                            s10.i(Integer.valueOf(i18), "frames_total");
                            s10.i(Integer.valueOf(i11), "frames_slow");
                            s10.i(Integer.valueOf(i10), "frames_frozen");
                            s10.i(Double.valueOf(d10), "frames_delay");
                        }
                    }
                }
                j12 = -1;
                max = Math.max(0L, b10 - j12);
                if (max <= j16) {
                }
                int i172 = i16 + i13;
                j13 = j15 - j11;
                if (j13 <= 0) {
                }
                int i182 = i172 + i14;
                double d102 = (j10 + j6) / 1.0E9d;
                s10.e("frames.total", Integer.valueOf(i182));
                s10.e("frames.slow", Integer.valueOf(i11));
                s10.e("frames.frozen", Integer.valueOf(i10));
                s10.e("frames.delay", Double.valueOf(d102));
                if (s10 instanceof io.sentry.T) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        synchronized (this.f34065b) {
            try {
                if (this.f34067d != null) {
                    this.f34066c.a(this.f34067d);
                    this.f34067d = null;
                }
                this.f34069f.clear();
                this.f34068e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(io.sentry.S s10) {
        if (!this.f34064a || (s10 instanceof C3685t0) || (s10 instanceof C3687u0)) {
            return;
        }
        synchronized (this.f34065b) {
            try {
                if (!this.f34068e.contains(s10)) {
                    return;
                }
                d(s10);
                synchronized (this.f34065b) {
                    try {
                        if (this.f34068e.isEmpty()) {
                            e();
                        } else {
                            this.f34069f.headSet((ConcurrentSkipListSet) new U(((io.sentry.S) this.f34068e.first()).x().b(f34063i))).clear();
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final void g(io.sentry.S s10) {
        String str;
        if (!this.f34064a || (s10 instanceof C3685t0) || (s10 instanceof C3687u0)) {
            return;
        }
        synchronized (this.f34065b) {
            try {
                this.f34068e.add(s10);
                if (this.f34067d == null) {
                    io.sentry.android.core.internal.util.k kVar = this.f34066c;
                    if (!kVar.f34188l0) {
                        str = null;
                    } else {
                        String uuid = UUID.randomUUID().toString();
                        kVar.f34187k0.put(uuid, this);
                        kVar.c();
                        str = uuid;
                    }
                    this.f34067d = str;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
