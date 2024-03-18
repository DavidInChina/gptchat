package com.revenuecat.purchases.google;

import K4.C0822j;
import id.AbstractC3557B;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"LK4/j;", "", "toHumanReadableDescription", "(LK4/j;)Ljava/lang/String;", "", "isSuccessful", "(LK4/j;)Z", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(C0822j c0822j) {
        AbstractC3557B.c0("<this>", c0822j);
        if (c0822j.f9439a == 0) {
            return true;
        }
        return false;
    }

    public static final String toHumanReadableDescription(C0822j c0822j) {
        AbstractC3557B.c0("<this>", c0822j);
        return "DebugMessage: " + c0822j.f9440b + ". ErrorCode: " + ErrorsKt.getBillingResponseCodeName(c0822j.f9439a) + '.';
    }
}
