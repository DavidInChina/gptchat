package v7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;

/* loaded from: classes2.dex */
public final class w extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f47350a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Object f47351b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f47352c;

    public w(U3.c cVar) {
        this.f47352c = cVar;
    }

    public final synchronized void a() {
        try {
            Context context = (Context) this.f47351b;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f47351b = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("7paOB2Dvg75i2wh9", new Object[]{this, context, intent});
    }

    public w(io.sentry.G g10, io.sentry.H h10) {
        this.f47351b = g10;
        this.f47352c = h10;
    }
}
