package com.revenuecat.purchases;

import id.AbstractC3557B;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import y.AbstractC6463a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002'(B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0007B=\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c0\u0003\u00a2\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u00c0\u0003\u00a2\u0006\u0002\b\u001aJC\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0006H\u0086\u0002J\u0010\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\"\u001a\u00020\u0006J\u0010\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0006J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006)"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "", "current", "Lcom/revenuecat/purchases/Offering;", "all", "", "", "(Lcom/revenuecat/purchases/Offering;Ljava/util/Map;)V", "placements", "Lcom/revenuecat/purchases/Offerings$Placements;", "targeting", "Lcom/revenuecat/purchases/Offerings$Targeting;", "(Lcom/revenuecat/purchases/Offering;Ljava/util/Map;Lcom/revenuecat/purchases/Offerings$Placements;Lcom/revenuecat/purchases/Offerings$Targeting;)V", "getAll", "()Ljava/util/Map;", "getCurrent", "()Lcom/revenuecat/purchases/Offering;", "getPlacements$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/Offerings$Placements;", "getTargeting$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/Offerings$Targeting;", "component1", "component2", "component3", "component3$purchases_customEntitlementComputationRelease", "component4", "component4$purchases_customEntitlementComputationRelease", "copy", "equals", "", "other", "get", "identifier", "getCurrentOfferingForPlacement", "placementId", "getOffering", "hashCode", "", "toString", "Placements", "Targeting", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class Offerings {
    private final Map<String, Offering> all;
    private final Offering current;
    private final Placements placements;
    private final Targeting targeting;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u00c6\u0003J-\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/Offerings$Placements;", "", "fallbackOfferingId", "", "offeringIdsByPlacement", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getFallbackOfferingId", "()Ljava/lang/String;", "getOfferingIdsByPlacement", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Placements {
        private final String fallbackOfferingId;
        private final Map<String, String> offeringIdsByPlacement;

        public Placements(String str, Map<String, String> map) {
            AbstractC3557B.c0("offeringIdsByPlacement", map);
            this.fallbackOfferingId = str;
            this.offeringIdsByPlacement = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Placements copy$default(Placements placements, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = placements.fallbackOfferingId;
            }
            if ((i10 & 2) != 0) {
                map = placements.offeringIdsByPlacement;
            }
            return placements.copy(str, map);
        }

        public final String component1() {
            return this.fallbackOfferingId;
        }

        public final Map<String, String> component2() {
            return this.offeringIdsByPlacement;
        }

        public final Placements copy(String str, Map<String, String> map) {
            AbstractC3557B.c0("offeringIdsByPlacement", map);
            return new Placements(str, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Placements)) {
                return false;
            }
            Placements placements = (Placements) obj;
            return AbstractC3557B.K(this.fallbackOfferingId, placements.fallbackOfferingId) && AbstractC3557B.K(this.offeringIdsByPlacement, placements.offeringIdsByPlacement);
        }

        public final String getFallbackOfferingId() {
            return this.fallbackOfferingId;
        }

        public final Map<String, String> getOfferingIdsByPlacement() {
            return this.offeringIdsByPlacement;
        }

        public int hashCode() {
            String str = this.fallbackOfferingId;
            return this.offeringIdsByPlacement.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            return "Placements(fallbackOfferingId=" + this.fallbackOfferingId + ", offeringIdsByPlacement=" + this.offeringIdsByPlacement + ')';
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/Offerings$Targeting;", "", "revision", "", "ruleId", "", "(ILjava/lang/String;)V", "getRevision", "()I", "getRuleId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Targeting {
        private final int revision;
        private final String ruleId;

        public Targeting(int i10, String str) {
            AbstractC3557B.c0("ruleId", str);
            this.revision = i10;
            this.ruleId = str;
        }

        public static /* synthetic */ Targeting copy$default(Targeting targeting, int i10, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = targeting.revision;
            }
            if ((i11 & 2) != 0) {
                str = targeting.ruleId;
            }
            return targeting.copy(i10, str);
        }

        public final int component1() {
            return this.revision;
        }

        public final String component2() {
            return this.ruleId;
        }

        public final Targeting copy(int i10, String str) {
            AbstractC3557B.c0("ruleId", str);
            return new Targeting(i10, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Targeting)) {
                return false;
            }
            Targeting targeting = (Targeting) obj;
            return this.revision == targeting.revision && AbstractC3557B.K(this.ruleId, targeting.ruleId);
        }

        public final int getRevision() {
            return this.revision;
        }

        public final String getRuleId() {
            return this.ruleId;
        }

        public int hashCode() {
            return this.ruleId.hashCode() + (this.revision * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Targeting(revision=");
            sb2.append(this.revision);
            sb2.append(", ruleId=");
            return android.gov.nist.core.a.n(sb2, this.ruleId, ')');
        }
    }

    public Offerings(Offering offering, Map<String, Offering> map, Placements placements, Targeting targeting) {
        AbstractC3557B.c0("all", map);
        this.current = offering;
        this.all = map;
        this.placements = placements;
        this.targeting = targeting;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offerings copy$default(Offerings offerings, Offering offering, Map map, Placements placements, Targeting targeting, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offering = offerings.current;
        }
        if ((i10 & 2) != 0) {
            map = offerings.all;
        }
        if ((i10 & 4) != 0) {
            placements = offerings.placements;
        }
        if ((i10 & 8) != 0) {
            targeting = offerings.targeting;
        }
        return offerings.copy(offering, map, placements, targeting);
    }

    public final Offering component1() {
        return this.current;
    }

    public final Map<String, Offering> component2() {
        return this.all;
    }

    public final Placements component3$purchases_customEntitlementComputationRelease() {
        return this.placements;
    }

    public final Targeting component4$purchases_customEntitlementComputationRelease() {
        return this.targeting;
    }

    public final Offerings copy(Offering offering, Map<String, Offering> map, Placements placements, Targeting targeting) {
        AbstractC3557B.c0("all", map);
        return new Offerings(offering, map, placements, targeting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offerings)) {
            return false;
        }
        Offerings offerings = (Offerings) obj;
        return AbstractC3557B.K(this.current, offerings.current) && AbstractC3557B.K(this.all, offerings.all) && AbstractC3557B.K(this.placements, offerings.placements) && AbstractC3557B.K(this.targeting, offerings.targeting);
    }

    public final Offering get(String str) {
        AbstractC3557B.c0("identifier", str);
        return getOffering(str);
    }

    public final Map<String, Offering> getAll() {
        return this.all;
    }

    public final Offering getCurrent() {
        return this.current;
    }

    public final Offering getCurrentOfferingForPlacement(String str) {
        Offering offering;
        Offering offering2;
        AbstractC3557B.c0("placementId", str);
        Placements placements = this.placements;
        if (placements == null) {
            return null;
        }
        String str2 = placements.getOfferingIdsByPlacement().get(str);
        if (str2 != null) {
            offering = getOffering(str2);
        } else {
            offering = null;
        }
        String fallbackOfferingId = placements.getFallbackOfferingId();
        if (fallbackOfferingId != null) {
            offering2 = getOffering(fallbackOfferingId);
        } else {
            offering2 = null;
        }
        boolean containsKey = placements.getOfferingIdsByPlacement().containsKey(str);
        if (offering == null) {
            if (containsKey) {
                offering = null;
            } else {
                offering = offering2;
            }
        }
        if (offering == null) {
            return null;
        }
        return OfferingsKt.withPresentedContext(offering, str, this.targeting);
    }

    public final Offering getOffering(String str) {
        AbstractC3557B.c0("identifier", str);
        return this.all.get(str);
    }

    public final Placements getPlacements$purchases_customEntitlementComputationRelease() {
        return this.placements;
    }

    public final Targeting getTargeting$purchases_customEntitlementComputationRelease() {
        return this.targeting;
    }

    public int hashCode() {
        int i10;
        int i11;
        Offering offering = this.current;
        int i12 = 0;
        if (offering == null) {
            i10 = 0;
        } else {
            i10 = offering.hashCode();
        }
        int f6 = AbstractC6463a.f(this.all, i10 * 31, 31);
        Placements placements = this.placements;
        if (placements == null) {
            i11 = 0;
        } else {
            i11 = placements.hashCode();
        }
        int i13 = (f6 + i11) * 31;
        Targeting targeting = this.targeting;
        if (targeting != null) {
            i12 = targeting.hashCode();
        }
        return i13 + i12;
    }

    public String toString() {
        return "Offerings(current=" + this.current + ", all=" + this.all + ", placements=" + this.placements + ", targeting=" + this.targeting + ')';
    }

    public /* synthetic */ Offerings(Offering offering, Map map, Placements placements, Targeting targeting, int i10, g gVar) {
        this(offering, map, (i10 & 4) != 0 ? null : placements, (i10 & 8) != 0 ? null : targeting);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offerings(Offering offering, Map<String, Offering> map) {
        this(offering, map, null, null);
        AbstractC3557B.c0("all", map);
    }
}
