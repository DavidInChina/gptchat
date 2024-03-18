package com.revenuecat.purchases.common;

import Df.H;
import Mg.d;
import kotlin.Metadata;

/* JADX WARN: Init of enum DEFAULT can be incorrect */
/* JADX WARN: Init of enum LONG can be incorrect */
/* JADX WARN: Init of enum NONE can be incorrect */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001c\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/Delay;", "", "LMg/b;", "minDelay", "J", "getMinDelay-UwyO8pc", "()J", "maxDelay", "getMaxDelay-UwyO8pc", "<init>", "(Ljava/lang/String;IJJ)V", "NONE", "DEFAULT", "LONG", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public enum Delay {
    NONE(H.x0(0, r8), H.x0(0, r8)),
    DEFAULT(r13, r1.m58getJitterDelayUwyO8pc()),
    LONG(r1.m58getJitterDelayUwyO8pc(), r1.m59getJitterLongDelayUwyO8pc());
    
    private final long maxDelay;
    private final long minDelay;

    static {
        Mg.a aVar = Mg.b.f12127Z;
        H.x0(0, d.f12133h0);
        DispatcherConstants dispatcherConstants = DispatcherConstants.INSTANCE;
    }

    Delay(long j6, long j10) {
        this.minDelay = j6;
        this.maxDelay = j10;
    }

    /* renamed from: getMaxDelay-UwyO8pc  reason: not valid java name */
    public final long m56getMaxDelayUwyO8pc() {
        return this.maxDelay;
    }

    /* renamed from: getMinDelay-UwyO8pc  reason: not valid java name */
    public final long m57getMinDelayUwyO8pc() {
        return this.minDelay;
    }
}
