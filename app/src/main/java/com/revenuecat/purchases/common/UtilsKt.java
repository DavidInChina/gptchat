package com.revenuecat.purchases.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import android.util.Base64;
import com.android.vending.licensing.ILicensingService;
import com.revenuecat.purchases.common.verification.SigningManager;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u0004H\u0000\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u001a\f\u0010\u000f\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0003*\u00020\fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u001a\u0010\t\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"MICROS_MULTIPLIER", "", "playServicesVersionName", "", "Landroid/content/Context;", "getPlayServicesVersionName", "(Landroid/content/Context;)Ljava/lang/String;", "playStoreVersionName", "getPlayStoreVersionName", "versionName", "getVersionName", "getLocale", "Ljava/util/Locale;", "packageVersionName", "packageName", "sha1", SigningManager.POST_PARAMS_ALGORITHM, "toBCP47", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final int MICROS_MULTIPLIER = 1000000;

    public static final Locale getLocale(Context context) {
        LocaleList locales;
        Locale locale;
        AbstractC3557B.c0("<this>", context);
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
            return locale;
        }
        return context.getResources().getConfiguration().locale;
    }

    public static final String getPlayServicesVersionName(Context context) {
        AbstractC3557B.c0("<this>", context);
        return packageVersionName(context, "com.google.android.gms");
    }

    public static final String getPlayStoreVersionName(Context context) {
        AbstractC3557B.c0("<this>", context);
        return packageVersionName(context, ILicensingService.SERVICE_PACKAGE);
    }

    public static final String getVersionName(Context context) {
        AbstractC3557B.c0("<this>", context);
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    private static final String packageVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final String sha1(String str) {
        AbstractC3557B.c0("<this>", str);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        Charset charset = Lg.a.f11131a;
        byte[] bytes = str.getBytes(charset);
        AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
        byte[] encode = Base64.encode(messageDigest.digest(bytes), 2);
        AbstractC3557B.b0("encode(it, Base64.NO_WRAP)", encode);
        return new String(encode, charset);
    }

    public static final String sha256(String str) {
        AbstractC3557B.c0("<this>", str);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = Lg.a.f11131a;
        byte[] bytes = str.getBytes(charset);
        AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
        byte[] encode = Base64.encode(messageDigest.digest(bytes), 2);
        AbstractC3557B.b0("encode(it, Base64.NO_WRAP)", encode);
        return new String(encode, charset);
    }

    public static final String toBCP47(Locale locale) {
        AbstractC3557B.c0("<this>", locale);
        String languageTag = locale.toLanguageTag();
        AbstractC3557B.b0("toLanguageTag()", languageTag);
        return languageTag;
    }
}
