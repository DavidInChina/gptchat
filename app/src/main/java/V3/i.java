package V3;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class i {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        AbstractC3557B.c0("<this>", connectivityManager);
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i10) {
        AbstractC3557B.c0("<this>", networkCapabilities);
        return networkCapabilities.hasCapability(i10);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        AbstractC3557B.c0("<this>", connectivityManager);
        AbstractC3557B.c0("networkCallback", networkCallback);
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
