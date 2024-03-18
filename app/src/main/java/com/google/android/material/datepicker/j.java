package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import w3.K;
import w3.O;

/* loaded from: classes.dex */
public final class j extends O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f27144a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f27145b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f27146c;

    public j(k kVar, t tVar, MaterialButton materialButton) {
        this.f27146c = kVar;
        this.f27144a = tVar;
        this.f27145b = materialButton;
    }

    @Override // w3.O
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f27145b.getText());
        }
    }

    @Override // w3.O
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        String str;
        k kVar = this.f27146c;
        if (i10 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar.f27152h1.getLayoutManager();
            View K02 = linearLayoutManager.K0(0, linearLayoutManager.v(), false);
            if (K02 == null) {
                i12 = -1;
            } else {
                i12 = K.F(K02);
            }
        } else {
            i12 = ((LinearLayoutManager) kVar.f27152h1.getLayoutManager()).I0();
        }
        t tVar = this.f27144a;
        Calendar b10 = w.b(tVar.f27203c.f27124Y.f27187Y);
        b10.add(2, i12);
        kVar.f27149d1 = new p(b10);
        Calendar b11 = w.b(tVar.f27203c.f27124Y.f27187Y);
        b11.add(2, i12);
        b11.set(5, 1);
        Calendar b12 = w.b(b11);
        b12.get(2);
        b12.get(1);
        b12.getMaximum(7);
        b12.getActualMaximum(5);
        b12.getTimeInMillis();
        long timeInMillis = b12.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            str = w.a("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
        } else {
            str = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f27145b.setText(str);
    }
}
