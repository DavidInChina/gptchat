package y2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import s2.AbstractC5530A;

/* renamed from: y2.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6538z {
    public static boolean a(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
        if (AbstractC5530A.f45131a < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return true;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                return true;
            }
            int i10 = AbstractC5530A.f45131a;
            if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                return true;
            }
            if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                return true;
            }
            if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                return true;
            }
            if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                return true;
            }
        }
        return false;
    }

    public static void b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
    }
}
