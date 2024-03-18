package com.revenuecat.purchases.identity;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import id.AbstractC3557B;
import java.util.Arrays;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class IdentityManager$logIn$2 extends o implements AbstractC6216a {
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ String $oldAppUserID;
    final /* synthetic */ k $onError;
    final /* synthetic */ n $onSuccess;
    final /* synthetic */ IdentityManager this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.identity.IdentityManager$logIn$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends o implements n {
        final /* synthetic */ String $newAppUserID;
        final /* synthetic */ String $oldAppUserID;
        final /* synthetic */ n $onSuccess;
        final /* synthetic */ IdentityManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IdentityManager identityManager, n nVar, String str, String str2) {
            super(2);
            this.this$0 = identityManager;
            this.$onSuccess = nVar;
            this.$newAppUserID = str;
            this.$oldAppUserID = str2;
        }

        @Override // wf.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
            return y.f36177a;
        }

        public final void invoke(CustomerInfo customerInfo, boolean z10) {
            DeviceCache deviceCache;
            OfferingsCache offeringsCache;
            SubscriberAttributesCache subscriberAttributesCache;
            DeviceCache deviceCache2;
            DeviceCache deviceCache3;
            OfflineEntitlementsManager offlineEntitlementsManager;
            AbstractC3557B.c0("customerInfo", customerInfo);
            IdentityManager identityManager = this.this$0;
            String str = this.$newAppUserID;
            String str2 = this.$oldAppUserID;
            synchronized (identityManager) {
                LogWrapperKt.log(LogIntent.USER, String.format(IdentityStrings.LOG_IN_SUCCESSFUL, Arrays.copyOf(new Object[]{str, Boolean.valueOf(z10)}, 2)));
                deviceCache = identityManager.deviceCache;
                deviceCache.clearCachesForAppUserID(str2);
                offeringsCache = identityManager.offeringsCache;
                offeringsCache.clearCache();
                subscriberAttributesCache = identityManager.subscriberAttributesCache;
                subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(str2);
                deviceCache2 = identityManager.deviceCache;
                deviceCache2.cacheAppUserID(str);
                deviceCache3 = identityManager.deviceCache;
                deviceCache3.cacheCustomerInfo(str, customerInfo);
                identityManager.copySubscriberAttributesToNewUserIfOldIsAnonymous(str2, str);
                offlineEntitlementsManager = identityManager.offlineEntitlementsManager;
                offlineEntitlementsManager.resetOfflineCustomerInfoCache();
            }
            this.$onSuccess.invoke(customerInfo, Boolean.valueOf(z10));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityManager$logIn$2(IdentityManager identityManager, String str, String str2, k kVar, n nVar) {
        super(0);
        this.this$0 = identityManager;
        this.$oldAppUserID = str;
        this.$newAppUserID = str2;
        this.$onError = kVar;
        this.$onSuccess = nVar;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        Backend backend;
        backend = this.this$0.backend;
        String str = this.$oldAppUserID;
        String str2 = this.$newAppUserID;
        backend.logIn(str, str2, new AnonymousClass1(this.this$0, this.$onSuccess, str2, str), this.$onError);
    }
}
