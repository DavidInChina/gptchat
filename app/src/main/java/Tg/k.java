package Tg;

import Sg.B;
import java.util.concurrent.TimeUnit;
import jh.H1;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f17254a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f17255b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f17256c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f17257d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f17258e;

    /* renamed from: f  reason: collision with root package name */
    public static final g f17259f;

    /* renamed from: g  reason: collision with root package name */
    public static final H1 f17260g;

    /* renamed from: h  reason: collision with root package name */
    public static final H1 f17261h;

    static {
        String str;
        int i10 = B.f16631a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f17254a = str;
        f17255b = A7.b.J1("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = B.f16631a;
        if (i11 < 2) {
            i11 = 2;
        }
        f17256c = A7.b.K1(i11, 1, 0, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f17257d = A7.b.K1(2097150, 0, 2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f17258e = TimeUnit.SECONDS.toNanos(A7.b.J1("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f17259f = g.f17249l;
        f17260g = new H1(0);
        f17261h = new H1(1);
    }
}
