package com.google.android.material.chip;

import B1.p;
import B1.q;
import D1.H;
import D1.I;
import D1.N;
import D1.Z;
import O7.a;
import W7.b;
import W7.c;
import W7.d;
import W7.e;
import W7.f;
import a8.i;
import a8.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import c8.C2306c;
import com.google.android.material.chip.Chip;
import com.openai.chatgpt.R;
import d8.AbstractC2605a;
import f8.j;
import f8.u;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import k8.AbstractC4203a;
import kotlin.jvm.internal.m;
import p1.AbstractC5042g;
import q.C5235t;
import t1.AbstractC5657c;
import t1.AbstractC5662h;
import t1.AbstractC5663i;

/* loaded from: classes.dex */
public class Chip extends C5235t implements e, u, Checkable {

    /* renamed from: D0  reason: collision with root package name */
    public static final Rect f27100D0 = new Rect();

    /* renamed from: E0  reason: collision with root package name */
    public static final int[] f27101E0 = {16842913};

    /* renamed from: F0  reason: collision with root package name */
    public static final int[] f27102F0 = {16842911};

    /* renamed from: A0  reason: collision with root package name */
    public final Rect f27103A0 = new Rect();

    /* renamed from: B0  reason: collision with root package name */
    public final RectF f27104B0 = new RectF();

    /* renamed from: C0  reason: collision with root package name */
    public final b f27105C0 = new b(0, this);

    /* renamed from: l0  reason: collision with root package name */
    public f f27106l0;

    /* renamed from: m0  reason: collision with root package name */
    public InsetDrawable f27107m0;

    /* renamed from: n0  reason: collision with root package name */
    public RippleDrawable f27108n0;

    /* renamed from: o0  reason: collision with root package name */
    public View.OnClickListener f27109o0;

    /* renamed from: p0  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f27110p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f27111q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f27112r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f27113s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f27114t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f27115u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f27116v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f27117w0;

    /* renamed from: x0  reason: collision with root package name */
    public CharSequence f27118x0;

    /* renamed from: y0  reason: collision with root package name */
    public final d f27119y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f27120z0;

    public Chip(Context context, AttributeSet attributeSet) {
        super(AbstractC4203a.a(context, attributeSet, R.attr.chipStyle, 2131952692), attributeSet, R.attr.chipStyle);
        C2306c c2306c;
        P7.b bVar;
        P7.b bVar2;
        int resourceId;
        int resourceId2;
        int resourceId3;
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                AbstractC3612c.r("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    AbstractC3612c.r("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        f fVar = new f(context2, attributeSet);
        int[] iArr = a.f13404c;
        TypedArray e10 = k.e(fVar.f20802j1, attributeSet, iArr, R.attr.chipStyle, 2131952692, new int[0]);
        fVar.f20779K1 = e10.hasValue(37);
        Context context3 = fVar.f20802j1;
        ColorStateList L02 = A7.b.L0(context3, e10, 24);
        if (fVar.f20762C0 != L02) {
            fVar.f20762C0 = L02;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList L03 = A7.b.L0(context3, e10, 11);
        if (fVar.f20764D0 != L03) {
            fVar.f20764D0 = L03;
            fVar.onStateChange(fVar.getState());
        }
        float dimension = e10.getDimension(19, 0.0f);
        if (fVar.f20766E0 != dimension) {
            fVar.f20766E0 = dimension;
            fVar.invalidateSelf();
            fVar.v();
        }
        if (e10.hasValue(12)) {
            fVar.B(e10.getDimension(12, 0.0f));
        }
        fVar.G(A7.b.L0(context3, e10, 22));
        fVar.H(e10.getDimension(23, 0.0f));
        fVar.Q(A7.b.L0(context3, e10, 36));
        String text = e10.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(fVar.f20776J0, text)) {
            fVar.f20776J0 = text;
            fVar.f20808p1.f24008d = true;
            fVar.invalidateSelf();
            fVar.v();
        }
        if (e10.hasValue(0) && (resourceId3 = e10.getResourceId(0, 0)) != 0) {
            c2306c = new C2306c(context3, resourceId3);
        } else {
            c2306c = null;
        }
        c2306c.f26362k = e10.getDimension(1, c2306c.f26362k);
        fVar.R(c2306c);
        int i10 = e10.getInt(3, 0);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    fVar.f20773H1 = TextUtils.TruncateAt.END;
                }
            } else {
                fVar.f20773H1 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            fVar.f20773H1 = TextUtils.TruncateAt.START;
        }
        fVar.F(e10.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            fVar.F(e10.getBoolean(15, false));
        }
        fVar.C(A7.b.O0(context3, e10, 14));
        if (e10.hasValue(17)) {
            fVar.E(A7.b.L0(context3, e10, 17));
        }
        fVar.D(e10.getDimension(16, -1.0f));
        fVar.N(e10.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            fVar.N(e10.getBoolean(26, false));
        }
        fVar.I(A7.b.O0(context3, e10, 25));
        fVar.M(A7.b.L0(context3, e10, 30));
        fVar.K(e10.getDimension(28, 0.0f));
        fVar.x(e10.getBoolean(6, false));
        fVar.A(e10.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            fVar.A(e10.getBoolean(8, false));
        }
        fVar.y(A7.b.O0(context3, e10, 7));
        if (e10.hasValue(9)) {
            fVar.z(A7.b.L0(context3, e10, 9));
        }
        if (e10.hasValue(39) && (resourceId2 = e10.getResourceId(39, 0)) != 0) {
            bVar = P7.b.a(context3, resourceId2);
        } else {
            bVar = null;
        }
        fVar.f20794Z0 = bVar;
        if (e10.hasValue(33) && (resourceId = e10.getResourceId(33, 0)) != 0) {
            bVar2 = P7.b.a(context3, resourceId);
        } else {
            bVar2 = null;
        }
        fVar.f20795a1 = bVar2;
        float dimension2 = e10.getDimension(21, 0.0f);
        if (fVar.b1 != dimension2) {
            fVar.b1 = dimension2;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.P(e10.getDimension(35, 0.0f));
        fVar.O(e10.getDimension(34, 0.0f));
        float dimension3 = e10.getDimension(41, 0.0f);
        if (fVar.f20798e1 != dimension3) {
            fVar.f20798e1 = dimension3;
            fVar.invalidateSelf();
            fVar.v();
        }
        float dimension4 = e10.getDimension(40, 0.0f);
        if (fVar.f20799f1 != dimension4) {
            fVar.f20799f1 = dimension4;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.L(e10.getDimension(29, 0.0f));
        fVar.J(e10.getDimension(27, 0.0f));
        float dimension5 = e10.getDimension(13, 0.0f);
        if (fVar.f20801i1 != dimension5) {
            fVar.f20801i1 = dimension5;
            fVar.invalidateSelf();
            fVar.v();
        }
        fVar.f20777J1 = e10.getDimensionPixelSize(4, Integer.MAX_VALUE);
        e10.recycle();
        k.a(context2, attributeSet, R.attr.chipStyle, 2131952692);
        k.b(context2, attributeSet, iArr, R.attr.chipStyle, 2131952692, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2131952692);
        this.f27115u0 = obtainStyledAttributes.getBoolean(32, false);
        this.f27117w0 = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(fVar);
        fVar.j(N.i(this));
        k.a(context2, attributeSet, R.attr.chipStyle, 2131952692);
        k.b(context2, attributeSet, iArr, R.attr.chipStyle, 2131952692, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2131952692);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f27119y0 = new d(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new c(this));
        }
        setChecked(this.f27111q0);
        setText(fVar.f20776J0);
        setEllipsize(fVar.f20773H1);
        h();
        if (!this.f27106l0.f20775I1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f27115u0) {
            setMinHeight(this.f27117w0);
        }
        this.f27116v0 = I.d(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: W7.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.f27110p0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f27104B0;
        rectF.setEmpty();
        if (c() && this.f27109o0 != null) {
            f fVar = this.f27106l0;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.U()) {
                float f6 = fVar.f20801i1 + fVar.f20800h1 + fVar.f20788T0 + fVar.g1 + fVar.f20799f1;
                if (AbstractC5657c.a(fVar) == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f6;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f6;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.f27103A0;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private C2306c getTextAppearance() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20808p1.f24010f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f27113s0 != z10) {
            this.f27113s0 = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f27112r0 != z10) {
            this.f27112r0 = z10;
            refreshDrawableState();
        }
    }

    public final void b(int i10) {
        int i11;
        this.f27117w0 = i10;
        int i12 = 0;
        if (!this.f27115u0) {
            InsetDrawable insetDrawable = this.f27107m0;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f27107m0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = AbstractC2605a.f28124a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr2 = AbstractC2605a.f28124a;
            f();
            return;
        }
        int max = Math.max(0, i10 - ((int) this.f27106l0.f20766E0));
        int max2 = Math.max(0, i10 - this.f27106l0.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f27107m0;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f27107m0 = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = AbstractC2605a.f28124a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr4 = AbstractC2605a.f28124a;
            f();
            return;
        }
        if (max2 > 0) {
            i11 = max2 / 2;
        } else {
            i11 = 0;
        }
        if (max > 0) {
            i12 = max / 2;
        }
        int i13 = i12;
        if (this.f27107m0 != null) {
            Rect rect = new Rect();
            this.f27107m0.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i11 && rect.right == i11) {
                int[] iArr5 = AbstractC2605a.f28124a;
                f();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f27107m0 = new InsetDrawable((Drawable) this.f27106l0, i11, i13, i11, i13);
        int[] iArr6 = AbstractC2605a.f28124a;
        f();
    }

    public final boolean c() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            Drawable drawable = fVar.f20785Q0;
            if (drawable != null) {
                if (drawable instanceof AbstractC5662h) {
                    ((AbstractC5663i) ((AbstractC5662h) drawable)).getClass();
                    drawable = null;
                }
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        f fVar = this.f27106l0;
        if (fVar != null && fVar.f20790V0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        if (!this.f27120z0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f27119y0;
        AccessibilityManager accessibilityManager = dVar.f10484m0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i11 = dVar.f10489r0) != Integer.MIN_VALUE) {
                    if (i11 == Integer.MIN_VALUE) {
                        return true;
                    }
                    dVar.f10489r0 = Integer.MIN_VALUE;
                    dVar.r(Integer.MIN_VALUE, 128);
                    dVar.r(i11, 256);
                    return true;
                }
            } else {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Chip chip = dVar.f20757v0;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x10, y10)) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i12 = dVar.f10489r0;
                if (i12 != i10) {
                    dVar.f10489r0 = i10;
                    dVar.r(i10, 128);
                    dVar.r(i12, 256);
                }
                if (i10 != Integer.MIN_VALUE) {
                    return true;
                }
            }
        }
        if (super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x009d, code lost:
        if (r7 == false) goto L56;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        if (!this.f27120z0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f27119y0;
        dVar.getClass();
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i10 = 0;
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i11 = 130;
                                        }
                                    } else {
                                        i11 = 17;
                                    }
                                } else {
                                    i11 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                z10 = false;
                                while (i10 < repeatCount && dVar.n(i11, null)) {
                                    i10++;
                                    z10 = true;
                                }
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i12 = dVar.f10488q0;
                    if (i12 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f20757v0;
                        if (i12 == 0) {
                            chip.performClick();
                        } else if (i12 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f27109o0;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                                i10 = 1;
                            }
                            if (chip.f27120z0) {
                                chip.f27119y0.r(1, 1);
                            }
                        }
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                z10 = dVar.n(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z10 = dVar.n(1, null);
            }
            if (dVar.f10488q0 != Integer.MIN_VALUE) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // q.C5235t, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f27106l0;
        if (fVar != null && f.u(fVar.f20785Q0)) {
            f fVar2 = this.f27106l0;
            ?? isEnabled = isEnabled();
            int i10 = isEnabled;
            if (this.f27114t0) {
                i10 = isEnabled + 1;
            }
            int i11 = i10;
            if (this.f27113s0) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.f27112r0) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            int i14 = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i14 = 1;
            }
            if (this.f27114t0) {
                iArr[i14] = 16842908;
                i14++;
            }
            if (this.f27113s0) {
                iArr[i14] = 16843623;
                i14++;
            }
            if (this.f27112r0) {
                iArr[i14] = 16842919;
                i14++;
            }
            if (isChecked()) {
                iArr[i14] = 16842913;
            }
            if (!Arrays.equals(fVar2.f20765D1, iArr)) {
                fVar2.f20765D1 = iArr;
                if (fVar2.U() && fVar2.w(fVar2.getState(), iArr)) {
                    invalidate();
                }
            }
        }
    }

    public final void e() {
        f fVar;
        if (c() && (fVar = this.f27106l0) != null && fVar.f20784P0 && this.f27109o0 != null) {
            Z.l(this, this.f27119y0);
            this.f27120z0 = true;
            return;
        }
        Z.l(this, null);
        this.f27120z0 = false;
    }

    public final void f() {
        this.f27108n0 = new RippleDrawable(AbstractC2605a.a(this.f27106l0.f20774I0), getBackgroundDrawable(), null);
        f fVar = this.f27106l0;
        if (fVar.f20767E1) {
            fVar.f20767E1 = false;
            fVar.f20769F1 = null;
            fVar.onStateChange(fVar.getState());
        }
        RippleDrawable rippleDrawable = this.f27108n0;
        WeakHashMap weakHashMap = Z.f3247a;
        H.q(this, rippleDrawable);
        g();
    }

    public final void g() {
        f fVar;
        if (!TextUtils.isEmpty(getText()) && (fVar = this.f27106l0) != null) {
            int r10 = (int) (fVar.r() + fVar.f20801i1 + fVar.f20799f1);
            f fVar2 = this.f27106l0;
            int q10 = (int) (fVar2.q() + fVar2.b1 + fVar2.f20798e1);
            if (this.f27107m0 != null) {
                Rect rect = new Rect();
                this.f27107m0.getPadding(rect);
                q10 += rect.left;
                r10 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = Z.f3247a;
            I.k(this, q10, paddingTop, r10, paddingBottom);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f27118x0)) {
            return this.f27118x0;
        }
        if (d()) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f27107m0;
        if (insetDrawable == null) {
            return this.f27106l0;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20792X0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20793Y0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20764D0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f27106l0;
        if (fVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, fVar.s());
    }

    public Drawable getChipDrawable() {
        return this.f27106l0;
    }

    public float getChipEndPadding() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20801i1;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f27106l0;
        if (fVar == null || (drawable = fVar.f20780L0) == null) {
            return null;
        }
        if (drawable instanceof AbstractC5662h) {
            ((AbstractC5663i) ((AbstractC5662h) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20782N0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20781M0;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20766E0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.b1;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20770G0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20772H0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f27106l0;
        if (fVar == null || (drawable = fVar.f20785Q0) == null) {
            return null;
        }
        if (drawable instanceof AbstractC5662h) {
            ((AbstractC5663i) ((AbstractC5662h) drawable)).getClass();
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20789U0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20800h1;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20788T0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.g1;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20787S0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20773H1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f27120z0) {
            d dVar = this.f27119y0;
            if (dVar.f10488q0 == 1 || dVar.f10487p0 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public P7.b getHideMotionSpec() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20795a1;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20797d1;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20796c1;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20774I0;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        return this.f27106l0.f29688Y.f29665a;
    }

    public P7.b getShowMotionSpec() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20794Z0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20799f1;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f27106l0;
        if (fVar != null) {
            return fVar.f20798e1;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        f fVar = this.f27106l0;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        C2306c textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f27105C0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        M3.H.s0(this, this.f27106l0);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f27101E0);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f27102F0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f27120z0) {
            d dVar = this.f27119y0;
            int i11 = dVar.f10488q0;
            if (i11 != Integer.MIN_VALUE) {
                dVar.k(i11);
            }
            if (z10) {
                dVar.n(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f27116v0 != i10) {
            this.f27116v0 = i10;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f27112r0) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        return true;
                    }
                }
                if (!super.onTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            } else if (this.f27112r0) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f27109o0;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f27120z0) {
                    this.f27119y0.r(1, 1);
                }
                z10 = true;
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                return true;
            }
            if (!super.onTouchEvent(motionEvent)) {
            }
            return true;
        }
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f27118x0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f27108n0) {
            AbstractC3612c.r("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        AbstractC3612c.r("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // q.C5235t, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f27108n0) {
            AbstractC3612c.r("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // q.C5235t, android.view.View
    public void setBackgroundResource(int i10) {
        AbstractC3612c.r("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        AbstractC3612c.r("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        AbstractC3612c.r("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.x(z10);
        }
    }

    public void setCheckableResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.x(fVar.f20802j1.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        f fVar = this.f27106l0;
        if (fVar == null) {
            this.f27111q0 = z10;
        } else if (fVar.f20790V0) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.y(m.u(fVar.f20802j1, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.z(AbstractC5042g.b(fVar.f20802j1, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.A(fVar.f20802j1.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f27106l0;
        if (fVar != null && fVar.f20764D0 != colorStateList) {
            fVar.f20764D0 = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList b10;
        f fVar = this.f27106l0;
        if (fVar != null && fVar.f20764D0 != (b10 = AbstractC5042g.b(fVar.f20802j1, i10))) {
            fVar.f20764D0 = b10;
            fVar.onStateChange(fVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.B(f6);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.B(fVar.f20802j1.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f27106l0;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f20771G1 = new WeakReference(null);
            }
            this.f27106l0 = fVar;
            fVar.f20775I1 = false;
            fVar.f20771G1 = new WeakReference(this);
            b(this.f27117w0);
        }
    }

    public void setChipEndPadding(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null && fVar.f20801i1 != f6) {
            fVar.f20801i1 = f6;
            fVar.invalidateSelf();
            fVar.v();
        }
    }

    public void setChipEndPaddingResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            float dimension = fVar.f20802j1.getResources().getDimension(i10);
            if (fVar.f20801i1 != dimension) {
                fVar.f20801i1 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.C(m.u(fVar.f20802j1, i10));
        }
    }

    public void setChipIconSize(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.D(f6);
        }
    }

    public void setChipIconSizeResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.D(fVar.f20802j1.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.E(AbstractC5042g.b(fVar.f20802j1, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.F(fVar.f20802j1.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null && fVar.f20766E0 != f6) {
            fVar.f20766E0 = f6;
            fVar.invalidateSelf();
            fVar.v();
        }
    }

    public void setChipMinHeightResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            float dimension = fVar.f20802j1.getResources().getDimension(i10);
            if (fVar.f20766E0 != dimension) {
                fVar.f20766E0 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipStartPadding(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null && fVar.b1 != f6) {
            fVar.b1 = f6;
            fVar.invalidateSelf();
            fVar.v();
        }
    }

    public void setChipStartPaddingResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            float dimension = fVar.f20802j1.getResources().getDimension(i10);
            if (fVar.b1 != dimension) {
                fVar.b1 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.G(AbstractC5042g.b(fVar.f20802j1, i10));
        }
    }

    public void setChipStrokeWidth(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.H(f6);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.H(fVar.f20802j1.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.I(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        B1.c cVar;
        f fVar = this.f27106l0;
        if (fVar != null && fVar.f20789U0 != charSequence) {
            String str = B1.c.f1712d;
            Locale locale = Locale.getDefault();
            int i10 = q.f1731a;
            if (p.a(locale) == 1) {
                cVar = B1.c.f1715g;
            } else {
                cVar = B1.c.f1714f;
            }
            fVar.f20789U0 = cVar.c(charSequence, cVar.f1718c);
            fVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.J(f6);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.J(fVar.f20802j1.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.I(m.u(fVar.f20802j1, i10));
        }
        e();
    }

    public void setCloseIconSize(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.K(f6);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.K(fVar.f20802j1.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.L(f6);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.L(fVar.f20802j1.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.M(AbstractC5042g.b(fVar.f20802j1, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // q.C5235t, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // q.C5235t, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            if (i12 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 == 0) {
            if (i12 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.j(f6);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f27106l0 == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            f fVar = this.f27106l0;
            if (fVar != null) {
                fVar.f20773H1 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f27115u0 = z10;
        b(this.f27117w0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            AbstractC3612c.r("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(P7.b bVar) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.f20795a1 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.f20795a1 = P7.b.a(fVar.f20802j1, i10);
        }
    }

    public void setIconEndPadding(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.O(f6);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.O(fVar.f20802j1.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.P(f6);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.P(fVar.f20802j1.getResources().getDimension(i10));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f27106l0 == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.f20777J1 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f27110p0 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f27109o0 = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.Q(colorStateList);
        }
        if (!this.f27106l0.f20767E1) {
            f();
        }
    }

    public void setRippleColorResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.Q(AbstractC5042g.b(fVar.f20802j1, i10));
            if (!this.f27106l0.f20767E1) {
                f();
            }
        }
    }

    @Override // f8.u
    public void setShapeAppearanceModel(j jVar) {
        this.f27106l0.setShapeAppearanceModel(jVar);
    }

    public void setShowMotionSpec(P7.b bVar) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.f20794Z0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.f20794Z0 = P7.b.a(fVar.f20802j1, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        f fVar = this.f27106l0;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (fVar.f20775I1) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        f fVar2 = this.f27106l0;
        if (fVar2 != null && !TextUtils.equals(fVar2.f20776J0, charSequence)) {
            fVar2.f20776J0 = charSequence;
            fVar2.f20808p1.f24008d = true;
            fVar2.invalidateSelf();
            fVar2.v();
        }
    }

    public void setTextAppearance(C2306c c2306c) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.R(c2306c);
        }
        h();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null && fVar.f20799f1 != f6) {
            fVar.f20799f1 = f6;
            fVar.invalidateSelf();
            fVar.v();
        }
    }

    public void setTextEndPaddingResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            float dimension = fVar.f20802j1.getResources().getDimension(i10);
            if (fVar.f20799f1 != dimension) {
                fVar.f20799f1 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f6) {
        super.setTextSize(i10, f6);
        f fVar = this.f27106l0;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i10, f6, getResources().getDisplayMetrics());
            i iVar = fVar.f20808p1;
            C2306c c2306c = iVar.f24010f;
            if (c2306c != null) {
                c2306c.f26362k = applyDimension;
                iVar.f24005a.setTextSize(applyDimension);
                fVar.v();
                fVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f6) {
        f fVar = this.f27106l0;
        if (fVar != null && fVar.f20798e1 != f6) {
            fVar.f20798e1 = f6;
            fVar.invalidateSelf();
            fVar.v();
        }
    }

    public void setTextStartPaddingResource(int i10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            float dimension = fVar.f20802j1.getResources().getDimension(i10);
            if (fVar.f20798e1 != dimension) {
                fVar.f20798e1 = dimension;
                fVar.invalidateSelf();
                fVar.v();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.N(z10);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.A(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.F(z10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.R(new C2306c(fVar.f20802j1, i10));
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        f fVar = this.f27106l0;
        if (fVar != null) {
            fVar.R(new C2306c(fVar.f20802j1, i10));
        }
        h();
    }

    public void setInternalOnCheckedChangeListener(a8.e eVar) {
    }
}
