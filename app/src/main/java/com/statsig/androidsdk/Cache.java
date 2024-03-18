package com.statsig.androidsdk;

import E9.f;
import J8.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.statsig.androidsdk.InitializeResponse;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010'\u001a\u00020\u0007H\u00d6\u0001R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006("}, d2 = {"Lcom/statsig/androidsdk/Cache;", "", DiagnosticsEntry.Histogram.VALUES_KEY, "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "stickyUserExperiments", "Lcom/statsig/androidsdk/StickyUserExperiments;", "userHash", "", "evaluationTime", "", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;Lcom/statsig/androidsdk/StickyUserExperiments;Ljava/lang/String;Ljava/lang/Long;)V", "getEvaluationTime", "()Ljava/lang/Long;", "setEvaluationTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getStickyUserExperiments", "()Lcom/statsig/androidsdk/StickyUserExperiments;", "setStickyUserExperiments", "(Lcom/statsig/androidsdk/StickyUserExperiments;)V", "getUserHash", "()Ljava/lang/String;", "setUserHash", "(Ljava/lang/String;)V", "getValues", "()Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "setValues", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;)V", "component1", "component2", "component3", "component4", "copy", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;Lcom/statsig/androidsdk/StickyUserExperiments;Ljava/lang/String;Ljava/lang/Long;)Lcom/statsig/androidsdk/Cache;", "equals", "", "other", "hashCode", "", "toString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class Cache {
    @b("evaluationTime")
    private Long evaluationTime;
    @b("stickyUserExperiments")
    private StickyUserExperiments stickyUserExperiments;
    @b("userHash")
    private String userHash;
    @b(DiagnosticsEntry.Histogram.VALUES_KEY)
    private InitializeResponse.SuccessfulInitializeResponse values;

    public Cache(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, StickyUserExperiments stickyUserExperiments, String str, Long l10) {
        AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, successfulInitializeResponse);
        AbstractC3557B.c0("stickyUserExperiments", stickyUserExperiments);
        AbstractC3557B.c0("userHash", str);
        this.values = successfulInitializeResponse;
        this.stickyUserExperiments = stickyUserExperiments;
        this.userHash = str;
        this.evaluationTime = l10;
    }

    public static /* synthetic */ Cache copy$default(Cache cache, InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, StickyUserExperiments stickyUserExperiments, String str, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            successfulInitializeResponse = cache.values;
        }
        if ((i10 & 2) != 0) {
            stickyUserExperiments = cache.stickyUserExperiments;
        }
        if ((i10 & 4) != 0) {
            str = cache.userHash;
        }
        if ((i10 & 8) != 0) {
            l10 = cache.evaluationTime;
        }
        return cache.copy(successfulInitializeResponse, stickyUserExperiments, str, l10);
    }

    public final InitializeResponse.SuccessfulInitializeResponse component1() {
        return this.values;
    }

    public final StickyUserExperiments component2() {
        return this.stickyUserExperiments;
    }

    public final String component3() {
        return this.userHash;
    }

    public final Long component4() {
        return this.evaluationTime;
    }

    public final Cache copy(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, StickyUserExperiments stickyUserExperiments, String str, Long l10) {
        AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, successfulInitializeResponse);
        AbstractC3557B.c0("stickyUserExperiments", stickyUserExperiments);
        AbstractC3557B.c0("userHash", str);
        return new Cache(successfulInitializeResponse, stickyUserExperiments, str, l10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cache)) {
            return false;
        }
        Cache cache = (Cache) obj;
        return AbstractC3557B.K(this.values, cache.values) && AbstractC3557B.K(this.stickyUserExperiments, cache.stickyUserExperiments) && AbstractC3557B.K(this.userHash, cache.userHash) && AbstractC3557B.K(this.evaluationTime, cache.evaluationTime);
    }

    public final Long getEvaluationTime() {
        return this.evaluationTime;
    }

    public final StickyUserExperiments getStickyUserExperiments() {
        return this.stickyUserExperiments;
    }

    public final String getUserHash() {
        return this.userHash;
    }

    public final InitializeResponse.SuccessfulInitializeResponse getValues() {
        return this.values;
    }

    public int hashCode() {
        int i10;
        int v10 = f.v(this.userHash, ((this.values.hashCode() * 31) + this.stickyUserExperiments.hashCode()) * 31, 31);
        Long l10 = this.evaluationTime;
        if (l10 == null) {
            i10 = 0;
        } else {
            i10 = l10.hashCode();
        }
        return v10 + i10;
    }

    public final void setEvaluationTime(Long l10) {
        this.evaluationTime = l10;
    }

    public final void setStickyUserExperiments(StickyUserExperiments stickyUserExperiments) {
        AbstractC3557B.c0("<set-?>", stickyUserExperiments);
        this.stickyUserExperiments = stickyUserExperiments;
    }

    public final void setUserHash(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.userHash = str;
    }

    public final void setValues(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse) {
        AbstractC3557B.c0("<set-?>", successfulInitializeResponse);
        this.values = successfulInitializeResponse;
    }

    public String toString() {
        return "Cache(values=" + this.values + ", stickyUserExperiments=" + this.stickyUserExperiments + ", userHash=" + this.userHash + ", evaluationTime=" + this.evaluationTime + ')';
    }

    public /* synthetic */ Cache(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, StickyUserExperiments stickyUserExperiments, String str, Long l10, int i10, g gVar) {
        this(successfulInitializeResponse, stickyUserExperiments, str, (i10 & 8) != 0 ? Long.valueOf(System.currentTimeMillis()) : l10);
    }
}
