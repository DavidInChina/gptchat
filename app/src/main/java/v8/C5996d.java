package v8;

import U3.i;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.RemoteException;
import e.AbstractBinderC2736d;
import e.AbstractC2737e;
import e.C2735c;
import io.sentry.android.core.AbstractC3612c;
import java.util.List;
import u.AbstractServiceConnectionC5821c;
import u.C5822d;

/* renamed from: v8.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5996d extends AbstractServiceConnectionC5821c {

    /* renamed from: b  reason: collision with root package name */
    public Runnable f47365b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f47366c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C5997e f47367d;

    public C5996d(C5997e c5997e) {
        this.f47367d = c5997e;
    }

    @Override // u.AbstractServiceConnectionC5821c
    public final void a(i iVar) {
        Runnable runnable;
        Runnable runnable2;
        C5997e c5997e = this.f47367d;
        PackageManager packageManager = c5997e.f47369a.getPackageManager();
        List list = AbstractC5993a.f47362a;
        String str = c5997e.f47370b;
        if (list.contains(str) && !AbstractC5993a.a(packageManager, str, 368300000)) {
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
        }
        try {
            C5822d F10 = iVar.F(PendingIntent.getActivity((Context) iVar.f17416h0, c5997e.f47372d, new Intent(), 67108864));
            c5997e.f47374f = F10;
            if (F10 != null && (runnable2 = this.f47365b) != null) {
                runnable2.run();
            } else if (F10 == null && (runnable = this.f47366c) != null) {
                runnable.run();
            }
        } catch (RuntimeException e10) {
            AbstractC3612c.t("TwaLauncher", e10);
            this.f47366c.run();
        }
        this.f47365b = null;
        this.f47366c = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f47367d.f47374f = null;
    }
}
