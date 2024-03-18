package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import w3.AbstractC6093I;

/* loaded from: classes.dex */
public final class i extends AbstractC6093I {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f27143a;

    public i(k kVar) {
        this.f27143a = kVar;
        w.d(null);
        w.d(null);
    }

    @Override // w3.AbstractC6093I
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            y yVar = (y) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            int i10 = k.f27147m1;
            this.f27143a.getClass();
            throw null;
        }
    }
}
