package com.revenuecat.purchases.google;

import K4.AbstractC0814b;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import id.AbstractC3557B;
import java.lang.reflect.Field;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE", "", "billingResponseToPurchasesError", "Lcom/revenuecat/purchases/PurchasesError;", "", "underlyingErrorMessage", "getBillingResponseCodeName", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class ErrorsKt {
    public static final String IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE = "Google Play In-app Billing API version is less than 3";

    public static final PurchasesError billingResponseToPurchasesError(int i10, String str) {
        PurchasesErrorCode purchasesErrorCode;
        AbstractC3557B.c0("underlyingErrorMessage", str);
        if (i10 != 12) {
            switch (i10) {
                case -3:
                case -1:
                case 2:
                case 6:
                    purchasesErrorCode = PurchasesErrorCode.StoreProblemError;
                    break;
                case -2:
                case 3:
                case 8:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseNotAllowedError;
                    break;
                case 0:
                    purchasesErrorCode = PurchasesErrorCode.UnknownError;
                    break;
                case 1:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseCancelledError;
                    break;
                case 4:
                    purchasesErrorCode = PurchasesErrorCode.ProductNotAvailableForPurchaseError;
                    break;
                case 5:
                    purchasesErrorCode = PurchasesErrorCode.PurchaseInvalidError;
                    break;
                case 7:
                    purchasesErrorCode = PurchasesErrorCode.ProductAlreadyPurchasedError;
                    break;
                default:
                    purchasesErrorCode = PurchasesErrorCode.UnknownError;
                    break;
            }
        } else {
            purchasesErrorCode = PurchasesErrorCode.NetworkError;
        }
        return new PurchasesError(purchasesErrorCode, str);
    }

    public static final String getBillingResponseCodeName(int i10) {
        String str;
        Field field;
        Field[] declaredFields = AbstractC0814b.class.getDeclaredFields();
        AbstractC3557B.b0("allPossibleBillingResponseCodes", declaredFields);
        int length = declaredFields.length;
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 < length) {
                field = declaredFields[i11];
                if (field.getInt(field) == i10) {
                    break;
                }
                i11++;
            } else {
                field = null;
                break;
            }
        }
        if (field != null) {
            str = field.getName();
        }
        if (str == null) {
            return String.valueOf(i10);
        }
        return str;
    }
}
