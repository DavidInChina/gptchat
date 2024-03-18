package Ve;

import id.AbstractC3557B;
import livekit.org.webrtc.PeerConnection;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ve.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1508m extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1519y f18824Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508m(C1519y c1519y, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f18824Y = c1519y;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C1508m(this.f18824Y, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C1508m) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        PeerConnection peerConnection = this.f18824Y.f18921c;
        AbstractC3557B.c0("<this>", peerConnection);
        PeerConnection.PeerConnectionState connectionState = peerConnection.connectionState();
        AbstractC3557B.b0("connectionState()", connectionState);
        if (connectionState == PeerConnection.PeerConnectionState.CONNECTED) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
