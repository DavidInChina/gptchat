package com.revenuecat.purchases.google;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27734Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ BillingWrapper f27735Z;

    public /* synthetic */ b(BillingWrapper billingWrapper, int i10) {
        this.f27734Y = i10;
        this.f27735Z = billingWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f27734Y;
        BillingWrapper billingWrapper = this.f27735Z;
        switch (i10) {
            case 0:
                BillingWrapper.b(billingWrapper);
                return;
            default:
                BillingWrapper.a(billingWrapper);
                return;
        }
    }
}
