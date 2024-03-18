package io.sentry;

import j$.time.Instant;

/* renamed from: io.sentry.b1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3633b1 extends R0 {

    /* renamed from: Y  reason: collision with root package name */
    public final Instant f34277Y = Instant.now();

    @Override // io.sentry.R0
    public final long d() {
        Instant instant = this.f34277Y;
        return (instant.getEpochSecond() * 1000000000) + instant.getNano();
    }
}
