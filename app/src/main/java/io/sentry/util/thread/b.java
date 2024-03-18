package io.sentry.util.thread;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: Y  reason: collision with root package name */
    public static final long f34778Y = Thread.currentThread().getId();

    /* renamed from: Z  reason: collision with root package name */
    public static final b f34779Z = new Object();

    @Override // io.sentry.util.thread.a
    public final boolean a() {
        if (f34778Y == Thread.currentThread().getId()) {
            return true;
        }
        return false;
    }
}
