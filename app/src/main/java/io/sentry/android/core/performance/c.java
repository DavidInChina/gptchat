package io.sentry.android.core.performance;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class c implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public String f34216Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f34217Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f34218h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f34219i0;

    public final boolean a() {
        if (this.f34219i0 == 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f34218h0 != 0) {
            return true;
        }
        return false;
    }

    public final void c(long j6) {
        this.f34218h0 = j6;
        this.f34217Z = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f34218h0);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f34217Z, ((c) obj).f34217Z);
    }
}
