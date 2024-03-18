package Re;

import cf.AbstractC2408g;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class l implements JavaAudioDeviceModule.AudioTrackStateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Qe.h f15473a;

    public l(Qe.h hVar) {
        this.f15473a = hVar;
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public final void onWebRtcAudioTrackStart() {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.e(new Object[0]);
        }
        this.f15473a.b();
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public final void onWebRtcAudioTrackStop() {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.e(new Object[0]);
        }
        this.f15473a.a();
    }
}
