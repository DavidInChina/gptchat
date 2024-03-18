package Ve;

import id.AbstractC3557B;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.RtpSender;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Ve.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1493d0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f18748Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ MediaStreamTrack f18749Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1493d0(MediaStreamTrack mediaStreamTrack, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f18749Z = mediaStreamTrack;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C1493d0 c1493d0 = new C1493d0(this.f18749Z, abstractC4825e);
        c1493d0.f18748Y = obj;
        return c1493d0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C1493d0) create((PeerConnection) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        PeerConnection peerConnection = (PeerConnection) this.f18748Y;
        for (RtpSender rtpSender : peerConnection.getSenders()) {
            MediaStreamTrack track = rtpSender.track();
            if (track != null && AbstractC3557B.K(track.id(), this.f18749Z.id())) {
                peerConnection.removeTrack(rtpSender);
            }
        }
        return jf.y.f36177a;
    }
}
