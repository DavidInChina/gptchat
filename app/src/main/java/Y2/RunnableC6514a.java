package y2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.pairip.VMRunner;
import n2.C4711b;

/* renamed from: y2.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC6514a extends BroadcastReceiver implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final SurfaceHolder$CallbackC6500C f50510Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Handler f50511Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4711b f50512h0;

    public RunnableC6514a(C4711b c4711b, Handler handler, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C) {
        this.f50512h0 = c4711b;
        this.f50511Z = handler;
        this.f50510Y = surfaceHolder$CallbackC6500C;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("lnJUpP5wgiA47YoB", new Object[]{this, context, intent});
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f50512h0.f39601Z) {
            this.f50510Y.f50334Y.A(-1, 3, false);
        }
    }
}
