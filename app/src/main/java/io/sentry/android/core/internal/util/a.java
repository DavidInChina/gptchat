package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import io.sentry.C;

/* loaded from: classes2.dex */
public final class a extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C f34153a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ U3.i f34154b;

    public a(U3.i iVar, C c10) {
        this.f34154b = iVar;
        this.f34153a = c10;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f34154b.g();
        this.f34153a.a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i10) {
        this.f34154b.g();
        this.f34153a.a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f34154b.g();
        this.f34153a.a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        this.f34154b.g();
        this.f34153a.a();
    }
}
