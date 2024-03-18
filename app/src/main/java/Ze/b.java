package Ze;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.MediaRecorder;
import livekit.org.webrtc.Camera2Capturer;
import livekit.org.webrtc.Camera2Helper;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.CapturerObserver;
import livekit.org.webrtc.Size;
import livekit.org.webrtc.SurfaceTextureHelper;

/* loaded from: classes.dex */
public final class b extends h implements CameraVideoCapturer {

    /* renamed from: Y  reason: collision with root package name */
    public final Camera2Capturer f23700Y;

    /* renamed from: Z  reason: collision with root package name */
    public final CameraManager f23701Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f23702h0;

    public b(Camera2Capturer camera2Capturer, CameraManager cameraManager, String str, i iVar) {
        this.f23700Y = camera2Capturer;
        this.f23701Z = cameraManager;
        this.f23702h0 = str;
    }

    @Override // Ze.h
    public final Size a(int i10, int i11) {
        return Camera2Helper.Companion.findClosestCaptureFormat(this.f23701Z, this.f23702h0, i10, i11);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        livekit.org.webrtc.d.a(this, mediaRecorder, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void changeCaptureFormat(int i10, int i11, int i12) {
        this.f23700Y.changeCaptureFormat(i10, i11, i12);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void dispose() {
        this.f23700Y.dispose();
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.f23700Y.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final boolean isScreencast() {
        return this.f23700Y.isScreencast();
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final /* synthetic */ void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        livekit.org.webrtc.d.b(this, mediaRecorderHandler);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void startCapture(int i10, int i11, int i12) {
        this.f23700Y.startCapture(i10, i11, i12);
    }

    @Override // livekit.org.webrtc.VideoCapturer
    public final void stopCapture() {
        this.f23700Y.stopCapture();
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        this.f23700Y.switchCamera(cameraSwitchHandler);
    }

    @Override // livekit.org.webrtc.CameraVideoCapturer
    public final void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        this.f23700Y.switchCamera(cameraSwitchHandler, str);
    }
}
