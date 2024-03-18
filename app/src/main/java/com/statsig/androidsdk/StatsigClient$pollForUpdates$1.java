package com.statsig.androidsdk;

import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.statsig.androidsdk.InitializeResponse;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "it", "Ljf/y;", "<anonymous>", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;)V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$pollForUpdates$1", f = "StatsigClient.kt", l = {884}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatsigClient$pollForUpdates$1 extends AbstractC5163j implements n {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$pollForUpdates$1(StatsigClient statsigClient, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.this$0 = statsigClient;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        StatsigClient$pollForUpdates$1 statsigClient$pollForUpdates$1 = new StatsigClient$pollForUpdates$1(this.this$0, abstractC4825e);
        statsigClient$pollForUpdates$1.L$0 = obj;
        return statsigClient$pollForUpdates$1;
    }

    public final Object invoke(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, AbstractC4825e abstractC4825e) {
        return ((StatsigClient$pollForUpdates$1) create(successfulInitializeResponse, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        Store store;
        StatsigUser statsigUser;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = (InitializeResponse.SuccessfulInitializeResponse) this.L$0;
            if (successfulInitializeResponse == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(successfulInitializeResponse.getHasUpdates());
            }
            if (AbstractC3557B.K(bool, Boolean.TRUE)) {
                store = this.this$0.store;
                if (store != null) {
                    statsigUser = this.this$0.user;
                    if (statsigUser != null) {
                        this.label = 1;
                        if (store.save(successfulInitializeResponse, statsigUser, this) == enumC5000a) {
                            return enumC5000a;
                        }
                    } else {
                        AbstractC3557B.C2("user");
                        throw null;
                    }
                } else {
                    AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                    throw null;
                }
            }
        }
        return y.f36177a;
    }
}
