package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.openai.chatgpt.R;
import java.util.Calendar;
import w3.AbstractC6088D;
import w3.L;
import w3.Y;

/* loaded from: classes.dex */
public final class t extends AbstractC6088D {

    /* renamed from: c  reason: collision with root package name */
    public final c f27203c;

    /* renamed from: d  reason: collision with root package name */
    public final S4.o f27204d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27205e;

    public t(ContextThemeWrapper contextThemeWrapper, c cVar, S4.o oVar) {
        int i10;
        p pVar = cVar.f27124Y;
        p pVar2 = cVar.f27127i0;
        if (pVar.f27187Y.compareTo(pVar2.f27187Y) <= 0) {
            if (pVar2.f27187Y.compareTo(cVar.f27125Z.f27187Y) <= 0) {
                int i11 = q.f27194i0;
                int i12 = k.f27147m1;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11;
                if (n.S(contextThemeWrapper, 16843277)) {
                    i10 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i10 = 0;
                }
                this.f27205e = dimensionPixelSize + i10;
                this.f27203c = cVar;
                this.f27204d = oVar;
                if (!this.f47740a.a()) {
                    this.f47741b = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // w3.AbstractC6088D
    public final int a() {
        return this.f27203c.f27130l0;
    }

    @Override // w3.AbstractC6088D
    public final long b(int i10) {
        Calendar b10 = w.b(this.f27203c.f27124Y.f27187Y);
        b10.add(2, i10);
        return new p(b10).f27187Y.getTimeInMillis();
    }

    @Override // w3.AbstractC6088D
    public final void c(Y y10, int i10) {
        s sVar = (s) y10;
        c cVar = this.f27203c;
        Calendar b10 = w.b(cVar.f27124Y.f27187Y);
        b10.add(2, i10);
        p pVar = new p(b10);
        sVar.f27201t.setText(pVar.f());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) sVar.f27202u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && pVar.equals(materialCalendarGridView.a().f27196Y)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new q(pVar, cVar);
        throw null;
    }

    @Override // w3.AbstractC6088D
    public final Y d(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (n.S(recyclerView.getContext(), 16843277)) {
            linearLayout.setLayoutParams(new L(-1, this.f27205e));
            return new s(linearLayout, true);
        }
        return new s(linearLayout, false);
    }
}
