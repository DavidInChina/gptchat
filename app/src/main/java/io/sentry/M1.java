package io.sentry;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class M1 extends io.sentry.hints.c implements io.sentry.hints.h, io.sentry.hints.k {

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference f33828d = new AtomicReference();

    public M1(long j6, H h10) {
        super(j6, h10);
    }

    @Override // io.sentry.hints.c
    public final boolean e(io.sentry.protocol.s sVar) {
        io.sentry.protocol.s sVar2 = (io.sentry.protocol.s) this.f33828d.get();
        if (sVar2 != null && sVar2.equals(sVar)) {
            return true;
        }
        return false;
    }

    @Override // io.sentry.hints.c
    public final void f(io.sentry.protocol.s sVar) {
        this.f33828d.set(sVar);
    }
}
