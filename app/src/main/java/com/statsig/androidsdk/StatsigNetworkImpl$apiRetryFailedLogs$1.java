package com.statsig.androidsdk;

import kotlin.Metadata;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import pf.AbstractC5158e;
import r9.y;

@Metadata(k = 3, mv = {1, 5, 1}, xi = y.f44626f)
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigNetworkImpl", f = "StatsigNetwork.kt", l = {275, 279, 280, 283}, m = "apiRetryFailedLogs")
/* loaded from: classes2.dex */
public final class StatsigNetworkImpl$apiRetryFailedLogs$1 extends AbstractC5156c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StatsigNetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigNetworkImpl$apiRetryFailedLogs$1(StatsigNetworkImpl statsigNetworkImpl, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.this$0 = statsigNetworkImpl;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.apiRetryFailedLogs(null, this);
    }
}
