package A2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import livekit.org.webrtc.MediaStreamTrack;
import s2.AbstractC5530A;

/* renamed from: A2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0057a {
    /* JADX WARN: Type inference failed for: r3v0, types: [x8.Q, x8.H] */
    private static final x8.S a() {
        ?? h10 = new x8.H();
        Integer[] numArr = {8, 7};
        P4.a.s(2, numArr);
        h10.h0(h10.f49514g + 2);
        System.arraycopy(numArr, 0, h10.f49513f, h10.f49514g, 2);
        h10.f49514g += 2;
        int i10 = AbstractC5530A.f45131a;
        if (i10 >= 31) {
            Integer[] numArr2 = {26, 27};
            P4.a.s(2, numArr2);
            h10.h0(h10.f49514g + 2);
            System.arraycopy(numArr2, 0, h10.f49513f, h10.f49514g, 2);
            h10.f49514g += 2;
        }
        if (i10 >= 33) {
            h10.d0(30);
        }
        return h10.j0();
    }

    public static final boolean b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        x8.S a5 = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (a5.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
