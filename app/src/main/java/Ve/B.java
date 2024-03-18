package Ve;

import cf.AbstractC2408g;
import j$.util.Objects;
import livekit.org.webrtc.PeerConnection;
import wf.AbstractC6216a;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class B extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C f18611Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ PeerConnection.PeerConnectionState f18612Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c10, PeerConnection.PeerConnectionState peerConnectionState) {
        super(0);
        this.f18611Y = c10;
        this.f18612Z = peerConnectionState;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        AbstractC2408g.Companion.getClass();
        int b10 = AbstractC6708l.b(1, 7);
        PeerConnection.PeerConnectionState peerConnectionState = this.f18612Z;
        if (b10 >= 0 && Mi.a.d() > 0) {
            Objects.toString(peerConnectionState);
            Mi.a.e(new Object[0]);
        }
        wf.k kVar = this.f18611Y.f18617c;
        if (kVar != null) {
            kVar.invoke(peerConnectionState);
            return jf.y.f36177a;
        }
        return null;
    }
}
