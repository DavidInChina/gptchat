package com.statsig.androidsdk;

import J8.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.Map;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J+\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/statsig/androidsdk/DeprecatedStickyUserExperiments;", "", "userID", "", "experiments", "", "Lcom/statsig/androidsdk/APIDynamicConfig;", "(Ljava/lang/String;Ljava/util/Map;)V", "getExperiments", "()Ljava/util/Map;", "getUserID", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
final class DeprecatedStickyUserExperiments {
    @b(DiagnosticsEntry.Histogram.VALUES_KEY)
    private final Map<String, APIDynamicConfig> experiments;
    @b("user_id")
    private final String userID;

    public DeprecatedStickyUserExperiments(String str, Map<String, APIDynamicConfig> map) {
        AbstractC3557B.c0("experiments", map);
        this.userID = str;
        this.experiments = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeprecatedStickyUserExperiments copy$default(DeprecatedStickyUserExperiments deprecatedStickyUserExperiments, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deprecatedStickyUserExperiments.userID;
        }
        if ((i10 & 2) != 0) {
            map = deprecatedStickyUserExperiments.experiments;
        }
        return deprecatedStickyUserExperiments.copy(str, map);
    }

    public final String component1() {
        return this.userID;
    }

    public final Map<String, APIDynamicConfig> component2() {
        return this.experiments;
    }

    public final DeprecatedStickyUserExperiments copy(String str, Map<String, APIDynamicConfig> map) {
        AbstractC3557B.c0("experiments", map);
        return new DeprecatedStickyUserExperiments(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeprecatedStickyUserExperiments)) {
            return false;
        }
        DeprecatedStickyUserExperiments deprecatedStickyUserExperiments = (DeprecatedStickyUserExperiments) obj;
        return AbstractC3557B.K(this.userID, deprecatedStickyUserExperiments.userID) && AbstractC3557B.K(this.experiments, deprecatedStickyUserExperiments.experiments);
    }

    public final Map<String, APIDynamicConfig> getExperiments() {
        return this.experiments;
    }

    public final String getUserID() {
        return this.userID;
    }

    public int hashCode() {
        String str = this.userID;
        return this.experiments.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "DeprecatedStickyUserExperiments(userID=" + ((Object) this.userID) + ", experiments=" + this.experiments + ')';
    }
}
