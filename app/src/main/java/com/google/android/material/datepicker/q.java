package com.google.android.material.datepicker;

import E2.C0479k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class q extends BaseAdapter {

    /* renamed from: i0  reason: collision with root package name */
    public static final int f27194i0 = w.d(null).getMaximum(4);

    /* renamed from: j0  reason: collision with root package name */
    public static final int f27195j0 = (w.d(null).getMaximum(7) + w.d(null).getMaximum(5)) - 1;

    /* renamed from: Y  reason: collision with root package name */
    public final p f27196Y;

    /* renamed from: Z  reason: collision with root package name */
    public C0479k f27197Z;

    /* renamed from: h0  reason: collision with root package name */
    public final c f27198h0;

    public q(p pVar, c cVar) {
        this.f27196Y = pVar;
        this.f27198h0 = cVar;
        throw null;
    }

    public final int a() {
        int i10 = this.f27198h0.f27128j0;
        p pVar = this.f27196Y;
        Calendar calendar = pVar.f27187Y;
        int i11 = calendar.get(7);
        if (i10 <= 0) {
            i10 = calendar.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            return i12 + pVar.f27190i0;
        }
        return i12;
    }

    /* renamed from: b */
    public final Long getItem(int i10) {
        if (i10 >= a() && i10 <= c()) {
            Calendar b10 = w.b(this.f27196Y.f27187Y);
            b10.set(5, (i10 - a()) + 1);
            return Long.valueOf(b10.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.f27196Y.f27191j0) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f27195j0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f27196Y.f27190i0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f27197Z == null) {
            this.f27197Z = new C0479k(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a5 = i10 - a();
        if (a5 >= 0) {
            p pVar = this.f27196Y;
            if (a5 < pVar.f27191j0) {
                textView.setTag(pVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a5 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i10) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                w.c().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i10) == null) {
            textView.getContext();
            w.c().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
