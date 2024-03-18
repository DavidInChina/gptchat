package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C3649h;
import io.sentry.C3697z0;
import io.sentry.EnumC3642e1;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* renamed from: io.sentry.android.core.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3618i implements io.sentry.M {

    /* renamed from: g  reason: collision with root package name */
    public final io.sentry.H f34114g;

    /* renamed from: h  reason: collision with root package name */
    public final B f34115h;

    /* renamed from: a  reason: collision with root package name */
    public long f34108a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f34109b = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f34110c = 1;

    /* renamed from: d  reason: collision with root package name */
    public long f34111d = 1;

    /* renamed from: e  reason: collision with root package name */
    public double f34112e = 1.0E9d / 1;

    /* renamed from: f  reason: collision with root package name */
    public final File f34113f = new File("/proc/self/stat");

    /* renamed from: i  reason: collision with root package name */
    public boolean f34116i = false;

    /* renamed from: j  reason: collision with root package name */
    public final Pattern f34117j = Pattern.compile("[\n\t\r ]");

    public C3618i(io.sentry.H h10, B b10) {
        Ad.l.Z0("Logger is required.", h10);
        this.f34114g = h10;
        this.f34115h = b10;
    }

    @Override // io.sentry.M
    public final void a(C3697z0 c3697z0) {
        this.f34115h.getClass();
        if (!this.f34116i) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long j6 = elapsedRealtimeNanos - this.f34108a;
        this.f34108a = elapsedRealtimeNanos;
        long b10 = b();
        this.f34109b = b10;
        c3697z0.f34858b = new C3649h(System.currentTimeMillis(), (((b10 - this.f34109b) / j6) / this.f34111d) * 100.0d);
    }

    public final long b() {
        String str;
        io.sentry.H h10 = this.f34114g;
        try {
            str = com.google.android.gms.internal.play_billing.N.p0(this.f34113f);
        } catch (IOException e10) {
            this.f34116i = false;
            h10.d(EnumC3642e1.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e10);
            str = null;
        }
        if (str != null) {
            String[] split = this.f34117j.split(str.trim());
            try {
                long parseLong = Long.parseLong(split[13]);
                long parseLong2 = Long.parseLong(split[14]);
                return (long) ((parseLong + parseLong2 + Long.parseLong(split[15]) + Long.parseLong(split[16])) * this.f34112e);
            } catch (NumberFormatException e11) {
                h10.d(EnumC3642e1.ERROR, "Error parsing /proc/self/stat file.", e11);
            }
        }
        return 0L;
    }

    @Override // io.sentry.M
    public final void c() {
        this.f34115h.getClass();
        this.f34116i = true;
        this.f34110c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f34111d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f34112e = 1.0E9d / this.f34110c;
        this.f34109b = b();
    }
}
