package Re;

import android.media.AudioTrack;
import i4.AbstractC3469b;
import id.AbstractC3557B;
import java.io.Closeable;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.PeerConnectionFactory;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f15457Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f15458Z;

    public /* synthetic */ a(int i10, Object obj) {
        this.f15457Y = i10;
        this.f15458Z = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f15457Y) {
            case 0:
                Qe.m mVar = (Qe.m) this.f15458Z;
                mVar.f14704a.close();
                mVar.stop();
                AudioTrack audioTrack = mVar.f14707d;
                if (audioTrack != null) {
                    synchronized (audioTrack) {
                        audioTrack.release();
                    }
                    return;
                }
                return;
            case 1:
                ((PeerConnectionFactory) this.f15458Z).dispose();
                return;
            case 2:
                ((EglBase) this.f15458Z).release();
                return;
            case 3:
                ((JavaAudioDeviceModule) this.f15458Z).release();
                return;
            case 4:
                ((i4.m) ((AbstractC3469b) this.f15458Z)).close();
                return;
            default:
                Hi.n nVar = (Hi.n) this.f15458Z;
                Hi.m mVar2 = Hi.m.f7896a;
                AbstractC3557B.c0("$listener", nVar);
                Hi.m.f7897b.remove(nVar);
                return;
        }
    }
}
