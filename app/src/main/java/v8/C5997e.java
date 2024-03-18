package v8;

import M3.u;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import io.sentry.android.core.AbstractC3612c;
import io.sentry.hints.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p1.AbstractC5036a;
import p1.AbstractC5042g;
import t7.j;
import u.C5820b;
import u.C5822d;
import v.C5935d;
import v.C5936e;
import y1.AbstractC6495e;

/* renamed from: v8.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5997e {

    /* renamed from: i  reason: collision with root package name */
    public static final A9.a f47368i = new A9.a(17);

    /* renamed from: a  reason: collision with root package name */
    public Context f47369a;

    /* renamed from: b  reason: collision with root package name */
    public final String f47370b;

    /* renamed from: c  reason: collision with root package name */
    public final int f47371c;

    /* renamed from: d  reason: collision with root package name */
    public final int f47372d = 96375;

    /* renamed from: e  reason: collision with root package name */
    public C5996d f47373e;

    /* renamed from: f  reason: collision with root package name */
    public C5822d f47374f;

    /* renamed from: g  reason: collision with root package name */
    public final j f47375g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f47376h;

    public C5997e(Context context) {
        r2.d dVar;
        int i10;
        j jVar = new j(context, 5);
        this.f47369a = context;
        this.f47375g = jVar;
        PackageManager packageManager = context.getPackageManager();
        String str = null;
        Intent data = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(data, 65536);
        queryIntentActivities.addAll(packageManager.queryIntentActivities(data, 131072));
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 64);
        HashMap hashMap = new HashMap();
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (true) {
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            String str2 = next.serviceInfo.packageName;
            if (AbstractC5993a.f47362a.contains(str2) && AbstractC5993a.a(packageManager, str2, 362600000)) {
                hashMap.put(str2, 0);
            } else {
                IntentFilter intentFilter = next.filter;
                if (intentFilter != null && intentFilter.hasCategory("androidx.browser.trusted.category.TrustedWebActivities")) {
                    i11 = 1;
                }
                hashMap.put(str2, Integer.valueOf(i11 ^ 1));
            }
        }
        Iterator<ResolveInfo> it2 = queryIntentActivities.iterator();
        String str3 = null;
        while (true) {
            if (it2.hasNext()) {
                String str4 = it2.next().activityInfo.packageName;
                if (hashMap.containsKey(str4)) {
                    i10 = ((Integer) hashMap.get(str4)).intValue();
                } else {
                    i10 = 2;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            Log.d("TWAProviderPicker", "Found browser: " + str4);
                            if (str3 == null) {
                                str3 = str4;
                            }
                        }
                    } else {
                        Log.d("TWAProviderPicker", "Found Custom Tabs provider: " + str4);
                        if (str == null) {
                            str = str4;
                        }
                    }
                } else {
                    Log.d("TWAProviderPicker", "Found TWA provider, finishing search: " + str4);
                    dVar = new r2.d(0, str4);
                    break;
                }
            } else if (str != null) {
                Log.d("TWAProviderPicker", "Found no TWA providers, using first Custom Tabs provider: ".concat(str));
                dVar = new r2.d(1, str);
            } else {
                Log.d("TWAProviderPicker", "Found no TWA providers, using first browser: " + str3);
                dVar = new r2.d(2, str3);
            }
        }
        this.f47370b = dVar.f44377b;
        this.f47371c = dVar.f44376a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(C5936e c5936e) {
        ArrayList arrayList;
        i iVar;
        A9.a aVar = f47368i;
        if (!this.f47376h) {
            int i10 = this.f47371c;
            String str = this.f47370b;
            if (i10 == 0) {
                u uVar = new u(this, c5936e, null, null, 2);
                if (this.f47374f != null) {
                    uVar.run();
                } else {
                    u uVar2 = new u(this, aVar, c5936e, null, 3);
                    if (this.f47373e == null) {
                        this.f47373e = new C5996d(this);
                    }
                    C5996d c5996d = this.f47373e;
                    c5996d.f47365b = uVar;
                    c5996d.f47366c = uVar2;
                    Context context = this.f47369a;
                    c5996d.f46325a = context.getApplicationContext();
                    Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                    if (!TextUtils.isEmpty(str)) {
                        intent.setPackage(str);
                    }
                    context.bindService(intent, c5996d, 1);
                }
            } else {
                aVar.h(this.f47369a, c5936e, str, null);
            }
            if (!this.f47369a.getPackageManager().hasSystemFeature("org.chromium.arc")) {
                PackageManager packageManager = this.f47369a.getPackageManager();
                J0.a aVar2 = null;
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        iVar = new Object();
                    } else {
                        iVar = new i(5);
                    }
                    arrayList = iVar.a(packageManager, str);
                } catch (PackageManager.NameNotFoundException e10) {
                    AbstractC3612c.d("PackageIdentity", "Could not get fingerprint for package.", e10);
                    arrayList = null;
                }
                if (arrayList != null) {
                    try {
                        aVar2 = new J0.a(C5935d.a(str, arrayList));
                    } catch (IOException e11) {
                        AbstractC3612c.d("Token", "Exception when creating token.", e11);
                    }
                }
                SharedPreferences sharedPreferences = this.f47375g.f45780a.getApplicationContext().getSharedPreferences("com.google.androidbrowserhelper", 0);
                if (aVar2 == null) {
                    sharedPreferences.edit().remove("SharedPreferencesTokenStore.TOKEN").apply();
                    return;
                }
                byte[] bArr = ((C5935d) aVar2.f8729Y).f46835a;
                sharedPreferences.edit().putString("SharedPreferencesTokenStore.TOKEN", Base64.encodeToString(Arrays.copyOf(bArr, bArr.length), 3)).apply();
                return;
            }
            return;
        }
        throw new IllegalStateException("TwaLauncher already destroyed");
    }

    public final void b(C5936e c5936e, Runnable runnable) {
        boolean z10;
        if (!this.f47376h && this.f47374f != null) {
            Log.d("TwaLauncher", "Launching Trusted Web Activity.");
            C5822d c5822d = this.f47374f;
            if (c5822d != null) {
                C5820b c5820b = c5936e.f46838b;
                c5820b.getClass();
                String packageName = c5822d.f46327b.getPackageName();
                Intent intent = c5820b.f46320a;
                intent.setPackage(packageName);
                IBinder asBinder = c5822d.f46326a.asBinder();
                Bundle bundle = new Bundle();
                AbstractC6495e.b(bundle, "android.support.customtabs.extra.SESSION", asBinder);
                PendingIntent pendingIntent = c5822d.f46328c;
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                intent.putExtras(bundle);
                Intent intent2 = (Intent) c5820b.a().f17423Z;
                intent2.setData(c5936e.f46837a);
                intent2.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
                List<Uri> emptyList = Collections.emptyList();
                c5936e.f46839c.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
                intent2.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", bundle2);
                intent2.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", 0);
                Context context = this.f47369a;
                Boolean bool = AbstractActivityC5994b.f47364Y;
                Intent intent3 = new Intent(context, AbstractActivityC5994b.class);
                if (AbstractActivityC5994b.f47364Y == null) {
                    if (intent3.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AbstractActivityC5994b.f47364Y = Boolean.valueOf(z10);
                }
                if (!Boolean.FALSE.equals(AbstractActivityC5994b.f47364Y)) {
                    intent3.setFlags(268435456);
                    intent2.putExtra("androidx.browser.customtabs.extra.FOCUS_INTENT", PendingIntent.getActivity(context, 0, intent3, 67108864));
                }
                Context context2 = this.f47369a;
                for (Uri uri : emptyList) {
                    context2.grantUriPermission(intent2.getPackage(), uri, 1);
                }
                Object obj = AbstractC5042g.f41723a;
                AbstractC5036a.b(context2, intent2, null);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            c5936e.getClass();
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
    }
}
