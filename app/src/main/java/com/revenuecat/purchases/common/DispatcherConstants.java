package com.revenuecat.purchases.common;

import Df.H;
import Mg.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/DispatcherConstants;", "", "LMg/b;", "jitterDelay", "J", "getJitterDelay-UwyO8pc", "()J", "jitterLongDelay", "getJitterLongDelay-UwyO8pc", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DispatcherConstants {
    public static final DispatcherConstants INSTANCE = new DispatcherConstants();
    private static final long jitterDelay;
    private static final long jitterLongDelay;

    static {
        Mg.a aVar = Mg.b.f12127Z;
        d dVar = d.f12133h0;
        jitterDelay = H.y0(5000L, dVar);
        jitterLongDelay = H.y0(10000L, dVar);
    }

    private DispatcherConstants() {
    }

    /* renamed from: getJitterDelay-UwyO8pc  reason: not valid java name */
    public final long m58getJitterDelayUwyO8pc() {
        return jitterDelay;
    }

    /* renamed from: getJitterLongDelay-UwyO8pc  reason: not valid java name */
    public final long m59getJitterLongDelayUwyO8pc() {
        return jitterLongDelay;
    }
}
