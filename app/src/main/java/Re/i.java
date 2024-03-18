package Re;

import cf.AbstractC2408g;
import j$.util.Objects;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class i implements JavaAudioDeviceModule.AudioRecordErrorCallback {
    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public final void onWebRtcAudioRecordError(String str) {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.b(new Object[0]);
        }
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public final void onWebRtcAudioRecordInitError(String str) {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.b(new Object[0]);
        }
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public final void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(5, 7) >= 0 && Mi.a.d() > 0) {
            Objects.toString(audioRecordStartErrorCode);
            Mi.a.b(new Object[0]);
        }
    }
}
