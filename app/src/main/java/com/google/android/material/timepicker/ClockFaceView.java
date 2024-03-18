package com.google.android.material.timepicker;

import D1.Z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k1.n;
import p1.AbstractC5042g;

/* loaded from: classes.dex */
class ClockFaceView extends f implements d {

    /* renamed from: D0  reason: collision with root package name */
    public final SparseArray f27336D0;

    /* renamed from: E0  reason: collision with root package name */
    public final c f27337E0;

    /* renamed from: F0  reason: collision with root package name */
    public final int[] f27338F0;

    /* renamed from: H0  reason: collision with root package name */
    public final int f27340H0;

    /* renamed from: I0  reason: collision with root package name */
    public final int f27341I0;

    /* renamed from: J0  reason: collision with root package name */
    public final int f27342J0;

    /* renamed from: K0  reason: collision with root package name */
    public final int f27343K0;

    /* renamed from: L0  reason: collision with root package name */
    public final String[] f27344L0;

    /* renamed from: M0  reason: collision with root package name */
    public float f27345M0;

    /* renamed from: N0  reason: collision with root package name */
    public final ColorStateList f27346N0;

    /* renamed from: z0  reason: collision with root package name */
    public final ClockHandView f27347z0;

    /* renamed from: A0  reason: collision with root package name */
    public final Rect f27333A0 = new Rect();

    /* renamed from: B0  reason: collision with root package name */
    public final RectF f27334B0 = new RectF();

    /* renamed from: C0  reason: collision with root package name */
    public final Rect f27335C0 = new Rect();

    /* renamed from: G0  reason: collision with root package name */
    public final float[] f27339G0 = {0.0f, 0.9f, 1.0f};

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.f27336D0 = sparseArray;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O7.a.f13405d, R.attr.materialClockStyle, 2131952770);
        Resources resources = getResources();
        ColorStateList L02 = A7.b.L0(context, obtainStyledAttributes, 1);
        this.f27346N0 = L02;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f27347z0 = clockHandView;
        this.f27340H0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = L02.getColorForState(new int[]{16842913}, L02.getDefaultColor());
        this.f27338F0 = new int[]{colorForState, colorForState, L02.getDefaultColor()};
        clockHandView.f27350j0.add(this);
        int defaultColor = AbstractC5042g.b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList L03 = A7.b.L0(context, obtainStyledAttributes, 0);
        setBackgroundColor(L03 != null ? L03.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f27337E0 = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f27344L0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < Math.max(this.f27344L0.length, size); i10++) {
            TextView textView = (TextView) sparseArray.get(i10);
            if (i10 >= this.f27344L0.length) {
                removeView(textView);
                sparseArray.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.f27344L0[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                z10 = i11 > 1 ? true : z10;
                Z.l(textView, this.f27337E0);
                textView.setTextColor(this.f27346N0);
            }
        }
        ClockHandView clockHandView2 = this.f27347z0;
        if (clockHandView2.f27349i0 && !z10) {
            clockHandView2.f27360t0 = 1;
        }
        clockHandView2.f27349i0 = z10;
        clockHandView2.invalidate();
        this.f27341I0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f27342J0 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f27343K0 = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.f
    public final void f() {
        int i10;
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i12 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, new ArrayList());
                }
                ((List) hashMap.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i10 = Math.round(this.f27368x0 * 0.66f);
            } else {
                i10 = this.f27368x0;
            }
            float f6 = 0.0f;
            for (View view : list) {
                int id2 = view.getId();
                HashMap hashMap2 = nVar.f36944c;
                if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                    hashMap2.put(Integer.valueOf(id2), new k1.i());
                }
                k1.j jVar = ((k1.i) hashMap2.get(Integer.valueOf(id2))).f36857d;
                jVar.f36914w = R.id.circle_center;
                jVar.f36915x = i10;
                jVar.f36916y = f6;
                f6 += 360.0f / list.size();
            }
        }
        nVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i13 = 0;
        while (true) {
            SparseArray sparseArray = this.f27336D0;
            if (i13 < sparseArray.size()) {
                ((TextView) sparseArray.get(i13)).setVisibility(0);
                i13++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z10;
        Rect rect2;
        RadialGradient radialGradient;
        RectF rectF2 = this.f27347z0.f27354n0;
        float f6 = Float.MAX_VALUE;
        TextView textView = null;
        int i10 = 0;
        while (true) {
            sparseArray = this.f27336D0;
            int size = sparseArray.size();
            rectF = this.f27334B0;
            rect = this.f27333A0;
            if (i10 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f6) {
                    textView = textView2;
                    f6 = height;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            TextView textView3 = (TextView) sparseArray.get(i11);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView3.setSelected(z10);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f27335C0);
                rectF.inset(rect2.left, rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f27338F0, this.f27339G0, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f27344L0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f27343K0 / Math.max(Math.max(this.f27341I0 / displayMetrics.heightPixels, this.f27342J0 / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
