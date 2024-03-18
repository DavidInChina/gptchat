package l8;

import K4.C0813a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.android.vending.licensing.ILicensingService;
import io.sentry.android.core.AbstractC3612c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import m8.AbstractC4568a;
import m8.o;

/* renamed from: l8.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4350h {

    /* renamed from: e  reason: collision with root package name */
    public static final C0813a f37877e = new C0813a("AppUpdateService", 5);

    /* renamed from: f  reason: collision with root package name */
    public static final Intent f37878f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage(ILicensingService.SERVICE_PACKAGE);

    /* renamed from: a  reason: collision with root package name */
    public final o f37879a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37880b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f37881c;

    /* renamed from: d  reason: collision with root package name */
    public final C4351i f37882d;

    public C4350h(Context context, C4351i c4351i) {
        String str;
        this.f37880b = context.getPackageName();
        this.f37881c = context;
        this.f37882d = c4351i;
        C0813a c0813a = AbstractC4568a.f38966a;
        try {
            if (context.getPackageManager().getApplicationInfo(ILicensingService.SERVICE_PACKAGE, 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(ILicensingService.SERVICE_PACKAGE, 64).signatures;
                if (signatureArr != null && (r0 = signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            str = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            str = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                            String str2 = Build.TAGS;
                            if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                            }
                        }
                        Context applicationContext = context.getApplicationContext();
                        this.f37879a = new o(applicationContext != null ? applicationContext : context, f37877e, f37878f);
                        return;
                    }
                    return;
                }
                Object[] objArr = new Object[0];
                C0813a c0813a2 = AbstractC4568a.f38966a;
                c0813a2.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    AbstractC3612c.r("PlayCore", C0813a.f(c0813a2.f9398Z, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle a(C4350h c4350h, String str) {
        Map map;
        Integer num;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        HashMap hashMap = m8.i.f38973a;
        synchronized (m8.i.class) {
            try {
                HashMap hashMap2 = m8.i.f38973a;
                if (!hashMap2.containsKey("app_update")) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("java", 11004);
                    hashMap2.put("app_update", hashMap3);
                }
                map = (Map) hashMap2.get("app_update");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle3.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle3.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle3.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle2.putAll(bundle3);
        bundle2.putInt("playcore.version.code", 11004);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(c4350h.f37881c.getPackageManager().getPackageInfo(c4350h.f37881c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            C0813a c0813a = f37877e;
            Object[] objArr = new Object[0];
            c0813a.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                AbstractC3612c.c("PlayCore", C0813a.f(c0813a.f9398Z, "The current version of the app could not be retrieved", objArr));
            }
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }
}
