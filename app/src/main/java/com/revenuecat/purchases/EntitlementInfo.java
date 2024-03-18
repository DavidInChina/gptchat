package com.revenuecat.purchases;

import E9.f;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import id.AbstractC3557B;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0091\u0001\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\t\u0012\u0006\u0010+\u001a\u00020\t\u0012\u0006\u0010,\u001a\u00020\u0013\u0012\u0006\u0010-\u001a\u00020\u0016\u0012\u0006\u0010.\u001a\u00020\u0016\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u00100\u001a\u00020\u001b\u0012\u0006\u00101\u001a\u00020\u0004\u0012\b\u00102\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u00103\u001a\u00020\t\u0012\b\u00104\u001a\u0004\u0018\u00010\u0016\u0012\b\u00105\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u00106\u001a\u00020#\u0012\u0006\u00107\u001a\u00020\u0003\u0012\b\b\u0002\u00108\u001a\u00020&\u00a2\u0006\u0004\b]\u0010^B\u0089\u0001\b\u0017\u0012\u0006\u0010)\u001a\u00020\u0004\u0012\u0006\u0010*\u001a\u00020\t\u0012\u0006\u0010+\u001a\u00020\t\u0012\u0006\u0010,\u001a\u00020\u0013\u0012\u0006\u0010-\u001a\u00020\u0016\u0012\u0006\u0010.\u001a\u00020\u0016\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u00100\u001a\u00020\u001b\u0012\u0006\u00101\u001a\u00020\u0004\u0012\b\u00102\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u00103\u001a\u00020\t\u0012\b\u00104\u001a\u0004\u0018\u00010\u0016\u0012\b\u00105\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u00106\u001a\u00020#\u0012\u0006\u00107\u001a\u00020\u0003\u00a2\u0006\u0004\b]\u0010_J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u00c6\u0003\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0016H\u00c6\u0003\u00a2\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u001bH\u00c6\u0003\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u001e\u0010\u0006J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u001f\u0010\u0006J\u0010\u0010 \u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\b \u0010\u0011J\u0012\u0010!\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0004\b!\u0010\u0018J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0004\b\"\u0010\u0018J\u0010\u0010$\u001a\u00020#H\u00c6\u0003\u00a2\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&H\u00c6\u0003\u00a2\u0006\u0004\b'\u0010(J\u00b8\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020\u00132\b\b\u0002\u0010-\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\u00162\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u00100\u001a\u00020\u001b2\b\b\u0002\u00101\u001a\u00020\u00042\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u00103\u001a\u00020\t2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u00106\u001a\u00020#2\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020&H\u00c6\u0001\u00a2\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\fH\u00d6\u0001\u00a2\u0006\u0004\b;\u0010\u000eJ \u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\fH\u00d6\u0001\u00a2\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0003H\u00c2\u0003\u00a2\u0006\u0004\bB\u0010CR\u0017\u0010)\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b)\u0010D\u001a\u0004\bE\u0010\u0006R\u0017\u0010*\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b*\u0010F\u001a\u0004\b*\u0010\u0011R\u0017\u0010+\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b+\u0010F\u001a\u0004\bG\u0010\u0011R\u0017\u0010,\u001a\u00020\u00138\u0006\u00a2\u0006\f\n\u0004\b,\u0010H\u001a\u0004\bI\u0010\u0015R\u0017\u0010-\u001a\u00020\u00168\u0006\u00a2\u0006\f\n\u0004\b-\u0010J\u001a\u0004\bK\u0010\u0018R\u0017\u0010.\u001a\u00020\u00168\u0006\u00a2\u0006\f\n\u0004\b.\u0010J\u001a\u0004\bL\u0010\u0018R\u0019\u0010/\u001a\u0004\u0018\u00010\u00168\u0006\u00a2\u0006\f\n\u0004\b/\u0010J\u001a\u0004\bM\u0010\u0018R\u0017\u00100\u001a\u00020\u001b8\u0006\u00a2\u0006\f\n\u0004\b0\u0010N\u001a\u0004\bO\u0010\u001dR\u0017\u00101\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b1\u0010D\u001a\u0004\bP\u0010\u0006R\u0019\u00102\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\f\n\u0004\b2\u0010D\u001a\u0004\bQ\u0010\u0006R\u0017\u00103\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b3\u0010F\u001a\u0004\b3\u0010\u0011R\u0019\u00104\u001a\u0004\u0018\u00010\u00168\u0006\u00a2\u0006\f\n\u0004\b4\u0010J\u001a\u0004\bR\u0010\u0018R\u0019\u00105\u001a\u0004\u0018\u00010\u00168\u0006\u00a2\u0006\f\n\u0004\b5\u0010J\u001a\u0004\bS\u0010\u0018R\u0017\u00106\u001a\u00020#8\u0006\u00a2\u0006\f\n\u0004\b6\u0010T\u001a\u0004\bU\u0010%R\u0014\u00107\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b7\u0010VR\u0017\u00108\u001a\u00020&8\u0006\u00a2\u0006\f\n\u0004\b8\u0010W\u001a\u0004\bX\u0010(R\u001a\u0010\\\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\f\u0012\u0004\bZ\u0010[\u001a\u0004\bY\u0010C\u00a8\u0006`"}, d2 = {"Lcom/revenuecat/purchases/EntitlementInfo;", "Landroid/os/Parcelable;", "Lcom/revenuecat/purchases/models/RawDataContainer;", "Lorg/json/JSONObject;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "component2", "()Z", "component3", "Lcom/revenuecat/purchases/PeriodType;", "component4", "()Lcom/revenuecat/purchases/PeriodType;", "Ljava/util/Date;", "component5", "()Ljava/util/Date;", "component6", "component7", "Lcom/revenuecat/purchases/Store;", "component8", "()Lcom/revenuecat/purchases/Store;", "component9", "component10", "component11", "component12", "component13", "Lcom/revenuecat/purchases/OwnershipType;", "component14", "()Lcom/revenuecat/purchases/OwnershipType;", "Lcom/revenuecat/purchases/VerificationResult;", "component16", "()Lcom/revenuecat/purchases/VerificationResult;", "identifier", "isActive", "willRenew", "periodType", "latestPurchaseDate", "originalPurchaseDate", "expirationDate", ProductResponseJsonKeys.STORE, "productIdentifier", "productPlanIdentifier", "isSandbox", "unsubscribeDetectedAt", "billingIssueDetectedAt", "ownershipType", "jsonObject", "verification", "copy", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lorg/json/JSONObject;Lcom/revenuecat/purchases/VerificationResult;)Lcom/revenuecat/purchases/EntitlementInfo;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component15", "()Lorg/json/JSONObject;", "Ljava/lang/String;", "getIdentifier", "Z", "getWillRenew", "Lcom/revenuecat/purchases/PeriodType;", "getPeriodType", "Ljava/util/Date;", "getLatestPurchaseDate", "getOriginalPurchaseDate", "getExpirationDate", "Lcom/revenuecat/purchases/Store;", "getStore", "getProductIdentifier", "getProductPlanIdentifier", "getUnsubscribeDetectedAt", "getBillingIssueDetectedAt", "Lcom/revenuecat/purchases/OwnershipType;", "getOwnershipType", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/VerificationResult;", "getVerification", "getRawData", "getRawData$annotations", "()V", "rawData", "<init>", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lorg/json/JSONObject;Lcom/revenuecat/purchases/VerificationResult;)V", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/PeriodType;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/Store;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lcom/revenuecat/purchases/OwnershipType;Lorg/json/JSONObject;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class EntitlementInfo implements Parcelable, RawDataContainer<JSONObject> {
    public static final Parcelable.Creator<EntitlementInfo> CREATOR = new Creator();
    private final Date billingIssueDetectedAt;
    private final Date expirationDate;
    private final String identifier;
    private final boolean isActive;
    private final boolean isSandbox;
    private final JSONObject jsonObject;
    private final Date latestPurchaseDate;
    private final Date originalPurchaseDate;
    private final OwnershipType ownershipType;
    private final PeriodType periodType;
    private final String productIdentifier;
    private final String productPlanIdentifier;
    private final Store store;
    private final Date unsubscribeDetectedAt;
    private final VerificationResult verification;
    private final boolean willRenew;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<EntitlementInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfo createFromParcel(Parcel parcel) {
            AbstractC3557B.c0("parcel", parcel);
            return new EntitlementInfo(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, PeriodType.valueOf(parcel.readString()), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), Store.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), OwnershipType.valueOf(parcel.readString()), JSONObjectParceler.INSTANCE.create(parcel), VerificationResult.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfo[] newArray(int i10) {
            return new EntitlementInfo[i10];
        }
    }

    public EntitlementInfo(String str, boolean z10, boolean z11, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, String str3, boolean z12, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject, VerificationResult verificationResult) {
        AbstractC3557B.c0("identifier", str);
        AbstractC3557B.c0("periodType", periodType);
        AbstractC3557B.c0("latestPurchaseDate", date);
        AbstractC3557B.c0("originalPurchaseDate", date2);
        AbstractC3557B.c0(ProductResponseJsonKeys.STORE, store);
        AbstractC3557B.c0("productIdentifier", str2);
        AbstractC3557B.c0("ownershipType", ownershipType);
        AbstractC3557B.c0("jsonObject", jSONObject);
        AbstractC3557B.c0("verification", verificationResult);
        this.identifier = str;
        this.isActive = z10;
        this.willRenew = z11;
        this.periodType = periodType;
        this.latestPurchaseDate = date;
        this.originalPurchaseDate = date2;
        this.expirationDate = date3;
        this.store = store;
        this.productIdentifier = str2;
        this.productPlanIdentifier = str3;
        this.isSandbox = z12;
        this.unsubscribeDetectedAt = date4;
        this.billingIssueDetectedAt = date5;
        this.ownershipType = ownershipType;
        this.jsonObject = jSONObject;
        this.verification = verificationResult;
    }

    private final JSONObject component15() {
        return this.jsonObject;
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    public final String component1() {
        return this.identifier;
    }

    public final String component10() {
        return this.productPlanIdentifier;
    }

    public final boolean component11() {
        return this.isSandbox;
    }

    public final Date component12() {
        return this.unsubscribeDetectedAt;
    }

    public final Date component13() {
        return this.billingIssueDetectedAt;
    }

    public final OwnershipType component14() {
        return this.ownershipType;
    }

    public final VerificationResult component16() {
        return this.verification;
    }

    public final boolean component2() {
        return this.isActive;
    }

    public final boolean component3() {
        return this.willRenew;
    }

    public final PeriodType component4() {
        return this.periodType;
    }

    public final Date component5() {
        return this.latestPurchaseDate;
    }

    public final Date component6() {
        return this.originalPurchaseDate;
    }

    public final Date component7() {
        return this.expirationDate;
    }

    public final Store component8() {
        return this.store;
    }

    public final String component9() {
        return this.productIdentifier;
    }

    public final EntitlementInfo copy(String str, boolean z10, boolean z11, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, String str3, boolean z12, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject, VerificationResult verificationResult) {
        AbstractC3557B.c0("identifier", str);
        AbstractC3557B.c0("periodType", periodType);
        AbstractC3557B.c0("latestPurchaseDate", date);
        AbstractC3557B.c0("originalPurchaseDate", date2);
        AbstractC3557B.c0(ProductResponseJsonKeys.STORE, store);
        AbstractC3557B.c0("productIdentifier", str2);
        AbstractC3557B.c0("ownershipType", ownershipType);
        AbstractC3557B.c0("jsonObject", jSONObject);
        AbstractC3557B.c0("verification", verificationResult);
        return new EntitlementInfo(str, z10, z11, periodType, date, date2, date3, store, str2, str3, z12, date4, date5, ownershipType, jSONObject, verificationResult);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(EntitlementInfo.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfo", obj);
        EntitlementInfo entitlementInfo = (EntitlementInfo) obj;
        if (AbstractC3557B.K(this.identifier, entitlementInfo.identifier) && this.isActive == entitlementInfo.isActive && this.willRenew == entitlementInfo.willRenew && this.periodType == entitlementInfo.periodType && AbstractC3557B.K(this.latestPurchaseDate, entitlementInfo.latestPurchaseDate) && AbstractC3557B.K(this.originalPurchaseDate, entitlementInfo.originalPurchaseDate) && AbstractC3557B.K(this.expirationDate, entitlementInfo.expirationDate) && this.store == entitlementInfo.store && AbstractC3557B.K(this.productIdentifier, entitlementInfo.productIdentifier) && AbstractC3557B.K(this.productPlanIdentifier, entitlementInfo.productPlanIdentifier) && this.isSandbox == entitlementInfo.isSandbox && AbstractC3557B.K(this.unsubscribeDetectedAt, entitlementInfo.unsubscribeDetectedAt) && AbstractC3557B.K(this.billingIssueDetectedAt, entitlementInfo.billingIssueDetectedAt) && this.ownershipType == entitlementInfo.ownershipType && this.verification == entitlementInfo.verification) {
            return true;
        }
        return false;
    }

    public final Date getBillingIssueDetectedAt() {
        return this.billingIssueDetectedAt;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Date getLatestPurchaseDate() {
        return this.latestPurchaseDate;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final OwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final PeriodType getPeriodType() {
        return this.periodType;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final String getProductPlanIdentifier() {
        return this.productPlanIdentifier;
    }

    public final Store getStore() {
        return this.store;
    }

    public final Date getUnsubscribeDetectedAt() {
        return this.unsubscribeDetectedAt;
    }

    public final VerificationResult getVerification() {
        return this.verification;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int hashCode = this.identifier.hashCode() * 31;
        int i15 = 1237;
        if (this.isActive) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i16 = (hashCode + i10) * 31;
        if (this.willRenew) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int hashCode2 = this.periodType.hashCode();
        int hashCode3 = (this.originalPurchaseDate.hashCode() + ((this.latestPurchaseDate.hashCode() + ((hashCode2 + ((i16 + i11) * 31)) * 31)) * 31)) * 31;
        Date date = this.expirationDate;
        int i17 = 0;
        if (date != null) {
            i12 = date.hashCode();
        } else {
            i12 = 0;
        }
        int v10 = f.v(this.productIdentifier, (this.store.hashCode() + ((hashCode3 + i12) * 31)) * 31, 31);
        String str = this.productPlanIdentifier;
        if (str != null) {
            i13 = str.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (v10 + i13) * 31;
        if (this.isSandbox) {
            i15 = 1231;
        }
        int i19 = (i18 + i15) * 31;
        Date date2 = this.unsubscribeDetectedAt;
        if (date2 != null) {
            i14 = date2.hashCode();
        } else {
            i14 = 0;
        }
        int i20 = (i19 + i14) * 31;
        Date date3 = this.billingIssueDetectedAt;
        if (date3 != null) {
            i17 = date3.hashCode();
        }
        return this.ownershipType.hashCode() + ((i20 + i17) * 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isSandbox() {
        return this.isSandbox;
    }

    public String toString() {
        return "EntitlementInfo(identifier='" + this.identifier + "', isActive=" + this.isActive + ", willRenew=" + this.willRenew + ", periodType=" + this.periodType + ", latestPurchaseDate=" + this.latestPurchaseDate + ", originalPurchaseDate=" + this.originalPurchaseDate + ", expirationDate=" + this.expirationDate + ", store=" + this.store + ", productIdentifier='" + this.productIdentifier + "', productPlanIdentifier='" + this.productPlanIdentifier + "', isSandbox=" + this.isSandbox + ", unsubscribeDetectedAt=" + this.unsubscribeDetectedAt + ", billingIssueDetectedAt=" + this.billingIssueDetectedAt + ", ownershipType=" + this.ownershipType + ", verification=" + this.verification + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        parcel.writeString(this.identifier);
        parcel.writeInt(this.isActive ? 1 : 0);
        parcel.writeInt(this.willRenew ? 1 : 0);
        parcel.writeString(this.periodType.name());
        parcel.writeSerializable(this.latestPurchaseDate);
        parcel.writeSerializable(this.originalPurchaseDate);
        parcel.writeSerializable(this.expirationDate);
        parcel.writeString(this.store.name());
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productPlanIdentifier);
        parcel.writeInt(this.isSandbox ? 1 : 0);
        parcel.writeSerializable(this.unsubscribeDetectedAt);
        parcel.writeSerializable(this.billingIssueDetectedAt);
        parcel.writeString(this.ownershipType.name());
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, i10);
        parcel.writeString(this.verification.name());
    }

    @Override // com.revenuecat.purchases.models.RawDataContainer
    public JSONObject getRawData() {
        return this.jsonObject;
    }

    public /* synthetic */ EntitlementInfo(String str, boolean z10, boolean z11, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, String str3, boolean z12, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject, VerificationResult verificationResult, int i10, g gVar) {
        this(str, z10, z11, periodType, date, date2, date3, store, str2, str3, z12, date4, date5, ownershipType, jSONObject, (i10 & 32768) != 0 ? VerificationResult.NOT_REQUESTED : verificationResult);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntitlementInfo(String str, boolean z10, boolean z11, PeriodType periodType, Date date, Date date2, Date date3, Store store, String str2, String str3, boolean z12, Date date4, Date date5, OwnershipType ownershipType, JSONObject jSONObject) {
        this(str, z10, z11, periodType, date, date2, date3, store, str2, str3, z12, date4, date5, ownershipType, jSONObject, VerificationResult.NOT_REQUESTED);
        AbstractC3557B.c0("identifier", str);
        AbstractC3557B.c0("periodType", periodType);
        AbstractC3557B.c0("latestPurchaseDate", date);
        AbstractC3557B.c0("originalPurchaseDate", date2);
        AbstractC3557B.c0(ProductResponseJsonKeys.STORE, store);
        AbstractC3557B.c0("productIdentifier", str2);
        AbstractC3557B.c0("ownershipType", ownershipType);
        AbstractC3557B.c0("jsonObject", jSONObject);
    }
}
