package y2;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* renamed from: y2.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC6515b {
    public static /* bridge */ /* synthetic */ int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }

    public static /* synthetic */ AudioFocusRequest.Builder b(int i10) {
        return new AudioFocusRequest.Builder(i10);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder c(AudioFocusRequest.Builder builder, C6516c c6516c) {
        return builder.setOnAudioFocusChangeListener(c6516c);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder d(AudioFocusRequest.Builder builder, boolean z10) {
        return builder.setWillPauseWhenDucked(z10);
    }

    public static /* synthetic */ AudioFocusRequest.Builder e(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest f(AudioFocusRequest.Builder builder) {
        return builder.build();
    }

    public static /* synthetic */ void g() {
    }

    public static /* bridge */ /* synthetic */ void h(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }
}
