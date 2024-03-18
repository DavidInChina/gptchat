package com.revenuecat.purchases.amazon.purchasing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.pairip.licensecheck3.LicenseClientV3;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.api.R;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\u00a2\u0006\u0004\b\u0011\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivity;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "Ljf/y;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "()V", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "proxyAmazonBillingDelegate", "Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "getProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;", "setProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingDelegate;)V", "getProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease$annotations", "<init>", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ProxyAmazonBillingActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRAS_PURCHASING_SERVICE_PROVIDER = "purchasing_service_provider";
    public static final String EXTRAS_REQUEST_ID = "request_id";
    public static final String EXTRAS_RESULT_RECEIVER = "result_receiver";
    public static final String EXTRAS_SKU = "sku";
    private ProxyAmazonBillingDelegate proxyAmazonBillingDelegate;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/amazon/purchasing/ProxyAmazonBillingActivity$Companion;", "", "()V", "EXTRAS_PURCHASING_SERVICE_PROVIDER", "", "EXTRAS_REQUEST_ID", "EXTRAS_RESULT_RECEIVER", "EXTRAS_SKU", "newStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "resultReceiver", "Landroid/os/ResultReceiver;", ProxyAmazonBillingActivity.EXTRAS_SKU, "purchasingServiceProvider", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Intent newStartIntent(Context context, ResultReceiver resultReceiver, String str, PurchasingServiceProvider purchasingServiceProvider) {
            AbstractC3557B.c0("context", context);
            AbstractC3557B.c0("resultReceiver", resultReceiver);
            AbstractC3557B.c0(ProxyAmazonBillingActivity.EXTRAS_SKU, str);
            AbstractC3557B.c0("purchasingServiceProvider", purchasingServiceProvider);
            Intent intent = new Intent(context, ProxyAmazonBillingActivity.class);
            intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, resultReceiver);
            intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_SKU, str);
            intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_PURCHASING_SERVICE_PROVIDER, purchasingServiceProvider);
            return intent;
        }
    }

    public static /* synthetic */ void getProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease$annotations() {
    }

    public final ProxyAmazonBillingDelegate getProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease() {
        return this.proxyAmazonBillingDelegate;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ProxyAmazonBillingDelegate proxyAmazonBillingDelegate = this.proxyAmazonBillingDelegate;
        if (proxyAmazonBillingDelegate != null) {
            proxyAmazonBillingDelegate.onDestroy(this);
        }
        this.proxyAmazonBillingDelegate = null;
    }

    public final void setProxyAmazonBillingDelegate$purchases_customEntitlementComputationRelease(ProxyAmazonBillingDelegate proxyAmazonBillingDelegate) {
        this.proxyAmazonBillingDelegate = proxyAmazonBillingDelegate;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        LicenseClientV3.onActivityCreate(this);
        setTheme(R.style.ProxyAmazonBillingActivityTheme);
        super.onCreate(bundle);
        ProxyAmazonBillingDelegate proxyAmazonBillingDelegate = new ProxyAmazonBillingDelegate();
        this.proxyAmazonBillingDelegate = proxyAmazonBillingDelegate;
        proxyAmazonBillingDelegate.onCreate(this, bundle);
    }
}
