package E5;

import F5.g;
import H5.h;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import id.AbstractC3557B;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import q5.C5274d;

/* loaded from: classes2.dex */
public final class c extends ConnectivityManager.NetworkCallback implements e {

    /* renamed from: Y  reason: collision with root package name */
    public final g f4532Y;

    /* renamed from: Z  reason: collision with root package name */
    public final R4.a f4533Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC5091c f4534h0;

    /* renamed from: i0  reason: collision with root package name */
    public C5274d f4535i0 = new C5274d(0, null, null, null, null, null, null, 127);

    /* JADX WARN: Type inference failed for: r0v0, types: [R4.a, java.lang.Object] */
    public c(h hVar, AbstractC5091c abstractC5091c) {
        ?? obj = new Object();
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f4532Y = hVar;
        this.f4533Z = obj;
        this.f4534h0 = abstractC5091c;
    }

    @Override // E5.e
    public final void F(Context context) {
        ConnectivityManager connectivityManager;
        g gVar = this.f4532Y;
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
                Network activeNetwork = connectivityManager.getActiveNetwork();
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (activeNetwork != null && networkCapabilities != null) {
                    onCapabilitiesChanged(activeNetwork, networkCapabilities);
                    return;
                }
                return;
            } catch (SecurityException e10) {
                P4.a.m0(this.f4534h0, 5, enumC5090b, b.f4526h0, e10, false, 48);
                C5274d c5274d = new C5274d(12, null, null, null, null, null, null, 126);
                this.f4535i0 = c5274d;
                gVar.a(c5274d);
                return;
            } catch (Exception e11) {
                P4.a.m0(this.f4534h0, 5, enumC5090b, b.f4527i0, e11, false, 48);
                C5274d c5274d2 = new C5274d(12, null, null, null, null, null, null, 126);
                this.f4535i0 = c5274d2;
                gVar.a(c5274d2);
                return;
            }
        }
        P4.a.m0(this.f4534h0, 5, enumC5090b, b.f4525Z, null, false, 56);
    }

    @Override // E5.e
    public final C5274d R() {
        return this.f4535i0;
    }

    @Override // E5.e
    public final void a(Context context) {
        ConnectivityManager connectivityManager;
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        if (connectivityManager == null) {
            P4.a.m0(this.f4534h0, 5, enumC5090b, b.f4528j0, null, false, 56);
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this);
        } catch (SecurityException e10) {
            P4.a.m0(this.f4534h0, 5, enumC5090b, b.f4529k0, e10, false, 48);
        } catch (RuntimeException e11) {
            P4.a.m0(this.f4534h0, 5, enumC5090b, b.f4530l0, e11, false, 48);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int i10;
        Long l10;
        Long l11;
        Long l12;
        int signalStrength;
        int signalStrength2;
        int i11;
        AbstractC3557B.c0("network", network);
        AbstractC3557B.c0("networkCapabilities", networkCapabilities);
        super.onCapabilitiesChanged(network, networkCapabilities);
        int i12 = 3;
        if (!networkCapabilities.hasTransport(1)) {
            i12 = 2;
            if (!networkCapabilities.hasTransport(3)) {
                if (networkCapabilities.hasTransport(0)) {
                    i11 = 11;
                } else if (networkCapabilities.hasTransport(2)) {
                    i11 = 5;
                } else {
                    i11 = 12;
                }
                i10 = i11;
                if (networkCapabilities.getLinkUpstreamBandwidthKbps() <= 0) {
                    l10 = Long.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps());
                } else {
                    l10 = null;
                }
                if (networkCapabilities.getLinkDownstreamBandwidthKbps() <= 0) {
                    l11 = Long.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps());
                } else {
                    l11 = null;
                }
                this.f4533Z.getClass();
                if (Build.VERSION.SDK_INT >= 29) {
                    signalStrength = networkCapabilities.getSignalStrength();
                    if (signalStrength != Integer.MIN_VALUE) {
                        signalStrength2 = networkCapabilities.getSignalStrength();
                        l12 = Long.valueOf(signalStrength2);
                        C5274d c5274d = new C5274d(i10, null, null, l10, l11, l12, null, 70);
                        this.f4535i0 = c5274d;
                        this.f4532Y.a(c5274d);
                    }
                }
                l12 = null;
                C5274d c5274d2 = new C5274d(i10, null, null, l10, l11, l12, null, 70);
                this.f4535i0 = c5274d2;
                this.f4532Y.a(c5274d2);
            }
        }
        i10 = i12;
        if (networkCapabilities.getLinkUpstreamBandwidthKbps() <= 0) {
        }
        if (networkCapabilities.getLinkDownstreamBandwidthKbps() <= 0) {
        }
        this.f4533Z.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
        }
        l12 = null;
        C5274d c5274d22 = new C5274d(i10, null, null, l10, l11, l12, null, 70);
        this.f4535i0 = c5274d22;
        this.f4532Y.a(c5274d22);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC3557B.c0("network", network);
        super.onLost(network);
        C5274d c5274d = new C5274d(1, null, null, null, null, null, null, 126);
        this.f4535i0 = c5274d;
        this.f4532Y.a(c5274d);
    }
}
