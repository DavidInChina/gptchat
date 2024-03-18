package com.revenuecat.purchases.models;

import E9.f;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import id.AbstractC3557B;
import java.util.Date;
import kotlin.Metadata;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\b\u00a2\u0006\u0004\b,\u0010-B\u0019\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020.\u00a2\u0006\u0004\b,\u00100J\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\t\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\nJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010\u0004R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\f\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0004R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b'\u0010\u0004R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\"\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0004R\u0017\u0010\u000f\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010\n\u00a8\u00061"}, d2 = {"Lcom/revenuecat/purchases/models/Transaction;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "Ljava/util/Date;", "component5", "()Ljava/util/Date;", "transactionIdentifier", "revenuecatId", "productIdentifier", "productId", "purchaseDate", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)Lcom/revenuecat/purchases/models/Transaction;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTransactionIdentifier", "getRevenuecatId", "getRevenuecatId$annotations", "()V", "getProductIdentifier", "getProductId", "getProductId$annotations", "Ljava/util/Date;", "getPurchaseDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "Lorg/json/JSONObject;", "jsonObject", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Transaction implements Parcelable {
    public static final Parcelable.Creator<Transaction> CREATOR = new Creator();
    private final String productId;
    private final String productIdentifier;
    private final Date purchaseDate;
    private final String revenuecatId;
    private final String transactionIdentifier;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<Transaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction createFromParcel(Parcel parcel) {
            AbstractC3557B.c0("parcel", parcel);
            return new Transaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction[] newArray(int i10) {
            return new Transaction[i10];
        }
    }

    public Transaction(String str, String str2, String str3, String str4, Date date) {
        AbstractC3557B.c0("transactionIdentifier", str);
        AbstractC3557B.c0("revenuecatId", str2);
        AbstractC3557B.c0("productIdentifier", str3);
        AbstractC3557B.c0("productId", str4);
        AbstractC3557B.c0("purchaseDate", date);
        this.transactionIdentifier = str;
        this.revenuecatId = str2;
        this.productIdentifier = str3;
        this.productId = str4;
        this.purchaseDate = date;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, String str, String str2, String str3, String str4, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transaction.transactionIdentifier;
        }
        if ((i10 & 2) != 0) {
            str2 = transaction.revenuecatId;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = transaction.productIdentifier;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = transaction.productId;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            date = transaction.purchaseDate;
        }
        return transaction.copy(str, str5, str6, str7, date);
    }

    public static /* synthetic */ void getProductId$annotations() {
    }

    public static /* synthetic */ void getRevenuecatId$annotations() {
    }

    public final String component1() {
        return this.transactionIdentifier;
    }

    public final String component2() {
        return this.revenuecatId;
    }

    public final String component3() {
        return this.productIdentifier;
    }

    public final String component4() {
        return this.productId;
    }

    public final Date component5() {
        return this.purchaseDate;
    }

    public final Transaction copy(String str, String str2, String str3, String str4, Date date) {
        AbstractC3557B.c0("transactionIdentifier", str);
        AbstractC3557B.c0("revenuecatId", str2);
        AbstractC3557B.c0("productIdentifier", str3);
        AbstractC3557B.c0("productId", str4);
        AbstractC3557B.c0("purchaseDate", date);
        return new Transaction(str, str2, str3, str4, date);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return AbstractC3557B.K(this.transactionIdentifier, transaction.transactionIdentifier) && AbstractC3557B.K(this.revenuecatId, transaction.revenuecatId) && AbstractC3557B.K(this.productIdentifier, transaction.productIdentifier) && AbstractC3557B.K(this.productId, transaction.productId) && AbstractC3557B.K(this.purchaseDate, transaction.purchaseDate);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final String getRevenuecatId() {
        return this.revenuecatId;
    }

    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public int hashCode() {
        return this.purchaseDate.hashCode() + f.v(this.productId, f.v(this.productIdentifier, f.v(this.revenuecatId, this.transactionIdentifier.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        return "Transaction(transactionIdentifier=" + this.transactionIdentifier + ", revenuecatId=" + this.revenuecatId + ", productIdentifier=" + this.productIdentifier + ", productId=" + this.productId + ", purchaseDate=" + this.purchaseDate + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        parcel.writeString(this.transactionIdentifier);
        parcel.writeString(this.revenuecatId);
        parcel.writeString(this.productIdentifier);
        parcel.writeString(this.productId);
        parcel.writeSerializable(this.purchaseDate);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Transaction(String str, JSONObject jSONObject) {
        this(r2, r3, str, str, JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date"));
        AbstractC3557B.c0("productId", str);
        AbstractC3557B.c0("jsonObject", jSONObject);
        String string = jSONObject.getString(ParameterNames.ID);
        AbstractC3557B.b0("jsonObject.getString(\"id\")", string);
        String string2 = jSONObject.getString(ParameterNames.ID);
        AbstractC3557B.b0("jsonObject.getString(\"id\")", string2);
    }
}
