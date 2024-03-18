package V3;

import android.net.ConnectivityManager;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class k {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        AbstractC3557B.c0("<this>", connectivityManager);
        AbstractC3557B.c0("networkCallback", networkCallback);
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
