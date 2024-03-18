package df;

import id.AbstractC3557B;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.HardwareVideoEncoderFactory;
import livekit.org.webrtc.SimulcastVideoEncoderFactory;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.x;

/* renamed from: df.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2651p implements VideoEncoderFactory {

    /* renamed from: a  reason: collision with root package name */
    public final SimulcastVideoEncoderFactory f28288a;

    public C2651p(EglBase.Context context) {
        C2650o c2650o = new C2650o(new HardwareVideoEncoderFactory(context, true, false));
        this.f28288a = new SimulcastVideoEncoderFactory(c2650o, new C2650o(new C2646k(c2650o)));
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return this.f28288a.createEncoder(videoCodecInfo);
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return x.a(this);
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final /* synthetic */ VideoCodecInfo[] getImplementations() {
        return x.b(this);
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo[] supportedCodecs = this.f28288a.getSupportedCodecs();
        AbstractC3557B.b0("native.supportedCodecs", supportedCodecs);
        return supportedCodecs;
    }
}
