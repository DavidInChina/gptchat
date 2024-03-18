package com.statsig.androidsdk;

import E9.f;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006BQ\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00100\u000f\u00a2\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bH\u00c6\u0003J \u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00100\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J^\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00100\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R%\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00100\u000f\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006*"}, d2 = {"Lcom/statsig/androidsdk/FeatureGate;", "", "apiFeatureGate", "Lcom/statsig/androidsdk/APIFeatureGate;", "evalDetails", "Lcom/statsig/androidsdk/EvaluationDetails;", "(Lcom/statsig/androidsdk/APIFeatureGate;Lcom/statsig/androidsdk/EvaluationDetails;)V", "name", "", "details", "value", "", "ruleID", "groupName", "secondaryExposures", "", "", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;ZLjava/lang/String;Ljava/lang/String;[Ljava/util/Map;)V", "getDetails", "()Lcom/statsig/androidsdk/EvaluationDetails;", "getGroupName", "()Ljava/lang/String;", "getName", "getRuleID", "getSecondaryExposures", "()[Ljava/util/Map;", "[Ljava/util/Map;", "getValue", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;ZLjava/lang/String;Ljava/lang/String;[Ljava/util/Map;)Lcom/statsig/androidsdk/FeatureGate;", "equals", "other", "hashCode", "", "toString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class FeatureGate {
    private final EvaluationDetails details;
    private final String groupName;
    private final String name;
    private final String ruleID;
    private final Map<String, String>[] secondaryExposures;
    private final boolean value;

    public FeatureGate(String str, EvaluationDetails evaluationDetails, boolean z10, String str2, String str3, Map<String, String>[] mapArr) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("details", evaluationDetails);
        AbstractC3557B.c0("ruleID", str2);
        AbstractC3557B.c0("secondaryExposures", mapArr);
        this.name = str;
        this.details = evaluationDetails;
        this.value = z10;
        this.ruleID = str2;
        this.groupName = str3;
        this.secondaryExposures = mapArr;
    }

    public static /* synthetic */ FeatureGate copy$default(FeatureGate featureGate, String str, EvaluationDetails evaluationDetails, boolean z10, String str2, String str3, Map[] mapArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = featureGate.name;
        }
        if ((i10 & 2) != 0) {
            evaluationDetails = featureGate.details;
        }
        EvaluationDetails evaluationDetails2 = evaluationDetails;
        if ((i10 & 4) != 0) {
            z10 = featureGate.value;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            str2 = featureGate.ruleID;
        }
        String str4 = str2;
        if ((i10 & 16) != 0) {
            str3 = featureGate.groupName;
        }
        String str5 = str3;
        Map<String, String>[] mapArr2 = mapArr;
        if ((i10 & 32) != 0) {
            mapArr2 = featureGate.secondaryExposures;
        }
        return featureGate.copy(str, evaluationDetails2, z11, str4, str5, mapArr2);
    }

    public final String component1() {
        return this.name;
    }

    public final EvaluationDetails component2() {
        return this.details;
    }

    public final boolean component3() {
        return this.value;
    }

    public final String component4() {
        return this.ruleID;
    }

    public final String component5() {
        return this.groupName;
    }

    public final Map<String, String>[] component6() {
        return this.secondaryExposures;
    }

    public final FeatureGate copy(String str, EvaluationDetails evaluationDetails, boolean z10, String str2, String str3, Map<String, String>[] mapArr) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("details", evaluationDetails);
        AbstractC3557B.c0("ruleID", str2);
        AbstractC3557B.c0("secondaryExposures", mapArr);
        return new FeatureGate(str, evaluationDetails, z10, str2, str3, mapArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureGate)) {
            return false;
        }
        FeatureGate featureGate = (FeatureGate) obj;
        return AbstractC3557B.K(this.name, featureGate.name) && AbstractC3557B.K(this.details, featureGate.details) && this.value == featureGate.value && AbstractC3557B.K(this.ruleID, featureGate.ruleID) && AbstractC3557B.K(this.groupName, featureGate.groupName) && AbstractC3557B.K(this.secondaryExposures, featureGate.secondaryExposures);
    }

    public final EvaluationDetails getDetails() {
        return this.details;
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
        int hashCode = (this.details.hashCode() + (this.name.hashCode() * 31)) * 31;
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
        StringBuilder sb2 = new StringBuilder("FeatureGate(name=");
        sb2.append(this.name);
        sb2.append(", details=");
        sb2.append(this.details);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", ruleID=");
        sb2.append(this.ruleID);
        sb2.append(", groupName=");
        sb2.append((Object) this.groupName);
        sb2.append(", secondaryExposures=");
        return android.gov.nist.core.a.n(sb2, Arrays.toString(this.secondaryExposures), ')');
    }

    public /* synthetic */ FeatureGate(String str, EvaluationDetails evaluationDetails, boolean z10, String str2, String str3, Map[] mapArr, int i10, g gVar) {
        this(str, evaluationDetails, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? new Map[0] : mapArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeatureGate(APIFeatureGate aPIFeatureGate, EvaluationDetails evaluationDetails) {
        this(aPIFeatureGate.getName(), evaluationDetails, aPIFeatureGate.getValue(), aPIFeatureGate.getRuleID(), aPIFeatureGate.getGroupName(), aPIFeatureGate.getSecondaryExposures());
        AbstractC3557B.c0("apiFeatureGate", aPIFeatureGate);
        AbstractC3557B.c0("evalDetails", evaluationDetails);
    }
}
