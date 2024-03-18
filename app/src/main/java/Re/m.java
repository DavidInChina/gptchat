package Re;

import id.AbstractC3557B;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.RtpCapabilities;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ PeerConnectionFactory f15474Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PeerConnectionFactory peerConnectionFactory) {
        super(1);
        this.f15474Y = peerConnectionFactory;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        MediaStreamTrack.MediaType mediaType = (MediaStreamTrack.MediaType) obj;
        AbstractC3557B.c0("mediaType", mediaType);
        RtpCapabilities rtpSenderCapabilities = this.f15474Y.getRtpSenderCapabilities(mediaType);
        AbstractC3557B.b0("peerConnectionFactory.ge\u2026erCapabilities(mediaType)", rtpSenderCapabilities);
        return rtpSenderCapabilities;
    }
}
