package com.statsig.androidsdk;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import java.util.LinkedHashMap;
import jf.C3959i;
import jf.y;
import kf.AbstractC4268D;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigLogger$logExposure$2", f = "StatsigLogger.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StatsigLogger$logExposure$2 extends AbstractC5163j implements n {
    final /* synthetic */ DynamicConfig $config;
    final /* synthetic */ boolean $isManual;
    final /* synthetic */ String $name;
    final /* synthetic */ StatsigUser $user;
    int label;
    final /* synthetic */ StatsigLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigLogger$logExposure$2(StatsigUser statsigUser, String str, DynamicConfig dynamicConfig, StatsigLogger statsigLogger, boolean z10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.$user = statsigUser;
        this.$name = str;
        this.$config = dynamicConfig;
        this.this$0 = statsigLogger;
        this.$isManual = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigLogger$logExposure$2(this.$user, this.$name, this.$config, this.this$0, this.$isManual, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigLogger$logExposure$2) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
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
            LogEvent logEvent = new LogEvent(StatsigLoggerKt.CONFIG_EXPOSURE);
            logEvent.setUser(this.$user);
            LinkedHashMap c12 = AbstractC4268D.c1(new C3959i("config", this.$name), new C3959i("ruleID", this.$config.getRuleID()), new C3959i("reason", this.$config.getEvaluationDetails().getReason().toString()), new C3959i("time", String.valueOf(this.$config.getEvaluationDetails().getTime())));
            this.this$0.addManualFlag(c12, this.$isManual);
            logEvent.setMetadata(c12);
            logEvent.setSecondaryExposures(this.$config.getSecondaryExposures$build_release());
            StatsigLogger statsigLogger = this.this$0;
            this.label = 1;
            if (statsigLogger.log(logEvent, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
