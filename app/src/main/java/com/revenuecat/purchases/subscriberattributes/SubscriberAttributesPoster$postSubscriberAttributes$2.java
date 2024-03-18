package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import id.AbstractC3557B;
import jf.y;
import kf.v;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "responseCode", "Lorg/json/JSONObject;", "body", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ILorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriberAttributesPoster$postSubscriberAttributes$2 extends o implements wf.o {
    final /* synthetic */ wf.o $onErrorHandler;
    final /* synthetic */ AbstractC6216a $onSuccessHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesPoster$postSubscriberAttributes$2(AbstractC6216a abstractC6216a, wf.o oVar) {
        super(3);
        this.$onSuccessHandler = abstractC6216a;
        this.$onErrorHandler = oVar;
    }

    @Override // wf.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError, int i10, JSONObject jSONObject) {
        y yVar;
        AbstractC3557B.c0("body", jSONObject);
        if (purchasesError != null) {
            wf.o oVar = this.$onErrorHandler;
            boolean isServerError = RCHTTPStatusCodes.INSTANCE.isServerError(i10);
            boolean z10 = false;
            boolean z11 = i10 == 404;
            if (!isServerError && !z11) {
                z10 = true;
            }
            Object obj = v.f37483Y;
            if (purchasesError.getCode() == PurchasesErrorCode.InvalidSubscriberAttributesError) {
                obj = BackendHelpersKt.getAttributeErrors(jSONObject);
            }
            oVar.invoke(purchasesError, Boolean.valueOf(z10), obj);
            yVar = y.f36177a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            this.$onSuccessHandler.mo122invoke();
        }
    }
}
