package com.revenuecat.purchases.amazon;

import R4.b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Map;
import jf.AbstractC3957g;
import kf.AbstractC4268D;
import kf.w;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00038@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonCache;", "", "", "", "receiptsToSkus", "Ljf/y;", "cacheSkusByToken", "(Ljava/util/Map;)V", "getReceiptSkus", "()Ljava/util/Map;", "token", "addSuccessfullyPostedToken", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "amazonPostedTokensKey$delegate", "Ljf/g;", "getAmazonPostedTokensKey$purchases_customEntitlementComputationRelease", "()Ljava/lang/String;", "amazonPostedTokensKey", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class AmazonCache {
    private final AbstractC3957g amazonPostedTokensKey$delegate = b.D1(new AmazonCache$amazonPostedTokensKey$2(this));
    private final DeviceCache deviceCache;

    public AmazonCache(DeviceCache deviceCache) {
        AbstractC3557B.c0("deviceCache", deviceCache);
        this.deviceCache = deviceCache;
    }

    public final synchronized void addSuccessfullyPostedToken(String str) {
        AbstractC3557B.c0("token", str);
        this.deviceCache.addSuccessfullyPostedToken(str);
    }

    public final synchronized void cacheSkusByToken(Map<String, String> map) {
        AbstractC3557B.c0("receiptsToSkus", map);
        LogWrapperKt.log(LogIntent.DEBUG, String.format(AmazonStrings.CACHING_RECEIPT_TERM_SKUS, Arrays.copyOf(new Object[]{map}, 1)));
        JSONObject jSONObject = new JSONObject(AbstractC4268D.e1(getReceiptSkus(), map));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("receiptsToSkus", jSONObject);
        DeviceCache deviceCache = this.deviceCache;
        String amazonPostedTokensKey$purchases_customEntitlementComputationRelease = getAmazonPostedTokensKey$purchases_customEntitlementComputationRelease();
        String jSONObject3 = jSONObject2.toString();
        AbstractC3557B.b0("jsonToCache.toString()", jSONObject3);
        deviceCache.putString(amazonPostedTokensKey$purchases_customEntitlementComputationRelease, jSONObject3);
    }

    public final String getAmazonPostedTokensKey$purchases_customEntitlementComputationRelease() {
        return (String) this.amazonPostedTokensKey$delegate.getValue();
    }

    public final synchronized Map<String, String> getReceiptSkus() {
        JSONObject jSONObject;
        Map<String, String> map;
        try {
            JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getAmazonPostedTokensKey$purchases_customEntitlementComputationRelease());
            if (jSONObjectOrNull != null) {
                jSONObject = jSONObjectOrNull.getJSONObject("receiptsToSkus");
            } else {
                jSONObject = null;
            }
            if (jSONObject == null || (map = JSONObjectExtensionsKt.toMap$default(jSONObject, false, 1, null)) == null) {
                map = w.f37484Y;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }
}
