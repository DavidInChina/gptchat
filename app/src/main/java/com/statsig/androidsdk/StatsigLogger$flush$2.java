package com.statsig.androidsdk;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigLogger$flush$2", f = "StatsigLogger.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatsigLogger$flush$2 extends AbstractC5163j implements n {
    int label;
    final /* synthetic */ StatsigLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigLogger$flush$2(StatsigLogger statsigLogger, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.this$0 = statsigLogger;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigLogger$flush$2(this.this$0, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigLogger$flush$2) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        ConcurrentLinkedQueue concurrentLinkedQueue2;
        ConcurrentLinkedQueue concurrentLinkedQueue3;
        StatsigNetwork statsigNetwork;
        String str;
        I8.n nVar;
        StatsigMetadata statsigMetadata;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.label;
        y yVar = y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.this$0.addErrorBoundaryDiagnostics();
            concurrentLinkedQueue = this.this$0.events;
            if (concurrentLinkedQueue.size() != 0) {
                concurrentLinkedQueue2 = this.this$0.events;
                String valueOf = String.valueOf(concurrentLinkedQueue2.size());
                concurrentLinkedQueue3 = this.this$0.events;
                ArrayList arrayList = new ArrayList(concurrentLinkedQueue3);
                this.this$0.events = new ConcurrentLinkedQueue();
                statsigNetwork = this.this$0.statsigNetwork;
                str = this.this$0.api;
                nVar = this.this$0.gson;
                statsigMetadata = this.this$0.statsigMetadata;
                String i11 = nVar.i(new LogEventData(arrayList, statsigMetadata));
                AbstractC3557B.b0("gson.toJson(LogEventData(flushEvents, statsigMetadata))", i11);
                this.label = 1;
                if (statsigNetwork.apiPostLogs(str, i11, valueOf, this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                return yVar;
            }
        }
        return yVar;
    }
}
