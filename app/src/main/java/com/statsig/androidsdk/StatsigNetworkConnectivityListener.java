package com.statsig.androidsdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "isNetworkAvailable", "", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class StatsigNetworkConnectivityListener {
    private final ConnectivityManager connectivityManager;

    public StatsigNetworkConnectivityListener(Context context) {
        AbstractC3557B.c0("context", context);
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            this.connectivityManager = (ConnectivityManager) systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    public final boolean isNetworkAvailable() {
        Boolean bool;
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(this.connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(networkCapabilities.hasCapability(12));
        }
        return AbstractC3557B.K(bool, Boolean.TRUE);
    }
}
