package com.revenuecat.purchases.common;

import Lg.n;
import com.revenuecat.purchases.PackageType;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0003"}, d2 = {"toPackageType", "Lcom/revenuecat/purchases/PackageType;", "", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class OfferingParserKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageType toPackageType(String str) {
        PackageType packageType;
        PackageType[] values = PackageType.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                packageType = values[i10];
                if (AbstractC3557B.K(packageType.getIdentifier(), str)) {
                    break;
                }
                i10++;
            } else {
                packageType = null;
                break;
            }
        }
        if (packageType == null) {
            if (n.I2(str, "$rc_", false)) {
                return PackageType.UNKNOWN;
            }
            return PackageType.CUSTOM;
        }
        return packageType;
    }
}
