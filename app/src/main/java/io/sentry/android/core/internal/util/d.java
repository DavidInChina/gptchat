package io.sentry.android.core.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public final io.sentry.transport.g f34160b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicInteger f34161c = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    public final AtomicLong f34163e = new AtomicLong(0);

    /* renamed from: a  reason: collision with root package name */
    public final long f34159a = 2000;

    /* renamed from: d  reason: collision with root package name */
    public final int f34162d = 3;

    public d() {
        b bVar = b.f34155Y;
        this.f34160b = bVar;
    }

    public final boolean a() {
        long currentTimeMillis = this.f34160b.getCurrentTimeMillis();
        AtomicLong atomicLong = this.f34163e;
        int i10 = (atomicLong.get() > 0L ? 1 : (atomicLong.get() == 0L ? 0 : -1));
        AtomicInteger atomicInteger = this.f34161c;
        if (i10 != 0 && atomicLong.get() + this.f34159a > currentTimeMillis) {
            if (atomicInteger.incrementAndGet() < this.f34162d) {
                return false;
            }
            atomicInteger.set(0);
            return true;
        }
        atomicInteger.set(0);
        atomicLong.set(currentTimeMillis);
        return false;
    }
}
