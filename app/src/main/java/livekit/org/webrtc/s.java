package livekit.org.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import livekit.org.webrtc.TextureBufferImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38579Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f38580Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f38581h0;

    public /* synthetic */ s(Object obj, int i10, Object obj2) {
        this.f38579Y = i10;
        this.f38580Z = obj;
        this.f38581h0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f38579Y;
        Object obj = this.f38581h0;
        Object obj2 = this.f38580Z;
        switch (i10) {
            case 0:
                TextureBufferImpl.a((TextureBufferImpl) obj2, (TextureBufferImpl.RefCountMonitor) obj);
                return;
            case 1:
                EglRenderer.e((EglRenderer) obj2, (CountDownLatch) obj);
                return;
            case 2:
                EglRenderer.f((EglRenderer) obj2, (Looper) obj);
                return;
            case 3:
                EglRenderer.h((EglRenderer) obj2, (Runnable) obj);
                return;
            case 4:
                VideoFileRenderer.c((VideoFileRenderer) obj2, (CountDownLatch) obj);
                return;
            case 5:
                VideoFileRenderer.a((VideoFileRenderer) obj2, (VideoFrame) obj);
                return;
            default:
                VideoSource.b((VideoSource) obj2, (VideoFrame) obj);
                return;
        }
    }
}
