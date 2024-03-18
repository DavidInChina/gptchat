package livekit.org.webrtc;

import java.util.concurrent.CountDownLatch;
import livekit.org.webrtc.VideoFrame;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38562Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f38563Z;

    public /* synthetic */ h(int i10, Object obj) {
        this.f38562Y = i10;
        this.f38563Z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f38562Y;
        Object obj = this.f38563Z;
        switch (i10) {
            case 0:
                EglRenderer.g((EglRenderer) obj);
                return;
            case 1:
                ((VideoFrame.I420Buffer) obj).release();
                return;
            case 2:
                ((CountDownLatch) obj).countDown();
                return;
            default:
                VideoFileRenderer.d((VideoFileRenderer) obj);
                return;
        }
    }
}
