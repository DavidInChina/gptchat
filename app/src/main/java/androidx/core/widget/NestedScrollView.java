package androidx.core.widget;

import D1.AbstractC0372s;
import D1.C0343c;
import D1.C0371q;
import D1.C0373t;
import D1.H;
import D1.N;
import D1.Z;
import H1.e;
import H1.i;
import H1.j;
import H1.k;
import H1.l;
import U3.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C4527g;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements AbstractC0372s, ScrollingView {

    /* renamed from: I0  reason: collision with root package name */
    public static final float f24928I0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: J0  reason: collision with root package name */
    public static final i f24929J0 = new C0343c();

    /* renamed from: K0  reason: collision with root package name */
    public static final int[] f24930K0 = {16843130};

    /* renamed from: B0  reason: collision with root package name */
    public int f24932B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f24933C0;

    /* renamed from: D0  reason: collision with root package name */
    public l f24934D0;

    /* renamed from: E0  reason: collision with root package name */
    public final C0373t f24935E0;

    /* renamed from: F0  reason: collision with root package name */
    public final C0371q f24936F0;

    /* renamed from: G0  reason: collision with root package name */
    public float f24937G0;

    /* renamed from: H0  reason: collision with root package name */
    public k f24938H0;

    /* renamed from: h0  reason: collision with root package name */
    public final float f24939h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f24940i0;

    /* renamed from: k0  reason: collision with root package name */
    public final OverScroller f24942k0;

    /* renamed from: l0  reason: collision with root package name */
    public final EdgeEffect f24943l0;

    /* renamed from: m0  reason: collision with root package name */
    public final EdgeEffect f24944m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f24945n0;

    /* renamed from: s0  reason: collision with root package name */
    public VelocityTracker f24950s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f24951t0;

    /* renamed from: v0  reason: collision with root package name */
    public final int f24953v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int f24954w0;

    /* renamed from: x0  reason: collision with root package name */
    public final int f24955x0;

    /* renamed from: j0  reason: collision with root package name */
    public final Rect f24941j0 = new Rect();

    /* renamed from: o0  reason: collision with root package name */
    public boolean f24946o0 = true;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f24947p0 = false;

    /* renamed from: q0  reason: collision with root package name */
    public View f24948q0 = null;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f24949r0 = false;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f24952u0 = true;

    /* renamed from: y0  reason: collision with root package name */
    public int f24956y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    public final int[] f24957z0 = new int[2];

    /* renamed from: A0  reason: collision with root package name */
    public final int[] f24931A0 = new int[2];

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, D1.t] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            edgeEffect = e.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f24943l0 = edgeEffect;
        if (i10 >= 31) {
            edgeEffect2 = e.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f24944m0 = edgeEffect2;
        this.f24939h0 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f24942k0 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f24953v0 = viewConfiguration.getScaledTouchSlop();
        this.f24954w0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f24955x0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24930K0, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f24935E0 = new Object();
        this.f24936F0 = new C0371q(this);
        setNestedScrollingEnabled(true);
        Z.l(this, f24929J0);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f24937G0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f24937G0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f24937G0;
    }

    public static boolean l(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && l((View) parent, view2)) {
            return true;
        }
        return false;
    }

    public final boolean a(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f24941j0;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(b(rect), 0, 1, true);
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && (!m(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final int b(Rect rect) {
        int i10;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i10 = i13 - verticalFadingEdgeLength;
        } else {
            i10 = i13;
        }
        int i14 = rect.bottom;
        if (i14 > i10 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i10;
            }
            return Math.min(i12, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        } else if (rect.top >= scrollY || i14 >= i10) {
            return 0;
        } else {
            if (rect.height() > height) {
                i11 = 0 - (i10 - rect.bottom);
            } else {
                i11 = 0 - (scrollY - rect.top);
            }
            return Math.max(i11, -getScrollY());
        }
    }

    @Override // D1.AbstractC0372s
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(i13, i14, iArr);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int i10;
        int round;
        if (this.f24942k0.isFinished()) {
            return;
        }
        this.f24942k0.computeScrollOffset();
        int currY = this.f24942k0.getCurrY();
        int i11 = currY - this.f24933C0;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f24944m0;
        EdgeEffect edgeEffect2 = this.f24943l0;
        if (i11 > 0 && AbstractC5260f.u(edgeEffect2) != 0.0f) {
            round = Math.round(AbstractC5260f.H(edgeEffect2, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (round != i11) {
                edgeEffect2.finish();
            }
        } else {
            if (i11 < 0 && AbstractC5260f.u(edgeEffect) != 0.0f) {
                float f6 = height;
                round = Math.round(AbstractC5260f.H(edgeEffect, (i11 * 4.0f) / f6, 0.5f) * (f6 / 4.0f));
                if (round != i11) {
                    edgeEffect.finish();
                }
            }
            this.f24933C0 = currY;
            int[] iArr = this.f24931A0;
            iArr[1] = 0;
            this.f24936F0.c(0, i11, 1, iArr, null);
            i10 = i11 - iArr[1];
            int scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                p(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i10 - scrollY2;
                iArr[1] = 0;
                this.f24936F0.e(0, scrollY2, 0, i12, this.f24957z0, 1, iArr);
                i10 = i12 - iArr[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f24942k0.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f24942k0.getCurrVelocity());
                    }
                }
                this.f24942k0.abortAnimation();
                w(1);
            }
            if (this.f24942k0.isFinished()) {
                WeakHashMap weakHashMap = Z.f3247a;
                H.k(this);
                return;
            }
            w(1);
            return;
        }
        i11 -= round;
        this.f24933C0 = currY;
        int[] iArr2 = this.f24931A0;
        iArr2[1] = 0;
        this.f24936F0.c(0, i11, 1, iArr2, null);
        i10 = i11 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i10 != 0) {
        }
        if (i10 != 0) {
        }
        if (this.f24942k0.isFinished()) {
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // D1.r
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        n(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !i(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f10, boolean z10) {
        return this.f24936F0.a(f6, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f10) {
        return this.f24936F0.b(f6, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f24936F0.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f24936F0.e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f24943l0;
        int i11 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (j.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft();
            } else {
                i10 = 0;
            }
            if (j.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = Z.f3247a;
                H.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f24944m0;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (j.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = getPaddingLeft();
            }
            if (j.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i11 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap weakHashMap2 = Z.f3247a;
                H.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // D1.r
    public final boolean e(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // D1.r
    public final void f(View view, View view2, int i10, int i11) {
        C0373t c0373t = this.f24935E0;
        if (i11 == 1) {
            c0373t.f3303b = i10;
        } else {
            c0373t.f3302a = i10;
        }
        this.f24936F0.h(2, i11);
    }

    @Override // D1.r
    public final void g(View view, int i10) {
        C0373t c0373t = this.f24935E0;
        if (i10 == 1) {
            c0373t.f3303b = 0;
        } else {
            c0373t.f3302a = 0;
        }
        w(i10);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0373t c0373t = this.f24935E0;
        return c0373t.f3303b | c0373t.f3302a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // D1.r
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        this.f24936F0.c(i10, i11, i12, iArr, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f24936F0.g(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f24941j0.setEmpty();
        int i10 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19) {
                    if (keyCode != 20) {
                        if (keyCode != 62) {
                            if (keyCode != 92) {
                                if (keyCode != 93) {
                                    if (keyCode != 122) {
                                        if (keyCode != 123) {
                                            return false;
                                        }
                                        q(130);
                                        return false;
                                    }
                                    q(33);
                                    return false;
                                }
                                return k(130);
                            }
                            return k(33);
                        }
                        if (keyEvent.isShiftPressed()) {
                            i10 = 33;
                        }
                        q(i10);
                        return false;
                    } else if (keyEvent.isAltPressed()) {
                        return k(130);
                    } else {
                        return a(130);
                    }
                } else if (keyEvent.isAltPressed()) {
                    return k(33);
                } else {
                    return a(33);
                }
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f24936F0.f3291d;
    }

    public final void j(int i10) {
        if (getChildCount() > 0) {
            this.f24942k0.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f24936F0.h(2, 1);
            this.f24933C0 = getScrollY();
            WeakHashMap weakHashMap = Z.f3247a;
            H.k(this);
        }
    }

    public final boolean k(int i10) {
        boolean z10;
        int childCount;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.f24941j0;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i10, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i10, int i11) {
        Rect rect = this.f24941j0;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f24936F0.d(scrollY2, i10 - scrollY2, i11, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f24956y0) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f24945n0 = (int) motionEvent.getY(i10);
            this.f24956y0 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f24950s0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24947p0 = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        float f6;
        boolean z11 = false;
        if (motionEvent.getAction() == 8 && !this.f24949r0) {
            if ((motionEvent.getSource() & 2) == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f6 = motionEvent.getAxisValue(9);
                i10 = (int) motionEvent.getX();
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                f6 = motionEvent.getAxisValue(26);
                i10 = getWidth() / 2;
            } else {
                i10 = 0;
                f6 = 0.0f;
            }
            if (f6 != 0.0f) {
                int verticalScrollFactorCompat = (int) (f6 * getVerticalScrollFactorCompat());
                if ((motionEvent.getSource() & 8194) == 8194) {
                    z11 = true;
                }
                s(-verticalScrollFactorCompat, i10, 1, z11);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f24949r0) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6) {
                            o(motionEvent);
                        }
                    }
                } else {
                    int i11 = this.f24956y0;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            AbstractC3612c.c("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f24945n0) > this.f24953v0 && (2 & getNestedScrollAxes()) == 0) {
                                this.f24949r0 = true;
                                this.f24945n0 = y10;
                                if (this.f24950s0 == null) {
                                    this.f24950s0 = VelocityTracker.obtain();
                                }
                                this.f24950s0.addMovement(motionEvent);
                                this.f24932B0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f24949r0 = false;
            this.f24956y0 = -1;
            VelocityTracker velocityTracker = this.f24950s0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f24950s0 = null;
            }
            if (this.f24942k0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap = Z.f3247a;
                H.k(this);
            }
            w(0);
        } else {
            int y11 = (int) motionEvent.getY();
            int x10 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y11 >= childAt.getTop() - scrollY && y11 < childAt.getBottom() - scrollY && x10 >= childAt.getLeft() && x10 < childAt.getRight()) {
                    this.f24945n0 = y11;
                    this.f24956y0 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f24950s0;
                    if (velocityTracker2 == null) {
                        this.f24950s0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f24950s0.addMovement(motionEvent);
                    this.f24942k0.computeScrollOffset();
                    if (!v(motionEvent) && this.f24942k0.isFinished()) {
                        z10 = false;
                    }
                    this.f24949r0 = z10;
                    this.f24936F0.h(2, 0);
                }
            }
            if (!v(motionEvent) && this.f24942k0.isFinished()) {
                z10 = false;
            }
            this.f24949r0 = z10;
            VelocityTracker velocityTracker3 = this.f24950s0;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f24950s0 = null;
            }
        }
        return this.f24949r0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = 0;
        this.f24946o0 = false;
        View view = this.f24948q0;
        if (view != null && l(view, this)) {
            View view2 = this.f24948q0;
            Rect rect = this.f24941j0;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        }
        this.f24948q0 = null;
        if (!this.f24947p0) {
            if (this.f24934D0 != null) {
                scrollTo(getScrollX(), this.f24934D0.f7180Y);
                this.f24934D0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f24947p0 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f24951t0 && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f10, boolean z10) {
        if (!z10) {
            dispatchNestedFling(0.0f, f10, true);
            j((int) f10);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f10) {
        return this.f24936F0.b(f6, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        this.f24936F0.c(i10, i11, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View view;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i10);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (view == null || (true ^ m(view, 0, getHeight()))) {
            return false;
        }
        return view.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f24934D0 = lVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, H1.l] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f7180Y = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        k kVar = this.f24938H0;
        if (kVar != null) {
            u uVar = (u) kVar;
            C4527g.a(this, (View) uVar.f17492Z, (View) uVar.f17493h0);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m(findFocus, 0, i13)) {
            Rect rect = this.f24941j0;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                if (this.f24952u0) {
                    u(0, b10, false);
                } else {
                    scrollBy(0, b10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return e(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        g(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f24950s0 == null) {
            this.f24950s0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f24932B0 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f6 = 0.0f;
        obtain.offsetLocation(0.0f, this.f24932B0);
        C0371q c0371q = this.f24936F0;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f24944m0;
            EdgeEffect edgeEffect2 = this.f24943l0;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                o(motionEvent);
                                this.f24945n0 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f24956y0));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f24945n0 = (int) motionEvent.getY(actionIndex);
                            this.f24956y0 = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f24949r0 && getChildCount() > 0 && this.f24942k0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            WeakHashMap weakHashMap = Z.f3247a;
                            H.k(this);
                        }
                        this.f24956y0 = -1;
                        this.f24949r0 = false;
                        VelocityTracker velocityTracker = this.f24950s0;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f24950s0 = null;
                        }
                        w(0);
                        this.f24943l0.onRelease();
                        this.f24944m0.onRelease();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f24956y0);
                    if (findPointerIndex == -1) {
                        AbstractC3612c.c("NestedScrollView", "Invalid pointerId=" + this.f24956y0 + " in onTouchEvent");
                    } else {
                        int y10 = (int) motionEvent.getY(findPointerIndex);
                        int i10 = this.f24945n0 - y10;
                        float x10 = motionEvent.getX(findPointerIndex) / getWidth();
                        float height = i10 / getHeight();
                        if (AbstractC5260f.u(edgeEffect2) != 0.0f) {
                            float f10 = -AbstractC5260f.H(edgeEffect2, -height, x10);
                            if (AbstractC5260f.u(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                            f6 = f10;
                        } else if (AbstractC5260f.u(edgeEffect) != 0.0f) {
                            float H6 = AbstractC5260f.H(edgeEffect, height, 1.0f - x10);
                            if (AbstractC5260f.u(edgeEffect) == 0.0f) {
                                edgeEffect.onRelease();
                            }
                            f6 = H6;
                        }
                        int round = Math.round(f6 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i11 = i10 - round;
                        if (!this.f24949r0 && Math.abs(i11) > this.f24953v0) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f24949r0 = true;
                            i11 = i11 > 0 ? i11 - this.f24953v0 : i11 + this.f24953v0;
                        }
                        if (this.f24949r0) {
                            int s10 = s(i11, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f24945n0 = y10 - s10;
                            this.f24932B0 += s10;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.f24950s0;
                velocityTracker2.computeCurrentVelocity(1000, this.f24955x0);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.f24956y0);
                if (Math.abs(yVelocity) >= this.f24954w0) {
                    if (AbstractC5260f.u(edgeEffect2) != 0.0f) {
                        if (t(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (AbstractC5260f.u(edgeEffect) != 0.0f) {
                        int i12 = -yVelocity;
                        if (t(edgeEffect, i12)) {
                            edgeEffect.onAbsorb(i12);
                        } else {
                            j(i12);
                        }
                    } else {
                        int i13 = -yVelocity;
                        float f11 = i13;
                        if (!c0371q.b(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            j(i13);
                        }
                    }
                } else if (this.f24942k0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap weakHashMap2 = Z.f3247a;
                    H.k(this);
                }
                this.f24956y0 = -1;
                this.f24949r0 = false;
                VelocityTracker velocityTracker3 = this.f24950s0;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f24950s0 = null;
                }
                w(0);
                this.f24943l0.onRelease();
                this.f24944m0.onRelease();
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f24949r0 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f24942k0.isFinished()) {
                this.f24942k0.abortAnimation();
                w(1);
            }
            int pointerId = motionEvent.getPointerId(0);
            this.f24945n0 = (int) motionEvent.getY();
            this.f24956y0 = pointerId;
            c0371q.h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f24950s0;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i14 = i12 + i10;
        if (i11 > 0 || i11 < 0) {
            i11 = 0;
            z10 = true;
        } else {
            z10 = false;
        }
        if (i14 <= i13) {
            if (i14 < 0) {
                i13 = 0;
            } else {
                i13 = i14;
                z11 = false;
                if (z11 && !this.f24936F0.g(1)) {
                    this.f24942k0.springBack(i11, i13, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i11, i13);
                if (z10 && !z11) {
                    return false;
                }
            }
        }
        z11 = true;
        if (z11) {
            this.f24942k0.springBack(i11, i13, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i11, i13);
        return z10 ? true : true;
    }

    public final void q(int i10) {
        boolean z10;
        if (i10 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.f24941j0;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        r(i10, i11, i12);
    }

    public final boolean r(int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        int i13;
        boolean z12;
        boolean z13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        if (i10 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = focusables.get(i15);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                if (i11 < top && bottom < i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (view == null) {
                    view = view2;
                    z14 = z12;
                } else {
                    if ((z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z14) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z14 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 >= scrollY && i12 <= i14) {
            z11 = false;
        } else {
            if (z10) {
                i13 = i11 - scrollY;
            } else {
                i13 = i12 - i14;
            }
            s(i13, 0, 1, true);
            z11 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f24946o0) {
            Rect rect = this.f24941j0;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b10 = b(rect);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        } else {
            this.f24948q0 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        boolean z11;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b10 = b(rect);
        if (b10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, b10);
            } else {
                u(0, b10, false);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f24950s0) != null) {
            velocityTracker.recycle();
            this.f24950s0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f24946o0 = true;
        super.requestLayout();
    }

    public final int s(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        C0371q c0371q = this.f24936F0;
        if (i12 == 1) {
            c0371q.h(2, i12);
        }
        boolean c10 = this.f24936F0.c(0, i10, i12, this.f24931A0, this.f24957z0);
        int[] iArr = this.f24931A0;
        int[] iArr2 = this.f24957z0;
        if (c10) {
            i14 = i10 - iArr[1];
            i13 = iArr2[1];
        } else {
            i14 = i10;
            i13 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (p(i14, 0, scrollY, scrollRange) && !c0371q.g(i12)) {
            z12 = true;
        } else {
            z12 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f24936F0.e(0, scrollY2, 0, i14 - scrollY2, this.f24957z0, i12, iArr);
        int i15 = i13 + iArr2[1];
        int i16 = i14 - iArr[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f24944m0;
        EdgeEffect edgeEffect2 = this.f24943l0;
        if (i17 < 0) {
            if (z11) {
                AbstractC5260f.H(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z11) {
            AbstractC5260f.H(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            if (z12 && i12 == 0) {
                this.f24950s0.clear();
            }
        } else {
            WeakHashMap weakHashMap = Z.f3247a;
            H.k(this);
        }
        if (i12 == 1) {
            w(i12);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i15;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i10 >= 0) {
                if (width + i10 > width2) {
                    i10 = width2 - width;
                }
            } else {
                i10 = 0;
            }
            if (height < height2 && i11 >= 0) {
                if (height + i11 > height2) {
                    i11 = height2 - height;
                }
            } else {
                i11 = 0;
            }
            if (i10 != getScrollX() || i11 != getScrollY()) {
                super.scrollTo(i10, i11);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f24951t0) {
            this.f24951t0 = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C0371q c0371q = this.f24936F0;
        if (c0371q.f3291d) {
            WeakHashMap weakHashMap = Z.f3247a;
            N.z(c0371q.f3290c);
        }
        c0371q.f3291d = z10;
    }

    public void setOnScrollChangeListener(k kVar) {
        this.f24938H0 = kVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f24952u0 = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f24936F0.h(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float u10 = AbstractC5260f.u(edgeEffect) * getHeight();
        float f6 = this.f24939h0 * 0.015f;
        double log = Math.log((Math.abs(-i10) * 0.35f) / f6);
        double d10 = f24928I0;
        if (((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * f6)) < u10) {
            return true;
        }
        return false;
    }

    public final void u(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f24940i0 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f24942k0;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
            if (z10) {
                this.f24936F0.h(2, 1);
            } else {
                w(1);
            }
            this.f24933C0 = getScrollY();
            WeakHashMap weakHashMap = Z.f3247a;
            H.k(this);
        } else {
            if (!this.f24942k0.isFinished()) {
                this.f24942k0.abortAnimation();
                w(1);
            }
            scrollBy(i10, i11);
        }
        this.f24940i0 = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f24943l0;
        if (AbstractC5260f.u(edgeEffect) != 0.0f) {
            AbstractC5260f.H(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f24944m0;
        if (AbstractC5260f.u(edgeEffect2) != 0.0f) {
            AbstractC5260f.H(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    public final void w(int i10) {
        this.f24936F0.i(i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
