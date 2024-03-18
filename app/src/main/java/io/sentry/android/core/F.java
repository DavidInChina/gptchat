package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import io.sentry.EnumC3642e1;
import io.sentry.protocol.EnumC3678e;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: h  reason: collision with root package name */
    public static volatile F f33964h;

    /* renamed from: a  reason: collision with root package name */
    public final Context f33965a;

    /* renamed from: b  reason: collision with root package name */
    public final SentryAndroidOptions f33966b;

    /* renamed from: c  reason: collision with root package name */
    public final B f33967c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f33968d;

    /* renamed from: e  reason: collision with root package name */
    public final x3.z f33969e;

    /* renamed from: f  reason: collision with root package name */
    public final io.sentry.protocol.m f33970f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f33971g;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
        r8 = "su";
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        r8 = r7.f34175f.exec(new java.lang.String[]{"/system/xbin/which", r8});
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
        r9 = new java.io.BufferedReader(new java.io.InputStreamReader(r8.getInputStream(), io.sentry.android.core.internal.util.g.f34169g));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
        if (r9.readLine() == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
        r8.destroy();
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
        if (r0 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c4, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
        r12.d(io.sentry.EnumC3642e1.DEBUG, "Error when trying to check if SU exists.", r0);
        r8 = r8;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
        r12.f(io.sentry.EnumC3642e1.DEBUG, "SU isn't found on this Device.", new java.lang.Object[0]);
        r8 = r8;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
        if (r8 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
        Ad.l.Z0("The ILogger object is required.", r12);
        r0 = r7.f34170a.getPackageManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ec, code lost:
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
        r7 = r7.f34174e;
        r8 = r7.length;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0112, code lost:
        if (r8 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
        r8.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0117, code lost:
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, io.sentry.protocol.m] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(Context context, SentryAndroidOptions sentryAndroidOptions) {
        Process process;
        PackageManager packageManager;
        String[] strArr;
        int i10;
        PackageManager.PackageInfoFlags of2;
        boolean z10 = false;
        this.f33965a = context;
        this.f33966b = sentryAndroidOptions;
        B b10 = new B(sentryAndroidOptions.getLogger());
        this.f33967c = b10;
        io.sentry.android.core.internal.util.c.f34157b.a();
        ?? obj = new Object();
        obj.f34577Y = "Android";
        obj.f34578Z = Build.VERSION.RELEASE;
        obj.f34580i0 = Build.DISPLAY;
        String g10 = AbstractC3612c.g(sentryAndroidOptions.getLogger());
        if (g10 != null) {
            obj.f34581j0 = g10;
        }
        if (sentryAndroidOptions.isEnableRootCheck()) {
            io.sentry.android.core.internal.util.g gVar = new io.sentry.android.core.internal.util.g(context, sentryAndroidOptions.getLogger(), b10);
            gVar.f34171b.getClass();
            String str = Build.TAGS;
            if (str == null || !str.contains("test-keys")) {
                String[] strArr2 = gVar.f34173d;
                int length = strArr2.length;
                int i11 = 0;
                while (true) {
                    io.sentry.H h10 = gVar.f34172c;
                    if (i11 >= length) {
                        break;
                    }
                    String str2 = strArr2[i11];
                    try {
                    } catch (RuntimeException e10) {
                        process = new Object[]{str2};
                        h10.b(EnumC3642e1.ERROR, e10, "Error when trying to check if root file %s exists.", process);
                    }
                    if (new File(str2).exists()) {
                        break;
                    }
                    i11++;
                }
                obj.f34582k0 = Boolean.valueOf(z10);
            }
            z10 = true;
            obj.f34582k0 = Boolean.valueOf(z10);
        }
        this.f33970f = obj;
        this.f33968d = this.f33967c.a();
        this.f33969e = AbstractC3612c.q(context, sentryAndroidOptions.getLogger(), this.f33967c);
        ActivityManager.MemoryInfo h11 = AbstractC3612c.h(context, sentryAndroidOptions.getLogger());
        if (h11 == null) {
            this.f33971g = Long.valueOf(h11.totalMem);
            return;
        } else {
            this.f33971g = null;
            return;
        }
        while (true) {
            if (i10 >= process) {
                break;
            }
            String str3 = strArr[i10];
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    of2 = PackageManager.PackageInfoFlags.of(0L);
                    packageManager.getPackageInfo(str3, of2);
                } else {
                    packageManager.getPackageInfo(str3, 0);
                }
                z10 = true;
            } catch (PackageManager.NameNotFoundException unused) {
                i10++;
            }
        }
        obj.f34582k0 = Boolean.valueOf(z10);
        this.f33970f = obj;
        this.f33968d = this.f33967c.a();
        this.f33969e = AbstractC3612c.q(context, sentryAndroidOptions.getLogger(), this.f33967c);
        ActivityManager.MemoryInfo h112 = AbstractC3612c.h(context, sentryAndroidOptions.getLogger());
        if (h112 == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:64|153|65|(13:69|73|168|74|(8:78|80|83|166|84|(2:86|90)|89|90)|79|80|83|166|84|(0)|89|90)|71|73|168|74|(8:78|80|83|166|84|(0)|89|90)|79|80|83|166|84|(0)|89|90) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:2|(1:4)|5|(3:178|6|164)|(1:(24:9|(3:174|15|16)|22|(1:24)|25|155|26|(1:30)|172|31|34|(2:36|(12:38|40|(3:159|42|45)|46|(1:48)|49|(1:51)|52|(1:54)|55|(15:59|(1:61)(1:62)|(17:64|153|65|(13:69|73|168|74|(8:78|80|83|166|84|(2:86|90)|89|90)|79|80|83|166|84|(0)|89|90)|71|73|168|74|(8:78|80|83|166|84|(0)|89|90)|79|80|83|166|84|(0)|89|90)|91|(1:(1:94)(1:95))(1:96)|97|(1:100)|101|(7:103|176|104|107|170|108|111)|112|(1:118)(4:120|(4:(1:123)(1:124)|125|(2:127|(1:134)(3:181|182|183))|180)(1:135)|136|139)|119|(6:161|141|144|157|145|148)|149|(1:151))|152))|39|40|(0)|46|(0)|49|(0)|52|(0)|55|(18:57|59|(0)(0)|(0)|91|(0)(0)|97|(1:100)|101|(0)|112|(1:114)|116|118|119|(0)|149|(0))|152)(1:10))(1:13)|163|(0)|22|(0)|25|155|26|(0)|172|31|34|(0)|39|40|(0)|46|(0)|49|(0)|52|(0)|55|(0)|152|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02dd, code lost:
        r13 = new android.os.StatFs(r4.getPath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
        r7.d(io.sentry.EnumC3642e1.ERROR, "Error getting DisplayMetrics.", r8);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
        r1.getLogger().b(io.sentry.EnumC3642e1.ERROR, r7, "Error getting the device's boot time.", new java.lang.Object[0]);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c6, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c7, code lost:
        r1.getLogger().d(io.sentry.EnumC3642e1.ERROR, "Error getting device charging state.", r8);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e6, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e7, code lost:
        r1.getLogger().d(io.sentry.EnumC3642e1.ERROR, "Error getting battery temperature.", r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01dd A[Catch: all -> 0x01e6, TRY_LEAVE, TryCatch #6 {all -> 0x01e6, blocks: (B:84:0x01d5, B:86:0x01dd), top: B:166:0x01d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [io.sentry.protocol.f, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.sentry.protocol.f a(boolean z10, boolean z11) {
        EnumC3678e enumC3678e;
        Boolean bool;
        DisplayMetrics displayMetrics;
        TimeZone timeZone;
        String str;
        ArrayList a5;
        Intent intent;
        int i10;
        Boolean bool2;
        ActivityManager.MemoryInfo h10;
        File externalFilesDir;
        String externalStorageState;
        StatFs statFs;
        Long l10;
        File file;
        String str2;
        Long l11;
        Long l12;
        Float f6;
        Float f10;
        int intExtra;
        int intExtra2;
        boolean z12;
        int intExtra3;
        int intExtra4;
        LocaleList locales;
        boolean isEmpty;
        Locale locale;
        Throwable th2;
        int i11;
        ?? obj = new Object();
        SentryAndroidOptions sentryAndroidOptions = this.f33966b;
        boolean isSendDefaultPii = sentryAndroidOptions.isSendDefaultPii();
        Context context = this.f33965a;
        if (isSendDefaultPii) {
            obj.f34526Y = Settings.Global.getString(context.getContentResolver(), "device_name");
        }
        obj.f34527Z = Build.MANUFACTURER;
        obj.f34528h0 = Build.BRAND;
        obj.f34529i0 = AbstractC3612c.f(sentryAndroidOptions.getLogger());
        obj.f34530j0 = Build.MODEL;
        obj.f34531k0 = Build.ID;
        this.f33967c.getClass();
        obj.f34532l0 = Build.SUPPORTED_ABIS;
        Long l13 = null;
        try {
            i11 = context.getResources().getConfiguration().orientation;
            try {
            } catch (Throwable th3) {
                th2 = th3;
                enumC3678e = null;
                sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting device orientation.", th2);
                obj.f34536p0 = enumC3678e;
                bool = this.f33968d;
                if (bool != null) {
                }
                io.sentry.H logger = sentryAndroidOptions.getLogger();
                displayMetrics = context.getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                }
                Date date = r.f.B(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                obj.f34515D0 = date;
                if (Build.VERSION.SDK_INT >= 24) {
                }
                timeZone = Calendar.getInstance().getTimeZone();
                obj.f34516E0 = timeZone;
                if (obj.f34517F0 == null) {
                }
                Locale locale2 = Locale.getDefault();
                if (obj.f34518G0 == null) {
                }
                if (obj.f34519H0 == null) {
                }
                a5 = io.sentry.android.core.internal.util.c.f34157b.a();
                if (!a5.isEmpty()) {
                }
                obj.f34538r0 = this.f33971g;
                if (z10) {
                }
                return obj;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                enumC3678e = null;
                if (enumC3678e == null) {
                    try {
                        sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                        enumC3678e = null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting device orientation.", th2);
                        obj.f34536p0 = enumC3678e;
                        bool = this.f33968d;
                        if (bool != null) {
                        }
                        io.sentry.H logger2 = sentryAndroidOptions.getLogger();
                        displayMetrics = context.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                        }
                        Date date2 = r.f.B(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                        obj.f34515D0 = date2;
                        if (Build.VERSION.SDK_INT >= 24) {
                        }
                        timeZone = Calendar.getInstance().getTimeZone();
                        obj.f34516E0 = timeZone;
                        if (obj.f34517F0 == null) {
                        }
                        Locale locale22 = Locale.getDefault();
                        if (obj.f34518G0 == null) {
                        }
                        if (obj.f34519H0 == null) {
                        }
                        a5 = io.sentry.android.core.internal.util.c.f34157b.a();
                        if (!a5.isEmpty()) {
                        }
                        obj.f34538r0 = this.f33971g;
                        if (z10) {
                        }
                        return obj;
                    }
                }
                obj.f34536p0 = enumC3678e;
                bool = this.f33968d;
                if (bool != null) {
                    obj.f34537q0 = bool;
                }
                io.sentry.H logger22 = sentryAndroidOptions.getLogger();
                displayMetrics = context.getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    obj.f34546z0 = Integer.valueOf(displayMetrics.widthPixels);
                    obj.f34512A0 = Integer.valueOf(displayMetrics.heightPixels);
                    obj.f34513B0 = Float.valueOf(displayMetrics.density);
                    obj.f34514C0 = Integer.valueOf(displayMetrics.densityDpi);
                }
                Date date22 = r.f.B(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                obj.f34515D0 = date22;
                if (Build.VERSION.SDK_INT >= 24) {
                    locales = context.getResources().getConfiguration().getLocales();
                    isEmpty = locales.isEmpty();
                    if (!isEmpty) {
                        locale = locales.get(0);
                        timeZone = Calendar.getInstance(locale).getTimeZone();
                        obj.f34516E0 = timeZone;
                        if (obj.f34517F0 == null) {
                            try {
                                str = J.a(context);
                            } catch (Throwable th6) {
                                sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting installationId.", th6);
                                str = null;
                            }
                            obj.f34517F0 = str;
                        }
                        Locale locale222 = Locale.getDefault();
                        if (obj.f34518G0 == null) {
                            obj.f34518G0 = locale222.getLanguage();
                        }
                        if (obj.f34519H0 == null) {
                            obj.f34519H0 = locale222.toString();
                        }
                        a5 = io.sentry.android.core.internal.util.c.f34157b.a();
                        if (!a5.isEmpty()) {
                            obj.f34523L0 = Double.valueOf(((Integer) Collections.max(a5)).doubleValue());
                            obj.f34522K0 = Integer.valueOf(a5.size());
                        }
                        obj.f34538r0 = this.f33971g;
                        if (z10 && sentryAndroidOptions.isCollectAdditionalContext()) {
                            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                            if (Build.VERSION.SDK_INT < 33) {
                                intent = context.registerReceiver(null, intentFilter, 2);
                            } else {
                                intent = context.registerReceiver(null, intentFilter);
                            }
                            if (intent != null) {
                                try {
                                    intExtra3 = intent.getIntExtra("level", -1);
                                    intExtra4 = intent.getIntExtra("scale", -1);
                                } catch (Throwable th7) {
                                    sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting device battery level.", th7);
                                }
                                if (intExtra3 != -1 && intExtra4 != -1) {
                                    f6 = Float.valueOf((intExtra3 / intExtra4) * 100.0f);
                                    obj.f34533m0 = f6;
                                    intExtra2 = intent.getIntExtra("plugged", -1);
                                    if (intExtra2 != 1 && intExtra2 != 2) {
                                        z12 = false;
                                        Boolean bool3 = Boolean.valueOf(z12);
                                        obj.f34534n0 = bool3;
                                        intExtra = intent.getIntExtra("temperature", -1);
                                        if (intExtra != -1) {
                                            f10 = Float.valueOf(intExtra / 10.0f);
                                            obj.f34521J0 = f10;
                                        }
                                        f10 = null;
                                        obj.f34521J0 = f10;
                                    }
                                    z12 = true;
                                    Boolean bool32 = Boolean.valueOf(z12);
                                    obj.f34534n0 = bool32;
                                    intExtra = intent.getIntExtra("temperature", -1);
                                    if (intExtra != -1) {
                                    }
                                    f10 = null;
                                    obj.f34521J0 = f10;
                                }
                                f6 = null;
                                obj.f34533m0 = f6;
                                intExtra2 = intent.getIntExtra("plugged", -1);
                                if (intExtra2 != 1) {
                                    z12 = false;
                                    Boolean bool322 = Boolean.valueOf(z12);
                                    obj.f34534n0 = bool322;
                                    intExtra = intent.getIntExtra("temperature", -1);
                                    if (intExtra != -1) {
                                    }
                                    f10 = null;
                                    obj.f34521J0 = f10;
                                }
                                z12 = true;
                                Boolean bool3222 = Boolean.valueOf(z12);
                                obj.f34534n0 = bool3222;
                                intExtra = intent.getIntExtra("temperature", -1);
                                if (intExtra != -1) {
                                }
                                f10 = null;
                                obj.f34521J0 = f10;
                            }
                            i10 = E.f33959a[sentryAndroidOptions.getConnectionStatusProvider().g().ordinal()];
                            if (i10 == 1) {
                                if (i10 != 2) {
                                    bool2 = null;
                                } else {
                                    bool2 = Boolean.TRUE;
                                }
                            } else {
                                bool2 = Boolean.FALSE;
                            }
                            obj.f34535o0 = bool2;
                            h10 = AbstractC3612c.h(context, sentryAndroidOptions.getLogger());
                            if (h10 != null && z11) {
                                obj.f34539s0 = Long.valueOf(h10.availMem);
                                obj.f34541u0 = Boolean.valueOf(h10.lowMemory);
                            }
                            externalFilesDir = context.getExternalFilesDir(null);
                            if (externalFilesDir != null) {
                                StatFs statFs2 = new StatFs(externalFilesDir.getPath());
                                try {
                                    l11 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                                } catch (Throwable th8) {
                                    sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting total internal storage amount.", th8);
                                    l11 = null;
                                }
                                obj.f34542v0 = l11;
                                try {
                                    l12 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                                } catch (Throwable th9) {
                                    sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting unused internal storage amount.", th9);
                                    l12 = null;
                                }
                                obj.f34543w0 = l12;
                            }
                            externalStorageState = Environment.getExternalStorageState();
                            if ((!"mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated()) {
                                sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "External storage is not mounted or emulated.", new Object[0]);
                            } else {
                                File[] externalFilesDirs = context.getExternalFilesDirs(null);
                                if (externalFilesDirs != null) {
                                    if (externalFilesDir != null) {
                                        str2 = externalFilesDir.getAbsolutePath();
                                    } else {
                                        str2 = null;
                                    }
                                    int length = externalFilesDirs.length;
                                    for (int i12 = 0; i12 < length; i12++) {
                                        file = externalFilesDirs[i12];
                                        if (file != null && (str2 == null || str2.isEmpty() || !file.getAbsolutePath().contains(str2))) {
                                            break;
                                        }
                                    }
                                } else {
                                    sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                                }
                                file = null;
                                sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "Not possible to read external files directory", new Object[0]);
                            }
                            statFs = null;
                            if (statFs != null) {
                                try {
                                    l10 = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                } catch (Throwable th10) {
                                    sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting total external storage amount.", th10);
                                    l10 = null;
                                }
                                obj.f34544x0 = l10;
                                try {
                                    l13 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                } catch (Throwable th11) {
                                    sentryAndroidOptions.getLogger().d(EnumC3642e1.ERROR, "Error getting unused external storage amount.", th11);
                                }
                                obj.f34545y0 = l13;
                            }
                            if (obj.f34520I0 == null) {
                                obj.f34520I0 = sentryAndroidOptions.getConnectionStatusProvider().a();
                            }
                        }
                        return obj;
                    }
                }
                timeZone = Calendar.getInstance().getTimeZone();
                obj.f34516E0 = timeZone;
                if (obj.f34517F0 == null) {
                }
                Locale locale2222 = Locale.getDefault();
                if (obj.f34518G0 == null) {
                }
                if (obj.f34519H0 == null) {
                }
                a5 = io.sentry.android.core.internal.util.c.f34157b.a();
                if (!a5.isEmpty()) {
                }
                obj.f34538r0 = this.f33971g;
                if (z10) {
                    IntentFilter intentFilter2 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                    if (Build.VERSION.SDK_INT < 33) {
                    }
                    if (intent != null) {
                    }
                    i10 = E.f33959a[sentryAndroidOptions.getConnectionStatusProvider().g().ordinal()];
                    if (i10 == 1) {
                    }
                    obj.f34535o0 = bool2;
                    h10 = AbstractC3612c.h(context, sentryAndroidOptions.getLogger());
                    if (h10 != null) {
                        obj.f34539s0 = Long.valueOf(h10.availMem);
                        obj.f34541u0 = Boolean.valueOf(h10.lowMemory);
                    }
                    externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                    }
                    externalStorageState = Environment.getExternalStorageState();
                    if (!"mounted".equals(externalStorageState)) {
                    }
                    sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "External storage is not mounted or emulated.", new Object[0]);
                    statFs = null;
                    if (statFs != null) {
                    }
                    if (obj.f34520I0 == null) {
                    }
                }
                return obj;
            }
            enumC3678e = EnumC3678e.LANDSCAPE;
        } else {
            enumC3678e = EnumC3678e.PORTRAIT;
        }
        if (enumC3678e == null) {
        }
        obj.f34536p0 = enumC3678e;
        bool = this.f33968d;
        if (bool != null) {
        }
        io.sentry.H logger222 = sentryAndroidOptions.getLogger();
        displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
        }
        Date date222 = r.f.B(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        obj.f34515D0 = date222;
        if (Build.VERSION.SDK_INT >= 24) {
        }
        timeZone = Calendar.getInstance().getTimeZone();
        obj.f34516E0 = timeZone;
        if (obj.f34517F0 == null) {
        }
        Locale locale22222 = Locale.getDefault();
        if (obj.f34518G0 == null) {
        }
        if (obj.f34519H0 == null) {
        }
        a5 = io.sentry.android.core.internal.util.c.f34157b.a();
        if (!a5.isEmpty()) {
        }
        obj.f34538r0 = this.f33971g;
        if (z10) {
        }
        return obj;
    }
}
