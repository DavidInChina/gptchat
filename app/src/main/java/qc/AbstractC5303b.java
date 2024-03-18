package qc;

import com.revenuecat.purchases.PurchasesErrorCode;

/* renamed from: qc.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5303b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f44041a;

    static {
        int[] iArr = new int[PurchasesErrorCode.values().length];
        try {
            iArr[PurchasesErrorCode.PurchaseCancelledError.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PurchasesErrorCode.ReceiptAlreadyInUseError.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PurchasesErrorCode.PaymentPendingError.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f44041a = iArr;
    }
}
