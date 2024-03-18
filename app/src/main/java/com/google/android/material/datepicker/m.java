package com.google.android.material.datepicker;

import D1.AbstractC0374u;
import D1.J0;
import android.view.View;

/* loaded from: classes.dex */
public final class m implements AbstractC0374u {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27159Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ View f27160Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f27161h0;

    public m(int i10, View view, int i11) {
        this.f27159Y = i10;
        this.f27160Z = view;
        this.f27161h0 = i11;
    }

    @Override // D1.AbstractC0374u
    public final J0 e(View view, J0 j02) {
        int i10 = j02.f3232a.f(7).f45107b;
        int i11 = this.f27159Y;
        View view2 = this.f27160Z;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f27161h0 + i10, view2.getPaddingRight(), view2.getPaddingBottom());
        return j02;
    }
}
