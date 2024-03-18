package df;

import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.SoftwareVideoEncoderFactory;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.x;

/* renamed from: df.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2637b implements VideoEncoderFactory {

    /* renamed from: b  reason: collision with root package name */
    public final List f28258b;

    /* renamed from: d  reason: collision with root package name */
    public final C2651p f28260d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28257a = false;

    /* renamed from: c  reason: collision with root package name */
    public final SoftwareVideoEncoderFactory f28259c = new SoftwareVideoEncoderFactory();

    public C2637b(EglBase.Context context) {
        List F02 = AbstractC4344b.F0("VP9");
        this.f28258b = F02;
        this.f28260d = new C2651p(context);
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        AbstractC3557B.c0("videoCodecInfo", videoCodecInfo);
        boolean z10 = this.f28257a;
        SoftwareVideoEncoderFactory softwareVideoEncoderFactory = this.f28259c;
        if (z10) {
            return softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        }
        List list = this.f28258b;
        if ((!list.isEmpty()) && list.contains(videoCodecInfo.name)) {
            return softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        }
        return this.f28260d.f28288a.createEncoder(videoCodecInfo);
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
        if (this.f28257a && this.f28258b.isEmpty()) {
            VideoCodecInfo[] supportedCodecs = this.f28259c.getSupportedCodecs();
            AbstractC3557B.b0("{\n            softwareVi\u2026supportedCodecs\n        }", supportedCodecs);
            return supportedCodecs;
        }
        return this.f28260d.getSupportedCodecs();
    }
}
