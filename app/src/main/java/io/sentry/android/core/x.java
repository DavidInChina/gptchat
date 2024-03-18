package io.sentry.android.core;

/* loaded from: classes2.dex */
public final class x extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.a {

    /* renamed from: d  reason: collision with root package name */
    public final long f34260d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f34261e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f34262f;

    public x(long j6, io.sentry.H h10, long j10, boolean z10, boolean z11) {
        super(j6, h10);
        this.f34260d = j10;
        this.f34261e = z10;
        this.f34262f = z11;
    }

    @Override // io.sentry.hints.a
    public final Long a() {
        return Long.valueOf(this.f34260d);
    }

    @Override // io.sentry.hints.a
    public final boolean b() {
        return false;
    }

    @Override // io.sentry.hints.a
    public final String c() {
        if (this.f34262f) {
            return "anr_background";
        }
        return "anr_foreground";
    }

    @Override // io.sentry.hints.c
    public final boolean e(io.sentry.protocol.s sVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void f(io.sentry.protocol.s sVar) {
    }
}
