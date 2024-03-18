package w7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: w7.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC6124B implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f48074a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC6134f f48075b;

    public ServiceConnectionC6124B(AbstractC6134f abstractC6134f, int i10) {
        this.f48075b = abstractC6134f;
        this.f48074a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        x xVar;
        AbstractC6134f abstractC6134f = this.f48075b;
        if (iBinder == null) {
            AbstractC6134f.t(abstractC6134f);
            return;
        }
        synchronized (abstractC6134f.f48145g) {
            try {
                AbstractC6134f abstractC6134f2 = this.f48075b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof x)) {
                    xVar = (x) queryLocalInterface;
                } else {
                    xVar = new x(iBinder);
                }
                abstractC6134f2.f48146h = xVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC6134f abstractC6134f3 = this.f48075b;
        int i10 = this.f48074a;
        abstractC6134f3.getClass();
        C6126D c6126d = new C6126D(abstractC6134f3, 0);
        z zVar = abstractC6134f3.f48143e;
        zVar.sendMessage(zVar.obtainMessage(7, i10, -1, c6126d));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC6134f abstractC6134f;
        synchronized (this.f48075b.f48145g) {
            abstractC6134f = this.f48075b;
            abstractC6134f.f48146h = null;
        }
        int i10 = this.f48074a;
        z zVar = abstractC6134f.f48143e;
        zVar.sendMessage(zVar.obtainMessage(6, i10, 1));
    }
}
