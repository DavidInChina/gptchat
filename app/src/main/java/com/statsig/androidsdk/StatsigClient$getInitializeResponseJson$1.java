package com.statsig.androidsdk;

import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StatsigClient$getInitializeResponseJson$1 extends o implements AbstractC6216a {
    final /* synthetic */ B $result;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$getInitializeResponseJson$1(B b10, StatsigClient statsigClient) {
        super(0);
        this.$result = b10;
        this.this$0 = statsigClient;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        Store store;
        B b10 = this.$result;
        store = this.this$0.store;
        if (store != null) {
            b10.f37622Y = store.getCurrentCacheValuesAndEvaluationReason();
        } else {
            AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
            throw null;
        }
    }
}
