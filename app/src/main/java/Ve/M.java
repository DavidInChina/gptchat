package Ve;

import cf.AbstractC2408g;
import df.AbstractC2639d;
import id.AbstractC3557B;
import livekit.org.webrtc.PeerConnection;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class M extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1503i0 f18678Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C1503i0 c1503i0) {
        super(1);
        this.f18678Y = c1503i0;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        PeerConnection.PeerConnectionState peerConnectionState = (PeerConnection.PeerConnectionState) obj;
        AbstractC3557B.c0("newState", peerConnectionState);
        AbstractC2408g.Companion.getClass();
        boolean z10 = false;
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            peerConnectionState.toString();
            Mi.a.e(new Object[0]);
        }
        if (peerConnectionState == PeerConnection.PeerConnectionState.CONNECTED) {
            z10 = true;
        }
        C1503i0 c1503i0 = this.f18678Y;
        if (z10) {
            c1503i0.m(EnumC1486a.f18719Z);
        } else {
            int i10 = AbstractC2639d.f28264a[peerConnectionState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                c1503i0.m(EnumC1486a.f18720h0);
            }
        }
        return jf.y.f36177a;
    }
}
