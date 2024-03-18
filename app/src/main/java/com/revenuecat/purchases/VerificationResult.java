package com.revenuecat.purchases;

import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/VerificationResult;", "", "(Ljava/lang/String;I)V", "isVerified", "", "()Z", "NOT_REQUESTED", "VERIFIED", "FAILED", "VERIFIED_ON_DEVICE", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public enum VerificationResult {
    NOT_REQUESTED,
    VERIFIED,
    FAILED,
    VERIFIED_ON_DEVICE;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationResult.values().length];
            try {
                iArr[VerificationResult.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationResult.VERIFIED_ON_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationResult.NOT_REQUESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationResult.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean isVerified() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 != 3 && i10 != 4) {
            throw new RuntimeException();
        }
        return false;
    }
}