package com.revenuecat.purchases.amazon;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.amazon.AmazonPurchasingData;
import com.revenuecat.purchases.amazon.handler.ProductDataHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseHandler;
import com.revenuecat.purchases.amazon.handler.PurchaseUpdatesHandler;
import com.revenuecat.purchases.amazon.handler.UserDataHandler;
import com.revenuecat.purchases.amazon.listener.ProductDataResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import id.AbstractC3557B;
import j7.RunnableC3921k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import l8.AbstractC4344b;
import org.json.JSONException;
import org.json.JSONObject;
import wf.AbstractC6216a;
import wf.k;
import wf.n;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\u00aa\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0086\u0001\u0012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001\u0012\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001\u0012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001\u0012\u0007\u0010\u008d\u0001\u001a\u00020;\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u00a3\u0001\u001a\u00030\u00a2\u0001\u0012\n\b\u0002\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u0012\t\b\u0002\u0010\u0093\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0095\u0001\u001a\u00020\u0003\u0012\t\b\u0002\u0010\u0097\u0001\u001a\u00020\u0004\u0012\t\b\u0002\u0010\u0099\u0001\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u009c\u0001\u001a\u00030\u009b\u0001\u00a2\u0006\u0006\b\u00a4\u0001\u0010\u00a5\u0001BD\b\u0016\u0012\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001\u0012\b\u0010\u008b\u0001\u001a\u00030\u00a6\u0001\u0012\u0007\u0010\u008d\u0001\u001a\u00020;\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u00a8\u0001\u001a\u00030\u00a7\u0001\u0012\b\u0010\u00a3\u0001\u001a\u00030\u00a2\u0001\u00a2\u0006\u0006\b\u00a4\u0001\u0010\u00a9\u0001JT\u0010\u0011\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u00072\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0096\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012J^\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\f2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u00192\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0096\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001eJD\u0010\u001f\u001a\u00020\r2\u001e\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u00192\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0096\u0001\u00a2\u0006\u0004\b\u001f\u0010 J8\u0010!\u001a\u00020\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0096\u0001\u00a2\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0016\u00a2\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\rH\u0014\u00a2\u0006\u0004\b)\u0010$JI\u0010.\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00072\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nj\u0002`,H\u0016\u00a2\u0006\u0004\b.\u0010/JO\u00103\u001a\u00020\r2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0016\u00a2\u0006\u0004\b3\u00104J[\u00109\u001a\u00020\r2\u0006\u00106\u001a\u0002052\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u001c\u0010\u000e\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\nj\u0002`82\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nj\u0002`,H\u0016\u00a2\u0006\u0004\b9\u0010:J'\u0010?\u001a\u00020\r2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020*2\u0006\u0010>\u001a\u00020=H\u0016\u00a2\u0006\u0004\b?\u0010@JO\u0010C\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u00106\u001a\u0002052\u0006\u0010A\u001a\u00020\u00072\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0016\u00a2\u0006\u0004\bC\u0010DJE\u0010L\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010F\u001a\u00020E2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010K\u001a\u0004\u0018\u00010;H\u0016\u00a2\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020;H\u0016\u00a2\u0006\u0004\bN\u0010OJK\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00072\u001e\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*0P\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0016\u00a2\u0006\u0004\b\u001f\u0010/J3\u0010U\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0\u000b2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\r0SH\u0016\u00a2\u0006\u0004\bU\u0010VJ;\u0010W\u001a\u00020\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\n2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nj\u0002`,H\u0016\u00a2\u0006\u0004\bW\u0010\"J\u0017\u0010Z\u001a\u00020\r2\u0006\u0010Y\u001a\u00020XH\u0016\u00a2\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\\H\u0016\u00a2\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\r2\u0006\u0010Y\u001a\u00020_H\u0016\u00a2\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\r2\u0006\u0010Y\u001a\u00020bH\u0016\u00a2\u0006\u0004\bc\u0010dJA\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*0P*\b\u0012\u0004\u0012\u00020\u001a0\u000b2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070P2\u0006\u0010f\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\bg\u0010hJ\u0019\u0010j\u001a\u0004\u0018\u00010\u00072\u0006\u0010Y\u001a\u00020iH\u0002\u00a2\u0006\u0004\bj\u0010kJ#\u0010m\u001a\u00020\r2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0PH\u0002\u00a2\u0006\u0004\bm\u0010nJK\u0010\u001f\u001a\u00020\r2\u0006\u0010o\u001a\u00020;2\u001e\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*0P\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0002\u00a2\u0006\u0004\b\u001f\u0010pJW\u0010s\u001a\u00020\r2\u0006\u0010q\u001a\u00020\u00072\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b20\u0010B\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070P\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0P\u0012\u0004\u0012\u00020\r0\u0019H\u0002\u00a2\u0006\u0004\bs\u0010tJ1\u0010v\u001a\u00020\r2\u0006\u0010u\u001a\u00020\u001a2\u0006\u0010f\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010J\u001a\u0004\u0018\u00010IH\u0002\u00a2\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020\r2\u0006\u0010x\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\by\u0010zJ\u000f\u0010{\u001a\u00020;H\u0002\u00a2\u0006\u0004\b{\u0010OJ%\u0010}\u001a\u00020\r2\u0014\u0010|\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\nH\u0002\u00a2\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u007f\u0010$J\u001c\u0010\u0082\u0001\u001a\u00020\r2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0002\u00a2\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u008d\u0001\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\b\u0014\u0010\u008f\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0093\u0001\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0017\u0010\u0095\u0001\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u0097\u0001\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010\u009e\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009e\u0001\u0010\u008e\u0001R,\u0010\u00a0\u0001\u001a\u0017\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\n0\u009f\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u00a0\u0001\u0010\u00a1\u0001\u00a8\u0006\u00aa\u0001"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonBilling;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "", "", "skus", "marketplace", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Ljf/y;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getProductData", "(Ljava/util/Set;Ljava/lang/String;Lwf/k;Lwf/k;)V", "Landroid/os/Handler;", "mainHandler", "Landroid/app/Activity;", "activity", "appUserID", "storeProduct", "Lkotlin/Function2;", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "onSuccess", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Lwf/n;Lwf/k;)V", "queryPurchases", "(Lwf/n;Lwf/k;)V", "getUserData", "(Lwf/k;Lwf/k;)V", "startConnection", "()V", "", "delayMilliseconds", "startConnectionOnMainThread", "(J)V", "endConnection", "Lcom/revenuecat/purchases/models/StoreTransaction;", "onReceivePurchaseHistory", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onReceivePurchaseHistoryError", "queryAllPurchases", "(Ljava/lang/String;Lwf/k;Lwf/k;)V", "productID", "purchaseToken", "storeUserID", "normalizePurchaseData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/ProductType;", "productType", "productIds", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lwf/k;Lwf/k;)V", "", "shouldTryToConsume", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "productId", "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "isConnected", "()Z", "", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lwf/a;)V", "getStorefront", "Lcom/amazon/device/iap/model/UserDataResponse;", "response", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "tokensToSkusMap", "userData", "toMapOfReceiptHashesToRestoredPurchases", "(Ljava/util/List;Ljava/util/Map;Lcom/amazon/device/iap/model/UserData;)Ljava/util/Map;", "Lorg/json/JSONObject;", "getTermSkuFromJSON", "(Lorg/json/JSONObject;)Ljava/lang/String;", "errors", "logErrorsIfAny", "(Ljava/util/Map;)V", "filterOnlyActivePurchases", "(ZLwf/k;Lwf/k;)V", "amazonUserID", "receipts", "getMissingSkusForReceipts", "(Ljava/lang/String;Ljava/util/List;Lwf/n;)V", "receipt", "handleReceipt", "(Lcom/amazon/device/iap/model/Receipt;Lcom/amazon/device/iap/model/UserData;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "error", "onPurchaseError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "checkObserverMode", "request", "executeRequestOnUIThread", "(Lwf/k;)V", "executePendingRequests", "Ljava/lang/Runnable;", "runnable", "runOnUIThread", "(Ljava/lang/Runnable;)V", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "amazonBackend", "Lcom/revenuecat/purchases/amazon/AmazonBackend;", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "cache", "Lcom/revenuecat/purchases/amazon/AmazonCache;", "observerMode", "Z", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "productDataHandler", "Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "purchaseHandler", "Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "purchaseUpdatesHandler", "Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;", "userDataHandler", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "connected", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "stateProvider", "<init>", "(Landroid/content/Context;Lcom/revenuecat/purchases/amazon/AmazonBackend;Lcom/revenuecat/purchases/amazon/AmazonCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;Lcom/revenuecat/purchases/amazon/listener/PurchaseUpdatesResponseListener;Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;Lcom/revenuecat/purchases/common/DateProvider;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "(Landroid/content/Context;Lcom/revenuecat/purchases/common/caching/DeviceCache;ZLandroid/os/Handler;Lcom/revenuecat/purchases/common/BackendHelper;Lcom/revenuecat/purchases/PurchasesStateProvider;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class AmazonBilling extends BillingAbstract implements ProductDataResponseListener, PurchaseResponseListener, PurchaseUpdatesResponseListener, UserDataResponseListener {
    private final AmazonBackend amazonBackend;
    private final Context applicationContext;
    private final AmazonCache cache;
    private boolean connected;
    private final DateProvider dateProvider;
    private final Handler mainHandler;
    private final boolean observerMode;
    private final ProductDataResponseListener productDataHandler;
    private final PurchaseResponseListener purchaseHandler;
    private final PurchaseUpdatesResponseListener purchaseUpdatesHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final ConcurrentLinkedQueue<k> serviceRequests;
    private final UserDataResponseListener userDataHandler;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z10, Handler handler, PurchasesStateProvider purchasesStateProvider, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider, int i10, g gVar) {
        this(context, amazonBackend, amazonCache, z10, handler, purchasesStateProvider, r9, (i10 & 128) != 0 ? new ProductDataHandler(r9, handler) : productDataResponseListener, (i10 & 256) != 0 ? new PurchaseHandler(r9, context) : purchaseResponseListener, (i10 & 512) != 0 ? new PurchaseUpdatesHandler(r9) : purchaseUpdatesResponseListener, (i10 & 1024) != 0 ? new UserDataHandler(r9, handler, null, 4, null) : userDataResponseListener, (i10 & 2048) != 0 ? new DefaultDateProvider() : dateProvider);
        DefaultPurchasingServiceProvider defaultPurchasingServiceProvider = (i10 & 64) != 0 ? new DefaultPurchasingServiceProvider() : purchasingServiceProvider;
    }

    private final boolean checkObserverMode() {
        if (this.observerMode) {
            LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.WARNING_AMAZON_OBSERVER_MODE);
            return true;
        }
        return false;
    }

    private final void executePendingRequests() {
        synchronized (this) {
            while (isConnected() && !this.serviceRequests.isEmpty()) {
                runOnUIThread(new RunnableC3921k(7, this.serviceRequests.remove()));
            }
        }
    }

    private final synchronized void executeRequestOnUIThread(k kVar) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(kVar);
                if (!isConnected()) {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                } else {
                    executePendingRequests();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.jvm.internal.z] */
    public final void getMissingSkusForReceipts(String str, List<Receipt> list, n nVar) {
        AmazonBilling amazonBilling = this;
        Map<String, String> receiptSkus = amazonBilling.cache.getReceiptSkus();
        LinkedHashMap m12 = AbstractC4268D.m1(receiptSkus);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Receipt) obj).getProductType() != ProductType.SUBSCRIPTION) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Receipt receipt = (Receipt) it.next();
            arrayList2.add(AbstractC3557B.D2(receipt.getReceiptId(), receipt.getSku()));
        }
        AbstractC4268D.i1(arrayList2, m12);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (((Receipt) obj2).getProductType() == ProductType.SUBSCRIPTION) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!receiptSkus.containsKey(((Receipt) next).getReceiptId())) {
                arrayList4.add(next);
            }
        }
        if (arrayList4.isEmpty()) {
            nVar.invoke(m12, linkedHashMap);
            return;
        }
        ?? obj3 = new Object();
        obj3.f37647Y = arrayList4.size();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Receipt receipt2 = (Receipt) it3.next();
            AmazonBackend amazonBackend = amazonBilling.amazonBackend;
            String receiptId = receipt2.getReceiptId();
            AbstractC3557B.b0("receipt.receiptId", receiptId);
            amazonBackend.getAmazonReceiptData(receiptId, str, new AmazonBilling$getMissingSkusForReceipts$1$1(m12, receipt2, obj3, this, nVar, linkedHashMap), new AmazonBilling$getMissingSkusForReceipts$1$2(linkedHashMap, receipt2, obj3, nVar, m12));
            amazonBilling = this;
        }
    }

    public final String getTermSkuFromJSON(JSONObject jSONObject) {
        try {
            return jSONObject.getString("termSku");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void handleReceipt(Receipt receipt, UserData userData, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        if (receipt.getProductType() != ProductType.SUBSCRIPTION) {
            StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, storeProduct.getId(), presentedOfferingContext, PurchaseState.PURCHASED, userData);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(AbstractC4344b.F0(storeTransaction));
                return;
            }
            return;
        }
        AmazonBackend amazonBackend = this.amazonBackend;
        String receiptId = receipt.getReceiptId();
        AbstractC3557B.b0("receipt.receiptId", receiptId);
        String userId = userData.getUserId();
        AbstractC3557B.b0("userData.userId", userId);
        amazonBackend.getAmazonReceiptData(receiptId, userId, new AmazonBilling$handleReceipt$1(receipt, presentedOfferingContext, userData, this), new AmazonBilling$handleReceipt$2(this));
    }

    public final void logErrorsIfAny(Map<String, PurchasesError> map) {
        if (!map.isEmpty()) {
            AbstractC2469q0.t(new Object[]{t.m2(map.keySet(), Separators.RETURN, null, null, null, 62)}, 1, AmazonStrings.ERROR_FETCHING_RECEIPTS, LogIntent.AMAZON_ERROR);
        }
    }

    public final void onPurchaseError(PurchasesError purchasesError) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (AbstractC3557B.K(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    public static final void startConnectionOnMainThread$lambda$0(AmazonBilling amazonBilling) {
        AbstractC3557B.c0("this$0", amazonBilling);
        amazonBilling.startConnection();
    }

    public final Map<String, StoreTransaction> toMapOfReceiptHashesToRestoredPurchases(List<Receipt> list, Map<String, String> map, UserData userData) {
        ArrayList arrayList = new ArrayList();
        for (Receipt receipt : list) {
            String str = map.get(receipt.getReceiptId());
            C3959i c3959i = null;
            if (str == null) {
                LogWrapperKt.log(LogIntent.AMAZON_ERROR, AmazonStrings.ERROR_FINDING_RECEIPT_SKU);
            } else {
                StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(receipt, str, null, PurchaseState.UNSPECIFIED_STATE, userData);
                String receiptId = receipt.getReceiptId();
                AbstractC3557B.b0("receipt.receiptId", receiptId);
                c3959i = AbstractC3557B.D2(UtilsKt.sha1(receiptId), storeTransaction);
            }
            if (c3959i != null) {
                arrayList.add(c3959i);
            }
        }
        return AbstractC4268D.k1(arrayList);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean z10, StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource) {
        AbstractC3557B.c0("purchase", storeTransaction);
        AbstractC3557B.c0("initiationSource", postReceiptInitiationSource);
        if (checkObserverMode() || storeTransaction.getType() == com.revenuecat.purchases.ProductType.UNKNOWN || storeTransaction.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        if (z10) {
            executeRequestOnUIThread(new AmazonBilling$consumeAndSave$1(this, storeTransaction));
        }
        this.cache.addSuccessfullyPostedToken(storeTransaction.getPurchaseToken());
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void endConnection() {
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String str, com.revenuecat.purchases.ProductType productType, String str2, k kVar, k kVar2) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("productType", productType);
        AbstractC3557B.c0("productId", str2);
        AbstractC3557B.c0("onCompletion", kVar);
        AbstractC3557B.c0("onError", kVar2);
        LogWrapperKt.log(LogIntent.DEBUG, String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{str2, productType.name()}, 2)));
        queryAllPurchases(str, new AmazonBilling$findPurchaseInPurchaseHistory$1(kVar, str2, kVar2), kVar2);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener
    public void getProductData(Set<String> set, String str, k kVar, k kVar2) {
        AbstractC3557B.c0("skus", set);
        AbstractC3557B.c0("marketplace", str);
        AbstractC3557B.c0("onReceive", kVar);
        AbstractC3557B.c0("onError", kVar2);
        this.productDataHandler.getProductData(set, str, kVar, kVar2);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getStorefront(k kVar, k kVar2) {
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        executeRequestOnUIThread(new AmazonBilling$getStorefront$1(this, kVar2, kVar));
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void getUserData(k kVar, k kVar2) {
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        this.userDataHandler.getUserData(kVar, kVar2);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public boolean isConnected() {
        return this.connected;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        AmazonPurchasingData.Product product;
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("purchasingData", purchasingData);
        if (purchasingData instanceof AmazonPurchasingData.Product) {
            product = (AmazonPurchasingData.Product) purchasingData;
        } else {
            product = null;
        }
        if (product == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Amazon", "AmazonPurchaseInfo"}, 2)));
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                return;
            }
            return;
        }
        AmazonStoreProduct storeProduct = product.getStoreProduct();
        if (checkObserverMode()) {
            return;
        }
        if (replaceProductInfo != null) {
            LogWrapperKt.log(LogIntent.AMAZON_WARNING, AmazonStrings.PRODUCT_CHANGES_NOT_SUPPORTED);
        } else {
            executeRequestOnUIThread(new AmazonBilling$makePurchaseAsync$1(this, activity, str, storeProduct, presentedOfferingContext));
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void normalizePurchaseData(String str, String str2, String str3, k kVar, k kVar2) {
        AbstractC3557B.c0("productID", str);
        AbstractC3557B.c0("purchaseToken", str2);
        AbstractC3557B.c0("storeUserID", str3);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        String str4 = this.cache.getReceiptSkus().get(str2);
        if (str4 != null) {
            kVar.invoke(str4);
        } else {
            this.amazonBackend.getAmazonReceiptData(str2, str3, new AmazonBilling$normalizePurchaseData$2(this, kVar2, str2, kVar), new AmazonBilling$normalizePurchaseData$3(kVar2));
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        AbstractC3557B.c0("response", productDataResponse);
        if (checkObserverMode()) {
            return;
        }
        this.productDataHandler.onProductDataResponse(productDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        AbstractC3557B.c0("response", purchaseResponse);
        if (checkObserverMode()) {
            return;
        }
        this.purchaseHandler.onPurchaseResponse(purchaseResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        AbstractC3557B.c0("response", purchaseUpdatesResponse);
        if (checkObserverMode()) {
            return;
        }
        this.purchaseUpdatesHandler.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.ProductDataResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseResponseListener, com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void onUserDataResponse(UserDataResponse userDataResponse) {
        AbstractC3557B.c0("response", userDataResponse);
        if (checkObserverMode()) {
            return;
        }
        this.userDataHandler.onUserDataResponse(userDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseResponseListener
    public void purchase(Handler handler, Activity activity, String str, StoreProduct storeProduct, n nVar, k kVar) {
        AbstractC3557B.c0("mainHandler", handler);
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("storeProduct", storeProduct);
        AbstractC3557B.c0("onSuccess", nVar);
        AbstractC3557B.c0("onError", kVar);
        this.purchaseHandler.purchase(handler, activity, str, storeProduct, nVar, kVar);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String str, k kVar, k kVar2) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("onReceivePurchaseHistory", kVar);
        AbstractC3557B.c0("onReceivePurchaseHistoryError", kVar2);
        queryPurchases(false, (k) new AmazonBilling$queryAllPurchases$1(kVar), kVar2);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(com.revenuecat.purchases.ProductType productType, Set<String> set, k kVar, k kVar2) {
        AbstractC3557B.c0("productType", productType);
        AbstractC3557B.c0("productIds", set);
        AbstractC3557B.c0("onReceive", kVar);
        AbstractC3557B.c0("onError", kVar2);
        if (checkObserverMode()) {
            return;
        }
        executeRequestOnUIThread(new AmazonBilling$queryProductDetailsAsync$1(this, kVar2, set, kVar));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String str, k kVar, k kVar2) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        if (checkObserverMode()) {
            return;
        }
        queryPurchases(true, kVar, kVar2);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("inAppMessageTypes", list);
        AbstractC3557B.c0("subscriptionStatusChange", abstractC6216a);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        if (checkObserverMode()) {
            return;
        }
        this.purchasingServiceProvider.registerListener(this.applicationContext, this);
        this.connected = true;
        BillingAbstract.StateListener stateListener = getStateListener();
        if (stateListener != null) {
            stateListener.onConnected();
        }
        executePendingRequests();
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long j6) {
        runOnUIThread(new RunnableC3921k(8, this));
    }

    @Override // com.revenuecat.purchases.amazon.listener.PurchaseUpdatesResponseListener
    public void queryPurchases(n nVar, k kVar) {
        AbstractC3557B.c0("onSuccess", nVar);
        AbstractC3557B.c0("onError", kVar);
        this.purchaseUpdatesHandler.queryPurchases(nVar, kVar);
    }

    private final void queryPurchases(boolean z10, k kVar, k kVar2) {
        executeRequestOnUIThread(new AmazonBilling$queryPurchases$1(this, kVar2, z10, kVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context context, AmazonBackend amazonBackend, AmazonCache amazonCache, boolean z10, Handler handler, PurchasesStateProvider purchasesStateProvider, PurchasingServiceProvider purchasingServiceProvider, ProductDataResponseListener productDataResponseListener, PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponseListener purchaseUpdatesResponseListener, UserDataResponseListener userDataResponseListener, DateProvider dateProvider) {
        super(purchasesStateProvider);
        AbstractC3557B.c0("applicationContext", context);
        AbstractC3557B.c0("amazonBackend", amazonBackend);
        AbstractC3557B.c0("cache", amazonCache);
        AbstractC3557B.c0("mainHandler", handler);
        AbstractC3557B.c0("stateProvider", purchasesStateProvider);
        AbstractC3557B.c0("purchasingServiceProvider", purchasingServiceProvider);
        AbstractC3557B.c0("productDataHandler", productDataResponseListener);
        AbstractC3557B.c0("purchaseHandler", purchaseResponseListener);
        AbstractC3557B.c0("purchaseUpdatesHandler", purchaseUpdatesResponseListener);
        AbstractC3557B.c0("userDataHandler", userDataResponseListener);
        AbstractC3557B.c0("dateProvider", dateProvider);
        this.applicationContext = context;
        this.amazonBackend = amazonBackend;
        this.cache = amazonCache;
        this.observerMode = z10;
        this.mainHandler = handler;
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.productDataHandler = productDataResponseListener;
        this.purchaseHandler = purchaseResponseListener;
        this.purchaseUpdatesHandler = purchaseUpdatesResponseListener;
        this.userDataHandler = userDataResponseListener;
        this.dateProvider = dateProvider;
        this.serviceRequests = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonBilling(Context context, DeviceCache deviceCache, boolean z10, Handler handler, BackendHelper backendHelper, PurchasesStateProvider purchasesStateProvider) {
        this(context, new AmazonBackend(backendHelper), new AmazonCache(deviceCache), z10, handler, purchasesStateProvider, null, null, null, null, null, null, 4032, null);
        AbstractC3557B.c0("applicationContext", context);
        AbstractC3557B.c0("cache", deviceCache);
        AbstractC3557B.c0("mainHandler", handler);
        AbstractC3557B.c0("backendHelper", backendHelper);
        AbstractC3557B.c0("stateProvider", purchasesStateProvider);
    }
}
