package com.statsig.androidsdk;

import Ad.l;
import android.app.Application;
import android.content.Context;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import nf.C4832l;
import of.EnumC5000a;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b]\u0010EJ;\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\t\u001a\u00020\bH\u0007\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b&\u0010%J!\u0010)\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\b+\u0010*J!\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020-2\u0006\u0010,\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\b0\u0010/J\u0017\u00101\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b3\u00102J!\u00104\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\b4\u00105J)\u00107\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\b7\u00108J;\u0010>\u001a\u00020\r2\u0006\u00109\u001a\u00020\u00042\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\u0016\b\u0002\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010<H\u0007\u00a2\u0006\u0004\b>\u0010?J7\u0010>\u001a\u00020\r2\u0006\u00109\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0016\b\u0002\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010<H\u0007\u00a2\u0006\u0004\b>\u0010@J+\u0010>\u001a\u00020\r2\u0006\u00109\u001a\u00020\u00042\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040<H\u0007\u00a2\u0006\u0004\b>\u0010AJ%\u0010B\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007\u00a2\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\rH\u0007\u00a2\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\bJ\u00105J+\u0010K\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010<H\u0007\u00a2\u0006\u0004\bK\u0010AJ+\u0010L\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00042\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010<H\u0007\u00a2\u0006\u0004\bL\u0010AJ\u0017\u0010N\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\bN\u00102J\u000f\u0010O\u001a\u00020\rH\u0007\u00a2\u0006\u0004\bO\u0010EJ\u000f\u0010Q\u001a\u00020PH\u0007\u00a2\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\r2\u0006\u0010S\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bT\u00102R(\u0010V\u001a\u00020U8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\bV\u0010W\u0012\u0004\b\\\u0010E\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006^"}, d2 = {"Lcom/statsig/androidsdk/Statsig;", "", "Landroid/app/Application;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "", "sdkKey", "Lcom/statsig/androidsdk/StatsigUser;", "user", "Lcom/statsig/androidsdk/StatsigOptions;", "options", "Lcom/statsig/androidsdk/InitializationDetails;", "initialize", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/StatsigOptions;Lnf/e;)Ljava/lang/Object;", "Ljf/y;", "updateUser", "(Lcom/statsig/androidsdk/StatsigUser;Lnf/e;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/ExternalInitializeResponse;", "getInitializeResponseJson", "()Lcom/statsig/androidsdk/ExternalInitializeResponse;", "shutdownSuspend", "(Lnf/e;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "openDebugView", "(Landroid/content/Context;)V", "Lcom/statsig/androidsdk/IStatsigCallback;", "callback", "initializeAsync", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/IStatsigCallback;Lcom/statsig/androidsdk/StatsigOptions;)V", "gateName", "", "checkGate", "(Ljava/lang/String;)Z", "checkGateWithExposureLoggingDisabled", "configName", "Lcom/statsig/androidsdk/DynamicConfig;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "getConfigWithExposureLoggingDisabled", "experimentName", "keepDeviceValue", "getExperiment", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/DynamicConfig;", "getExperimentWithExposureLoggingDisabled", "layerName", "Lcom/statsig/androidsdk/Layer;", "getLayer", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/Layer;", "getLayerWithExposureLoggingDisabled", "manuallyLogGateExposure", "(Ljava/lang/String;)V", "manuallyLogConfigExposure", "manuallyLogExperimentExposure", "(Ljava/lang/String;Z)V", "parameterName", "manuallyLogLayerParameterExposure", "(Ljava/lang/String;Ljava/lang/String;Z)V", "eventName", "", "value", "", "metadata", "logEvent", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/util/Map;)V", "updateUserAsync", "(Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/IStatsigCallback;)V", "shutdown", "()V", "isInitialized", "()Z", "getStableID", "()Ljava/lang/String;", "overrideGate", "overrideConfig", "overrideLayer", "name", "removeOverride", "removeAllOverrides", "Lcom/statsig/androidsdk/StatsigOverrides;", "getAllOverrides", "()Lcom/statsig/androidsdk/StatsigOverrides;", "functionName", "enforceInitialized", "Lcom/statsig/androidsdk/StatsigClient;", "client", "Lcom/statsig/androidsdk/StatsigClient;", "getClient$build_release", "()Lcom/statsig/androidsdk/StatsigClient;", "setClient$build_release", "(Lcom/statsig/androidsdk/StatsigClient;)V", "getClient$build_release$annotations", "<init>", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class Statsig {
    public static final Statsig INSTANCE = new Statsig();
    private static StatsigClient client = new StatsigClient();

    private Statsig() {
    }

    public static final boolean checkGate(String str) {
        AbstractC3557B.c0("gateName", str);
        return client.checkGate(str);
    }

    public static final boolean checkGateWithExposureLoggingDisabled(String str) {
        AbstractC3557B.c0("gateName", str);
        return client.checkGateWithExposureLoggingDisabled(str);
    }

    private final void enforceInitialized(String str) {
        client.enforceInitialized$build_release(str);
    }

    public static final StatsigOverrides getAllOverrides() {
        return client.getAllOverrides();
    }

    public static /* synthetic */ void getClient$build_release$annotations() {
    }

    public static final DynamicConfig getConfig(String str) {
        AbstractC3557B.c0("configName", str);
        return client.getConfig(str);
    }

    public static final DynamicConfig getConfigWithExposureLoggingDisabled(String str) {
        AbstractC3557B.c0("configName", str);
        return client.getConfigWithExposureLoggingDisabled(str);
    }

    public static final DynamicConfig getExperiment(String str) {
        AbstractC3557B.c0("experimentName", str);
        return getExperiment$default(str, false, 2, null);
    }

    public static /* synthetic */ DynamicConfig getExperiment$default(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return getExperiment(str, z10);
    }

    public static final DynamicConfig getExperimentWithExposureLoggingDisabled(String str) {
        AbstractC3557B.c0("experimentName", str);
        return getExperimentWithExposureLoggingDisabled$default(str, false, 2, null);
    }

    public static /* synthetic */ DynamicConfig getExperimentWithExposureLoggingDisabled$default(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return getExperimentWithExposureLoggingDisabled(str, z10);
    }

    public static final Layer getLayer(String str) {
        AbstractC3557B.c0("layerName", str);
        return getLayer$default(str, false, 2, null);
    }

    public static /* synthetic */ Layer getLayer$default(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return getLayer(str, z10);
    }

    public static final Layer getLayerWithExposureLoggingDisabled(String str) {
        AbstractC3557B.c0("layerName", str);
        return getLayerWithExposureLoggingDisabled$default(str, false, 2, null);
    }

    public static /* synthetic */ Layer getLayerWithExposureLoggingDisabled$default(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return getLayerWithExposureLoggingDisabled(str, z10);
    }

    public static final String getStableID() {
        return client.getStableID();
    }

    public static /* synthetic */ Object initialize$default(Statsig statsig, Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, AbstractC4825e abstractC4825e, int i10, Object obj) {
        StatsigUser statsigUser2;
        StatsigOptions statsigOptions2;
        if ((i10 & 4) != 0) {
            statsigUser2 = null;
        } else {
            statsigUser2 = statsigUser;
        }
        if ((i10 & 8) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, 0L, false, null, false, null, false, null, 2047, null);
        } else {
            statsigOptions2 = statsigOptions;
        }
        return statsig.initialize(application, str, statsigUser2, statsigOptions2, abstractC4825e);
    }

    public static final void initializeAsync(Application application, String str) {
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, application);
        AbstractC3557B.c0("sdkKey", str);
        initializeAsync$default(application, str, null, null, null, 28, null);
    }

    public static /* synthetic */ void initializeAsync$default(Application application, String str, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, StatsigOptions statsigOptions, int i10, Object obj) {
        StatsigUser statsigUser2;
        String str2;
        Application application2;
        StatsigOptions statsigOptions2;
        IStatsigCallback iStatsigCallback2 = null;
        if ((i10 & 4) != 0) {
            statsigUser2 = null;
        } else {
            statsigUser2 = statsigUser;
        }
        if ((i10 & 8) == 0) {
            iStatsigCallback2 = iStatsigCallback;
        }
        if ((i10 & 16) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, 0L, false, null, false, null, false, null, 2047, null);
            application2 = application;
            str2 = str;
        } else {
            application2 = application;
            str2 = str;
            statsigOptions2 = statsigOptions;
        }
        initializeAsync(application2, str2, statsigUser2, iStatsigCallback2, statsigOptions2);
    }

    public static final boolean isInitialized() {
        return client.isInitialized();
    }

    public static final void logEvent(String str) {
        AbstractC3557B.c0("eventName", str);
        logEvent$default(str, (Double) null, (Map) null, 6, (Object) null);
    }

    public static /* synthetic */ void logEvent$default(String str, Double d10, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d10 = null;
        }
        if ((i10 & 4) != 0) {
            map = null;
        }
        logEvent(str, d10, map);
    }

    public static final void manuallyLogConfigExposure(String str) {
        AbstractC3557B.c0("configName", str);
        client.manuallyLogConfigExposure(str);
    }

    public static final void manuallyLogExperimentExposure(String str, boolean z10) {
        AbstractC3557B.c0("experimentName", str);
        client.manuallyLogExperimentExposure(str, z10);
    }

    public static /* synthetic */ void manuallyLogExperimentExposure$default(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        manuallyLogExperimentExposure(str, z10);
    }

    public static final void manuallyLogGateExposure(String str) {
        AbstractC3557B.c0("gateName", str);
        client.manuallyLogGateExposure(str);
    }

    public static final void manuallyLogLayerParameterExposure(String str, String str2, boolean z10) {
        AbstractC3557B.c0("layerName", str);
        AbstractC3557B.c0("parameterName", str2);
        client.manuallyLogLayerParameterExposure(str, str2, z10);
    }

    public static /* synthetic */ void manuallyLogLayerParameterExposure$default(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        manuallyLogLayerParameterExposure(str, str2, z10);
    }

    public static final void overrideConfig(String str, Map<String, ? extends Object> map) {
        AbstractC3557B.c0("configName", str);
        AbstractC3557B.c0("value", map);
        client.overrideConfig(str, map);
    }

    public static final void overrideGate(String str, boolean z10) {
        AbstractC3557B.c0("gateName", str);
        client.overrideGate(str, z10);
    }

    public static final void overrideLayer(String str, Map<String, ? extends Object> map) {
        AbstractC3557B.c0("layerName", str);
        AbstractC3557B.c0("value", map);
        client.overrideLayer(str, map);
    }

    public static final void removeAllOverrides() {
        client.removeAllOverrides();
    }

    public static final void removeOverride(String str) {
        AbstractC3557B.c0("name", str);
        client.removeOverride(str);
    }

    public static final void shutdown() {
        INSTANCE.enforceInitialized("shutdown");
        l.a1(C4832l.f40334Y, new Statsig$shutdown$1(null));
    }

    public static final void updateUserAsync(StatsigUser statsigUser, IStatsigCallback iStatsigCallback) {
        client.updateUserAsync(statsigUser, iStatsigCallback);
    }

    public static /* synthetic */ void updateUserAsync$default(StatsigUser statsigUser, IStatsigCallback iStatsigCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iStatsigCallback = null;
        }
        updateUserAsync(statsigUser, iStatsigCallback);
    }

    public final StatsigClient getClient$build_release() {
        return client;
    }

    public final ExternalInitializeResponse getInitializeResponseJson() {
        return client.getInitializeResponseJson();
    }

    public final /* synthetic */ Object initialize(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, AbstractC4825e abstractC4825e) {
        return getClient$build_release().initialize(application, str, statsigUser, statsigOptions, abstractC4825e);
    }

    public final void openDebugView(Context context) {
        AbstractC3557B.c0("context", context);
        client.openDebugView(context);
    }

    public final void setClient$build_release(StatsigClient statsigClient) {
        AbstractC3557B.c0("<set-?>", statsigClient);
        client = statsigClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shutdownSuspend(AbstractC4825e abstractC4825e) {
        Statsig$shutdownSuspend$1 statsig$shutdownSuspend$1;
        int i10;
        Statsig statsig;
        if (abstractC4825e instanceof Statsig$shutdownSuspend$1) {
            statsig$shutdownSuspend$1 = (Statsig$shutdownSuspend$1) abstractC4825e;
            int i11 = statsig$shutdownSuspend$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                statsig$shutdownSuspend$1.label = i11 - Integer.MIN_VALUE;
                Object obj = statsig$shutdownSuspend$1.result;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = statsig$shutdownSuspend$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        statsig = (Statsig) statsig$shutdownSuspend$1.L$0;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    StatsigClient client$build_release = getClient$build_release();
                    statsig$shutdownSuspend$1.L$0 = this;
                    statsig$shutdownSuspend$1.label = 1;
                    if (client$build_release.shutdownSuspend(statsig$shutdownSuspend$1) == enumC5000a) {
                        return enumC5000a;
                    }
                    statsig = this;
                }
                statsig.setClient$build_release(new StatsigClient());
                return y.f36177a;
            }
        }
        statsig$shutdownSuspend$1 = new Statsig$shutdownSuspend$1(this, abstractC4825e);
        Object obj2 = statsig$shutdownSuspend$1.result;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = statsig$shutdownSuspend$1.label;
        if (i10 == 0) {
        }
        statsig.setClient$build_release(new StatsigClient());
        return y.f36177a;
    }

    public final Object updateUser(StatsigUser statsigUser, AbstractC4825e abstractC4825e) {
        Object updateUser = getClient$build_release().updateUser(statsigUser, abstractC4825e);
        if (updateUser == EnumC5000a.f41328Y) {
            return updateUser;
        }
        return y.f36177a;
    }

    public static final DynamicConfig getExperiment(String str, boolean z10) {
        AbstractC3557B.c0("experimentName", str);
        return client.getExperiment(str, z10);
    }

    public static final DynamicConfig getExperimentWithExposureLoggingDisabled(String str, boolean z10) {
        AbstractC3557B.c0("experimentName", str);
        return client.getExperimentWithExposureLoggingDisabled(str, z10);
    }

    public static final Layer getLayer(String str, boolean z10) {
        AbstractC3557B.c0("layerName", str);
        return client.getLayer(str, z10);
    }

    public static final Layer getLayerWithExposureLoggingDisabled(String str, boolean z10) {
        AbstractC3557B.c0("layerName", str);
        return client.getLayerWithExposureLoggingDisabled(str, z10);
    }

    public static final void initializeAsync(Application application, String str, StatsigUser statsigUser) {
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, application);
        AbstractC3557B.c0("sdkKey", str);
        initializeAsync$default(application, str, statsigUser, null, null, 24, null);
    }

    public static final void logEvent(String str, Double d10) {
        AbstractC3557B.c0("eventName", str);
        logEvent$default(str, d10, (Map) null, 4, (Object) null);
    }

    public static /* synthetic */ void logEvent$default(String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = null;
        }
        logEvent(str, str2, map);
    }

    public static final void initializeAsync(Application application, String str, StatsigUser statsigUser, IStatsigCallback iStatsigCallback) {
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, application);
        AbstractC3557B.c0("sdkKey", str);
        initializeAsync$default(application, str, statsigUser, iStatsigCallback, null, 16, null);
    }

    public static final void logEvent(String str, String str2) {
        AbstractC3557B.c0("eventName", str);
        AbstractC3557B.c0("value", str2);
        logEvent$default(str, str2, (Map) null, 4, (Object) null);
    }

    public static final void initializeAsync(Application application, String str, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, StatsigOptions statsigOptions) {
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, application);
        AbstractC3557B.c0("sdkKey", str);
        AbstractC3557B.c0("options", statsigOptions);
        client.initializeAsync(application, str, statsigUser, iStatsigCallback, statsigOptions);
    }

    public static final void logEvent(String str, Double d10, Map<String, String> map) {
        AbstractC3557B.c0("eventName", str);
        client.logEvent(str, d10, map);
    }

    public static final void logEvent(String str, String str2, Map<String, String> map) {
        AbstractC3557B.c0("eventName", str);
        AbstractC3557B.c0("value", str2);
        client.logEvent(str, str2, map);
    }

    public static final void logEvent(String str, Map<String, String> map) {
        AbstractC3557B.c0("eventName", str);
        AbstractC3557B.c0("metadata", map);
        client.logEvent(str, (Double) null, map);
    }
}
