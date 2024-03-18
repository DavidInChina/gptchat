package z7;

import A7.b;
import A7.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.android.core.AbstractC3612c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import w7.G;

/* renamed from: z7.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6778a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f51752b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile C6778a f51753c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f51754a = new ConcurrentHashMap();

    public static C6778a a() {
        if (f51753c == null) {
            synchronized (f51752b) {
                try {
                    if (f51753c == null) {
                        f51753c = new C6778a();
                    }
                } finally {
                }
            }
        }
        C6778a c6778a = f51753c;
        b.k0(c6778a);
        return c6778a;
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof G)) {
            ConcurrentHashMap concurrentHashMap = this.f51754a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        boolean bindService;
        boolean z10;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).f45780a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    AbstractC3612c.r("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof G)) {
            ConcurrentHashMap concurrentHashMap = this.f51754a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                AbstractC3612c.r("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            if (executor == null) {
                executor = null;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29 && executor != null) {
                    z10 = context.bindService(intent, i10, executor, serviceConnection);
                } else {
                    z10 = context.bindService(intent, serviceConnection, i10);
                }
                if (!z10) {
                    return false;
                }
                return z10;
            } finally {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
            }
        }
        if (executor == null) {
            executor = null;
        }
        if (Build.VERSION.SDK_INT >= 29 && executor != null) {
            bindService = context.bindService(intent, i10, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i10);
    }
}
