package cd;

import android.net.ConnectivityManager;
import android.net.Network;
import id.AbstractC3557B;

/* renamed from: cd.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2391a extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2393c f26581a;

    public C2391a(C2393c c2393c) {
        this.f26581a = c2393c;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC3557B.c0("network", network);
        this.f26581a.f26590c.setValue(Boolean.TRUE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC3557B.c0("network", network);
        this.f26581a.f26590c.setValue(Boolean.FALSE);
    }
}
