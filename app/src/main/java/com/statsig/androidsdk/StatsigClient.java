package com.statsig.androidsdk;

import Ad.l;
import Bi.c;
import Lg.n;
import Ng.AbstractC1073l0;
import Ng.AbstractC1085t;
import Ng.B;
import Ng.D;
import Ng.F;
import Ng.v0;
import Sg.C1394f;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.statsig.androidsdk.InitializeResponse;
import com.statsig.androidsdk.Marker;
import id.AbstractC3557B;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.y;
import kotlin.Metadata;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import nf.C4832l;
import o9.C4957e;
import of.EnumC5000a;

@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\b\u00a2\u0006\u0005\b\u00c5\u0001\u00109J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004\u00a2\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0013\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0013\u00a2\u0006\u0004\b \u0010\u001fJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0013\u00a2\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u0013\u00a2\u0006\u0004\b%\u0010$J9\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010)\u00a2\u0006\u0004\b+\u0010,J5\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010)\u00a2\u0006\u0004\b+\u0010-J)\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040)\u00a2\u0006\u0004\b+\u0010.J#\u0010/\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b1\u00102J\r\u00104\u001a\u000203\u00a2\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\f\u00a2\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0013\u00a2\u0006\u0004\b:\u0010;J)\u0010=\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020<0)\u00a2\u0006\u0004\b=\u0010.J)\u0010>\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020<0)\u00a2\u0006\u0004\b>\u0010.J\u0015\u0010@\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u0004\u00a2\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\f\u00a2\u0006\u0004\bB\u00109J\r\u0010C\u001a\u00020\u0004\u00a2\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0004\u00a2\u0006\u0004\bE\u0010AJ\u0015\u0010F\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0004\u00a2\u0006\u0004\bF\u0010AJ\u001d\u0010G\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0013\u00a2\u0006\u0004\bG\u0010;J%\u0010I\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0013\u00a2\u0006\u0004\bI\u0010JJ\r\u0010L\u001a\u00020K\u00a2\u0006\u0004\bL\u0010MJ\u0015\u0010P\u001a\u00020\f2\u0006\u0010O\u001a\u00020N\u00a2\u0006\u0004\bP\u0010QJ\u001b\u0010S\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0004\bR\u00102J)\u0010X\u001a\u00020\f2\u0006\u0010T\u001a\u00020\"2\u0006\u0010H\u001a\u00020\u00042\b\b\u0002\u0010U\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\bV\u0010WJ\u000f\u0010\\\u001a\u00020YH\u0000\u00a2\u0006\u0004\bZ\u0010[J\r\u0010]\u001a\u00020\u0013\u00a2\u0006\u0004\b]\u0010^J\u0017\u0010a\u001a\u00020\f2\u0006\u0010_\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b`\u0010AJ\u000f\u0010e\u001a\u00020bH\u0000\u00a2\u0006\u0004\bc\u0010dJ#\u0010i\u001a\u00020\f2\u0006\u0010f\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0080@\u00f8\u0001\u0000\u00a2\u0006\u0004\bg\u0010hJ\u000f\u0010j\u001a\u00020\fH\u0016\u00a2\u0006\u0004\bj\u00109J\u000f\u0010k\u001a\u00020\fH\u0016\u00a2\u0006\u0004\bk\u00109J5\u0010l\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\bl\u0010mJ\u0019\u0010n\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\bn\u0010oJ\u0013\u0010p\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\bp\u00107J)\u0010r\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010q\u001a\u00020\u00182\b\b\u0002\u0010U\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\br\u0010sJ)\u0010r\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010u\u001a\u00020t2\b\b\u0002\u0010U\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\br\u0010vJ\u000f\u0010w\u001a\u00020\fH\u0002\u00a2\u0006\u0004\bw\u00109J\u000f\u0010x\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bx\u0010DJ\u0019\u0010y\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\by\u0010zJ\u000f\u0010{\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b{\u00109J\u000f\u0010|\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b|\u00109J\u0013\u0010}\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\b}\u00107J.\u0010\u0082\u0001\u001a\u00020\f2\u0006\u0010~\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u007f2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0002\u00a2\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J-\u0010\u0087\u0001\u001a\u00020\f2\u0006\u0010O\u001a\u00020\u007f2\u0011\u0010\u0086\u0001\u001a\f\u0018\u00010\u0084\u0001j\u0005\u0018\u0001`\u0085\u0001H\u0002\u00a2\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020Y8\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\b\u0007\u0010\u008b\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\b\u0003\u0010\u008c\u0001R\u0017\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\b\u0005\u0010\u008d\u0001R\u001a\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002@\u0002X\u0082.\u00a2\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001a\u0010\u00a1\u0001\u001a\u00030\u00a0\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a1\u0001\u0010\u00a2\u0001R*\u0010\u00a4\u0001\u001a\u00030\u00a3\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\b\u00a4\u0001\u0010\u00a5\u0001\u001a\u0006\b\u00a6\u0001\u0010\u00a7\u0001\"\u0006\b\u00a8\u0001\u0010\u00a9\u0001R\u001c\u0010\u00ab\u0001\u001a\u0005\u0018\u00010\u00aa\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00ab\u0001\u0010\u00ac\u0001R\u001a\u0010\u00ae\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00ae\u0001\u0010\u00af\u0001R\u001a\u0010\u00b1\u0001\u001a\u00030\u00b0\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00b1\u0001\u0010\u00b2\u0001R\u001a\u0010\u00b4\u0001\u001a\u00030\u00b3\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00b4\u0001\u0010\u00b5\u0001R\u001a\u0010\u00b6\u0001\u001a\u00030\u00b3\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00b6\u0001\u0010\u00b5\u0001R1\u0010\u00b8\u0001\u001a\u00030\u00b7\u00018\u0000@\u0000X\u0081.\u00a2\u0006\u001f\n\u0006\b\u00b8\u0001\u0010\u00b9\u0001\u0012\u0005\b\u00be\u0001\u00109\u001a\u0006\b\u00ba\u0001\u0010\u00bb\u0001\"\u0006\b\u00bc\u0001\u0010\u00bd\u0001R.\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0081.\u00a2\u0006\u001e\n\u0005\b\u000b\u0010\u00bf\u0001\u0012\u0005\b\u00c4\u0001\u00109\u001a\u0006\b\u00c0\u0001\u0010\u00c1\u0001\"\u0006\b\u00c2\u0001\u0010\u00c3\u0001\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00c6\u0001"}, d2 = {"Lcom/statsig/androidsdk/StatsigClient;", "Lcom/statsig/androidsdk/LifecycleEventListener;", "Landroid/app/Application;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "", "sdkKey", "Lcom/statsig/androidsdk/StatsigUser;", "user", "Lcom/statsig/androidsdk/IStatsigCallback;", "callback", "Lcom/statsig/androidsdk/StatsigOptions;", "options", "Ljf/y;", "initializeAsync", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/IStatsigCallback;Lcom/statsig/androidsdk/StatsigOptions;)V", "Lcom/statsig/androidsdk/InitializationDetails;", "initialize", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/StatsigOptions;Lnf/e;)Ljava/lang/Object;", "gateName", "", "checkGate", "(Ljava/lang/String;)Z", "checkGateWithExposureLoggingDisabled", "configName", "Lcom/statsig/androidsdk/DynamicConfig;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "getConfigWithExposureLoggingDisabled", "experimentName", "keepDeviceValue", "getExperiment", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/DynamicConfig;", "getExperimentWithExposureLoggingDisabled", "layerName", "Lcom/statsig/androidsdk/Layer;", "getLayer", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/Layer;", "getLayerWithExposureLoggingDisabled", "eventName", "", "value", "", "metadata", "logEvent", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/util/Map;)V", "updateUserAsync", "(Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/IStatsigCallback;)V", "updateUser", "(Lcom/statsig/androidsdk/StatsigUser;Lnf/e;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/ExternalInitializeResponse;", "getInitializeResponseJson", "()Lcom/statsig/androidsdk/ExternalInitializeResponse;", "shutdownSuspend", "(Lnf/e;)Ljava/lang/Object;", "shutdown", "()V", "overrideGate", "(Ljava/lang/String;Z)V", "", "overrideConfig", "overrideLayer", "name", "removeOverride", "(Ljava/lang/String;)V", "removeAllOverrides", "getStableID", "()Ljava/lang/String;", "manuallyLogGateExposure", "manuallyLogConfigExposure", "manuallyLogExperimentExposure", "parameterName", "manuallyLogLayerParameterExposure", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/statsig/androidsdk/StatsigOverrides;", "getAllOverrides", "()Lcom/statsig/androidsdk/StatsigOverrides;", "Landroid/content/Context;", "context", "openDebugView", "(Landroid/content/Context;)V", "setupAsync$build_release", "setupAsync", "layer", "isManual", "logLayerParameterExposure$build_release", "(Lcom/statsig/androidsdk/Layer;Ljava/lang/String;Z)V", "logLayerParameterExposure", "Lcom/statsig/androidsdk/Store;", "getStore$build_release", "()Lcom/statsig/androidsdk/Store;", "getStore", "isInitialized", "()Z", "functionName", "enforceInitialized$build_release", "enforceInitialized", "Landroid/content/SharedPreferences;", "getSharedPrefs$build_release", "()Landroid/content/SharedPreferences;", "getSharedPrefs", SubscriberAttributeKt.JSON_NAME_KEY, "saveStringToSharedPrefs$build_release", "(Ljava/lang/String;Ljava/lang/String;Lnf/e;)Ljava/lang/Object;", "saveStringToSharedPrefs", "onAppFocus", "onAppBlur", "setup", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/StatsigOptions;)Lcom/statsig/androidsdk/StatsigUser;", "updateUserCache", "(Lcom/statsig/androidsdk/StatsigUser;)V", "updateUserImpl", "config", "logExposure", "(Ljava/lang/String;Lcom/statsig/androidsdk/DynamicConfig;Z)V", "Lcom/statsig/androidsdk/FeatureGate;", "gate", "(Ljava/lang/String;Lcom/statsig/androidsdk/FeatureGate;Z)V", "updateStickyValues", "getLocalStorageStableID", "normalizeUser", "(Lcom/statsig/androidsdk/StatsigUser;)Lcom/statsig/androidsdk/StatsigUser;", "pollForUpdates", "populateStatsigMetadata", "shutdownImpl", "success", "Lcom/statsig/androidsdk/ContextType;", "Lcom/statsig/androidsdk/InitializeResponse;", "initResponse", "logEndDiagnostics", "(ZLcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/InitializeResponse;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "logEndDiagnosticsWhenException", "(Lcom/statsig/androidsdk/ContextType;Ljava/lang/Exception;)V", ProductResponseJsonKeys.STORE, "Lcom/statsig/androidsdk/Store;", "Lcom/statsig/androidsdk/StatsigUser;", "Landroid/app/Application;", "Ljava/lang/String;", "Lcom/statsig/androidsdk/StatsigActivityLifecycleListener;", "lifecycleListener", "Lcom/statsig/androidsdk/StatsigActivityLifecycleListener;", "Lcom/statsig/androidsdk/StatsigLogger;", "logger", "Lcom/statsig/androidsdk/StatsigLogger;", "Lcom/statsig/androidsdk/StatsigMetadata;", "statsigMetadata", "Lcom/statsig/androidsdk/StatsigMetadata;", "LNg/D;", "exceptionHandler", "LNg/D;", "LNg/F;", "statsigScope", "LNg/F;", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "Lcom/statsig/androidsdk/Diagnostics;", "", "initTime", "J", "Lcom/statsig/androidsdk/ErrorBoundary;", "errorBoundary", "Lcom/statsig/androidsdk/ErrorBoundary;", "getErrorBoundary$build_release", "()Lcom/statsig/androidsdk/ErrorBoundary;", "setErrorBoundary$build_release", "(Lcom/statsig/androidsdk/ErrorBoundary;)V", "LNg/l0;", "pollingJob", "LNg/l0;", "LNg/t;", "statsigJob", "LNg/t;", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isBootstrapped", "Lcom/statsig/androidsdk/StatsigNetwork;", "statsigNetwork", "Lcom/statsig/androidsdk/StatsigNetwork;", "getStatsigNetwork$build_release", "()Lcom/statsig/androidsdk/StatsigNetwork;", "setStatsigNetwork$build_release", "(Lcom/statsig/androidsdk/StatsigNetwork;)V", "getStatsigNetwork$build_release$annotations", "Lcom/statsig/androidsdk/StatsigOptions;", "getOptions$build_release", "()Lcom/statsig/androidsdk/StatsigOptions;", "setOptions$build_release", "(Lcom/statsig/androidsdk/StatsigOptions;)V", "getOptions$build_release$annotations", "<init>", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StatsigClient implements LifecycleEventListener {
    private Application application;
    private Diagnostics diagnostics;
    private D exceptionHandler;
    private StatsigActivityLifecycleListener lifecycleListener;
    private StatsigLogger logger;
    public StatsigOptions options;
    private AbstractC1073l0 pollingJob;
    private String sdkKey;
    private StatsigMetadata statsigMetadata;
    public StatsigNetwork statsigNetwork;
    private F statsigScope;
    private Store store;
    private StatsigUser user;
    private long initTime = System.currentTimeMillis();
    private ErrorBoundary errorBoundary = new ErrorBoundary();
    private AbstractC1085t statsigJob = c.z();
    private CoroutineDispatcherProvider dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);
    private AtomicBoolean initialized = new AtomicBoolean(false);
    private AtomicBoolean isBootstrapped = new AtomicBoolean(false);

    public static /* synthetic */ DynamicConfig getExperiment$default(StatsigClient statsigClient, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return statsigClient.getExperiment(str, z10);
    }

    public static /* synthetic */ DynamicConfig getExperimentWithExposureLoggingDisabled$default(StatsigClient statsigClient, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return statsigClient.getExperimentWithExposureLoggingDisabled(str, z10);
    }

    public static /* synthetic */ Layer getLayer$default(StatsigClient statsigClient, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return statsigClient.getLayer(str, z10);
    }

    public static /* synthetic */ Layer getLayerWithExposureLoggingDisabled$default(StatsigClient statsigClient, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return statsigClient.getLayerWithExposureLoggingDisabled(str, z10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    private final String getLocalStorageStableID() {
        ?? obj = new Object();
        String string = getSharedPrefs$build_release().getString("STABLE_ID", null);
        obj.f37622Y = string;
        if (string == null) {
            obj.f37622Y = UUID.randomUUID().toString();
            F f6 = this.statsigScope;
            if (f6 != null) {
                l.O0(f6, null, null, new StatsigClient$getLocalStorageStableID$1(this, obj, null), 3);
            } else {
                AbstractC3557B.C2("statsigScope");
                throw null;
            }
        }
        return (String) obj.f37622Y;
    }

    public static /* synthetic */ void getOptions$build_release$annotations() {
    }

    public static /* synthetic */ void getStatsigNetwork$build_release$annotations() {
    }

    public static /* synthetic */ Object initialize$default(StatsigClient statsigClient, Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, AbstractC4825e abstractC4825e, int i10, Object obj) {
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
        return statsigClient.initialize(application, str, statsigUser2, statsigOptions2, abstractC4825e);
    }

    public static /* synthetic */ void initializeAsync$default(StatsigClient statsigClient, Application application, String str, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, StatsigOptions statsigOptions, int i10, Object obj) {
        StatsigUser statsigUser2;
        IStatsigCallback iStatsigCallback2;
        StatsigOptions statsigOptions2;
        if ((i10 & 4) != 0) {
            statsigUser2 = null;
        } else {
            statsigUser2 = statsigUser;
        }
        if ((i10 & 8) != 0) {
            iStatsigCallback2 = null;
        } else {
            iStatsigCallback2 = iStatsigCallback;
        }
        if ((i10 & 16) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, 0L, false, null, false, null, false, null, 2047, null);
        } else {
            statsigOptions2 = statsigOptions;
        }
        statsigClient.initializeAsync(application, str, statsigUser2, iStatsigCallback2, statsigOptions2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEndDiagnostics(boolean z10, ContextType contextType, InitializeResponse initializeResponse) {
        Marker.ErrorMessage errorMessage;
        Diagnostics diagnostics = this.diagnostics;
        if (diagnostics != null) {
            KeyType keyType = KeyType.OVERALL;
            Store store = this.store;
            if (store != null) {
                EvaluationDetails globalEvaluationDetails$build_release = store.getGlobalEvaluationDetails$build_release();
                if (initializeResponse instanceof InitializeResponse.FailedInitializeResponse) {
                    errorMessage = Diagnostics.Companion.formatFailedResponse((InitializeResponse.FailedInitializeResponse) initializeResponse);
                } else {
                    errorMessage = null;
                }
                Diagnostics.markEnd$default(diagnostics, keyType, z10, null, new Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, globalEvaluationDetails$build_release, errorMessage, null, 163839, null), contextType, 4, null);
                StatsigLogger statsigLogger = this.logger;
                if (statsigLogger != null) {
                    statsigLogger.logDiagnostics(contextType);
                    return;
                } else {
                    AbstractC3557B.C2("logger");
                    throw null;
                }
            }
            AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
            throw null;
        }
        AbstractC3557B.C2("diagnostics");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEndDiagnosticsWhenException(ContextType contextType, Exception exc) {
        String str;
        String str2;
        try {
            Diagnostics diagnostics = this.diagnostics;
            if (diagnostics != null && this.logger != null) {
                KeyType keyType = KeyType.OVERALL;
                StringBuilder sb2 = new StringBuilder();
                if (exc == null) {
                    str = null;
                } else {
                    str = exc.getClass().getName();
                }
                sb2.append((Object) str);
                sb2.append(": ");
                if (exc == null) {
                    str2 = null;
                } else {
                    str2 = exc.getMessage();
                }
                sb2.append((Object) str2);
                Diagnostics.markEnd$default(diagnostics, keyType, false, null, new Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Marker.ErrorMessage(sb2.toString(), null, null, 6, null), null, 196607, null), contextType, 4, null);
                StatsigLogger statsigLogger = this.logger;
                if (statsigLogger != null) {
                    statsigLogger.logDiagnostics(contextType);
                    l.a1(C4832l.f40334Y, new StatsigClient$logEndDiagnosticsWhenException$3(this, null));
                    return;
                }
                AbstractC3557B.C2("logger");
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$default(StatsigClient statsigClient, String str, Double d10, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d10 = null;
        }
        if ((i10 & 4) != 0) {
            map = null;
        }
        statsigClient.logEvent(str, d10, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logExposure(String str, DynamicConfig dynamicConfig, boolean z10) {
        StatsigLogger statsigLogger = this.logger;
        if (statsigLogger == null) {
            AbstractC3557B.C2("logger");
            throw null;
        }
        StatsigUser statsigUser = this.user;
        if (statsigUser != null) {
            statsigLogger.logExposure(str, dynamicConfig, statsigUser, z10);
        } else {
            AbstractC3557B.C2("user");
            throw null;
        }
    }

    public static /* synthetic */ void logExposure$default(StatsigClient statsigClient, String str, DynamicConfig dynamicConfig, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        statsigClient.logExposure(str, dynamicConfig, z10);
    }

    public static /* synthetic */ void logLayerParameterExposure$build_release$default(StatsigClient statsigClient, Layer layer, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        statsigClient.logLayerParameterExposure$build_release(layer, str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StatsigUser normalizeUser(StatsigUser statsigUser) {
        StatsigUser statsigUser2 = new StatsigUser(null);
        if (statsigUser != null) {
            statsigUser2 = statsigUser.getCopyForEvaluation$build_release();
        }
        statsigUser2.setStatsigEnvironment$build_release(getOptions$build_release().getEnvironment());
        return statsigUser2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pollForUpdates() {
        if (!getOptions$build_release().getEnableAutoValueUpdate()) {
            return;
        }
        AbstractC1073l0 abstractC1073l0 = this.pollingJob;
        if (abstractC1073l0 != null) {
            abstractC1073l0.k(null);
        }
        Store store = this.store;
        if (store != null) {
            StatsigUser statsigUser = this.user;
            if (statsigUser != null) {
                Long lastUpdateTime = store.getLastUpdateTime(statsigUser);
                StatsigNetwork statsigNetwork$build_release = getStatsigNetwork$build_release();
                String api = getOptions$build_release().getApi();
                StatsigUser statsigUser2 = this.user;
                if (statsigUser2 != null) {
                    StatsigMetadata statsigMetadata = this.statsigMetadata;
                    if (statsigMetadata != null) {
                        C4957e I02 = L4.a.I0(new StatsigClient$pollForUpdates$1(this, null), statsigNetwork$build_release.pollForChanges(api, statsigUser2, lastUpdateTime, statsigMetadata));
                        F f6 = this.statsigScope;
                        if (f6 != null) {
                            this.pollingJob = L4.a.E0(I02, f6);
                            return;
                        } else {
                            AbstractC3557B.C2("statsigScope");
                            throw null;
                        }
                    }
                    AbstractC3557B.C2("statsigMetadata");
                    throw null;
                }
                AbstractC3557B.C2("user");
                throw null;
            }
            AbstractC3557B.C2("user");
            throw null;
        }
        AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
        throw null;
    }

    private final void populateStatsigMetadata() {
        StatsigMetadata statsigMetadata = this.statsigMetadata;
        if (statsigMetadata != null) {
            statsigMetadata.overrideStableID$build_release(getOptions$build_release().getOverrideStableID());
            try {
                Application application = this.application;
                if (application != null) {
                    if (application.getPackageManager() != null) {
                        Application application2 = this.application;
                        if (application2 != null) {
                            PackageManager packageManager = application2.getPackageManager();
                            Application application3 = this.application;
                            if (application3 != null) {
                                PackageInfo packageInfo = packageManager.getPackageInfo(application3.getPackageName(), 0);
                                AbstractC3557B.b0("application.packageManager.getPackageInfo(application.packageName, 0)", packageInfo);
                                StatsigMetadata statsigMetadata2 = this.statsigMetadata;
                                if (statsigMetadata2 != null) {
                                    statsigMetadata2.setAppVersion(packageInfo.versionName);
                                    StatsigMetadata statsigMetadata3 = this.statsigMetadata;
                                    if (statsigMetadata3 != null) {
                                        statsigMetadata3.setAppIdentifier(packageInfo.packageName);
                                        return;
                                    } else {
                                        AbstractC3557B.C2("statsigMetadata");
                                        throw null;
                                    }
                                }
                                AbstractC3557B.C2("statsigMetadata");
                                throw null;
                            }
                            AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                            throw null;
                        }
                        AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                        throw null;
                    }
                    return;
                }
                AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                throw null;
            } catch (PackageManager.NameNotFoundException unused) {
                return;
            }
        }
        AbstractC3557B.C2("statsigMetadata");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StatsigUser setup(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions) {
        if (!n.I2(str, "client-", false) && !n.I2(str, "test-", false)) {
            throw new IllegalArgumentException("Invalid SDK Key provided.  You must provide a client SDK Key from the API Key page of your Statsig console");
        }
        this.initTime = System.currentTimeMillis();
        Diagnostics diagnostics = new Diagnostics(statsigOptions.getDisableDiagnosticsLogging());
        this.diagnostics = diagnostics;
        Diagnostics.markStart$default(diagnostics, KeyType.OVERALL, null, null, null, 14, null);
        this.application = application;
        this.sdkKey = str;
        setOptions$build_release(statsigOptions);
        StatsigUser normalizeUser = normalizeUser(statsigUser);
        Map<String, ? extends Object> initializeValues = statsigOptions.getInitializeValues();
        this.user = normalizeUser;
        if (this.statsigNetwork == null) {
            setStatsigNetwork$build_release(StatsigNetworkKt.StatsigNetwork(application, str, this.errorBoundary));
        }
        StatsigMetadata statsigMetadata = new StatsigMetadata(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        this.statsigMetadata = statsigMetadata;
        this.errorBoundary.setMetadata(statsigMetadata);
        ErrorBoundary errorBoundary = this.errorBoundary;
        Diagnostics diagnostics2 = this.diagnostics;
        if (diagnostics2 != null) {
            errorBoundary.setDiagnostics(diagnostics2);
            this.exceptionHandler = this.errorBoundary.getExceptionHandler();
            AbstractC1085t abstractC1085t = this.statsigJob;
            B main = this.dispatcherProvider.getMain();
            v0 v0Var = (v0) abstractC1085t;
            v0Var.getClass();
            AbstractC4831k Q02 = AbstractC4344b.Q0(v0Var, main);
            D d10 = this.exceptionHandler;
            if (d10 != null) {
                C1394f g10 = l.g(Q02.plus(d10));
                this.statsigScope = g10;
                this.store = new Store(g10, getSharedPrefs$build_release(), normalizeUser, str);
                this.initialized.set(true);
                this.lifecycleListener = new StatsigActivityLifecycleListener(application, this);
                F f6 = this.statsigScope;
                if (f6 != null) {
                    String eventLoggingAPI = statsigOptions.getEventLoggingAPI();
                    StatsigMetadata statsigMetadata2 = this.statsigMetadata;
                    if (statsigMetadata2 != null) {
                        StatsigNetwork statsigNetwork$build_release = getStatsigNetwork$build_release();
                        Diagnostics diagnostics3 = this.diagnostics;
                        if (diagnostics3 != null) {
                            this.logger = new StatsigLogger(f6, str, eventLoggingAPI, statsigMetadata2, statsigNetwork$build_release, normalizeUser, diagnostics3);
                            populateStatsigMetadata();
                            if (statsigOptions.getOverrideStableID() == null) {
                                String localStorageStableID = getLocalStorageStableID();
                                StatsigMetadata statsigMetadata3 = this.statsigMetadata;
                                if (statsigMetadata3 != null) {
                                    statsigMetadata3.overrideStableID$build_release(localStorageStableID);
                                } else {
                                    AbstractC3557B.C2("statsigMetadata");
                                    throw null;
                                }
                            }
                            if (!getOptions$build_release().getLoadCacheAsync()) {
                                Store store = this.store;
                                if (store != null) {
                                    store.syncLoadFromLocalStorage();
                                } else {
                                    AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                                    throw null;
                                }
                            }
                            if (initializeValues != null) {
                                Store store2 = this.store;
                                if (store2 != null) {
                                    StatsigUser statsigUser2 = this.user;
                                    if (statsigUser2 != null) {
                                        store2.bootstrap(initializeValues, statsigUser2);
                                        this.isBootstrapped.set(true);
                                    } else {
                                        AbstractC3557B.C2("user");
                                        throw null;
                                    }
                                } else {
                                    AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
                                    throw null;
                                }
                            }
                            return normalizeUser;
                        }
                        AbstractC3557B.C2("diagnostics");
                        throw null;
                    }
                    AbstractC3557B.C2("statsigMetadata");
                    throw null;
                }
                AbstractC3557B.C2("statsigScope");
                throw null;
            }
            AbstractC3557B.C2("exceptionHandler");
            throw null;
        }
        AbstractC3557B.C2("diagnostics");
        throw null;
    }

    public static /* synthetic */ StatsigUser setup$default(StatsigClient statsigClient, Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, int i10, Object obj) {
        StatsigUser statsigUser2;
        String str2;
        Application application2;
        StatsigClient statsigClient2;
        StatsigOptions statsigOptions2;
        if ((i10 & 4) != 0) {
            statsigUser2 = null;
        } else {
            statsigUser2 = statsigUser;
        }
        if ((i10 & 8) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, 0L, false, null, false, null, false, null, 2047, null);
            statsigClient2 = statsigClient;
            application2 = application;
            str2 = str;
        } else {
            statsigClient2 = statsigClient;
            application2 = application;
            str2 = str;
            statsigOptions2 = statsigOptions;
        }
        return statsigClient2.setup(application2, str2, statsigUser2, statsigOptions2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shutdownImpl(AbstractC4825e abstractC4825e) {
        StatsigClient$shutdownImpl$1 statsigClient$shutdownImpl$1;
        int i10;
        StatsigClient statsigClient;
        StatsigActivityLifecycleListener statsigActivityLifecycleListener;
        if (abstractC4825e instanceof StatsigClient$shutdownImpl$1) {
            statsigClient$shutdownImpl$1 = (StatsigClient$shutdownImpl$1) abstractC4825e;
            int i11 = statsigClient$shutdownImpl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                statsigClient$shutdownImpl$1.label = i11 - Integer.MIN_VALUE;
                Object obj = statsigClient$shutdownImpl$1.result;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = statsigClient$shutdownImpl$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        statsigClient = (StatsigClient) statsigClient$shutdownImpl$1.L$0;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    AbstractC1073l0 abstractC1073l0 = this.pollingJob;
                    if (abstractC1073l0 != null) {
                        abstractC1073l0.k(null);
                    }
                    StatsigLogger statsigLogger = this.logger;
                    if (statsigLogger != null) {
                        statsigClient$shutdownImpl$1.L$0 = this;
                        statsigClient$shutdownImpl$1.label = 1;
                        if (statsigLogger.shutdown(statsigClient$shutdownImpl$1) == enumC5000a) {
                            return enumC5000a;
                        }
                        statsigClient = this;
                    } else {
                        AbstractC3557B.C2("logger");
                        throw null;
                    }
                }
                statsigActivityLifecycleListener = statsigClient.lifecycleListener;
                if (statsigActivityLifecycleListener == null) {
                    statsigActivityLifecycleListener.shutdown();
                    statsigClient.initialized = new AtomicBoolean();
                    statsigClient.isBootstrapped = new AtomicBoolean();
                    statsigClient.setErrorBoundary$build_release(new ErrorBoundary());
                    statsigClient.statsigJob = c.z();
                    return y.f36177a;
                }
                AbstractC3557B.C2("lifecycleListener");
                throw null;
            }
        }
        statsigClient$shutdownImpl$1 = new StatsigClient$shutdownImpl$1(this, abstractC4825e);
        Object obj2 = statsigClient$shutdownImpl$1.result;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = statsigClient$shutdownImpl$1.label;
        if (i10 == 0) {
        }
        statsigActivityLifecycleListener = statsigClient.lifecycleListener;
        if (statsigActivityLifecycleListener == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStickyValues() {
        F f6 = this.statsigScope;
        if (f6 != null) {
            l.O0(f6, this.dispatcherProvider.getIo(), null, new StatsigClient$updateStickyValues$1(this, null), 2);
        } else {
            AbstractC3557B.C2("statsigScope");
            throw null;
        }
    }

    public static /* synthetic */ void updateUserAsync$default(StatsigClient statsigClient, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iStatsigCallback = null;
        }
        statsigClient.updateUserAsync(statsigUser, iStatsigCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUserCache(StatsigUser statsigUser) {
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$updateUserCache$1(this, statsigUser), null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateUserImpl(AbstractC4825e abstractC4825e) {
        Object n12 = l.n1(abstractC4825e, this.dispatcherProvider.getIo(), new StatsigClient$updateUserImpl$2(this, null));
        if (n12 == EnumC5000a.f41328Y) {
            return n12;
        }
        return y.f36177a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.internal.x] */
    public final boolean checkGate(String str) {
        AbstractC3557B.c0("gateName", str);
        enforceInitialized$build_release("checkGate");
        ?? obj = new Object();
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$checkGate$1(this, str, obj), "checkGate", null, str, 4, null);
        return obj.f37645Y;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.internal.x] */
    public final boolean checkGateWithExposureLoggingDisabled(String str) {
        AbstractC3557B.c0("gateName", str);
        enforceInitialized$build_release("checkGateWithExposureLoggingDisabled");
        ?? obj = new Object();
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$checkGateWithExposureLoggingDisabled$1(this, str, obj), "checkGateWithExposureLoggingDisabled", null, str, 4, null);
        return obj.f37645Y;
    }

    public final void enforceInitialized$build_release(String str) {
        AbstractC3557B.c0("functionName", str);
        if (this.initialized.get()) {
            return;
        }
        throw new IllegalStateException(AbstractC3557B.v2("The SDK must be initialized prior to invoking ", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final StatsigOverrides getAllOverrides() {
        ?? obj = new Object();
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$getAllOverrides$1(obj, this), null, null, null, 14, null);
        StatsigOverrides statsigOverrides = (StatsigOverrides) obj.f37622Y;
        if (statsigOverrides == null) {
            return StatsigOverrides.Companion.empty();
        }
        return statsigOverrides;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final DynamicConfig getConfig(String str) {
        AbstractC3557B.c0("configName", str);
        enforceInitialized$build_release("getConfig");
        ?? obj = new Object();
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$getConfig$1(obj, this, str), "getConfig", null, str, 4, null);
        DynamicConfig dynamicConfig = (DynamicConfig) obj.f37622Y;
        if (dynamicConfig == null) {
            return DynamicConfig.Companion.getUninitialized(str);
        }
        return dynamicConfig;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final DynamicConfig getConfigWithExposureLoggingDisabled(String str) {
        AbstractC3557B.c0("configName", str);
        enforceInitialized$build_release("getConfigWithExposureLoggingDisabled");
        ?? obj = new Object();
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$getConfigWithExposureLoggingDisabled$1(obj, this, str), "getConfigWithExposureLoggingDisabled", null, str, 4, null);
        DynamicConfig dynamicConfig = (DynamicConfig) obj.f37622Y;
        if (dynamicConfig == null) {
            return DynamicConfig.Companion.getUninitialized(str);
        }
        return dynamicConfig;
    }

    public final ErrorBoundary getErrorBoundary$build_release() {
        return this.errorBoundary;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final DynamicConfig getExperiment(String str, boolean z10) {
        AbstractC3557B.c0("experimentName", str);
        enforceInitialized$build_release("getExperiment");
        ?? obj = new Object();
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$getExperiment$1(obj, this, str, z10), "getExperiment", null, str, 4, null);
        DynamicConfig dynamicConfig = (DynamicConfig) obj.f37622Y;
        if (dynamicConfig == null) {
            return DynamicConfig.Companion.getUninitialized(str);
        }
        return dynamicConfig;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final DynamicConfig getExperimentWithExposureLoggingDisabled(String str, boolean z10) {
        AbstractC3557B.c0("experimentName", str);
        enforceInitialized$build_release("getExperimentWithExposureLoggingDisabled");
        ?? obj = new Object();
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$getExperimentWithExposureLoggingDisabled$1(obj, this, str, z10), "getExperimentWithExposureLoggingDisabled", null, str, 4, null);
        DynamicConfig dynamicConfig = (DynamicConfig) obj.f37622Y;
        if (dynamicConfig == null) {
            return DynamicConfig.Companion.getUninitialized(str);
        }
        return dynamicConfig;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final ExternalInitializeResponse getInitializeResponseJson() {
        ?? obj = new Object();
        enforceInitialized$build_release("getInitializeResponseJson");
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$getInitializeResponseJson$1(obj, this), "getInitializeResponseJson", null, null, 12, null);
        ExternalInitializeResponse externalInitializeResponse = (ExternalInitializeResponse) obj.f37622Y;
        if (externalInitializeResponse == null) {
            return ExternalInitializeResponse.Companion.getUninitialized();
        }
        return externalInitializeResponse;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final Layer getLayer(String str, boolean z10) {
        AbstractC3557B.c0("layerName", str);
        enforceInitialized$build_release("getLayer");
        ?? obj = new Object();
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$getLayer$1(obj, this, str, z10), "getLayer", null, str, 4, null);
        Layer layer = (Layer) obj.f37622Y;
        if (layer == null) {
            return Layer.Companion.getUninitialized(str);
        }
        return layer;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final Layer getLayerWithExposureLoggingDisabled(String str, boolean z10) {
        AbstractC3557B.c0("layerName", str);
        enforceInitialized$build_release("getLayerWithExposureLoggingDisabled");
        ?? obj = new Object();
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$getLayerWithExposureLoggingDisabled$1(obj, this, str, z10), "getLayerWithExposureLoggingDisabled", null, str, 4, null);
        Layer layer = (Layer) obj.f37622Y;
        if (layer == null) {
            return Layer.Companion.getUninitialized(str);
        }
        return layer;
    }

    public final StatsigOptions getOptions$build_release() {
        StatsigOptions statsigOptions = this.options;
        if (statsigOptions != null) {
            return statsigOptions;
        }
        AbstractC3557B.C2("options");
        throw null;
    }

    public final SharedPreferences getSharedPrefs$build_release() {
        Application application = this.application;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
            AbstractC3557B.b0("application.getSharedPreferences(SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)", sharedPreferences);
            return sharedPreferences;
        }
        AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    public final String getStableID() {
        enforceInitialized$build_release("getStableID");
        ?? obj = new Object();
        obj.f37622Y = "";
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$getStableID$1(obj, this), "getStableID", null, null, 12, null);
        return (String) obj.f37622Y;
    }

    public final StatsigNetwork getStatsigNetwork$build_release() {
        StatsigNetwork statsigNetwork = this.statsigNetwork;
        if (statsigNetwork != null) {
            return statsigNetwork;
        }
        AbstractC3557B.C2("statsigNetwork");
        throw null;
    }

    public final Store getStore$build_release() {
        Store store = this.store;
        if (store != null) {
            return store;
        }
        AbstractC3557B.C2(ProductResponseJsonKeys.STORE);
        throw null;
    }

    public final Object initialize(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, AbstractC4825e abstractC4825e) {
        if (isInitialized()) {
            return null;
        }
        getErrorBoundary$build_release().setKey(str);
        return getErrorBoundary$build_release().captureAsync(new StatsigClient$initialize$2(this, application, str, statsigUser, statsigOptions, null), new StatsigClient$initialize$3(this, null), abstractC4825e);
    }

    public final void initializeAsync(Application application, String str, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, StatsigOptions statsigOptions) {
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, application);
        AbstractC3557B.c0("sdkKey", str);
        AbstractC3557B.c0("options", statsigOptions);
        if (isInitialized()) {
            return;
        }
        this.errorBoundary.setKey(str);
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$initializeAsync$1(this, application, str, statsigUser, statsigOptions, iStatsigCallback), null, new StatsigClient$initializeAsync$2(this, iStatsigCallback), null, 10, null);
    }

    public final boolean isInitialized() {
        return this.initialized.get();
    }

    public final void logEvent(String str, Double d10, Map<String, String> map) {
        AbstractC3557B.c0("eventName", str);
        enforceInitialized$build_release("logEvent");
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$logEvent$1(str, d10, map, this), "logEvent", null, null, 12, null);
    }

    public final void logLayerParameterExposure$build_release(Layer layer, String str, boolean z10) {
        Boolean bool;
        AbstractC3557B.c0("layer", layer);
        AbstractC3557B.c0("parameterName", str);
        if (!isInitialized()) {
            return;
        }
        Map<String, String>[] undelegatedSecondaryExposures$build_release = layer.getUndelegatedSecondaryExposures$build_release();
        Set<String> explicitParameters$build_release = layer.getExplicitParameters$build_release();
        if (explicitParameters$build_release == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(explicitParameters$build_release.contains(str));
        }
        boolean K10 = AbstractC3557B.K(bool, Boolean.TRUE);
        String str2 = "";
        if (K10) {
            undelegatedSecondaryExposures$build_release = layer.getSecondaryExposures$build_release();
            String allocatedExperimentName$build_release = layer.getAllocatedExperimentName$build_release();
            if (allocatedExperimentName$build_release != null) {
                str2 = allocatedExperimentName$build_release;
            }
        }
        Map<String, String>[] mapArr = undelegatedSecondaryExposures$build_release;
        String str3 = str2;
        StatsigLogger statsigLogger = this.logger;
        if (statsigLogger != null) {
            String name = layer.getName();
            String ruleID = layer.getRuleID();
            StatsigUser statsigUser = this.user;
            if (statsigUser != null) {
                statsigLogger.logLayerExposure(name, ruleID, mapArr, statsigUser, str3, str, K10, layer.getEvaluationDetails(), z10);
                return;
            } else {
                AbstractC3557B.C2("user");
                throw null;
            }
        }
        AbstractC3557B.C2("logger");
        throw null;
    }

    public final void manuallyLogConfigExposure(String str) {
        AbstractC3557B.c0("configName", str);
        enforceInitialized$build_release("logManualConfigExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$manuallyLogConfigExposure$1(this, str), "logManualConfigExposure", null, str, 4, null);
    }

    public final void manuallyLogExperimentExposure(String str, boolean z10) {
        AbstractC3557B.c0("configName", str);
        enforceInitialized$build_release("logManualExperimentExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$manuallyLogExperimentExposure$1(this, str, z10), "logManualExperimentExposure", null, str, 4, null);
    }

    public final void manuallyLogGateExposure(String str) {
        AbstractC3557B.c0("gateName", str);
        enforceInitialized$build_release("logManualGateExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$manuallyLogGateExposure$1(this, str), "logManualGateExposure", null, str, 4, null);
    }

    public final void manuallyLogLayerParameterExposure(String str, String str2, boolean z10) {
        AbstractC3557B.c0("layerName", str);
        AbstractC3557B.c0("parameterName", str2);
        enforceInitialized$build_release("logManualLayerExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$manuallyLogLayerParameterExposure$1(this, str, z10, str2), "logManualLayerExposure", null, str, 4, null);
    }

    @Override // com.statsig.androidsdk.LifecycleEventListener
    public void onAppBlur() {
        F f6 = this.statsigScope;
        if (f6 != null) {
            l.O0(f6, null, null, new StatsigClient$onAppBlur$1(this, null), 3);
        } else {
            AbstractC3557B.C2("statsigScope");
            throw null;
        }
    }

    @Override // com.statsig.androidsdk.LifecycleEventListener
    public void onAppFocus() {
        F f6 = this.statsigScope;
        if (f6 != null) {
            l.O0(f6, null, null, new StatsigClient$onAppFocus$1(this, null), 3);
        } else {
            AbstractC3557B.C2("statsigScope");
            throw null;
        }
    }

    public final void openDebugView(Context context) {
        AbstractC3557B.c0("context", context);
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$openDebugView$1(this, context), null, null, null, 14, null);
    }

    public final void overrideConfig(String str, Map<String, ? extends Object> map) {
        AbstractC3557B.c0("configName", str);
        AbstractC3557B.c0("value", map);
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$overrideConfig$1(this, str, map), "overrideConfig", null, null, 12, null);
    }

    public final void overrideGate(String str, boolean z10) {
        AbstractC3557B.c0("gateName", str);
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$overrideGate$1(this, str, z10), "overrideGate", null, null, 12, null);
    }

    public final void overrideLayer(String str, Map<String, ? extends Object> map) {
        AbstractC3557B.c0("configName", str);
        AbstractC3557B.c0("value", map);
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$overrideLayer$1(this, str, map), "overrideLayer", null, null, 12, null);
    }

    public final void removeAllOverrides() {
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$removeAllOverrides$1(this), null, null, null, 14, null);
    }

    public final void removeOverride(String str) {
        AbstractC3557B.c0("name", str);
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$removeOverride$1(this, str), null, null, null, 14, null);
    }

    public final Object saveStringToSharedPrefs$build_release(String str, String str2, AbstractC4825e abstractC4825e) {
        Object saveStringToSharedPrefs$build_release = StatsigUtil.INSTANCE.saveStringToSharedPrefs$build_release(getSharedPrefs$build_release(), str, str2, abstractC4825e);
        if (saveStringToSharedPrefs$build_release == EnumC5000a.f41328Y) {
            return saveStringToSharedPrefs$build_release;
        }
        return y.f36177a;
    }

    public final void setErrorBoundary$build_release(ErrorBoundary errorBoundary) {
        AbstractC3557B.c0("<set-?>", errorBoundary);
        this.errorBoundary = errorBoundary;
    }

    public final void setOptions$build_release(StatsigOptions statsigOptions) {
        AbstractC3557B.c0("<set-?>", statsigOptions);
        this.options = statsigOptions;
    }

    public final void setStatsigNetwork$build_release(StatsigNetwork statsigNetwork) {
        AbstractC3557B.c0("<set-?>", statsigNetwork);
        this.statsigNetwork = statsigNetwork;
    }

    public final Object setupAsync$build_release(StatsigUser statsigUser, AbstractC4825e abstractC4825e) {
        return l.n1(abstractC4825e, this.dispatcherProvider.getIo(), new StatsigClient$setupAsync$2(this, statsigUser, null));
    }

    public final void shutdown() {
        enforceInitialized$build_release("shutdown");
        l.a1(C4832l.f40334Y, new StatsigClient$shutdown$1(this, null));
    }

    public final Object shutdownSuspend(AbstractC4825e abstractC4825e) {
        enforceInitialized$build_release("shutdownSuspend");
        return getErrorBoundary$build_release().captureAsync(new StatsigClient$shutdownSuspend$2(this, null), abstractC4825e);
    }

    public final Object updateUser(StatsigUser statsigUser, AbstractC4825e abstractC4825e) {
        enforceInitialized$build_release("updateUser");
        return getErrorBoundary$build_release().captureAsync(new StatsigClient$updateUser$2(this, statsigUser, null), abstractC4825e);
    }

    public final void updateUserAsync(StatsigUser statsigUser, IStatsigCallback iStatsigCallback) {
        enforceInitialized$build_release("updateUserAsync");
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$updateUserAsync$1(this, statsigUser, iStatsigCallback), "updateUserAsync", null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$default(StatsigClient statsigClient, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = null;
        }
        statsigClient.logEvent(str, str2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logExposure(String str, FeatureGate featureGate, boolean z10) {
        StatsigLogger statsigLogger = this.logger;
        if (statsigLogger == null) {
            AbstractC3557B.C2("logger");
            throw null;
        }
        StatsigUser statsigUser = this.user;
        if (statsigUser != null) {
            statsigLogger.logExposure(str, featureGate, statsigUser, z10);
        } else {
            AbstractC3557B.C2("user");
            throw null;
        }
    }

    public static /* synthetic */ void logExposure$default(StatsigClient statsigClient, String str, FeatureGate featureGate, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        statsigClient.logExposure(str, featureGate, z10);
    }

    public final void logEvent(String str, String str2, Map<String, String> map) {
        AbstractC3557B.c0("eventName", str);
        AbstractC3557B.c0("value", str2);
        enforceInitialized$build_release("logEvent");
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$logEvent$2(str, str2, map, this), "logEvent", null, null, 12, null);
    }

    public final void logEvent(String str, Map<String, String> map) {
        AbstractC3557B.c0("eventName", str);
        AbstractC3557B.c0("metadata", map);
        enforceInitialized$build_release("logEvent");
        ErrorBoundary.capture$default(this.errorBoundary, new StatsigClient$logEvent$3(str, map, this), "logEvent", null, null, 12, null);
    }
}
