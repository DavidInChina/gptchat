package com.revenuecat.purchases;

import Df.H;
import K4.C0816d;
import Mg.d;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.strings.SyncAttributesAndOfferingsStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CustomActivityLifecycleHandler;
import com.revenuecat.purchases.utils.RateLimiter;
import id.AbstractC3557B;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.AbstractC3957g;
import jf.C3959i;
import jf.y;
import kf.AbstractC4268D;
import kf.q;
import kf.t;
import kf.v;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.n;

@Metadata(d1 = {"\u0000\u00c8\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u009b\u00022\u00020\u00012\u00020\u0002:\u0002\u009b\u0002B\u00e4\u0001\u0012\b\u0010\u00b3\u0001\u001a\u00030\u00b2\u0001\u0012\t\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u00b6\u0001\u001a\u00030\u00b5\u0001\u0012\b\u0010\u00b9\u0001\u001a\u00030\u00b8\u0001\u0012\b\u0010\u00bc\u0001\u001a\u00030\u00bb\u0001\u0012\b\u0010\u00bf\u0001\u001a\u00030\u00be\u0001\u0012\b\u0010\u00c2\u0001\u001a\u00030\u00c1\u0001\u0012\b\u0010\u00c5\u0001\u001a\u00030\u00c4\u0001\u0012\b\u0010\u00cc\u0001\u001a\u00030\u00cb\u0001\u0012\b\u0010\u00cf\u0001\u001a\u00030\u00ce\u0001\u0012\n\u0010\u0098\u0002\u001a\u0005\u0018\u00010\u0097\u0002\u0012\b\u0010\u00d2\u0001\u001a\u00030\u00d1\u0001\u0012\b\u0010\u00d7\u0001\u001a\u00030\u00d6\u0001\u0012\b\u0010\u00da\u0001\u001a\u00030\u00d9\u0001\u0012\b\u0010\u00dd\u0001\u001a\u00030\u00dc\u0001\u0012\b\u0010\u00e0\u0001\u001a\u00030\u00df\u0001\u0012\b\u0010\u00e3\u0001\u001a\u00030\u00e2\u0001\u0012\n\u0010\u00e6\u0001\u001a\u0005\u0018\u00010\u00e5\u0001\u0012\b\u0010\u00e9\u0001\u001a\u00030\u00e8\u0001\u0012\b\u0010\u00ec\u0001\u001a\u00030\u00eb\u0001\u0012\f\b\u0002\u0010\u00ef\u0001\u001a\u0005\u0018\u00010\u00ee\u0001\u00a2\u0006\u0006\b\u0099\u0002\u0010\u009a\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\f\u001a\u00020%\u00a2\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010\f\u001a\u00020*\u00a2\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020-\u00a2\u0006\u0004\b.\u0010/J!\u00102\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00132\n\b\u0002\u0010\f\u001a\u0004\u0018\u000101\u00a2\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010-\u00a2\u0006\u0004\b4\u0010/J\r\u00105\u001a\u00020\u0003\u00a2\u0006\u0004\b5\u0010\u0005J\u0015\u00106\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020-\u00a2\u0006\u0004\b6\u0010/J\u001d\u00106\u001a\u00020\u00032\u0006\u00108\u001a\u0002072\u0006\u0010\f\u001a\u00020-\u00a2\u0006\u0004\b6\u00109J\r\u0010:\u001a\u00020\u0003\u00a2\u0006\u0004\b:\u0010\u0005J#\u0010=\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0!\u00a2\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0003\u00a2\u0006\u0004\b?\u0010\u0005J1\u0010B\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020#0@2\u0006\u0010\f\u001a\u00020%\u00a2\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00032\u0006\u0010E\u001a\u00020DH\u0007\u00a2\u0006\u0004\bF\u0010GJ#\u0010J\u001a\u00020\u00032\u0014\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00130H\u00a2\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u00032\b\u0010L\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00032\b\u0010O\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bP\u0010NJ\u0017\u0010R\u001a\u00020\u00032\b\u0010Q\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bR\u0010NJ\u0017\u0010T\u001a\u00020\u00032\b\u0010S\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bT\u0010NJ\u0017\u0010V\u001a\u00020\u00032\b\u0010U\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bV\u0010NJ\u0017\u0010X\u001a\u00020\u00032\b\u0010W\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bX\u0010NJ\u0017\u0010Z\u001a\u00020\u00032\b\u0010Y\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bZ\u0010NJ\u0017\u0010\\\u001a\u00020\u00032\b\u0010[\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b\\\u0010NJ\u0017\u0010^\u001a\u00020\u00032\b\u0010]\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\b^\u0010NJ\r\u0010_\u001a\u00020\u0003\u00a2\u0006\u0004\b_\u0010\u0005J\u0017\u0010a\u001a\u00020\u00032\b\u0010`\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\ba\u0010NJ\u0017\u0010c\u001a\u00020\u00032\b\u0010b\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bc\u0010NJ\u0017\u0010e\u001a\u00020\u00032\b\u0010d\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\be\u0010NJ\u0017\u0010g\u001a\u00020\u00032\b\u0010f\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bg\u0010NJ\u0017\u0010i\u001a\u00020\u00032\b\u0010h\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bi\u0010NJ\u0017\u0010k\u001a\u00020\u00032\b\u0010j\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bk\u0010NJ\u0017\u0010m\u001a\u00020\u00032\b\u0010l\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bm\u0010NJ\u0017\u0010o\u001a\u00020\u00032\b\u0010n\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bo\u0010NJ\u0017\u0010q\u001a\u00020\u00032\b\u0010p\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bq\u0010NJ\u0017\u0010s\u001a\u00020\u00032\b\u0010r\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bs\u0010NJ\u0017\u0010u\u001a\u00020\u00032\b\u0010t\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\bu\u0010NJ\u0015\u0010v\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0013\u00a2\u0006\u0004\bv\u0010NJ9\u0010|\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010x\u001a\u00020w2\b\u0010z\u001a\u0004\u0018\u00010y2\b\u0010{\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020*\u00a2\u0006\u0004\b|\u0010}JN\u0010\u0082\u0001\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010x\u001a\u00020w2\b\u0010z\u001a\u0004\u0018\u00010y2\u0006\u0010~\u001a\u00020\u00132\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\b\u0010{\u001a\u0004\u0018\u00010\u001d2\u0007\u0010\u0081\u0001\u001a\u00020*\u00a2\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JF\u0010\u0085\u0001\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010x\u001a\u00020w2\b\u0010z\u001a\u0004\u0018\u00010y2\u0006\u0010~\u001a\u00020\u00132\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u0007\u0010\u0010\u001a\u00030\u0084\u0001\u00a2\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u001d2\u0007\u0010\u0087\u0001\u001a\u00020\u001dH\u0002\u00a2\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001JD\u0010B\u001a\u00020\u00032\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020#0@2\u000e\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010!2\u0006\u0010\f\u001a\u00020%H\u0002\u00a2\u0006\u0005\bB\u0010\u008c\u0001J(\u0010\u008f\u0001\u001a\u00020\u00032\u0007\u0010\u008d\u0001\u001a\u00020\u00132\u000b\b\u0002\u0010\u008e\u0001\u001a\u0004\u0018\u00010-H\u0002\u00a2\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\"\u0010\u0093\u0001\u001a\u00020\u00032\u000e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u0091\u0001H\u0002\u00a2\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001d\u0010\u0096\u0001\u001a\u0004\u0018\u00010*2\u0007\u0010\u0095\u0001\u001a\u00020\u0013H\u0002\u00a2\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0015\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0002\u00a2\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0013\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0002\u00a2\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0018\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020*0!H\u0002\u00a2\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001JS\u0010\u00a6\u0001\u001aC\u0012\u001e\u0012\u001c\u0012\u0005\u0012\u00030\u00a1\u0001\u0012\u0005\u0012\u00030\u00a2\u0001\u0012\u0004\u0012\u00020\u00030\u00a0\u0001j\u0003`\u00a3\u0001\u0012\u001e\u0012\u001c\u0012\u0005\u0012\u00030\u00a1\u0001\u0012\u0005\u0012\u00030\u00a4\u0001\u0012\u0004\u0012\u00020\u00030\u00a0\u0001j\u0003`\u00a5\u00010\u009f\u0001H\u0002\u00a2\u0006\u0006\b\u00a6\u0001\u0010\u00a7\u0001J_\u0010\u00a9\u0001\u001aC\u0012\u001e\u0012\u001c\u0012\u0005\u0012\u00030\u00a1\u0001\u0012\u0005\u0012\u00030\u00a2\u0001\u0012\u0004\u0012\u00020\u00030\u00a0\u0001j\u0003`\u00a3\u0001\u0012\u001e\u0012\u001c\u0012\u0005\u0012\u00030\u00a1\u0001\u0012\u0005\u0012\u00030\u00a4\u0001\u0012\u0004\u0012\u00020\u00030\u00a0\u0001j\u0003`\u00a5\u00010\u009f\u00012\n\u0010\u00a8\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0002\u00a2\u0006\u0006\b\u00a9\u0001\u0010\u00aa\u0001J!\u0010\u0093\u0001\u001a\u00020\u0003*\u00030\u00ab\u00012\b\u0010\u00ac\u0001\u001a\u00030\u00a4\u0001H\u0002\u00a2\u0006\u0006\b\u0093\u0001\u0010\u00ad\u0001J[\u0010\u00ae\u0001\u001a\u00020\u00032\u0006\u0010x\u001a\u00020w2\u0006\u0010~\u001a\u00020\u00132\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u0006\u0010\b\u001a\u00020\u00072\u0007\u0010\u008d\u0001\u001a\u00020\u00132\b\u0010z\u001a\u0004\u0018\u00010y2\b\u0010{\u001a\u0004\u0018\u00010\u001d2\u0007\u0010\u0010\u001a\u00030\u00ab\u0001H\u0002\u00a2\u0006\u0006\b\u00ae\u0001\u0010\u00af\u0001J\u0011\u0010\u00b0\u0001\u001a\u00020\u0003H\u0002\u00a2\u0006\u0005\b\u00b0\u0001\u0010\u0005J\u0011\u0010\u00b1\u0001\u001a\u00020\u0003H\u0002\u00a2\u0006\u0005\b\u00b1\u0001\u0010\u0005R\u0018\u0010\u00b3\u0001\u001a\u00030\u00b2\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b3\u0001\u0010\u00b4\u0001R\u0018\u0010\u00b6\u0001\u001a\u00030\u00b5\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b6\u0001\u0010\u00b7\u0001R\u0018\u0010\u00b9\u0001\u001a\u00030\u00b8\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00b9\u0001\u0010\u00ba\u0001R\u0018\u0010\u00bc\u0001\u001a\u00030\u00bb\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00bc\u0001\u0010\u00bd\u0001R\u0018\u0010\u00bf\u0001\u001a\u00030\u00be\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00bf\u0001\u0010\u00c0\u0001R\u0018\u0010\u00c2\u0001\u001a\u00030\u00c1\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00c2\u0001\u0010\u00c3\u0001R*\u0010\u00c5\u0001\u001a\u00030\u00c4\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\b\u00c5\u0001\u0010\u00c6\u0001\u001a\u0006\b\u00c7\u0001\u0010\u00c8\u0001\"\u0006\b\u00c9\u0001\u0010\u00ca\u0001R\u0018\u0010\u00cc\u0001\u001a\u00030\u00cb\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00cc\u0001\u0010\u00cd\u0001R\u0018\u0010\u00cf\u0001\u001a\u00030\u00ce\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00cf\u0001\u0010\u00d0\u0001R\u001d\u0010\u00d2\u0001\u001a\u00030\u00d1\u00018\u0007\u00a2\u0006\u0010\n\u0006\b\u00d2\u0001\u0010\u00d3\u0001\u001a\u0006\b\u00d4\u0001\u0010\u00d5\u0001R\u0018\u0010\u00d7\u0001\u001a\u00030\u00d6\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00d7\u0001\u0010\u00d8\u0001R\u0018\u0010\u00da\u0001\u001a\u00030\u00d9\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00da\u0001\u0010\u00db\u0001R\u0018\u0010\u00dd\u0001\u001a\u00030\u00dc\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00dd\u0001\u0010\u00de\u0001R\u0018\u0010\u00e0\u0001\u001a\u00030\u00df\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e0\u0001\u0010\u00e1\u0001R\u0018\u0010\u00e3\u0001\u001a\u00030\u00e2\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e3\u0001\u0010\u00e4\u0001R\u001a\u0010\u00e6\u0001\u001a\u0005\u0018\u00010\u00e5\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e6\u0001\u0010\u00e7\u0001R\u0018\u0010\u00e9\u0001\u001a\u00030\u00e8\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00e9\u0001\u0010\u00ea\u0001R\u0018\u0010\u00ec\u0001\u001a\u00030\u00eb\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ec\u0001\u0010\u00ed\u0001R\u001a\u0010\u00ef\u0001\u001a\u0005\u0018\u00010\u00ee\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00ef\u0001\u0010\u00f0\u0001R!\u0010\u00f6\u0001\u001a\u00030\u00f1\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\b\u00f2\u0001\u0010\u00f3\u0001\u001a\u0006\b\u00f4\u0001\u0010\u00f5\u0001R\u0018\u0010\u00f8\u0001\u001a\u00030\u00f7\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00f8\u0001\u0010\u00f9\u0001R,\u0010\u0080\u0002\u001a\u00030\u00fa\u00012\b\u0010\u00fb\u0001\u001a\u00030\u00fa\u00018@@@X\u0080\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00fc\u0001\u0010\u00fd\u0001\"\u0006\b\u00fe\u0001\u0010\u00ff\u0001R*\u0010\u0085\u0002\u001a\u00020\u001d2\u0007\u0010\u00fb\u0001\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010\u0084\u0002R\u0014\u0010\u008d\u0001\u001a\u00020\u00138F\u00a2\u0006\b\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R0\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u0088\u00022\n\u0010\u00fb\u0001\u001a\u0005\u0018\u00010\u0088\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0014\u0010\u008e\u0002\u001a\u00020\u001d8F\u00a2\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u0082\u0002R\u0015\u0010\u0092\u0002\u001a\u00030\u008f\u00028F\u00a2\u0006\b\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R*\u0010\u0095\u0002\u001a\u00020\u001d2\u0007\u0010\u00fb\u0001\u001a\u00020\u001d8F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u0093\u0002\u0010\u0082\u0002\"\u0006\b\u0094\u0002\u0010\u0084\u0002\u00a8\u0006\u009c\u0002"}, d2 = {"Lcom/revenuecat/purchases/PurchasesOrchestrator;", "Lcom/revenuecat/purchases/LifecycleDelegate;", "Lcom/revenuecat/purchases/utils/CustomActivityLifecycleHandler;", "Ljf/y;", "onAppBackgrounded", "()V", "onAppForegrounded", "Landroid/app/Activity;", "activity", "onActivityStarted", "(Landroid/app/Activity;)V", "Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;", "callback", "syncAttributesAndOfferingsIfNeeded", "(Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V", "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "listener", "syncPurchases", "(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V", "", "productID", "receiptID", "amazonUserID", "isoCurrencyCode", "", "price", "syncObserverModeAmazonPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "", "fetchCurrent", "getOfferings", "(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;Z)V", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "getProducts", "(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchase", "(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "restorePurchases", "(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "newAppUserID", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "logIn", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V", "logOut", "close", "getCustomerInfo", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "(Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "removeUpdatedCustomerInfoListener", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "invalidateCustomerInfoCache", "", "types", "getProductsOfTypes", "(Ljava/util/Set;Ljava/util/Set;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "paywallEvent", "track", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;)V", "", "attributes", "setAttributes", "(Ljava/util/Map;)V", "email", "setEmail", "(Ljava/lang/String;)V", "phoneNumber", "setPhoneNumber", "displayName", "setDisplayName", "fcmToken", "setPushToken", "mixpanelDistinctID", "setMixpanelDistinctID", "onesignalID", "setOnesignalID", "onesignalUserID", "setOnesignalUserID", "airshipChannelID", "setAirshipChannelID", "firebaseAppInstanceID", "setFirebaseAppInstanceID", "collectDeviceIdentifiers", "adjustID", "setAdjustID", "appsflyerID", "setAppsflyerID", "fbAnonymousID", "setFBAnonymousID", "mparticleID", "setMparticleID", "cleverTapID", "setCleverTapID", "mediaSource", "setMediaSource", "campaign", "setCampaign", "adGroup", "setAdGroup", "ad", "setAd", "keyword", "setKeyword", "creative", "setCreative", "switchUser", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "isPersonalizedPrice", "startPurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "oldProductId", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "googleReplacementMode", "purchaseCallback", "startProductChange", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "startDeprecatedProductChange", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)V", "firstTimeInForeground", "shouldRefreshCustomerInfo", "(Z)Z", "Lcom/revenuecat/purchases/models/StoreProduct;", "collectedStoreProducts", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "appUserID", "completion", "updateAllCaches", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lwf/a;)V", "productId", "getPurchaseCallback", "(Ljava/lang/String;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "getAndClearProductChangeCallback", "()Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getPurchasesUpdatedListener", "()Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getAndClearAllPurchaseCallbacks", "()Ljava/util/List;", "Landroid/util/Pair;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "getPurchaseCompletedCallbacks", "()Landroid/util/Pair;", "productChangeListener", "getProductChangeCompletedCallbacks", "(Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)Landroid/util/Pair;", "Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;", "error", "(Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;Lcom/revenuecat/purchases/PurchasesError;)V", "replaceOldPurchaseWithNewProduct", "(Lcom/revenuecat/purchases/models/PurchasingData;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;Lcom/revenuecat/purchases/interfaces/PurchaseErrorCallback;)V", "synchronizeSubscriberAttributesIfNeeded", "flushPaywallEvents", "Landroid/app/Application;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "Landroid/app/Application;", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "getAppConfig", "()Lcom/revenuecat/purchases/common/AppConfig;", "setAppConfig", "(Lcom/revenuecat/purchases/common/AppConfig;)V", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "customerInfoHelper", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "getOfflineEntitlementsManager", "()Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "Lcom/revenuecat/purchases/PostReceiptHelper;", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "postTransactionWithProductDetailsHelper", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Lcom/revenuecat/purchases/SyncPurchasesHelper;", "syncPurchasesHelper", "Lcom/revenuecat/purchases/SyncPurchasesHelper;", "Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "offeringsManager", "Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;", "paywallEventsManager", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "paywallPresentedCache", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "Lcom/revenuecat/purchases/PurchasesStateCache;", "purchasesStateCache", "Lcom/revenuecat/purchases/PurchasesStateCache;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/AppLifecycleHandler;", "lifecycleHandler$delegate", "Ljf/g;", "getLifecycleHandler", "()Lcom/revenuecat/purchases/AppLifecycleHandler;", "lifecycleHandler", "Lcom/revenuecat/purchases/utils/RateLimiter;", "lastSyncAttributesAndOfferingsRateLimiter", "Lcom/revenuecat/purchases/utils/RateLimiter;", "Lcom/revenuecat/purchases/PurchasesState;", "value", "getState$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/PurchasesState;", "setState$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/PurchasesState;)V", "state", "getFinishTransactions", "()Z", "setFinishTransactions", "(Z)V", "finishTransactions", "getAppUserID", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "updatedCustomerInfoListener", "isAnonymous", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "getAllowSharingPlayStoreAccount", "setAllowSharingPlayStoreAccount", "allowSharingPlayStoreAccount", "backingFieldAppUserID", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;", "diagnosticsSynchronizer", "<init>", "(Landroid/app/Application;Ljava/lang/String;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/CustomerInfoHelper;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsSynchronizer;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/PostReceiptHelper;Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Lcom/revenuecat/purchases/SyncPurchasesHelper;Lcom/revenuecat/purchases/common/offerings/OfferingsManager;Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;Lcom/revenuecat/purchases/PurchasesStateCache;Landroid/os/Handler;)V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesOrchestrator implements LifecycleDelegate, CustomActivityLifecycleHandler {
    public static final String frameworkVersion = "7.7.0";
    private static URL proxyURL;
    private AppConfig appConfig;
    private final Application application;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final IdentityManager identityManager;
    private final RateLimiter lastSyncAttributesAndOfferingsRateLimiter;
    private final AbstractC3957g lifecycleHandler$delegate;
    private final Handler mainHandler;
    private final OfferingsManager offeringsManager;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallEventsManager paywallEventsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;
    private final PostReceiptHelper postReceiptHelper;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;
    private final PurchasesStateCache purchasesStateCache;
    private final SubscriberAttributesManager subscriberAttributesManager;
    private final SyncPurchasesHelper syncPurchasesHelper;
    public static final Companion Companion = new Companion(null);
    private static PlatformInfo platformInfo = new PlatformInfo("native", null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.PurchasesOrchestrator$2 */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends o implements AbstractC6216a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2() {
            super(0);
            PurchasesOrchestrator.this = r1;
        }

        @Override // wf.AbstractC6216a
        /* renamed from: invoke */
        public final void mo122invoke() {
            ProcessLifecycleOwner.f25313n0.f25319k0.a(PurchasesOrchestrator.this.getLifecycleHandler());
            PurchasesOrchestrator.this.application.registerActivityLifecycleCallbacks(PurchasesOrchestrator.this);
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b0\u00101J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b.\u0010/\u00a8\u00062"}, d2 = {"Lcom/revenuecat/purchases/PurchasesOrchestrator$Companion;", "", "Landroid/content/Context;", "context", "", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "Lcom/revenuecat/purchases/interfaces/Callback;", "", "callback", "Ljf/y;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V", "Lcom/revenuecat/purchases/common/PlatformInfo;", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "setPlatformInfo", "(Lcom/revenuecat/purchases/common/PlatformInfo;)V", "value", "getDebugLogsEnabled", "()Z", "setDebugLogsEnabled", "(Z)V", "debugLogsEnabled", "Lcom/revenuecat/purchases/LogLevel;", "getLogLevel", "()Lcom/revenuecat/purchases/LogLevel;", "setLogLevel", "(Lcom/revenuecat/purchases/LogLevel;)V", "logLevel", "Lcom/revenuecat/purchases/LogHandler;", "getLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "logHandler", "Ljava/net/URL;", "proxyURL", "Ljava/net/URL;", "getProxyURL", "()Ljava/net/URL;", "setProxyURL", "(Ljava/net/URL;)V", "", "frameworkVersion", "Ljava/lang/String;", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                list = v.f37483Y;
            }
            companion.canMakePayments(context, list, callback);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, K4.t] */
        public final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
            AbstractC3557B.c0("context", context);
            AbstractC3557B.c0("features", list);
            AbstractC3557B.c0("callback", callback);
            C0816d c0816d = new C0816d(context, new Object());
            c0816d.e(new PurchasesOrchestrator$Companion$canMakePayments$2$1(new Handler(context.getMainLooper()), callback, c0816d, list));
        }

        public final boolean getDebugLogsEnabled() {
            return LogUtilsKt.getDebugLogsEnabled(getLogLevel());
        }

        public final synchronized LogHandler getLogHandler() {
            return LogWrapperKt.getCurrentLogHandler();
        }

        public final LogLevel getLogLevel() {
            return Config.INSTANCE.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.platformInfo;
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.proxyURL;
        }

        public final void setDebugLogsEnabled(boolean z10) {
            setLogLevel(LogUtilsKt.debugLogsEnabled(LogLevel.Companion, z10));
        }

        public final synchronized void setLogHandler(LogHandler logHandler) {
            AbstractC3557B.c0("value", logHandler);
            LogWrapperKt.setCurrentLogHandler(logHandler);
        }

        public final void setLogLevel(LogLevel logLevel) {
            AbstractC3557B.c0("value", logLevel);
            Config.INSTANCE.setLogLevel(logLevel);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            AbstractC3557B.c0("<set-?>", platformInfo);
            PurchasesOrchestrator.platformInfo = platformInfo;
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.proxyURL = url;
        }
    }

    public PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, PaywallEventsManager paywallEventsManager, PaywallPresentedCache paywallPresentedCache, PurchasesStateCache purchasesStateCache, Handler handler) {
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, application);
        AbstractC3557B.c0("backend", backend);
        AbstractC3557B.c0("billing", billingAbstract);
        AbstractC3557B.c0("deviceCache", deviceCache);
        AbstractC3557B.c0("identityManager", identityManager);
        AbstractC3557B.c0("subscriberAttributesManager", subscriberAttributesManager);
        AbstractC3557B.c0("appConfig", appConfig);
        AbstractC3557B.c0("customerInfoHelper", customerInfoHelper);
        AbstractC3557B.c0("customerInfoUpdateHandler", customerInfoUpdateHandler);
        AbstractC3557B.c0("offlineEntitlementsManager", offlineEntitlementsManager);
        AbstractC3557B.c0("postReceiptHelper", postReceiptHelper);
        AbstractC3557B.c0("postTransactionWithProductDetailsHelper", postTransactionWithProductDetailsHelper);
        AbstractC3557B.c0("postPendingTransactionsHelper", postPendingTransactionsHelper);
        AbstractC3557B.c0("syncPurchasesHelper", syncPurchasesHelper);
        AbstractC3557B.c0("offeringsManager", offeringsManager);
        AbstractC3557B.c0("paywallPresentedCache", paywallPresentedCache);
        AbstractC3557B.c0("purchasesStateCache", purchasesStateCache);
        this.application = application;
        this.backend = backend;
        this.billing = billingAbstract;
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.appConfig = appConfig;
        this.customerInfoHelper = customerInfoHelper;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.postReceiptHelper = postReceiptHelper;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper;
        this.syncPurchasesHelper = syncPurchasesHelper;
        this.offeringsManager = offeringsManager;
        this.paywallEventsManager = paywallEventsManager;
        this.paywallPresentedCache = paywallPresentedCache;
        this.purchasesStateCache = purchasesStateCache;
        this.mainHandler = handler;
        this.lifecycleHandler$delegate = R4.b.D1(new PurchasesOrchestrator$lifecycleHandler$2(this));
        Mg.a aVar = Mg.b.f12127Z;
        this.lastSyncAttributesAndOfferingsRateLimiter = new RateLimiter(5, H.x0(60, d.f12134i0), null);
        identityManager.configure(str);
        billingAbstract.setStateListener(new BillingAbstract.StateListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator.1
            {
                PurchasesOrchestrator.this = this;
            }

            @Override // com.revenuecat.purchases.common.BillingAbstract.StateListener
            public void onConnected() {
                PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(PurchasesOrchestrator.this.postPendingTransactionsHelper, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), null, null, 6, null);
                PurchasesOrchestrator.this.billing.getStorefront(PurchasesOrchestrator$1$onConnected$1.INSTANCE, PurchasesOrchestrator$1$onConnected$2.INSTANCE);
            }
        });
        billingAbstract.setPurchasesUpdatedListener(getPurchasesUpdatedListener());
        BillingAbstract.startConnectionOnMainThread$default(billingAbstract, 0L, 1, null);
        dispatch(new AnonymousClass2());
        if (!this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogWrapperKt.log(LogIntent.WARNING, ConfigureStrings.AUTO_SYNC_PURCHASES_DISABLED);
        }
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            if (diagnosticsSynchronizer != null) {
                diagnosticsSynchronizer.clearDiagnosticsFileIfTooBig();
            }
            if (diagnosticsSynchronizer == null) {
                return;
            }
            diagnosticsSynchronizer.syncDiagnosticsFileIfNeeded();
        }
    }

    public final void dispatch(AbstractC6216a abstractC6216a) {
        if (!AbstractC3557B.K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            Handler handler = this.mainHandler;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new a(2, abstractC6216a));
            return;
        }
        abstractC6216a.mo122invoke();
    }

    public static final void dispatch$lambda$16(AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("$tmp0", abstractC6216a);
        abstractC6216a.mo122invoke();
    }

    private final void flushPaywallEvents() {
        PaywallEventsManager paywallEventsManager;
        if (AndroidVersionUtilsKt.isAndroidNOrNewer() && (paywallEventsManager = this.paywallEventsManager) != null) {
            paywallEventsManager.flushEvents();
        }
    }

    public final List<PurchaseCallback> getAndClearAllPurchaseCallbacks() {
        List<PurchaseCallback> K22;
        synchronized (this) {
            Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId();
            PurchasesState state$purchases_customEntitlementComputationRelease = getState$purchases_customEntitlementComputationRelease();
            Map emptyMap = Collections.emptyMap();
            AbstractC3557B.b0("emptyMap()", emptyMap);
            setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(state$purchases_customEntitlementComputationRelease, null, emptyMap, null, false, false, 29, null));
            K22 = t.K2(purchaseCallbacksByProductId.values());
        }
        return K22;
    }

    public final ProductChangeCallback getAndClearProductChangeCallback() {
        ProductChangeCallback deprecatedProductChangeCallback = getState$purchases_customEntitlementComputationRelease().getDeprecatedProductChangeCallback();
        setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, null, null, false, false, 27, null));
        return deprecatedProductChangeCallback;
    }

    public final AppLifecycleHandler getLifecycleHandler() {
        return (AppLifecycleHandler) this.lifecycleHandler$delegate.getValue();
    }

    public static /* synthetic */ void getOfferings$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveOfferingsCallback receiveOfferingsCallback, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        purchasesOrchestrator.getOfferings(receiveOfferingsCallback, z10);
    }

    public final Pair<n, n> getProductChangeCompletedCallbacks(ProductChangeCallback productChangeCallback) {
        return new Pair<>(new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1(productChangeCallback, this), new PurchasesOrchestrator$getProductChangeCompletedCallbacks$onError$1(productChangeCallback, this));
    }

    public static /* synthetic */ void getProducts$default(PurchasesOrchestrator purchasesOrchestrator, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    public final PurchaseCallback getPurchaseCallback(String str) {
        PurchaseCallback purchaseCallback = getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId().get(str);
        PurchasesState state$purchases_customEntitlementComputationRelease = getState$purchases_customEntitlementComputationRelease();
        Map<String, PurchaseCallback> purchaseCallbacksByProductId = getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, PurchaseCallback> entry : purchaseCallbacksByProductId.entrySet()) {
            if (!AbstractC3557B.K(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(state$purchases_customEntitlementComputationRelease, null, linkedHashMap, null, false, false, 29, null));
        return purchaseCallback;
    }

    public final Pair<n, n> getPurchaseCompletedCallbacks() {
        return new Pair<>(new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onSuccess$1(this), new PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1(this));
    }

    private final BillingAbstract.PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return new BillingAbstract.PurchasesUpdatedListener() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$getPurchasesUpdatedListener$1
            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesFailedToUpdate(PurchasesError purchasesError) {
                ProductChangeCallback andClearProductChangeCallback;
                y yVar;
                List<PurchaseCallback> andClearAllPurchaseCallbacks;
                AbstractC3557B.c0("purchasesError", purchasesError);
                PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
                synchronized (purchasesOrchestrator) {
                    try {
                        andClearProductChangeCallback = purchasesOrchestrator.getAndClearProductChangeCallback();
                        if (andClearProductChangeCallback != null) {
                            purchasesOrchestrator.dispatch(andClearProductChangeCallback, purchasesError);
                            yVar = y.f36177a;
                        } else {
                            yVar = null;
                        }
                        if (yVar == null) {
                            andClearAllPurchaseCallbacks = purchasesOrchestrator.getAndClearAllPurchaseCallbacks();
                            for (PurchaseCallback purchaseCallback : andClearAllPurchaseCallbacks) {
                                purchasesOrchestrator.dispatch(purchaseCallback, purchasesError);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.BillingAbstract.PurchasesUpdatedListener
            public void onPurchasesUpdated(List<StoreTransaction> list) {
                Pair pair;
                PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;
                ProductChangeCallback andClearProductChangeCallback;
                AbstractC3557B.c0("purchases", list);
                PurchasesOrchestrator purchasesOrchestrator = PurchasesOrchestrator.this;
                synchronized (purchasesOrchestrator) {
                    try {
                        if (purchasesOrchestrator.getState$purchases_customEntitlementComputationRelease().getDeprecatedProductChangeCallback() != null) {
                            andClearProductChangeCallback = purchasesOrchestrator.getAndClearProductChangeCallback();
                            pair = purchasesOrchestrator.getProductChangeCompletedCallbacks(andClearProductChangeCallback);
                        } else {
                            pair = purchasesOrchestrator.getPurchaseCompletedCallbacks();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                postTransactionWithProductDetailsHelper = PurchasesOrchestrator.this.postTransactionWithProductDetailsHelper;
                postTransactionWithProductDetailsHelper.postTransactions(list, PurchasesOrchestrator.this.getAllowSharingPlayStoreAccount(), PurchasesOrchestrator.this.getAppUserID(), PostReceiptInitiationSource.PURCHASE, (n) pair.first, (n) pair.second);
            }
        };
    }

    public static /* synthetic */ void logIn$default(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            logInCallback = null;
        }
        purchasesOrchestrator.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.logOut(receiveCustomerInfoCallback);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.B, java.lang.Object] */
    private final void replaceOldPurchaseWithNewProduct(PurchasingData purchasingData, String str, GoogleReplacementMode googleReplacementMode, Activity activity, String str2, PresentedOfferingContext presentedOfferingContext, Boolean bool, PurchaseErrorCallback purchaseErrorCallback) {
        ProductType productType = purchasingData.getProductType();
        ProductType productType2 = ProductType.SUBS;
        if (productType != productType2) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            ProductChangeCallback andClearProductChangeCallback = getAndClearProductChangeCallback();
            if (andClearProductChangeCallback != null) {
                dispatch(andClearProductChangeCallback, purchasesError);
            }
            for (PurchaseCallback purchaseCallback : getAndClearAllPurchaseCallbacks()) {
                dispatch(purchaseCallback, purchasesError);
            }
            return;
        }
        ?? obj = new Object();
        obj.f37622Y = str;
        if (Lg.n.Z1(str, ":", false)) {
            obj.f37622Y = Lg.n.Q2(str, ":", str);
            StringBuilder s10 = android.gov.nist.core.a.s("Using incorrect oldProductId: ", str, ". The productId should not contain the basePlanId. Using productId: ");
            s10.append((String) obj.f37622Y);
            s10.append('.');
            LogUtilsKt.warnLog(s10.toString());
        }
        this.billing.findPurchaseInPurchaseHistory(str2, productType2, (String) obj.f37622Y, new PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$2(obj, this, activity, str2, purchasingData, googleReplacementMode, presentedOfferingContext, bool), new PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3(this, purchaseErrorCallback));
    }

    private final boolean shouldRefreshCustomerInfo(boolean z10) {
        if (this.appConfig.getCustomEntitlementComputation()) {
            return false;
        }
        if (!z10 && !this.deviceCache.isCustomerInfoCacheStale(getAppUserID(), false)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void syncPurchases$default(PurchasesOrchestrator purchasesOrchestrator, SyncPurchasesCallback syncPurchasesCallback, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchasesOrchestrator.syncPurchases(syncPurchasesCallback);
    }

    private final void synchronizeSubscriberAttributesIfNeeded() {
        SubscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers$default(this.subscriberAttributesManager, getAppUserID(), null, 2, null);
    }

    public final void updateAllCaches(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        boolean appInBackground = getState$purchases_customEntitlementComputationRelease().getAppInBackground();
        this.customerInfoHelper.retrieveCustomerInfo(str, CacheFetchPolicy.FETCH_CURRENT, appInBackground, getAllowSharingPlayStoreAccount(), receiveCustomerInfoCallback);
        OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, str, appInBackground, null, null, 12, null);
    }

    public static /* synthetic */ void updateAllCaches$default(PurchasesOrchestrator purchasesOrchestrator, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchasesOrchestrator.updateAllCaches(str, receiveCustomerInfoCallback);
    }

    public final void close() {
        synchronized (this) {
            PurchasesState state$purchases_customEntitlementComputationRelease = getState$purchases_customEntitlementComputationRelease();
            Map emptyMap = Collections.emptyMap();
            AbstractC3557B.b0("emptyMap()", emptyMap);
            setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(state$purchases_customEntitlementComputationRelease, null, emptyMap, null, false, false, 29, null));
        }
        this.backend.close();
        this.billing.close();
        setUpdatedCustomerInfoListener(null);
        dispatch(new PurchasesOrchestrator$close$2(this));
    }

    public final void collectDeviceIdentifiers() {
        AbstractC2469q0.t(new Object[]{"collectDeviceIdentifiers"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.collectDeviceIdentifiers(getAppUserID(), this.application);
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        boolean z10;
        try {
            Boolean allowSharingPlayStoreAccount = getState$purchases_customEntitlementComputationRelease().getAllowSharingPlayStoreAccount();
            if (allowSharingPlayStoreAccount != null) {
                z10 = allowSharingPlayStoreAccount.booleanValue();
            } else {
                z10 = this.identityManager.currentUserIsAnonymous();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    public final AppConfig getAppConfig() {
        return this.appConfig;
    }

    public final synchronized String getAppUserID() {
        return this.identityManager.getCurrentAppUserID();
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        AbstractC3557B.c0("callback", receiveCustomerInfoCallback);
        getCustomerInfo(CacheFetchPolicy.Companion.m55default(), receiveCustomerInfoCallback);
    }

    public final synchronized boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    public final void getOfferings(ReceiveOfferingsCallback receiveOfferingsCallback, boolean z10) {
        AbstractC3557B.c0("listener", receiveOfferingsCallback);
        this.offeringsManager.getOfferings(this.identityManager.getCurrentAppUserID(), getState$purchases_customEntitlementComputationRelease().getAppInBackground(), new PurchasesOrchestrator$getOfferings$1(receiveOfferingsCallback), new PurchasesOrchestrator$getOfferings$2(receiveOfferingsCallback), z10);
    }

    public final OfflineEntitlementsManager getOfflineEntitlementsManager() {
        return this.offlineEntitlementsManager;
    }

    public final void getProducts(List<String> list, ProductType productType, final GetStoreProductsCallback getStoreProductsCallback) {
        Set<? extends ProductType> set;
        AbstractC3557B.c0("productIds", list);
        AbstractC3557B.c0("callback", getStoreProductsCallback);
        if (productType != null) {
            set = R4.b.W1(productType);
        } else {
            set = R4.b.X1(ProductType.SUBS, ProductType.INAPP);
        }
        getProductsOfTypes(t.P2(list), set, new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$getProducts$1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC3557B.c0("error", purchasesError);
                GetStoreProductsCallback.this.onError(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> list2) {
                AbstractC3557B.c0("storeProducts", list2);
                GetStoreProductsCallback.this.onReceived(list2);
            }
        });
    }

    public final void getProductsOfTypes(Set<String> set, Set<? extends ProductType> set2, GetStoreProductsCallback getStoreProductsCallback) {
        AbstractC3557B.c0("productIds", set);
        AbstractC3557B.c0("types", set2);
        AbstractC3557B.c0("callback", getStoreProductsCallback);
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((ProductType) obj) != ProductType.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        getProductsOfTypes(set, t.P2(arrayList), v.f37483Y, getStoreProductsCallback);
    }

    public final PurchasesState getState$purchases_customEntitlementComputationRelease() {
        return this.purchasesStateCache.getPurchasesState();
    }

    public final Store getStore() {
        return this.appConfig.getStore();
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.customerInfoUpdateHandler.getUpdatedCustomerInfoListener();
    }

    public final void invalidateCustomerInfoCache() {
        LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.INVALIDATING_CUSTOMERINFO_CACHE);
        this.deviceCache.clearCustomerInfoCache(getAppUserID());
    }

    public final boolean isAnonymous() {
        return this.identityManager.currentUserIsAnonymous();
    }

    public final void logIn(String str, LogInCallback logInCallback) {
        AbstractC3557B.c0("newAppUserID", str);
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        y yVar = null;
        if (AbstractC3557B.K(currentAppUserID, str)) {
            currentAppUserID = null;
        }
        if (currentAppUserID != null) {
            this.identityManager.logIn(str, new PurchasesOrchestrator$logIn$2$1(this, str, logInCallback), new PurchasesOrchestrator$logIn$2$2(this, logInCallback));
            yVar = y.f36177a;
        }
        if (yVar == null) {
            this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.Companion.m55default(), getState$purchases_customEntitlementComputationRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), ListenerConversionsCommonKt.receiveCustomerInfoCallback(new PurchasesOrchestrator$logIn$3(this, logInCallback), new PurchasesOrchestrator$logIn$4(this, logInCallback)));
        }
    }

    public final void logOut(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.identityManager.logOut(new PurchasesOrchestrator$logOut$1(receiveCustomerInfoCallback, this));
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        if (this.appConfig.getShowInAppMessagesAutomatically()) {
            showInAppMessagesIfNeeded(activity, q.z3(InAppMessageType.values()));
        }
    }

    @Override // com.revenuecat.purchases.utils.CustomActivityLifecycleHandler, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        CustomActivityLifecycleHandler.DefaultImpls.onActivityStopped(this, activity);
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppBackgrounded() {
        synchronized (this) {
            setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, null, null, true, false, 23, null));
        }
        LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.APP_BACKGROUNDED);
        synchronizeSubscriberAttributesIfNeeded();
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppForegrounded() {
        boolean firstTimeInForeground;
        synchronized (this) {
            firstTimeInForeground = getState$purchases_customEntitlementComputationRelease().getFirstTimeInForeground();
            setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, null, null, false, false, 7, null));
        }
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.APP_FOREGROUNDED);
        if (shouldRefreshCustomerInfo(firstTimeInForeground)) {
            LogWrapperKt.log(logIntent, CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND);
            CustomerInfoHelper.retrieveCustomerInfo$default(this.customerInfoHelper, this.identityManager.getCurrentAppUserID(), CacheFetchPolicy.FETCH_CURRENT, false, getAllowSharingPlayStoreAccount(), null, 16, null);
        }
        this.offeringsManager.onAppForeground(this.identityManager.getCurrentAppUserID());
        PostPendingTransactionsHelper.syncPendingPurchaseQueue$default(this.postPendingTransactionsHelper, getAllowSharingPlayStoreAccount(), null, null, 6, null);
        synchronizeSubscriberAttributesIfNeeded();
        OfflineEntitlementsManager.updateProductEntitlementMappingCacheIfStale$default(this.offlineEntitlementsManager, null, 1, null);
        flushPaywallEvents();
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback purchaseCallback) {
        y yVar;
        AbstractC3557B.c0("purchaseParams", purchaseParams);
        AbstractC3557B.c0("callback", purchaseCallback);
        String oldProductId = purchaseParams.getOldProductId();
        if (oldProductId != null) {
            startProductChange(purchaseParams.getActivity$purchases_customEntitlementComputationRelease(), purchaseParams.getPurchasingData$purchases_customEntitlementComputationRelease(), purchaseParams.getPresentedOfferingContext$purchases_customEntitlementComputationRelease(), oldProductId, purchaseParams.getGoogleReplacementMode(), purchaseParams.isPersonalizedPrice(), purchaseCallback);
            yVar = y.f36177a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            startPurchase(purchaseParams.getActivity$purchases_customEntitlementComputationRelease(), purchaseParams.getPurchasingData$purchases_customEntitlementComputationRelease(), purchaseParams.getPresentedOfferingContext$purchases_customEntitlementComputationRelease(), purchaseParams.isPersonalizedPrice(), purchaseCallback);
        }
    }

    public final void removeUpdatedCustomerInfoListener() {
        setUpdatedCustomerInfoListener(null);
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        AbstractC3557B.c0("callback", receiveCustomerInfoCallback);
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.RESTORING_PURCHASE);
        if (!getAllowSharingPlayStoreAccount()) {
            LogWrapperKt.log(LogIntent.WARNING, RestoreStrings.SHARING_ACC_RESTORE_FALSE);
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new PurchasesOrchestrator$restorePurchases$1(this, receiveCustomerInfoCallback, currentAppUserID), new PurchasesOrchestrator$restorePurchases$2(this, receiveCustomerInfoCallback));
    }

    public final void setAd(String str) {
        AbstractC2469q0.t(new Object[]{"setAd"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Ad.INSTANCE, str, getAppUserID());
    }

    public final void setAdGroup(String str) {
        AbstractC2469q0.t(new Object[]{"setAdGroup"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.AdGroup.INSTANCE, str, getAppUserID());
    }

    public final void setAdjustID(String str) {
        AbstractC2469q0.t(new Object[]{"setAdjustID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Adjust.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAirshipChannelID(String str) {
        AbstractC2469q0.t(new Object[]{"setAirshipChannelID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.Airship.INSTANCE, str, getAppUserID());
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z10) {
        setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), Boolean.valueOf(z10), null, null, false, false, 30, null));
    }

    public final void setAppConfig(AppConfig appConfig) {
        AbstractC3557B.c0("<set-?>", appConfig);
        this.appConfig = appConfig;
    }

    public final void setAppsflyerID(String str) {
        AbstractC2469q0.t(new Object[]{"setAppsflyerID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.AppsFlyer.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setAttributes(Map<String, String> map) {
        AbstractC3557B.c0("attributes", map);
        AbstractC2469q0.t(new Object[]{"setAttributes"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributes(map, getAppUserID());
    }

    public final void setCampaign(String str) {
        AbstractC2469q0.t(new Object[]{"setCampaign"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Campaign.INSTANCE, str, getAppUserID());
    }

    public final void setCleverTapID(String str) {
        AbstractC2469q0.t(new Object[]{"setCleverTapID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.CleverTap.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setCreative(String str) {
        AbstractC2469q0.t(new Object[]{"setCreative"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Creative.INSTANCE, str, getAppUserID());
    }

    public final void setDisplayName(String str) {
        AbstractC2469q0.t(new Object[]{"setDisplayName"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.DisplayName.INSTANCE, str, getAppUserID());
    }

    public final void setEmail(String str) {
        AbstractC2469q0.t(new Object[]{"setEmail"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.Email.INSTANCE, str, getAppUserID());
    }

    public final void setFBAnonymousID(String str) {
        AbstractC2469q0.t(new Object[]{"setFBAnonymousID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Facebook.INSTANCE, str, getAppUserID(), this.application);
    }

    public final synchronized void setFinishTransactions(boolean z10) {
        this.appConfig.setFinishTransactions(z10);
    }

    public final void setFirebaseAppInstanceID(String str) {
        AbstractC2469q0.t(new Object[]{"setFirebaseAppInstanceID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.FirebaseAppInstanceId.INSTANCE, str, getAppUserID());
    }

    public final void setKeyword(String str) {
        AbstractC2469q0.t(new Object[]{"seKeyword"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.Keyword.INSTANCE, str, getAppUserID());
    }

    public final void setMediaSource(String str) {
        AbstractC2469q0.t(new Object[]{"setMediaSource"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.CampaignParameters.MediaSource.INSTANCE, str, getAppUserID());
    }

    public final void setMixpanelDistinctID(String str) {
        AbstractC2469q0.t(new Object[]{"setMixpanelDistinctID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.MixpanelDistinctId.INSTANCE, str, getAppUserID());
    }

    public final void setMparticleID(String str) {
        AbstractC2469q0.t(new Object[]{"setMparticleID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttributionID(SubscriberAttributeKey.AttributionIds.Mparticle.INSTANCE, str, getAppUserID(), this.application);
    }

    public final void setOnesignalID(String str) {
        AbstractC2469q0.t(new Object[]{"setOnesignalID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignal.INSTANCE, str, getAppUserID());
    }

    public final void setOnesignalUserID(String str) {
        AbstractC2469q0.t(new Object[]{"setOnesignalUserID"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.IntegrationIds.OneSignalUserId.INSTANCE, str, getAppUserID());
    }

    public final void setPhoneNumber(String str) {
        AbstractC2469q0.t(new Object[]{"setPhoneNumber"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.PhoneNumber.INSTANCE, str, getAppUserID());
    }

    public final void setPushToken(String str) {
        AbstractC2469q0.t(new Object[]{"setPushToken"}, 1, AttributionStrings.METHOD_CALLED, LogIntent.DEBUG);
        this.subscriberAttributesManager.setAttribute(SubscriberAttributeKey.FCMTokens.INSTANCE, str, getAppUserID());
    }

    public final void setState$purchases_customEntitlementComputationRelease(PurchasesState purchasesState) {
        AbstractC3557B.c0("value", purchasesState);
        this.purchasesStateCache.setPurchasesState(purchasesState);
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.customerInfoUpdateHandler.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("inAppMessageTypes", list);
        this.billing.showInAppMessagesIfNeeded(activity, list, new PurchasesOrchestrator$showInAppMessagesIfNeeded$1(this));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String, kotlin.jvm.internal.g] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void startDeprecatedProductChange(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode, ProductChangeCallback productChangeCallback) {
        String str2;
        String str3;
        ProductChangeCallback productChangeCallback2;
        ?? r02;
        String offeringIdentifier;
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("purchasingData", purchasingData);
        AbstractC3557B.c0("oldProductId", str);
        AbstractC3557B.c0("listener", productChangeCallback);
        if (purchasingData.getProductType() != ProductType.SUBS) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(productChangeCallback, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        Object[] objArr = new Object[1];
        StringBuilder sb2 = new StringBuilder(Separators.SP);
        sb2.append(purchasingData);
        sb2.append(' ');
        y yVar = null;
        if (presentedOfferingContext != null && (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) != null) {
            str2 = PurchaseStrings.OFFERING.concat(offeringIdentifier);
        } else {
            str2 = null;
        }
        android.gov.nist.core.a.y(sb2, str2, " oldProductId: ", str, " googleReplacementMode ");
        sb2.append(googleReplacementMode);
        objArr[0] = sb2.toString();
        AbstractC2469q0.t(objArr, 1, PurchaseStrings.PRODUCT_CHANGE_STARTED, logIntent);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (getState$purchases_customEntitlementComputationRelease().getDeprecatedProductChangeCallback() == null) {
                    setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, null, productChangeCallback, false, false, 27, null));
                    str3 = this.identityManager.getCurrentAppUserID();
                } else {
                    str3 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str3 != null) {
            r02 = 0;
            productChangeCallback2 = productChangeCallback;
            replaceOldPurchaseWithNewProduct(purchasingData, str, googleReplacementMode, activity, str3, presentedOfferingContext, null, productChangeCallback);
            yVar = y.f36177a;
        } else {
            r02 = 0;
            productChangeCallback2 = productChangeCallback;
        }
        if (yVar == null) {
            getAndClearProductChangeCallback();
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, r02, 2, r02);
            LogUtilsKt.errorLog(purchasesError2);
            dispatch(productChangeCallback2, purchasesError2);
        }
    }

    public final void startProductChange(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode, Boolean bool, PurchaseCallback purchaseCallback) {
        String str2;
        String str3;
        y yVar;
        String offeringIdentifier;
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("purchasingData", purchasingData);
        AbstractC3557B.c0("oldProductId", str);
        AbstractC3557B.c0("googleReplacementMode", googleReplacementMode);
        AbstractC3557B.c0("purchaseCallback", purchaseCallback);
        if (purchasingData.getProductType() != ProductType.SUBS) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PurchaseNotAllowedError, PurchaseStrings.UPGRADING_INVALID_TYPE);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(purchaseCallback, purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.PURCHASE;
        Object[] objArr = new Object[1];
        StringBuilder sb2 = new StringBuilder(Separators.SP);
        sb2.append(purchasingData);
        sb2.append(' ');
        if (presentedOfferingContext != null && (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) != null) {
            str2 = PurchaseStrings.OFFERING.concat(offeringIdentifier);
        } else {
            str2 = null;
        }
        android.gov.nist.core.a.y(sb2, str2, " oldProductId: ", str, " googleReplacementMode ");
        sb2.append(googleReplacementMode);
        objArr[0] = sb2.toString();
        AbstractC2469q0.t(objArr, 1, PurchaseStrings.PRODUCT_CHANGE_STARTED, logIntent);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (!getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, AbstractC4268D.e1(getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId(), P4.a.o0(new C3959i(purchasingData.getProductId(), purchaseCallback))), null, false, false, 29, null));
                    str3 = this.identityManager.getCurrentAppUserID();
                } else {
                    str3 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str3 != null) {
            replaceOldPurchaseWithNewProduct(purchasingData, str, googleReplacementMode, activity, str3, presentedOfferingContext, bool, purchaseCallback);
            yVar = y.f36177a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError2);
            for (PurchaseCallback purchaseCallback2 : getAndClearAllPurchaseCallbacks()) {
                dispatch(purchaseCallback2, purchasesError2);
            }
        }
    }

    public final void startPurchase(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, Boolean bool, PurchaseCallback purchaseCallback) {
        String str;
        String str2;
        y yVar;
        String offeringIdentifier;
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("purchasingData", purchasingData);
        AbstractC3557B.c0("listener", purchaseCallback);
        LogIntent logIntent = LogIntent.PURCHASE;
        Object[] objArr = new Object[1];
        StringBuilder sb2 = new StringBuilder(Separators.SP);
        sb2.append(purchasingData);
        sb2.append(' ');
        if (presentedOfferingContext != null && (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) != null) {
            str = PurchaseStrings.OFFERING.concat(offeringIdentifier);
        } else {
            str = null;
        }
        sb2.append(str);
        objArr[0] = sb2.toString();
        AbstractC2469q0.t(objArr, 1, PurchaseStrings.PURCHASE_STARTED, logIntent);
        synchronized (this) {
            try {
                if (!this.appConfig.getFinishTransactions()) {
                    LogWrapperKt.log(LogIntent.WARNING, PurchaseStrings.PURCHASE_FINISH_TRANSACTION_FALSE);
                }
                if (!getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId().containsKey(purchasingData.getProductId())) {
                    setState$purchases_customEntitlementComputationRelease(PurchasesState.copy$default(getState$purchases_customEntitlementComputationRelease(), null, AbstractC4268D.e1(getState$purchases_customEntitlementComputationRelease().getPurchaseCallbacksByProductId(), P4.a.o0(new C3959i(purchasingData.getProductId(), purchaseCallback))), null, false, false, 29, null));
                    str2 = this.identityManager.getCurrentAppUserID();
                } else {
                    str2 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (str2 != null) {
            this.billing.makePurchaseAsync(activity, str2, purchasingData, null, presentedOfferingContext, bool);
            yVar = y.f36177a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.OperationAlreadyInProgressError, null, 2, null);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(purchaseCallback, purchasesError);
        }
    }

    public final void switchUser(String str) {
        AbstractC3557B.c0("newAppUserID", str);
        if (AbstractC3557B.K(this.identityManager.getCurrentAppUserID(), str)) {
            LogUtilsKt.warnLog(String.format(IdentityStrings.SWITCHING_USER_SAME_APP_USER_ID, Arrays.copyOf(new Object[]{str}, 1)));
            return;
        }
        this.identityManager.switchUser(str);
        OfferingsManager.fetchAndCacheOfferings$default(this.offeringsManager, str, getState$purchases_customEntitlementComputationRelease().getAppInBackground(), null, null, 12, null);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback, com.revenuecat.purchases.PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1] */
    public final void syncAttributesAndOfferingsIfNeeded(final SyncAttributesAndOfferingsCallback syncAttributesAndOfferingsCallback) {
        AbstractC3557B.c0("callback", syncAttributesAndOfferingsCallback);
        ?? r22 = new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$receiveOfferingsCallback$1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError purchasesError) {
                AbstractC3557B.c0("error", purchasesError);
                SyncAttributesAndOfferingsCallback.this.onError(purchasesError);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                AbstractC3557B.c0("offerings", offerings);
                SyncAttributesAndOfferingsCallback.this.onSuccess(offerings);
            }
        };
        if (!this.lastSyncAttributesAndOfferingsRateLimiter.shouldProceed()) {
            LogIntent logIntent = LogIntent.WARNING;
            Integer valueOf = Integer.valueOf(this.lastSyncAttributesAndOfferingsRateLimiter.getMaxCallsInPeriod());
            long m68getPeriodSecondsUwyO8pc = this.lastSyncAttributesAndOfferingsRateLimiter.m68getPeriodSecondsUwyO8pc();
            Mg.a aVar = Mg.b.f12127Z;
            AbstractC2469q0.t(new Object[]{valueOf, Long.valueOf(Mg.b.l(m68getPeriodSecondsUwyO8pc, d.f12134i0))}, 2, SyncAttributesAndOfferingsStrings.RATE_LIMIT_REACHED, logIntent);
            getOfferings$default(this, r22, false, 2, null);
            return;
        }
        this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getAppUserID(), new PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$1(this, r22));
    }

    public final void syncObserverModeAmazonPurchase(String str, String str2, String str3, String str4, Double d10) {
        AbstractC3557B.c0("productID", str);
        AbstractC3557B.c0("receiptID", str2);
        AbstractC3557B.c0("amazonUserID", str3);
        LogIntent logIntent = LogIntent.DEBUG;
        AbstractC2469q0.t(new Object[]{str2, str3}, 2, PurchaseStrings.SYNCING_PURCHASE_STORE_USER_ID, logIntent);
        Set<String> previouslySentHashedTokens = this.deviceCache.getPreviouslySentHashedTokens();
        if (!previouslySentHashedTokens.contains(UtilsKt.sha1(str2))) {
            previouslySentHashedTokens = null;
        }
        if (previouslySentHashedTokens != null) {
            AbstractC2469q0.t(new Object[]{str2, str3}, 2, PurchaseStrings.SYNCING_PURCHASE_SKIPPING, logIntent);
        } else {
            this.billing.normalizePurchaseData(str, str2, str3, new PurchasesOrchestrator$syncObserverModeAmazonPurchase$3(d10, str4, this, str2, str3, this.identityManager.getCurrentAppUserID()), new PurchasesOrchestrator$syncObserverModeAmazonPurchase$4(str2, str3));
        }
    }

    public final void syncPurchases(SyncPurchasesCallback syncPurchasesCallback) {
        this.syncPurchasesHelper.syncPurchases(getAllowSharingPlayStoreAccount(), getState$purchases_customEntitlementComputationRelease().getAppInBackground(), new PurchasesOrchestrator$syncPurchases$1(syncPurchasesCallback), new PurchasesOrchestrator$syncPurchases$2(syncPurchasesCallback));
    }

    @ExperimentalPreviewRevenueCatPurchasesAPI
    public final void track(PaywallEvent paywallEvent) {
        PaywallEventsManager paywallEventsManager;
        AbstractC3557B.c0("paywallEvent", paywallEvent);
        this.paywallPresentedCache.receiveEvent(paywallEvent);
        if (AndroidVersionUtilsKt.isAndroidNOrNewer() && (paywallEventsManager = this.paywallEventsManager) != null) {
            paywallEventsManager.track(paywallEvent);
        }
    }

    public final void getCustomerInfo(CacheFetchPolicy cacheFetchPolicy, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        AbstractC3557B.c0("fetchPolicy", cacheFetchPolicy);
        AbstractC3557B.c0("callback", receiveCustomerInfoCallback);
        this.customerInfoHelper.retrieveCustomerInfo(this.identityManager.getCurrentAppUserID(), cacheFetchPolicy, getState$purchases_customEntitlementComputationRelease().getAppInBackground(), getAllowSharingPlayStoreAccount(), receiveCustomerInfoCallback);
    }

    public final void dispatch(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        dispatch(new PurchasesOrchestrator$dispatch$1(purchaseErrorCallback, purchasesError));
    }

    public final void getProductsOfTypes(Set<String> set, Set<? extends ProductType> set2, List<? extends StoreProduct> list, GetStoreProductsCallback getStoreProductsCallback) {
        Set O22 = t.O2(set2);
        ProductType productType = (ProductType) t.g2(O22);
        y yVar = null;
        if (productType != null) {
            O22.remove(productType);
        } else {
            productType = null;
        }
        if (productType != null) {
            this.billing.queryProductDetailsAsync(productType, set, new PurchasesOrchestrator$getProductsOfTypes$1$1(this, set, O22, list, getStoreProductsCallback), new PurchasesOrchestrator$getProductsOfTypes$1$2(this, getStoreProductsCallback));
            yVar = y.f36177a;
        }
        if (yVar == null) {
            getStoreProductsCallback.onReceived(list);
        }
    }

    public /* synthetic */ PurchasesOrchestrator(Application application, String str, Backend backend, BillingAbstract billingAbstract, DeviceCache deviceCache, IdentityManager identityManager, SubscriberAttributesManager subscriberAttributesManager, AppConfig appConfig, CustomerInfoHelper customerInfoHelper, CustomerInfoUpdateHandler customerInfoUpdateHandler, DiagnosticsSynchronizer diagnosticsSynchronizer, OfflineEntitlementsManager offlineEntitlementsManager, PostReceiptHelper postReceiptHelper, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, PostPendingTransactionsHelper postPendingTransactionsHelper, SyncPurchasesHelper syncPurchasesHelper, OfferingsManager offeringsManager, PaywallEventsManager paywallEventsManager, PaywallPresentedCache paywallPresentedCache, PurchasesStateCache purchasesStateCache, Handler handler, int i10, g gVar) {
        this(application, str, backend, billingAbstract, deviceCache, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, paywallEventsManager, paywallPresentedCache, purchasesStateCache, (i10 & 1048576) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
