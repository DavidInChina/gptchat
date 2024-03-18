package Ve;

import df.AbstractC2639d;
import id.AbstractC3557B;
import livekit.org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final class J extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18670Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C1503i0 c1503i0) {
        super(1);
        this.f18670Y = c1503i0;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        PeerConnection.PeerConnectionState peerConnectionState = (PeerConnection.PeerConnectionState) obj;
        AbstractC3557B.c0("newState", peerConnectionState);
        int i10 = AbstractC2639d.f28264a[peerConnectionState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f18670Y.k();
        }
        return jf.y.f36177a;
    }
}
