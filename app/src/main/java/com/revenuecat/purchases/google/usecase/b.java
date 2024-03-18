package com.revenuecat.purchases.google.usecase;

import K4.C0818f;
import K4.C0822j;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f27738a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ GetBillingConfigUseCase f27739b;

    public /* synthetic */ b(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase) {
        this.f27738a = atomicBoolean;
        this.f27739b = getBillingConfigUseCase;
    }

    public final void a(C0822j c0822j, C0818f c0818f) {
        GetBillingConfigUseCase$executeAsync$1.a(this.f27738a, this.f27739b, c0822j, c0818f);
    }
}
