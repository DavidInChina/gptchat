package com.revenuecat.purchases;

import com.revenuecat.purchases.PurchasesFactory;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27709Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f27710Z;

    public /* synthetic */ a(int i10, Object obj) {
        this.f27709Y = i10;
        this.f27710Z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f27709Y;
        Object obj = this.f27710Z;
        switch (i10) {
            case 0:
                CustomerInfoHelper.a((AbstractC6216a) obj);
                return;
            case 1:
                CustomerInfoUpdateHandler.a((AbstractC6216a) obj);
                return;
            case 2:
                PurchasesOrchestrator.a((AbstractC6216a) obj);
                return;
            default:
                PurchasesFactory.LowPriorityThreadFactory.a((Runnable) obj);
                return;
        }
    }
}
