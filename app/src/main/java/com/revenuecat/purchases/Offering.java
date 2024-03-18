package com.revenuecat.purchases;

import E9.f;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import jf.AbstractC3957g;
import k6.AbstractC4194d;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import y.AbstractC6463a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0014\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\bK\u0010LJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0004\b\f\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u00c6\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001cJV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001aH\u00c6\u0001\u00a2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b#\u0010\u0012J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\u00078\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0012R\u0017\u0010\u001d\u001a\u00020\u00078\u0006\u00a2\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b-\u0010\u0012R#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00148\u0006\u00a2\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b/\u0010\u0016R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0006\u00a2\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b1\u0010\u0019R\u0019\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006\u00a2\u0006\f\n\u0004\b \u00102\u001a\u0004\b3\u0010\u001cR\u001d\u00108\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010;\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R\u001d\u0010>\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u00107R\u001d\u0010A\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u00107R\u001d\u0010D\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bB\u00105\u001a\u0004\bC\u00107R\u001d\u0010G\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bE\u00105\u001a\u0004\bF\u00107R\u001d\u0010J\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bH\u00105\u001a\u0004\bI\u00107\u00a8\u0006M"}, d2 = {"Lcom/revenuecat/purchases/Offering;", "", "Lcom/revenuecat/purchases/PackageType;", "packageType", "Lcom/revenuecat/purchases/Package;", "findPackage", "(Lcom/revenuecat/purchases/PackageType;)Lcom/revenuecat/purchases/Package;", "", "s", "get", "(Ljava/lang/String;)Lcom/revenuecat/purchases/Package;", "identifier", "getPackage", SubscriberAttributeKt.JSON_NAME_KEY, "default", "getMetadataString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()Ljava/util/Map;", "", "component4", "()Ljava/util/List;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "component5", "()Lcom/revenuecat/purchases/paywalls/PaywallData;", "serverDescription", "metadata", "availablePackages", "paywall", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/paywalls/PaywallData;)Lcom/revenuecat/purchases/Offering;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getServerDescription", "Ljava/util/Map;", "getMetadata", "Ljava/util/List;", "getAvailablePackages", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "getPaywall", "lifetime$delegate", "Ljf/g;", "getLifetime", "()Lcom/revenuecat/purchases/Package;", "lifetime", "annual$delegate", "getAnnual", "annual", "sixMonth$delegate", "getSixMonth", "sixMonth", "threeMonth$delegate", "getThreeMonth", "threeMonth", "twoMonth$delegate", "getTwoMonth", "twoMonth", "monthly$delegate", "getMonthly", "monthly", "weekly$delegate", "getWeekly", "weekly", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/paywalls/PaywallData;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Offering {
    private final AbstractC3957g annual$delegate;
    private final List<Package> availablePackages;
    private final String identifier;
    private final AbstractC3957g lifetime$delegate;
    private final Map<String, Object> metadata;
    private final AbstractC3957g monthly$delegate;
    private final PaywallData paywall;
    private final String serverDescription;
    private final AbstractC3957g sixMonth$delegate;
    private final AbstractC3957g threeMonth$delegate;
    private final AbstractC3957g twoMonth$delegate;
    private final AbstractC3957g weekly$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offering(String str, String str2, Map<String, ? extends Object> map, List<Package> list) {
        this(str, str2, map, list, null, 16, null);
        AbstractC3557B.c0("identifier", str);
        AbstractC3557B.c0("serverDescription", str2);
        AbstractC3557B.c0("metadata", map);
        AbstractC3557B.c0("availablePackages", list);
    }

    public static /* synthetic */ Offering copy$default(Offering offering, String str, String str2, Map map, List list, PaywallData paywallData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = offering.identifier;
        }
        if ((i10 & 2) != 0) {
            str2 = offering.serverDescription;
        }
        String str3 = str2;
        Map<String, Object> map2 = map;
        if ((i10 & 4) != 0) {
            map2 = offering.metadata;
        }
        Map map3 = map2;
        List<Package> list2 = list;
        if ((i10 & 8) != 0) {
            list2 = offering.availablePackages;
        }
        List list3 = list2;
        if ((i10 & 16) != 0) {
            paywallData = offering.paywall;
        }
        return offering.copy(str, str3, map3, list3, paywallData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Package findPackage(PackageType packageType) {
        Object obj;
        Iterator<T> it = this.availablePackages.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3557B.K(((Package) obj).getIdentifier(), packageType.getIdentifier())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Package) obj;
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component2() {
        return this.serverDescription;
    }

    public final Map<String, Object> component3() {
        return this.metadata;
    }

    public final List<Package> component4() {
        return this.availablePackages;
    }

    public final PaywallData component5() {
        return this.paywall;
    }

    public final Offering copy(String str, String str2, Map<String, ? extends Object> map, List<Package> list, PaywallData paywallData) {
        AbstractC3557B.c0("identifier", str);
        AbstractC3557B.c0("serverDescription", str2);
        AbstractC3557B.c0("metadata", map);
        AbstractC3557B.c0("availablePackages", list);
        return new Offering(str, str2, map, list, paywallData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) obj;
        return AbstractC3557B.K(this.identifier, offering.identifier) && AbstractC3557B.K(this.serverDescription, offering.serverDescription) && AbstractC3557B.K(this.metadata, offering.metadata) && AbstractC3557B.K(this.availablePackages, offering.availablePackages) && AbstractC3557B.K(this.paywall, offering.paywall);
    }

    public final Package get(String str) {
        AbstractC3557B.c0("s", str);
        return getPackage(str);
    }

    public final Package getAnnual() {
        return (Package) this.annual$delegate.getValue();
    }

    public final List<Package> getAvailablePackages() {
        return this.availablePackages;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime$delegate.getValue();
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final String getMetadataString(String str, String str2) {
        String str3;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC3557B.c0("default", str2);
        Object obj = this.metadata.get(str);
        if (obj instanceof String) {
            str3 = (String) obj;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    public final Package getMonthly() {
        return (Package) this.monthly$delegate.getValue();
    }

    public final Package getPackage(String str) {
        AbstractC3557B.c0("identifier", str);
        for (Package r12 : this.availablePackages) {
            if (AbstractC3557B.K(r12.getIdentifier(), str)) {
                return r12;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth$delegate.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth$delegate.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth$delegate.getValue();
    }

    public final Package getWeekly() {
        return (Package) this.weekly$delegate.getValue();
    }

    public int hashCode() {
        int i10;
        int s10 = AbstractC4194d.s(this.availablePackages, AbstractC6463a.f(this.metadata, f.v(this.serverDescription, this.identifier.hashCode() * 31, 31), 31), 31);
        PaywallData paywallData = this.paywall;
        if (paywallData == null) {
            i10 = 0;
        } else {
            i10 = paywallData.hashCode();
        }
        return s10 + i10;
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ')';
    }

    public Offering(String str, String str2, Map<String, ? extends Object> map, List<Package> list, PaywallData paywallData) {
        AbstractC3557B.c0("identifier", str);
        AbstractC3557B.c0("serverDescription", str2);
        AbstractC3557B.c0("metadata", map);
        AbstractC3557B.c0("availablePackages", list);
        this.identifier = str;
        this.serverDescription = str2;
        this.metadata = map;
        this.availablePackages = list;
        this.paywall = paywallData;
        this.lifetime$delegate = R4.b.D1(new Offering$lifetime$2(this));
        this.annual$delegate = R4.b.D1(new Offering$annual$2(this));
        this.sixMonth$delegate = R4.b.D1(new Offering$sixMonth$2(this));
        this.threeMonth$delegate = R4.b.D1(new Offering$threeMonth$2(this));
        this.twoMonth$delegate = R4.b.D1(new Offering$twoMonth$2(this));
        this.monthly$delegate = R4.b.D1(new Offering$monthly$2(this));
        this.weekly$delegate = R4.b.D1(new Offering$weekly$2(this));
    }

    public /* synthetic */ Offering(String str, String str2, Map map, List list, PaywallData paywallData, int i10, g gVar) {
        this(str, str2, map, list, (i10 & 16) != 0 ? null : paywallData);
    }
}
