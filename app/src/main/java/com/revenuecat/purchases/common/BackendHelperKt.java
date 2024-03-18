package com.revenuecat.purchases.common;

import com.revenuecat.purchases.common.networking.HTTPResult;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"}, d2 = {"isSuccessful", "", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class BackendHelperKt {
    public static final boolean isSuccessful(HTTPResult hTTPResult) {
        AbstractC3557B.c0("<this>", hTTPResult);
        if (hTTPResult.getResponseCode() < 300) {
            return true;
        }
        return false;
    }
}
