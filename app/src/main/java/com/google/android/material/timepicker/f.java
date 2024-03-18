package com.google.android.material.timepicker;

import D1.H;
import D1.I;
import D1.Z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class f extends ConstraintLayout {

    /* renamed from: w0  reason: collision with root package name */
    public final e f27367w0 = new Runnable() { // from class: com.google.android.material.timepicker.e
        @Override // java.lang.Runnable
        public final void run() {
            f.this.f();
        }
    };

    /* renamed from: x0  reason: collision with root package name */
    public int f27368x0;

    /* renamed from: y0  reason: collision with root package name */
    public final f8.g f27369y0;

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.e] */
    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        f8.g gVar = new f8.g();
        this.f27369y0 = gVar;
        f8.h hVar = new f8.h(0.5f);
        d7.h e10 = gVar.f29688Y.f29665a.e();
        e10.f28076e = hVar;
        e10.f28077f = hVar;
        e10.f28078g = hVar;
        e10.f28079h = hVar;
        gVar.setShapeAppearanceModel(e10.a());
        this.f27369y0.k(ColorStateList.valueOf(-1));
        f8.g gVar2 = this.f27369y0;
        WeakHashMap weakHashMap = Z.f3247a;
        H.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O7.a.f13421t, R.attr.materialClockStyle, 0);
        this.f27368x0 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = Z.f3247a;
            view.setId(I.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f27367w0;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    public abstract void f();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            e eVar = this.f27367w0;
            handler.removeCallbacks(eVar);
            handler.post(eVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f27369y0.k(ColorStateList.valueOf(i10));
    }
}
