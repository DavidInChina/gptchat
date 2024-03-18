package com.google.android.material.datepicker;

import D1.Z;
import E2.C0479k;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.material.button.MaterialButton;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import m.View$OnClickListenerC4522b;
import w3.C6085A;
import w3.b0;

/* loaded from: classes.dex */
public final class k<S> extends u {

    /* renamed from: m1  reason: collision with root package name */
    public static final /* synthetic */ int f27147m1 = 0;
    public int b1;

    /* renamed from: c1  reason: collision with root package name */
    public c f27148c1;

    /* renamed from: d1  reason: collision with root package name */
    public p f27149d1;

    /* renamed from: e1  reason: collision with root package name */
    public int f27150e1;

    /* renamed from: f1  reason: collision with root package name */
    public C0479k f27151f1;
    public RecyclerView g1;

    /* renamed from: h1  reason: collision with root package name */
    public RecyclerView f27152h1;

    /* renamed from: i1  reason: collision with root package name */
    public View f27153i1;

    /* renamed from: j1  reason: collision with root package name */
    public View f27154j1;

    /* renamed from: k1  reason: collision with root package name */
    public View f27155k1;

    /* renamed from: l1  reason: collision with root package name */
    public View f27156l1;

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.b1);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f27148c1);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f27149d1);
    }

    public final void O(p pVar) {
        boolean z10;
        t tVar = (t) this.f27152h1.getAdapter();
        int g10 = tVar.f27203c.f27124Y.g(pVar);
        int g11 = g10 - tVar.f27203c.f27124Y.g(this.f27149d1);
        boolean z11 = false;
        if (Math.abs(g11) > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g11 > 0) {
            z11 = true;
        }
        this.f27149d1 = pVar;
        if (z10 && z11) {
            this.f27152h1.a0(g10 - 3);
            this.f27152h1.post(new T3.e(this, g10, 2));
        } else if (z10) {
            this.f27152h1.a0(g10 + 3);
            this.f27152h1.post(new T3.e(this, g10, 2));
        } else {
            this.f27152h1.post(new T3.e(this, g10, 2));
        }
    }

    public final void P(int i10) {
        this.f27150e1 = i10;
        if (i10 == 2) {
            this.g1.getLayoutManager().l0(this.f27149d1.f27189h0 - ((y) this.g1.getAdapter()).f27209c.f27148c1.f27124Y.f27189h0);
            this.f27155k1.setVisibility(0);
            this.f27156l1.setVisibility(8);
            this.f27153i1.setVisibility(8);
            this.f27154j1.setVisibility(8);
        } else if (i10 == 1) {
            this.f27155k1.setVisibility(8);
            this.f27156l1.setVisibility(0);
            this.f27153i1.setVisibility(0);
            this.f27154j1.setVisibility(0);
            O(this.f27149d1);
        }
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void y(Bundle bundle) {
        super.y(bundle);
        if (bundle == null) {
            bundle = this.f18290k0;
        }
        this.b1 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC2469q0.n(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f27148c1 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC2469q0.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f27149d1 = (p) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i10;
        int i11;
        e eVar;
        C6085A c6085a;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m(), this.b1);
        this.f27151f1 = new C0479k(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        p pVar = this.f27148c1.f27124Y;
        if (n.S(contextThemeWrapper, 16843277)) {
            i11 = R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i11 = R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        Resources resources = K().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = q.f27194i0;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        Z.l(gridView, new g(0, this));
        int i13 = this.f27148c1.f27128j0;
        if (i13 > 0) {
            eVar = new e(i13);
        } else {
            eVar = new e();
        }
        gridView.setAdapter((ListAdapter) eVar);
        gridView.setNumColumns(pVar.f27190i0);
        gridView.setEnabled(false);
        this.f27152h1 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        m();
        this.f27152h1.setLayoutManager(new h(this, i10, i10));
        this.f27152h1.setTag("MONTHS_VIEW_GROUP_TAG");
        t tVar = new t(contextThemeWrapper, this.f27148c1, new S4.o(5, this));
        this.f27152h1.setAdapter(tVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.g1 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.g1.setLayoutManager(new GridLayoutManager(integer));
            this.g1.setAdapter(new y(this));
            this.g1.g(new i(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            Z.l(materialButton, new g(2, this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f27153i1 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.f27154j1 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f27155k1 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f27156l1 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            P(1);
            materialButton.setText(this.f27149d1.f());
            this.f27152h1.h(new j(this, tVar, materialButton));
            materialButton.setOnClickListener(new View$OnClickListenerC4522b(2, this));
            this.f27154j1.setOnClickListener(new f(this, tVar, 1));
            this.f27153i1.setOnClickListener(new f(this, tVar, 0));
        }
        if (!n.S(contextThemeWrapper, 16843277) && (recyclerView2 = (c6085a = new C6085A()).f47734a) != (recyclerView = this.f27152h1)) {
            b0 b0Var = c6085a.f47735b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f25456i1;
                if (arrayList != null) {
                    arrayList.remove(b0Var);
                }
                c6085a.f47734a.setOnFlingListener(null);
            }
            c6085a.f47734a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    c6085a.f47734a.h(b0Var);
                    c6085a.f47734a.setOnFlingListener(c6085a);
                    new Scroller(c6085a.f47734a.getContext(), new DecelerateInterpolator());
                    c6085a.f();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        this.f27152h1.a0(tVar.f27203c.f27124Y.g(this.f27149d1));
        Z.l(this.f27152h1, new g(1, this));
        return inflate;
    }
}
