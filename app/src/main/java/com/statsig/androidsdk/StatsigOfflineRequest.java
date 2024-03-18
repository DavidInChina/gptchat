package com.statsig.androidsdk;

import J8.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/statsig/androidsdk/StatsigOfflineRequest;", "", DiagnosticsEntry.Event.TIMESTAMP_KEY, "", "requestBody", "", "(JLjava/lang/String;)V", "getRequestBody", "()Ljava/lang/String;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class StatsigOfflineRequest {
    @b("requestBody")
    private final String requestBody;
    @b(DiagnosticsEntry.Event.TIMESTAMP_KEY)
    private final long timestamp;

    public StatsigOfflineRequest(long j6, String str) {
        AbstractC3557B.c0("requestBody", str);
        this.timestamp = j6;
        this.requestBody = str;
    }

    public static /* synthetic */ StatsigOfflineRequest copy$default(StatsigOfflineRequest statsigOfflineRequest, long j6, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j6 = statsigOfflineRequest.timestamp;
        }
        if ((i10 & 2) != 0) {
            str = statsigOfflineRequest.requestBody;
        }
        return statsigOfflineRequest.copy(j6, str);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.requestBody;
    }

    public final StatsigOfflineRequest copy(long j6, String str) {
        AbstractC3557B.c0("requestBody", str);
        return new StatsigOfflineRequest(j6, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsigOfflineRequest)) {
            return false;
        }
        StatsigOfflineRequest statsigOfflineRequest = (StatsigOfflineRequest) obj;
        return this.timestamp == statsigOfflineRequest.timestamp && AbstractC3557B.K(this.requestBody, statsigOfflineRequest.requestBody);
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        long j6 = this.timestamp;
        return this.requestBody.hashCode() + (((int) (j6 ^ (j6 >>> 32))) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StatsigOfflineRequest(timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", requestBody=");
        return android.gov.nist.core.a.n(sb2, this.requestBody, ')');
    }
}
