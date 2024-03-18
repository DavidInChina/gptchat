package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f27199Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ t f27200Z;

    public r(t tVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f27200Z = tVar;
        this.f27199Y = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j6) {
        MaterialCalendarGridView materialCalendarGridView = this.f27199Y;
        q a5 = materialCalendarGridView.a();
        if (i10 >= a5.a() && i10 <= a5.c()) {
            S4.o oVar = this.f27200Z.f27204d;
            long longValue = materialCalendarGridView.a().getItem(i10).longValue();
            Object obj = oVar.f16184Z;
            if (longValue >= ((d) ((k) obj).f27148c1.f27126h0).f27131Y) {
                ((k) obj).getClass();
                throw null;
            }
        }
    }
}
