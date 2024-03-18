package Ve;

import a.C1888h;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.PeerConnectionFactory;

/* loaded from: classes2.dex */
public final class A implements AbstractC1492d {

    /* renamed from: a  reason: collision with root package name */
    public final C1520z f18607a;

    public A(C1520z c1520z) {
        this.f18607a = c1520z;
    }

    public final C1519y a(PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer, C c10) {
        C1520z c1520z = this.f18607a;
        return new C1519y(rTCConfiguration, observer, c10, (Ng.B) c1520z.f18930a.get(), (PeerConnectionFactory) c1520z.f18931b.get(), (C1888h) c1520z.f18932c.get());
    }
}
