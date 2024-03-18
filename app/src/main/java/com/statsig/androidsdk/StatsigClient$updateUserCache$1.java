package com.statsig.androidsdk;

import Ng.AbstractC1073l0;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class StatsigClient$updateUserCache$1 extends o implements AbstractC6216a {
    final /* synthetic */ StatsigUser $user;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$updateUserCache$1(StatsigClient statsigClient, StatsigUser statsigUser) {
        super(0);
        this.this$0 = statsigClient;
        this.$user = statsigUser;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        StatsigLogger statsigLogger;
        AbstractC1073l0 abstractC1073l0;
        StatsigUser normalizeUser;
        Store store;
        StatsigUser statsigUser;
        this.this$0.enforceInitialized$build_release("updateUser");
        statsigLogger = this.this$0.logger;
        if (statsigLogger != null) {
            statsigLogger.onUpdateUser();
            abstractC1073l0 = this.this$0.pollingJob;
            if (abstractC1073l0 != null) {
                abstractC1073l0.k(null);
            }
            StatsigClient statsigClient = this.this$0;
            normalizeUser = statsigClient.normalizeUser(this.$user);
            statsigClient.user = normalizeUser;
            store = this.this$0.store;
            if (store == null) {
                AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                throw null;
            }
            statsigUser = this.this$0.user;
            if (statsigUser != null) {
                store.loadAndResetForUser(statsigUser);
                return;
            } else {
                AbstractC3557B.C2("user");
                throw null;
            }
        }
        AbstractC3557B.C2("logger");
        throw null;
    }
}
