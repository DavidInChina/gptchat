package com.statsig.androidsdk;

import Ng.F;
import android.content.SharedPreferences;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.statsig.androidsdk.InitializeResponse;
import id.AbstractC3557B;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$updateUserImpl$2", f = "StatsigClient.kt", l = {754}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StatsigClient$updateUserImpl$2 extends AbstractC5163j implements n {
    int label;
    final /* synthetic */ StatsigClient this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    @AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$updateUserImpl$2$1", f = "StatsigClient.kt", l = {759, 777}, m = "invokeSuspend")
    /* renamed from: com.statsig.androidsdk.StatsigClient$updateUserImpl$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC5163j implements k {
        Object L$0;
        int label;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StatsigClient statsigClient, AbstractC4825e abstractC4825e) {
            super(1, abstractC4825e);
            this.this$0 = statsigClient;
        }

        @Override // pf.AbstractC5154a
        public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
            return new AnonymousClass1(this.this$0, abstractC4825e);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
        @Override // pf.AbstractC5154a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InitializeResponse initializeResponse;
            Diagnostics diagnostics;
            Object obj2;
            Diagnostics diagnostics2;
            Store store;
            StatsigUser statsigUser;
            Diagnostics diagnostics3;
            Store store2;
            StatsigUser statsigUser2;
            Store store3;
            StatsigUser statsigUser3;
            StatsigUser statsigUser4;
            StatsigMetadata statsigMetadata;
            Diagnostics diagnostics4;
            HashAlgorithm hashAlgorithm;
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        initializeResponse = (InitializeResponse) this.L$0;
                        N.B0(obj);
                        diagnostics = this.this$0.diagnostics;
                        if (diagnostics == null) {
                            Diagnostics.markEnd$default(diagnostics, KeyType.INITIALIZE, true, StepType.PROCESS, null, ContextType.UPDATE_USER, 8, null);
                            this.this$0.pollForUpdates();
                            this.this$0.logEndDiagnostics(initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse, ContextType.UPDATE_USER, initializeResponse);
                            return y.f36177a;
                        }
                        AbstractC3557B.C2("diagnostics");
                        throw null;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                obj2 = obj;
            } else {
                N.B0(obj);
                diagnostics3 = this.this$0.diagnostics;
                if (diagnostics3 != null) {
                    KeyType keyType = KeyType.OVERALL;
                    ContextType contextType = ContextType.UPDATE_USER;
                    Diagnostics.markStart$default(diagnostics3, keyType, null, null, contextType, 6, null);
                    store2 = this.this$0.store;
                    if (store2 != null) {
                        statsigUser2 = this.this$0.user;
                        if (statsigUser2 != null) {
                            Long lastUpdateTime = store2.getLastUpdateTime(statsigUser2);
                            store3 = this.this$0.store;
                            if (store3 != null) {
                                statsigUser3 = this.this$0.user;
                                if (statsigUser3 != null) {
                                    Map<String, String> previousDerivedFields = store3.getPreviousDerivedFields(statsigUser3);
                                    StatsigNetwork statsigNetwork$build_release = this.this$0.getStatsigNetwork$build_release();
                                    String api = this.this$0.getOptions$build_release().getApi();
                                    statsigUser4 = this.this$0.user;
                                    if (statsigUser4 != null) {
                                        statsigMetadata = this.this$0.statsigMetadata;
                                        if (statsigMetadata != null) {
                                            long initTimeoutMs = this.this$0.getOptions$build_release().getInitTimeoutMs();
                                            SharedPreferences sharedPrefs$build_release = this.this$0.getSharedPrefs$build_release();
                                            diagnostics4 = this.this$0.diagnostics;
                                            if (diagnostics4 != null) {
                                                if (AbstractC3557B.K(this.this$0.getOptions$build_release().getDisableHashing(), Boolean.TRUE)) {
                                                    hashAlgorithm = HashAlgorithm.NONE;
                                                } else {
                                                    hashAlgorithm = HashAlgorithm.DJB2;
                                                }
                                                this.label = 1;
                                                obj2 = statsigNetwork$build_release.initialize(api, statsigUser4, lastUpdateTime, statsigMetadata, initTimeoutMs, sharedPrefs$build_release, contextType, diagnostics4, hashAlgorithm, previousDerivedFields, this);
                                                if (obj2 == enumC5000a) {
                                                    return enumC5000a;
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
                                    AbstractC3557B.C2("user");
                                    throw null;
                                }
                            } else {
                                AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
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
                } else {
                    AbstractC3557B.C2("diagnostics");
                    throw null;
                }
            }
            initializeResponse = (InitializeResponse) obj2;
            if (initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse) {
                InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = (InitializeResponse.SuccessfulInitializeResponse) initializeResponse;
                if (successfulInitializeResponse.getHasUpdates()) {
                    diagnostics2 = this.this$0.diagnostics;
                    if (diagnostics2 != null) {
                        Diagnostics.markStart$default(diagnostics2, KeyType.INITIALIZE, StepType.PROCESS, null, ContextType.UPDATE_USER, 4, null);
                        store = this.this$0.store;
                        if (store != null) {
                            statsigUser = this.this$0.user;
                            if (statsigUser != null) {
                                this.L$0 = initializeResponse;
                                this.label = 2;
                                if (store.save(successfulInitializeResponse, statsigUser, this) == enumC5000a) {
                                    return enumC5000a;
                                }
                                diagnostics = this.this$0.diagnostics;
                                if (diagnostics == null) {
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
                }
            }
            this.this$0.pollForUpdates();
            this.this$0.logEndDiagnostics(initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse, ContextType.UPDATE_USER, initializeResponse);
            return y.f36177a;
        }

        public final Object invoke(AbstractC4825e abstractC4825e) {
            return ((AnonymousClass1) create(abstractC4825e)).invokeSuspend(y.f36177a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u008a@\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Ljf/y;", "<anonymous>", "(Ljava/lang/Exception;)V"}, k = 3, mv = {1, 5, 1})
    @AbstractC5158e(c = "com.statsig.androidsdk.StatsigClient$updateUserImpl$2$2", f = "StatsigClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.statsig.androidsdk.StatsigClient$updateUserImpl$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
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
            return ((AnonymousClass2) create(exc, abstractC4825e)).invokeSuspend(y.f36177a);
        }

        @Override // pf.AbstractC5154a
        public final Object invokeSuspend(Object obj) {
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            if (this.label == 0) {
                N.B0(obj);
                this.this$0.logEndDiagnosticsWhenException(ContextType.UPDATE_USER, (Exception) this.L$0);
                return y.f36177a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigClient$updateUserImpl$2(StatsigClient statsigClient, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.this$0 = statsigClient;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigClient$updateUserImpl$2(this.this$0, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigClient$updateUserImpl$2) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (errorBoundary$build_release.captureAsync(anonymousClass1, anonymousClass2, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
