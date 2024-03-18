package com.revenuecat.purchases.google;

import K4.AbstractC0815c;
import K4.AbstractC0817e;
import K4.C0816d;
import K4.C0820h;
import K4.C0821i;
import K4.C0822j;
import K4.C0823k;
import K4.C0824l;
import K4.q;
import K4.t;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.BillingClientUseCase;
import com.revenuecat.purchases.google.usecase.BillingClientUseCaseKt;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.utils.Result;
import id.AbstractC3557B;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import jf.C3959i;
import jf.y;
import kf.v;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import l8.AbstractC4344b;
import u5.RunnableC5841a;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000\u00a0\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u00a8\u0001BI\u0012\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001\u0012\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001\u0012\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001\u0012\n\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u0001\u0012\b\u0010\u00a5\u0001\u001a\u00030\u00a4\u0001\u0012\n\b\u0002\u0010\u008d\u0001\u001a\u00030\u008c\u0001\u00a2\u0006\u0006\b\u00a6\u0001\u0010\u00a7\u0001J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\b\u000b\u0010\nJ[\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u001c\u0010\u0015\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00060\u0011j\u0002`\u00142\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0011j\u0002`\u0017H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJE\u0010&\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0004\b&\u0010'JC\u0010+\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000f2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u0012\u0012\u0004\u0012\u00020\u00060\u00112\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0011\u00a2\u0006\u0004\b+\u0010,JE\u0010.\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000f2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u0012\u0012\u0004\u0012\u00020\u00060\u00112\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0011H\u0016\u00a2\u0006\u0004\b.\u0010,J'\u00103\u001a\u00020\u00062\u0006\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020-2\u0006\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\b3\u00104J3\u00109\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0011H\u0000\u00a2\u0006\u0004\b7\u00108J3\u0010<\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0011H\u0000\u00a2\u0006\u0004\b;\u00108JK\u0010?\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000f2\u001e\u0010>\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020-0=\u0012\u0004\u0012\u00020\u00060\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0011H\u0016\u00a2\u0006\u0004\b?\u0010,JO\u0010B\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010@\u001a\u00020\u000f2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0011H\u0016\u00a2\u0006\u0004\bB\u0010CJ+\u0010H\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u000f2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0011H\u0001\u00a2\u0006\u0004\bF\u0010GJ'\u0010M\u001a\u00020\u00062\u0006\u0010J\u001a\u00020I2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010\u0012H\u0016\u00a2\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u00062\u0006\u0010J\u001a\u00020IH\u0016\u00a2\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\bQ\u0010\nJ\u000f\u0010R\u001a\u00020$H\u0016\u00a2\u0006\u0004\bR\u0010SJ3\u0010X\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u00122\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00060VH\u0016\u00a2\u0006\u0004\bX\u0010YJ;\u0010Z\u001a\u00020\u00062\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u00112\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0011j\u0002`\u0017H\u0016\u00a2\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\\\u0010\nJ1\u0010^\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010]\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00060\u0011H\u0002\u00a2\u0006\u0004\b^\u0010_J\u001f\u0010b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010a\u001a\u00020`H\u0003\u00a2\u0006\u0004\bb\u0010cJG\u0010e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\u000f2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00112\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060\u0011H\u0002\u00a2\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\bg\u0010\nJ#\u0010j\u001a\u00020\u00062\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u00060\u0011H\u0002\u00a2\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\bl\u0010mJ+\u0010o\u001a\u00020\u00062\u0006\u00100\u001a\u00020K2\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060\u0011H\u0002\u00a2\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\bq\u0010\nJ?\u0010u\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00160t2\u0006\u0010s\u001a\u00020r2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002\u00a2\u0006\u0004\bu\u0010vJ5\u0010x\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00160t2\u0006\u0010s\u001a\u00020w2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002\u00a2\u0006\u0004\bx\u0010yJ?\u0010{\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\u00160t2\u0006\u0010s\u001a\u00020z2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002\u00a2\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u00062\u0006\u0010}\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R6\u0010\u0090\u0001\u001a\u0004\u0018\u00010h2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010h8F@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R%\u0010\u0098\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R;\u0010\u009c\u0001\u001a&\u0012!\u0012\u001f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00060\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u009b\u00010\u009a\u00018\u0002X\u0082\u0004\u00a2\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\"\u0010\u00a0\u0001\u001a\u00020$2\u0007\u0010\u008f\u0001\u001a\u00020$8B@BX\u0082\u000e\u00a2\u0006\b\n\u0006\b\u00a0\u0001\u0010\u00a1\u0001R\u0013\u0010\u00a3\u0001\u001a\u00020$8F\u00a2\u0006\u0007\u001a\u0005\b\u00a2\u0001\u0010S\u00a8\u0006\u00a9\u0001"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "LK4/t;", "LK4/e;", "", "delayMilliseconds", "Ljf/y;", "startConnectionOnMainThread", "(J)V", "startConnection", "()V", "endConnection", "Lcom/revenuecat/purchases/ProductType;", "productType", "", "", "productIds", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lwf/k;Lwf/k;)V", "Landroid/app/Activity;", "activity", "appUserID", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "onReceivePurchaseHistory", "onReceivePurchaseHistoryError", "queryPurchaseHistoryAsync", "(Ljava/lang/String;Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "queryAllPurchases", "shouldTryToConsume", "purchase", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "token", "onConsumed", "consumePurchase$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lwf/k;)V", "consumePurchase", "onAcknowledged", "acknowledge$purchases_customEntitlementComputationRelease", "acknowledge", "", "onSuccess", "queryPurchases", "productId", "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lwf/k;Lwf/k;)V", "purchaseToken", "listener", "getPurchaseType$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;Lwf/k;)V", "getPurchaseType", "LK4/j;", "billingResult", "Lcom/android/billingclient/api/Purchase;", "purchases", "onPurchasesUpdated", "(LK4/j;Ljava/util/List;)V", "onBillingSetupFinished", "(LK4/j;)V", "onBillingServiceDisconnected", "isConnected", "()Z", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lwf/a;)V", "getStorefront", "(Lwf/k;Lwf/k;)V", "executePendingRequests", "request", "executeRequestOnUIThread", "(Ljava/lang/Long;Lwf/k;)V", "LK4/i;", "params", "launchBillingFlow", "(Landroid/app/Activity;LK4/i;)V", "resultHandler", "queryPurchaseType", "(Ljava/lang/String;Ljava/lang/String;Lwf/k;Lwf/k;)V", "retryBillingServiceConnectionWithExponentialBackoff", "LK4/c;", "receivingFunction", "withConnectedClient", "(Lwf/k;)V", "getStackTrace", "()Ljava/lang/String;", "completion", "getStoreTransaction", "(Lcom/android/billingclient/api/Purchase;Lwf/k;)V", "trackProductDetailsNotSupportedIfNeeded", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "purchaseInfo", "Lcom/revenuecat/purchases/utils/Result;", "buildPurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "buildOneTimePurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "buildSubscriptionPurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "error", "sendErrorsToAllPendingRequests", "(Lcom/revenuecat/purchases/PurchasesError;)V", "Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "clientFactory", "Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "<set-?>", "billingClient", "LK4/c;", "getBillingClient", "()LK4/c;", "setBillingClient", "(LK4/c;)V", "", "Lcom/revenuecat/purchases/google/PurchaseContext;", "purchaseContext", "Ljava/util/Map;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljf/i;", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "reconnectMilliseconds", "J", "reconnectionAlreadyScheduled", "Z", "getAppInBackground", "appInBackground", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "purchasesStateProvider", "<init>", "(Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;Landroid/os/Handler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/DateProvider;)V", "ClientFactory", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class BillingWrapper extends BillingAbstract implements t, AbstractC0817e {
    private volatile AbstractC0815c billingClient;
    private final ClientFactory clientFactory;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler mainHandler;
    private final Map<String, PurchaseContext> purchaseContext;
    private long reconnectMilliseconds;
    private boolean reconnectionAlreadyScheduled;
    private final ConcurrentLinkedQueue<C3959i> serviceRequests;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "", "LK4/t;", "listener", "LK4/c;", "buildClient", "(LK4/t;)LK4/c;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class ClientFactory {
        private final Context context;

        public ClientFactory(Context context) {
            AbstractC3557B.c0("context", context);
            this.context = context;
        }

        public final AbstractC0815c buildClient(t tVar) {
            AbstractC3557B.c0("listener", tVar);
            Context context = this.context;
            if (context != null) {
                return new C0816d(context, tVar);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public /* synthetic */ BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider, int i10, g gVar) {
        this(clientFactory, handler, deviceCache, diagnosticsTracker, purchasesStateProvider, (i10 & 32) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [U3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [K4.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, f3.f] */
    private final Result<C0821i, PurchasesError> buildOneTimePurchaseParams(GooglePurchasingData.InAppProduct inAppProduct, String str, Boolean bool) {
        ?? obj = new Object();
        q productDetails = inAppProduct.getProductDetails();
        obj.f17400Y = productDetails;
        if (productDetails.a() != null) {
            productDetails.a().getClass();
            String str2 = productDetails.a().f9447d;
            if (str2 != null) {
                obj.f17401Z = str2;
            }
        }
        C0820h b10 = obj.b();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        obj3.f29549b = 0;
        obj3.f29550c = 0;
        obj3.f29548a = true;
        obj2.f9429d = obj3;
        obj2.f9427b = new ArrayList(AbstractC4344b.F0(b10));
        obj2.f9426a = UtilsKt.sha256(str);
        if (bool != null) {
            obj2.f9428c = bool.booleanValue();
        }
        return new Result.Success(obj2.a());
    }

    public final Result<C0821i, PurchasesError> buildPurchaseParams(GooglePurchasingData googlePurchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            return buildOneTimePurchaseParams((GooglePurchasingData.InAppProduct) googlePurchasingData, str, bool);
        }
        if (googlePurchasingData instanceof GooglePurchasingData.Subscription) {
            return buildSubscriptionPurchaseParams((GooglePurchasingData.Subscription) googlePurchasingData, replaceProductInfo, str, bool);
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [U3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [K4.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, f3.f] */
    private final Result<C0821i, PurchasesError> buildSubscriptionPurchaseParams(GooglePurchasingData.Subscription subscription, ReplaceProductInfo replaceProductInfo, String str, Boolean bool) {
        ?? obj = new Object();
        obj.f17401Z = subscription.getToken();
        q productDetails = subscription.getProductDetails();
        obj.f17400Y = productDetails;
        if (productDetails.a() != null) {
            productDetails.a().getClass();
            String str2 = productDetails.a().f9447d;
            if (str2 != null) {
                obj.f17401Z = str2;
            }
        }
        C0820h b10 = obj.b();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        obj3.f29549b = 0;
        obj3.f29550c = 0;
        obj3.f29548a = true;
        obj2.f9429d = obj3;
        obj2.f9427b = new ArrayList(AbstractC4344b.F0(b10));
        if (replaceProductInfo != null) {
            BillingFlowParamsExtensionsKt.setUpgradeInfo(obj2, replaceProductInfo);
        } else {
            obj2.f9426a = UtilsKt.sha256(str);
        }
        if (bool != null) {
            obj2.f9428c = bool.booleanValue();
        }
        return new Result.Success(obj2.a());
    }

    public static final void endConnection$lambda$9(BillingWrapper billingWrapper) {
        AbstractC3557B.c0("this$0", billingWrapper);
        synchronized (billingWrapper) {
            try {
                AbstractC0815c abstractC0815c = billingWrapper.billingClient;
                if (abstractC0815c != null) {
                    LogWrapperKt.log(LogIntent.DEBUG, String.format(BillingStrings.BILLING_CLIENT_ENDING, Arrays.copyOf(new Object[]{abstractC0815c}, 1)));
                    abstractC0815c.a();
                }
                billingWrapper.billingClient = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void executePendingRequests() {
        C3959i poll;
        synchronized (this) {
            while (true) {
                try {
                    AbstractC0815c abstractC0815c = this.billingClient;
                    if (abstractC0815c == null || !abstractC0815c.c() || (poll = this.serviceRequests.poll()) == null) {
                        break;
                    }
                    final k kVar = (k) poll.f36155Y;
                    Long l10 = (Long) poll.f36156Z;
                    if (l10 != null) {
                        this.mainHandler.postDelayed(new Runnable() { // from class: com.revenuecat.purchases.google.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i10 = r1;
                                k kVar2 = kVar;
                                switch (i10) {
                                    case 0:
                                        BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$0(kVar2);
                                        return;
                                    default:
                                        BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$1(kVar2);
                                        return;
                                }
                            }
                        }, l10.longValue());
                    } else {
                        this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i10 = r1;
                                k kVar2 = kVar;
                                switch (i10) {
                                    case 0:
                                        BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$0(kVar2);
                                        return;
                                    default:
                                        BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$1(kVar2);
                                        return;
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final void executePendingRequests$lambda$3$lambda$2$lambda$0(k kVar) {
        AbstractC3557B.c0("$request", kVar);
        kVar.invoke(null);
    }

    public static final void executePendingRequests$lambda$3$lambda$2$lambda$1(k kVar) {
        AbstractC3557B.c0("$request", kVar);
        kVar.invoke(null);
    }

    public final synchronized void executeRequestOnUIThread(Long l10, k kVar) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(new C3959i(kVar, l10));
                AbstractC0815c abstractC0815c = this.billingClient;
                if (abstractC0815c != null && !abstractC0815c.c()) {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                } else {
                    executePendingRequests();
                }
            } else {
                kVar.invoke(new PurchasesError(PurchasesErrorCode.UnknownError, "BillingWrapper is not attached to a listener"));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void executeRequestOnUIThread$default(BillingWrapper billingWrapper, Long l10, k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        billingWrapper.executeRequestOnUIThread(l10, kVar);
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        AbstractC3557B.b0("stringWriter.toString()", stringWriter2);
        return stringWriter2;
    }

    private final void getStoreTransaction(Purchase purchase, k kVar) {
        AbstractC2469q0.t(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(purchase)}, 1, BillingStrings.BILLING_WRAPPER_PURCHASES_UPDATED, LogIntent.DEBUG);
        synchronized (this) {
            PurchaseContext purchaseContext = this.purchaseContext.get(PurchaseExtensionsKt.getFirstProductId(purchase));
            if (purchaseContext != null && purchaseContext.getProductType() != null) {
                kVar.invoke(StoreTransactionConversionsKt.toStoreTransaction(purchase, purchaseContext));
                return;
            }
            String b10 = purchase.b();
            AbstractC3557B.b0("purchase.purchaseToken", b10);
            getPurchaseType$purchases_customEntitlementComputationRelease(b10, new BillingWrapper$getStoreTransaction$1$2(kVar, purchase));
        }
    }

    public final void launchBillingFlow(Activity activity, C0821i c0821i) {
        if (activity.getIntent() == null) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.NULL_ACTIVITY_INTENT);
        }
        withConnectedClient(new BillingWrapper$launchBillingFlow$1(activity, c0821i));
    }

    public static final void onBillingSetupFinished$lambda$18(C0822j c0822j, BillingWrapper billingWrapper) {
        PurchasesError purchasesError;
        String str;
        AbstractC3557B.c0("$billingResult", c0822j);
        AbstractC3557B.c0("this$0", billingWrapper);
        int i10 = c0822j.f9439a;
        if (i10 != 6) {
            if (i10 != 7 && i10 != 8) {
                if (i10 != 12) {
                    switch (i10) {
                        case -2:
                        case 3:
                            String humanReadableDescription = BillingResultExtensionsKt.toHumanReadableDescription(c0822j);
                            if (AbstractC3557B.K(c0822j.f9440b, ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE)) {
                                purchasesError = new PurchasesError(PurchasesErrorCode.StoreProblemError, String.format(BillingStrings.BILLING_UNAVAILABLE_LESS_THAN_3, Arrays.copyOf(new Object[]{humanReadableDescription}, 1)));
                                LogUtilsKt.errorLog(purchasesError);
                            } else {
                                purchasesError = ErrorsKt.billingResponseToPurchasesError(c0822j.f9439a, String.format(BillingStrings.BILLING_UNAVAILABLE, Arrays.copyOf(new Object[]{humanReadableDescription}, 1)));
                                LogUtilsKt.errorLog(purchasesError);
                            }
                            billingWrapper.sendErrorsToAllPendingRequests(purchasesError);
                            return;
                        case -1:
                        case 1:
                        case 2:
                            break;
                        case 0:
                            LogIntent logIntent = LogIntent.DEBUG;
                            Object[] objArr = new Object[1];
                            AbstractC0815c abstractC0815c = billingWrapper.billingClient;
                            if (abstractC0815c != null) {
                                str = abstractC0815c.toString();
                            } else {
                                str = null;
                            }
                            objArr[0] = str;
                            LogWrapperKt.log(logIntent, String.format(BillingStrings.BILLING_SERVICE_SETUP_FINISHED, Arrays.copyOf(objArr, 1)));
                            BillingAbstract.StateListener stateListener = billingWrapper.getStateListener();
                            if (stateListener != null) {
                                stateListener.onConnected();
                            }
                            billingWrapper.executePendingRequests();
                            billingWrapper.reconnectMilliseconds = 1000L;
                            billingWrapper.trackProductDetailsNotSupportedIfNeeded();
                            return;
                        case 4:
                            break;
                        default:
                            return;
                    }
                }
            }
            AbstractC2469q0.t(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(c0822j)}, 1, BillingStrings.BILLING_CLIENT_ERROR, LogIntent.GOOGLE_WARNING);
            return;
        }
        AbstractC2469q0.t(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(c0822j)}, 1, BillingStrings.BILLING_CLIENT_ERROR, LogIntent.GOOGLE_WARNING);
        billingWrapper.retryBillingServiceConnectionWithExponentialBackoff();
    }

    public final void queryPurchaseType(String str, String str2, k kVar, k kVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground(), str), new BillingWrapper$queryPurchaseType$1(kVar2, str2), new BillingWrapper$queryPurchaseType$2(kVar), new BillingWrapper$queryPurchaseType$3(this), new BillingWrapper$queryPurchaseType$4(this)), 0L, 1, null);
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        if (this.reconnectionAlreadyScheduled) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.BILLING_CLIENT_RETRY_ALREADY_SCHEDULED);
            return;
        }
        AbstractC2469q0.t(new Object[]{Long.valueOf(this.reconnectMilliseconds)}, 1, BillingStrings.BILLING_CLIENT_RETRY, LogIntent.WARNING);
        this.reconnectionAlreadyScheduled = true;
        startConnectionOnMainThread(this.reconnectMilliseconds);
        this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * 2, (long) BillingClientUseCaseKt.RETRY_TIMER_MAX_TIME_MILLISECONDS);
    }

    private final synchronized void sendErrorsToAllPendingRequests(PurchasesError purchasesError) {
        while (true) {
            C3959i poll = this.serviceRequests.poll();
            if (poll != null) {
                this.mainHandler.post(new RunnableC5841a((k) poll.f36155Y, 11, purchasesError));
            }
        }
    }

    public static final void sendErrorsToAllPendingRequests$lambda$31$lambda$30(k kVar, PurchasesError purchasesError) {
        AbstractC3557B.c0("$serviceRequest", kVar);
        AbstractC3557B.c0("$error", purchasesError);
        kVar.invoke(purchasesError);
    }

    public static final void startConnectionOnMainThread$lambda$4(BillingWrapper billingWrapper) {
        AbstractC3557B.c0("this$0", billingWrapper);
        billingWrapper.startConnection();
    }

    private final void trackProductDetailsNotSupportedIfNeeded() {
        C0822j c0822j;
        int i10;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        AbstractC0815c abstractC0815c = this.billingClient;
        if (abstractC0815c != null) {
            c0822j = abstractC0815c.b("fff");
        } else {
            c0822j = null;
        }
        if (c0822j != null && (i10 = c0822j.f9439a) == -2) {
            DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
            String str = c0822j.f9440b;
            AbstractC3557B.b0("billingResult.debugMessage", str);
            diagnosticsTracker.trackProductDetailsNotSupported(i10, str);
        }
    }

    public final void withConnectedClient(k kVar) {
        AbstractC0815c abstractC0815c = this.billingClient;
        y yVar = null;
        if (abstractC0815c != null) {
            if (!abstractC0815c.c()) {
                abstractC0815c = null;
            }
            if (abstractC0815c != null) {
                kVar.invoke(abstractC0815c);
                yVar = y.f36177a;
            }
        }
        if (yVar == null) {
            AbstractC2469q0.t(new Object[]{getStackTrace()}, 1, BillingStrings.BILLING_CLIENT_DISCONNECTED, LogIntent.GOOGLE_WARNING);
        }
    }

    public final void acknowledge$purchases_customEntitlementComputationRelease(String str, PostReceiptInitiationSource postReceiptInitiationSource, k kVar) {
        AbstractC3557B.c0("token", str);
        AbstractC3557B.c0("initiationSource", postReceiptInitiationSource);
        AbstractC3557B.c0("onAcknowledged", kVar);
        LogWrapperKt.log(LogIntent.PURCHASE, String.format(PurchaseStrings.ACKNOWLEDGING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1)));
        BillingClientUseCase.run$default(new AcknowledgePurchaseUseCase(new AcknowledgePurchaseUseCaseParams(str, postReceiptInitiationSource, getAppInBackground()), kVar, BillingWrapper$acknowledge$1.INSTANCE, new BillingWrapper$acknowledge$2(this), new BillingWrapper$acknowledge$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean z10, StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource) {
        boolean z11;
        AbstractC3557B.c0("purchase", storeTransaction);
        AbstractC3557B.c0("initiationSource", postReceiptInitiationSource);
        if (storeTransaction.getType() == ProductType.UNKNOWN || storeTransaction.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        Purchase originalGooglePurchase = StoreTransactionConversionsKt.getOriginalGooglePurchase(storeTransaction);
        if (originalGooglePurchase != null) {
            z11 = originalGooglePurchase.f26705c.optBoolean("acknowledged", true);
        } else {
            z11 = false;
        }
        if (z10 && storeTransaction.getType() == ProductType.INAPP) {
            consumePurchase$purchases_customEntitlementComputationRelease(storeTransaction.getPurchaseToken(), postReceiptInitiationSource, new BillingWrapper$consumeAndSave$1(this.deviceCache));
        } else if (z10 && !z11) {
            acknowledge$purchases_customEntitlementComputationRelease(storeTransaction.getPurchaseToken(), postReceiptInitiationSource, new BillingWrapper$consumeAndSave$2(this.deviceCache));
        } else {
            this.deviceCache.addSuccessfullyPostedToken(storeTransaction.getPurchaseToken());
        }
    }

    public final void consumePurchase$purchases_customEntitlementComputationRelease(String str, PostReceiptInitiationSource postReceiptInitiationSource, k kVar) {
        AbstractC3557B.c0("token", str);
        AbstractC3557B.c0("initiationSource", postReceiptInitiationSource);
        AbstractC3557B.c0("onConsumed", kVar);
        LogWrapperKt.log(LogIntent.PURCHASE, String.format(PurchaseStrings.CONSUMING_PURCHASE, Arrays.copyOf(new Object[]{str}, 1)));
        BillingClientUseCase.run$default(new ConsumePurchaseUseCase(new ConsumePurchaseUseCaseParams(str, postReceiptInitiationSource, getAppInBackground()), kVar, BillingWrapper$consumePurchase$1.INSTANCE, new BillingWrapper$consumePurchase$2(this), new BillingWrapper$consumePurchase$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void endConnection() {
        this.mainHandler.post(new b(this, 0));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String str, ProductType productType, String str2, k kVar, k kVar2) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("productType", productType);
        AbstractC3557B.c0("productId", str2);
        AbstractC3557B.c0("onCompletion", kVar);
        AbstractC3557B.c0("onError", kVar2);
        LogWrapperKt.log(LogIntent.DEBUG, String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{str2, productType.name()}, 2)));
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(productType);
        y yVar = null;
        if (googleProductType != null) {
            BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, googleProductType, getAppInBackground()), new BillingWrapper$findPurchaseInPurchaseHistory$1$1(productType, kVar, str2, kVar2), kVar2, new BillingWrapper$findPurchaseInPurchaseHistory$1$2(this), new BillingWrapper$findPurchaseInPurchaseHistory$1$3(this)), 0L, 1, null);
            yVar = y.f36177a;
        }
        if (yVar == null) {
            kVar2.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.NOT_RECOGNIZED_PRODUCT_TYPE));
        }
    }

    public final boolean getAppInBackground() {
        return getPurchasesStateProvider().getPurchasesState().getAppInBackground();
    }

    public final synchronized AbstractC0815c getBillingClient() {
        return this.billingClient;
    }

    public final void getPurchaseType$purchases_customEntitlementComputationRelease(String str, k kVar) {
        AbstractC3557B.c0("purchaseToken", str);
        AbstractC3557B.c0("listener", kVar);
        queryPurchaseType("subs", str, kVar, new BillingWrapper$getPurchaseType$1(kVar, this, str));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getStorefront(k kVar, k kVar2) {
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        LogUtilsKt.verboseLog(BillingStrings.BILLING_INITIATE_GETTING_COUNTRY_CODE);
        BillingClientUseCase.run$default(new GetBillingConfigUseCase(new GetBillingConfigUseCaseParams(getAppInBackground()), this.deviceCache, new BillingWrapper$getStorefront$1(kVar), kVar2, new BillingWrapper$getStorefront$2(this), new BillingWrapper$getStorefront$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public boolean isConnected() {
        AbstractC0815c abstractC0815c = this.billingClient;
        if (abstractC0815c != null) {
            return abstractC0815c.c();
        }
        return false;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        GooglePurchasingData googlePurchasingData;
        String str2;
        ReplacementMode replacementMode;
        PresentedOfferingContext presentedOfferingContext2;
        GoogleReplacementMode googleReplacementMode;
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("purchasingData", purchasingData);
        if (purchasingData instanceof GooglePurchasingData) {
            googlePurchasingData = (GooglePurchasingData) purchasingData;
        } else {
            googlePurchasingData = null;
        }
        if (googlePurchasingData == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Play", "GooglePurchasingData"}, 2)));
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                return;
            }
            return;
        }
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            str2 = null;
        } else if (googlePurchasingData instanceof GooglePurchasingData.Subscription) {
            str2 = ((GooglePurchasingData.Subscription) googlePurchasingData).getOptionId();
        } else {
            throw new RuntimeException();
        }
        if (replaceProductInfo != null) {
            AbstractC2469q0.t(new Object[]{replaceProductInfo.getOldPurchase().getProductIds().get(0), googlePurchasingData.getProductId()}, 2, PurchaseStrings.UPGRADING_SKU, LogIntent.PURCHASE);
        } else {
            AbstractC2469q0.t(new Object[]{googlePurchasingData.getProductId()}, 1, PurchaseStrings.PURCHASING_PRODUCT, LogIntent.PURCHASE);
        }
        synchronized (this) {
            try {
                String productId = googlePurchasingData.getProductId();
                Map<String, PurchaseContext> map = this.purchaseContext;
                ProductType productType = googlePurchasingData.getProductType();
                if (replaceProductInfo != null) {
                    replacementMode = replaceProductInfo.getReplacementMode();
                } else {
                    replacementMode = null;
                }
                if (replacementMode instanceof GoogleReplacementMode) {
                    googleReplacementMode = (GoogleReplacementMode) replacementMode;
                    presentedOfferingContext2 = presentedOfferingContext;
                } else {
                    presentedOfferingContext2 = presentedOfferingContext;
                    googleReplacementMode = null;
                }
                map.put(productId, new PurchaseContext(productType, presentedOfferingContext2, str2, googleReplacementMode));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        executeRequestOnUIThread$default(this, null, new BillingWrapper$makePurchaseAsync$2(this, purchasingData, replaceProductInfo, str, bool, activity), 1, null);
    }

    @Override // K4.AbstractC0817e
    public void onBillingServiceDisconnected() {
        String str;
        LogIntent logIntent = LogIntent.WARNING;
        Object[] objArr = new Object[1];
        AbstractC0815c abstractC0815c = this.billingClient;
        if (abstractC0815c != null) {
            str = abstractC0815c.toString();
        } else {
            str = null;
        }
        objArr[0] = str;
        AbstractC2469q0.t(objArr, 1, BillingStrings.BILLING_SERVICE_DISCONNECTED_INSTANCE, logIntent);
    }

    @Override // K4.AbstractC0817e
    public void onBillingSetupFinished(C0822j c0822j) {
        AbstractC3557B.c0("billingResult", c0822j);
        this.mainHandler.post(new RunnableC5841a(c0822j, 10, this));
    }

    @Override // K4.t
    public void onPurchasesUpdated(C0822j c0822j, List<? extends Purchase> list) {
        List<? extends Purchase> list2;
        List<? extends Purchase> list3;
        AbstractC3557B.c0("billingResult", c0822j);
        if (list == null) {
            list2 = v.f37483Y;
        } else {
            list2 = list;
        }
        if (c0822j.f9439a == 0 && (!list2.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (Purchase purchase : list2) {
                getStoreTransaction(purchase, new BillingWrapper$onPurchasesUpdated$1$1(arrayList, list2, this));
            }
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(c0822j)}, 1)));
        String str = null;
        if (!list2.isEmpty()) {
            list3 = list2;
        } else {
            list3 = null;
        }
        if (list3 != null) {
            str = "Purchases:".concat(kf.t.m2(list3, ", ", null, null, BillingWrapper$onPurchasesUpdated$3$1.INSTANCE, 30));
        }
        sb2.append(str);
        LogWrapperKt.log(logIntent, sb2.toString());
        String str2 = "Error updating purchases. " + BillingResultExtensionsKt.toHumanReadableDescription(c0822j);
        int i10 = c0822j.f9439a;
        if (list == null && i10 == 0) {
            str2 = "Error: onPurchasesUpdated received an OK BillingResult with a Null purchases list.";
            i10 = 6;
        }
        PurchasesError billingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(i10, str2);
        LogUtilsKt.errorLog(billingResponseToPurchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(billingResponseToPurchasesError);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String str, k kVar, k kVar2) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("onReceivePurchaseHistory", kVar);
        AbstractC3557B.c0("onReceivePurchaseHistoryError", kVar2);
        queryPurchaseHistoryAsync("subs", new BillingWrapper$queryAllPurchases$1(this, kVar2, kVar), kVar2);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(ProductType productType, Set<String> set, k kVar, k kVar2) {
        AbstractC3557B.c0("productType", productType);
        AbstractC3557B.c0("productIds", set);
        AbstractC3557B.c0("onReceive", kVar);
        AbstractC3557B.c0("onError", kVar2);
        LogWrapperKt.log(LogIntent.DEBUG, String.format(OfferingStrings.FETCHING_PRODUCTS, Arrays.copyOf(new Object[]{kf.t.m2(set, null, null, null, null, 63)}, 1)));
        BillingClientUseCase.run$default(new QueryProductDetailsUseCase(new QueryProductDetailsUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, set, productType, getAppInBackground()), kVar, kVar2, new BillingWrapper$queryProductDetailsAsync$useCase$1(this), new BillingWrapper$queryProductDetailsAsync$useCase$2(this)), 0L, 1, null);
    }

    public final void queryPurchaseHistoryAsync(String str, k kVar, k kVar2) {
        AbstractC3557B.c0("productType", str);
        AbstractC3557B.c0("onReceivePurchaseHistory", kVar);
        AbstractC3557B.c0("onReceivePurchaseHistoryError", kVar2);
        LogWrapperKt.log(LogIntent.DEBUG, String.format(RestoreStrings.QUERYING_PURCHASE_HISTORY, Arrays.copyOf(new Object[]{str}, 1)));
        BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, str, getAppInBackground()), kVar, kVar2, new BillingWrapper$queryPurchaseHistoryAsync$1(this), new BillingWrapper$queryPurchaseHistoryAsync$2(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String str, k kVar, k kVar2) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.QUERYING_PURCHASE);
        BillingClientUseCase.run$default(new QueryPurchasesUseCase(new QueryPurchasesUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground()), kVar, kVar2, new BillingWrapper$queryPurchases$1(this), new BillingWrapper$queryPurchases$2(this)), 0L, 1, null);
    }

    public final synchronized void setBillingClient(AbstractC0815c abstractC0815c) {
        this.billingClient = abstractC0815c;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("inAppMessageTypes", list);
        AbstractC3557B.c0("subscriptionStatusChange", abstractC6216a);
        if (list.isEmpty()) {
            LogUtilsKt.errorLog$default(BillingStrings.BILLING_UNSPECIFIED_INAPP_MESSAGE_TYPES, null, 2, null);
            return;
        }
        C0823k c0823k = new C0823k(0);
        Iterator<? extends InAppMessageType> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            Set set = c0823k.f9441a;
            if (hasNext) {
                set.add(Integer.valueOf(it.next().getInAppMessageCategoryId$purchases_customEntitlementComputationRelease()));
            } else {
                executeRequestOnUIThread$default(this, null, new BillingWrapper$showInAppMessagesIfNeeded$1(this, new WeakReference(activity), new C0824l(set), abstractC6216a), 1, null);
                return;
            }
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        synchronized (this) {
            try {
                if (this.billingClient == null) {
                    this.billingClient = this.clientFactory.buildClient(this);
                }
                this.reconnectionAlreadyScheduled = false;
                AbstractC0815c abstractC0815c = this.billingClient;
                if (abstractC0815c != null && !abstractC0815c.c()) {
                    LogWrapperKt.log(LogIntent.DEBUG, String.format(BillingStrings.BILLING_CLIENT_STARTING, Arrays.copyOf(new Object[]{abstractC0815c}, 1)));
                    try {
                        abstractC0815c.e(this);
                    } catch (IllegalStateException e10) {
                        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, String.format(BillingStrings.ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING, Arrays.copyOf(new Object[]{e10}, 1)));
                        sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e10.getMessage()));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long j6) {
        this.mainHandler.postDelayed(new b(this, 1), j6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider) {
        super(purchasesStateProvider);
        AbstractC3557B.c0("clientFactory", clientFactory);
        AbstractC3557B.c0("mainHandler", handler);
        AbstractC3557B.c0("deviceCache", deviceCache);
        AbstractC3557B.c0("purchasesStateProvider", purchasesStateProvider);
        AbstractC3557B.c0("dateProvider", dateProvider);
        this.clientFactory = clientFactory;
        this.mainHandler = handler;
        this.deviceCache = deviceCache;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
        this.purchaseContext = new LinkedHashMap();
        this.serviceRequests = new ConcurrentLinkedQueue<>();
        this.reconnectMilliseconds = 1000L;
    }
}
