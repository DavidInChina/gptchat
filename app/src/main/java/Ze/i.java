package Ze;

import id.AbstractC3557B;
import java.util.LinkedHashSet;
import kf.t;
import livekit.org.webrtc.CameraVideoCapturer;

/* loaded from: classes.dex */
public final class i implements CameraVideoCapturer.CameraEventsHandler {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f23708a = new LinkedHashSet();

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraClosed() {
        for (CameraVideoCapturer.CameraEventsHandler cameraEventsHandler : t.O2(this.f23708a)) {
            cameraEventsHandler.onCameraClosed();
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraDisconnected() {
        for (CameraVideoCapturer.CameraEventsHandler cameraEventsHandler : t.O2(this.f23708a)) {
            cameraEventsHandler.onCameraDisconnected();
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraError(String str) {
        AbstractC3557B.c0("errorDescription", str);
        for (CameraVideoCapturer.CameraEventsHandler cameraEventsHandler : t.O2(this.f23708a)) {
            cameraEventsHandler.onCameraError(str);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraFreezed(String str) {
        AbstractC3557B.c0("errorDescription", str);
        for (CameraVideoCapturer.CameraEventsHandler cameraEventsHandler : t.O2(this.f23708a)) {
            cameraEventsHandler.onCameraFreezed(str);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onCameraOpening(String str) {
        AbstractC3557B.c0("cameraName", str);
        for (CameraVideoCapturer.CameraEventsHandler cameraEventsHandler : t.O2(this.f23708a)) {
            cameraEventsHandler.onCameraOpening(str);
        }
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public final void onFirstFrameAvailable() {
        for (CameraVideoCapturer.CameraEventsHandler cameraEventsHandler : t.O2(this.f23708a)) {
            cameraEventsHandler.onFirstFrameAvailable();
        }
    }
}
