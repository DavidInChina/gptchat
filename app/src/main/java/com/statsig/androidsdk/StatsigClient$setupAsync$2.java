package com.statsig.androidsdk;

import Ng.F;
import android.content.SharedPreferences;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.statsig.androidsdk.InitializeResponse;
import id.AbstractC3557B;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import r9.y;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Lcom/statsig/androidsdk/InitializationDetails;", "<anonymous>", "(LNg/F;)Lcom/statsig/androidsdk/InitializationDetails;"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$setupAsync$2", f = "StatsigClient.kt", l = {611}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatsigClient$setupAsync$2 extends AbstractC5163j implements n {
    final /* synthetic */ StatsigUser $user;
    int label;
    final /* synthetic */ StatsigClient this$0;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;"}, k = 3, mv = {1, 5, 1}, xi = y.f44626f)
    @AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$setupAsync$2$1", f = "StatsigClient.kt", l = {632, 648, 658}, m = "invokeSuspend")
    /* renamed from: com.statsig.androidsdk.StatsigClient$setupAsync$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends AbstractC5163j implements k {
        final /* synthetic */ StatsigUser $user;
        Object L$0;
        int label;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StatsigClient statsigClient, StatsigUser statsigUser, AbstractC4825e abstractC4825e) {
            super(1, abstractC4825e);
            this.this$0 = statsigClient;
            this.$user = statsigUser;
        }

        @Override // pf.AbstractC5154a
        public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
            return new AnonymousClass1(this.this$0, this.$user, abstractC4825e);
        }

        /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0213 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0229  */
        @Override // pf.AbstractC5154a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InitializeResponse initializeResponse;
            InitializeResponse.FailedInitializeResponse failedInitializeResponse;
            long j6;
            StatsigNetwork statsigNetwork$build_release;
            String eventLoggingAPI;
            Diagnostics diagnostics;
            int i10;
            Diagnostics diagnostics2;
            Store store;
            Object obj2;
            AtomicBoolean atomicBoolean;
            Store store2;
            StatsigUser statsigUser;
            StatsigMetadata statsigMetadata;
            Diagnostics diagnostics3;
            HashAlgorithm hashAlgorithm;
            Store store3;
            StatsigUser statsigUser2;
            Store store4;
            Store store5;
            Store store6;
            Diagnostics diagnostics4;
            boolean z10;
            StatsigLogger statsigLogger;
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            initializeResponse = (InitializeResponse) this.L$0;
                            N.B0(obj);
                            boolean z11 = initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse;
                            this.this$0.logEndDiagnostics(z11, ContextType.INITIALIZE, initializeResponse);
                            if (!(initializeResponse instanceof InitializeResponse.FailedInitializeResponse)) {
                                failedInitializeResponse = (InitializeResponse.FailedInitializeResponse) initializeResponse;
                                j6 = 0;
                            } else {
                                j6 = 0;
                                failedInitializeResponse = null;
                            }
                            return new InitializationDetails(j6, z11, failedInitializeResponse);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    initializeResponse = (InitializeResponse) this.L$0;
                    N.B0(obj);
                    diagnostics = this.this$0.diagnostics;
                    if (diagnostics == null) {
                        Diagnostics.markEnd$default(diagnostics, KeyType.INITIALIZE, true, StepType.PROCESS, null, null, 24, null);
                        this.this$0.pollForUpdates();
                        statsigNetwork$build_release = this.this$0.getStatsigNetwork$build_release();
                        eventLoggingAPI = this.this$0.getOptions$build_release().getEventLoggingAPI();
                        this.L$0 = initializeResponse;
                        this.label = 3;
                        if (statsigNetwork$build_release.apiRetryFailedLogs(eventLoggingAPI, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        boolean z112 = initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse;
                        this.this$0.logEndDiagnostics(z112, ContextType.INITIALIZE, initializeResponse);
                        if (!(initializeResponse instanceof InitializeResponse.FailedInitializeResponse)) {
                        }
                        return new InitializationDetails(j6, z112, failedInitializeResponse);
                    }
                    AbstractC3557B.C2("diagnostics");
                    throw null;
                }
                N.B0(obj);
                obj2 = obj;
                i10 = 2;
            } else {
                N.B0(obj);
                atomicBoolean = this.this$0.isBootstrapped;
                if (atomicBoolean.get()) {
                    store6 = this.this$0.store;
                    if (store6 != null) {
                        EvaluationDetails globalEvaluationDetails$build_release = store6.getGlobalEvaluationDetails$build_release();
                        diagnostics4 = this.this$0.diagnostics;
                        if (diagnostics4 != null) {
                            KeyType keyType = KeyType.OVERALL;
                            if (globalEvaluationDetails$build_release.getReason() == EvaluationReason.Bootstrap) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Diagnostics.markEnd$default(diagnostics4, keyType, z10, null, new Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, globalEvaluationDetails$build_release, null, null, 229375, null), null, 20, null);
                            statsigLogger = this.this$0.logger;
                            if (statsigLogger != null) {
                                StatsigLogger.logDiagnostics$default(statsigLogger, null, 1, null);
                                return new InitializationDetails(0L, true, null);
                            }
                            AbstractC3557B.C2("logger");
                            throw null;
                        }
                        AbstractC3557B.C2("diagnostics");
                        throw null;
                    }
                    AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                    throw null;
                }
                if (this.this$0.getOptions$build_release().getLoadCacheAsync()) {
                    store5 = this.this$0.store;
                    if (store5 != null) {
                        store5.syncLoadFromLocalStorage();
                    } else {
                        AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                        throw null;
                    }
                }
                if (this.this$0.getOptions$build_release().getInitializeOffline()) {
                    store4 = this.this$0.store;
                    if (store4 != null) {
                        initializeResponse = store4.getCachedInitializationResponse();
                        i10 = 2;
                        if (initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse) {
                            InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = (InitializeResponse.SuccessfulInitializeResponse) initializeResponse;
                            if (successfulInitializeResponse.getHasUpdates() && !this.this$0.getOptions$build_release().getInitializeOffline()) {
                                diagnostics2 = this.this$0.diagnostics;
                                if (diagnostics2 != null) {
                                    Diagnostics.markStart$default(diagnostics2, KeyType.INITIALIZE, StepType.PROCESS, null, null, 12, null);
                                    store = this.this$0.store;
                                    if (store != null) {
                                        StatsigUser statsigUser3 = this.$user;
                                        this.L$0 = initializeResponse;
                                        this.label = i10;
                                        if (store.save(successfulInitializeResponse, statsigUser3, this) == enumC5000a) {
                                            return enumC5000a;
                                        }
                                        diagnostics = this.this$0.diagnostics;
                                        if (diagnostics == null) {
                                        }
                                    } else {
                                        AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                                        throw null;
                                    }
                                } else {
                                    AbstractC3557B.C2("diagnostics");
                                    throw null;
                                }
                            }
                        }
                        this.this$0.pollForUpdates();
                        statsigNetwork$build_release = this.this$0.getStatsigNetwork$build_release();
                        eventLoggingAPI = this.this$0.getOptions$build_release().getEventLoggingAPI();
                        this.L$0 = initializeResponse;
                        this.label = 3;
                        if (statsigNetwork$build_release.apiRetryFailedLogs(eventLoggingAPI, this) == enumC5000a) {
                        }
                        boolean z1122 = initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse;
                        this.this$0.logEndDiagnostics(z1122, ContextType.INITIALIZE, initializeResponse);
                        if (!(initializeResponse instanceof InitializeResponse.FailedInitializeResponse)) {
                        }
                        return new InitializationDetails(j6, z1122, failedInitializeResponse);
                    }
                    AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                    throw null;
                }
                StatsigNetwork statsigNetwork$build_release2 = this.this$0.getStatsigNetwork$build_release();
                String api = this.this$0.getOptions$build_release().getApi();
                StatsigUser statsigUser4 = this.$user;
                store2 = this.this$0.store;
                if (store2 != null) {
                    statsigUser = this.this$0.user;
                    if (statsigUser != null) {
                        Long lastUpdateTime = store2.getLastUpdateTime(statsigUser);
                        statsigMetadata = this.this$0.statsigMetadata;
                        if (statsigMetadata != null) {
                            long initTimeoutMs = this.this$0.getOptions$build_release().getInitTimeoutMs();
                            SharedPreferences sharedPrefs$build_release = this.this$0.getSharedPrefs$build_release();
                            ContextType contextType = ContextType.INITIALIZE;
                            diagnostics3 = this.this$0.diagnostics;
                            if (diagnostics3 != null) {
                                if (AbstractC3557B.K(this.this$0.getOptions$build_release().getDisableHashing(), Boolean.TRUE)) {
                                    hashAlgorithm = HashAlgorithm.NONE;
                                } else {
                                    hashAlgorithm = HashAlgorithm.DJB2;
                                }
                                store3 = this.this$0.store;
                                if (store3 != null) {
                                    statsigUser2 = this.this$0.user;
                                    if (statsigUser2 != null) {
                                        Map<String, String> previousDerivedFields = store3.getPreviousDerivedFields(statsigUser2);
                                        this.label = 1;
                                        i10 = 2;
                                        obj2 = statsigNetwork$build_release2.initialize(api, statsigUser4, lastUpdateTime, statsigMetadata, initTimeoutMs, sharedPrefs$build_release, contextType, diagnostics3, hashAlgorithm, previousDerivedFields, this);
                                        if (obj2 == enumC5000a) {
                                            return enumC5000a;
                                        }
                                    } else {
                                        AbstractC3557B.C2("user");
                                        throw null;
                                    }
                                } else {
                                    AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                                    throw null;
                                }
                            } else {
                                AbstractC3557B.C2("diagnostics");
                                throw null;
                            }
                        } else {
                            AbstractC3557B.C2("statsigMetadata");
                            throw null;
                        }
                    } else {
                        AbstractC3557B.C2("user");
                        throw null;
                    }
                } else {
                    AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                    throw null;
                }
            }
            initializeResponse = (InitializeResponse) obj2;
            if (initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse) {
            }
            this.this$0.pollForUpdates();
            statsigNetwork$build_release = this.this$0.getStatsigNetwork$build_release();
            eventLoggingAPI = this.this$0.getOptions$build_release().getEventLoggingAPI();
            this.L$0 = initializeResponse;
            this.label = 3;
            if (statsigNetwork$build_release.apiRetryFailedLogs(eventLoggingAPI, this) == enumC5000a) {
            }
            boolean z11222 = initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse;
            this.this$0.logEndDiagnostics(z11222, ContextType.INITIALIZE, initializeResponse);
            if (!(initializeResponse instanceof InitializeResponse.FailedInitializeResponse)) {
            }
            return new InitializationDetails(j6, z11222, failedInitializeResponse);
        }

        public final Object invoke(AbstractC4825e abstractC4825e) {
            return ((AnonymousClass1) create(abstractC4825e)).invokeSuspend(jf.y.f36177a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;"}, k = 3, mv = {1, 5, 1}, xi = y.f44626f)
    @AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$setupAsync$2$2", f = "StatsigClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.statsig.androidsdk.StatsigClient$setupAsync$2$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends AbstractC5163j implements n {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StatsigClient statsigClient, AbstractC4825e abstractC4825e) {
            super(2, abstractC4825e);
            this.this$0 = statsigClient;
        }

        @Override // pf.AbstractC5154a
        public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, abstractC4825e);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(Exception exc, AbstractC4825e abstractC4825e) {
            return ((AnonymousClass2) create(exc, abstractC4825e)).invokeSuspend(jf.y.f36177a);
        }

        @Override // pf.AbstractC5154a
        public final Object invokeSuspend(Object obj) {
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            if (this.label == 0) {
                N.B0(obj);
                Exception exc = (Exception) this.L$0;
                this.this$0.logEndDiagnosticsWhenException(ContextType.INITIALIZE, exc);
                return new InitializationDetails(0L, false, new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, exc, null, 4, null));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$setupAsync$2(StatsigClient statsigClient, StatsigUser statsigUser, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.this$0 = statsigClient;
        this.$user = statsigUser;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigClient$setupAsync$2(this.this$0, this.$user, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigClient$setupAsync$2) create(f6, abstractC4825e)).invokeSuspend(jf.y.f36177a);
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
            ErrorBoundary errorBoundary$build_release = this.this$0.getErrorBoundary$build_release();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$user, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            obj = errorBoundary$build_release.captureAsync(anonymousClass1, anonymousClass2, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
