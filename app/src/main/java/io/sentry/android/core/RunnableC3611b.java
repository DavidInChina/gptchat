package io.sentry.android.core;

import android.app.Activity;

/* renamed from: io.sentry.android.core.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3611b implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f34085Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3614e f34086Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Activity f34087h0;

    public /* synthetic */ RunnableC3611b(C3614e c3614e, Activity activity, int i10) {
        this.f34085Y = i10;
        this.f34086Z = c3614e;
        this.f34087h0 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f34085Y;
        Activity activity = this.f34087h0;
        C3614e c3614e = this.f34086Z;
        switch (i10) {
            case 0:
                c3614e.f34093a.f24909a.g(activity);
                return;
            default:
                c3614e.f34093a.f24909a.t(activity);
                return;
        }
    }
}
