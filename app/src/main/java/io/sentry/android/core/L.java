package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;

/* loaded from: classes2.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public final int f33992a;

    /* renamed from: b  reason: collision with root package name */
    public final int f33993b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33994c;

    /* renamed from: d  reason: collision with root package name */
    public final long f33995d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f33996e;

    /* renamed from: f  reason: collision with root package name */
    public final String f33997f;

    public L(NetworkCapabilities networkCapabilities, B b10, long j6) {
        int i10;
        String str;
        Ad.l.Z0("NetworkCapabilities is required", networkCapabilities);
        Ad.l.Z0("BuildInfoProvider is required", b10);
        this.f33992a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.f33993b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        if (Build.VERSION.SDK_INT >= 29) {
            i10 = networkCapabilities.getSignalStrength();
        } else {
            i10 = 0;
        }
        this.f33994c = i10 <= -100 ? 0 : i10;
        this.f33996e = networkCapabilities.hasTransport(4);
        if (networkCapabilities.hasTransport(3)) {
            str = "ethernet";
        } else if (networkCapabilities.hasTransport(1)) {
            str = "wifi";
        } else if (networkCapabilities.hasTransport(0)) {
            str = "cellular";
        } else {
            str = null;
        }
        this.f33997f = str == null ? "" : str;
        this.f33995d = j6;
    }
}
