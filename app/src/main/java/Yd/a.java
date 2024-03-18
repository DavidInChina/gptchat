package Yd;

import Wd.d;
import Wd.e;
import Wd.f;
import Wd.g;
import Wd.h;
import Wd.k;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import id.AbstractC3557B;
import java.util.ArrayList;
import kf.t;

/* loaded from: classes.dex */
public final class a extends AudioDeviceCallback implements c {

    /* renamed from: a  reason: collision with root package name */
    public b f22286a;

    /* renamed from: b  reason: collision with root package name */
    public final AudioManager f22287b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f22288c;

    public a(AudioManager audioManager, Handler handler) {
        AbstractC3557B.c0("audioManager", audioManager);
        AbstractC3557B.c0("handler", handler);
        this.f22287b = audioManager;
        this.f22288c = handler;
    }

    public static h c(AudioDeviceInfo audioDeviceInfo) {
        f fVar;
        AbstractC3557B.c0("$this$audioDevice", audioDeviceInfo);
        if (audioDeviceInfo.getType() != 7 && audioDeviceInfo.getType() != 8) {
            if (Build.VERSION.SDK_INT >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                return new d(audioDeviceInfo.getProductName().toString());
            }
            if (audioDeviceInfo.getType() != 3 && audioDeviceInfo.getType() != 4 && audioDeviceInfo.getType() != 22) {
                if (audioDeviceInfo.getType() == 1) {
                    return new e();
                }
                if (audioDeviceInfo.getType() == 2) {
                    fVar = new f();
                } else {
                    fVar = null;
                }
                return fVar;
            }
            return new g();
        }
        return new d(audioDeviceInfo.getProductName().toString());
    }

    @Override // Yd.c
    public final void a(k kVar) {
        this.f22286a = kVar;
        this.f22287b.registerAudioDeviceCallback(this, this.f22288c);
    }

    @Override // Yd.c
    public final boolean b(h hVar) {
        AudioDeviceInfo[] devices = this.f22287b.getDevices(2);
        AbstractC3557B.b0("this.audioManager\n      \u2026ager.GET_DEVICES_OUTPUTS)", devices);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            AbstractC3557B.b0("it", audioDeviceInfo);
            if (hVar instanceof d) {
                if (audioDeviceInfo.getType() != 7) {
                    if (audioDeviceInfo.getType() != 8) {
                        if (Build.VERSION.SDK_INT < 31) {
                            continue;
                        } else if (audioDeviceInfo.getType() != 26 && audioDeviceInfo.getType() != 27) {
                        }
                    }
                }
                return true;
            } else if (hVar instanceof e) {
                if (audioDeviceInfo.getType() == 1) {
                    return true;
                }
            } else if (hVar instanceof f) {
                if (audioDeviceInfo.getType() == 2) {
                    return true;
                }
            } else if (hVar instanceof g) {
                if (audioDeviceInfo.getType() != 3) {
                    if (audioDeviceInfo.getType() != 4) {
                        if (Build.VERSION.SDK_INT >= 26 && audioDeviceInfo.getType() == 22) {
                        }
                    }
                }
                return true;
            } else {
                throw new RuntimeException();
            }
        }
        return false;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        if (audioDeviceInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                h c10 = c(audioDeviceInfo);
                if (c10 != null) {
                    arrayList.add(c10);
                }
            }
            for (h hVar : t.P2(arrayList)) {
                b bVar = this.f22286a;
                if (bVar != null) {
                    ((Wd.c) bVar).c(hVar);
                }
            }
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        if (audioDeviceInfoArr != null) {
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                h c10 = c(audioDeviceInfo);
                if (c10 != null) {
                    arrayList.add(c10);
                }
            }
            for (h hVar : t.P2(arrayList)) {
                b bVar = this.f22286a;
                if (bVar != null) {
                    ((k) bVar).g(hVar);
                }
            }
        }
    }

    @Override // Yd.c
    public final void stop() {
        this.f22287b.unregisterAudioDeviceCallback(this);
        this.f22286a = null;
    }
}
