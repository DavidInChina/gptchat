package com.google.android.material.datepicker;

import D1.D;
import D1.Z;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import w3.Y;

/* loaded from: classes.dex */
public final class s extends Y {

    /* renamed from: t  reason: collision with root package name */
    public final TextView f27201t;

    /* renamed from: u  reason: collision with root package name */
    public final MaterialCalendarGridView f27202u;

    public s(LinearLayout linearLayout, boolean z10) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f27201t = textView;
        WeakHashMap weakHashMap = Z.f3247a;
        new D(R.id.tag_accessibility_heading, 3).g(textView, Boolean.TRUE);
        this.f27202u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z10) {
            textView.setVisibility(8);
        }
    }
}
