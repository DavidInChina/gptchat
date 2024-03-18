package com.statsig.androidsdk;

import E9.f;
import J8.b;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import y.AbstractC6463a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u00a9\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\t\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J \u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ \u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\t\u0010)\u001a\u00020\fH\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003J\t\u0010+\u001a\u00020\fH\u00c6\u0003J\u00b6\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\t2\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0001\u00a2\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R*\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR*\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00063"}, d2 = {"Lcom/statsig/androidsdk/APIDynamicConfig;", "", "name", "", "value", "", "ruleID", "groupName", "secondaryExposures", "", "undelegatedSecondaryExposures", "isDeviceBased", "", "isUserInExperiment", "isExperimentActive", "allocatedExperimentName", "explicitParameters", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;[Ljava/util/Map;ZZZLjava/lang/String;[Ljava/lang/String;)V", "getAllocatedExperimentName", "()Ljava/lang/String;", "getExplicitParameters", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getGroupName", "()Z", "getName", "getRuleID", "getSecondaryExposures", "()[Ljava/util/Map;", "[Ljava/util/Map;", "getUndelegatedSecondaryExposures", "getValue", "()Ljava/util/Map;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;[Ljava/util/Map;ZZZLjava/lang/String;[Ljava/lang/String;)Lcom/statsig/androidsdk/APIDynamicConfig;", "equals", "other", "hashCode", "", "toString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class APIDynamicConfig {
    @b("allocated_experiment_name")
    private final String allocatedExperimentName;
    @b("explicit_parameters")
    private final String[] explicitParameters;
    @b("group_name")
    private final String groupName;
    @b("is_device_based")
    private final boolean isDeviceBased;
    @b("is_experiment_active")
    private final boolean isExperimentActive;
    @b("is_user_in_experiment")
    private final boolean isUserInExperiment;
    @b("name")
    private final String name;
    @b("rule_id")
    private final String ruleID;
    @b("secondary_exposures")
    private final Map<String, String>[] secondaryExposures;
    @b("undelegated_secondary_exposures")
    private final Map<String, String>[] undelegatedSecondaryExposures;
    @b("value")
    private final Map<String, Object> value;

    public APIDynamicConfig(String str, Map<String, ? extends Object> map, String str2, String str3, Map<String, String>[] mapArr, Map<String, String>[] mapArr2, boolean z10, boolean z11, boolean z12, String str4, String[] strArr) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", map);
        AbstractC3557B.c0("ruleID", str2);
        AbstractC3557B.c0("secondaryExposures", mapArr);
        AbstractC3557B.c0("undelegatedSecondaryExposures", mapArr2);
        AbstractC3557B.c0("explicitParameters", strArr);
        this.name = str;
        this.value = map;
        this.ruleID = str2;
        this.groupName = str3;
        this.secondaryExposures = mapArr;
        this.undelegatedSecondaryExposures = mapArr2;
        this.isDeviceBased = z10;
        this.isUserInExperiment = z11;
        this.isExperimentActive = z12;
        this.allocatedExperimentName = str4;
        this.explicitParameters = strArr;
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.allocatedExperimentName;
    }

    public final String[] component11() {
        return this.explicitParameters;
    }

    public final Map<String, Object> component2() {
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

    public final Map<String, String>[] component6() {
        return this.undelegatedSecondaryExposures;
    }

    public final boolean component7() {
        return this.isDeviceBased;
    }

    public final boolean component8() {
        return this.isUserInExperiment;
    }

    public final boolean component9() {
        return this.isExperimentActive;
    }

    public final APIDynamicConfig copy(String str, Map<String, ? extends Object> map, String str2, String str3, Map<String, String>[] mapArr, Map<String, String>[] mapArr2, boolean z10, boolean z11, boolean z12, String str4, String[] strArr) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", map);
        AbstractC3557B.c0("ruleID", str2);
        AbstractC3557B.c0("secondaryExposures", mapArr);
        AbstractC3557B.c0("undelegatedSecondaryExposures", mapArr2);
        AbstractC3557B.c0("explicitParameters", strArr);
        return new APIDynamicConfig(str, map, str2, str3, mapArr, mapArr2, z10, z11, z12, str4, strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof APIDynamicConfig)) {
            return false;
        }
        APIDynamicConfig aPIDynamicConfig = (APIDynamicConfig) obj;
        return AbstractC3557B.K(this.name, aPIDynamicConfig.name) && AbstractC3557B.K(this.value, aPIDynamicConfig.value) && AbstractC3557B.K(this.ruleID, aPIDynamicConfig.ruleID) && AbstractC3557B.K(this.groupName, aPIDynamicConfig.groupName) && AbstractC3557B.K(this.secondaryExposures, aPIDynamicConfig.secondaryExposures) && AbstractC3557B.K(this.undelegatedSecondaryExposures, aPIDynamicConfig.undelegatedSecondaryExposures) && this.isDeviceBased == aPIDynamicConfig.isDeviceBased && this.isUserInExperiment == aPIDynamicConfig.isUserInExperiment && this.isExperimentActive == aPIDynamicConfig.isExperimentActive && AbstractC3557B.K(this.allocatedExperimentName, aPIDynamicConfig.allocatedExperimentName) && AbstractC3557B.K(this.explicitParameters, aPIDynamicConfig.explicitParameters);
    }

    public final String getAllocatedExperimentName() {
        return this.allocatedExperimentName;
    }

    public final String[] getExplicitParameters() {
        return this.explicitParameters;
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

    public final Map<String, String>[] getUndelegatedSecondaryExposures() {
        return this.undelegatedSecondaryExposures;
    }

    public final Map<String, Object> getValue() {
        return this.value;
    }

    public int hashCode() {
        int i10;
        int v10 = f.v(this.ruleID, AbstractC6463a.f(this.value, this.name.hashCode() * 31, 31), 31);
        String str = this.groupName;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int hashCode = (((((v10 + i10) * 31) + Arrays.hashCode(this.secondaryExposures)) * 31) + Arrays.hashCode(this.undelegatedSecondaryExposures)) * 31;
        boolean z10 = this.isDeviceBased;
        int i12 = 1;
        if (z10) {
            z10 = true;
        }
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = (hashCode + i13) * 31;
        boolean z11 = this.isUserInExperiment;
        if (z11) {
            z11 = true;
        }
        int i16 = z11 ? 1 : 0;
        int i17 = z11 ? 1 : 0;
        int i18 = (i15 + i16) * 31;
        boolean z12 = this.isExperimentActive;
        if (!z12) {
            i12 = z12 ? 1 : 0;
        }
        int i19 = (i18 + i12) * 31;
        String str2 = this.allocatedExperimentName;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((i19 + i11) * 31) + Arrays.hashCode(this.explicitParameters);
    }

    public final boolean isDeviceBased() {
        return this.isDeviceBased;
    }

    public final boolean isExperimentActive() {
        return this.isExperimentActive;
    }

    public final boolean isUserInExperiment() {
        return this.isUserInExperiment;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("APIDynamicConfig(name=");
        sb2.append(this.name);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", ruleID=");
        sb2.append(this.ruleID);
        sb2.append(", groupName=");
        sb2.append((Object) this.groupName);
        sb2.append(", secondaryExposures=");
        sb2.append(Arrays.toString(this.secondaryExposures));
        sb2.append(", undelegatedSecondaryExposures=");
        sb2.append(Arrays.toString(this.undelegatedSecondaryExposures));
        sb2.append(", isDeviceBased=");
        sb2.append(this.isDeviceBased);
        sb2.append(", isUserInExperiment=");
        sb2.append(this.isUserInExperiment);
        sb2.append(", isExperimentActive=");
        sb2.append(this.isExperimentActive);
        sb2.append(", allocatedExperimentName=");
        sb2.append((Object) this.allocatedExperimentName);
        sb2.append(", explicitParameters=");
        return android.gov.nist.core.a.n(sb2, Arrays.toString(this.explicitParameters), ')');
    }

    public /* synthetic */ APIDynamicConfig(String str, Map map, String str2, String str3, Map[] mapArr, Map[] mapArr2, boolean z10, boolean z11, boolean z12, String str4, String[] strArr, int i10, g gVar) {
        this(str, map, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? new Map[0] : mapArr, (i10 & 32) != 0 ? new Map[0] : mapArr2, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? false : z12, (i10 & 512) != 0 ? null : str4, (i10 & 1024) != 0 ? new String[0] : strArr);
    }
}
