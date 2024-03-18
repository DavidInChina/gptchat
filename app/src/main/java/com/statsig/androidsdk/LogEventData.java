package com.statsig.androidsdk;

import J8.b;
import id.AbstractC3557B;
import java.util.ArrayList;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0007H\u00c6\u0003J-\u0010\u000f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/statsig/androidsdk/LogEventData;", "", "events", "Ljava/util/ArrayList;", "Lcom/statsig/androidsdk/LogEvent;", "Lkotlin/collections/ArrayList;", "statsigMetadata", "Lcom/statsig/androidsdk/StatsigMetadata;", "(Ljava/util/ArrayList;Lcom/statsig/androidsdk/StatsigMetadata;)V", "getEvents", "()Ljava/util/ArrayList;", "getStatsigMetadata", "()Lcom/statsig/androidsdk/StatsigMetadata;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class LogEventData {
    @b("events")
    private final ArrayList<LogEvent> events;
    @b("statsigMetadata")
    private final StatsigMetadata statsigMetadata;

    public LogEventData(ArrayList<LogEvent> arrayList, StatsigMetadata statsigMetadata) {
        AbstractC3557B.c0("events", arrayList);
        AbstractC3557B.c0("statsigMetadata", statsigMetadata);
        this.events = arrayList;
        this.statsigMetadata = statsigMetadata;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogEventData copy$default(LogEventData logEventData, ArrayList arrayList, StatsigMetadata statsigMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = logEventData.events;
        }
        if ((i10 & 2) != 0) {
            statsigMetadata = logEventData.statsigMetadata;
        }
        return logEventData.copy(arrayList, statsigMetadata);
    }

    public final ArrayList<LogEvent> component1() {
        return this.events;
    }

    public final StatsigMetadata component2() {
        return this.statsigMetadata;
    }

    public final LogEventData copy(ArrayList<LogEvent> arrayList, StatsigMetadata statsigMetadata) {
        AbstractC3557B.c0("events", arrayList);
        AbstractC3557B.c0("statsigMetadata", statsigMetadata);
        return new LogEventData(arrayList, statsigMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventData)) {
            return false;
        }
        LogEventData logEventData = (LogEventData) obj;
        return AbstractC3557B.K(this.events, logEventData.events) && AbstractC3557B.K(this.statsigMetadata, logEventData.statsigMetadata);
    }

    public final ArrayList<LogEvent> getEvents() {
        return this.events;
    }

    public final StatsigMetadata getStatsigMetadata() {
        return this.statsigMetadata;
    }

    public int hashCode() {
        return this.statsigMetadata.hashCode() + (this.events.hashCode() * 31);
    }

    public String toString() {
        return "LogEventData(events=" + this.events + ", statsigMetadata=" + this.statsigMetadata + ')';
    }
}
