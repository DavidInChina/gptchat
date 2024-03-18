package io.sentry.android.core.internal.util;

import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class b implements io.sentry.transport.g, io.sentry.util.thread.a {

    /* renamed from: Y  reason: collision with root package name */
    public static final b f34155Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final b f34156Z = new Object();

    @Override // io.sentry.util.thread.a
    public boolean a() {
        if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            return true;
        }
        return false;
    }

    @Override // io.sentry.transport.g
    public long getCurrentTimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
