package Ze;

import Xe.m;
import android.content.Context;
import id.AbstractC3557B;
import java.util.ArrayList;
import jf.C3963m;
import livekit.org.webrtc.Camera1Capturer;
import livekit.org.webrtc.Camera1Enumerator;
import livekit.org.webrtc.Camera1Helper;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.CameraVideoCapturer;
import livekit.org.webrtc.VideoCapturer;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public final C3963m f23704a = R4.b.D1(d.f23703Y);

    /* renamed from: b  reason: collision with root package name */
    public final int f23705b = 1;

    @Override // Ze.c
    public final int a() {
        return this.f23705b;
    }

    @Override // Ze.c
    public final CameraEnumerator b(Context context) {
        return (Camera1Enumerator) this.f23704a.getValue();
    }

    @Override // Ze.c
    public final boolean c(Context context) {
        return true;
    }

    @Override // Ze.c
    public final VideoCapturer d(Context context, m mVar, i iVar) {
        ArrayList arrayList = g.f23707a;
        C3963m c3963m = this.f23704a;
        String b10 = g.b((Camera1Enumerator) c3963m.getValue(), mVar.f21909b, mVar.f21910c);
        Camera1Helper.Companion companion = Camera1Helper.Companion;
        companion.getSupportedFormats(companion.getCameraId(b10));
        CameraVideoCapturer createCapturer = ((Camera1Enumerator) c3963m.getValue()).createCapturer(b10, iVar);
        AbstractC3557B.a0("null cannot be cast to non-null type livekit.org.webrtc.Camera1Capturer", createCapturer);
        return new a((Camera1Capturer) createCapturer, b10, iVar);
    }
}
