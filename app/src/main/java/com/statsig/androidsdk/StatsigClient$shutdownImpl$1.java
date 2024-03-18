package com.statsig.androidsdk;

import kotlin.Metadata;
import nf.AbstractC4825e;
import pf.AbstractC5156c;
import pf.AbstractC5158e;
import r9.y;

@Metadata(k = 3, mv = {1, 5, 1}, xi = y.f44626f)
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient", f = "StatsigClient.kt", l = {913}, m = "shutdownImpl")
/* loaded from: classes2.dex */
public final class StatsigClient$shutdownImpl$1 extends AbstractC5156c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$shutdownImpl$1(StatsigClient statsigClient, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.this$0 = statsigClient;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object shutdownImpl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        shutdownImpl = this.this$0.shutdownImpl(this);
        return shutdownImpl;
    }
}
