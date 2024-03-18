package com.statsig.androidsdk;

import Ad.l;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.AbstractC6216a;
import wf.n;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StatsigClient$logEvent$2 extends o implements AbstractC6216a {
    final /* synthetic */ String $eventName;
    final /* synthetic */ Map<String, String> $metadata;
    final /* synthetic */ String $value;
    final /* synthetic */ StatsigClient this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
    @AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$logEvent$2$1", f = "StatsigClient.kt", l = {347}, m = "invokeSuspend")
    /* renamed from: com.statsig.androidsdk.StatsigClient$logEvent$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC5163j implements n {
        final /* synthetic */ LogEvent $event;
        int label;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StatsigClient statsigClient, LogEvent logEvent, AbstractC4825e abstractC4825e) {
            super(2, abstractC4825e);
            this.this$0 = statsigClient;
            this.$event = logEvent;
        }

        @Override // pf.AbstractC5154a
        public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
            return new AnonymousClass1(this.this$0, this.$event, abstractC4825e);
        }

        public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
            return ((AnonymousClass1) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
        }

        @Override // pf.AbstractC5154a
        public final Object invokeSuspend(Object obj) {
            StatsigLogger statsigLogger;
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
                statsigLogger = this.this$0.logger;
                if (statsigLogger != null) {
                    LogEvent logEvent = this.$event;
                    this.label = 1;
                    if (statsigLogger.log(logEvent, this) == enumC5000a) {
                        return enumC5000a;
                    }
                } else {
                    AbstractC3557B.C2("logger");
                    throw null;
                }
            }
            return y.f36177a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$logEvent$2(String str, String str2, Map<String, String> map, StatsigClient statsigClient) {
        super(0);
        this.$eventName = str;
        this.$value = str2;
        this.$metadata = map;
        this.this$0 = statsigClient;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        StatsigUser statsigUser;
        F f6;
        LogEvent logEvent = new LogEvent(this.$eventName);
        logEvent.setValue(this.$value);
        logEvent.setMetadata(this.$metadata);
        statsigUser = this.this$0.user;
        if (statsigUser != null) {
            logEvent.setUser(statsigUser);
            f6 = this.this$0.statsigScope;
            if (f6 != null) {
                l.O0(f6, null, null, new AnonymousClass1(this.this$0, logEvent, null), 3);
                return;
            } else {
                AbstractC3557B.C2("statsigScope");
                throw null;
            }
        }
        AbstractC3557B.C2("user");
        throw null;
    }
}
