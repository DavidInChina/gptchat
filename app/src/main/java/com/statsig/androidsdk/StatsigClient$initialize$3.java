package com.statsig.androidsdk;

import com.google.android.gms.internal.play_billing.N;
import com.statsig.androidsdk.InitializeResponse;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import r9.y;
import wf.n;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;"}, k = 3, mv = {1, 5, 1}, xi = y.f44626f)
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$initialize$3", f = "StatsigClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatsigClient$initialize$3 extends AbstractC5163j implements n {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StatsigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$initialize$3(StatsigClient statsigClient, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.this$0 = statsigClient;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        StatsigClient$initialize$3 statsigClient$initialize$3 = new StatsigClient$initialize$3(this.this$0, abstractC4825e);
        statsigClient$initialize$3.L$0 = obj;
        return statsigClient$initialize$3;
    }

    public final Object invoke(Exception exc, AbstractC4825e abstractC4825e) {
        return ((StatsigClient$initialize$3) create(exc, abstractC4825e)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        long j6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        if (this.label == 0) {
            N.B0(obj);
            Exception exc = (Exception) this.L$0;
            this.this$0.logEndDiagnosticsWhenException(ContextType.INITIALIZE, exc);
            if (this.this$0.isInitialized()) {
                long currentTimeMillis = System.currentTimeMillis();
                j6 = this.this$0.initTime;
                return new InitializationDetails(currentTimeMillis - j6, false, new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, exc, null, 4, null));
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
