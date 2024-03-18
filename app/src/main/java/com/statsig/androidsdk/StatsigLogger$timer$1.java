package com.statsig.androidsdk;

import Ad.l;
import Ng.F;
import R4.b;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigLogger$timer$1", f = "StatsigLogger.kt", l = {42, 43}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StatsigLogger$timer$1 extends AbstractC5163j implements n {
    int label;
    final /* synthetic */ StatsigLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigLogger$timer$1(StatsigLogger statsigLogger, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.this$0 = statsigLogger;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigLogger$timer$1(this.this$0, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigLogger$timer$1) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:10:0x001c). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        F f6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                StatsigLogger statsigLogger = this.this$0;
                this.label = 2;
                if (statsigLogger.flush(this) == enumC5000a) {
                    return enumC5000a;
                }
                f6 = this.this$0.coroutineScope;
                if (l.F0(f6)) {
                    this.label = 1;
                    if (b.p0(StatsigLoggerKt.FLUSH_TIMER_MS, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    StatsigLogger statsigLogger2 = this.this$0;
                    this.label = 2;
                    if (statsigLogger2.flush(this) == enumC5000a) {
                    }
                    f6 = this.this$0.coroutineScope;
                    if (l.F0(f6)) {
                        return y.f36177a;
                    }
                }
            }
        }
        N.B0(obj);
        f6 = this.this$0.coroutineScope;
        if (l.F0(f6)) {
        }
    }
}
