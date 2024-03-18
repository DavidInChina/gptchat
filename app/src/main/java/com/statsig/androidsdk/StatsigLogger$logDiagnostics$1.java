package com.statsig.androidsdk;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigLogger$logDiagnostics$1", f = "StatsigLogger.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatsigLogger$logDiagnostics$1 extends AbstractC5163j implements n {
    final /* synthetic */ LogEvent $event;
    int label;
    final /* synthetic */ StatsigLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigLogger$logDiagnostics$1(StatsigLogger statsigLogger, LogEvent logEvent, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.this$0 = statsigLogger;
        this.$event = logEvent;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigLogger$logDiagnostics$1(this.this$0, this.$event, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigLogger$logDiagnostics$1) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
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
            StatsigLogger statsigLogger = this.this$0;
            LogEvent logEvent = this.$event;
            this.label = 1;
            if (statsigLogger.log(logEvent, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
