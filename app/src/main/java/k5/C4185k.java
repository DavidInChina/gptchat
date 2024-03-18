package k5;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import e.AbstractBinderC2736d;
import e.AbstractC2737e;
import e.C2735c;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p1.AbstractC5039d;
import p1.AbstractC5042g;
import u.AbstractServiceConnectionC5821c;
import u.C5822d;
import v8.C5997e;
import y1.AbstractC6495e;

/* renamed from: k5.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4185k extends AbstractServiceConnectionC5821c {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f37068i = 0;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f37069b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference f37070c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    public final CountDownLatch f37071d = new CountDownLatch(1);

    /* renamed from: e  reason: collision with root package name */
    public final String f37072e;

    /* renamed from: f  reason: collision with root package name */
    public final C5997e f37073f;

    /* renamed from: g  reason: collision with root package name */
    public final C4186l f37074g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f37075h;

    public C4185k(Context context, C4186l c4186l, C5997e c5997e) {
        this.f37069b = new WeakReference(context);
        this.f37074g = c4186l;
        this.f37072e = c4186l.a(context.getPackageManager());
        this.f37073f = c5997e;
    }

    @Override // u.AbstractServiceConnectionC5821c
    public final void a(U3.i iVar) {
        Log.d("k", "CustomTabs Service connected");
        try {
            C2735c c2735c = (C2735c) ((AbstractC2737e) iVar.f17414Y);
            c2735c.getClass();
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeLong(0L);
            if (!c2735c.f28679a.transact(2, obtain, obtain2, 0)) {
                int i10 = AbstractBinderC2736d.f28680a;
            }
            obtain2.readException();
            obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
        } catch (RemoteException unused) {
        }
        this.f37070c.set(iVar.F(null));
        this.f37071d.countDown();
    }

    public final void b() {
        Log.v("k", "Trying to bind the service");
        Context context = (Context) this.f37069b.get();
        boolean z10 = false;
        this.f37075h = false;
        String str = this.f37072e;
        if (context != null && str != null) {
            this.f37075h = true;
            this.f46325a = context.getApplicationContext();
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(str)) {
                intent.setPackage(str);
            }
            z10 = context.bindService(intent, this, 33);
        }
        Log.v("k", "Bind request result (" + str + "): " + z10);
    }

    public final void c(Context context, Uri uri) {
        boolean z10;
        Bundle bundle;
        long j6;
        b();
        try {
            CountDownLatch countDownLatch = this.f37071d;
            if (this.f37072e == null) {
                j6 = 0;
            } else {
                j6 = 1;
            }
            z10 = countDownLatch.await(j6, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z10 = false;
        }
        Log.d("k", "Launching URI. Custom Tabs available: " + z10);
        C5822d c5822d = (C5822d) this.f37070c.get();
        C4186l c4186l = this.f37074g;
        c4186l.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        U3.i iVar = new U3.i(2);
        if (c5822d != null) {
            intent.setPackage(c5822d.f46327b.getPackageName());
            IBinder asBinder = c5822d.f46326a.asBinder();
            Bundle bundle2 = new Bundle();
            AbstractC6495e.b(bundle2, "android.support.customtabs.extra.SESSION", asBinder);
            PendingIntent pendingIntent = c5822d.f46328c;
            if (pendingIntent != null) {
                bundle2.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle2);
        }
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", c4186l.f37076Y ? 1 : 0);
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        int i10 = c4186l.f37077Z;
        if (i10 > 0) {
            U3.i iVar2 = new U3.i(2);
            Object obj = AbstractC5042g.f41723a;
            iVar2.f17414Y = Integer.valueOf(AbstractC5039d.a(context, i10) | (-16777216));
            bundle = iVar2.o().m();
        } else {
            bundle = null;
        }
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle3 = new Bundle();
            AbstractC6495e.b(bundle3, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle3);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(iVar.o().m());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 2);
        Intent intent2 = (Intent) new U3.l(intent, 1, null).f17423Z;
        intent2.setData(uri);
        context.startActivity(intent2);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.d("k", "CustomTabs Service disconnected");
        this.f37070c.set(null);
    }
}
