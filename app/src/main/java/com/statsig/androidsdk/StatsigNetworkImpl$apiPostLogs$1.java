package com.statsig.androidsdk;

import kotlin.Metadata;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import pf.AbstractC5158e;
import r9.y;

@Metadata(k = 3, mv = {1, 5, 1}, xi = y.f44626f)
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigNetworkImpl", f = "StatsigNetwork.kt", l = {495}, m = "apiPostLogs")
/* loaded from: classes.dex */
public final class StatsigNetworkImpl$apiPostLogs$1 extends AbstractC5156c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StatsigNetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigNetworkImpl$apiPostLogs$1(StatsigNetworkImpl statsigNetworkImpl, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.this$0 = statsigNetworkImpl;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.apiPostLogs(null, null, null, this);
    }
}
