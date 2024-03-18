package com.revenuecat.purchases.amazon.purchasing;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.amazon.device.iap.model.RequestId;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.common.LogUtilsKt;
import id.AbstractC3557B;
import java.util.Arrays;
import kotlin.Metadata;
import p1.AbstractC5042g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u001d\u0010\u0019J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Ljf/y;", "onCreate", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onDestroy", "(Landroid/app/Activity;)V", "Landroid/content/Intent;", "intent", "Lcom/amazon/device/iap/model/RequestId;", "startAmazonPurchase$purchases_customEntitlementComputationRelease", "(Landroid/content/Intent;)Lcom/amazon/device/iap/model/RequestId;", "startAmazonPurchase", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "broadcastReceiver", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "getBroadcastReceiver$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;", "setBroadcastReceiver$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivityBroadcastReceiver;)V", "getBroadcastReceiver$purchases_customEntitlementComputationRelease$annotations", "()V", "Landroid/content/IntentFilter;", "filter", "Landroid/content/IntentFilter;", "<init>", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProxyAmazonBillingDelegate {
    private /* synthetic */ ProxyAmazonBillingActivityBroadcastReceiver broadcastReceiver;
    private final IntentFilter filter = ProxyAmazonBillingActivityBroadcastReceiver.Companion.newPurchaseFinishedIntentFilter();

    public static /* synthetic */ void getBroadcastReceiver$purchases_customEntitlementComputationRelease$annotations() {
    }

    public final ProxyAmazonBillingActivityBroadcastReceiver getBroadcastReceiver$purchases_customEntitlementComputationRelease() {
        return this.broadcastReceiver;
    }

    @SuppressLint({"WrongConstant"})
    public final void onCreate(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        ProxyAmazonBillingActivityBroadcastReceiver proxyAmazonBillingActivityBroadcastReceiver = new ProxyAmazonBillingActivityBroadcastReceiver(activity);
        this.broadcastReceiver = proxyAmazonBillingActivityBroadcastReceiver;
        AbstractC5042g.d(activity, proxyAmazonBillingActivityBroadcastReceiver, this.filter, 2);
        if (bundle == null) {
            Intent intent = activity.getIntent();
            AbstractC3557B.b0("activity.intent", intent);
            if (startAmazonPurchase$purchases_customEntitlementComputationRelease(intent) == null) {
                activity.finish();
            }
        }
    }

    public final void onDestroy(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        activity.unregisterReceiver(this.broadcastReceiver);
        this.broadcastReceiver = null;
    }

    public final void setBroadcastReceiver$purchases_customEntitlementComputationRelease(ProxyAmazonBillingActivityBroadcastReceiver proxyAmazonBillingActivityBroadcastReceiver) {
        this.broadcastReceiver = proxyAmazonBillingActivityBroadcastReceiver;
    }

    public final RequestId startAmazonPurchase$purchases_customEntitlementComputationRelease(Intent intent) {
        AbstractC3557B.c0("intent", intent);
        String stringExtra = intent.getStringExtra(ProxyAmazonBillingActivity.EXTRAS_SKU);
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
        PurchasingServiceProvider purchasingServiceProvider = (PurchasingServiceProvider) intent.getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_PURCHASING_SERVICE_PROVIDER);
        if (stringExtra != null && resultReceiver != null && purchasingServiceProvider != null) {
            RequestId purchase = purchasingServiceProvider.purchase(stringExtra);
            Bundle bundle = new Bundle();
            bundle.putParcelable(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, (Parcelable) purchase);
            resultReceiver.send(0, bundle);
            return purchase;
        }
        LogUtilsKt.errorLog(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, String.format(AmazonStrings.ERROR_PURCHASE_INVALID_PROXY_ACTIVITY_ARGUMENTS, Arrays.copyOf(new Object[]{intent.toUri(0)}, 1))));
        return null;
    }
}
