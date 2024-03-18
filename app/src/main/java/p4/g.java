package p4;

import S3.h;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import f4.q;
import id.AbstractC3557B;
import jf.y;
import u4.k;

/* loaded from: classes2.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final ConnectivityManager f42733a;

    /* renamed from: b  reason: collision with root package name */
    public final e f42734b;

    /* renamed from: c  reason: collision with root package name */
    public final h f42735c;

    public g(ConnectivityManager connectivityManager, e eVar) {
        this.f42733a = connectivityManager;
        this.f42734b = eVar;
        h hVar = new h(1, this);
        this.f42735c = hVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), hVar);
    }

    public static final void a(g gVar, Network network, boolean z10) {
        Network[] allNetworks;
        y yVar;
        boolean z11 = false;
        for (Network network2 : gVar.f42733a.getAllNetworks()) {
            if (AbstractC3557B.K(network2, network)) {
                if (z10) {
                    z11 = true;
                    break;
                }
            } else {
                NetworkCapabilities networkCapabilities = gVar.f42733a.getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z11 = true;
                    break;
                }
            }
        }
        k kVar = (k) gVar.f42734b;
        synchronized (kVar) {
            try {
                if (((q) kVar.f46405Y.get()) != null) {
                    kVar.f46409j0 = z11;
                    yVar = y.f36177a;
                } else {
                    yVar = null;
                }
                if (yVar == null) {
                    kVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p4.f
    public final boolean c() {
        ConnectivityManager connectivityManager = this.f42733a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // p4.f
    public final void shutdown() {
        this.f42733a.unregisterNetworkCallback(this.f42735c);
    }
}
