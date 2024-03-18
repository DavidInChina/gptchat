package t7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: t7.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC5679a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f45757a = false;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedBlockingQueue f45758b = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) {
        A7.b.j0("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f45757a) {
            this.f45757a = true;
            IBinder iBinder = (IBinder) this.f45758b.poll(10000L, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f45758b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
