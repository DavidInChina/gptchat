package com.google.android.material.datepicker;

import D1.C0343c;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.openai.chatgpt.R;

/* loaded from: classes.dex */
public final class g extends C0343c {

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f27139i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f27140j0;

    public /* synthetic */ g(int i10, Object obj) {
        this.f27139i0 = i10;
        this.f27140j0 = obj;
    }

    @Override // D1.C0343c
    public final void e(View view, E1.p pVar) {
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.f3255Y;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f4118a;
        switch (this.f27139i0) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                pVar.j(null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                pVar.m(false);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                k kVar = (k) this.f27140j0;
                if (kVar.f27156l1.getVisibility() == 0) {
                    str = kVar.p().getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    str = kVar.p().getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                pVar.l(str);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                pVar.j(null);
                return;
        }
    }
}
