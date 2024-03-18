package androidx.appcompat.view.menu;

import U3.u;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p.E;
import p.n;
import p.o;
import p.q;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements n, E, AdapterView.OnItemClickListener {

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f24429i0 = {16842964, 16843049};

    /* renamed from: h0  reason: collision with root package name */
    public o f24430h0;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        u I10 = u.I(context, attributeSet, f24429i0, 16842868, 0);
        if (I10.E(0)) {
            setBackgroundDrawable(I10.t(0));
        }
        if (I10.E(1)) {
            setDivider(I10.t(1));
        }
        I10.N();
    }

    @Override // p.n
    public final boolean a(q qVar) {
        return this.f24430h0.q(qVar, null, 0);
    }

    @Override // p.E
    public final void d(o oVar) {
        this.f24430h0 = oVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j6) {
        a((q) getAdapter().getItem(i10));
    }
}
