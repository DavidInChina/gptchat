package com.revenuecat.purchases;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import nf.AbstractC4825e;
import wf.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "", "userCancelled", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt$awaitPurchase$2$2 extends o implements n {
    final /* synthetic */ AbstractC4825e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsCommonKt$awaitPurchase$2$2(AbstractC4825e abstractC4825e) {
        super(2);
        this.$continuation = abstractC4825e;
    }

    @Override // wf.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z10) {
        AbstractC3557B.c0("purchasesError", purchasesError);
        this.$continuation.resumeWith(N.w(new PurchasesTransactionException(purchasesError, z10)));
    }
}
