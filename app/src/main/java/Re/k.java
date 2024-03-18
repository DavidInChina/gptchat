package Re;

import cf.AbstractC2408g;
import j$.util.Objects;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class k implements JavaAudioDeviceModule.AudioTrackErrorCallback {
    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public final void onWebRtcAudioTrackError(String str) {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.b(new Object[0]);
        }
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public final void onWebRtcAudioTrackInitError(String str) {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.b(new Object[0]);
        }
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public final void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
            Objects.toString(audioTrackStartErrorCode);
            Mi.a.b(new Object[0]);
        }
    }
}
