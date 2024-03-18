package y2;

import A2.C0059c;
import A2.C0062f;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: y2.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6503F extends AudioDeviceCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f50339a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f50340b;

    public /* synthetic */ C6503F(int i10, Object obj) {
        this.f50339a = i10;
        this.f50340b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i10 = this.f50339a;
        Object obj = this.f50340b;
        switch (i10) {
            case 0:
                C6504G c6504g = (C6504G) obj;
                if (c6504g.q()) {
                    d0 d0Var = c6504g.f50360W;
                    if (d0Var.f50548m == 3) {
                        c6504g.C(1, 0, d0Var.f50547l);
                        return;
                    }
                    return;
                }
                return;
            default:
                C0062f c0062f = (C0062f) obj;
                C0062f.a(c0062f, C0059c.b(c0062f.f543a));
                return;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i10 = this.f50339a;
        Object obj = this.f50340b;
        switch (i10) {
            case 0:
                C6504G c6504g = (C6504G) obj;
                if (!c6504g.q()) {
                    c6504g.C(1, 3, c6504g.f50360W.f50547l);
                    return;
                }
                return;
            default:
                C0062f c0062f = (C0062f) obj;
                C0062f.a(c0062f, C0059c.b(c0062f.f543a));
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6503F(C0062f c0062f) {
        this(1, c0062f);
        this.f50339a = 1;
    }
}
