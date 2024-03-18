package com.statsig.androidsdk;

import android.app.Application;
import com.google.android.gms.internal.play_billing.N;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import r9.y;
import wf.k;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;"}, k = 3, mv = {1, 5, 1}, xi = y.f44626f)
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$initialize$2", f = "StatsigClient.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatsigClient$initialize$2 extends AbstractC5163j implements k {
    final /* synthetic */ Application $application;
    final /* synthetic */ StatsigOptions $options;
    final /* synthetic */ String $sdkKey;
    final /* synthetic */ StatsigUser $user;
    int label;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$initialize$2(StatsigClient statsigClient, Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.this$0 = statsigClient;
        this.$application = application;
        this.$sdkKey = str;
        this.$user = statsigUser;
        this.$options = statsigOptions;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new StatsigClient$initialize$2(this.this$0, this.$application, this.$sdkKey, this.$user, this.$options, abstractC4825e);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        long j6;
        StatsigUser upVar;
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
            upVar = this.this$0.setup(this.$application, this.$sdkKey, this.$user, this.$options);
            StatsigClient statsigClient = this.this$0;
            this.label = 1;
            obj = statsigClient.setupAsync$build_release(upVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        InitializationDetails initializationDetails = (InitializationDetails) obj;
        long currentTimeMillis = System.currentTimeMillis();
        j6 = this.this$0.initTime;
        initializationDetails.setDuration(currentTimeMillis - j6);
        return initializationDetails;
    }

    public final Object invoke(AbstractC4825e abstractC4825e) {
        return ((StatsigClient$initialize$2) create(abstractC4825e)).invokeSuspend(jf.y.f36177a);
    }
}
