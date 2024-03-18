package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.networking.Endpoint;
import id.AbstractC3557B;
import java.util.List;
import jf.C3959i;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AmazonBackend$getAmazonReceiptData$call$1 extends o implements AbstractC6216a {
    final /* synthetic */ List<String> $cacheKey;
    final /* synthetic */ String $receiptId;
    final /* synthetic */ String $storeUserID;
    final /* synthetic */ AmazonBackend this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements k {
        final /* synthetic */ List<String> $cacheKey;
        final /* synthetic */ AmazonBackend this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AmazonBackend amazonBackend, List<String> list) {
            super(1);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return y.f36177a;
        }

        public final void invoke(PurchasesError purchasesError) {
            List<C3959i> remove;
            AbstractC3557B.c0("error", purchasesError);
            AmazonBackend amazonBackend = this.this$0;
            List<String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                remove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (remove != null) {
                for (C3959i c3959i : remove) {
                    ((k) c3959i.f36156Z).invoke(purchasesError);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "<anonymous parameter 1>", "Lorg/json/JSONObject;", "body", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ILorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.amazon.AmazonBackend$getAmazonReceiptData$call$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends o implements wf.o {
        final /* synthetic */ List<String> $cacheKey;
        final /* synthetic */ AmazonBackend this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AmazonBackend amazonBackend, List<String> list) {
            super(3);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override // wf.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
            return y.f36177a;
        }

        public final void invoke(PurchasesError purchasesError, int i10, JSONObject jSONObject) {
            List<C3959i> remove;
            AbstractC3557B.c0("body", jSONObject);
            AmazonBackend amazonBackend = this.this$0;
            List<String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                remove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (remove != null) {
                for (C3959i c3959i : remove) {
                    k kVar = (k) c3959i.f36155Y;
                    k kVar2 = (k) c3959i.f36156Z;
                    if (purchasesError != null) {
                        kVar2.invoke(purchasesError);
                    } else {
                        kVar.invoke(jSONObject);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBackend$getAmazonReceiptData$call$1(AmazonBackend amazonBackend, String str, String str2, List<String> list) {
        super(0);
        this.this$0 = amazonBackend;
        this.$storeUserID = str;
        this.$receiptId = str2;
        this.$cacheKey = list;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        BackendHelper backendHelper;
        backendHelper = this.this$0.backendHelper;
        backendHelper.performRequest(new Endpoint.GetAmazonReceipt(this.$storeUserID, this.$receiptId), null, null, Delay.NONE, new AnonymousClass1(this.this$0, this.$cacheKey), new AnonymousClass2(this.this$0, this.$cacheKey));
    }
}
