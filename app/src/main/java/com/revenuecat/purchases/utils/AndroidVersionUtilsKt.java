package com.revenuecat.purchases.utils;

import android.os.Build;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u00a8\u0006\u0002"}, d2 = {"isAndroidNOrNewer", "", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class AndroidVersionUtilsKt {
    public static final boolean isAndroidNOrNewer() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }
}
