package com.revenuecat.purchases.google.usecase;

import K4.C0822j;
import K4.r;
import K4.s;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements r, s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BillingClientUseCase f27737a;

    public /* synthetic */ a(BillingClientUseCase billingClientUseCase) {
        this.f27737a = billingClientUseCase;
    }

    @Override // K4.r
    public final void a(C0822j c0822j, List list) {
        QueryProductDetailsUseCase$executeAsync$1.a((QueryProductDetailsUseCase) this.f27737a, c0822j, list);
    }

    @Override // K4.s
    public final void b(C0822j c0822j, List list) {
        QueryPurchasesByTypeUseCase$executeAsync$1.a((QueryPurchasesByTypeUseCase) this.f27737a, c0822j, list);
    }

    public final void c(C0822j c0822j) {
        AcknowledgePurchaseUseCase$executeAsync$1.a((AcknowledgePurchaseUseCase) this.f27737a, c0822j);
    }

    public final void d(C0822j c0822j, String str) {
        ConsumePurchaseUseCase$executeAsync$1.a((ConsumePurchaseUseCase) this.f27737a, c0822j, str);
    }
}
