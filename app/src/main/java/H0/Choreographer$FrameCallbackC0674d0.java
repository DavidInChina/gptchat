package H0;

import android.view.Choreographer;
import java.util.List;

/* renamed from: H0.d0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class Choreographer$FrameCallbackC0674d0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0676e0 f6933Y;

    public Choreographer$FrameCallbackC0674d0(C0676e0 c0676e0) {
        this.f6933Y = c0676e0;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        this.f6933Y.f6940h0.removeCallbacks(this);
        C0676e0.w0(this.f6933Y);
        C0676e0 c0676e0 = this.f6933Y;
        synchronized (c0676e0.f6941i0) {
            if (c0676e0.f6946n0) {
                c0676e0.f6946n0 = false;
                List list = c0676e0.f6943k0;
                c0676e0.f6943k0 = c0676e0.f6944l0;
                c0676e0.f6944l0 = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) list.get(i10)).doFrame(j6);
                }
                list.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0676e0.w0(this.f6933Y);
        C0676e0 c0676e0 = this.f6933Y;
        synchronized (c0676e0.f6941i0) {
            if (c0676e0.f6943k0.isEmpty()) {
                c0676e0.f6939Z.removeFrameCallback(this);
                c0676e0.f6946n0 = false;
            }
        }
    }
}
