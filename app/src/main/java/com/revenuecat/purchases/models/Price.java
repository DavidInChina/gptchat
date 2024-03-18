package com.revenuecat.purchases.models;

import android.gov.nist.core.a;
import android.os.Parcel;
import android.os.Parcelable;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\b#\u0010$J\u0010\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\u0004J.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\"\u0010\u0004\u00a8\u0006%"}, d2 = {"Lcom/revenuecat/purchases/models/Price;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "", "component2", "()J", "component3", "formatted", "amountMicros", "currencyCode", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/revenuecat/purchases/models/Price;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFormatted", "J", "getAmountMicros", "getCurrencyCode", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Price implements Parcelable {
    public static final Parcelable.Creator<Price> CREATOR = new Creator();
    private final long amountMicros;
    private final String currencyCode;
    private final String formatted;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<Price> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            AbstractC3557B.c0("parcel", parcel);
            return new Price(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i10) {
            return new Price[i10];
        }
    }

    public Price(String str, long j6, String str2) {
        AbstractC3557B.c0("formatted", str);
        AbstractC3557B.c0("currencyCode", str2);
        this.formatted = str;
        this.amountMicros = j6;
        this.currencyCode = str2;
    }

    public static /* synthetic */ Price copy$default(Price price, String str, long j6, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = price.formatted;
        }
        if ((i10 & 2) != 0) {
            j6 = price.amountMicros;
        }
        if ((i10 & 4) != 0) {
            str2 = price.currencyCode;
        }
        return price.copy(str, j6, str2);
    }

    public final String component1() {
        return this.formatted;
    }

    public final long component2() {
        return this.amountMicros;
    }

    public final String component3() {
        return this.currencyCode;
    }

    public final Price copy(String str, long j6, String str2) {
        AbstractC3557B.c0("formatted", str);
        AbstractC3557B.c0("currencyCode", str2);
        return new Price(str, j6, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return AbstractC3557B.K(this.formatted, price.formatted) && this.amountMicros == price.amountMicros && AbstractC3557B.K(this.currencyCode, price.currencyCode);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public int hashCode() {
        long j6 = this.amountMicros;
        return this.currencyCode.hashCode() + (((this.formatted.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Price(formatted=");
        sb2.append(this.formatted);
        sb2.append(", amountMicros=");
        sb2.append(this.amountMicros);
        sb2.append(", currencyCode=");
        return a.n(sb2, this.currencyCode, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3557B.c0("out", parcel);
        parcel.writeString(this.formatted);
        parcel.writeLong(this.amountMicros);
        parcel.writeString(this.currencyCode);
    }
}
