package H1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import q1.AbstractC5255a;

/* loaded from: classes2.dex */
public final class r implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final p f7188e = new p(new long[0], new RemoteViews[0]);

    /* renamed from: a  reason: collision with root package name */
    public final Context f7189a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7190b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7191c;

    /* renamed from: d  reason: collision with root package name */
    public p f7192d = f7188e;

    public r(Context context, int i10, int i11) {
        AbstractC3557B.c0("mContext", context);
        this.f7189a = context;
        this.f7190b = i10;
        this.f7191c = i11;
    }

    public final void a() {
        Long l10;
        long j6;
        Context context = this.f7189a;
        AbstractC3557B.c0("context", context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        AbstractC3557B.b0("context.getSharedPrefere\u2026S_FILENAME, MODE_PRIVATE)", sharedPreferences);
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f7190b;
        sb2.append(i10);
        sb2.append(':');
        sb2.append(this.f7191c);
        p pVar = null;
        String string = sharedPreferences.getString(sb2.toString(), null);
        if (string == null) {
            AbstractC3612c.r("RemoteViewsCompatServic", "No collection items were stored for widget " + i10);
        } else {
            byte[] decode = Base64.decode(string, 0);
            AbstractC3557B.b0("decode(hexString, Base64.DEFAULT)", decode);
            Parcel obtain = Parcel.obtain();
            AbstractC3557B.b0("obtain()", obtain);
            try {
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                q qVar = new q(obtain);
                obtain.recycle();
                if (!AbstractC3557B.K(Build.VERSION.INCREMENTAL, qVar.f7186b)) {
                    AbstractC3612c.r("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i10);
                } else {
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                        if (Build.VERSION.SDK_INT >= 28) {
                            j6 = AbstractC5255a.b(packageInfo);
                        } else {
                            j6 = packageInfo.versionCode;
                        }
                        l10 = Long.valueOf(j6);
                    } catch (PackageManager.NameNotFoundException e10) {
                        AbstractC3612c.d("RemoteViewsCompatServic", "Couldn't retrieve version code for " + context.getPackageManager(), e10);
                        l10 = null;
                    }
                    if (l10 == null) {
                        AbstractC3612c.r("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i10);
                    } else if (l10.longValue() != qVar.f7187c) {
                        AbstractC3612c.r("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i10);
                    } else {
                        try {
                            byte[] bArr = qVar.f7185a;
                            AbstractC3557B.c0("bytes", bArr);
                            Parcel obtain2 = Parcel.obtain();
                            AbstractC3557B.b0("obtain()", obtain2);
                            obtain2.unmarshall(bArr, 0, bArr.length);
                            obtain2.setDataPosition(0);
                            p pVar2 = new p(obtain2);
                            obtain2.recycle();
                            pVar = pVar2;
                        } catch (Throwable th2) {
                            AbstractC3612c.d("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i10, th2);
                        }
                    }
                }
            } catch (Throwable th3) {
                obtain.recycle();
                throw th3;
            }
        }
        if (pVar == null) {
            pVar = f7188e;
        }
        this.f7192d = pVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return this.f7192d.f7181a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i10) {
        try {
            return this.f7192d.f7181a[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i10) {
        try {
            return this.f7192d.f7182b[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f7189a.getPackageName(), (int) R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.f7192d.f7184d;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.f7192d.f7183c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
