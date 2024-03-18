package df;

import id.AbstractC3557B;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.WrappedNativeVideoEncoder;
import livekit.org.webrtc.x;

/* renamed from: df.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2650o implements VideoEncoderFactory {

    /* renamed from: a  reason: collision with root package name */
    public final VideoEncoderFactory f28287a;

    public C2650o(VideoEncoderFactory videoEncoderFactory) {
        this.f28287a = videoEncoderFactory;
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        VideoEncoder createEncoder = this.f28287a.createEncoder(videoCodecInfo);
        if (createEncoder == null) {
            return null;
        }
        if (createEncoder instanceof WrappedNativeVideoEncoder) {
            return createEncoder;
        }
        return new C2649n(createEncoder);
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
        VideoCodecInfo[] supportedCodecs = this.f28287a.getSupportedCodecs();
        AbstractC3557B.b0("factory.supportedCodecs", supportedCodecs);
        return supportedCodecs;
    }
}
