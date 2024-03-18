package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C3668n0;
import io.sentry.C3697z0;

/* renamed from: io.sentry.android.core.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3621l implements io.sentry.M {
    @Override // io.sentry.M
    public final void a(C3697z0 c3697z0) {
        c3697z0.f34857a = new C3668n0(System.currentTimeMillis(), Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize());
    }

    @Override // io.sentry.M
    public final void c() {
    }
}
