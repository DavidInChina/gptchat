package com.revenuecat.purchases.common;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/PlatformInfo;", "", "flavor", "", ParameterNames.VERSION, "(Ljava/lang/String;Ljava/lang/String;)V", "getFlavor", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class PlatformInfo {
    private final String flavor;
    private final String version;

    public PlatformInfo(String str, String str2) {
        AbstractC3557B.c0("flavor", str);
        this.flavor = str;
        this.version = str2;
    }

    public static /* synthetic */ PlatformInfo copy$default(PlatformInfo platformInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = platformInfo.flavor;
        }
        if ((i10 & 2) != 0) {
            str2 = platformInfo.version;
        }
        return platformInfo.copy(str, str2);
    }

    public final String component1() {
        return this.flavor;
    }

    public final String component2() {
        return this.version;
    }

    public final PlatformInfo copy(String str, String str2) {
        AbstractC3557B.c0("flavor", str);
        return new PlatformInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformInfo)) {
            return false;
        }
        PlatformInfo platformInfo = (PlatformInfo) obj;
        return AbstractC3557B.K(this.flavor, platformInfo.flavor) && AbstractC3557B.K(this.version, platformInfo.version);
    }

    public final String getFlavor() {
        return this.flavor;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = this.flavor.hashCode() * 31;
        String str = this.version;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PlatformInfo(flavor=");
        sb2.append(this.flavor);
        sb2.append(", version=");
        return android.gov.nist.core.a.n(sb2, this.version, ')');
    }
}
