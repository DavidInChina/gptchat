package livekit.org.webrtc;

/* loaded from: classes.dex */
class FramerateBitrateAdjuster extends BaseBitrateAdjuster {
    private static final int DEFAULT_FRAMERATE_FPS = 30;

    @Override // livekit.org.webrtc.BaseBitrateAdjuster, livekit.org.webrtc.BitrateAdjuster
    public void setTargets(int i10, double d10) {
        this.targetFramerateFps = 30.0d;
        this.targetBitrateBps = (int) ((i10 * 30) / d10);
    }
}
