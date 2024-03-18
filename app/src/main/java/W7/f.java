package W7;

import a8.h;
import a8.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import c8.C2306c;
import com.google.android.material.chip.Chip;
import com.openai.chatgpt.R;
import d8.AbstractC2605a;
import f8.C2944a;
import f8.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import s1.AbstractC5521c;
import t1.AbstractC5656b;
import t1.AbstractC5657c;
import t1.AbstractC5662h;
import t1.AbstractC5663i;

/* loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, h {

    /* renamed from: L1  reason: collision with root package name */
    public static final int[] f20758L1 = {16842910};

    /* renamed from: M1  reason: collision with root package name */
    public static final ShapeDrawable f20759M1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A1  reason: collision with root package name */
    public PorterDuffColorFilter f20760A1;

    /* renamed from: B1  reason: collision with root package name */
    public ColorStateList f20761B1;

    /* renamed from: C0  reason: collision with root package name */
    public ColorStateList f20762C0;

    /* renamed from: D0  reason: collision with root package name */
    public ColorStateList f20764D0;

    /* renamed from: D1  reason: collision with root package name */
    public int[] f20765D1;

    /* renamed from: E0  reason: collision with root package name */
    public float f20766E0;

    /* renamed from: E1  reason: collision with root package name */
    public boolean f20767E1;

    /* renamed from: F1  reason: collision with root package name */
    public ColorStateList f20769F1;

    /* renamed from: G0  reason: collision with root package name */
    public ColorStateList f20770G0;

    /* renamed from: H0  reason: collision with root package name */
    public float f20772H0;

    /* renamed from: H1  reason: collision with root package name */
    public TextUtils.TruncateAt f20773H1;

    /* renamed from: I0  reason: collision with root package name */
    public ColorStateList f20774I0;

    /* renamed from: I1  reason: collision with root package name */
    public boolean f20775I1;

    /* renamed from: J1  reason: collision with root package name */
    public int f20777J1;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f20778K0;

    /* renamed from: K1  reason: collision with root package name */
    public boolean f20779K1;

    /* renamed from: L0  reason: collision with root package name */
    public Drawable f20780L0;

    /* renamed from: M0  reason: collision with root package name */
    public ColorStateList f20781M0;

    /* renamed from: N0  reason: collision with root package name */
    public float f20782N0;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f20783O0;

    /* renamed from: P0  reason: collision with root package name */
    public boolean f20784P0;

    /* renamed from: Q0  reason: collision with root package name */
    public Drawable f20785Q0;

    /* renamed from: R0  reason: collision with root package name */
    public RippleDrawable f20786R0;

    /* renamed from: S0  reason: collision with root package name */
    public ColorStateList f20787S0;

    /* renamed from: T0  reason: collision with root package name */
    public float f20788T0;

    /* renamed from: U0  reason: collision with root package name */
    public SpannableStringBuilder f20789U0;

    /* renamed from: V0  reason: collision with root package name */
    public boolean f20790V0;

    /* renamed from: W0  reason: collision with root package name */
    public boolean f20791W0;

    /* renamed from: X0  reason: collision with root package name */
    public Drawable f20792X0;

    /* renamed from: Y0  reason: collision with root package name */
    public ColorStateList f20793Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public P7.b f20794Z0;

    /* renamed from: a1  reason: collision with root package name */
    public P7.b f20795a1;
    public float b1;

    /* renamed from: c1  reason: collision with root package name */
    public float f20796c1;

    /* renamed from: d1  reason: collision with root package name */
    public float f20797d1;

    /* renamed from: e1  reason: collision with root package name */
    public float f20798e1;

    /* renamed from: f1  reason: collision with root package name */
    public float f20799f1;
    public float g1;

    /* renamed from: h1  reason: collision with root package name */
    public float f20800h1;

    /* renamed from: i1  reason: collision with root package name */
    public float f20801i1;

    /* renamed from: j1  reason: collision with root package name */
    public final Context f20802j1;

    /* renamed from: p1  reason: collision with root package name */
    public final i f20808p1;

    /* renamed from: q1  reason: collision with root package name */
    public int f20809q1;

    /* renamed from: r1  reason: collision with root package name */
    public int f20810r1;

    /* renamed from: s1  reason: collision with root package name */
    public int f20811s1;

    /* renamed from: t1  reason: collision with root package name */
    public int f20812t1;

    /* renamed from: u1  reason: collision with root package name */
    public int f20813u1;

    /* renamed from: v1  reason: collision with root package name */
    public int f20814v1;

    /* renamed from: w1  reason: collision with root package name */
    public boolean f20815w1;

    /* renamed from: x1  reason: collision with root package name */
    public int f20816x1;

    /* renamed from: z1  reason: collision with root package name */
    public ColorFilter f20818z1;

    /* renamed from: F0  reason: collision with root package name */
    public float f20768F0 = -1.0f;

    /* renamed from: k1  reason: collision with root package name */
    public final Paint f20803k1 = new Paint(1);

    /* renamed from: l1  reason: collision with root package name */
    public final Paint.FontMetrics f20804l1 = new Paint.FontMetrics();

    /* renamed from: m1  reason: collision with root package name */
    public final RectF f20805m1 = new RectF();

    /* renamed from: n1  reason: collision with root package name */
    public final PointF f20806n1 = new PointF();

    /* renamed from: o1  reason: collision with root package name */
    public final Path f20807o1 = new Path();

    /* renamed from: y1  reason: collision with root package name */
    public int f20817y1 = 255;

    /* renamed from: C1  reason: collision with root package name */
    public PorterDuff.Mode f20763C1 = PorterDuff.Mode.SRC_IN;

    /* renamed from: G1  reason: collision with root package name */
    public WeakReference f20771G1 = new WeakReference(null);

    /* renamed from: J0  reason: collision with root package name */
    public CharSequence f20776J0 = "";

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2131952692);
        i(context);
        this.f20802j1 = context;
        i iVar = new i(this);
        this.f20808p1 = iVar;
        iVar.f24005a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f20758L1;
        setState(iArr);
        if (!Arrays.equals(this.f20765D1, iArr)) {
            this.f20765D1 = iArr;
            if (U()) {
                w(getState(), iArr);
            }
        }
        this.f20775I1 = true;
        int[] iArr2 = AbstractC2605a.f28124a;
        f20759M1.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean u(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final void A(boolean z10) {
        if (this.f20791W0 != z10) {
            boolean S = S();
            this.f20791W0 = z10;
            boolean S10 = S();
            if (S != S10) {
                if (S10) {
                    o(this.f20792X0);
                } else {
                    V(this.f20792X0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void B(float f6) {
        if (this.f20768F0 != f6) {
            this.f20768F0 = f6;
            d7.h e10 = this.f29688Y.f29665a.e();
            e10.f28076e = new C2944a(f6);
            e10.f28077f = new C2944a(f6);
            e10.f28078g = new C2944a(f6);
            e10.f28079h = new C2944a(f6);
            setShapeAppearanceModel(e10.a());
        }
    }

    public final void C(Drawable drawable) {
        Drawable drawable2 = this.f20780L0;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof AbstractC5662h) {
                ((AbstractC5663i) ((AbstractC5662h) drawable2)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q10 = q();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f20780L0 = drawable3;
            float q11 = q();
            V(drawable2);
            if (T()) {
                o(this.f20780L0);
            }
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void D(float f6) {
        if (this.f20782N0 != f6) {
            float q10 = q();
            this.f20782N0 = f6;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.f20783O0 = true;
        if (this.f20781M0 != colorStateList) {
            this.f20781M0 = colorStateList;
            if (T()) {
                AbstractC5656b.h(this.f20780L0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z10) {
        if (this.f20778K0 != z10) {
            boolean T = T();
            this.f20778K0 = z10;
            boolean T10 = T();
            if (T != T10) {
                if (T10) {
                    o(this.f20780L0);
                } else {
                    V(this.f20780L0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.f20770G0 != colorStateList) {
            this.f20770G0 = colorStateList;
            if (this.f20779K1) {
                f8.f fVar = this.f29688Y;
                if (fVar.f29668d != colorStateList) {
                    fVar.f29668d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f6) {
        if (this.f20772H0 != f6) {
            this.f20772H0 = f6;
            this.f20803k1.setStrokeWidth(f6);
            if (this.f20779K1) {
                this.f29688Y.f29675k = f6;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void I(Drawable drawable) {
        Drawable drawable2 = this.f20785Q0;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof AbstractC5662h) {
                ((AbstractC5663i) ((AbstractC5662h) drawable2)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float r10 = r();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f20785Q0 = drawable3;
            int[] iArr = AbstractC2605a.f28124a;
            this.f20786R0 = new RippleDrawable(AbstractC2605a.a(this.f20774I0), this.f20785Q0, f20759M1);
            float r11 = r();
            V(drawable2);
            if (U()) {
                o(this.f20785Q0);
            }
            invalidateSelf();
            if (r10 != r11) {
                v();
            }
        }
    }

    public final void J(float f6) {
        if (this.f20800h1 != f6) {
            this.f20800h1 = f6;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void K(float f6) {
        if (this.f20788T0 != f6) {
            this.f20788T0 = f6;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void L(float f6) {
        if (this.g1 != f6) {
            this.g1 = f6;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f20787S0 != colorStateList) {
            this.f20787S0 = colorStateList;
            if (U()) {
                AbstractC5656b.h(this.f20785Q0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z10) {
        if (this.f20784P0 != z10) {
            boolean U10 = U();
            this.f20784P0 = z10;
            boolean U11 = U();
            if (U10 != U11) {
                if (U11) {
                    o(this.f20785Q0);
                } else {
                    V(this.f20785Q0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f6) {
        if (this.f20797d1 != f6) {
            float q10 = q();
            this.f20797d1 = f6;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void P(float f6) {
        if (this.f20796c1 != f6) {
            float q10 = q();
            this.f20796c1 = f6;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.f20774I0 != colorStateList) {
            this.f20774I0 = colorStateList;
            if (this.f20767E1) {
                colorStateList2 = AbstractC2605a.a(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.f20769F1 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void R(C2306c c2306c) {
        i iVar = this.f20808p1;
        if (iVar.f24010f != c2306c) {
            iVar.f24010f = c2306c;
            if (c2306c != null) {
                TextPaint textPaint = iVar.f24005a;
                Context context = this.f20802j1;
                b bVar = iVar.f24006b;
                c2306c.f(context, textPaint, bVar);
                h hVar = (h) iVar.f24009e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                c2306c.e(context, textPaint, bVar);
                iVar.f24008d = true;
            }
            h hVar2 = (h) iVar.f24009e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.v();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean S() {
        if (this.f20791W0 && this.f20792X0 != null && this.f20815w1) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (this.f20778K0 && this.f20780L0 != null) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if (this.f20784P0 && this.f20785Q0 != null) {
            return true;
        }
        return false;
    }

    @Override // f8.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        int i14;
        RectF rectF2;
        boolean z10;
        int i15;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.f20817y1) != 0) {
            if (i10 < 255) {
                i11 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
            } else {
                i11 = 0;
            }
            boolean z11 = this.f20779K1;
            Paint paint = this.f20803k1;
            RectF rectF3 = this.f20805m1;
            if (!z11) {
                paint.setColor(this.f20809q1);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            }
            if (!this.f20779K1) {
                paint.setColor(this.f20810r1);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f20818z1;
                if (colorFilter == null) {
                    colorFilter = this.f20760A1;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            }
            if (this.f20779K1) {
                super.draw(canvas);
            }
            if (this.f20772H0 > 0.0f && !this.f20779K1) {
                paint.setColor(this.f20812t1);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f20779K1) {
                    ColorFilter colorFilter2 = this.f20818z1;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f20760A1;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f6 = this.f20772H0 / 2.0f;
                rectF3.set(bounds.left + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
                float f10 = this.f20768F0 - (this.f20772H0 / 2.0f);
                canvas.drawRoundRect(rectF3, f10, f10, paint);
            }
            paint.setColor(this.f20813u1);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.f20779K1) {
                canvas.drawRoundRect(rectF3, s(), s(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.f20807o1;
                f8.f fVar = this.f29688Y;
                this.f29705w0.a(fVar.f29665a, fVar.f29674j, rectF4, this.f29704v0, path);
                e(canvas, paint, path, this.f29688Y.f29665a, g());
            }
            if (T()) {
                p(bounds, rectF3);
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                canvas.translate(f11, f12);
                this.f20780L0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f20780L0.draw(canvas);
                canvas.translate(-f11, -f12);
            }
            if (S()) {
                p(bounds, rectF3);
                float f13 = rectF3.left;
                float f14 = rectF3.top;
                canvas.translate(f13, f14);
                this.f20792X0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f20792X0.draw(canvas);
                canvas.translate(-f13, -f14);
            }
            if (this.f20775I1 && this.f20776J0 != null) {
                PointF pointF = this.f20806n1;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f20776J0;
                i iVar = this.f20808p1;
                if (charSequence != null) {
                    float q10 = q() + this.b1 + this.f20798e1;
                    if (AbstractC5657c.a(this) == 0) {
                        pointF.x = bounds.left + q10;
                    } else {
                        pointF.x = bounds.right - q10;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = iVar.f24005a;
                    Paint.FontMetrics fontMetrics = this.f20804l1;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.f20776J0 != null) {
                    float q11 = q() + this.b1 + this.f20798e1;
                    float r10 = r() + this.f20801i1 + this.f20799f1;
                    if (AbstractC5657c.a(this) == 0) {
                        rectF3.left = bounds.left + q11;
                        rectF3.right = bounds.right - r10;
                    } else {
                        rectF3.left = bounds.left + r10;
                        rectF3.right = bounds.right - q11;
                    }
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                C2306c c2306c = iVar.f24010f;
                TextPaint textPaint2 = iVar.f24005a;
                if (c2306c != null) {
                    textPaint2.drawableState = getState();
                    iVar.f24010f.e(this.f20802j1, textPaint2, iVar.f24006b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(iVar.a(this.f20776J0.toString())) > Math.round(rectF3.width())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i15 = canvas.save();
                    canvas.clipRect(rectF3);
                } else {
                    i15 = 0;
                }
                CharSequence charSequence2 = this.f20776J0;
                if (z10 && this.f20773H1 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f20773H1);
                }
                CharSequence charSequence3 = charSequence2;
                int length = charSequence3.length();
                float f15 = pointF.x;
                float f16 = pointF.y;
                rectF = rectF3;
                i13 = i11;
                i12 = 0;
                i14 = 255;
                canvas.drawText(charSequence3, 0, length, f15, f16, textPaint2);
                if (z10) {
                    canvas.restoreToCount(i15);
                }
            } else {
                rectF = rectF3;
                i13 = i11;
                i12 = 0;
                i14 = 255;
            }
            if (U()) {
                rectF.setEmpty();
                if (U()) {
                    float f17 = this.f20801i1 + this.f20800h1;
                    if (AbstractC5657c.a(this) == 0) {
                        float f18 = bounds.right - f17;
                        rectF2 = rectF;
                        rectF2.right = f18;
                        rectF2.left = f18 - this.f20788T0;
                    } else {
                        rectF2 = rectF;
                        float f19 = bounds.left + f17;
                        rectF2.left = f19;
                        rectF2.right = f19 + this.f20788T0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f20 = this.f20788T0;
                    float f21 = exactCenterY - (f20 / 2.0f);
                    rectF2.top = f21;
                    rectF2.bottom = f21 + f20;
                } else {
                    rectF2 = rectF;
                }
                float f22 = rectF2.left;
                float f23 = rectF2.top;
                canvas.translate(f22, f23);
                this.f20785Q0.setBounds(i12, i12, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = AbstractC2605a.f28124a;
                this.f20786R0.setBounds(this.f20785Q0.getBounds());
                this.f20786R0.jumpToCurrentState();
                this.f20786R0.draw(canvas);
                canvas.translate(-f22, -f23);
            }
            if (this.f20817y1 < i14) {
                canvas.restoreToCount(i13);
            }
        }
    }

    @Override // f8.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f20817y1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f20818z1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f20766E0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(r() + this.f20808p1.a(this.f20776J0.toString()) + q() + this.b1 + this.f20798e1 + this.f20799f1 + this.f20801i1), this.f20777J1);
    }

    @Override // f8.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // f8.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f20779K1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f20768F0);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f20766E0, this.f20768F0);
        }
        outline.setAlpha(this.f20817y1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // f8.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C2306c c2306c;
        ColorStateList colorStateList;
        if (!t(this.f20762C0) && !t(this.f20764D0) && !t(this.f20770G0) && ((!this.f20767E1 || !t(this.f20769F1)) && (((c2306c = this.f20808p1.f24010f) == null || (colorStateList = c2306c.f26361j) == null || !colorStateList.isStateful()) && ((!this.f20791W0 || this.f20792X0 == null || !this.f20790V0) && !u(this.f20780L0) && !u(this.f20792X0) && !t(this.f20761B1))))) {
            return false;
        }
        return true;
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC5657c.b(drawable, AbstractC5657c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f20785Q0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f20765D1);
            }
            AbstractC5656b.h(drawable, this.f20787S0);
            return;
        }
        Drawable drawable2 = this.f20780L0;
        if (drawable == drawable2 && this.f20783O0) {
            AbstractC5656b.h(drawable2, this.f20781M0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (T()) {
            onLayoutDirectionChanged |= AbstractC5657c.b(this.f20780L0, i10);
        }
        if (S()) {
            onLayoutDirectionChanged |= AbstractC5657c.b(this.f20792X0, i10);
        }
        if (U()) {
            onLayoutDirectionChanged |= AbstractC5657c.b(this.f20785Q0, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (T()) {
            onLevelChange |= this.f20780L0.setLevel(i10);
        }
        if (S()) {
            onLevelChange |= this.f20792X0.setLevel(i10);
        }
        if (U()) {
            onLevelChange |= this.f20785Q0.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // f8.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f20779K1) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.f20765D1);
    }

    public final void p(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (T() || S()) {
            float f6 = this.b1 + this.f20796c1;
            if (this.f20815w1) {
                drawable = this.f20792X0;
            } else {
                drawable = this.f20780L0;
            }
            float f10 = this.f20782N0;
            if (f10 <= 0.0f && drawable != null) {
                f10 = drawable.getIntrinsicWidth();
            }
            if (AbstractC5657c.a(this) == 0) {
                float f11 = rect.left + f6;
                rectF.left = f11;
                rectF.right = f11 + f10;
            } else {
                float f12 = rect.right - f6;
                rectF.right = f12;
                rectF.left = f12 - f10;
            }
            if (this.f20815w1) {
                drawable2 = this.f20792X0;
            } else {
                drawable2 = this.f20780L0;
            }
            float f13 = this.f20782N0;
            if (f13 <= 0.0f && drawable2 != null) {
                f13 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f20802j1.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f13) {
                    f13 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f13 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f13;
        }
    }

    public final float q() {
        Drawable drawable;
        if (!T() && !S()) {
            return 0.0f;
        }
        float f6 = this.f20796c1;
        if (this.f20815w1) {
            drawable = this.f20792X0;
        } else {
            drawable = this.f20780L0;
        }
        float f10 = this.f20782N0;
        if (f10 <= 0.0f && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        return f10 + f6 + this.f20797d1;
    }

    public final float r() {
        if (U()) {
            return this.g1 + this.f20788T0 + this.f20800h1;
        }
        return 0.0f;
    }

    public final float s() {
        if (this.f20779K1) {
            return this.f29688Y.f29665a.f29714e.a(g());
        }
        return this.f20768F0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // f8.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f20817y1 != i10) {
            this.f20817y1 = i10;
            invalidateSelf();
        }
    }

    @Override // f8.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f20818z1 != colorFilter) {
            this.f20818z1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // f8.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f20761B1 != colorStateList) {
            this.f20761B1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // f8.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f20763C1 != mode) {
            this.f20763C1 = mode;
            ColorStateList colorStateList = this.f20761B1;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f20760A1 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (T()) {
            visible |= this.f20780L0.setVisible(z10, z11);
        }
        if (S()) {
            visible |= this.f20792X0.setVisible(z10, z11);
        }
        if (U()) {
            visible |= this.f20785Q0.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        e eVar = (e) this.f20771G1.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f27117w0);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean w(int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f20762C0;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(iArr, this.f20809q1);
        } else {
            i10 = 0;
        }
        int c10 = c(i10);
        boolean z14 = true;
        if (this.f20809q1 != c10) {
            this.f20809q1 = c10;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f20764D0;
        if (colorStateList3 != null) {
            i11 = colorStateList3.getColorForState(iArr, this.f20810r1);
        } else {
            i11 = 0;
        }
        int c11 = c(i11);
        if (this.f20810r1 != c11) {
            this.f20810r1 = c11;
            onStateChange = true;
        }
        int b10 = AbstractC5521c.b(c11, c10);
        if (this.f20811s1 != b10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f29688Y.f29667c == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 | z11) {
            this.f20811s1 = b10;
            k(ColorStateList.valueOf(b10));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f20770G0;
        if (colorStateList4 != null) {
            i12 = colorStateList4.getColorForState(iArr, this.f20812t1);
        } else {
            i12 = 0;
        }
        if (this.f20812t1 != i12) {
            this.f20812t1 = i12;
            onStateChange = true;
        }
        if (this.f20769F1 != null && AbstractC2605a.b(iArr)) {
            i13 = this.f20769F1.getColorForState(iArr, this.f20813u1);
        } else {
            i13 = 0;
        }
        if (this.f20813u1 != i13) {
            this.f20813u1 = i13;
            if (this.f20767E1) {
                onStateChange = true;
            }
        }
        C2306c c2306c = this.f20808p1.f24010f;
        if (c2306c != null && (colorStateList = c2306c.f26361j) != null) {
            i14 = colorStateList.getColorForState(iArr, this.f20814v1);
        } else {
            i14 = 0;
        }
        if (this.f20814v1 != i14) {
            this.f20814v1 = i14;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    break;
                } else if (state[i16] == 16842912) {
                    if (this.f20790V0) {
                        z12 = true;
                    }
                } else {
                    i16++;
                }
            }
        }
        z12 = false;
        if (this.f20815w1 != z12 && this.f20792X0 != null) {
            float q10 = q();
            this.f20815w1 = z12;
            if (q10 != q()) {
                onStateChange = true;
                z13 = true;
            } else {
                z13 = false;
                onStateChange = true;
            }
        } else {
            z13 = false;
        }
        ColorStateList colorStateList5 = this.f20761B1;
        if (colorStateList5 != null) {
            i15 = colorStateList5.getColorForState(iArr, this.f20816x1);
        } else {
            i15 = 0;
        }
        if (this.f20816x1 != i15) {
            this.f20816x1 = i15;
            ColorStateList colorStateList6 = this.f20761B1;
            PorterDuff.Mode mode = this.f20763C1;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f20760A1 = porterDuffColorFilter;
        } else {
            z14 = onStateChange;
        }
        if (u(this.f20780L0)) {
            z14 |= this.f20780L0.setState(iArr);
        }
        if (u(this.f20792X0)) {
            z14 |= this.f20792X0.setState(iArr);
        }
        if (u(this.f20785Q0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z14 |= this.f20785Q0.setState(iArr3);
        }
        int[] iArr4 = AbstractC2605a.f28124a;
        if (u(this.f20786R0)) {
            z14 |= this.f20786R0.setState(iArr2);
        }
        if (z14) {
            invalidateSelf();
        }
        if (z13) {
            v();
        }
        return z14;
    }

    public final void x(boolean z10) {
        if (this.f20790V0 != z10) {
            this.f20790V0 = z10;
            float q10 = q();
            if (!z10 && this.f20815w1) {
                this.f20815w1 = false;
            }
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.f20792X0 != drawable) {
            float q10 = q();
            this.f20792X0 = drawable;
            float q11 = q();
            V(this.f20792X0);
            o(this.f20792X0);
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f20793Y0 != colorStateList) {
            this.f20793Y0 = colorStateList;
            if (this.f20791W0 && (drawable = this.f20792X0) != null && this.f20790V0) {
                AbstractC5656b.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
