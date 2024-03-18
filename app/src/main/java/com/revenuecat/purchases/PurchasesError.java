package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u001d\u0010\u0016\u001a\u00020\u00028\u0006\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0014\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0004\u00a8\u0006\u001c"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/revenuecat/purchases/PurchasesErrorCode;", "code", "Lcom/revenuecat/purchases/PurchasesErrorCode;", "getCode", "()Lcom/revenuecat/purchases/PurchasesErrorCode;", "underlyingErrorMessage", "Ljava/lang/String;", "getUnderlyingErrorMessage", "message", "getMessage", "getMessage$annotations", "()V", "<init>", "(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesError implements Parcelable {
    public static final Parcelable.Creator<PurchasesError> CREATOR = new Creator();
    private final PurchasesErrorCode code;
    private final String message;
    private final String underlyingErrorMessage;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<PurchasesError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PurchasesError createFromParcel(Parcel parcel) {
            AbstractC3557B.c0("parcel", parcel);
            return new PurchasesError(PurchasesErrorCode.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PurchasesError[] newArray(int i10) {
            return new PurchasesError[i10];
        }
    }

    public PurchasesError(PurchasesErrorCode purchasesErrorCode, String str) {
        AbstractC3557B.c0("code", purchasesErrorCode);
        this.code = purchasesErrorCode;
        this.underlyingErrorMessage = str;
        this.message = purchasesErrorCode.getDescription();
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final PurchasesErrorCode getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getUnderlyingErrorMessage() {
        return this.underlyingErrorMessage;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PurchasesError(code=");
        sb2.append(this.code);
        sb2.append(", underlyingErrorMessage=");
        sb2.append(this.underlyingErrorMessage);
        sb2.append(", message='");
        return R.a.t(sb2, this.message, "')");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        parcel.writeString(this.code.name());
        parcel.writeString(this.underlyingErrorMessage);
    }

    public /* synthetic */ PurchasesError(PurchasesErrorCode purchasesErrorCode, String str, int i10, g gVar) {
        this(purchasesErrorCode, (i10 & 2) != 0 ? null : str);
    }
}
