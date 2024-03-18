package com.revenuecat.purchases.google.usecase;

import K4.C0822j;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f27745a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ QueryPurchaseHistoryUseCase f27746b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Date f27747c;

    public /* synthetic */ d(AtomicBoolean atomicBoolean, QueryPurchaseHistoryUseCase queryPurchaseHistoryUseCase, Date date) {
        this.f27745a = atomicBoolean;
        this.f27746b = queryPurchaseHistoryUseCase;
        this.f27747c = date;
    }

    public final void a(C0822j c0822j, List list) {
        QueryPurchaseHistoryUseCase$executeAsync$1.a(this.f27745a, this.f27746b, this.f27747c, c0822j, list);
    }
}
