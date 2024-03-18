package com.google.android.material.datepicker;

import E2.C0479k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.openai.chatgpt.R;
import java.util.Locale;
import w3.AbstractC6088D;
import w3.Y;

/* loaded from: classes.dex */
public final class y extends AbstractC6088D {

    /* renamed from: c  reason: collision with root package name */
    public final k f27209c;

    public y(k kVar) {
        this.f27209c = kVar;
    }

    @Override // w3.AbstractC6088D
    public final int a() {
        return this.f27209c.f27148c1.f27129k0;
    }

    @Override // w3.AbstractC6088D
    public final void c(Y y10, int i10) {
        String str;
        k kVar = this.f27209c;
        int i11 = kVar.f27148c1.f27124Y.f27189h0 + i10;
        String format = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
        TextView textView = ((x) y10).f27208t;
        textView.setText(format);
        Context context = textView.getContext();
        if (w.c().get(1) == i11) {
            str = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11));
        } else {
            str = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11));
        }
        textView.setContentDescription(str);
        C0479k c0479k = kVar.f27151f1;
        if (w.c().get(1) == i11) {
            Object obj = c0479k.f4372f;
        } else {
            Object obj2 = c0479k.f4370d;
        }
        throw null;
    }

    @Override // w3.AbstractC6088D
    public final Y d(RecyclerView recyclerView) {
        return new x((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
