package com.revenuecat.purchases;

import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import nf.AbstractC4825e;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt$awaitRestore$2$2 extends o implements k {
    final /* synthetic */ AbstractC4825e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsCommonKt$awaitRestore$2$2(AbstractC4825e abstractC4825e) {
        super(1);
        this.$continuation = abstractC4825e;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return y.f36177a;
    }

    public final void invoke(CustomerInfo customerInfo) {
        AbstractC3557B.c0("it", customerInfo);
        this.$continuation.resumeWith(customerInfo);
    }
}
