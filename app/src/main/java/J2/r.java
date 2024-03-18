package J2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: j0  reason: collision with root package name */
    public static final r f8804j0 = new r();

    /* renamed from: Y  reason: collision with root package name */
    public volatile long f8805Y = -9223372036854775807L;

    /* renamed from: Z  reason: collision with root package name */
    public final Handler f8806Z;

    /* renamed from: h0  reason: collision with root package name */
    public Choreographer f8807h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f8808i0;

    public r() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = AbstractC5530A.f45131a;
        Handler handler = new Handler(looper, this);
        this.f8806Z = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        this.f8805Y = j6;
        Choreographer choreographer = this.f8807h0;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                Choreographer choreographer = this.f8807h0;
                if (choreographer != null) {
                    int i11 = this.f8808i0 - 1;
                    this.f8808i0 = i11;
                    if (i11 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f8805Y = -9223372036854775807L;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.f8807h0;
            if (choreographer2 != null) {
                int i12 = this.f8808i0 + 1;
                this.f8808i0 = i12;
                if (i12 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.f8807h0 = Choreographer.getInstance();
        } catch (RuntimeException e10) {
            s2.p.h("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
        }
        return true;
    }
}
