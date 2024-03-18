package com.statsig.androidsdk;

import J8.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.Map;
import kotlin.Metadata;
import r9.y;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0004H\u00d6\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/statsig/androidsdk/StickyUserExperiments;", "", "experiments", "", "", "Lcom/statsig/androidsdk/APIDynamicConfig;", "(Ljava/util/Map;)V", "getExperiments", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class StickyUserExperiments {
    @b(DiagnosticsEntry.Histogram.VALUES_KEY)
    private final Map<String, APIDynamicConfig> experiments;

    public StickyUserExperiments(Map<String, APIDynamicConfig> map) {
        AbstractC3557B.c0("experiments", map);
        this.experiments = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickyUserExperiments copy$default(StickyUserExperiments stickyUserExperiments, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = stickyUserExperiments.experiments;
        }
        return stickyUserExperiments.copy(map);
    }

    public final Map<String, APIDynamicConfig> component1() {
        return this.experiments;
    }

    public final StickyUserExperiments copy(Map<String, APIDynamicConfig> map) {
        AbstractC3557B.c0("experiments", map);
        return new StickyUserExperiments(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickyUserExperiments) && AbstractC3557B.K(this.experiments, ((StickyUserExperiments) obj).experiments);
    }

    public final Map<String, APIDynamicConfig> getExperiments() {
        return this.experiments;
    }

    public int hashCode() {
        return this.experiments.hashCode();
    }

    public String toString() {
        return "StickyUserExperiments(experiments=" + this.experiments + ')';
    }
}
