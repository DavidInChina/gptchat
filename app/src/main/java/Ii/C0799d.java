package Ii;

import Z.C0;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.SystemClock;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jf.C3963m;
import yf.AbstractC6583a;

/* renamed from: Ii.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0799d {

    /* renamed from: a  reason: collision with root package name */
    public final Application f8640a;

    /* renamed from: b  reason: collision with root package name */
    public final C3963m f8641b = R4.b.D1(new Uf.A(24, this));

    public C0799d(Application application) {
        this.f8640a = application;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0 a(C0799d c0799d) {
        long j6;
        PackageInfo packageInfo;
        Long l10;
        Boolean bool;
        Boolean bool2;
        Hi.h hVar;
        String str;
        long j10;
        String str2;
        Boolean bool3;
        String str3;
        String str4;
        Object obj;
        Hi.h hVar2;
        Boolean bool4;
        String str5;
        Boolean bool5;
        long j11;
        Boolean bool6;
        boolean z10;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Hi.h hVar3;
        Application application = c0799d.f8640a;
        PackageInfo packageInfo2 = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        AbstractC3557B.Z(packageInfo2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        String str6 = packageInfo2.versionName;
        if (str6 == null) {
            str6 = "null";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            j6 = packageInfo2.getLongVersionCode();
        } else {
            j6 = packageInfo2.versionCode;
        }
        String valueOf = String.valueOf(j6);
        if (!c0799d.b().contains("app_version_name")) {
            str = str6;
            if (packageInfo2.firstInstallTime != packageInfo2.lastUpdateTime) {
                hVar3 = Hi.h.f7873Y;
                bool9 = null;
                bool8 = null;
                bool7 = null;
            } else {
                bool8 = Boolean.FALSE;
                bool7 = bool8;
                hVar3 = Hi.h.f7874Z;
                bool9 = bool7;
            }
            hVar = hVar3;
            packageInfo = packageInfo2;
            str4 = valueOf;
            j10 = currentTimeMillis;
            l10 = null;
            bool2 = bool9;
            bool = bool8;
            bool3 = bool7;
            str3 = str;
            str2 = "crash_realtime";
        } else {
            str = str6;
            if (c0799d.b().contains("app_long_version_code")) {
                obj = Long.valueOf(c0799d.b().getLong("app_long_version_code", -1L));
            } else {
                obj = Integer.valueOf(c0799d.b().getInt("app_version_code", -1));
            }
            String string = c0799d.b().getString("app_all_version_names", str);
            AbstractC3557B.Z(string);
            String string2 = c0799d.b().getString("app_all_version_codes", valueOf);
            AbstractC3557B.Z(string2);
            if (!AbstractC3557B.K(obj, Long.valueOf(j6))) {
                hVar2 = Hi.h.f7875h0;
                string = android.gov.nist.core.a.j(str, ", ", string);
                string2 = android.gov.nist.core.a.j(valueOf, ", ", string2);
            } else {
                hVar2 = Hi.h.f7876i0;
            }
            String str7 = string2;
            String string3 = c0799d.b().getString("build_fingerprint", "UNKNOWN_BUILD_FINGERPRINT");
            AbstractC3557B.Z(string3);
            Hi.h hVar4 = hVar2;
            String str8 = string;
            if (string3.hashCode() != 1605881726 || !string3.equals("UNKNOWN_BUILD_FINGERPRINT")) {
                bool4 = Boolean.valueOf(!AbstractC3557B.K(string3, Build.FINGERPRINT));
            } else {
                bool4 = null;
            }
            long j12 = c0799d.b().getLong("elapsed_realtime", -1L);
            if (j12 != -1) {
                long j13 = elapsedRealtime - j12;
                if (j13 <= 0) {
                    bool5 = Boolean.TRUE;
                    packageInfo = packageInfo2;
                    str5 = str7;
                    j10 = currentTimeMillis;
                } else {
                    packageInfo = packageInfo2;
                    str5 = str7;
                    j10 = currentTimeMillis;
                    long j14 = j10 - c0799d.b().getLong("current_time", j10);
                    if (j14 > 0) {
                        long j15 = j14 - j13;
                        if (Math.abs(j15) < 30000) {
                            bool5 = Boolean.FALSE;
                        } else if (j15 > 0) {
                            bool5 = Boolean.TRUE;
                        }
                    }
                }
                bool2 = bool5;
                bool = bool4;
                str2 = "crash_realtime";
                j11 = c0799d.b().getLong(str2, -2L);
                Long valueOf2 = Long.valueOf(j11);
                if (j11 != -2) {
                    bool6 = null;
                } else {
                    if (j11 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bool6 = Boolean.valueOf(z10);
                }
                l10 = valueOf2;
                hVar = hVar4;
                str3 = str8;
                bool3 = bool6;
                str4 = str5;
            } else {
                packageInfo = packageInfo2;
                str5 = str7;
                j10 = currentTimeMillis;
            }
            bool5 = null;
            bool2 = bool5;
            bool = bool4;
            str2 = "crash_realtime";
            j11 = c0799d.b().getLong(str2, -2L);
            Long valueOf22 = Long.valueOf(j11);
            if (j11 != -2) {
            }
            l10 = valueOf22;
            hVar = hVar4;
            str3 = str8;
            bool3 = bool6;
            str4 = str5;
        }
        Boolean bool10 = bool3;
        c0799d.b().edit().putLong("app_long_version_code", j6).putString("app_version_name", str).putString("app_all_version_names", str3).putString("app_all_version_codes", str4).putLong("elapsed_realtime", elapsedRealtime).putLong("current_time", j10).putLong(str2, -1L).putString("build_fingerprint", Build.FINGERPRINT).apply();
        List G22 = Lg.n.G2(str3, new String[]{", "});
        List<String> G23 = Lg.n.G2(str4, new String[]{", "});
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(G23, 10));
        for (String str9 : G23) {
            arrayList.add(Integer.valueOf(Integer.parseInt(str9)));
        }
        return new C0(bool10, bool2, l10, hVar, packageInfo, G22, arrayList, bool);
    }

    public final SharedPreferences b() {
        return (SharedPreferences) this.f8641b.getValue();
    }
}
