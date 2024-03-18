package df;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.ArrayList;
import kf.s;
import livekit.org.webrtc.SoftwareVideoEncoderFactory;
import livekit.org.webrtc.VideoCodecInfo;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoEncoderFactory;
import livekit.org.webrtc.VideoEncoderFallback;
import livekit.org.webrtc.x;

/* renamed from: df.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2646k implements VideoEncoderFactory {

    /* renamed from: a  reason: collision with root package name */
    public final VideoEncoderFactory f28277a;

    /* renamed from: b  reason: collision with root package name */
    public final SoftwareVideoEncoderFactory f28278b = new SoftwareVideoEncoderFactory();

    public C2646k(C2650o c2650o) {
        this.f28277a = c2650o;
    }

    @Override // livekit.org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        AbstractC3557B.c0(ParameterNames.INFO, videoCodecInfo);
        VideoEncoder createEncoder = this.f28278b.createEncoder(videoCodecInfo);
        VideoEncoder createEncoder2 = this.f28277a.createEncoder(videoCodecInfo);
        if (createEncoder2 != null && createEncoder != null) {
            return new VideoEncoderFallback(createEncoder2, createEncoder);
        }
        if (createEncoder == null) {
            return createEncoder2;
        }
        return createEncoder;
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
        ArrayList arrayList = new ArrayList();
        VideoCodecInfo[] supportedCodecs = this.f28278b.getSupportedCodecs();
        AbstractC3557B.b0("softwareVideoEncoderFactory.supportedCodecs", supportedCodecs);
        s.O1(arrayList, supportedCodecs);
        VideoCodecInfo[] supportedCodecs2 = this.f28277a.getSupportedCodecs();
        AbstractC3557B.b0("hardwareVideoEncoderFactory.supportedCodecs", supportedCodecs2);
        s.O1(arrayList, supportedCodecs2);
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[0]);
    }
}
