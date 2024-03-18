package o7;

import D7.c;
import D7.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.android.vending.licensing.ILicensingService;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import livekit.org.webrtc.WebrtcBuildVersion;
import t7.ServiceConnectionC5679a;
import t7.f;
import x2.j;
import x3.z;
import z7.C6778a;

/* renamed from: o7.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4947a {

    /* renamed from: a  reason: collision with root package name */
    public ServiceConnectionC5679a f40922a;

    /* renamed from: b  reason: collision with root package name */
    public d f40923b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f40924c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f40925d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public b f40926e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f40927f;

    /* renamed from: g  reason: collision with root package name */
    public final long f40928g;

    public C4947a(Context context) {
        A7.b.k0(context);
        Context applicationContext = context.getApplicationContext();
        this.f40927f = applicationContext != null ? applicationContext : context;
        this.f40924c = false;
        this.f40928g = -1L;
    }

    public static z a(Context context) {
        C4947a c4947a = new C4947a(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c4947a.d();
            z b10 = c4947a.b();
            e(b10, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return b10;
        } finally {
        }
    }

    public static void e(z zVar, long j6, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", str);
            if (zVar != null) {
                if (true != zVar.f48763c) {
                    str = WebrtcBuildVersion.maint_version;
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = zVar.f48762b;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th2 != null) {
                hashMap.put("error", th2.getClass().getName());
            }
            hashMap.put(ParameterNames.TAG, "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j6));
            new j(hashMap).start();
        }
    }

    public final z b() {
        z zVar;
        A7.b.j0("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f40924c) {
                    synchronized (this.f40925d) {
                        b bVar = this.f40926e;
                        if (bVar == null || !bVar.f40932i0) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d();
                        if (!this.f40924c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                A7.b.k0(this.f40922a);
                A7.b.k0(this.f40923b);
                try {
                    D7.b bVar2 = (D7.b) this.f40923b;
                    bVar2.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z10 = true;
                    Parcel g10 = bVar2.g(obtain, 1);
                    String readString = g10.readString();
                    g10.recycle();
                    D7.b bVar3 = (D7.b) this.f40923b;
                    bVar3.getClass();
                    Parcel obtain2 = Parcel.obtain();
                    obtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i10 = D7.a.f3418a;
                    obtain2.writeInt(1);
                    Parcel g11 = bVar3.g(obtain2, 2);
                    if (g11.readInt() == 0) {
                        z10 = false;
                    }
                    g11.recycle();
                    zVar = new z(readString, z10);
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f();
        return zVar;
    }

    public final void c() {
        A7.b.j0("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f40927f != null && this.f40922a != null) {
                    if (this.f40924c) {
                        C6778a.a().b(this.f40927f, this.f40922a);
                    }
                    this.f40924c = false;
                    this.f40923b = null;
                    this.f40922a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        d dVar;
        A7.b.j0("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f40924c) {
                    c();
                }
                Context context = this.f40927f;
                try {
                    context.getPackageManager().getPackageInfo(ILicensingService.SERVICE_PACKAGE, 0);
                    int b10 = f.f45773b.b(context, 12451000);
                    if (b10 != 0 && b10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC5679a serviceConnectionC5679a = new ServiceConnectionC5679a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (C6778a.a().c(context, context.getClass().getName(), intent, serviceConnectionC5679a, 1, null)) {
                        this.f40922a = serviceConnectionC5679a;
                        try {
                            IBinder a5 = serviceConnectionC5679a.a(TimeUnit.MILLISECONDS);
                            int i10 = c.f3420a;
                            IInterface queryLocalInterface = a5.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            if (queryLocalInterface instanceof d) {
                                dVar = (d) queryLocalInterface;
                            } else {
                                dVar = new D7.b(a5);
                            }
                            this.f40923b = dVar;
                            this.f40924c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } else {
                        throw new IOException("Connection failure");
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new Exception();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void f() {
        synchronized (this.f40925d) {
            b bVar = this.f40926e;
            if (bVar != null) {
                bVar.f40931h0.countDown();
                try {
                    this.f40926e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j6 = this.f40928g;
            if (j6 > 0) {
                this.f40926e = new b(this, j6);
            }
        }
    }

    public final void finalize() {
        c();
        super.finalize();
    }
}
