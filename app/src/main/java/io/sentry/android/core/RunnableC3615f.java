package io.sentry.android.core;

/* renamed from: io.sentry.android.core.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3615f implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f34098Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ ActivityLifecycleIntegration f34099Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ io.sentry.S f34100h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ io.sentry.S f34101i0;

    public /* synthetic */ RunnableC3615f(ActivityLifecycleIntegration activityLifecycleIntegration, io.sentry.S s10, io.sentry.S s11, int i10) {
        this.f34098Y = i10;
        this.f34099Z = activityLifecycleIntegration;
        this.f34100h0 = s10;
        this.f34101i0 = s11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f34098Y;
        io.sentry.S s10 = this.f34101i0;
        io.sentry.S s11 = this.f34100h0;
        ActivityLifecycleIntegration activityLifecycleIntegration = this.f34099Z;
        switch (i10) {
            case 0:
                activityLifecycleIntegration.m(s11, s10);
                return;
            case 1:
                activityLifecycleIntegration.m(s11, s10);
                return;
            default:
                activityLifecycleIntegration.getClass();
                ActivityLifecycleIntegration.i(s11, s10);
                return;
        }
    }
}
