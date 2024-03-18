package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import io.sentry.C3640e;
import io.sentry.EnumC3642e1;
import io.sentry.L0;
import io.sentry.X;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.sentry.android.core.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3612c {
    public static void a(String str, EnumC3642e1 enumC3642e1, String str2, Throwable th2) {
        C3640e c3640e = new C3640e();
        c3640e.f34322j0 = "Logcat";
        c3640e.f34319Z = str2;
        c3640e.f34323k0 = enumC3642e1;
        if (str != null) {
            c3640e.a(ParameterNames.TAG, str);
        }
        if (th2 != null && th2.getMessage() != null) {
            c3640e.a("throwable", th2.getMessage());
        }
        L0.c().i(c3640e);
    }

    public static X b(Context context, B b10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return new AnrV2Integration(context);
        }
        return new AnrIntegration(context);
    }

    public static int c(String str, String str2) {
        a(str, EnumC3642e1.ERROR, str2, null);
        return Log.e(str, str2);
    }

    public static int d(String str, String str2, Throwable th2) {
        a(str, EnumC3642e1.ERROR, str2, th2);
        return Log.e(str, str2, th2);
    }

    public static String e(Context context, io.sentry.H h10) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                if (charSequence != null) {
                    return charSequence.toString();
                }
                return context.getPackageManager().getApplicationLabel(applicationInfo).toString();
            }
            return context.getString(i10);
        } catch (Throwable th2) {
            h10.d(EnumC3642e1.ERROR, "Error getting application name.", th2);
            return null;
        }
    }

    public static String f(io.sentry.H h10) {
        try {
            return Build.MODEL.split(Separators.SP, -1)[0];
        } catch (Throwable th2) {
            h10.d(EnumC3642e1.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    public static String g(io.sentry.H h10) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            return readLine;
        } catch (IOException e10) {
            h10.d(EnumC3642e1.ERROR, "Exception while attempting to read kernel information", e10);
            return property;
        }
    }

    public static ActivityManager.MemoryInfo h(Context context, io.sentry.H h10) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            h10.f(EnumC3642e1.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            h10.d(EnumC3642e1.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    public static PackageInfo i(Context context, int i10, io.sentry.H h10, B b10) {
        try {
            b10.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                return E1.g.b(context.getPackageManager(), context.getPackageName(), E1.g.e(i10));
            }
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i10);
        } catch (Throwable th2) {
            h10.d(EnumC3642e1.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    public static String j(PackageInfo packageInfo, B b10) {
        long longVersionCode;
        b10.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return Integer.toString(packageInfo.versionCode);
    }

    public static boolean k() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance != 100) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean l(Bundle bundle, io.sentry.H h10, String str, boolean z10) {
        boolean z11 = bundle.getBoolean(str, z10);
        h10.f(EnumC3642e1.DEBUG, "%s read: %s", str, Boolean.valueOf(z11));
        return z11;
    }

    public static Double m(Bundle bundle, io.sentry.H h10, String str) {
        Double valueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        h10.f(EnumC3642e1.DEBUG, "%s read: %s", str, valueOf);
        return valueOf;
    }

    public static List n(Bundle bundle, io.sentry.H h10, String str) {
        String string = bundle.getString(str);
        h10.f(EnumC3642e1.DEBUG, "%s read: %s", str, string);
        if (string != null) {
            return Arrays.asList(string.split(Separators.COMMA, -1));
        }
        return null;
    }

    public static long o(Bundle bundle, io.sentry.H h10, String str, long j6) {
        long j10 = bundle.getInt(str, (int) j6);
        h10.f(EnumC3642e1.DEBUG, "%s read: %s", str, Long.valueOf(j10));
        return j10;
    }

    public static String p(Bundle bundle, io.sentry.H h10, String str, String str2) {
        String string = bundle.getString(str, str2);
        h10.f(EnumC3642e1.DEBUG, "%s read: %s", str, string);
        return string;
    }

    public static x3.z q(Context context, io.sentry.H h10, B b10) {
        String str;
        boolean z10;
        try {
            PackageInfo i10 = i(context, 0, h10, b10);
            PackageManager packageManager = context.getPackageManager();
            if (i10 != null && packageManager != null) {
                str = i10.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    if (installerPackageName == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return new x3.z(installerPackageName, 2, z10);
                } catch (IllegalArgumentException unused) {
                    h10.f(EnumC3642e1.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    public static int r(String str, String str2) {
        a(str, EnumC3642e1.WARNING, str2, null);
        return Log.w(str, str2);
    }

    public static void s(String str, String str2, Throwable th2) {
        a(str, EnumC3642e1.WARNING, str2, th2);
        Log.w(str, str2, th2);
    }

    public static void t(String str, Throwable th2) {
        a(str, EnumC3642e1.WARNING, null, th2);
        Log.w(str, th2);
    }

    public static void u(String str, String str2, Exception exc) {
        a(str, EnumC3642e1.ERROR, str2, exc);
        Log.wtf(str, str2, exc);
    }
}
