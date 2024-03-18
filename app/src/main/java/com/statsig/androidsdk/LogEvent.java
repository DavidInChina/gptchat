package com.statsig.androidsdk;

import J8.b;
import id.AbstractC3557B;
import java.util.Map;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R.\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR4\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\fR\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR*\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006."}, d2 = {"Lcom/statsig/androidsdk/LogEvent;", "", "eventName", "", "(Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "metadata", "", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "secondaryExposures", "", "getSecondaryExposures", "()[Ljava/util/Map;", "setSecondaryExposures", "([Ljava/util/Map;)V", "[Ljava/util/Map;", "statsigMetadata", "getStatsigMetadata", "setStatsigMetadata", "time", "", "getTime", "()J", "value", "Lcom/statsig/androidsdk/StatsigUser;", "user", "getUser", "()Lcom/statsig/androidsdk/StatsigUser;", "setUser", "(Lcom/statsig/androidsdk/StatsigUser;)V", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class LogEvent {
    @b("eventName")
    private final String eventName;
    @b("metadata")
    private Map<String, String> metadata;
    @b("secondaryExposures")
    private Map<String, String>[] secondaryExposures;
    @b("statsigMetadata")
    private Map<String, String> statsigMetadata;
    @b("time")
    private final long time = System.currentTimeMillis();
    @b("user")
    private StatsigUser user;
    @b("value")
    private Object value;

    public LogEvent(String str) {
        AbstractC3557B.c0("eventName", str);
        this.eventName = str;
    }

    public static /* synthetic */ LogEvent copy$default(LogEvent logEvent, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = logEvent.eventName;
        }
        return logEvent.copy(str);
    }

    public final String component1() {
        return this.eventName;
    }

    public final LogEvent copy(String str) {
        AbstractC3557B.c0("eventName", str);
        return new LogEvent(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogEvent) && AbstractC3557B.K(this.eventName, ((LogEvent) obj).eventName);
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final Map<String, String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final Map<String, String> getStatsigMetadata() {
        return this.statsigMetadata;
    }

    public final long getTime() {
        return this.time;
    }

    public final StatsigUser getUser() {
        return this.user;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.eventName.hashCode();
    }

    public final void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    public final void setSecondaryExposures(Map<String, String>[] mapArr) {
        this.secondaryExposures = mapArr;
    }

    public final void setStatsigMetadata(Map<String, String> map) {
        this.statsigMetadata = map;
    }

    public final void setUser(StatsigUser statsigUser) {
        StatsigUser statsigUser2;
        if (statsigUser == null) {
            statsigUser2 = null;
        } else {
            statsigUser2 = statsigUser.getCopyForLogging$build_release();
        }
        this.user = statsigUser2;
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }

    public String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("LogEvent(eventName="), this.eventName, ')');
    }
}
