package df;

import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.SoftwareVideoDecoderFactory;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoDecoder;
import livekit.org.webrtc.VideoDecoderFactory;
import livekit.org.webrtc.WrappedVideoDecoderFactory;

/* renamed from: df.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2636a implements VideoDecoderFactory {

    /* renamed from: b  reason: collision with root package name */
    public final List f28254b;

    /* renamed from: d  reason: collision with root package name */
    public final WrappedVideoDecoderFactory f28256d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28253a = false;

    /* renamed from: c  reason: collision with root package name */
    public final SoftwareVideoDecoderFactory f28255c = new SoftwareVideoDecoderFactory();

    public C2636a(EglBase.Context context) {
        List F02 = AbstractC4344b.F0("VP9");
        this.f28254b = F02;
        this.f28256d = new WrappedVideoDecoderFactory(context);
    }

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        AbstractC3557B.c0("videoCodecInfo", videoCodecInfo);
        boolean z10 = this.f28253a;
        SoftwareVideoDecoderFactory softwareVideoDecoderFactory = this.f28255c;
        if (z10) {
            return softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        }
        List list = this.f28254b;
        if ((!list.isEmpty()) && list.contains(videoCodecInfo.name)) {
            return softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        }
        return this.f28256d.createDecoder(videoCodecInfo);
    }

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        if (this.f28253a && this.f28254b.isEmpty()) {
            VideoCodecInfo[] supportedCodecs = this.f28255c.getSupportedCodecs();
            AbstractC3557B.b0("{\n            softwareVi\u2026supportedCodecs\n        }", supportedCodecs);
            return supportedCodecs;
        }
        VideoCodecInfo[] supportedCodecs2 = this.f28256d.getSupportedCodecs();
        AbstractC3557B.b0("{\n            wrappedVid\u2026supportedCodecs\n        }", supportedCodecs2);
        return supportedCodecs2;
    }
}
