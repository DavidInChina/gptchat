package com.revenuecat.purchases;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.models.Transaction;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.AbstractC3957g;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.Metadata;
import org.json.JSONObject;
import r9.y;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b'\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002Bw\u0012\u0006\u0010*\u001a\u00020\u001a\u0012\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001d\u0012\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001d\u0012\u0006\u0010-\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\u0017\u0012\u0006\u0010/\u001a\u00020\u0006\u0012\u0006\u00100\u001a\u00020\u0004\u0012\b\u00101\u001a\u0004\u0018\u00010&\u0012\b\u00102\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u00103\u001a\u00020\u0003\u00a2\u0006\u0004\bs\u0010tJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u00c6\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001dH\u00c6\u0003\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001dH\u00c6\u0003\u00a2\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0017H\u00c6\u0003\u00a2\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b%\u0010\u0011J\u0012\u0010'\u001a\u0004\u0018\u00010&H\u00c6\u0003\u00a2\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\b)\u0010\"J\u0094\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u001a2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001d2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001d2\b\b\u0002\u0010-\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\u00172\b\b\u0002\u0010/\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u00010&2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00103\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\b6\u0010\u0019J \u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\b;\u0010<J+\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040>2\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001dH\u0002\u00a2\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0003H\u00c2\u0003\u00a2\u0006\u0004\bA\u0010BR\u0017\u0010*\u001a\u00020\u001a8\u0006\u00a2\u0006\f\n\u0004\b*\u0010C\u001a\u0004\bD\u0010\u001cR%\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001d8\u0006\u00a2\u0006\f\n\u0004\b+\u0010E\u001a\u0004\bF\u0010\u001fR%\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001d8\u0006\u00a2\u0006\f\n\u0004\b,\u0010E\u001a\u0004\bG\u0010\u001fR\u0017\u0010-\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b-\u0010H\u001a\u0004\bI\u0010\"R\u0017\u0010.\u001a\u00020\u00178\u0006\u00a2\u0006\f\n\u0004\b.\u0010J\u001a\u0004\bK\u0010\u0019R\u0017\u0010/\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b/\u0010H\u001a\u0004\bL\u0010\"R\u0017\u00100\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b0\u0010M\u001a\u0004\bN\u0010\u0011R\u0019\u00101\u001a\u0004\u0018\u00010&8\u0006\u00a2\u0006\f\n\u0004\b1\u0010O\u001a\u0004\bP\u0010(R\u0019\u00102\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\f\n\u0004\b2\u0010H\u001a\u0004\bQ\u0010\"R\u0014\u00103\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u0010RR'\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00040>8FX\u0086\u0084\u0002\u00a2\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u0010X\u001a\u0004\bU\u0010VR'\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00040>8FX\u0087\u0084\u0002\u00a2\u0006\u0012\n\u0004\bZ\u0010T\u0012\u0004\b\\\u0010X\u001a\u0004\b[\u0010VR'\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00040>8FX\u0086\u0084\u0002\u00a2\u0006\u0012\n\u0004\b^\u0010T\u0012\u0004\b`\u0010X\u001a\u0004\b_\u0010VR#\u0010e\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002\u00a2\u0006\u0012\n\u0004\bb\u0010T\u0012\u0004\bd\u0010X\u001a\u0004\bc\u0010\"R'\u0010l\u001a\b\u0012\u0004\u0012\u00020g0f8FX\u0086\u0084\u0002\u00a2\u0006\u0012\n\u0004\bh\u0010T\u0012\u0004\bk\u0010X\u001a\u0004\bi\u0010jR\"\u0010n\u001a\n m*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004\u00a2\u0006\f\n\u0004\bn\u0010R\u0012\u0004\bo\u0010XR\u001a\u0010r\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\f\u0012\u0004\bq\u0010X\u001a\u0004\bp\u0010B\u00a8\u0006u"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/RawDataContainer;", "Lorg/json/JSONObject;", "", ProxyAmazonBillingActivity.EXTRAS_SKU, "Ljava/util/Date;", "getExpirationDateForSku", "(Ljava/lang/String;)Ljava/util/Date;", "productId", "getExpirationDateForProductId", "getPurchaseDateForSku", "getPurchaseDateForProductId", "entitlement", "getExpirationDateForEntitlement", "getPurchaseDateForEntitlement", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/revenuecat/purchases/EntitlementInfos;", "component1", "()Lcom/revenuecat/purchases/EntitlementInfos;", "", "component2", "()Ljava/util/Map;", "component3", "component4", "()Ljava/util/Date;", "component5", "component6", "component7", "Landroid/net/Uri;", "component8", "()Landroid/net/Uri;", "component9", CustomerInfoResponseJsonKeys.ENTITLEMENTS, "allExpirationDatesByProduct", "allPurchaseDatesByProduct", "requestDate", "schemaVersion", "firstSeen", "originalAppUserId", "managementURL", "originalPurchaseDate", "jsonObject", "copy", "(Lcom/revenuecat/purchases/EntitlementInfos;Ljava/util/Map;Ljava/util/Map;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;Lorg/json/JSONObject;)Lcom/revenuecat/purchases/CustomerInfo;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "expirations", "", "activeIdentifiers", "(Ljava/util/Map;)Ljava/util/Set;", "component10", "()Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/EntitlementInfos;", "getEntitlements", "Ljava/util/Map;", "getAllExpirationDatesByProduct", "getAllPurchaseDatesByProduct", "Ljava/util/Date;", "getRequestDate", TokenNames.f24313I, "getSchemaVersion", "getFirstSeen", "Ljava/lang/String;", "getOriginalAppUserId", "Landroid/net/Uri;", "getManagementURL", "getOriginalPurchaseDate", "Lorg/json/JSONObject;", "activeSubscriptions$delegate", "Ljf/g;", "getActiveSubscriptions", "()Ljava/util/Set;", "getActiveSubscriptions$annotations", "()V", "activeSubscriptions", "allPurchasedSkus$delegate", "getAllPurchasedSkus", "getAllPurchasedSkus$annotations", "allPurchasedSkus", "allPurchasedProductIds$delegate", "getAllPurchasedProductIds", "getAllPurchasedProductIds$annotations", "allPurchasedProductIds", "latestExpirationDate$delegate", "getLatestExpirationDate", "getLatestExpirationDate$annotations", "latestExpirationDate", "", "Lcom/revenuecat/purchases/models/Transaction;", "nonSubscriptionTransactions$delegate", "getNonSubscriptionTransactions", "()Ljava/util/List;", "getNonSubscriptionTransactions$annotations", "nonSubscriptionTransactions", "kotlin.jvm.PlatformType", "subscriberJSONObject", "getSubscriberJSONObject$annotations", "getRawData", "getRawData$annotations", "rawData", "<init>", "(Lcom/revenuecat/purchases/EntitlementInfos;Ljava/util/Map;Ljava/util/Map;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Date;Lorg/json/JSONObject;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CustomerInfo implements Parcelable, RawDataContainer<JSONObject> {
    public static final Parcelable.Creator<CustomerInfo> CREATOR = new Creator();
    private final Map<String, Date> allExpirationDatesByProduct;
    private final Map<String, Date> allPurchaseDatesByProduct;
    private final EntitlementInfos entitlements;
    private final Date firstSeen;
    private final JSONObject jsonObject;
    private final Uri managementURL;
    private final String originalAppUserId;
    private final Date originalPurchaseDate;
    private final Date requestDate;
    private final int schemaVersion;
    private final JSONObject subscriberJSONObject;
    private final AbstractC3957g activeSubscriptions$delegate = R4.b.D1(new CustomerInfo$activeSubscriptions$2(this));
    private final AbstractC3957g allPurchasedSkus$delegate = R4.b.D1(new CustomerInfo$allPurchasedSkus$2(this));
    private final AbstractC3957g allPurchasedProductIds$delegate = R4.b.D1(new CustomerInfo$allPurchasedProductIds$2(this));
    private final AbstractC3957g latestExpirationDate$delegate = R4.b.D1(new CustomerInfo$latestExpirationDate$2(this));
    private final AbstractC3957g nonSubscriptionTransactions$delegate = R4.b.D1(new CustomerInfo$nonSubscriptionTransactions$2(this));

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CustomerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerInfo createFromParcel(Parcel parcel) {
            AbstractC3557B.c0("parcel", parcel);
            EntitlementInfos createFromParcel = EntitlementInfos.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                linkedHashMap.put(parcel.readString(), parcel.readSerializable());
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                linkedHashMap2.put(parcel.readString(), parcel.readSerializable());
            }
            return new CustomerInfo(createFromParcel, linkedHashMap, linkedHashMap2, (Date) parcel.readSerializable(), parcel.readInt(), (Date) parcel.readSerializable(), parcel.readString(), (Uri) parcel.readParcelable(CustomerInfo.class.getClassLoader()), (Date) parcel.readSerializable(), JSONObjectParceler.INSTANCE.create(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerInfo[] newArray(int i10) {
            return new CustomerInfo[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerInfo(EntitlementInfos entitlementInfos, Map<String, ? extends Date> map, Map<String, ? extends Date> map2, Date date, int i10, Date date2, String str, Uri uri, Date date3, JSONObject jSONObject) {
        AbstractC3557B.c0(CustomerInfoResponseJsonKeys.ENTITLEMENTS, entitlementInfos);
        AbstractC3557B.c0("allExpirationDatesByProduct", map);
        AbstractC3557B.c0("allPurchaseDatesByProduct", map2);
        AbstractC3557B.c0("requestDate", date);
        AbstractC3557B.c0("firstSeen", date2);
        AbstractC3557B.c0("originalAppUserId", str);
        AbstractC3557B.c0("jsonObject", jSONObject);
        this.entitlements = entitlementInfos;
        this.allExpirationDatesByProduct = map;
        this.allPurchaseDatesByProduct = map2;
        this.requestDate = date;
        this.schemaVersion = i10;
        this.firstSeen = date2;
        this.originalAppUserId = str;
        this.managementURL = uri;
        this.originalPurchaseDate = date3;
        this.jsonObject = jSONObject;
        this.subscriberJSONObject = jSONObject.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIBER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> activeIdentifiers(Map<String, ? extends Date> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Date> entry : map.entrySet()) {
            if (DateHelper.Companion.m66isDateActiveSxA4cEA$default(DateHelper.Companion, entry.getValue(), this.requestDate, 0L, 4, null).isActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    private final JSONObject component10() {
        return this.jsonObject;
    }

    public static /* synthetic */ void getActiveSubscriptions$annotations() {
    }

    public static /* synthetic */ void getAllPurchasedProductIds$annotations() {
    }

    public static /* synthetic */ void getAllPurchasedSkus$annotations() {
    }

    public static /* synthetic */ void getLatestExpirationDate$annotations() {
    }

    public static /* synthetic */ void getNonSubscriptionTransactions$annotations() {
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    private static /* synthetic */ void getSubscriberJSONObject$annotations() {
    }

    public final EntitlementInfos component1() {
        return this.entitlements;
    }

    public final Map<String, Date> component2() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> component3() {
        return this.allPurchaseDatesByProduct;
    }

    public final Date component4() {
        return this.requestDate;
    }

    public final int component5() {
        return this.schemaVersion;
    }

    public final Date component6() {
        return this.firstSeen;
    }

    public final String component7() {
        return this.originalAppUserId;
    }

    public final Uri component8() {
        return this.managementURL;
    }

    public final Date component9() {
        return this.originalPurchaseDate;
    }

    public final CustomerInfo copy(EntitlementInfos entitlementInfos, Map<String, ? extends Date> map, Map<String, ? extends Date> map2, Date date, int i10, Date date2, String str, Uri uri, Date date3, JSONObject jSONObject) {
        AbstractC3557B.c0(CustomerInfoResponseJsonKeys.ENTITLEMENTS, entitlementInfos);
        AbstractC3557B.c0("allExpirationDatesByProduct", map);
        AbstractC3557B.c0("allPurchaseDatesByProduct", map2);
        AbstractC3557B.c0("requestDate", date);
        AbstractC3557B.c0("firstSeen", date2);
        AbstractC3557B.c0("originalAppUserId", str);
        AbstractC3557B.c0("jsonObject", jSONObject);
        return new CustomerInfo(entitlementInfos, map, map2, date, i10, date2, str, uri, date3, jSONObject);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof CustomerInfo) && AbstractC3557B.K(new ComparableData(this), new ComparableData((CustomerInfo) obj))) {
            return true;
        }
        return false;
    }

    public final Set<String> getActiveSubscriptions() {
        return (Set) this.activeSubscriptions$delegate.getValue();
    }

    public final Map<String, Date> getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final Set<String> getAllPurchasedProductIds() {
        return (Set) this.allPurchasedProductIds$delegate.getValue();
    }

    public final Set<String> getAllPurchasedSkus() {
        return (Set) this.allPurchasedSkus$delegate.getValue();
    }

    public final EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final Date getExpirationDateForEntitlement(String str) {
        AbstractC3557B.c0("entitlement", str);
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(str);
        if (entitlementInfo != null) {
            return entitlementInfo.getExpirationDate();
        }
        return null;
    }

    public final Date getExpirationDateForProductId(String str) {
        AbstractC3557B.c0("productId", str);
        return this.allExpirationDatesByProduct.get(str);
    }

    public final Date getExpirationDateForSku(String str) {
        AbstractC3557B.c0(ProxyAmazonBillingActivity.EXTRAS_SKU, str);
        return this.allExpirationDatesByProduct.get(str);
    }

    public final Date getFirstSeen() {
        return this.firstSeen;
    }

    public final Date getLatestExpirationDate() {
        return (Date) this.latestExpirationDate$delegate.getValue();
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final List<Transaction> getNonSubscriptionTransactions() {
        return (List) this.nonSubscriptionTransactions$delegate.getValue();
    }

    public final String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final Date getPurchaseDateForEntitlement(String str) {
        AbstractC3557B.c0("entitlement", str);
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(str);
        if (entitlementInfo != null) {
            return entitlementInfo.getLatestPurchaseDate();
        }
        return null;
    }

    public final Date getPurchaseDateForProductId(String str) {
        AbstractC3557B.c0("productId", str);
        return this.allPurchaseDatesByProduct.get(str);
    }

    public final Date getPurchaseDateForSku(String str) {
        AbstractC3557B.c0(ProxyAmazonBillingActivity.EXTRAS_SKU, str);
        return this.allPurchaseDatesByProduct.get(str);
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<CustomerInfo\n latestExpirationDate: ");
        sb2.append(getLatestExpirationDate());
        sb2.append("\nactiveSubscriptions:  ");
        Set<String> activeSubscriptions = getActiveSubscriptions();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(activeSubscriptions, 10));
        for (String str : activeSubscriptions) {
            arrayList.add(new C3959i(str, P4.a.o0(new C3959i("expiresDate", getExpirationDateForProductId(str)))));
        }
        sb2.append(AbstractC4268D.k1(arrayList));
        sb2.append(",\nactiveEntitlements: ");
        Map<String, EntitlementInfo> active = this.entitlements.getActive();
        ArrayList arrayList2 = new ArrayList(active.size());
        for (Map.Entry<String, EntitlementInfo> entry : active.entrySet()) {
            arrayList2.add(entry.toString());
        }
        sb2.append(arrayList2);
        sb2.append(",\nentitlements: ");
        Map<String, EntitlementInfo> all = this.entitlements.getAll();
        ArrayList arrayList3 = new ArrayList(all.size());
        for (Map.Entry<String, EntitlementInfo> entry2 : all.entrySet()) {
            arrayList3.add(entry2.toString());
        }
        sb2.append(arrayList3);
        sb2.append(",\nnonSubscriptionTransactions: ");
        sb2.append(getNonSubscriptionTransactions());
        sb2.append(",\nrequestDate: ");
        sb2.append(this.requestDate);
        sb2.append("\n>");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        this.entitlements.writeToParcel(parcel, i10);
        Map<String, Date> map = this.allExpirationDatesByProduct;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeSerializable(entry.getValue());
        }
        Map<String, Date> map2 = this.allPurchaseDatesByProduct;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, Date> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeSerializable(entry2.getValue());
        }
        parcel.writeSerializable(this.requestDate);
        parcel.writeInt(this.schemaVersion);
        parcel.writeSerializable(this.firstSeen);
        parcel.writeString(this.originalAppUserId);
        parcel.writeParcelable(this.managementURL, i10);
        parcel.writeSerializable(this.originalPurchaseDate);
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, i10);
    }

    @Override // com.revenuecat.purchases.models.RawDataContainer
    public JSONObject getRawData() {
        return this.jsonObject;
    }
}
