package Hi;

import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class k extends AbstractC4344b {

    /* renamed from: l  reason: collision with root package name */
    public final o f7886l;

    /* renamed from: m  reason: collision with root package name */
    public final long f7887m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f7888n;

    /* renamed from: o  reason: collision with root package name */
    public final Long f7889o;

    /* renamed from: p  reason: collision with root package name */
    public final long f7890p;

    public k(o oVar, long j6, boolean z10, Long l10, long j10) {
        this.f7886l = oVar;
        this.f7887m = j6;
        this.f7888n = z10;
        this.f7889o = l10;
        this.f7890p = j10;
    }

    public final boolean H1() {
        if (this.f7887m >= E9.f.r(this.f7886l.f7908Y)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "AppLaunch(preLaunchState=" + this.f7886l + ", duration=" + this.f7887m + " ms, isSlowLaunch=" + H1() + ", trampolined=" + this.f7888n + ", backgroundDuration=" + this.f7889o + " ms, startUptimeMillis=" + this.f7890p + ')';
    }
}
