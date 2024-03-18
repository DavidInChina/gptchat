package com.statsig.androidsdk;

import E9.f;
import J8.b;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J \u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011JT\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR*\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n0\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/statsig/androidsdk/APIFeatureGate;", "", "name", "", "value", "", "ruleID", "groupName", "secondaryExposures", "", "", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/util/Map;)V", "getGroupName", "()Ljava/lang/String;", "getName", "getRuleID", "getSecondaryExposures", "()[Ljava/util/Map;", "[Ljava/util/Map;", "getValue", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;[Ljava/util/Map;)Lcom/statsig/androidsdk/APIFeatureGate;", "equals", "other", "hashCode", "", "toString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class APIFeatureGate {
    @b("group_name")
    private final String groupName;
    @b("name")
    private final String name;
    @b("rule_id")
    private final String ruleID;
    @b("secondary_exposures")
    private final Map<String, String>[] secondaryExposures;
    @b("value")
    private final boolean value;

    public APIFeatureGate(String str, boolean z10, String str2, String str3, Map<String, String>[] mapArr) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("ruleID", str2);
        AbstractC3557B.c0("secondaryExposures", mapArr);
        this.name = str;
        this.value = z10;
        this.ruleID = str2;
        this.groupName = str3;
        this.secondaryExposures = mapArr;
    }

    public static /* synthetic */ APIFeatureGate copy$default(APIFeatureGate aPIFeatureGate, String str, boolean z10, String str2, String str3, Map[] mapArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aPIFeatureGate.name;
        }
        if ((i10 & 2) != 0) {
            z10 = aPIFeatureGate.value;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            str2 = aPIFeatureGate.ruleID;
        }
        String str4 = str2;
        if ((i10 & 8) != 0) {
            str3 = aPIFeatureGate.groupName;
        }
        String str5 = str3;
        Map<String, String>[] mapArr2 = mapArr;
        if ((i10 & 16) != 0) {
            mapArr2 = aPIFeatureGate.secondaryExposures;
        }
        return aPIFeatureGate.copy(str, z11, str4, str5, mapArr2);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.value;
    }

    public final String component3() {
        return this.ruleID;
    }

    public final String component4() {
        return this.groupName;
    }

    public final Map<String, String>[] component5() {
        return this.secondaryExposures;
    }

    public final APIFeatureGate copy(String str, boolean z10, String str2, String str3, Map<String, String>[] mapArr) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("ruleID", str2);
        AbstractC3557B.c0("secondaryExposures", mapArr);
        return new APIFeatureGate(str, z10, str2, str3, mapArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIFeatureGate)) {
            return false;
        }
        APIFeatureGate aPIFeatureGate = (APIFeatureGate) obj;
        return AbstractC3557B.K(this.name, aPIFeatureGate.name) && this.value == aPIFeatureGate.value && AbstractC3557B.K(this.ruleID, aPIFeatureGate.ruleID) && AbstractC3557B.K(this.groupName, aPIFeatureGate.groupName) && AbstractC3557B.K(this.secondaryExposures, aPIFeatureGate.secondaryExposures);
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRuleID() {
        return this.ruleID;
    }

    public final Map<String, String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.name.hashCode() * 31;
        boolean z10 = this.value;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int v10 = f.v(this.ruleID, (hashCode + i11) * 31, 31);
        String str = this.groupName;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return ((v10 + i10) * 31) + Arrays.hashCode(this.secondaryExposures);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("APIFeatureGate(name=");
        sb2.append(this.name);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", ruleID=");
        sb2.append(this.ruleID);
        sb2.append(", groupName=");
        sb2.append((Object) this.groupName);
        sb2.append(", secondaryExposures=");
        return android.gov.nist.core.a.n(sb2, Arrays.toString(this.secondaryExposures), ')');
    }

    public /* synthetic */ APIFeatureGate(String str, boolean z10, String str2, String str3, Map[] mapArr, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? new Map[0] : mapArr);
    }
}
