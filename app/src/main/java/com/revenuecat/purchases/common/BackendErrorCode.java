package com.revenuecat.purchases.common;

import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0082\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b\u00a8\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/common/BackendErrorCode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "BackendInvalidPlatform", "BackendStoreProblem", "BackendCannotTransferPurchase", "BackendInvalidReceiptToken", "BackendInvalidAppStoreSharedSecret", "BackendInvalidPaymentModeOrIntroPriceNotProvided", "BackendProductIdForGoogleReceiptNotProvided", "BackendInvalidPlayStoreCredentials", "BackendInternalServerError", "BackendEmptyAppUserId", "BackendInvalidAuthToken", "BackendInvalidAPIKey", "BackendBadRequest", "BackendPlayStoreQuotaExceeded", "BackendPlayStoreInvalidPackageName", "BackendPlayStoreGenericError", "BackendUserIneligibleForPromoOffer", "BackendInvalidAppleSubscriptionKey", "BackendInvalidSubscriberAttributes", "BackendInvalidSubscriberAttributesBody", "BackendProductIDsMalformed", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
enum BackendErrorCode {
    BackendInvalidPlatform(7000),
    BackendStoreProblem(7101),
    BackendCannotTransferPurchase(7102),
    BackendInvalidReceiptToken(7103),
    BackendInvalidAppStoreSharedSecret(7104),
    BackendInvalidPaymentModeOrIntroPriceNotProvided(7105),
    BackendProductIdForGoogleReceiptNotProvided(7106),
    BackendInvalidPlayStoreCredentials(7107),
    BackendInternalServerError(7110),
    BackendEmptyAppUserId(7220),
    BackendInvalidAuthToken(7224),
    BackendInvalidAPIKey(7225),
    BackendBadRequest(7226),
    BackendPlayStoreQuotaExceeded(7229),
    BackendPlayStoreInvalidPackageName(7230),
    BackendPlayStoreGenericError(7231),
    BackendUserIneligibleForPromoOffer(7232),
    BackendInvalidAppleSubscriptionKey(7234),
    BackendInvalidSubscriberAttributes(7263),
    BackendInvalidSubscriberAttributesBody(7264),
    BackendProductIDsMalformed(7662);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/BackendErrorCode$Companion;", "", "()V", "valueOf", "Lcom/revenuecat/purchases/common/BackendErrorCode;", "backendErrorCode", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final BackendErrorCode valueOf(int i10) {
            BackendErrorCode[] values;
            for (BackendErrorCode backendErrorCode : BackendErrorCode.values()) {
                if (backendErrorCode.getValue() == i10) {
                    return backendErrorCode;
                }
            }
            return null;
        }
    }

    BackendErrorCode(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
