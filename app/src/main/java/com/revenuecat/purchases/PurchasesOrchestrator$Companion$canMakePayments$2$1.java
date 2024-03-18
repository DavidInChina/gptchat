package com.revenuecat.purchases;

import K4.AbstractC0815c;
import K4.AbstractC0817e;
import K4.C0822j;
import M3.u;
import android.os.Handler;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.models.BillingFeature;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import u5.RunnableC5841a;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$Companion$canMakePayments$2$1", "LK4/e;", "LK4/j;", "billingResult", "Ljf/y;", "onBillingSetupFinished", "(LK4/j;)V", "onBillingServiceDisconnected", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1 implements AbstractC0817e {
    final /* synthetic */ AbstractC0815c $billingClient;
    final /* synthetic */ Callback<Boolean> $callback;
    final /* synthetic */ List<BillingFeature> $features;
    final /* synthetic */ Handler $mainHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesOrchestrator$Companion$canMakePayments$2$1(Handler handler, Callback<Boolean> callback, AbstractC0815c abstractC0815c, List<? extends BillingFeature> list) {
        this.$mainHandler = handler;
        this.$callback = callback;
        this.$billingClient = abstractC0815c;
        this.$features = list;
    }

    public static final void onBillingServiceDisconnected$lambda$2(AbstractC0815c abstractC0815c, Callback callback) {
        AbstractC3557B.c0("$billingClient", abstractC0815c);
        AbstractC3557B.c0("$callback", callback);
        try {
            abstractC0815c.a();
        } catch (IllegalArgumentException unused) {
        } catch (Throwable th2) {
            callback.onReceived(Boolean.FALSE);
            throw th2;
        }
        callback.onReceived(Boolean.FALSE);
    }

    public static final void onBillingSetupFinished$lambda$1(C0822j c0822j, Callback callback, AbstractC0815c abstractC0815c, List list) {
        AbstractC3557B.c0("$billingResult", c0822j);
        AbstractC3557B.c0("$callback", callback);
        AbstractC3557B.c0("$billingClient", abstractC0815c);
        AbstractC3557B.c0("$features", list);
        try {
            if (!BillingResultExtensionsKt.isSuccessful(c0822j)) {
                callback.onReceived(Boolean.FALSE);
                abstractC0815c.a();
                return;
            }
            boolean z10 = true;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0822j b10 = abstractC0815c.b(((BillingFeature) it.next()).getPlayBillingClientName());
                    AbstractC3557B.b0("billingClient.isFeatureS\u2026it.playBillingClientName)", b10);
                    if (!BillingResultExtensionsKt.isSuccessful(b10)) {
                        z10 = false;
                        break;
                    }
                }
            }
            abstractC0815c.a();
            callback.onReceived(Boolean.valueOf(z10));
        } catch (IllegalArgumentException unused) {
            callback.onReceived(Boolean.FALSE);
        }
    }

    @Override // K4.AbstractC0817e
    public void onBillingServiceDisconnected() {
        this.$mainHandler.post(new RunnableC5841a(this.$billingClient, 7, this.$callback));
    }

    @Override // K4.AbstractC0817e
    public void onBillingSetupFinished(C0822j c0822j) {
        AbstractC3557B.c0("billingResult", c0822j);
        this.$mainHandler.post(new u(c0822j, this.$callback, this.$billingClient, this.$features));
    }
}
