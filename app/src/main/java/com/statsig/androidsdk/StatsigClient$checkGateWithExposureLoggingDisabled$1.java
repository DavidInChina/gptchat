package com.statsig.androidsdk;

import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.x;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class StatsigClient$checkGateWithExposureLoggingDisabled$1 extends o implements AbstractC6216a {
    final /* synthetic */ String $gateName;
    final /* synthetic */ x $result;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$checkGateWithExposureLoggingDisabled$1(StatsigClient statsigClient, String str, x xVar) {
        super(0);
        this.this$0 = statsigClient;
        this.$gateName = str;
        this.$result = xVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        Store store;
        store = this.this$0.store;
        if (store != null) {
            FeatureGate checkGate = store.checkGate(this.$gateName);
            this.$result.f37645Y = checkGate.getValue();
            return;
        }
        AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
        throw null;
    }
}
