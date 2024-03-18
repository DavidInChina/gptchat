package com.revenuecat.purchases.amazon.handler;

import android.os.Handler;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.amazon.PurchasingServiceProvider;
import com.revenuecat.purchases.amazon.listener.UserDataResponseListener;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.utils.DefaultTimestampProvider;
import com.revenuecat.purchases.utils.TimestampProvider;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import wf.k;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010#\u001a\u00020\"\u00a2\u0006\u0004\b.\u0010/J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u001a\u001a\u00020\u00072\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00052\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u0016\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110%8BX\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\"\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010(\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010*R\"\u0010,\u001a\u0004\u0018\u00010+2\b\u0010(\u001a\u0004\u0018\u00010+8B@BX\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010-\u00a8\u00062"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/UserDataHandler;", "Lcom/revenuecat/purchases/amazon/listener/UserDataResponseListener;", "Lcom/amazon/device/iap/model/UserData;", "getCachedUserDataIfAvailable", "()Lcom/amazon/device/iap/model/UserData;", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Ljf/y;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "", "message", "invokeWithStoreProblem", "(Lwf/k;Ljava/lang/String;)V", "Lcom/amazon/device/iap/model/RequestId;", "requestId", "addTimeoutToUserDataRequest", "(Lcom/amazon/device/iap/model/RequestId;)V", "Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "getRequest", "(Lcom/amazon/device/iap/model/RequestId;)Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "Lcom/amazon/device/iap/model/UserDataResponse;", "response", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "onSuccess", "onError", "getUserData", "(Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "purchasingServiceProvider", "Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/utils/TimestampProvider;", "timestampProvider", "Lcom/revenuecat/purchases/utils/TimestampProvider;", "", "requests", "Ljava/util/Map;", "<set-?>", "userDataCache", "Lcom/amazon/device/iap/model/UserData;", "", "lastUserDataRequestTimestamp", "Ljava/lang/Long;", "<init>", "(Lcom/revenuecat/purchases/amazon/PurchasingServiceProvider;Landroid/os/Handler;Lcom/revenuecat/purchases/utils/TimestampProvider;)V", "Companion", "Request", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class UserDataHandler implements UserDataResponseListener {
    private static final long CACHE_EXPIRATION_TIME_MILLIS = 300000;
    public static final Companion Companion = new Companion(null);
    private static final long GET_USER_DATA_TIMEOUT_MILLIS = 10000;
    private Long lastUserDataRequestTimestamp;
    private final Handler mainHandler;
    private final PurchasingServiceProvider purchasingServiceProvider;
    private final Map<RequestId, Request> requests;
    private final TimestampProvider timestampProvider;
    private UserData userDataCache;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Companion;", "", "()V", "CACHE_EXPIRATION_TIME_MILLIS", "", "GET_USER_DATA_TIMEOUT_MILLIS", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\b\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\bH\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\u0006J@\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\bH\u00c6\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0017R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u0006R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\b8\u0006\u00a2\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0006\u00a8\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "", "Lkotlin/Function1;", "Lcom/amazon/device/iap/model/UserData;", "Ljf/y;", "component1", "()Lwf/k;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "component2", "onReceive", "onError", "copy", "(Lwf/k;Lwf/k;)Lcom/revenuecat/purchases/amazon/handler/UserDataHandler$Request;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwf/k;", "getOnReceive", "getOnError", "<init>", "(Lwf/k;Lwf/k;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class Request {
        private final k onError;
        private final k onReceive;

        public Request(k kVar, k kVar2) {
            AbstractC3557B.c0("onReceive", kVar);
            AbstractC3557B.c0("onError", kVar2);
            this.onReceive = kVar;
            this.onError = kVar2;
        }

        public static /* synthetic */ Request copy$default(Request request, k kVar, k kVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                kVar = request.onReceive;
            }
            if ((i10 & 2) != 0) {
                kVar2 = request.onError;
            }
            return request.copy(kVar, kVar2);
        }

        public final k component1() {
            return this.onReceive;
        }

        public final k component2() {
            return this.onError;
        }

        public final Request copy(k kVar, k kVar2) {
            AbstractC3557B.c0("onReceive", kVar);
            AbstractC3557B.c0("onError", kVar2);
            return new Request(kVar, kVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return AbstractC3557B.K(this.onReceive, request.onReceive) && AbstractC3557B.K(this.onError, request.onError);
        }

        public final k getOnError() {
            return this.onError;
        }

        public final k getOnReceive() {
            return this.onReceive;
        }

        public int hashCode() {
            return this.onError.hashCode() + (this.onReceive.hashCode() * 31);
        }

        public String toString() {
            return "Request(onReceive=" + this.onReceive + ", onError=" + this.onError + ')';
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserDataResponse.RequestStatus.values().length];
            try {
                iArr[UserDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserDataResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserDataResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserDataHandler(PurchasingServiceProvider purchasingServiceProvider, Handler handler, TimestampProvider timestampProvider) {
        AbstractC3557B.c0("purchasingServiceProvider", purchasingServiceProvider);
        AbstractC3557B.c0("mainHandler", handler);
        AbstractC3557B.c0("timestampProvider", timestampProvider);
        this.purchasingServiceProvider = purchasingServiceProvider;
        this.mainHandler = handler;
        this.timestampProvider = timestampProvider;
        this.requests = new LinkedHashMap();
    }

    private final void addTimeoutToUserDataRequest(RequestId requestId) {
        this.mainHandler.postDelayed(new a(this, requestId, 1), GET_USER_DATA_TIMEOUT_MILLIS);
    }

    public static final void addTimeoutToUserDataRequest$lambda$5(UserDataHandler userDataHandler, RequestId requestId) {
        AbstractC3557B.c0("this$0", userDataHandler);
        AbstractC3557B.c0("$requestId", requestId);
        Request request = userDataHandler.getRequest(requestId);
        if (request == null) {
            return;
        }
        request.getOnError().invoke(new PurchasesError(PurchasesErrorCode.UnknownError, AmazonStrings.ERROR_TIMEOUT_GETTING_USER_DATA));
    }

    private final synchronized UserData getCachedUserDataIfAvailable() {
        Long l10;
        UserData userData = this.userDataCache;
        if (userData != null && (l10 = this.lastUserDataRequestTimestamp) != null) {
            if (this.timestampProvider.getCurrentTimeMillis() - l10.longValue() < CACHE_EXPIRATION_TIME_MILLIS) {
                return userData;
            }
        }
        return null;
    }

    private final synchronized Request getRequest(RequestId requestId) {
        return this.requests.remove(requestId);
    }

    private final void invokeWithStoreProblem(k kVar, String str) {
        kVar.invoke(new PurchasesError(PurchasesErrorCode.StoreProblemError, str));
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void getUserData(k kVar, k kVar2) {
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        UserData cachedUserDataIfAvailable = getCachedUserDataIfAvailable();
        if (cachedUserDataIfAvailable != null) {
            LogWrapperKt.log(LogIntent.DEBUG, AmazonStrings.USER_DATA_REQUEST_FROM_CACHE);
            kVar.invoke(cachedUserDataIfAvailable);
            return;
        }
        RequestId userData = this.purchasingServiceProvider.getUserData();
        Request request = new Request(kVar, kVar2);
        synchronized (this) {
            this.requests.put(userData, request);
            addTimeoutToUserDataRequest(userData);
        }
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onProductDataResponse(ProductDataResponse productDataResponse) {
        UserDataResponseListener.DefaultImpls.onProductDataResponse(this, productDataResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseResponse(PurchaseResponse purchaseResponse) {
        UserDataResponseListener.DefaultImpls.onPurchaseResponse(this, purchaseResponse);
    }

    @Override // com.revenuecat.purchases.amazon.listener.UserDataResponseListener
    public void onPurchaseUpdatesResponse(PurchaseUpdatesResponse purchaseUpdatesResponse) {
        UserDataResponseListener.DefaultImpls.onPurchaseUpdatesResponse(this, purchaseUpdatesResponse);
    }

    public void onUserDataResponse(UserDataResponse userDataResponse) {
        int i10;
        AbstractC3557B.c0("response", userDataResponse);
        try {
            LogWrapperKt.log(LogIntent.DEBUG, String.format(AmazonStrings.USER_DATA_REQUEST_FINISHED, Arrays.copyOf(new Object[]{userDataResponse.getRequestStatus().name()}, 1)));
            RequestId requestId = userDataResponse.getRequestId();
            AbstractC3557B.b0("response.requestId", requestId);
            Request request = getRequest(requestId);
            if (request == null) {
                return;
            }
            UserDataResponse.RequestStatus requestStatus = userDataResponse.getRequestStatus();
            if (requestStatus == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$0[requestStatus.ordinal()];
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        invokeWithStoreProblem(request.getOnError(), AmazonStrings.ERROR_USER_DATA_STORE_PROBLEM);
                        return;
                    } else {
                        invokeWithStoreProblem(request.getOnError(), AmazonStrings.ERROR_UNSUPPORTED_USER_DATA);
                        return;
                    }
                }
                invokeWithStoreProblem(request.getOnError(), AmazonStrings.ERROR_FAILED_USER_DATA);
                return;
            }
            synchronized (this) {
                this.lastUserDataRequestTimestamp = Long.valueOf(this.timestampProvider.getCurrentTimeMillis());
                this.userDataCache = userDataResponse.getUserData();
            }
            k onReceive = request.getOnReceive();
            UserData userData = userDataResponse.getUserData();
            AbstractC3557B.b0("response.userData", userData);
            onReceive.invoke(userData);
        } catch (Exception e10) {
            LogUtilsKt.errorLog("Exception in onUserDataResponse", e10);
            throw e10;
        }
    }

    public /* synthetic */ UserDataHandler(PurchasingServiceProvider purchasingServiceProvider, Handler handler, TimestampProvider timestampProvider, int i10, g gVar) {
        this(purchasingServiceProvider, handler, (i10 & 4) != 0 ? new DefaultTimestampProvider() : timestampProvider);
    }
}
