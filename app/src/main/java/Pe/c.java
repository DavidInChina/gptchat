package Pe;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import livekit.org.webrtc.PeerConnection;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13953a;

    /* renamed from: b  reason: collision with root package name */
    public final List f13954b;

    /* renamed from: c  reason: collision with root package name */
    public final PeerConnection.RTCConfiguration f13955c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13956d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13957e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13958f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13959g;

    /* renamed from: h  reason: collision with root package name */
    public String f13960h;

    public /* synthetic */ c() {
        this(true, null, null, false, false, 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13953a == cVar.f13953a && AbstractC3557B.K(this.f13954b, cVar.f13954b) && AbstractC3557B.K(this.f13955c, cVar.f13955c) && this.f13956d == cVar.f13956d && this.f13957e == cVar.f13957e && this.f13958f == cVar.f13958f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 1;
        boolean z10 = this.f13953a;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = i12 * 31;
        int i15 = 0;
        List list = this.f13954b;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i16 = (i14 + i10) * 31;
        PeerConnection.RTCConfiguration rTCConfiguration = this.f13955c;
        if (rTCConfiguration != null) {
            i15 = rTCConfiguration.hashCode();
        }
        int i17 = (i16 + i15) * 31;
        boolean z11 = this.f13956d;
        if (z11) {
            z11 = true;
        }
        int i18 = z11 ? 1 : 0;
        int i19 = z11 ? 1 : 0;
        int i20 = (i17 + i18) * 31;
        boolean z12 = this.f13957e;
        if (!z12) {
            i11 = z12 ? 1 : 0;
        }
        return AbstractC6708l.f(this.f13958f) + ((i20 + i11) * 31);
    }

    public final String toString() {
        return "ConnectOptions(autoSubscribe=" + this.f13953a + ", iceServers=" + this.f13954b + ", rtcConfig=" + this.f13955c + ", audio=" + this.f13956d + ", video=" + this.f13957e + ", protocolVersion=" + R.a.G(this.f13958f) + ')';
    }

    public c(boolean z10, List list, PeerConnection.RTCConfiguration rTCConfiguration, boolean z11, boolean z12, int i10) {
        AbstractC2469q0.q("protocolVersion", i10);
        this.f13953a = z10;
        this.f13954b = list;
        this.f13955c = rTCConfiguration;
        this.f13956d = z11;
        this.f13957e = z12;
        this.f13958f = i10;
    }
}
