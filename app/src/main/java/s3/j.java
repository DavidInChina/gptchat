package S3;

import L3.s;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import id.AbstractC3557B;
import x1.AbstractC6265a;

/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16126a;

    static {
        String f6 = s.f("NetworkStateTracker");
        AbstractC3557B.b0("tagWithPrefix(\"NetworkStateTracker\")", f6);
        f16126a = f6;
    }

    public static final Q3.d a(ConnectivityManager connectivityManager) {
        boolean z10;
        boolean z11;
        NetworkCapabilities a5;
        AbstractC3557B.c0("<this>", connectivityManager);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z12 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            a5 = V3.i.a(connectivityManager, V3.j.a(connectivityManager));
        } catch (SecurityException e10) {
            s.d().c(f16126a, "Unable to validate active network", e10);
        }
        if (a5 != null) {
            z11 = V3.i.b(a5, 16);
            boolean a10 = AbstractC6265a.a(connectivityManager);
            if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                z12 = false;
            }
            return new Q3.d(z10, z11, a10, z12);
        }
        z11 = false;
        boolean a102 = AbstractC6265a.a(connectivityManager);
        if (activeNetworkInfo != null) {
        }
        z12 = false;
        return new Q3.d(z10, z11, a102, z12);
    }
}
