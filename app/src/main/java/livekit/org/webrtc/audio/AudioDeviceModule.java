package livekit.org.webrtc.audio;

/* loaded from: classes.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z10);

    void setSpeakerMute(boolean z10);
}
