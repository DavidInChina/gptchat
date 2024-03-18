package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class a extends a8.j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f27363Y;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f27363Y = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f27363Y;
        if (isEmpty) {
            chipTextInputComboView.f27331h0.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a5 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f27331h0;
        if (TextUtils.isEmpty(a5)) {
            a5 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a5);
    }
}
