package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import w3.C6118z;
import w3.V;

/* loaded from: classes.dex */
public final class h extends LinearLayoutManager {

    /* renamed from: E  reason: collision with root package name */
    public final /* synthetic */ int f27141E;

    /* renamed from: F  reason: collision with root package name */
    public final /* synthetic */ k f27142F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, int i10, int i11) {
        super(i10);
        this.f27142F = kVar;
        this.f27141E = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, w3.K
    public final void v0(RecyclerView recyclerView, int i10) {
        C6118z c6118z = new C6118z(this, recyclerView.getContext(), 2);
        c6118z.f47992a = i10;
        w0(c6118z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void y0(V v10, int[] iArr) {
        int i10 = this.f27141E;
        k kVar = this.f27142F;
        if (i10 == 0) {
            iArr[0] = kVar.f27152h1.getWidth();
            iArr[1] = kVar.f27152h1.getWidth();
            return;
        }
        iArr[0] = kVar.f27152h1.getHeight();
        iArr[1] = kVar.f27152h1.getHeight();
    }
}
