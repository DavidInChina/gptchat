package com.revenuecat.purchases.google.usecase;

import K4.C0822j;
import K4.r;
import K4.s;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements r, s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f27740a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f27741b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Date f27742c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BillingClientUseCase f27743d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f27744e;

    public /* synthetic */ c(AtomicBoolean atomicBoolean, BillingClientUseCase billingClientUseCase, String str, Date date, Object obj) {
        this.f27740a = atomicBoolean;
        this.f27743d = billingClientUseCase;
        this.f27741b = str;
        this.f27742c = date;
        this.f27744e = obj;
    }

    @Override // K4.r
    public final void a(C0822j c0822j, List list) {
        QueryProductDetailsUseCase.a(this.f27740a, (QueryProductDetailsUseCase) this.f27743d, this.f27741b, this.f27742c, (r) this.f27744e, c0822j, list);
    }

    @Override // K4.s
    public final void b(C0822j c0822j, List list) {
        QueryPurchasesByTypeUseCase.a(this.f27740a, (QueryPurchasesByTypeUseCase) this.f27743d, this.f27741b, this.f27742c, (s) this.f27744e, c0822j, list);
    }
}
