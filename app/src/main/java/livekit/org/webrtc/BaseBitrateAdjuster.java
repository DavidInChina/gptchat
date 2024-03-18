package livekit.org.webrtc;

/* loaded from: classes2.dex */
class BaseBitrateAdjuster implements BitrateAdjuster {
    protected int targetBitrateBps;
    protected double targetFramerateFps;

    @Override // livekit.org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // livekit.org.webrtc.BitrateAdjuster
    public double getAdjustedFramerateFps() {
        return this.targetFramerateFps;
    }

    @Override // livekit.org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i10) {
    }

    @Override // livekit.org.webrtc.BitrateAdjuster
    public void setTargets(int i10, double d10) {
        this.targetBitrateBps = i10;
        this.targetFramerateFps = d10;
    }
}
