package Re;

import ce.AbstractC2397c;
import id.AbstractC3557B;
import livekit.org.webrtc.PeerConnectionFactory;

/* loaded from: classes2.dex */
public final class q implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f15488a;

    public q(p000if.a aVar) {
        this.f15488a = aVar;
    }

    @Override // p000if.a
    public final Object get() {
        PeerConnectionFactory peerConnectionFactory = (PeerConnectionFactory) this.f15488a.get();
        AbstractC3557B.c0("peerConnectionFactory", peerConnectionFactory);
        return new m(peerConnectionFactory);
    }
}
