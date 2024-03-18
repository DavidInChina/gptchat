package w7;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;
import z7.C6778a;

/* loaded from: classes2.dex */
public final class G implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f48087a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f48088b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f48089c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f48090d;

    /* renamed from: e  reason: collision with root package name */
    public final C6128F f48091e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f48092f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ I f48093g;

    public G(I i10, C6128F c6128f) {
        this.f48093g = i10;
        this.f48091e = c6128f;
    }

    public final void a(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f48088b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            I i10 = this.f48093g;
            C6778a c6778a = i10.f48101d;
            Context context = i10.f48099b;
            boolean c10 = c6778a.c(context, str, this.f48091e.a(context), this, 4225, executor);
            this.f48089c = c10;
            if (c10) {
                this.f48093g.f48100c.sendMessageDelayed(this.f48093g.f48100c.obtainMessage(1, this.f48091e), this.f48093g.f48103f);
            } else {
                this.f48088b = 2;
                try {
                    I i11 = this.f48093g;
                    i11.f48101d.b(i11.f48099b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f48093g.f48098a) {
            try {
                this.f48093g.f48100c.removeMessages(1, this.f48091e);
                this.f48090d = iBinder;
                this.f48092f = componentName;
                for (ServiceConnection serviceConnection : this.f48087a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f48088b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f48093g.f48098a) {
            try {
                this.f48093g.f48100c.removeMessages(1, this.f48091e);
                this.f48090d = null;
                this.f48092f = componentName;
                for (ServiceConnection serviceConnection : this.f48087a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f48088b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
