package t7;

import A.AbstractC0044t0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.vending.licensing.ILicensingService;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC3612c;
import java.util.concurrent.atomic.AtomicBoolean;
import w7.y;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f45772a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    public static final f f45773b = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t7.f] */
    static {
        AtomicBoolean atomicBoolean = i.f45775a;
    }

    public Intent a(int i10, Context context, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && A7.b.j1(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb2 = new StringBuilder("gcore_");
            sb2.append(f45772a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    j a5 = A7.c.a(context);
                    sb2.append(a5.f45780a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb3 = sb2.toString();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(ParameterNames.ID, "com.google.android.gms");
            if (!TextUtils.isEmpty(sb3)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage(ILicensingService.SERVICE_PACKAGE);
            intent3.addFlags(524288);
            return intent3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(Context context, int i10) {
        boolean z10;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        int i11;
        int i12;
        boolean z11;
        Bundle bundle;
        AtomicBoolean atomicBoolean = i.f45775a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            AbstractC3612c.c("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !i.f45778d.get()) {
            synchronized (y.f48212a) {
                try {
                    if (!y.f48213b) {
                        y.f48213b = true;
                        try {
                            bundle = A7.c.a(context).f45780a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e10) {
                            AbstractC3612c.u("MetadataValueReader", "This should never happen.", e10);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            y.f48214c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i13 = y.f48214c;
            if (i13 != 0) {
                if (i13 != 12451000) {
                    throw new IllegalStateException(AbstractC0044t0.y("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", f45772a, " but found ", i13, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        int i14 = 0;
        if (!A7.b.j1(context)) {
            if (A7.b.f726k == null) {
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                A7.b.f726k = Boolean.valueOf(z11);
            }
            if (!A7.b.f726k.booleanValue()) {
                z10 = true;
                if (i10 < 0) {
                    String packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (z10) {
                        try {
                            packageInfo = packageManager.getPackageInfo(ILicensingService.SERVICE_PACKAGE, 8256);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            AbstractC3612c.r("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                        }
                    } else {
                        packageInfo = null;
                    }
                    try {
                        packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                        j.d(context);
                    } catch (PackageManager.NameNotFoundException unused3) {
                        AbstractC3612c.r("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
                    }
                    if (!j.f(packageInfo2, true)) {
                        AbstractC3612c.r("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    } else {
                        if (z10) {
                            A7.b.k0(packageInfo);
                            if (!j.f(packageInfo, true)) {
                                AbstractC3612c.r("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (z10 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            AbstractC3612c.r("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                        } else {
                            int i15 = packageInfo2.versionCode;
                            int i16 = -1;
                            if (i15 == -1) {
                                i11 = -1;
                            } else {
                                i11 = i15 / 1000;
                            }
                            if (i10 != -1) {
                                i16 = i10 / 1000;
                            }
                            if (i11 < i16) {
                                AbstractC3612c.r("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i15);
                                i12 = 2;
                            } else {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e11) {
                                        AbstractC3612c.u("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                                        i14 = 1;
                                        if (i14 == 18) {
                                        }
                                        return 18;
                                    }
                                }
                                if (!applicationInfo.enabled) {
                                    i12 = 3;
                                }
                                if (i14 == 18 || (i14 == 1 && i.a(context))) {
                                    return 18;
                                }
                                return i14;
                            }
                            i14 = i12;
                            if (i14 == 18) {
                                return i14;
                            }
                            return 18;
                        }
                    }
                    i14 = 9;
                    if (i14 == 18) {
                    }
                    return 18;
                }
                throw new IllegalArgumentException();
            }
        }
        z10 = false;
        if (i10 < 0) {
        }
    }
}
