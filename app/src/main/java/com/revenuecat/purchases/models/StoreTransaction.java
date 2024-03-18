package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.ProrationMode;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010,\u001a\u0004\u0018\u00010\n\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\r\u0012\u0006\u0010.\u001a\u00020\u0010\u0012\u0006\u0010/\u001a\u00020\u0013\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u00101\u001a\u00020\u0017\u0012\b\u00102\u001a\u0004\u0018\u00010\u0004\u0012\b\u00103\u001a\u0004\u0018\u00010\n\u0012\u0006\u00104\u001a\u00020\u001d\u0012\b\u00105\u001a\u0004\u0018\u00010 \u0012\b\u00106\u001a\u0004\u0018\u00010\n\u0012\u0006\u00107\u001a\u00020$\u0012\b\u00108\u001a\u0004\u0018\u00010\n\u0012\b\u00109\u001a\u0004\u0018\u00010\n\u0012\b\u0010:\u001a\u0004\u0018\u00010)\u00a2\u0006\u0004\bi\u0010jB\u0097\u0001\b\u0017\u0012\b\u0010,\u001a\u0004\u0018\u00010\n\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\r\u0012\u0006\u0010.\u001a\u00020\u0010\u0012\u0006\u0010/\u001a\u00020\u0013\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u00101\u001a\u00020\u0017\u0012\b\u00102\u001a\u0004\u0018\u00010\u0004\u0012\b\u00103\u001a\u0004\u0018\u00010\n\u0012\u0006\u00104\u001a\u00020\u001d\u0012\b\u0010e\u001a\u0004\u0018\u00010\n\u0012\b\u00106\u001a\u0004\u0018\u00010\n\u0012\u0006\u00107\u001a\u00020$\u0012\b\u00108\u001a\u0004\u0018\u00010\n\u0012\b\u00109\u001a\u0004\u0018\u00010\n\u0012\b\u0010:\u001a\u0004\u0018\u00010)\u00a2\u0006\u0004\bi\u0010kB\u0097\u0001\b\u0017\u0012\b\u0010,\u001a\u0004\u0018\u00010\n\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\r\u0012\u0006\u0010.\u001a\u00020\u0010\u0012\u0006\u0010/\u001a\u00020\u0013\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u00101\u001a\u00020\u0017\u0012\b\u00102\u001a\u0004\u0018\u00010\u0004\u0012\b\u00103\u001a\u0004\u0018\u00010\n\u0012\u0006\u00104\u001a\u00020\u001d\u0012\b\u0010e\u001a\u0004\u0018\u00010\n\u0012\b\u00106\u001a\u0004\u0018\u00010\n\u0012\u0006\u00107\u001a\u00020$\u0012\b\u00108\u001a\u0004\u0018\u00010\n\u0012\b\u00109\u001a\u0004\u0018\u00010\n\u0012\b\u0010b\u001a\u0004\u0018\u00010]\u00a2\u0006\u0004\bi\u0010lJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u0016\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u0017H\u00c6\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\b\u001c\u0010\fJ\u0010\u0010\u001e\u001a\u00020\u001dH\u00c6\u0003\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010 H\u00c6\u0003\u00a2\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\b#\u0010\fJ\u0010\u0010%\u001a\u00020$H\u00c6\u0003\u00a2\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\b'\u0010\fJ\u0012\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\b(\u0010\fJ\u0012\u0010*\u001a\u0004\u0018\u00010)H\u00c6\u0003\u00a2\u0006\u0004\b*\u0010+J\u00bc\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\r2\b\b\u0002\u0010.\u001a\u00020\u00102\b\b\u0002\u0010/\u001a\u00020\u00132\b\b\u0002\u00100\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\u00172\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n2\b\b\u0002\u00104\u001a\u00020\u001d2\n\b\u0002\u00105\u001a\u0004\u0018\u00010 2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\n2\b\b\u0002\u00107\u001a\u00020$2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010)H\u00c6\u0001\u00a2\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b=\u0010\fJ\u0010\u0010>\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\b>\u0010\tJ \u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\bC\u0010DR\u0019\u0010,\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\f\n\u0004\b,\u0010E\u001a\u0004\bF\u0010\fR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0006\u00a2\u0006\f\n\u0004\b-\u0010G\u001a\u0004\bH\u0010\u000fR\u0017\u0010.\u001a\u00020\u00108\u0006\u00a2\u0006\f\n\u0004\b.\u0010I\u001a\u0004\bJ\u0010\u0012R\u0017\u0010/\u001a\u00020\u00138\u0006\u00a2\u0006\f\n\u0004\b/\u0010K\u001a\u0004\bL\u0010\u0015R\u0017\u00100\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b0\u0010E\u001a\u0004\bM\u0010\fR\u0017\u00101\u001a\u00020\u00178\u0006\u00a2\u0006\f\n\u0004\b1\u0010N\u001a\u0004\bO\u0010\u0019R\u0019\u00102\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\f\n\u0004\b2\u0010P\u001a\u0004\b2\u0010\u001bR\u0019\u00103\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\f\n\u0004\b3\u0010E\u001a\u0004\bQ\u0010\fR\u0017\u00104\u001a\u00020\u001d8\u0006\u00a2\u0006\f\n\u0004\b4\u0010R\u001a\u0004\bS\u0010\u001fR\u0019\u00105\u001a\u0004\u0018\u00010 8\u0006\u00a2\u0006\f\n\u0004\b5\u0010T\u001a\u0004\bU\u0010\"R\u0019\u00106\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\f\n\u0004\b6\u0010E\u001a\u0004\bV\u0010\fR\u0017\u00107\u001a\u00020$8\u0006\u00a2\u0006\f\n\u0004\b7\u0010W\u001a\u0004\bX\u0010&R\u0019\u00108\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\f\n\u0004\b8\u0010E\u001a\u0004\bY\u0010\fR\u0019\u00109\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\f\n\u0004\b9\u0010E\u001a\u0004\bZ\u0010\fR\u0019\u0010:\u001a\u0004\u0018\u00010)8\u0006\u00a2\u0006\f\n\u0004\b:\u0010[\u001a\u0004\b\\\u0010+R\u001c\u0010b\u001a\u0004\u0018\u00010]8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b`\u0010a\u001a\u0004\b^\u0010_R\u001c\u0010e\u001a\u0004\u0018\u00010\n8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bd\u0010a\u001a\u0004\bc\u0010\fR \u0010h\u001a\b\u0012\u0004\u0012\u00020\n0\r8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bg\u0010a\u001a\u0004\bf\u0010\u000f\u00a8\u0006m"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "Landroid/os/Parcelable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/util/List;", "Lcom/revenuecat/purchases/ProductType;", "component3", "()Lcom/revenuecat/purchases/ProductType;", "", "component4", "()J", "component5", "Lcom/revenuecat/purchases/models/PurchaseState;", "component6", "()Lcom/revenuecat/purchases/models/PurchaseState;", "component7", "()Ljava/lang/Boolean;", "component8", "Lorg/json/JSONObject;", "component9", "()Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "component10", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "component11", "Lcom/revenuecat/purchases/models/PurchaseType;", "component12", "()Lcom/revenuecat/purchases/models/PurchaseType;", "component13", "component14", "Lcom/revenuecat/purchases/ReplacementMode;", "component15", "()Lcom/revenuecat/purchases/ReplacementMode;", "orderId", "productIds", "type", "purchaseTime", "purchaseToken", "purchaseState", "isAutoRenewing", "signature", "originalJson", "presentedOfferingContext", "storeUserID", "purchaseType", "marketplace", "subscriptionOptionId", "replacementMode", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)Lcom/revenuecat/purchases/models/StoreTransaction;", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOrderId", "Ljava/util/List;", "getProductIds", "Lcom/revenuecat/purchases/ProductType;", "getType", "J", "getPurchaseTime", "getPurchaseToken", "Lcom/revenuecat/purchases/models/PurchaseState;", "getPurchaseState", "Ljava/lang/Boolean;", "getSignature", "Lorg/json/JSONObject;", "getOriginalJson", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "getStoreUserID", "Lcom/revenuecat/purchases/models/PurchaseType;", "getPurchaseType", "getMarketplace", "getSubscriptionOptionId", "Lcom/revenuecat/purchases/ReplacementMode;", "getReplacementMode", "Lcom/revenuecat/purchases/ProrationMode;", "getProrationMode", "()Lcom/revenuecat/purchases/ProrationMode;", "getProrationMode$annotations", "()V", "prorationMode", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "presentedOfferingIdentifier", "getSkus", "getSkus$annotations", "skus", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)V", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)V", "(Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;JLjava/lang/String;Lcom/revenuecat/purchases/models/PurchaseState;Ljava/lang/Boolean;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchaseType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProrationMode;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class StoreTransaction implements Parcelable {
    public static final Parcelable.Creator<StoreTransaction> CREATOR = new Creator();
    private final Boolean isAutoRenewing;
    private final String marketplace;
    private final String orderId;
    private final JSONObject originalJson;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<String> productIds;
    private final PurchaseState purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final PurchaseType purchaseType;
    private final ReplacementMode replacementMode;
    private final String signature;
    private final String storeUserID;
    private final String subscriptionOptionId;
    private final ProductType type;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<StoreTransaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreTransaction createFromParcel(Parcel parcel) {
            Boolean bool;
            AbstractC3557B.c0("parcel", parcel);
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ProductType valueOf = ProductType.valueOf(parcel.readString());
            long readLong = parcel.readLong();
            String readString2 = parcel.readString();
            PurchaseState valueOf2 = PurchaseState.valueOf(parcel.readString());
            PresentedOfferingContext presentedOfferingContext = null;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString3 = parcel.readString();
            JSONObject create = JSONObjectParceler.INSTANCE.create(parcel);
            if (parcel.readInt() != 0) {
                presentedOfferingContext = PresentedOfferingContext.CREATOR.createFromParcel(parcel);
            }
            return new StoreTransaction(readString, createStringArrayList, valueOf, readLong, readString2, valueOf2, bool, readString3, create, presentedOfferingContext, parcel.readString(), PurchaseType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (ReplacementMode) parcel.readParcelable(StoreTransaction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreTransaction[] newArray(int i10) {
            return new StoreTransaction[i10];
        }
    }

    public StoreTransaction(String str, List<String> list, ProductType productType, long j6, String str2, PurchaseState purchaseState, Boolean bool, String str3, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext, String str4, PurchaseType purchaseType, String str5, String str6, ReplacementMode replacementMode) {
        AbstractC3557B.c0("productIds", list);
        AbstractC3557B.c0("type", productType);
        AbstractC3557B.c0("purchaseToken", str2);
        AbstractC3557B.c0("purchaseState", purchaseState);
        AbstractC3557B.c0("originalJson", jSONObject);
        AbstractC3557B.c0("purchaseType", purchaseType);
        this.orderId = str;
        this.productIds = list;
        this.type = productType;
        this.purchaseTime = j6;
        this.purchaseToken = str2;
        this.purchaseState = purchaseState;
        this.isAutoRenewing = bool;
        this.signature = str3;
        this.originalJson = jSONObject;
        this.presentedOfferingContext = presentedOfferingContext;
        this.storeUserID = str4;
        this.purchaseType = purchaseType;
        this.marketplace = str5;
        this.subscriptionOptionId = str6;
        this.replacementMode = replacementMode;
    }

    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public static /* synthetic */ void getProrationMode$annotations() {
    }

    public static /* synthetic */ void getSkus$annotations() {
    }

    public final String component1() {
        return this.orderId;
    }

    public final PresentedOfferingContext component10() {
        return this.presentedOfferingContext;
    }

    public final String component11() {
        return this.storeUserID;
    }

    public final PurchaseType component12() {
        return this.purchaseType;
    }

    public final String component13() {
        return this.marketplace;
    }

    public final String component14() {
        return this.subscriptionOptionId;
    }

    public final ReplacementMode component15() {
        return this.replacementMode;
    }

    public final List<String> component2() {
        return this.productIds;
    }

    public final ProductType component3() {
        return this.type;
    }

    public final long component4() {
        return this.purchaseTime;
    }

    public final String component5() {
        return this.purchaseToken;
    }

    public final PurchaseState component6() {
        return this.purchaseState;
    }

    public final Boolean component7() {
        return this.isAutoRenewing;
    }

    public final String component8() {
        return this.signature;
    }

    public final JSONObject component9() {
        return this.originalJson;
    }

    public final StoreTransaction copy(String str, List<String> list, ProductType productType, long j6, String str2, PurchaseState purchaseState, Boolean bool, String str3, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext, String str4, PurchaseType purchaseType, String str5, String str6, ReplacementMode replacementMode) {
        AbstractC3557B.c0("productIds", list);
        AbstractC3557B.c0("type", productType);
        AbstractC3557B.c0("purchaseToken", str2);
        AbstractC3557B.c0("purchaseState", purchaseState);
        AbstractC3557B.c0("originalJson", jSONObject);
        AbstractC3557B.c0("purchaseType", purchaseType);
        return new StoreTransaction(str, list, productType, j6, str2, purchaseState, bool, str3, jSONObject, presentedOfferingContext, str4, purchaseType, str5, str6, replacementMode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof StoreTransaction) && AbstractC3557B.K(new ComparableData(this), new ComparableData((StoreTransaction) obj))) {
            return true;
        }
        return false;
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final JSONObject getOriginalJson() {
        return this.originalJson;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    public final List<String> getProductIds() {
        return this.productIds;
    }

    public final ProrationMode getProrationMode() {
        GoogleReplacementMode googleReplacementMode;
        ReplacementMode replacementMode = this.replacementMode;
        if (replacementMode instanceof GoogleReplacementMode) {
            googleReplacementMode = (GoogleReplacementMode) replacementMode;
        } else {
            googleReplacementMode = null;
        }
        if (googleReplacementMode == null) {
            return null;
        }
        return googleReplacementMode.getAsGoogleProrationMode$purchases_customEntitlementComputationRelease();
    }

    public final PurchaseState getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final PurchaseType getPurchaseType() {
        return this.purchaseType;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final List<String> getSkus() {
        return this.productIds;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public final ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    public final Boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public String toString() {
        return "StoreTransaction(orderId=" + this.orderId + ", productIds=" + this.productIds + ", type=" + this.type + ", purchaseTime=" + this.purchaseTime + ", purchaseToken=" + this.purchaseToken + ", purchaseState=" + this.purchaseState + ", isAutoRenewing=" + this.isAutoRenewing + ", signature=" + this.signature + ", originalJson=" + this.originalJson + ", presentedOfferingContext=" + this.presentedOfferingContext + ", storeUserID=" + this.storeUserID + ", purchaseType=" + this.purchaseType + ", marketplace=" + this.marketplace + ", subscriptionOptionId=" + this.subscriptionOptionId + ", replacementMode=" + this.replacementMode + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        parcel.writeString(this.orderId);
        parcel.writeStringList(this.productIds);
        parcel.writeString(this.type.name());
        parcel.writeLong(this.purchaseTime);
        parcel.writeString(this.purchaseToken);
        parcel.writeString(this.purchaseState.name());
        Boolean bool = this.isAutoRenewing;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.signature);
        JSONObjectParceler.INSTANCE.write(this.originalJson, parcel, i10);
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        if (presentedOfferingContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            presentedOfferingContext.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.storeUserID);
        parcel.writeString(this.purchaseType.name());
        parcel.writeString(this.marketplace);
        parcel.writeString(this.subscriptionOptionId);
        parcel.writeParcelable(this.replacementMode, i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoreTransaction(String str, List<String> list, ProductType productType, long j6, String str2, PurchaseState purchaseState, Boolean bool, String str3, JSONObject jSONObject, String str4, String str5, PurchaseType purchaseType, String str6, String str7, ReplacementMode replacementMode) {
        this(str, list, productType, j6, str2, purchaseState, bool, str3, jSONObject, str4 != null ? new PresentedOfferingContext(str4) : null, str5, purchaseType, str6, str7, replacementMode);
        AbstractC3557B.c0("productIds", list);
        AbstractC3557B.c0("type", productType);
        AbstractC3557B.c0("purchaseToken", str2);
        AbstractC3557B.c0("purchaseState", purchaseState);
        AbstractC3557B.c0("originalJson", jSONObject);
        AbstractC3557B.c0("purchaseType", purchaseType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StoreTransaction(String str, List<String> list, ProductType productType, long j6, String str2, PurchaseState purchaseState, Boolean bool, String str3, JSONObject jSONObject, String str4, String str5, PurchaseType purchaseType, String str6, String str7, ProrationMode prorationMode) {
        this(str, list, productType, j6, str2, purchaseState, bool, str3, jSONObject, r14, str5, purchaseType, str6, str7, r0 != null ? r0.getAsGoogleReplacementMode$purchases_customEntitlementComputationRelease() : null);
        AbstractC3557B.c0("productIds", list);
        AbstractC3557B.c0("type", productType);
        AbstractC3557B.c0("purchaseToken", str2);
        AbstractC3557B.c0("purchaseState", purchaseState);
        AbstractC3557B.c0("originalJson", jSONObject);
        AbstractC3557B.c0("purchaseType", purchaseType);
        PresentedOfferingContext presentedOfferingContext = str4 != null ? new PresentedOfferingContext(str4) : null;
        GoogleProrationMode googleProrationMode = prorationMode instanceof GoogleProrationMode ? (GoogleProrationMode) prorationMode : null;
    }
}
