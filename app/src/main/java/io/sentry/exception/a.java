package io.sentry.exception;

import Ad.l;
import io.sentry.protocol.k;

/* loaded from: classes.dex */
public final class a extends RuntimeException {

    /* renamed from: Y  reason: collision with root package name */
    public final k f34326Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Throwable f34327Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Thread f34328h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f34329i0;

    public a(k kVar, Throwable th2, Thread thread, boolean z10) {
        this.f34326Y = kVar;
        l.Z0("Throwable is required.", th2);
        this.f34327Z = th2;
        l.Z0("Thread is required.", thread);
        this.f34328h0 = thread;
        this.f34329i0 = z10;
    }
}
