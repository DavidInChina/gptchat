package com.google.android.material.timepicker;

import D1.H;
import D1.Z;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: i0  reason: collision with root package name */
    public boolean f27349i0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f27351k0;

    /* renamed from: l0  reason: collision with root package name */
    public final float f27352l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Paint f27353m0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f27355o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f27356p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f27357q0;

    /* renamed from: r0  reason: collision with root package name */
    public double f27358r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f27359s0;

    /* renamed from: h0  reason: collision with root package name */
    public final ValueAnimator f27348h0 = new ValueAnimator();

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f27350j0 = new ArrayList();

    /* renamed from: n0  reason: collision with root package name */
    public final RectF f27354n0 = new RectF();

    /* renamed from: t0  reason: collision with root package name */
    public int f27360t0 = 1;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f27353m0 = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O7.a.f13406e, R.attr.materialClockStyle, 2131952770);
        P4.a.B0(context, R.attr.motionDurationLong2, RCHTTPStatusCodes.SUCCESS);
        P4.a.C0(context, R.attr.motionEasingEmphasizedInterpolator, P7.a.f13839b);
        this.f27359s0 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f27351k0 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f27355o0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f27352l0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = Z.f3247a;
        H.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i10) {
        if (i10 == 2) {
            return Math.round(this.f27359s0 * 0.66f);
        }
        return this.f27359s0;
    }

    public final void b(float f6) {
        ValueAnimator valueAnimator = this.f27348h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f6);
    }

    public final void c(float f6) {
        float f10 = f6 % 360.0f;
        this.f27356p0 = f10;
        this.f27358r0 = Math.toRadians(f10 - 90.0f);
        float a5 = a(this.f27360t0);
        float cos = (((float) Math.cos(this.f27358r0)) * a5) + (getWidth() / 2);
        float sin = (a5 * ((float) Math.sin(this.f27358r0))) + (getHeight() / 2);
        float f11 = this.f27351k0;
        this.f27354n0.set(cos - f11, sin - f11, cos + f11, sin + f11);
        Iterator it = this.f27350j0.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f27345M0 - f10) > 0.001f) {
                clockFaceView.f27345M0 = f10;
                clockFaceView.g();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a5;
        int i10;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f6 = width;
        float a10 = a(this.f27360t0);
        float f10 = height;
        Paint paint = this.f27353m0;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f27358r0)) * a10) + f6, (a10 * ((float) Math.sin(this.f27358r0))) + f10, this.f27351k0, paint);
        double sin = Math.sin(this.f27358r0);
        paint.setStrokeWidth(this.f27355o0);
        canvas.drawLine(f6, f10, width + ((int) (Math.cos(this.f27358r0) * r12)), height + ((int) (r12 * sin)), paint);
        canvas.drawCircle(f6, f10, this.f27352l0, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f27348h0.isRunning()) {
            b(this.f27356p0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z11 = false;
                z10 = false;
            } else {
                z11 = this.f27357q0;
                if (this.f27349i0) {
                    if (((float) Math.hypot(x10 - (getWidth() / 2), y10 - (getHeight() / 2))) <= a(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics())) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    this.f27360t0 = i10;
                }
                z10 = false;
            }
        } else {
            this.f27357q0 = false;
            z10 = true;
            z11 = false;
        }
        boolean z14 = this.f27357q0;
        int degrees = (int) Math.toDegrees(Math.atan2(y10 - (getHeight() / 2), x10 - (getWidth() / 2)));
        int i11 = degrees + 90;
        if (i11 < 0) {
            i11 = degrees + 450;
        }
        float f6 = i11;
        if (this.f27356p0 != f6) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 || !z12) {
            if (z12 || z11) {
                b(f6);
            }
            this.f27357q0 = z14 | z13;
            return true;
        }
        z13 = true;
        this.f27357q0 = z14 | z13;
        return true;
    }
}
