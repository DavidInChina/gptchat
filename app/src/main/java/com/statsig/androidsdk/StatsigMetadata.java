package com.statsig.androidsdk;

import E9.f;
import J8.b;
import android.os.Build;
import id.AbstractC3557B;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.g;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u00a2\u0006\u0004\b?\u0010@J\u0019\u0010\u0003\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\bJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\r\u0010\bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\bJ\u008c\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b \u0010\bJ\u0010\u0010\"\u001a\u00020!H\u00d6\u0001\u00a2\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b&\u0010'R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\u0006R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0014\u0010(\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\u0006R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0015\u0010(\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\u0006R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0016\u0010(\u001a\u0004\b/\u0010\b\"\u0004\b0\u0010\u0006R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u0010(\u001a\u0004\b1\u0010\b\"\u0004\b2\u0010\u0006R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0018\u0010(\u001a\u0004\b3\u0010\b\"\u0004\b4\u0010\u0006R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0019\u0010(\u001a\u0004\b5\u0010\b\"\u0004\b6\u0010\u0006R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u001a\u0010(\u001a\u0004\b7\u0010\b\"\u0004\b8\u0010\u0006R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u001b\u0010(\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\u0006R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010(\u001a\u0004\b;\u0010\b\"\u0004\b<\u0010\u0006R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u001d\u0010(\u001a\u0004\b=\u0010\b\"\u0004\b>\u0010\u0006\u00a8\u0006A"}, d2 = {"Lcom/statsig/androidsdk/StatsigMetadata;", "", "", "overrideStableID", "Ljf/y;", "overrideStableID$build_release", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "stableID", "appIdentifier", "appVersion", "deviceModel", "deviceOS", "language", "sdkType", "sdkVersion", "sessionID", "systemVersion", "systemName", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/statsig/androidsdk/StatsigMetadata;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStableID", "setStableID", "getAppIdentifier", "setAppIdentifier", "getAppVersion", "setAppVersion", "getDeviceModel", "setDeviceModel", "getDeviceOS", "setDeviceOS", "getLanguage", "setLanguage", "getSdkType", "setSdkType", "getSdkVersion", "setSdkVersion", "getSessionID", "setSessionID", "getSystemVersion", "setSystemVersion", "getSystemName", "setSystemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class StatsigMetadata {
    @b("appIdentifier")
    private String appIdentifier;
    @b("appVersion")
    private String appVersion;
    @b("deviceModel")
    private String deviceModel;
    @b("deviceOS")
    private String deviceOS;
    @b("language")
    private String language;
    @b("sdkType")
    private String sdkType;
    @b("sdkVersion")
    private String sdkVersion;
    @b("sessionID")
    private String sessionID;
    @b("stableID")
    private String stableID;
    @b("systemName")
    private String systemName;
    @b("systemVersion")
    private String systemVersion;

    public StatsigMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final String component1() {
        return this.stableID;
    }

    public final String component10() {
        return this.systemVersion;
    }

    public final String component11() {
        return this.systemName;
    }

    public final String component2() {
        return this.appIdentifier;
    }

    public final String component3() {
        return this.appVersion;
    }

    public final String component4() {
        return this.deviceModel;
    }

    public final String component5() {
        return this.deviceOS;
    }

    public final String component6() {
        return this.language;
    }

    public final String component7() {
        return this.sdkType;
    }

    public final String component8() {
        return this.sdkVersion;
    }

    public final String component9() {
        return this.sessionID;
    }

    public final StatsigMetadata copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        AbstractC3557B.c0("deviceOS", str5);
        AbstractC3557B.c0("sessionID", str9);
        AbstractC3557B.c0("systemVersion", str10);
        AbstractC3557B.c0("systemName", str11);
        return new StatsigMetadata(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsigMetadata)) {
            return false;
        }
        StatsigMetadata statsigMetadata = (StatsigMetadata) obj;
        return AbstractC3557B.K(this.stableID, statsigMetadata.stableID) && AbstractC3557B.K(this.appIdentifier, statsigMetadata.appIdentifier) && AbstractC3557B.K(this.appVersion, statsigMetadata.appVersion) && AbstractC3557B.K(this.deviceModel, statsigMetadata.deviceModel) && AbstractC3557B.K(this.deviceOS, statsigMetadata.deviceOS) && AbstractC3557B.K(this.language, statsigMetadata.language) && AbstractC3557B.K(this.sdkType, statsigMetadata.sdkType) && AbstractC3557B.K(this.sdkVersion, statsigMetadata.sdkVersion) && AbstractC3557B.K(this.sessionID, statsigMetadata.sessionID) && AbstractC3557B.K(this.systemVersion, statsigMetadata.systemVersion) && AbstractC3557B.K(this.systemName, statsigMetadata.systemName);
    }

    public final String getAppIdentifier() {
        return this.appIdentifier;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOS() {
        return this.deviceOS;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getSdkType() {
        return this.sdkType;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public final String getStableID() {
        return this.stableID;
    }

    public final String getSystemName() {
        return this.systemName;
    }

    public final String getSystemVersion() {
        return this.systemVersion;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str = this.stableID;
        int i16 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i17 = i10 * 31;
        String str2 = this.appIdentifier;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i18 = (i17 + i11) * 31;
        String str3 = this.appVersion;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i19 = (i18 + i12) * 31;
        String str4 = this.deviceModel;
        if (str4 == null) {
            i13 = 0;
        } else {
            i13 = str4.hashCode();
        }
        int v10 = f.v(this.deviceOS, (i19 + i13) * 31, 31);
        String str5 = this.language;
        if (str5 == null) {
            i14 = 0;
        } else {
            i14 = str5.hashCode();
        }
        int i20 = (v10 + i14) * 31;
        String str6 = this.sdkType;
        if (str6 == null) {
            i15 = 0;
        } else {
            i15 = str6.hashCode();
        }
        int i21 = (i20 + i15) * 31;
        String str7 = this.sdkVersion;
        if (str7 != null) {
            i16 = str7.hashCode();
        }
        return this.systemName.hashCode() + f.v(this.systemVersion, f.v(this.sessionID, (i21 + i16) * 31, 31), 31);
    }

    public final void overrideStableID$build_release(String str) {
        if (str != null && !AbstractC3557B.K(str, this.stableID)) {
            this.stableID = str;
        }
    }

    public final void setAppIdentifier(String str) {
        this.appIdentifier = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public final void setDeviceOS(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.deviceOS = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setSdkType(String str) {
        this.sdkType = str;
    }

    public final void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public final void setSessionID(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.sessionID = str;
    }

    public final void setStableID(String str) {
        this.stableID = str;
    }

    public final void setSystemName(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.systemName = str;
    }

    public final void setSystemVersion(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.systemVersion = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StatsigMetadata(stableID=");
        sb2.append((Object) this.stableID);
        sb2.append(", appIdentifier=");
        sb2.append((Object) this.appIdentifier);
        sb2.append(", appVersion=");
        sb2.append((Object) this.appVersion);
        sb2.append(", deviceModel=");
        sb2.append((Object) this.deviceModel);
        sb2.append(", deviceOS=");
        sb2.append(this.deviceOS);
        sb2.append(", language=");
        sb2.append((Object) this.language);
        sb2.append(", sdkType=");
        sb2.append((Object) this.sdkType);
        sb2.append(", sdkVersion=");
        sb2.append((Object) this.sdkVersion);
        sb2.append(", sessionID=");
        sb2.append(this.sessionID);
        sb2.append(", systemVersion=");
        sb2.append(this.systemVersion);
        sb2.append(", systemName=");
        return android.gov.nist.core.a.n(sb2, this.systemName, ')');
    }

    public StatsigMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        AbstractC3557B.c0("deviceOS", str5);
        AbstractC3557B.c0("sessionID", str9);
        AbstractC3557B.c0("systemVersion", str10);
        AbstractC3557B.c0("systemName", str11);
        this.stableID = str;
        this.appIdentifier = str2;
        this.appVersion = str3;
        this.deviceModel = str4;
        this.deviceOS = str5;
        this.language = str6;
        this.sdkType = str7;
        this.sdkVersion = str8;
        this.sessionID = str9;
        this.systemVersion = str10;
        this.systemName = str11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StatsigMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i10, g gVar) {
        this(r1, r3, r2, r4, r5, r7, r8, r9, r10, (i10 & 512) != 0 ? String.valueOf(Build.VERSION.SDK_INT) : str10, (i10 & 1024) == 0 ? str11 : r6);
        String str12;
        String str13 = null;
        String str14 = (i10 & 1) != 0 ? null : str;
        String str15 = (i10 & 2) != 0 ? null : str2;
        str13 = (i10 & 4) == 0 ? str3 : str13;
        String str16 = (i10 & 8) != 0 ? Build.MODEL : str4;
        String str17 = "Android";
        String str18 = (i10 & 16) != 0 ? str17 : str5;
        String displayLanguage = (i10 & 32) != 0 ? Locale.getDefault().getDisplayLanguage() : str6;
        String str19 = (i10 & 64) != 0 ? "android-client" : str7;
        String str20 = (i10 & 128) != 0 ? BuildConfig.VERSION_NAME : str8;
        if ((i10 & 256) != 0) {
            str12 = UUID.randomUUID().toString();
            AbstractC3557B.b0("randomUUID().toString()", str12);
        } else {
            str12 = str9;
        }
    }
}
