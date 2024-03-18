package Ze;

import Xe.m;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import id.AbstractC3557B;
import java.util.ArrayList;
import livekit.org.webrtc.Camera2Capturer;
import livekit.org.webrtc.Camera2Enumerator;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.VideoCapturer;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public Camera2Enumerator f23706a;

    @Override // Ze.c
    public final int a() {
        return 2;
    }

    @Override // Ze.c
    public final CameraEnumerator b(Context context) {
        Camera2Enumerator camera2Enumerator = this.f23706a;
        if (camera2Enumerator == null) {
            Camera2Enumerator camera2Enumerator2 = new Camera2Enumerator(context);
            this.f23706a = camera2Enumerator2;
            return camera2Enumerator2;
        }
        return camera2Enumerator;
    }

    @Override // Ze.c
    public final boolean c(Context context) {
        return Camera2Enumerator.isSupported(context);
    }

    @Override // Ze.c
    public final VideoCapturer d(Context context, m mVar, i iVar) {
        CameraEnumerator b10 = b(context);
        ArrayList arrayList = g.f23707a;
        String b11 = g.b(b10, mVar.f21909b, mVar.f21910c);
        CameraVideoCapturer createCapturer = b10.createCapturer(b11, iVar);
        AbstractC3557B.a0("null cannot be cast to non-null type livekit.org.webrtc.Camera2Capturer", createCapturer);
        Object systemService = context.getSystemService("camera");
        AbstractC3557B.a0("null cannot be cast to non-null type android.hardware.camera2.CameraManager", systemService);
        return new b((Camera2Capturer) createCapturer, (CameraManager) systemService, b11, iVar);
    }
}
