package com.statsig.androidsdk;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$updateStickyValues$1", f = "StatsigClient.kt", l = {839}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatsigClient$updateStickyValues$1 extends AbstractC5163j implements n {
    int label;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$updateStickyValues$1(StatsigClient statsigClient, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.this$0 = statsigClient;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigClient$updateStickyValues$1(this.this$0, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigClient$updateStickyValues$1) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Store store;
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
            store = this.this$0.store;
            if (store != null) {
                this.label = 1;
                if (store.persistStickyValues(this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                throw null;
            }
        }
        return y.f36177a;
    }
}
