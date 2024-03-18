package com.revenuecat.purchases;

import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import id.AbstractC3557B;
import java.util.Collections;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PurchasesOrchestrator$logOut$1 extends o implements k {
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$logOut$1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesOrchestrator purchasesOrchestrator) {
        super(1);
        this.$callback = receiveCustomerInfoCallback;
        this.this$0 = purchasesOrchestrator;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        IdentityManager identityManager;
        if (purchasesError != null) {
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            if (receiveCustomerInfoCallback == null) {
                return;
            }
            receiveCustomerInfoCallback.onError(purchasesError);
            return;
        }
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        synchronized (purchasesOrchestrator) {
            PurchasesState state$purchases_customEntitlementComputationRelease = purchasesOrchestrator.getState$purchases_customEntitlementComputationRelease();
            Map emptyMap = Collections.emptyMap();
            AbstractC3557B.b0("emptyMap()", emptyMap);
            purchasesOrchestrator.setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(state$purchases_customEntitlementComputationRelease, null, emptyMap, null, false, false, 29, null));
        }
        PurchasesOrchestrator purchasesOrchestrator2 = this.this$0;
        identityManager = purchasesOrchestrator2.identityManager;
        purchasesOrchestrator2.updateAllCaches(identityManager.getCurrentAppUserID(), this.$callback);
    }
}
