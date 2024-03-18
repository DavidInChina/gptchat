package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes.dex */
public final class o<S> extends u {
    public int b1;

    /* renamed from: c1  reason: collision with root package name */
    public c f27186c1;

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.b1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f27186c1);
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final void y(Bundle bundle) {
        super.y(bundle);
        if (bundle == null) {
            bundle = this.f18290k0;
        }
        this.b1 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC2469q0.n(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f27186c1 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // V1.AbstractComponentCallbacksC1480v
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m(), this.b1));
        throw null;
    }
}
