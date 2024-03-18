package S3;

import L3.s;
import Ve.k0;
import Ve.r0;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import cf.AbstractC2408g;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16122a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16123b;

    public /* synthetic */ h(int i10, Object obj) {
        this.f16122a = i10;
        this.f16123b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        int i10 = this.f16122a;
        Object obj = this.f16123b;
        switch (i10) {
            case 1:
                p4.g.a((p4.g) obj, network, true);
                return;
            case 2:
                AbstractC3557B.c0("network", network);
                r0 r0Var = (r0) obj;
                if (r0Var.f18887z) {
                    AbstractC2408g.Companion.getClass();
                    if (AbstractC6708l.b(2, 7) >= 0 && Mi.a.d() > 0) {
                        Mi.a.c(new Object[0]);
                    }
                    if (r0Var.g() != k0.f18809i0) {
                        r0Var.f18863b.k();
                    }
                    r0Var.f18887z = false;
                    return;
                }
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f16122a) {
            case 0:
                AbstractC3557B.c0("network", network);
                AbstractC3557B.c0("capabilities", networkCapabilities);
                s d10 = s.d();
                String str = j.f16126a;
                d10.a(str, "Network capabilities changed: " + networkCapabilities);
                i iVar = (i) this.f16123b;
                iVar.b(j.a(iVar.f16124f));
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i10 = this.f16122a;
        Object obj = this.f16123b;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("network", network);
                s.d().a(j.f16126a, "Network connection lost");
                i iVar = (i) obj;
                iVar.b(j.a(iVar.f16124f));
                return;
            case 1:
                p4.g.a((p4.g) obj, network, false);
                return;
            default:
                AbstractC3557B.c0("network", network);
                ((r0) obj).f18887z = true;
                return;
        }
    }
}
