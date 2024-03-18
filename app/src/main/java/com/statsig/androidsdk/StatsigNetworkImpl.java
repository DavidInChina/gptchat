package com.statsig.androidsdk;

import Ad.l;
import Cf.e;
import I8.n;
import K4.J;
import Ng.J0;
import Ng.K0;
import Qg.AbstractC1206i;
import Qg.C1209l;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.statsig.androidsdk.InitializeResponse;
import com.statsig.androidsdk.Marker;
import id.AbstractC3557B;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import jf.y;
import kf.AbstractC4268D;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wf.k;
import yf.AbstractC6583a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010@\u001a\u00020\u0002\u0012\u0006\u0010C\u001a\u00020B\u00a2\u0006\u0004\bR\u0010SJq\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0085\u0001\u0010%\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\u0016\b\u0006\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020#0\"H\u0082H\u00f8\u0001\u0000\u00a2\u0006\u0004\b%\u0010&JS\u0010/\u001a\u00020#2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010'\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0002\u00a2\u0006\u0004\b/\u00100Ju\u00104\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u00101\u001a\u00020\u00062\u0006\u00103\u001a\u0002022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b4\u00105J;\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b8\u00109J-\u0010:\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b<\u0010=J\u001b\u0010?\u001a\u00020#2\u0006\u0010>\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\b?\u0010=R\u0014\u0010@\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b3\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bO\u0010A\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006T"}, d2 = {"Lcom/statsig/androidsdk/StatsigNetworkImpl;", "Lcom/statsig/androidsdk/StatsigNetwork;", "", "api", "Lcom/statsig/androidsdk/StatsigUser;", "user", "", "sinceTime", "Lcom/statsig/androidsdk/StatsigMetadata;", "metadata", "Lcom/statsig/androidsdk/ContextType;", "contextType", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "", "timeoutMs", "Lcom/statsig/androidsdk/HashAlgorithm;", "hashUsed", "", "previousDerivedFields", "Lcom/statsig/androidsdk/InitializeResponse;", "initializeImpl", "(Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/Long;Lcom/statsig/androidsdk/StatsigMetadata;Lcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/Diagnostics;Ljava/lang/Integer;Lcom/statsig/androidsdk/HashAlgorithm;Ljava/util/Map;Lnf/e;)Ljava/lang/Object;", "", "Lcom/statsig/androidsdk/StatsigOfflineRequest;", "getSavedLogs", "(Lnf/e;)Ljava/lang/Object;", "", TokenNames.T, "endpoint", "bodyString", "retries", "timeout", "eventsCount", "Lkotlin/Function1;", "Ljf/y;", "callback", "postRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/Diagnostics;Ljava/lang/Integer;Ljava/lang/String;Lwf/k;Lnf/e;)Ljava/lang/Object;", "diagnosticsContext", "Lcom/statsig/androidsdk/KeyType;", "keyType", "statusCode", "sdkRegion", "attempt", "Lcom/statsig/androidsdk/Marker$ErrorMessage;", "error", "endDiagnostics", "(Lcom/statsig/androidsdk/Diagnostics;Lcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/KeyType;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/statsig/androidsdk/Marker$ErrorMessage;)V", "initTimeoutMs", "Landroid/content/SharedPreferences;", "sharedPrefs", "initialize", "(Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/Long;Lcom/statsig/androidsdk/StatsigMetadata;JLandroid/content/SharedPreferences;Lcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/Diagnostics;Lcom/statsig/androidsdk/HashAlgorithm;Ljava/util/Map;Lnf/e;)Ljava/lang/Object;", "LQg/i;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "pollForChanges", "(Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/Long;Lcom/statsig/androidsdk/StatsigMetadata;)LQg/i;", "apiPostLogs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnf/e;)Ljava/lang/Object;", "apiRetryFailedLogs", "(Ljava/lang/String;Lnf/e;)Ljava/lang/Object;", "requestBody", "addFailedLogRequest", "sdkKey", "Ljava/lang/String;", "Lcom/statsig/androidsdk/ErrorBoundary;", "errorBoundary", "Lcom/statsig/androidsdk/ErrorBoundary;", "LI8/n;", "gson", "LI8/n;", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "Landroid/content/SharedPreferences;", "Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener;", "connectivityListener", "Lcom/statsig/androidsdk/StatsigNetworkConnectivityListener;", "offlineLogsKeyV2", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/statsig/androidsdk/ErrorBoundary;)V", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StatsigNetworkImpl implements StatsigNetwork {
    private final StatsigNetworkConnectivityListener connectivityListener;
    private final ErrorBoundary errorBoundary;
    private final String offlineLogsKeyV2;
    private final String sdkKey;
    private SharedPreferences sharedPrefs;
    private final n gson = StatsigUtil.INSTANCE.getGson$build_release();
    private final CoroutineDispatcherProvider dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);

    public StatsigNetworkImpl(Context context, String str, ErrorBoundary errorBoundary) {
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("sdkKey", str);
        AbstractC3557B.c0("errorBoundary", errorBoundary);
        this.sdkKey = str;
        this.errorBoundary = errorBoundary;
        this.connectivityListener = new StatsigNetworkConnectivityListener(context);
        this.offlineLogsKeyV2 = AbstractC3557B.v2("StatsigNetwork.OFFLINE_LOGS:", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [Cf.g, Cf.e] */
    public final void endDiagnostics(Diagnostics diagnostics, ContextType contextType, KeyType keyType, Integer num, String str, Integer num2, Marker.ErrorMessage errorMessage) {
        boolean z10;
        if (diagnostics == null) {
            return;
        }
        Marker marker = new Marker(null, null, null, null, num, null, null, null, null, str, null, num2, null, null, null, null, errorMessage, Boolean.valueOf(this.connectivityListener.isNetworkAvailable()), 62959, null);
        ?? eVar = new e(RCHTTPStatusCodes.SUCCESS, 299, 1);
        if (num != null && eVar.s(num.intValue())) {
            z10 = true;
        } else {
            z10 = false;
        }
        diagnostics.markEnd(keyType, z10, StepType.NETWORK_REQUEST, marker, contextType);
    }

    public static /* synthetic */ void endDiagnostics$default(StatsigNetworkImpl statsigNetworkImpl, Diagnostics diagnostics, ContextType contextType, KeyType keyType, Integer num, String str, Integer num2, Marker.ErrorMessage errorMessage, int i10, Object obj) {
        Marker.ErrorMessage errorMessage2;
        if ((i10 & 64) != 0) {
            errorMessage2 = null;
        } else {
            errorMessage2 = errorMessage;
        }
        statsigNetworkImpl.endDiagnostics(diagnostics, contextType, keyType, num, str, num2, errorMessage2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSavedLogs(AbstractC4825e abstractC4825e) {
        return l.n1(abstractC4825e, this.dispatcherProvider.getIo(), new StatsigNetworkImpl$getSavedLogs$2(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b A[Catch: Exception -> 0x0128, TRY_LEAVE, TryCatch #2 {Exception -> 0x0128, blocks: (B:34:0x0117, B:36:0x011b), top: B:66:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializeImpl(String str, StatsigUser statsigUser, Long l10, StatsigMetadata statsigMetadata, ContextType contextType, Diagnostics diagnostics, Integer num, HashAlgorithm hashAlgorithm, Map<String, String> map, AbstractC4825e abstractC4825e) {
        StatsigNetworkImpl$initializeImpl$1 statsigNetworkImpl$initializeImpl$1;
        int i10;
        int i11;
        StatsigNetworkImpl statsigNetworkImpl;
        B b10;
        Diagnostics diagnostics2;
        ContextType contextType2;
        Object obj;
        InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse;
        StatsigUser copyForEvaluation$build_release;
        StatsigMetadata copy;
        try {
            if (abstractC4825e instanceof StatsigNetworkImpl$initializeImpl$1) {
                statsigNetworkImpl$initializeImpl$1 = (StatsigNetworkImpl$initializeImpl$1) abstractC4825e;
                int i12 = statsigNetworkImpl$initializeImpl$1.label;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    statsigNetworkImpl$initializeImpl$1.label = i12 - Integer.MIN_VALUE;
                    StatsigNetworkImpl$initializeImpl$1 statsigNetworkImpl$initializeImpl$12 = statsigNetworkImpl$initializeImpl$1;
                    Object obj2 = statsigNetworkImpl$initializeImpl$12.result;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = statsigNetworkImpl$initializeImpl$12.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            B b11 = (B) statsigNetworkImpl$initializeImpl$12.L$3;
                            Diagnostics diagnostics3 = (Diagnostics) statsigNetworkImpl$initializeImpl$12.L$2;
                            ContextType contextType3 = (ContextType) statsigNetworkImpl$initializeImpl$12.L$1;
                            statsigNetworkImpl = (StatsigNetworkImpl) statsigNetworkImpl$initializeImpl$12.L$0;
                            try {
                                N.B0(obj2);
                                obj = obj2;
                                contextType2 = contextType3;
                                i11 = 1;
                                b10 = b11;
                                diagnostics2 = diagnostics3;
                            } catch (Exception e10) {
                                e = e10;
                                diagnostics2 = diagnostics3;
                                contextType2 = contextType3;
                                i11 = 1;
                                if (statsigNetworkImpl.connectivityListener.isNetworkAvailable()) {
                                }
                                statsigNetworkImpl.endDiagnostics(diagnostics2, contextType2, KeyType.INITIALIZE, null, null, new Integer(i11), new Marker.ErrorMessage(String.valueOf(e.getMessage()), e.getClass().getName(), e.getClass().getName()));
                                if (e instanceof SocketTimeoutException) {
                                }
                                return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkTimeout, e, null, 4, null);
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj2);
                        if (statsigUser == null) {
                            copyForEvaluation$build_release = null;
                        } else {
                            try {
                                copyForEvaluation$build_release = statsigUser.getCopyForEvaluation$build_release();
                            } catch (Exception e11) {
                                e = e11;
                                contextType2 = contextType;
                                diagnostics2 = diagnostics;
                                i11 = 1;
                                statsigNetworkImpl = this;
                                if (statsigNetworkImpl.connectivityListener.isNetworkAvailable()) {
                                }
                                statsigNetworkImpl.endDiagnostics(diagnostics2, contextType2, KeyType.INITIALIZE, null, null, new Integer(i11), new Marker.ErrorMessage(String.valueOf(e.getMessage()), e.getClass().getName(), e.getClass().getName()));
                                if (e instanceof SocketTimeoutException) {
                                }
                                return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkTimeout, e, null, 4, null);
                            }
                        }
                        copy = statsigMetadata.copy((r24 & 1) != 0 ? statsigMetadata.stableID : null, (r24 & 2) != 0 ? statsigMetadata.appIdentifier : null, (r24 & 4) != 0 ? statsigMetadata.appVersion : null, (r24 & 8) != 0 ? statsigMetadata.deviceModel : null, (r24 & 16) != 0 ? statsigMetadata.deviceOS : null, (r24 & 32) != 0 ? statsigMetadata.language : null, (r24 & 64) != 0 ? statsigMetadata.sdkType : null, (r24 & 128) != 0 ? statsigMetadata.sdkVersion : null, (r24 & 256) != 0 ? statsigMetadata.sessionID : null, (r24 & 512) != 0 ? statsigMetadata.systemVersion : null, (r24 & 1024) != 0 ? statsigMetadata.systemName : null);
                        Map a12 = AbstractC4268D.a1(new C3959i("user", copyForEvaluation$build_release), new C3959i("statsigMetadata", copy), new C3959i("sinceTime", l10), new C3959i("hash", hashAlgorithm), new C3959i("previousDerivedFields", map));
                        ?? obj3 = new Object();
                        String i13 = this.gson.i(a12);
                        AbstractC3557B.b0("gson.toJson(body)", i13);
                        Ng.B io2 = this.dispatcherProvider.getIo();
                        i11 = 1;
                        try {
                            StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1 statsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1 = new StatsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1(str, "initialize", num, this, null, diagnostics, contextType, 0, i13, null, obj3);
                            statsigNetworkImpl$initializeImpl$12.L$0 = this;
                            contextType2 = contextType;
                            try {
                                statsigNetworkImpl$initializeImpl$12.L$1 = contextType2;
                                diagnostics2 = diagnostics;
                            } catch (Exception e12) {
                                e = e12;
                                diagnostics2 = diagnostics;
                                statsigNetworkImpl = this;
                                if (statsigNetworkImpl.connectivityListener.isNetworkAvailable()) {
                                    statsigNetworkImpl.errorBoundary.logException$build_release(e);
                                }
                                statsigNetworkImpl.endDiagnostics(diagnostics2, contextType2, KeyType.INITIALIZE, null, null, new Integer(i11), new Marker.ErrorMessage(String.valueOf(e.getMessage()), e.getClass().getName(), e.getClass().getName()));
                                if ((e instanceof SocketTimeoutException) || (e instanceof ConnectException)) {
                                    return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkTimeout, e, null, 4, null);
                                }
                                if (!(e instanceof J0)) {
                                    return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.CoroutineTimeout, e, null, 4, null);
                                }
                                return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, e, null, 4, null);
                            }
                            try {
                                statsigNetworkImpl$initializeImpl$12.L$2 = diagnostics2;
                                b10 = obj3;
                                statsigNetworkImpl$initializeImpl$12.L$3 = b10;
                                statsigNetworkImpl$initializeImpl$12.label = 1;
                                obj = l.n1(statsigNetworkImpl$initializeImpl$12, io2, statsigNetworkImpl$initializeImpl$$inlined$postRequest$default$1);
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                statsigNetworkImpl = this;
                            } catch (Exception e13) {
                                e = e13;
                                statsigNetworkImpl = this;
                                if (statsigNetworkImpl.connectivityListener.isNetworkAvailable()) {
                                }
                                statsigNetworkImpl.endDiagnostics(diagnostics2, contextType2, KeyType.INITIALIZE, null, null, new Integer(i11), new Marker.ErrorMessage(String.valueOf(e.getMessage()), e.getClass().getName(), e.getClass().getName()));
                                if (e instanceof SocketTimeoutException) {
                                    if (!(e instanceof J0)) {
                                    }
                                }
                                return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkTimeout, e, null, 4, null);
                            }
                        } catch (Exception e14) {
                            e = e14;
                            contextType2 = contextType;
                        }
                    }
                    successfulInitializeResponse = (InitializeResponse.SuccessfulInitializeResponse) obj;
                    if (successfulInitializeResponse != null) {
                        return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkError, null, (Integer) b10.f37622Y);
                    }
                    return successfulInitializeResponse;
                }
            }
            successfulInitializeResponse = (InitializeResponse.SuccessfulInitializeResponse) obj;
            if (successfulInitializeResponse != null) {
            }
        } catch (Exception e15) {
            e = e15;
            if (statsigNetworkImpl.connectivityListener.isNetworkAvailable()) {
            }
            statsigNetworkImpl.endDiagnostics(diagnostics2, contextType2, KeyType.INITIALIZE, null, null, new Integer(i11), new Marker.ErrorMessage(String.valueOf(e.getMessage()), e.getClass().getName(), e.getClass().getName()));
            if (e instanceof SocketTimeoutException) {
            }
            return new InitializeResponse.FailedInitializeResponse(InitializeFailReason.NetworkTimeout, e, null, 4, null);
        }
        statsigNetworkImpl$initializeImpl$1 = new StatsigNetworkImpl$initializeImpl$1(this, abstractC4825e);
        StatsigNetworkImpl$initializeImpl$1 statsigNetworkImpl$initializeImpl$122 = statsigNetworkImpl$initializeImpl$1;
        Object obj22 = statsigNetworkImpl$initializeImpl$122.result;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = statsigNetworkImpl$initializeImpl$122.label;
        if (i10 == 0) {
        }
    }

    public static /* synthetic */ Object initializeImpl$default(StatsigNetworkImpl statsigNetworkImpl, String str, StatsigUser statsigUser, Long l10, StatsigMetadata statsigMetadata, ContextType contextType, Diagnostics diagnostics, Integer num, HashAlgorithm hashAlgorithm, Map map, AbstractC4825e abstractC4825e, int i10, Object obj) {
        Integer num2;
        if ((i10 & 64) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        return statsigNetworkImpl.initializeImpl(str, statsigUser, l10, statsigMetadata, contextType, diagnostics, num2, hashAlgorithm, map, abstractC4825e);
    }

    private final Object postRequest(String str, String str2, String str3, int i10, ContextType contextType, Diagnostics diagnostics, Integer num, String str4, k kVar, AbstractC4825e abstractC4825e) {
        this.dispatcherProvider.getIo();
        AbstractC3557B.B2();
        throw null;
    }

    public static Object postRequest$default(StatsigNetworkImpl statsigNetworkImpl, String str, String str2, String str3, int i10, ContextType contextType, Diagnostics diagnostics, Integer num, String str4, k kVar, AbstractC4825e abstractC4825e, int i11, Object obj) {
        if ((i11 & 256) != 0) {
            StatsigNetworkImpl$postRequest$2 statsigNetworkImpl$postRequest$2 = StatsigNetworkImpl$postRequest$2.INSTANCE;
        }
        statsigNetworkImpl.dispatcherProvider.getIo();
        AbstractC3557B.B2();
        throw null;
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public Object addFailedLogRequest(String str, AbstractC4825e abstractC4825e) {
        Object n12 = l.n1(abstractC4825e, this.dispatcherProvider.getIo(), new StatsigNetworkImpl$addFailedLogRequest$2(this, str, null));
        if (n12 == EnumC5000a.f41328Y) {
            return n12;
        }
        return y.f36177a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|(2:4|(7:6|8|22|(1:(1:11)(2:12|13))(3:14|15|(1:17))|21|18|19))|7|8|22|(0)(0)|21|18|19) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.statsig.androidsdk.StatsigNetwork
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apiPostLogs(String str, String str2, String str3, AbstractC4825e abstractC4825e) {
        StatsigNetworkImpl$apiPostLogs$1 statsigNetworkImpl$apiPostLogs$1;
        int i10;
        if (abstractC4825e instanceof StatsigNetworkImpl$apiPostLogs$1) {
            statsigNetworkImpl$apiPostLogs$1 = (StatsigNetworkImpl$apiPostLogs$1) abstractC4825e;
            int i11 = statsigNetworkImpl$apiPostLogs$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                statsigNetworkImpl$apiPostLogs$1.label = i11 - Integer.MIN_VALUE;
                Object obj = statsigNetworkImpl$apiPostLogs$1.result;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = statsigNetworkImpl$apiPostLogs$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    ContextType contextType = ContextType.EVENT_LOGGING;
                    Ng.B io2 = this.dispatcherProvider.getIo();
                    StatsigNetworkImpl$apiPostLogs$$inlined$postRequest$default$1 statsigNetworkImpl$apiPostLogs$$inlined$postRequest$default$1 = new StatsigNetworkImpl$apiPostLogs$$inlined$postRequest$default$1(str, "log_event", null, this, str3, null, contextType, 3, str2, null);
                    statsigNetworkImpl$apiPostLogs$1.label = 1;
                    if (l.n1(statsigNetworkImpl$apiPostLogs$1, io2, statsigNetworkImpl$apiPostLogs$$inlined$postRequest$default$1) == enumC5000a) {
                        return enumC5000a;
                    }
                }
                return y.f36177a;
            }
        }
        statsigNetworkImpl$apiPostLogs$1 = new StatsigNetworkImpl$apiPostLogs$1(this, abstractC4825e);
        Object obj2 = statsigNetworkImpl$apiPostLogs$1.result;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = statsigNetworkImpl$apiPostLogs$1.label;
        if (i10 == 0) {
        }
        return y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0108 -> B:42:0x0109). Please submit an issue!!! */
    @Override // com.statsig.androidsdk.StatsigNetwork
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apiRetryFailedLogs(String str, AbstractC4825e abstractC4825e) {
        StatsigNetworkImpl$apiRetryFailedLogs$1 statsigNetworkImpl$apiRetryFailedLogs$1;
        int i10;
        Collection collection;
        StatsigNetworkImpl statsigNetworkImpl;
        String str2;
        String str3;
        Iterator it;
        List list;
        StatsigNetworkImpl statsigNetworkImpl2;
        String str4;
        StatsigNetworkImpl statsigNetworkImpl3;
        StatsigUtil statsigUtil;
        SharedPreferences sharedPreferences;
        String str5;
        StatsigNetworkImpl statsigNetworkImpl4;
        List list2;
        if (abstractC4825e instanceof StatsigNetworkImpl$apiRetryFailedLogs$1) {
            statsigNetworkImpl$apiRetryFailedLogs$1 = (StatsigNetworkImpl$apiRetryFailedLogs$1) abstractC4825e;
            int i11 = statsigNetworkImpl$apiRetryFailedLogs$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                statsigNetworkImpl$apiRetryFailedLogs$1.label = i11 - Integer.MIN_VALUE;
                Object obj = statsigNetworkImpl$apiRetryFailedLogs$1.result;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = statsigNetworkImpl$apiRetryFailedLogs$1.label;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    collection = (Collection) statsigNetworkImpl$apiRetryFailedLogs$1.L$5;
                                    it = (Iterator) statsigNetworkImpl$apiRetryFailedLogs$1.L$4;
                                    Collection collection2 = (Collection) statsigNetworkImpl$apiRetryFailedLogs$1.L$3;
                                    str3 = (String) statsigNetworkImpl$apiRetryFailedLogs$1.L$2;
                                    str2 = (String) statsigNetworkImpl$apiRetryFailedLogs$1.L$1;
                                    statsigNetworkImpl = (StatsigNetworkImpl) statsigNetworkImpl$apiRetryFailedLogs$1.L$0;
                                    N.B0(obj);
                                    collection.add(yVar);
                                    collection = collection2;
                                    if (!it.hasNext()) {
                                        String requestBody = ((StatsigOfflineRequest) it.next()).getRequestBody();
                                        statsigNetworkImpl$apiRetryFailedLogs$1.L$0 = statsigNetworkImpl;
                                        statsigNetworkImpl$apiRetryFailedLogs$1.L$1 = str2;
                                        statsigNetworkImpl$apiRetryFailedLogs$1.L$2 = str3;
                                        statsigNetworkImpl$apiRetryFailedLogs$1.L$3 = collection;
                                        statsigNetworkImpl$apiRetryFailedLogs$1.L$4 = it;
                                        statsigNetworkImpl$apiRetryFailedLogs$1.L$5 = collection;
                                        statsigNetworkImpl$apiRetryFailedLogs$1.label = 4;
                                        if (statsigNetworkImpl.apiPostLogs(str2, requestBody, str3, statsigNetworkImpl$apiRetryFailedLogs$1) == enumC5000a) {
                                            return enumC5000a;
                                        }
                                        collection2 = collection;
                                        collection.add(yVar);
                                        collection = collection2;
                                        if (!it.hasNext()) {
                                            List list3 = (List) collection;
                                            return yVar;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                list = (List) statsigNetworkImpl$apiRetryFailedLogs$1.L$2;
                                str4 = (String) statsigNetworkImpl$apiRetryFailedLogs$1.L$1;
                                statsigNetworkImpl2 = (StatsigNetworkImpl) statsigNetworkImpl$apiRetryFailedLogs$1.L$0;
                                N.B0(obj);
                                String valueOf = String.valueOf(list.size());
                                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                                str2 = str4;
                                statsigNetworkImpl = statsigNetworkImpl2;
                                it = list.iterator();
                                collection = arrayList;
                                str3 = valueOf;
                                if (!it.hasNext()) {
                                }
                            }
                        } else {
                            list = (List) statsigNetworkImpl$apiRetryFailedLogs$1.L$2;
                            str4 = (String) statsigNetworkImpl$apiRetryFailedLogs$1.L$1;
                            statsigNetworkImpl3 = (StatsigNetworkImpl) statsigNetworkImpl$apiRetryFailedLogs$1.L$0;
                            N.B0(obj);
                            statsigUtil = StatsigUtil.INSTANCE;
                            sharedPreferences = statsigNetworkImpl3.sharedPrefs;
                            str5 = statsigNetworkImpl3.offlineLogsKeyV2;
                            statsigNetworkImpl$apiRetryFailedLogs$1.L$0 = statsigNetworkImpl3;
                            statsigNetworkImpl$apiRetryFailedLogs$1.L$1 = str4;
                            statsigNetworkImpl$apiRetryFailedLogs$1.L$2 = list;
                            statsigNetworkImpl$apiRetryFailedLogs$1.label = 3;
                            if (statsigUtil.removeFromSharedPrefs$build_release(sharedPreferences, str5, statsigNetworkImpl$apiRetryFailedLogs$1) != enumC5000a) {
                                return enumC5000a;
                            }
                            statsigNetworkImpl2 = statsigNetworkImpl3;
                            String valueOf2 = String.valueOf(list.size());
                            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
                            str2 = str4;
                            statsigNetworkImpl = statsigNetworkImpl2;
                            it = list.iterator();
                            collection = arrayList2;
                            str3 = valueOf2;
                            if (!it.hasNext()) {
                            }
                        }
                    } else {
                        str = (String) statsigNetworkImpl$apiRetryFailedLogs$1.L$1;
                        statsigNetworkImpl4 = (StatsigNetworkImpl) statsigNetworkImpl$apiRetryFailedLogs$1.L$0;
                        N.B0(obj);
                    }
                } else {
                    N.B0(obj);
                    statsigNetworkImpl$apiRetryFailedLogs$1.L$0 = this;
                    statsigNetworkImpl$apiRetryFailedLogs$1.L$1 = str;
                    statsigNetworkImpl$apiRetryFailedLogs$1.label = 1;
                    obj = getSavedLogs(statsigNetworkImpl$apiRetryFailedLogs$1);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    statsigNetworkImpl4 = this;
                }
                list2 = (List) obj;
                if (!list2.isEmpty()) {
                    return yVar;
                }
                StatsigUtil statsigUtil2 = StatsigUtil.INSTANCE;
                SharedPreferences sharedPreferences2 = statsigNetworkImpl4.sharedPrefs;
                statsigNetworkImpl$apiRetryFailedLogs$1.L$0 = statsigNetworkImpl4;
                statsigNetworkImpl$apiRetryFailedLogs$1.L$1 = str;
                statsigNetworkImpl$apiRetryFailedLogs$1.L$2 = list2;
                statsigNetworkImpl$apiRetryFailedLogs$1.label = 2;
                if (statsigUtil2.removeFromSharedPrefs$build_release(sharedPreferences2, "StatsigNetwork.OFFLINE_LOGS", statsigNetworkImpl$apiRetryFailedLogs$1) == enumC5000a) {
                    return enumC5000a;
                }
                statsigNetworkImpl3 = statsigNetworkImpl4;
                str4 = str;
                list = list2;
                statsigUtil = StatsigUtil.INSTANCE;
                sharedPreferences = statsigNetworkImpl3.sharedPrefs;
                str5 = statsigNetworkImpl3.offlineLogsKeyV2;
                statsigNetworkImpl$apiRetryFailedLogs$1.L$0 = statsigNetworkImpl3;
                statsigNetworkImpl$apiRetryFailedLogs$1.L$1 = str4;
                statsigNetworkImpl$apiRetryFailedLogs$1.L$2 = list;
                statsigNetworkImpl$apiRetryFailedLogs$1.label = 3;
                if (statsigUtil.removeFromSharedPrefs$build_release(sharedPreferences, str5, statsigNetworkImpl$apiRetryFailedLogs$1) != enumC5000a) {
                }
            }
        }
        statsigNetworkImpl$apiRetryFailedLogs$1 = new StatsigNetworkImpl$apiRetryFailedLogs$1(this, abstractC4825e);
        Object obj2 = statsigNetworkImpl$apiRetryFailedLogs$1.result;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = statsigNetworkImpl$apiRetryFailedLogs$1.label;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        list2 = (List) obj2;
        if (!list2.isEmpty()) {
        }
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public Object initialize(String str, StatsigUser statsigUser, Long l10, StatsigMetadata statsigMetadata, long j6, SharedPreferences sharedPreferences, ContextType contextType, Diagnostics diagnostics, HashAlgorithm hashAlgorithm, Map<String, String> map, AbstractC4825e abstractC4825e) {
        this.sharedPrefs = sharedPreferences;
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 == 0) {
            return initializeImpl$default(this, str, statsigUser, l10, statsigMetadata, contextType, diagnostics, null, hashAlgorithm, map, abstractC4825e, 64, null);
        }
        StatsigNetworkImpl$initialize$2 statsigNetworkImpl$initialize$2 = new StatsigNetworkImpl$initialize$2(this, str, statsigUser, l10, statsigMetadata, contextType, diagnostics, j6, hashAlgorithm, map, null);
        if (i10 > 0) {
            Object b02 = J.b0(new K0(j6, abstractC4825e), statsigNetworkImpl$initialize$2);
            if (b02 == EnumC5000a.f41328Y) {
                N.k0(abstractC4825e);
            }
            return b02;
        }
        throw new J0("Timed out immediately", null);
    }

    @Override // com.statsig.androidsdk.StatsigNetwork
    public AbstractC1206i pollForChanges(String str, StatsigUser statsigUser, Long l10, StatsigMetadata statsigMetadata) {
        AbstractC3557B.c0("api", str);
        AbstractC3557B.c0("metadata", statsigMetadata);
        return new C1209l(new StatsigNetworkImpl$pollForChanges$1(statsigUser, statsigMetadata, l10, this, str, null));
    }
}
