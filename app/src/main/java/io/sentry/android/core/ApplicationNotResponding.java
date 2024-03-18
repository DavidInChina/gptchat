package io.sentry.android.core;

/* loaded from: classes2.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* renamed from: Y  reason: collision with root package name */
    public final Thread f33950Y;

    public ApplicationNotResponding(Thread thread, String str) {
        super(str);
        Ad.l.Z0("Thread must be provided.", thread);
        this.f33950Y = thread;
        setStackTrace(thread.getStackTrace());
    }
}
