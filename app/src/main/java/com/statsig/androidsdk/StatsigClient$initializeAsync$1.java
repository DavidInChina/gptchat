package com.statsig.androidsdk;

import Ad.l;
import Ng.B;
import Ng.F;
import android.app.Application;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
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
/* loaded from: classes.dex */
public final class StatsigClient$initializeAsync$1 extends o implements AbstractC6216a {
    final /* synthetic */ Application $application;
    final /* synthetic */ IStatsigCallback $callback;
    final /* synthetic */ StatsigOptions $options;
    final /* synthetic */ String $sdkKey;
    final /* synthetic */ StatsigUser $user;
    final /* synthetic */ StatsigClient this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
    @AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$initializeAsync$1$1", f = "StatsigClient.kt", l = {80, 84}, m = "invokeSuspend")
    /* renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends AbstractC5163j implements n {
        final /* synthetic */ IStatsigCallback $callback;
        final /* synthetic */ StatsigUser $normalizedUser;
        int label;
        final /* synthetic */ StatsigClient this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
        @AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$initializeAsync$1$1$1", f = "StatsigClient.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C00041 extends AbstractC5163j implements n {
            final /* synthetic */ IStatsigCallback $callback;
            final /* synthetic */ InitializationDetails $initDetails;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00041(IStatsigCallback iStatsigCallback, InitializationDetails initializationDetails, AbstractC4825e abstractC4825e) {
                super(2, abstractC4825e);
                this.$callback = iStatsigCallback;
                this.$initDetails = initializationDetails;
            }

            @Override // pf.AbstractC5154a
            public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
                return new C00041(this.$callback, this.$initDetails, abstractC4825e);
            }

            public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
                return ((C00041) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
            }

            @Override // pf.AbstractC5154a
            public final Object invokeSuspend(Object obj) {
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                if (this.label == 0) {
                    N.B0(obj);
                    try {
                        IStatsigCallback iStatsigCallback = this.$callback;
                        if (iStatsigCallback != null) {
                            iStatsigCallback.onStatsigInitialize(this.$initDetails);
                        }
                        return y.f36177a;
                    } catch (Exception e10) {
                        throw new ExternalException(e10.getMessage());
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StatsigClient statsigClient, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, AbstractC4825e abstractC4825e) {
            super(2, abstractC4825e);
            this.this$0 = statsigClient;
            this.$normalizedUser = statsigUser;
            this.$callback = iStatsigCallback;
        }

        @Override // pf.AbstractC5154a
        public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
            return new AnonymousClass1(this.this$0, this.$normalizedUser, this.$callback, abstractC4825e);
        }

        public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
            return ((AnonymousClass1) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
        }

        @Override // pf.AbstractC5154a
        public final Object invokeSuspend(Object obj) {
            long j6;
            CoroutineDispatcherProvider coroutineDispatcherProvider;
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        N.B0(obj);
                        return y.f36177a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
            } else {
                N.B0(obj);
                StatsigClient statsigClient = this.this$0;
                StatsigUser statsigUser = this.$normalizedUser;
                this.label = 1;
                obj = statsigClient.setupAsync$build_release(statsigUser, this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            }
            InitializationDetails initializationDetails = (InitializationDetails) obj;
            long currentTimeMillis = System.currentTimeMillis();
            j6 = this.this$0.initTime;
            initializationDetails.setDuration(currentTimeMillis - j6);
            coroutineDispatcherProvider = this.this$0.dispatcherProvider;
            B main = coroutineDispatcherProvider.getMain();
            C00041 c00041 = new C00041(this.$callback, initializationDetails, null);
            this.label = 2;
            if (l.n1(this, main, c00041) == enumC5000a) {
                return enumC5000a;
            }
            return y.f36177a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$initializeAsync$1(StatsigClient statsigClient, Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, IStatsigCallback iStatsigCallback) {
        super(0);
        this.this$0 = statsigClient;
        this.$application = application;
        this.$sdkKey = str;
        this.$user = statsigUser;
        this.$options = statsigOptions;
        this.$callback = iStatsigCallback;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        StatsigUser upVar;
        F f6;
        upVar = this.this$0.setup(this.$application, this.$sdkKey, this.$user, this.$options);
        f6 = this.this$0.statsigScope;
        if (f6 != null) {
            l.O0(f6, null, null, new AnonymousClass1(this.this$0, upVar, this.$callback, null), 3);
        } else {
            AbstractC3557B.C2("statsigScope");
            throw null;
        }
    }
}
