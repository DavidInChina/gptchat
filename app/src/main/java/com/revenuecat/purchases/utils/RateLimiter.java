package com.revenuecat.purchases.utils;

import Mg.b;
import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import kotlin.jvm.internal.g;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\u00020\n8\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/utils/RateLimiter;", "", "", "shouldProceed", "()Z", "", "maxCallsInPeriod", TokenNames.f24313I, "getMaxCallsInPeriod", "()I", "LMg/b;", "periodSeconds", "J", "getPeriodSeconds-UwyO8pc", "()J", "maxCallInclusive", "", "callTimestamps", "[J", "index", "<init>", "(IJLkotlin/jvm/internal/g;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RateLimiter {
    private final long[] callTimestamps;
    private int index;
    private final int maxCallInclusive;
    private final int maxCallsInPeriod;
    private final long periodSeconds;

    public /* synthetic */ RateLimiter(int i10, long j6, g gVar) {
        this(i10, j6);
    }

    public final int getMaxCallsInPeriod() {
        return this.maxCallsInPeriod;
    }

    /* renamed from: getPeriodSeconds-UwyO8pc  reason: not valid java name */
    public final long m68getPeriodSecondsUwyO8pc() {
        return this.periodSeconds;
    }

    public final synchronized boolean shouldProceed() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = (this.index + 1) % this.maxCallInclusive;
        long j6 = this.callTimestamps[i10];
        if (j6 != 0 && currentTimeMillis - j6 <= b.e(this.periodSeconds)) {
            return false;
        }
        this.callTimestamps[this.index] = currentTimeMillis;
        this.index = i10;
        return true;
    }

    private RateLimiter(int i10, long j6) {
        this.maxCallsInPeriod = i10;
        this.periodSeconds = j6;
        int i11 = i10 + 1;
        this.maxCallInclusive = i11;
        this.callTimestamps = new long[i11];
    }
}
