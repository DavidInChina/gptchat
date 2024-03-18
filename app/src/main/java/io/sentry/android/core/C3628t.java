package io.sentry.android.core;

/* renamed from: io.sentry.android.core.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3628t implements io.sentry.hints.a, io.sentry.hints.k {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f34251a;

    public C3628t(boolean z10) {
        this.f34251a = z10;
    }

    @Override // io.sentry.hints.a
    public final Long a() {
        return null;
    }

    @Override // io.sentry.hints.a
    public final boolean b() {
        return true;
    }

    @Override // io.sentry.hints.a
    public final String c() {
        if (this.f34251a) {
            return "anr_background";
        }
        return "anr_foreground";
    }
}
