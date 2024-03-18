package androidx.coordinatorlayout.widget;

import C.b;
import C1.d;
import D1.AbstractC0361l;
import D1.AbstractC0372s;
import D1.C0373t;
import D1.H;
import D1.I;
import D1.J0;
import D1.K;
import D1.L;
import D1.N;
import D1.Z;
import D1.r;
import G0.C0588q;
import U3.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.openai.chatgpt.R;
import h1.C3299f;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import l1.AbstractC4329a;
import m1.AbstractC4544a;
import m1.AbstractC4545b;
import m1.AbstractC4550g;
import m1.C4547d;
import m1.C4549f;
import m1.ViewGroup$OnHierarchyChangeListenerC4546c;
import m1.ViewTreeObserver$OnPreDrawListenerC4548e;
import p1.AbstractC5038c;
import p1.AbstractC5042g;
import t1.AbstractC5657c;
import w.C6049A;

/* loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements r, AbstractC0372s {

    /* renamed from: A0  reason: collision with root package name */
    public static final String f24885A0;

    /* renamed from: B0  reason: collision with root package name */
    public static final Class[] f24886B0;

    /* renamed from: C0  reason: collision with root package name */
    public static final ThreadLocal f24887C0;

    /* renamed from: D0  reason: collision with root package name */
    public static final C0588q f24888D0;

    /* renamed from: E0  reason: collision with root package name */
    public static final d f24889E0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f24896n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f24897o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int[] f24898p0;

    /* renamed from: q0  reason: collision with root package name */
    public View f24899q0;

    /* renamed from: r0  reason: collision with root package name */
    public View f24900r0;

    /* renamed from: s0  reason: collision with root package name */
    public ViewTreeObserver$OnPreDrawListenerC4548e f24901s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f24902t0;

    /* renamed from: u0  reason: collision with root package name */
    public J0 f24903u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f24904v0;

    /* renamed from: w0  reason: collision with root package name */
    public Drawable f24905w0;

    /* renamed from: x0  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f24906x0;

    /* renamed from: y0  reason: collision with root package name */
    public b f24907y0;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f24890h0 = new ArrayList();

    /* renamed from: i0  reason: collision with root package name */
    public final i f24891i0 = new i(4);

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f24892j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayList f24893k0 = new ArrayList();

    /* renamed from: l0  reason: collision with root package name */
    public final int[] f24894l0 = new int[2];

    /* renamed from: m0  reason: collision with root package name */
    public final int[] f24895m0 = new int[2];

    /* renamed from: z0  reason: collision with root package name */
    public final C0373t f24908z0 = new Object();

    static {
        String str;
        Package r12 = CoordinatorLayout.class.getPackage();
        if (r12 != null) {
            str = r12.getName();
        } else {
            str = null;
        }
        f24885A0 = str;
        f24888D0 = new C0588q(2);
        f24886B0 = new Class[]{Context.class, AttributeSet.class};
        f24887C0 = new ThreadLocal();
        f24889E0 = new d();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, D1.t] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = AbstractC4329a.f37736a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f24898p0 = intArray;
            float f6 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr2 = this.f24898p0;
                iArr2[i10] = (int) (iArr2[i10] * f6);
            }
        }
        this.f24905w0 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC4546c(this));
        WeakHashMap weakHashMap = Z.f3247a;
        if (H.c(this) == 0) {
            H.s(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) f24889E0.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void l(int i10, Rect rect, Rect rect2, C4547d c4547d, int i11, int i12) {
        int i13;
        int i14;
        int i15 = c4547d.f38853c;
        if (i15 == 0) {
            i15 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i15, i10);
        int i16 = c4547d.f38854d;
        if ((i16 & 7) == 0) {
            i16 |= 8388611;
        }
        if ((i16 & 112) == 0) {
            i16 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i16, i10);
        int i17 = absoluteGravity & 7;
        int i18 = absoluteGravity & 112;
        int i19 = absoluteGravity2 & 7;
        int i20 = absoluteGravity2 & 112;
        if (i19 != 1) {
            if (i19 != 5) {
                i13 = rect.left;
            } else {
                i13 = rect.right;
            }
        } else {
            i13 = rect.left + (rect.width() / 2);
        }
        if (i20 != 16) {
            if (i20 != 80) {
                i14 = rect.top;
            } else {
                i14 = rect.bottom;
            }
        } else {
            i14 = rect.top + (rect.height() / 2);
        }
        if (i17 != 1) {
            if (i17 != 5) {
                i13 -= i11;
            }
        } else {
            i13 -= i11 / 2;
        }
        if (i18 != 16) {
            if (i18 != 80) {
                i14 -= i12;
            }
        } else {
            i14 -= i12 / 2;
        }
        rect2.set(i13, i14, i11 + i13, i12 + i14);
    }

    public static C4547d n(View view) {
        C4547d c4547d = (C4547d) view.getLayoutParams();
        if (!c4547d.f38852b) {
            AbstractC4545b abstractC4545b = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                abstractC4545b = (AbstractC4545b) cls.getAnnotation(AbstractC4545b.class);
                if (abstractC4545b != null) {
                    break;
                }
            }
            if (abstractC4545b != null) {
                try {
                    AbstractC4544a abstractC4544a = (AbstractC4544a) abstractC4545b.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    AbstractC4544a abstractC4544a2 = c4547d.f38851a;
                    if (abstractC4544a2 != abstractC4544a) {
                        if (abstractC4544a2 != null) {
                            abstractC4544a2.e();
                        }
                        c4547d.f38851a = abstractC4544a;
                        c4547d.f38852b = true;
                        if (abstractC4544a != null) {
                            abstractC4544a.c(c4547d);
                        }
                    }
                } catch (Exception e10) {
                    AbstractC3612c.d("CoordinatorLayout", "Default behavior class " + abstractC4545b.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            c4547d.f38852b = true;
        }
        return c4547d;
    }

    public static void u(View view, int i10) {
        C4547d c4547d = (C4547d) view.getLayoutParams();
        int i11 = c4547d.f38859i;
        if (i11 != i10) {
            WeakHashMap weakHashMap = Z.f3247a;
            view.offsetLeftAndRight(i10 - i11);
            c4547d.f38859i = i10;
        }
    }

    public static void v(View view, int i10) {
        C4547d c4547d = (C4547d) view.getLayoutParams();
        int i11 = c4547d.f38860j;
        if (i11 != i10) {
            WeakHashMap weakHashMap = Z.f3247a;
            view.offsetTopAndBottom(i10 - i11);
            c4547d.f38860j = i10;
        }
    }

    public final void b(C4547d c4547d, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c4547d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) c4547d).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c4547d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) c4547d).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    @Override // D1.AbstractC0372s
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        AbstractC4544a abstractC4544a;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                C4547d c4547d = (C4547d) childAt.getLayoutParams();
                if (c4547d.a(i14) && (abstractC4544a = c4547d.f38851a) != null) {
                    int[] iArr2 = this.f24894l0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC4544a.k(this, childAt, i11, i12, i13, iArr2);
                    if (i12 > 0) {
                        min = Math.max(i15, iArr2[0]);
                    } else {
                        min = Math.min(i15, iArr2[0]);
                    }
                    i15 = min;
                    if (i13 > 0) {
                        min2 = Math.max(i16, iArr2[1]);
                    } else {
                        min2 = Math.min(i16, iArr2[1]);
                    }
                    i16 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C4547d) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // D1.r
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        c(view, i10, i11, i12, i13, 0, this.f24895m0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        AbstractC4544a abstractC4544a = ((C4547d) view.getLayoutParams()).f38851a;
        if (abstractC4544a != null) {
            abstractC4544a.getClass();
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f24905w0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // D1.r
    public final boolean e(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C4547d c4547d = (C4547d) childAt.getLayoutParams();
                AbstractC4544a abstractC4544a = c4547d.f38851a;
                if (abstractC4544a != null) {
                    boolean o10 = abstractC4544a.o(childAt, i10, i11);
                    z10 |= o10;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            c4547d.f38865o = o10;
                        }
                    } else {
                        c4547d.f38864n = o10;
                    }
                } else if (i11 != 0) {
                    if (i11 == 1) {
                        c4547d.f38865o = false;
                    }
                } else {
                    c4547d.f38864n = false;
                }
            }
        }
        return z10;
    }

    @Override // D1.r
    public final void f(View view, View view2, int i10, int i11) {
        C0373t c0373t = this.f24908z0;
        if (i11 == 1) {
            c0373t.f3303b = i10;
        } else {
            c0373t.f3302a = i10;
        }
        this.f24900r0 = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((C4547d) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // D1.r
    public final void g(View view, int i10) {
        C0373t c0373t = this.f24908z0;
        if (i10 == 1) {
            c0373t.f3303b = 0;
        } else {
            c0373t.f3302a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C4547d c4547d = (C4547d) childAt.getLayoutParams();
            if (c4547d.a(i10)) {
                AbstractC4544a abstractC4544a = c4547d.f38851a;
                if (abstractC4544a != null) {
                    abstractC4544a.p(childAt, view, i10);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        c4547d.f38865o = false;
                    }
                } else {
                    c4547d.f38864n = false;
                }
                c4547d.getClass();
            }
        }
        this.f24900r0 = null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4547d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4547d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f24890h0);
    }

    public final J0 getLastWindowInsets() {
        return this.f24903u0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0373t c0373t = this.f24908z0;
        return c0373t.f3303b | c0373t.f3302a;
    }

    public Drawable getStatusBarBackground() {
        return this.f24905w0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // D1.r
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        AbstractC4544a abstractC4544a;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                C4547d c4547d = (C4547d) childAt.getLayoutParams();
                if (c4547d.a(i12) && (abstractC4544a = c4547d.f38851a) != null) {
                    int[] iArr2 = this.f24894l0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC4544a.j(this, childAt, view, i10, i11, iArr2, i12);
                    if (i10 > 0) {
                        min = Math.max(i13, iArr2[0]);
                    } else {
                        min = Math.min(i13, iArr2[0]);
                    }
                    i13 = min;
                    if (i11 > 0) {
                        min2 = Math.max(i14, iArr2[1]);
                    } else {
                        min2 = Math.min(i14, iArr2[1]);
                    }
                    i14 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            p(1);
        }
    }

    public final void i(View view, Rect rect, boolean z10) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                k(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList j(View view) {
        i iVar = this.f24891i0;
        int i10 = ((C6049A) iVar.f17415Z).f47560h0;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((C6049A) iVar.f17415Z).j(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((C6049A) iVar.f17415Z).g(i11));
            }
        }
        ArrayList arrayList3 = this.f24893k0;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC4550g.f38869a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC4550g.f38869a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC4550g.a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC4550g.f38870b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i10) {
        int[] iArr = this.f24898p0;
        if (iArr == null) {
            AbstractC3612c.c("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            AbstractC3612c.c("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
            return 0;
        }
    }

    public final boolean o(View view, int i10, int i11) {
        d dVar = f24889E0;
        Rect a5 = a();
        k(view, a5);
        try {
            return a5.contains(i10, i11);
        } finally {
            a5.setEmpty();
            dVar.b(a5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f24902t0) {
            if (this.f24901s0 == null) {
                this.f24901s0 = new ViewTreeObserver$OnPreDrawListenerC4548e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f24901s0);
        }
        if (this.f24903u0 == null) {
            WeakHashMap weakHashMap = Z.f3247a;
            if (H.b(this)) {
                L.c(this);
            }
        }
        this.f24897o0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f24902t0 && this.f24901s0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f24901s0);
        }
        View view = this.f24900r0;
        if (view != null) {
            g(view, 0);
        }
        this.f24897o0 = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (this.f24904v0 && this.f24905w0 != null) {
            J0 j02 = this.f24903u0;
            if (j02 != null) {
                i10 = j02.d();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f24905w0.setBounds(0, 0, getWidth(), i10);
                this.f24905w0.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r10 = r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            t(true);
        }
        return r10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        AbstractC4544a abstractC4544a;
        WeakHashMap weakHashMap = Z.f3247a;
        int d10 = I.d(this);
        ArrayList arrayList = this.f24890h0;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) arrayList.get(i14);
            if (view.getVisibility() != 8 && ((abstractC4544a = ((C4547d) view.getLayoutParams()).f38851a) == null || !abstractC4544a.g(this, view, d10))) {
                q(view, d10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
        if (r0.h(r30, r19, r25, r20, r26) == false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z13;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        AbstractC4544a abstractC4544a;
        int i22;
        int i23;
        int i24;
        s();
        int childCount = getChildCount();
        int i25 = 0;
        loop0: while (true) {
            if (i25 < childCount) {
                View childAt = getChildAt(i25);
                i iVar = this.f24891i0;
                int i26 = ((C6049A) iVar.f17415Z).f47560h0;
                for (int i27 = 0; i27 < i26; i27++) {
                    ArrayList arrayList2 = (ArrayList) ((C6049A) iVar.f17415Z).j(i27);
                    if (arrayList2 != null && arrayList2.contains(childAt)) {
                        z10 = true;
                        break loop0;
                    }
                }
                i25++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10 != this.f24902t0) {
            if (z10) {
                if (this.f24897o0) {
                    if (this.f24901s0 == null) {
                        this.f24901s0 = new ViewTreeObserver$OnPreDrawListenerC4548e(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f24901s0);
                }
                this.f24902t0 = true;
            } else {
                if (this.f24897o0 && this.f24901s0 != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f24901s0);
                }
                this.f24902t0 = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = Z.f3247a;
        int d10 = I.d(this);
        if (d10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i28 = paddingLeft + paddingRight;
        int i29 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (this.f24903u0 != null && H.b(this)) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList3 = this.f24890h0;
        int size3 = arrayList3.size();
        int i30 = suggestedMinimumWidth;
        int i31 = suggestedMinimumHeight;
        int i32 = 0;
        int i33 = 0;
        while (i33 < size3) {
            View view = (View) arrayList3.get(i33);
            int i34 = i32;
            if (view.getVisibility() == 8) {
                i12 = size3;
                arrayList = arrayList3;
                i15 = paddingLeft;
                i14 = paddingRight;
                i13 = d10;
                i32 = i34;
                z13 = false;
                i16 = i33;
            } else {
                C4547d c4547d = (C4547d) view.getLayoutParams();
                int i35 = c4547d.f38855e;
                if (i35 >= 0 && mode != 0) {
                    int m10 = m(i35);
                    i18 = i33;
                    int i36 = c4547d.f38853c;
                    if (i36 == 0) {
                        i36 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i36, d10) & 7;
                    i17 = i31;
                    if ((absoluteGravity == 3 && !z11) || (absoluteGravity == 5 && z11)) {
                        i19 = Math.max(0, (size - paddingRight) - m10);
                    } else if ((absoluteGravity == 5 && !z11) || (absoluteGravity == 3 && z11)) {
                        i19 = Math.max(0, m10 - paddingLeft);
                    }
                    if (!z12 && !H.b(view)) {
                        int c10 = this.f24903u0.c() + this.f24903u0.b();
                        int a5 = this.f24903u0.a() + this.f24903u0.d();
                        i21 = View.MeasureSpec.makeMeasureSpec(size - c10, mode);
                        i20 = View.MeasureSpec.makeMeasureSpec(size2 - a5, mode2);
                    } else {
                        i21 = i10;
                        i20 = i11;
                    }
                    abstractC4544a = c4547d.f38851a;
                    if (abstractC4544a == null) {
                        i16 = i18;
                        i14 = paddingRight;
                        i23 = i17;
                        z13 = false;
                        i15 = paddingLeft;
                        i24 = i34;
                        i13 = d10;
                        i22 = i30;
                        i12 = size3;
                        arrayList = arrayList3;
                    } else {
                        i12 = size3;
                        arrayList = arrayList3;
                        i14 = paddingRight;
                        i13 = d10;
                        i23 = i17;
                        i22 = i30;
                        i15 = paddingLeft;
                        i24 = i34;
                        i16 = i18;
                        z13 = false;
                    }
                    measureChildWithMargins(view, i21, i19, i20, 0);
                    int max = Math.max(i22, view.getMeasuredWidth() + i28 + ((ViewGroup.MarginLayoutParams) c4547d).leftMargin + ((ViewGroup.MarginLayoutParams) c4547d).rightMargin);
                    int max2 = Math.max(i23, view.getMeasuredHeight() + i29 + ((ViewGroup.MarginLayoutParams) c4547d).topMargin + ((ViewGroup.MarginLayoutParams) c4547d).bottomMargin);
                    i30 = max;
                    i32 = View.combineMeasuredStates(i24, view.getMeasuredState());
                    i31 = max2;
                } else {
                    i18 = i33;
                    i17 = i31;
                }
                i19 = 0;
                if (!z12) {
                }
                i21 = i10;
                i20 = i11;
                abstractC4544a = c4547d.f38851a;
                if (abstractC4544a == null) {
                }
                measureChildWithMargins(view, i21, i19, i20, 0);
                int max3 = Math.max(i22, view.getMeasuredWidth() + i28 + ((ViewGroup.MarginLayoutParams) c4547d).leftMargin + ((ViewGroup.MarginLayoutParams) c4547d).rightMargin);
                int max22 = Math.max(i23, view.getMeasuredHeight() + i29 + ((ViewGroup.MarginLayoutParams) c4547d).topMargin + ((ViewGroup.MarginLayoutParams) c4547d).bottomMargin);
                i30 = max3;
                i32 = View.combineMeasuredStates(i24, view.getMeasuredState());
                i31 = max22;
            }
            i33 = i16 + 1;
            paddingLeft = i15;
            paddingRight = i14;
            d10 = i13;
            size3 = i12;
            arrayList3 = arrayList;
        }
        int i37 = i32;
        setMeasuredDimension(View.resolveSizeAndState(i30, i10, (-16777216) & i37), View.resolveSizeAndState(i31, i11, i37 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f10, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C4547d c4547d = (C4547d) childAt.getLayoutParams();
                if (c4547d.a(0)) {
                    AbstractC4544a abstractC4544a = c4547d.f38851a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f10) {
        AbstractC4544a abstractC4544a;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C4547d c4547d = (C4547d) childAt.getLayoutParams();
                if (c4547d.a(0) && (abstractC4544a = c4547d.f38851a) != null) {
                    z10 |= abstractC4544a.i(view);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        h(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        d(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C4549f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4549f c4549f = (C4549f) parcelable;
        super.onRestoreInstanceState(c4549f.f9325Y);
        SparseArray sparseArray = c4549f.f38868h0;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC4544a abstractC4544a = n(childAt).f38851a;
            if (id2 != -1 && abstractC4544a != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                abstractC4544a.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, K1.b, m1.f] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n10;
        ?? bVar = new K1.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            AbstractC4544a abstractC4544a = ((C4547d) childAt.getLayoutParams()).f38851a;
            if (id2 != -1 && abstractC4544a != null && (n10 = abstractC4544a.n(childAt)) != null) {
                sparseArray.append(id2, n10);
            }
        }
        bVar.f38868h0 = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return e(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        g(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f24899q0 == null) {
            z11 = r(motionEvent, 1);
        } else {
            z11 = false;
        }
        AbstractC4544a abstractC4544a = ((C4547d) this.f24899q0.getLayoutParams()).f38851a;
        if (abstractC4544a != null) {
            z10 = abstractC4544a.q(this.f24899q0, motionEvent);
            motionEvent2 = null;
            if (this.f24899q0 != null) {
                z10 |= super.onTouchEvent(motionEvent);
            } else if (z11) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                t(false);
            }
            return z10;
        }
        z10 = false;
        motionEvent2 = null;
        if (this.f24899q0 != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        t(false);
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i10) {
        int i11;
        ArrayList arrayList;
        Rect rect;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        int width;
        int i14;
        int i15;
        int i16;
        int height;
        int i17;
        int i18;
        int i19;
        Rect rect2;
        C4547d c4547d;
        int i20;
        int i21;
        int i22;
        ArrayList arrayList2;
        View view;
        d dVar;
        int i23;
        boolean z12;
        C4547d c4547d2;
        AbstractC4544a abstractC4544a;
        WeakHashMap weakHashMap = Z.f3247a;
        int d10 = I.d(this);
        ArrayList arrayList3 = this.f24890h0;
        int size = arrayList3.size();
        Rect a5 = a();
        Rect a10 = a();
        Rect a11 = a();
        int i24 = 0;
        while (true) {
            d dVar2 = f24889E0;
            if (i24 < size) {
                View view2 = (View) arrayList3.get(i24);
                C4547d c4547d3 = (C4547d) view2.getLayoutParams();
                if (i10 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i12 = size;
                    rect = a11;
                    i11 = i24;
                } else {
                    int i25 = 0;
                    while (i25 < i24) {
                        if (c4547d3.f38862l == ((View) arrayList3.get(i25))) {
                            C4547d c4547d4 = (C4547d) view2.getLayoutParams();
                            if (c4547d4.f38861k != null) {
                                Rect a12 = a();
                                Rect a13 = a();
                                arrayList2 = arrayList3;
                                Rect a14 = a();
                                i22 = i25;
                                k(c4547d4.f38861k, a12);
                                i(view2, a13, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                i21 = size;
                                int measuredHeight = view2.getMeasuredHeight();
                                i20 = i24;
                                c4547d = c4547d3;
                                view = view2;
                                rect2 = a11;
                                dVar = dVar2;
                                l(d10, a12, a14, c4547d4, measuredWidth, measuredHeight);
                                if (a14.left == a13.left && a14.top == a13.top) {
                                    c4547d2 = c4547d4;
                                    i23 = measuredWidth;
                                    z12 = false;
                                } else {
                                    c4547d2 = c4547d4;
                                    i23 = measuredWidth;
                                    z12 = true;
                                }
                                b(c4547d2, a14, i23, measuredHeight);
                                int i26 = a14.left - a13.left;
                                int i27 = a14.top - a13.top;
                                if (i26 != 0) {
                                    WeakHashMap weakHashMap2 = Z.f3247a;
                                    view.offsetLeftAndRight(i26);
                                }
                                if (i27 != 0) {
                                    WeakHashMap weakHashMap3 = Z.f3247a;
                                    view.offsetTopAndBottom(i27);
                                }
                                if (z12 && (abstractC4544a = c4547d2.f38851a) != null) {
                                    abstractC4544a.d(this, view, c4547d2.f38861k);
                                }
                                a12.setEmpty();
                                dVar.b(a12);
                                a13.setEmpty();
                                dVar.b(a13);
                                a14.setEmpty();
                                dVar.b(a14);
                                i25 = i22 + 1;
                                dVar2 = dVar;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i21;
                                i24 = i20;
                                c4547d3 = c4547d;
                                a11 = rect2;
                            }
                        }
                        i22 = i25;
                        c4547d = c4547d3;
                        arrayList2 = arrayList3;
                        i21 = size;
                        rect2 = a11;
                        i20 = i24;
                        view = view2;
                        dVar = dVar2;
                        i25 = i22 + 1;
                        dVar2 = dVar;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i21;
                        i24 = i20;
                        c4547d3 = c4547d;
                        a11 = rect2;
                    }
                    C4547d c4547d5 = c4547d3;
                    ArrayList arrayList4 = arrayList3;
                    int i28 = size;
                    Rect rect3 = a11;
                    i11 = i24;
                    View view3 = view2;
                    d dVar3 = dVar2;
                    i(view3, a10, true);
                    if (c4547d5.f38857g != 0 && !a10.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(c4547d5.f38857g, d10);
                        int i29 = absoluteGravity & 112;
                        if (i29 != 48) {
                            if (i29 == 80) {
                                a5.bottom = Math.max(a5.bottom, getHeight() - a10.top);
                            }
                        } else {
                            a5.top = Math.max(a5.top, a10.bottom);
                        }
                        int i30 = absoluteGravity & 7;
                        if (i30 != 3) {
                            if (i30 == 5) {
                                a5.right = Math.max(a5.right, getWidth() - a10.left);
                            }
                        } else {
                            a5.left = Math.max(a5.left, a10.right);
                        }
                    }
                    if (c4547d5.f38858h != 0 && view3.getVisibility() == 0) {
                        WeakHashMap weakHashMap4 = Z.f3247a;
                        if (K.c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                            C4547d c4547d6 = (C4547d) view3.getLayoutParams();
                            AbstractC4544a abstractC4544a2 = c4547d6.f38851a;
                            Rect a15 = a();
                            Rect a16 = a();
                            a16.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            if (abstractC4544a2 != null && abstractC4544a2.a(view3)) {
                                if (!a16.contains(a15)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a15.toShortString() + " | Bounds:" + a16.toShortString());
                                }
                            } else {
                                a15.set(a16);
                            }
                            a16.setEmpty();
                            dVar3.b(a16);
                            if (a15.isEmpty()) {
                                a15.setEmpty();
                                dVar3.b(a15);
                            } else {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(c4547d6.f38858h, d10);
                                if ((absoluteGravity2 & 48) == 48 && (i18 = (a15.top - ((ViewGroup.MarginLayoutParams) c4547d6).topMargin) - c4547d6.f38860j) < (i19 = a5.top)) {
                                    v(view3, i19 - i18);
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a15.bottom) - ((ViewGroup.MarginLayoutParams) c4547d6).bottomMargin) + c4547d6.f38860j) < (i17 = a5.bottom)) {
                                    v(view3, height - i17);
                                } else if (!z10) {
                                    v(view3, 0);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i15 = (a15.left - ((ViewGroup.MarginLayoutParams) c4547d6).leftMargin) - c4547d6.f38859i) < (i16 = a5.left)) {
                                    u(view3, i16 - i15);
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a15.right) - ((ViewGroup.MarginLayoutParams) c4547d6).rightMargin) + c4547d6.f38859i) < (i14 = a5.right)) {
                                    u(view3, width - i14);
                                } else if (!z11) {
                                    u(view3, 0);
                                }
                                a15.setEmpty();
                                dVar3.b(a15);
                                if (i10 == 2) {
                                    rect = rect3;
                                    rect.set(((C4547d) view3.getLayoutParams()).f38866p);
                                    if (rect.equals(a10)) {
                                        arrayList = arrayList4;
                                        i12 = i28;
                                    } else {
                                        ((C4547d) view3.getLayoutParams()).f38866p.set(a10);
                                    }
                                } else {
                                    rect = rect3;
                                }
                                i13 = i11 + 1;
                                i12 = i28;
                                while (true) {
                                    arrayList = arrayList4;
                                    if (i13 >= i12) {
                                        View view4 = (View) arrayList.get(i13);
                                        AbstractC4544a abstractC4544a3 = ((C4547d) view4.getLayoutParams()).f38851a;
                                        if (abstractC4544a3 != null) {
                                            abstractC4544a3.b(view4);
                                        }
                                        i13++;
                                        arrayList4 = arrayList;
                                    }
                                }
                            }
                        }
                    }
                    if (i10 == 2) {
                    }
                    i13 = i11 + 1;
                    i12 = i28;
                    while (true) {
                        arrayList = arrayList4;
                        if (i13 >= i12) {
                            break;
                        }
                        i13++;
                        arrayList4 = arrayList;
                    }
                }
                i24 = i11 + 1;
                size = i12;
                a11 = rect;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = a11;
                a5.setEmpty();
                dVar2.b(a5);
                a10.setEmpty();
                dVar2.b(a10);
                rect4.setEmpty();
                dVar2.b(rect4);
                return;
            }
        }
    }

    public final void q(View view, int i10) {
        Rect a5;
        Rect a10;
        int i11;
        C4547d c4547d = (C4547d) view.getLayoutParams();
        View view2 = c4547d.f38861k;
        if (view2 == null && c4547d.f38856f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = f24889E0;
        if (view2 != null) {
            a5 = a();
            a10 = a();
            try {
                k(view2, a5);
                C4547d c4547d2 = (C4547d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i10, a5, a10, c4547d2, measuredWidth, measuredHeight);
                b(c4547d2, a10, measuredWidth, measuredHeight);
                view.layout(a10.left, a10.top, a10.right, a10.bottom);
                return;
            } finally {
                a5.setEmpty();
                dVar.b(a5);
                a10.setEmpty();
                dVar.b(a10);
            }
        }
        int i12 = c4547d.f38855e;
        if (i12 >= 0) {
            C4547d c4547d3 = (C4547d) view.getLayoutParams();
            int i13 = c4547d3.f38853c;
            if (i13 == 0) {
                i13 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
            int i14 = absoluteGravity & 7;
            int i15 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i10 == 1) {
                i12 = width - i12;
            }
            int m10 = m(i12) - measuredWidth2;
            if (i14 != 1) {
                if (i14 == 5) {
                    m10 += measuredWidth2;
                }
            } else {
                m10 += measuredWidth2 / 2;
            }
            if (i15 != 16) {
                if (i15 != 80) {
                    i11 = 0;
                } else {
                    i11 = measuredHeight2;
                }
            } else {
                i11 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c4547d3).leftMargin, Math.min(m10, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c4547d3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c4547d3).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c4547d3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        C4547d c4547d4 = (C4547d) view.getLayoutParams();
        a5 = a();
        a5.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c4547d4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c4547d4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c4547d4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c4547d4).bottomMargin);
        if (this.f24903u0 != null) {
            WeakHashMap weakHashMap = Z.f3247a;
            if (H.b(this) && !H.b(view)) {
                a5.left = this.f24903u0.b() + a5.left;
                a5.top = this.f24903u0.d() + a5.top;
                a5.right -= this.f24903u0.c();
                a5.bottom -= this.f24903u0.a();
            }
        }
        a10 = a();
        int i16 = c4547d4.f38853c;
        if ((i16 & 7) == 0) {
            i16 |= 8388611;
        }
        if ((i16 & 112) == 0) {
            i16 |= 48;
        }
        AbstractC0361l.b(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), a5, a10, i10);
        view.layout(a10.left, a10.top, a10.right, a10.bottom);
    }

    public final boolean r(MotionEvent motionEvent, int i10) {
        boolean z10;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f24892j0;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i12);
            } else {
                i11 = i12;
            }
            arrayList.add(getChildAt(i11));
        }
        C0588q c0588q = f24888D0;
        if (c0588q != null) {
            Collections.sort(arrayList, c0588q);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            C4547d c4547d = (C4547d) view.getLayoutParams();
            AbstractC4544a abstractC4544a = c4547d.f38851a;
            if ((z11 || z12) && actionMasked != 0) {
                if (abstractC4544a != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 != 0) {
                        if (i10 == 1) {
                            abstractC4544a.q(view, motionEvent2);
                        }
                    } else {
                        abstractC4544a.f(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z11 && abstractC4544a != null) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z11 = abstractC4544a.q(view, motionEvent);
                        }
                    } else {
                        z11 = abstractC4544a.f(this, view, motionEvent);
                    }
                    if (z11) {
                        this.f24899q0 = view;
                    }
                }
                if (c4547d.f38851a == null) {
                    c4547d.f38863m = false;
                }
                boolean z13 = c4547d.f38863m;
                if (z13) {
                    z10 = true;
                } else {
                    c4547d.f38863m = z13;
                    z10 = z13;
                }
                if (z10 && !z13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z10 && !z12) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        AbstractC4544a abstractC4544a = ((C4547d) view.getLayoutParams()).f38851a;
        if (abstractC4544a != null) {
            abstractC4544a.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f24896n0) {
            t(false);
            this.f24896n0 = true;
        }
    }

    public final void s() {
        ArrayList arrayList = this.f24890h0;
        arrayList.clear();
        i iVar = this.f24891i0;
        int i10 = ((C6049A) iVar.f17415Z).f47560h0;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((C6049A) iVar.f17415Z).j(i11);
            if (arrayList2 != null) {
                arrayList2.clear();
                ((C3299f) iVar.f17414Y).b(arrayList2);
            }
        }
        ((C6049A) iVar.f17415Z).clear();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            C4547d n10 = n(childAt);
            int i13 = n10.f38856f;
            if (i13 == -1) {
                n10.f38862l = null;
                n10.f38861k = null;
            } else {
                View view = n10.f38861k;
                if (view != null && view.getId() == i13) {
                    View view2 = n10.f38861k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent != null && parent != childAt) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                        } else {
                            n10.f38862l = null;
                            n10.f38861k = null;
                        }
                    }
                    n10.f38862l = view2;
                }
                View findViewById = findViewById(i13);
                n10.f38861k = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            n10.f38862l = null;
                            n10.f38861k = null;
                        } else {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt) {
                                if (isInEditMode()) {
                                    n10.f38862l = null;
                                    n10.f38861k = null;
                                } else {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = (View) parent2;
                                }
                            }
                        }
                        n10.f38862l = findViewById;
                    }
                } else if (isInEditMode()) {
                    n10.f38862l = null;
                    n10.f38861k = null;
                } else {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i13) + " to anchor view " + childAt);
                }
            }
            if (!((C6049A) iVar.f17415Z).containsKey(childAt)) {
                ((C6049A) iVar.f17415Z).put(childAt, null);
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                if (i14 != i12) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 != n10.f38862l) {
                        WeakHashMap weakHashMap = Z.f3247a;
                        int d10 = I.d(this);
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C4547d) childAt2.getLayoutParams()).f38857g, d10);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(n10.f38858h, d10) & absoluteGravity) != absoluteGravity) {
                            AbstractC4544a abstractC4544a = n10.f38851a;
                            if (abstractC4544a != null) {
                                abstractC4544a.b(childAt);
                            }
                        }
                    }
                    if (!((C6049A) iVar.f17415Z).containsKey(childAt2) && !((C6049A) iVar.f17415Z).containsKey(childAt2)) {
                        ((C6049A) iVar.f17415Z).put(childAt2, null);
                    }
                    if (((C6049A) iVar.f17415Z).containsKey(childAt2) && ((C6049A) iVar.f17415Z).containsKey(childAt)) {
                        ArrayList arrayList3 = (ArrayList) ((C6049A) iVar.f17415Z).get(childAt2);
                        if (arrayList3 == null) {
                            arrayList3 = (ArrayList) ((C3299f) iVar.f17414Y).a();
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            ((C6049A) iVar.f17415Z).put(childAt2, arrayList3);
                        }
                        arrayList3.add(childAt);
                    } else {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                }
            }
        }
        ((ArrayList) iVar.f17416h0).clear();
        ((HashSet) iVar.f17417i0).clear();
        int i15 = ((C6049A) iVar.f17415Z).f47560h0;
        for (int i16 = 0; i16 < i15; i16++) {
            iVar.r(((C6049A) iVar.f17415Z).g(i16), (ArrayList) iVar.f17416h0, (HashSet) iVar.f17417i0);
        }
        arrayList.addAll((ArrayList) iVar.f17416h0);
        Collections.reverse(arrayList);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f24906x0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f24905w0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f24905w0 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f24905w0.setState(getDrawableState());
                }
                Drawable drawable4 = this.f24905w0;
                WeakHashMap weakHashMap = Z.f3247a;
                AbstractC5657c.b(drawable4, I.d(this));
                Drawable drawable5 = this.f24905w0;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f24905w0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = Z.f3247a;
            H.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = AbstractC5042g.f41723a;
            drawable = AbstractC5038c.b(context, i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f24905w0;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f24905w0.setVisible(z10, false);
        }
    }

    public final void t(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC4544a abstractC4544a = ((C4547d) childAt.getLayoutParams()).f38851a;
            if (abstractC4544a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    abstractC4544a.f(this, childAt, obtain);
                } else {
                    abstractC4544a.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((C4547d) getChildAt(i11).getLayoutParams()).f38863m = false;
        }
        this.f24899q0 = null;
        this.f24896n0 = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f24905w0) {
            return false;
        }
        return true;
    }

    public final void w() {
        WeakHashMap weakHashMap = Z.f3247a;
        if (H.b(this)) {
            if (this.f24907y0 == null) {
                this.f24907y0 = new b(1, this);
            }
            N.u(this, this.f24907y0);
            setSystemUiVisibility(1280);
            return;
        }
        N.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C4547d) {
            return new C4547d((C4547d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C4547d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C4547d(layoutParams);
    }
}
