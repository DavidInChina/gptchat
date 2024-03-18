package io.sentry;

import java.util.concurrent.Future;

/* loaded from: classes.dex */
public interface P {
    void c(long j6);

    boolean f();

    Future l(Runnable runnable, long j6);

    Future submit(Runnable runnable);
}
