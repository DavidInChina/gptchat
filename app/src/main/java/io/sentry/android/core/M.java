package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import io.sentry.C3640e;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.S0;

/* loaded from: classes2.dex */
public final class M extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final io.sentry.G f33998a;

    /* renamed from: b  reason: collision with root package name */
    public final B f33999b;

    /* renamed from: c  reason: collision with root package name */
    public Network f34000c = null;

    /* renamed from: d  reason: collision with root package name */
    public NetworkCapabilities f34001d = null;

    /* renamed from: e  reason: collision with root package name */
    public long f34002e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final S0 f34003f;

    public M(B b10, S0 s02) {
        io.sentry.A a5 = io.sentry.A.f33710a;
        this.f33998a = a5;
        Ad.l.Z0("BuildInfoProvider is required", b10);
        this.f33999b = b10;
        Ad.l.Z0("SentryDateProvider is required", s02);
        this.f34003f = s02;
    }

    public static C3640e a(String str) {
        C3640e c3640e = new C3640e();
        c3640e.f34320h0 = "system";
        c3640e.f34322j0 = "network.event";
        c3640e.a("action", str);
        c3640e.f34323k0 = EnumC3642e1.INFO;
        return c3640e;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        if (network.equals(this.f34000c)) {
            return;
        }
        this.f33998a.i(a("NETWORK_AVAILABLE"));
        this.f34000c = network;
        this.f34001d = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        long j6;
        L l10;
        int i10;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (!network.equals(this.f34000c)) {
            return;
        }
        long d10 = this.f34003f.e().d();
        NetworkCapabilities networkCapabilities2 = this.f34001d;
        long j10 = this.f34002e;
        B b10 = this.f33999b;
        if (networkCapabilities2 == null) {
            l10 = new L(networkCapabilities, b10, d10);
            j6 = d10;
        } else {
            Ad.l.Z0("BuildInfoProvider is required", b10);
            int linkDownstreamBandwidthKbps = networkCapabilities2.getLinkDownstreamBandwidthKbps();
            int linkUpstreamBandwidthKbps = networkCapabilities2.getLinkUpstreamBandwidthKbps();
            if (Build.VERSION.SDK_INT >= 29) {
                i10 = networkCapabilities2.getSignalStrength();
            } else {
                i10 = 0;
            }
            if (i10 <= -100) {
                i10 = 0;
            }
            boolean hasTransport = networkCapabilities2.hasTransport(4);
            if (networkCapabilities2.hasTransport(3)) {
                str = "ethernet";
            } else if (networkCapabilities2.hasTransport(1)) {
                str = "wifi";
            } else if (networkCapabilities2.hasTransport(0)) {
                str = "cellular";
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            L l11 = new L(networkCapabilities, b10, d10);
            int abs = Math.abs(i10 - l11.f33994c);
            int abs2 = Math.abs(linkDownstreamBandwidthKbps - l11.f33992a);
            int abs3 = Math.abs(linkUpstreamBandwidthKbps - l11.f33993b);
            if (Math.abs(j10 - l11.f33995d) / 1000000.0d < 5000.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && abs > 5) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z10) {
                j6 = d10;
                if (abs2 > Math.max(1000.0d, Math.abs(linkDownstreamBandwidthKbps) * 0.1d)) {
                    z12 = false;
                    if (z10 && abs3 > Math.max(1000.0d, Math.abs(linkUpstreamBandwidthKbps) * 0.1d)) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (hasTransport != l11.f33996e && str.equals(l11.f33997f) && z11 && z12 && z13) {
                        l10 = null;
                    } else {
                        l10 = l11;
                    }
                }
            } else {
                j6 = d10;
            }
            z12 = true;
            if (z10) {
            }
            z13 = true;
            if (hasTransport != l11.f33996e) {
            }
            l10 = l11;
        }
        if (l10 == null) {
            return;
        }
        this.f34001d = networkCapabilities;
        this.f34002e = j6;
        C3640e a5 = a("NETWORK_CAPABILITIES_CHANGED");
        a5.a("download_bandwidth", Integer.valueOf(l10.f33992a));
        a5.a("upload_bandwidth", Integer.valueOf(l10.f33993b));
        a5.a("vpn_active", Boolean.valueOf(l10.f33996e));
        a5.a("network_type", l10.f33997f);
        int i11 = l10.f33994c;
        if (i11 != 0) {
            a5.a("signal_strength", Integer.valueOf(i11));
        }
        C3686u c3686u = new C3686u();
        c3686u.c("android:networkCapabilities", l10);
        this.f33998a.o(a5, c3686u);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (!network.equals(this.f34000c)) {
            return;
        }
        this.f33998a.i(a("NETWORK_LOST"));
        this.f34000c = null;
        this.f34001d = null;
    }
}
