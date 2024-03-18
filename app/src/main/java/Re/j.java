package Re;

import cf.AbstractC2408g;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class j implements JavaAudioDeviceModule.AudioRecordStateCallback {
    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public final void onWebRtcAudioRecordStart() {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.e(new Object[0]);
        }
    }

    @Override // livekit.org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public final void onWebRtcAudioRecordStop() {
        AbstractC2408g.Companion.getClass();
        if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
            Mi.a.e(new Object[0]);
        }
    }
}
