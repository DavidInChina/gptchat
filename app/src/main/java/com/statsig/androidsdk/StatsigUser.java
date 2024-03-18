package com.statsig.androidsdk;

import J8.b;
import id.AbstractC3557B;
import java.util.Map;
import kf.AbstractC4268D;
import kf.w;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\r\u0010.\u001a\u00020\u0003H\u0001\u00a2\u0006\u0002\b/J\u0015\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b2J\r\u00103\u001a\u00020\u0000H\u0000\u00a2\u0006\u0002\b4J\r\u00105\u001a\u00020\u0000H\u0000\u00a2\u0006\u0002\b6J\t\u00107\u001a\u000208H\u00d6\u0001J\r\u00109\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b:J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004R,\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R,\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\u0004R \u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0004R \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0004R,\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R,\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R \u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\u0004\u00a8\u0006<"}, d2 = {"Lcom/statsig/androidsdk/StatsigUser;", "", "userID", "", "(Ljava/lang/String;)V", "appVersion", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "country", "getCountry", "setCountry", "custom", "", "getCustom", "()Ljava/util/Map;", "setCustom", "(Ljava/util/Map;)V", "customIDs", "getCustomIDs", "setCustomIDs", "email", "getEmail", "setEmail", "ip", "getIp", "setIp", "locale", "getLocale", "setLocale", "privateAttributes", "getPrivateAttributes", "setPrivateAttributes", "statsigEnvironment", "getStatsigEnvironment$build_release", "setStatsigEnvironment$build_release", "userAgent", "getUserAgent", "setUserAgent", "getUserID", "setUserID", "component1", "copy", "equals", "", "other", "getCacheKeyDEPRECATED", "getCacheKeyDEPRECATED$build_release", "getCacheKeyWithSDKKey", "sdkKey", "getCacheKeyWithSDKKey$build_release", "getCopyForEvaluation", "getCopyForEvaluation$build_release", "getCopyForLogging", "getCopyForLogging$build_release", "hashCode", "", "toHashString", "toHashString$build_release", "toString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class StatsigUser {
    @b("appVersion")
    private String appVersion;
    @b("country")
    private String country;
    @b("custom")
    private Map<String, ? extends Object> custom;
    @b("customIDs")
    private Map<String, String> customIDs;
    @b("email")
    private String email;
    @b("ip")
    private String ip;
    @b("locale")
    private String locale;
    @b("privateAttributes")
    private Map<String, ? extends Object> privateAttributes;
    @b("statsigEnvironment")
    private Map<String, String> statsigEnvironment;
    @b("userAgent")
    private String userAgent;
    @b("userID")
    private String userID;

    public StatsigUser() {
        this(null, 1, null);
    }

    public static /* synthetic */ StatsigUser copy$default(StatsigUser statsigUser, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = statsigUser.userID;
        }
        return statsigUser.copy(str);
    }

    public final String component1() {
        return this.userID;
    }

    public final StatsigUser copy(String str) {
        return new StatsigUser(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatsigUser) && AbstractC3557B.K(this.userID, ((StatsigUser) obj).userID);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getCacheKeyDEPRECATED$build_release() {
        String str = this.userID;
        if (str == null) {
            str = "Statsig.NULL_USER";
        }
        Map<String, String> map = this.customIDs;
        if (map == null) {
            return str;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str = str + entry.getKey() + ':' + entry.getValue();
        }
        return str;
    }

    public final String getCacheKeyWithSDKKey$build_release(String str) {
        AbstractC3557B.c0("sdkKey", str);
        String str2 = this.userID;
        if (str2 == null) {
            str2 = "Statsig.NULL_USER";
        }
        Map map = this.customIDs;
        if (map == null) {
            map = w.f37484Y;
        }
        for (Map.Entry entry : map.entrySet()) {
            str2 = str2 + ((String) entry.getKey()) + ':' + ((String) entry.getValue());
        }
        return str2 + ':' + str;
    }

    public final StatsigUser getCopyForEvaluation$build_release() {
        Map<String, ? extends Object> map;
        Map<String, String> map2;
        Map<String, String> map3;
        StatsigUser statsigUser = new StatsigUser(this.userID);
        statsigUser.email = this.email;
        statsigUser.ip = this.ip;
        statsigUser.userAgent = this.userAgent;
        statsigUser.country = this.country;
        statsigUser.locale = this.locale;
        statsigUser.appVersion = this.appVersion;
        Map<String, ? extends Object> map4 = this.custom;
        Map<String, ? extends Object> map5 = null;
        if (map4 == null) {
            map = null;
        } else {
            map = AbstractC4268D.l1(map4);
        }
        statsigUser.custom = map;
        Map<String, String> map6 = this.statsigEnvironment;
        if (map6 == null) {
            map2 = null;
        } else {
            map2 = AbstractC4268D.l1(map6);
        }
        statsigUser.statsigEnvironment = map2;
        Map<String, String> map7 = this.customIDs;
        if (map7 == null) {
            map3 = null;
        } else {
            map3 = AbstractC4268D.l1(map7);
        }
        statsigUser.customIDs = map3;
        Map<String, ? extends Object> map8 = this.privateAttributes;
        if (map8 != null) {
            map5 = AbstractC4268D.l1(map8);
        }
        statsigUser.privateAttributes = map5;
        return statsigUser;
    }

    public final StatsigUser getCopyForLogging$build_release() {
        StatsigUser statsigUser = new StatsigUser(this.userID);
        statsigUser.email = this.email;
        statsigUser.ip = this.ip;
        statsigUser.userAgent = this.userAgent;
        statsigUser.country = this.country;
        statsigUser.locale = this.locale;
        statsigUser.appVersion = this.appVersion;
        statsigUser.custom = this.custom;
        statsigUser.statsigEnvironment = this.statsigEnvironment;
        statsigUser.customIDs = this.customIDs;
        statsigUser.privateAttributes = null;
        return statsigUser;
    }

    public final String getCountry() {
        return this.country;
    }

    public final Map<String, Object> getCustom() {
        return this.custom;
    }

    public final Map<String, String> getCustomIDs() {
        return this.customIDs;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final Map<String, Object> getPrivateAttributes() {
        return this.privateAttributes;
    }

    public final Map<String, String> getStatsigEnvironment$build_release() {
        return this.statsigEnvironment;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        String str = this.userID;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setCustom(Map<String, ? extends Object> map) {
        this.custom = map;
    }

    public final void setCustomIDs(Map<String, String> map) {
        this.customIDs = map;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setIp(String str) {
        this.ip = str;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setPrivateAttributes(Map<String, ? extends Object> map) {
        this.privateAttributes = map;
    }

    public final void setStatsigEnvironment$build_release(Map<String, String> map) {
        this.statsigEnvironment = map;
    }

    public final void setUserAgent(String str) {
        this.userAgent = str;
    }

    public final void setUserID(String str) {
        this.userID = str;
    }

    public final String toHashString$build_release() {
        Hashing hashing = Hashing.INSTANCE;
        String i10 = StatsigUtil.INSTANCE.getGson$build_release().i(this);
        AbstractC3557B.b0("StatsigUtil.getGson().toJson(this)", i10);
        return hashing.getHashedString(i10, HashAlgorithm.DJB2);
    }

    public String toString() {
        return "StatsigUser(userID=" + ((Object) this.userID) + ')';
    }

    public StatsigUser(String str) {
        this.userID = str;
    }

    public /* synthetic */ StatsigUser(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
