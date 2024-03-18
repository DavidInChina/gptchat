package com.revenuecat.purchases.amazon;

import Lg.m;
import Lg.n;
import android.gov.nist.core.Separators;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import id.AbstractC3557B;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kf.t;
import kotlin.Metadata;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0004H\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"pattern", "Ljava/util/regex/Pattern;", "createPeriod", "Lcom/revenuecat/purchases/models/Period;", "", "createPrice", "Lcom/revenuecat/purchases/models/Price;", "marketplace", "parsePriceUsingRegex", "Ljava/math/BigDecimal;", "toStoreProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/amazon/device/iap/model/Product;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class StoreProductConversionsKt {
    private static final Pattern pattern;

    static {
        Pattern compile = Pattern.compile("(\\d+[[\\.,\\s]\\d+]*)");
        AbstractC3557B.b0("compile(\"(\\\\d+[[\\\\.,\\\\s]\\\\d+]*)\")", compile);
        pattern = compile;
    }

    public static final Period createPeriod(String str) {
        String str2;
        Integer W12;
        AbstractC3557B.c0("<this>", str);
        switch (str.hashCode()) {
            case -2115097178:
                if (str.equals("BiMonthly")) {
                    return new Period(2, Period.Unit.MONTH, "P2M");
                }
                break;
            case -1707840351:
                if (str.equals("Weekly")) {
                    return new Period(1, Period.Unit.WEEK, "P1W");
                }
                break;
            case -1393678355:
                if (str.equals("Monthly")) {
                    return new Period(1, Period.Unit.MONTH, "P1M");
                }
                break;
            case -580032564:
                if (str.equals("Annually")) {
                    return new Period(1, Period.Unit.YEAR, "P1Y");
                }
                break;
            case -308855462:
                if (str.equals("SemiAnnually")) {
                    return new Period(6, Period.Unit.MONTH, "P6M");
                }
                break;
            case 347098056:
                if (str.equals("BiWeekly")) {
                    return new Period(2, Period.Unit.WEEK, "P2W");
                }
                break;
            case 937940249:
                if (str.equals("Quarterly")) {
                    return new Period(3, Period.Unit.MONTH, "P3M");
                }
                break;
        }
        List G22 = n.G2(str, new String[]{Separators.SP});
        if (G22.size() != 2) {
            G22 = null;
        }
        if (G22 == null || (str2 = (String) t.h2(G22)) == null || (W12 = m.W1(str2)) == null) {
            return null;
        }
        int intValue = W12.intValue();
        CharSequence charSequence = (CharSequence) G22.get(1);
        AbstractC3557B.c0("<this>", charSequence);
        if (charSequence.length() != 0) {
            String valueOf = String.valueOf(charSequence.charAt(0));
            AbstractC3557B.a0("null cannot be cast to non-null type java.lang.String", valueOf);
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            AbstractC3557B.b0("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase);
            return Period.Factory.create("P" + intValue + upperCase);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Price createPrice(String str, String str2) {
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("marketplace", str2);
        BigDecimal parsePriceUsingRegex = parsePriceUsingRegex(str);
        if (parsePriceUsingRegex == null) {
            parsePriceUsingRegex = BigDecimal.ZERO;
        }
        AbstractC3557B.b0("priceNumeric", parsePriceUsingRegex);
        BigDecimal multiply = parsePriceUsingRegex.multiply(new BigDecimal((int) UtilsKt.MICROS_MULTIPLIER));
        AbstractC3557B.b0("this.multiply(other)", multiply);
        return new Price(str, multiply.longValue(), ISO3166Alpha2ToISO42170Converter.INSTANCE.convertOrEmpty(str2));
    }

    public static final BigDecimal parsePriceUsingRegex(String str) {
        Matcher matcher;
        AbstractC3557B.c0("<this>", str);
        Matcher matcher2 = pattern.matcher(str);
        if (matcher2.find()) {
            matcher = matcher2;
        } else {
            matcher = null;
        }
        if (matcher == null) {
            return null;
        }
        String group = matcher2.group();
        AbstractC3557B.b0("dirtyPrice", group);
        String obj = n.U2(n.A2(n.A2(n.A2(group, Separators.SP, ""), "\u00a0", ""), "\u00a0", "")).toString();
        List G22 = n.G2(obj, new String[]{Separators.DOT, Separators.COMMA});
        if (G22.size() != 1) {
            if (((String) t.o2(G22)).length() == 3) {
                obj = n.A2(n.A2(obj, Separators.DOT, ""), Separators.COMMA, "");
            } else {
                obj = t.m2(t.a2(G22), "", null, null, null, 62) + '.' + ((String) t.o2(G22));
            }
        }
        return new BigDecimal(n.U2(obj).toString());
    }

    public static final StoreProduct toStoreProduct(Product product, String str) {
        Period period;
        AbstractC3557B.c0("<this>", product);
        AbstractC3557B.c0("marketplace", str);
        Period period2 = null;
        if (product.getPrice() == null) {
            AbstractC2469q0.t(new Object[]{product.getSku()}, 1, AmazonStrings.PRODUCT_PRICE_MISSING, LogIntent.AMAZON_ERROR);
            return null;
        }
        String price = product.getPrice();
        AbstractC3557B.b0("price", price);
        Price createPrice = createPrice(price, str);
        String sku = product.getSku();
        AbstractC3557B.b0(ProxyAmazonBillingActivity.EXTRAS_SKU, sku);
        ProductType productType = product.getProductType();
        AbstractC3557B.b0("productType", productType);
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        String title = product.getTitle();
        AbstractC3557B.b0("title", title);
        String title2 = product.getTitle();
        AbstractC3557B.b0("title", title2);
        String description = product.getDescription();
        AbstractC3557B.b0("description", description);
        String subscriptionPeriod = product.getSubscriptionPeriod();
        if (subscriptionPeriod != null) {
            period = createPeriod(subscriptionPeriod);
        } else {
            period = null;
        }
        String smallIconUrl = product.getSmallIconUrl();
        AbstractC3557B.b0("smallIconUrl", smallIconUrl);
        String freeTrialPeriod = product.getFreeTrialPeriod();
        if (freeTrialPeriod != null) {
            period2 = createPeriod(freeTrialPeriod);
        }
        JSONObject json = product.toJSON();
        AbstractC3557B.b0("this.toJSON()", json);
        return new AmazonStoreProduct(sku, revenueCatProductType, title, title2, description, period, createPrice, (SubscriptionOptions) null, (SubscriptionOption) null, smallIconUrl, period2, json, (PresentedOfferingContext) null);
    }
}
