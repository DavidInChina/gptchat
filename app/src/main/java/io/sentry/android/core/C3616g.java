package io.sentry.android.core;

import io.sentry.D0;
import io.sentry.E0;
import io.sentry.EnumC3642e1;

/* renamed from: io.sentry.android.core.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3616g implements E0 {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f34102Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ ActivityLifecycleIntegration f34103Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ io.sentry.T f34104h0;

    public /* synthetic */ C3616g(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.T t10, int i10) {
        this.f34102Y = i10;
        this.f34103Z = activityLifecycleIntegration;
        this.f34104h0 = t10;
    }

    private final void a(io.sentry.N n10) {
        ActivityLifecycleIntegration activityLifecycleIntegration = this.f34103Z;
        io.sentry.T t10 = this.f34104h0;
        activityLifecycleIntegration.getClass();
        D0 d02 = (D0) n10;
        synchronized (d02.f33775n) {
            if (d02.f33763b == t10) {
                ((D0) n10).a();
            }
        }
    }

    @Override // io.sentry.E0
    public final void f(io.sentry.N n10) {
        switch (this.f34102Y) {
            case 0:
                a(n10);
                return;
            default:
                ActivityLifecycleIntegration activityLifecycleIntegration = this.f34103Z;
                io.sentry.T t10 = this.f34104h0;
                activityLifecycleIntegration.getClass();
                D0 d02 = (D0) n10;
                synchronized (d02.f33775n) {
                    if (d02.f33763b == null) {
                        ((D0) n10).b(t10);
                    } else {
                        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f33921i0;
                        if (sentryAndroidOptions != null) {
                            sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", t10.getName());
                        }
                    }
                }
                return;
        }
    }
}
