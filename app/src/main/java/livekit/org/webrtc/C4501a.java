package livekit.org.webrtc;

import livekit.org.webrtc.Camera2Session;

/* renamed from: livekit.org.webrtc.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4501a implements VideoSink {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38545Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f38546Z;

    public /* synthetic */ C4501a(int i10, Object obj) {
        this.f38545Y = i10;
        this.f38546Z = obj;
    }

    @Override // livekit.org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        int i10 = this.f38545Y;
        Object obj = this.f38546Z;
        switch (i10) {
            case 0:
                ((Camera1Session) obj).lambda$listenForTextureFrames$0(videoFrame);
                return;
            case 1:
                Camera2Session.CaptureSessionCallback.a((Camera2Session.CaptureSessionCallback) obj, videoFrame);
                return;
            default:
                ((VideoSource) obj).lambda$setVideoProcessor$1(videoFrame);
                return;
        }
    }
}
