package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.utils.PriceExtensionsKt;
import id.AbstractC3557B;
import java.util.Locale;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u00a2\u0006\u0004\b5\u00106J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003\u00a2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\b'\u0010(R\u0017\u0010\u0013\u001a\u00020\u00078\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010\tR\u0017\u0010\u0014\u001a\u00020\n8\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\b,\u0010\fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b.\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00108\u0006\u00a2\u0006\f\n\u0004\b\u0016\u0010/\u001a\u0004\b0\u0010\u0012R\u0013\u00104\u001a\u0004\u0018\u0001018F\u00a2\u0006\u0006\u001a\u0004\b2\u00103\u00a8\u00067"}, d2 = {"Lcom/revenuecat/purchases/models/PricingPhase;", "Landroid/os/Parcelable;", "Ljava/util/Locale;", "locale", "", "formattedPriceInMonths", "(Ljava/util/Locale;)Ljava/lang/String;", "Lcom/revenuecat/purchases/models/Period;", "component1", "()Lcom/revenuecat/purchases/models/Period;", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "component2", "()Lcom/revenuecat/purchases/models/RecurrenceMode;", "", "component3", "()Ljava/lang/Integer;", "Lcom/revenuecat/purchases/models/Price;", "component4", "()Lcom/revenuecat/purchases/models/Price;", "billingPeriod", "recurrenceMode", "billingCycleCount", "price", "copy", "(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)Lcom/revenuecat/purchases/models/PricingPhase;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljf/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "getRecurrenceMode", "Ljava/lang/Integer;", "getBillingCycleCount", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "Lcom/revenuecat/purchases/models/OfferPaymentMode;", "getOfferPaymentMode", "()Lcom/revenuecat/purchases/models/OfferPaymentMode;", "offerPaymentMode", "<init>", "(Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/RecurrenceMode;Ljava/lang/Integer;Lcom/revenuecat/purchases/models/Price;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PricingPhase implements Parcelable {
    public static final Parcelable.Creator<PricingPhase> CREATOR = new Creator();
    private final Integer billingCycleCount;
    private final Period billingPeriod;
    private final Price price;
    private final RecurrenceMode recurrenceMode;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<PricingPhase> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PricingPhase createFromParcel(Parcel parcel) {
            AbstractC3557B.c0("parcel", parcel);
            return new PricingPhase(Period.CREATOR.createFromParcel(parcel), RecurrenceMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), Price.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PricingPhase[] newArray(int i10) {
            return new PricingPhase[i10];
        }
    }

    public PricingPhase(Period period, RecurrenceMode recurrenceMode, Integer num, Price price) {
        AbstractC3557B.c0("billingPeriod", period);
        AbstractC3557B.c0("recurrenceMode", recurrenceMode);
        AbstractC3557B.c0("price", price);
        this.billingPeriod = period;
        this.recurrenceMode = recurrenceMode;
        this.billingCycleCount = num;
        this.price = price;
    }

    public static /* synthetic */ PricingPhase copy$default(PricingPhase pricingPhase, Period period, RecurrenceMode recurrenceMode, Integer num, Price price, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            period = pricingPhase.billingPeriod;
        }
        if ((i10 & 2) != 0) {
            recurrenceMode = pricingPhase.recurrenceMode;
        }
        if ((i10 & 4) != 0) {
            num = pricingPhase.billingCycleCount;
        }
        if ((i10 & 8) != 0) {
            price = pricingPhase.price;
        }
        return pricingPhase.copy(period, recurrenceMode, num, price);
    }

    public static /* synthetic */ String formattedPriceInMonths$default(PricingPhase pricingPhase, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            AbstractC3557B.b0("getDefault()", locale);
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public final Period component1() {
        return this.billingPeriod;
    }

    public final RecurrenceMode component2() {
        return this.recurrenceMode;
    }

    public final Integer component3() {
        return this.billingCycleCount;
    }

    public final Price component4() {
        return this.price;
    }

    public final PricingPhase copy(Period period, RecurrenceMode recurrenceMode, Integer num, Price price) {
        AbstractC3557B.c0("billingPeriod", period);
        AbstractC3557B.c0("recurrenceMode", recurrenceMode);
        AbstractC3557B.c0("price", price);
        return new PricingPhase(period, recurrenceMode, num, price);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricingPhase)) {
            return false;
        }
        PricingPhase pricingPhase = (PricingPhase) obj;
        return AbstractC3557B.K(this.billingPeriod, pricingPhase.billingPeriod) && this.recurrenceMode == pricingPhase.recurrenceMode && AbstractC3557B.K(this.billingCycleCount, pricingPhase.billingCycleCount) && AbstractC3557B.K(this.price, pricingPhase.price);
    }

    public final String formattedPriceInMonths() {
        return formattedPriceInMonths$default(this, null, 1, null);
    }

    public final Integer getBillingCycleCount() {
        return this.billingCycleCount;
    }

    public final Period getBillingPeriod() {
        return this.billingPeriod;
    }

    public final OfferPaymentMode getOfferPaymentMode() {
        if (this.recurrenceMode != RecurrenceMode.FINITE_RECURRING) {
            return null;
        }
        if (this.price.getAmountMicros() == 0) {
            return OfferPaymentMode.FREE_TRIAL;
        }
        Integer num = this.billingCycleCount;
        if (num != null && num.intValue() == 1) {
            return OfferPaymentMode.SINGLE_PAYMENT;
        }
        Integer num2 = this.billingCycleCount;
        if (num2 == null || num2.intValue() <= 1) {
            return null;
        }
        return OfferPaymentMode.DISCOUNTED_RECURRING_PAYMENT;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final RecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public int hashCode() {
        int hashCode = (this.recurrenceMode.hashCode() + (this.billingPeriod.hashCode() * 31)) * 31;
        Integer num = this.billingCycleCount;
        return this.price.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        return "PricingPhase(billingPeriod=" + this.billingPeriod + ", recurrenceMode=" + this.recurrenceMode + ", billingCycleCount=" + this.billingCycleCount + ", price=" + this.price + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int intValue;
        AbstractC3557B.c0("out", parcel);
        this.billingPeriod.writeToParcel(parcel, i10);
        parcel.writeString(this.recurrenceMode.name());
        Integer num = this.billingCycleCount;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        this.price.writeToParcel(parcel, i10);
    }

    public final String formattedPriceInMonths(Locale locale) {
        AbstractC3557B.c0("locale", locale);
        return PriceExtensionsKt.pricePerMonth(this.price, this.billingPeriod, locale).getFormatted();
    }
}
