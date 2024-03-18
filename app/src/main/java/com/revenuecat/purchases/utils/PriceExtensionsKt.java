package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import id.AbstractC3557B;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0002\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"MICRO_MULTIPLIER", "", "pricePerMonth", "Lcom/revenuecat/purchases/models/Price;", "billingPeriod", "Lcom/revenuecat/purchases/models/Period;", "locale", "Ljava/util/Locale;", "pricePerPeriod", "units", "pricePerWeek", "pricePerYear", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class PriceExtensionsKt {
    private static final double MICRO_MULTIPLIER = 1000000.0d;

    public static final Price pricePerMonth(Price price, Period period, Locale locale) {
        AbstractC3557B.c0("<this>", price);
        AbstractC3557B.c0("billingPeriod", period);
        AbstractC3557B.c0("locale", locale);
        return pricePerPeriod(price, period.getValueInMonths(), locale);
    }

    private static final Price pricePerPeriod(Price price, double d10, Locale locale) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(price.getCurrencyCode()));
        double amountMicros = price.getAmountMicros() / d10;
        String format = currencyInstance.format(amountMicros / 1000000.0d);
        AbstractC3557B.b0("formatted", format);
        return new Price(format, (long) amountMicros, price.getCurrencyCode());
    }

    public static final Price pricePerWeek(Price price, Period period, Locale locale) {
        AbstractC3557B.c0("<this>", price);
        AbstractC3557B.c0("billingPeriod", period);
        AbstractC3557B.c0("locale", locale);
        return pricePerPeriod(price, period.getValueInWeeks$purchases_customEntitlementComputationRelease(), locale);
    }

    public static final Price pricePerYear(Price price, Period period, Locale locale) {
        AbstractC3557B.c0("<this>", price);
        AbstractC3557B.c0("billingPeriod", period);
        AbstractC3557B.c0("locale", locale);
        return pricePerPeriod(price, period.getValueInYears$purchases_customEntitlementComputationRelease(), locale);
    }
}
