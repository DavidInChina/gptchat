package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: i0  reason: collision with root package name */
    public static final int f27132i0;

    /* renamed from: Y  reason: collision with root package name */
    public final Calendar f27133Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f27134Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f27135h0;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        f27132i0 = i10;
    }

    public e() {
        Calendar d10 = w.d(null);
        this.f27133Y = d10;
        this.f27134Z = d10.getMaximum(7);
        this.f27135h0 = d10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f27134Z;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f27134Z;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f27135h0;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f27135h0;
        int i12 = this.f27134Z;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f27133Y;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f27132i0, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i10) {
        Calendar d10 = w.d(null);
        this.f27133Y = d10;
        this.f27134Z = d10.getMaximum(7);
        this.f27135h0 = i10;
    }
}
