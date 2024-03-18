package V3;

import android.net.ConnectivityManager;
import android.net.Network;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public abstract class j {
    public static final Network a(ConnectivityManager connectivityManager) {
        AbstractC3557B.c0("<this>", connectivityManager);
        return connectivityManager.getActiveNetwork();
    }
}
