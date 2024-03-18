package com.revenuecat.purchases.google.usecase;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00038\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\b\u0006\u0010\u0005*L\b\u0000\u0010\u000b\"\"\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\n0\u00072\"\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\n0\u0007\u00a8\u0006\f"}, d2 = {"", "MAX_RETRIES_DEFAULT", TokenNames.f24313I, "", "RETRY_TIMER_START_MILLISECONDS", "J", "RETRY_TIMER_MAX_TIME_MILLISECONDS", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Ljf/y;", "ExecuteRequestOnUIThreadFunction", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BillingClientUseCaseKt {
    private static final int MAX_RETRIES_DEFAULT = 3;
    public static final long RETRY_TIMER_MAX_TIME_MILLISECONDS = 900000;
    private static final long RETRY_TIMER_START_MILLISECONDS = 878;
}
