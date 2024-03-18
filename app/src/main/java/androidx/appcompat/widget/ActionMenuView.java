package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import f8.e;
import p.B;
import p.E;
import p.m;
import p.n;
import p.o;
import p.q;
import q.AbstractC5224n;
import q.AbstractC5228p;
import q.C5212h;
import q.C5220l;
import q.C5222m;
import q.C5226o;
import q.E0;
import q.F0;
import q.G1;

/* loaded from: classes2.dex */
public class ActionMenuView extends F0 implements n, E {

    /* renamed from: A0  reason: collision with root package name */
    public C5222m f24505A0;

    /* renamed from: B0  reason: collision with root package name */
    public B f24506B0;

    /* renamed from: C0  reason: collision with root package name */
    public m f24507C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f24508D0;

    /* renamed from: E0  reason: collision with root package name */
    public int f24509E0;

    /* renamed from: F0  reason: collision with root package name */
    public final int f24510F0;

    /* renamed from: G0  reason: collision with root package name */
    public final int f24511G0;

    /* renamed from: H0  reason: collision with root package name */
    public AbstractC5228p f24512H0;

    /* renamed from: w0  reason: collision with root package name */
    public o f24513w0;

    /* renamed from: x0  reason: collision with root package name */
    public Context f24514x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f24515y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f24516z0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f24510F0 = (int) (56.0f * f6);
        this.f24511G0 = (int) (f6 * 4.0f);
        this.f24514x0 = context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q.o, android.widget.LinearLayout$LayoutParams] */
    public static C5226o l() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f43485a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [q.o, android.widget.LinearLayout$LayoutParams] */
    public static C5226o m(ViewGroup.LayoutParams layoutParams) {
        C5226o c5226o;
        if (layoutParams != null) {
            if (layoutParams instanceof C5226o) {
                C5226o c5226o2 = (C5226o) layoutParams;
                ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c5226o2);
                layoutParams2.f43485a = c5226o2.f43485a;
                c5226o = layoutParams2;
            } else {
                c5226o = new LinearLayout.LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c5226o).gravity <= 0) {
                ((LinearLayout.LayoutParams) c5226o).gravity = 16;
            }
            return c5226o;
        }
        return l();
    }

    @Override // p.n
    public final boolean a(q qVar) {
        return this.f24513w0.q(qVar, null, 0);
    }

    @Override // q.F0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5226o;
    }

    @Override // p.E
    public final void d(o oVar) {
        this.f24513w0 = oVar;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // q.F0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // q.F0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f24513w0 == null) {
            Context context = getContext();
            o oVar = new o(context);
            this.f24513w0 = oVar;
            oVar.f41609e = new F4.a(4, this);
            C5222m c5222m = new C5222m(context);
            this.f24505A0 = c5222m;
            c5222m.f43464q0 = true;
            c5222m.f43465r0 = true;
            B b10 = this.f24506B0;
            if (b10 == null) {
                b10 = new e(5);
            }
            c5222m.f43457j0 = b10;
            this.f24513w0.b(c5222m, this.f24514x0);
            C5222m c5222m2 = this.f24505A0;
            c5222m2.f43460m0 = this;
            this.f24513w0 = c5222m2.f43455h0;
        }
        return this.f24513w0;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C5222m c5222m = this.f24505A0;
        C5220l c5220l = c5222m.f43461n0;
        if (c5220l != null) {
            return c5220l.getDrawable();
        }
        if (c5222m.f43463p0) {
            return c5222m.f43462o0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f24515y0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // q.F0
    public final /* bridge */ /* synthetic */ E0 h() {
        return l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, q.E0] */
    @Override // q.F0
    public final E0 i(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // q.F0
    public final /* bridge */ /* synthetic */ E0 j(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof AbstractC5224n)) {
            z10 = ((AbstractC5224n) childAt).a();
        }
        if (i10 > 0 && (childAt2 instanceof AbstractC5224n)) {
            return z10 | ((AbstractC5224n) childAt2).c();
        }
        return z10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5222m c5222m = this.f24505A0;
        if (c5222m != null) {
            c5222m.g();
            if (this.f24505A0.h()) {
                this.f24505A0.f();
                this.f24505A0.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5222m c5222m = this.f24505A0;
        if (c5222m != null) {
            c5222m.f();
            C5212h c5212h = c5222m.f43472y0;
            if (c5212h != null && c5212h.b()) {
                c5212h.f41506j.dismiss();
            }
        }
    }

    @Override // q.F0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        if (!this.f24508D0) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i17 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i18 = i12 - i10;
        int paddingRight = (i18 - getPaddingRight()) - getPaddingLeft();
        boolean a5 = G1.a(this);
        int i19 = 0;
        int i20 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                C5226o c5226o = (C5226o) childAt.getLayoutParams();
                if (c5226o.f43485a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i21)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a5) {
                        i15 = getPaddingLeft() + ((LinearLayout.LayoutParams) c5226o).leftMargin;
                        i16 = i15 + measuredWidth;
                    } else {
                        i16 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c5226o).rightMargin;
                        i15 = i16 - measuredWidth;
                    }
                    int i22 = i17 - (measuredHeight / 2);
                    childAt.layout(i15, i22, i16, measuredHeight + i22);
                    paddingRight -= measuredWidth;
                    i19 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c5226o).leftMargin) + ((LinearLayout.LayoutParams) c5226o).rightMargin;
                    n(i21);
                    i20++;
                }
            }
        }
        if (childCount == 1 && i19 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i23 = (i18 / 2) - (measuredWidth2 / 2);
            int i24 = i17 - (measuredHeight2 / 2);
            childAt2.layout(i23, i24, measuredWidth2 + i23, measuredHeight2 + i24);
            return;
        }
        int i25 = i20 - (i19 ^ 1);
        if (i25 > 0) {
            i14 = paddingRight / i25;
        } else {
            i14 = 0;
        }
        int max = Math.max(0, i14);
        if (a5) {
            int width = getWidth() - getPaddingRight();
            for (int i26 = 0; i26 < childCount; i26++) {
                View childAt3 = getChildAt(i26);
                C5226o c5226o2 = (C5226o) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c5226o2.f43485a) {
                    int i27 = width - ((LinearLayout.LayoutParams) c5226o2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i28 = i17 - (measuredHeight3 / 2);
                    childAt3.layout(i27 - measuredWidth3, i28, i27, measuredHeight3 + i28);
                    width = i27 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c5226o2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt4 = getChildAt(i29);
            C5226o c5226o3 = (C5226o) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c5226o3.f43485a) {
                int i30 = paddingLeft + ((LinearLayout.LayoutParams) c5226o3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i31 = i17 - (measuredHeight4 / 2);
                childAt4.layout(i30, i31, i30 + measuredWidth4, measuredHeight4 + i31);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c5226o3).rightMargin + max + i30;
            }
        }
    }

    @Override // q.F0, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z14;
        int i20;
        int i21;
        boolean z15;
        int i22;
        ActionMenuItemView actionMenuItemView;
        boolean z16;
        int i23;
        boolean z17;
        o oVar;
        boolean z18 = this.f24508D0;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24508D0 = z10;
        if (z18 != z10) {
            this.f24509E0 = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f24508D0 && (oVar = this.f24513w0) != null && size != this.f24509E0) {
            this.f24509E0 = size;
            oVar.p(true);
        }
        int childCount = getChildCount();
        if (this.f24508D0 && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
            int i24 = size2 - paddingRight;
            int i25 = this.f24510F0;
            int i26 = i24 / i25;
            int i27 = i24 % i25;
            if (i26 == 0) {
                setMeasuredDimension(i24, 0);
                return;
            }
            int i28 = (i27 / i26) + i25;
            int childCount2 = getChildCount();
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            boolean z19 = false;
            int i32 = 0;
            int i33 = 0;
            long j6 = 0;
            while (true) {
                i12 = this.f24511G0;
                if (i31 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i31);
                int i34 = size3;
                if (childAt.getVisibility() == 8) {
                    i20 = i24;
                    i21 = paddingBottom;
                } else {
                    boolean z20 = childAt instanceof ActionMenuItemView;
                    int i35 = i29 + 1;
                    if (z20) {
                        childAt.setPadding(i12, 0, i12, 0);
                    }
                    C5226o c5226o = (C5226o) childAt.getLayoutParams();
                    c5226o.f43490f = false;
                    c5226o.f43487c = 0;
                    c5226o.f43486b = 0;
                    c5226o.f43488d = false;
                    ((LinearLayout.LayoutParams) c5226o).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c5226o).rightMargin = 0;
                    if (z20 && (!TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()))) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    c5226o.f43489e = z15;
                    if (c5226o.f43485a) {
                        i22 = 1;
                    } else {
                        i22 = i26;
                    }
                    C5226o c5226o2 = (C5226o) childAt.getLayoutParams();
                    i20 = i24;
                    i21 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z20) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && (!TextUtils.isEmpty(actionMenuItemView.getText()))) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i22 > 0 && (!z16 || i22 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i22 * i28, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i23 = measuredWidth / i28;
                        if (measuredWidth % i28 != 0) {
                            i23++;
                        }
                        if (z16 && i23 < 2) {
                            i23 = 2;
                        }
                    } else {
                        i23 = 0;
                    }
                    if (!c5226o2.f43485a && z16) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    c5226o2.f43488d = z17;
                    c5226o2.f43486b = i23;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23 * i28, 1073741824), makeMeasureSpec);
                    i30 = Math.max(i30, i23);
                    if (c5226o.f43488d) {
                        i32++;
                    }
                    if (c5226o.f43485a) {
                        z19 = true;
                    }
                    i26 -= i23;
                    i33 = Math.max(i33, childAt.getMeasuredHeight());
                    if (i23 == 1) {
                        j6 |= 1 << i31;
                    }
                    i29 = i35;
                }
                i31++;
                size3 = i34;
                paddingBottom = i21;
                i24 = i20;
            }
            int i36 = i24;
            int i37 = size3;
            int i38 = i33;
            if (z19 && i29 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z21 = false;
            while (i32 > 0 && i26 > 0) {
                int i39 = Integer.MAX_VALUE;
                int i40 = 0;
                int i41 = 0;
                long j10 = 0;
                while (i41 < childCount2) {
                    int i42 = i38;
                    C5226o c5226o3 = (C5226o) getChildAt(i41).getLayoutParams();
                    boolean z22 = z21;
                    if (c5226o3.f43488d) {
                        int i43 = c5226o3.f43486b;
                        if (i43 < i39) {
                            j10 = 1 << i41;
                            i39 = i43;
                            i40 = 1;
                        } else if (i43 == i39) {
                            i40++;
                            j10 |= 1 << i41;
                        }
                    }
                    i41++;
                    z21 = z22;
                    i38 = i42;
                }
                i14 = i38;
                z12 = z21;
                j6 |= j10;
                if (i40 > i26) {
                    i13 = mode;
                    break;
                }
                int i44 = i39 + 1;
                int i45 = 0;
                while (i45 < childCount2) {
                    View childAt2 = getChildAt(i45);
                    C5226o c5226o4 = (C5226o) childAt2.getLayoutParams();
                    int i46 = mode;
                    int i47 = childMeasureSpec;
                    int i48 = childCount2;
                    long j11 = 1 << i45;
                    if ((j10 & j11) == 0) {
                        if (c5226o4.f43486b == i44) {
                            j6 |= j11;
                        }
                    } else {
                        if (z11 && c5226o4.f43489e) {
                            z14 = true;
                            z14 = true;
                            if (i26 == 1) {
                                childAt2.setPadding(i12 + i28, 0, i12, 0);
                            }
                        } else {
                            z14 = true;
                        }
                        int i49 = c5226o4.f43486b;
                        int i50 = z14 ? 1 : 0;
                        int i51 = z14 ? 1 : 0;
                        int i52 = z14 ? 1 : 0;
                        c5226o4.f43486b = i49 + i50;
                        c5226o4.f43490f = z14;
                        i26--;
                    }
                    i45++;
                    childMeasureSpec = i47;
                    mode = i46;
                    childCount2 = i48;
                }
                i38 = i14;
                z21 = true;
            }
            i13 = mode;
            i14 = i38;
            z12 = z21;
            int i53 = childMeasureSpec;
            int i54 = childCount2;
            if (!z19 && i29 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i26 <= 0 || j6 == 0 || (i26 >= i29 - 1 && !z13 && i30 <= 1)) {
                i15 = i54;
            } else {
                float bitCount = Long.bitCount(j6);
                if (!z13) {
                    if ((j6 & 1) != 0 && !((C5226o) getChildAt(0).getLayoutParams()).f43489e) {
                        bitCount -= 0.5f;
                    }
                    int i55 = i54 - 1;
                    if ((j6 & (1 << i55)) != 0 && !((C5226o) getChildAt(i55).getLayoutParams()).f43489e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i19 = (int) ((i26 * i28) / bitCount);
                } else {
                    i19 = 0;
                }
                i15 = i54;
                for (int i56 = 0; i56 < i15; i56++) {
                    if ((j6 & (1 << i56)) != 0) {
                        View childAt3 = getChildAt(i56);
                        C5226o c5226o5 = (C5226o) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c5226o5.f43487c = i19;
                            c5226o5.f43490f = true;
                            if (i56 == 0 && !c5226o5.f43489e) {
                                ((LinearLayout.LayoutParams) c5226o5).leftMargin = (-i19) / 2;
                            }
                            z12 = true;
                        } else if (c5226o5.f43485a) {
                            c5226o5.f43487c = i19;
                            c5226o5.f43490f = true;
                            ((LinearLayout.LayoutParams) c5226o5).rightMargin = (-i19) / 2;
                            z12 = true;
                        } else {
                            if (i56 != 0) {
                                ((LinearLayout.LayoutParams) c5226o5).leftMargin = i19 / 2;
                            }
                            if (i56 != i15 - 1) {
                                ((LinearLayout.LayoutParams) c5226o5).rightMargin = i19 / 2;
                            }
                        }
                    }
                }
            }
            if (z12) {
                int i57 = 0;
                while (i57 < i15) {
                    View childAt4 = getChildAt(i57);
                    C5226o c5226o6 = (C5226o) childAt4.getLayoutParams();
                    if (!c5226o6.f43490f) {
                        i18 = i53;
                    } else {
                        i18 = i53;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c5226o6.f43486b * i28) + c5226o6.f43487c, 1073741824), i18);
                    }
                    i57++;
                    i53 = i18;
                }
            }
            if (i13 != 1073741824) {
                i17 = i36;
                i16 = i14;
            } else {
                i16 = i37;
                i17 = i36;
            }
            setMeasuredDimension(i17, i16);
            return;
        }
        for (int i58 = 0; i58 < childCount; i58++) {
            C5226o c5226o7 = (C5226o) getChildAt(i58).getLayoutParams();
            ((LinearLayout.LayoutParams) c5226o7).rightMargin = 0;
            ((LinearLayout.LayoutParams) c5226o7).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f24505A0.f43469v0 = z10;
    }

    public void setOnMenuItemClickListener(AbstractC5228p abstractC5228p) {
        this.f24512H0 = abstractC5228p;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C5222m c5222m = this.f24505A0;
        C5220l c5220l = c5222m.f43461n0;
        if (c5220l != null) {
            c5220l.setImageDrawable(drawable);
            return;
        }
        c5222m.f43463p0 = true;
        c5222m.f43462o0 = drawable;
    }

    public void setOverflowReserved(boolean z10) {
        this.f24516z0 = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f24515y0 != i10) {
            this.f24515y0 = i10;
            if (i10 == 0) {
                this.f24514x0 = getContext();
            } else {
                this.f24514x0 = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C5222m c5222m) {
        this.f24505A0 = c5222m;
        c5222m.f43460m0 = this;
        this.f24513w0 = c5222m.f43455h0;
    }

    @Override // q.F0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
