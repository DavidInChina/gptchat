package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import w3.K;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27136Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ t f27137Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k f27138h0;

    public /* synthetic */ f(k kVar, t tVar, int i10) {
        this.f27136Y = i10;
        this.f27138h0 = kVar;
        this.f27137Z = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.f27136Y;
        t tVar = this.f27137Z;
        k kVar = this.f27138h0;
        switch (i11) {
            case 0:
                int I02 = ((LinearLayoutManager) kVar.f27152h1.getLayoutManager()).I0() - 1;
                if (I02 >= 0) {
                    Calendar b10 = w.b(tVar.f27203c.f27124Y.f27187Y);
                    b10.add(2, I02);
                    kVar.O(new p(b10));
                    return;
                }
                return;
            default:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar.f27152h1.getLayoutManager();
                View K02 = linearLayoutManager.K0(0, linearLayoutManager.v(), false);
                if (K02 == null) {
                    i10 = -1;
                } else {
                    i10 = K.F(K02);
                }
                int i12 = i10 + 1;
                if (i12 < kVar.f27152h1.getAdapter().a()) {
                    Calendar b11 = w.b(tVar.f27203c.f27124Y.f27187Y);
                    b11.add(2, i12);
                    kVar.O(new p(b11));
                    return;
                }
                return;
        }
    }
}
