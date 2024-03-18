package com.revenuecat.purchases.amazon.handler;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.RequestId;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27714Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ RequestId f27715Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ PurchasingListener f27716h0;

    public /* synthetic */ a(PurchasingListener purchasingListener, RequestId requestId, int i10) {
        this.f27714Y = i10;
        this.f27716h0 = purchasingListener;
        this.f27715Z = requestId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f27714Y;
        RequestId requestId = this.f27715Z;
        PurchasingListener purchasingListener = this.f27716h0;
        switch (i10) {
            case 0:
                ProductDataHandler.a((ProductDataHandler) purchasingListener, requestId);
                return;
            default:
                UserDataHandler.a((UserDataHandler) purchasingListener, requestId);
                return;
        }
    }
}
