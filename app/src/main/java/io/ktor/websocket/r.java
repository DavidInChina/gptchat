package io.ktor.websocket;

import Ng.AbstractC1089x;

/* loaded from: classes.dex */
public final class r extends Exception implements AbstractC1089x {

    /* renamed from: Y  reason: collision with root package name */
    public final long f33671Y;

    public r(long j6) {
        this.f33671Y = j6;
    }

    @Override // Ng.AbstractC1089x
    public final Throwable a() {
        r rVar = new r(this.f33671Y);
        rVar.initCause(this);
        return rVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Frame is too big: " + this.f33671Y;
    }
}
