package df;

import id.AbstractC3557B;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import livekit.org.webrtc.VideoCodecStatus;
import livekit.org.webrtc.VideoEncoder;
import livekit.org.webrtc.VideoFrame;
import v4.CallableC5972b;

/* renamed from: df.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2649n implements VideoEncoder {

    /* renamed from: a  reason: collision with root package name */
    public final VideoEncoder f28284a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f28285b;

    /* renamed from: c  reason: collision with root package name */
    public VideoEncoder.Settings f28286c;

    public C2649n(VideoEncoder videoEncoder) {
        this.f28284a = videoEncoder;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC3557B.b0("newSingleThreadExecutor()", newSingleThreadExecutor);
        this.f28285b = newSingleThreadExecutor;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final long createNativeVideoEncoder() {
        Object obj = this.f28285b.submit(new CallableC2647l(this, 6)).get();
        AbstractC3557B.b0("future.get()", obj);
        return ((Number) obj).longValue();
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
        AbstractC3557B.c0("frame", videoFrame);
        Object obj = this.f28285b.submit(new M3.o(this, videoFrame, encodeInfo, 2)).get();
        AbstractC3557B.b0("future.get()", obj);
        return (VideoCodecStatus) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoEncoder.EncoderInfo getEncoderInfo() {
        Object obj = this.f28285b.submit(new CallableC2647l(this, 3)).get();
        AbstractC3557B.b0("future.get()", obj);
        return (VideoEncoder.EncoderInfo) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final String getImplementationName() {
        Object obj = this.f28285b.submit(new CallableC2647l(this, 1)).get();
        AbstractC3557B.b0("future.get()", obj);
        return (String) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
        Object obj = this.f28285b.submit(new CallableC2647l(this, 2)).get();
        AbstractC3557B.b0("future.get()", obj);
        return (VideoEncoder.ResolutionBitrateLimits[]) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoEncoder.ScalingSettings getScalingSettings() {
        Object obj = this.f28285b.submit(new CallableC2647l(this, 0)).get();
        AbstractC3557B.b0("future.get()", obj);
        return (VideoEncoder.ScalingSettings) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        AbstractC3557B.c0("settings", settings);
        this.f28286c = settings;
        Object obj = this.f28285b.submit(new M3.o(this, settings, callback, 3)).get();
        AbstractC3557B.b0("future.get()", obj);
        return (VideoCodecStatus) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final boolean isHardwareEncoder() {
        Object obj = this.f28285b.submit(new CallableC2647l(this, 4)).get();
        AbstractC3557B.b0("future.get()", obj);
        return ((Boolean) obj).booleanValue();
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus release() {
        Object obj = this.f28285b.submit(new CallableC2647l(this, 5)).get();
        AbstractC3557B.b0("future.get()", obj);
        return (VideoCodecStatus) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus setRateAllocation(final VideoEncoder.BitrateAllocation bitrateAllocation, final int i10) {
        Object obj = this.f28285b.submit(new Callable() { // from class: df.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C2649n c2649n = C2649n.this;
                AbstractC3557B.c0("this$0", c2649n);
                return c2649n.f28284a.setRateAllocation(bitrateAllocation, i10);
            }
        }).get();
        AbstractC3557B.b0("future.get()", obj);
        return (VideoCodecStatus) obj;
    }

    @Override // livekit.org.webrtc.VideoEncoder
    public final VideoCodecStatus setRates(VideoEncoder.RateControlParameters rateControlParameters) {
        Object obj = this.f28285b.submit(new CallableC5972b(this, 2, rateControlParameters)).get();
        AbstractC3557B.b0("future.get()", obj);
        return (VideoCodecStatus) obj;
    }
}
