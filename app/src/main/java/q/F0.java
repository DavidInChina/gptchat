package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import l.AbstractC4308a;

/* loaded from: classes.dex */
public abstract class F0 extends ViewGroup {

    /* renamed from: i0  reason: collision with root package name */
    public int f43274i0;

    /* renamed from: k0  reason: collision with root package name */
    public int f43276k0;

    /* renamed from: m0  reason: collision with root package name */
    public int f43278m0;

    /* renamed from: n0  reason: collision with root package name */
    public float f43279n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f43280o0;

    /* renamed from: p0  reason: collision with root package name */
    public int[] f43281p0;

    /* renamed from: q0  reason: collision with root package name */
    public int[] f43282q0;

    /* renamed from: r0  reason: collision with root package name */
    public Drawable f43283r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f43284s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f43285t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f43286u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f43287v0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f43273h0 = true;

    /* renamed from: j0  reason: collision with root package name */
    public int f43275j0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public int f43277l0 = 8388659;

    public F0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43274i0 = -1;
        int[] iArr = AbstractC4308a.f37677n;
        U3.u I10 = U3.u.I(context, attributeSet, iArr, i10, 0);
        D1.Z.k(this, context, iArr, attributeSet, (TypedArray) I10.f17493h0, i10);
        int x10 = I10.x(1, -1);
        if (x10 >= 0) {
            setOrientation(x10);
        }
        int x11 = I10.x(0, -1);
        if (x11 >= 0) {
            setGravity(x11);
        }
        boolean o10 = I10.o(2, true);
        if (!o10) {
            setBaselineAligned(o10);
        }
        this.f43279n0 = ((TypedArray) I10.f17493h0).getFloat(4, -1.0f);
        this.f43274i0 = I10.x(3, -1);
        this.f43280o0 = I10.o(7, false);
        setDividerDrawable(I10.t(5));
        this.f43286u0 = I10.x(8, 0);
        this.f43287v0 = I10.s(6, 0);
        I10.N();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof E0;
    }

    public final void f(Canvas canvas, int i10) {
        this.f43283r0.setBounds(getPaddingLeft() + this.f43287v0, i10, (getWidth() - getPaddingRight()) - this.f43287v0, this.f43285t0 + i10);
        this.f43283r0.draw(canvas);
    }

    public final void g(Canvas canvas, int i10) {
        this.f43283r0.setBounds(i10, getPaddingTop() + this.f43287v0, this.f43284s0 + i10, (getHeight() - getPaddingBottom()) - this.f43287v0);
        this.f43283r0.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f43274i0 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f43274i0;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f43274i0 == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f43275j0;
            if (this.f43276k0 == 1 && (i10 = this.f43277l0 & 112) != 48) {
                if (i10 != 16) {
                    if (i10 == 80) {
                        i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f43278m0;
                    }
                } else {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f43278m0) / 2;
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((E0) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f43274i0;
    }

    public Drawable getDividerDrawable() {
        return this.f43283r0;
    }

    public int getDividerPadding() {
        return this.f43287v0;
    }

    public int getDividerWidth() {
        return this.f43284s0;
    }

    public int getGravity() {
        return this.f43277l0;
    }

    public int getOrientation() {
        return this.f43276k0;
    }

    public int getShowDividers() {
        return this.f43286u0;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f43279n0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, q.E0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, q.E0] */
    /* renamed from: h */
    public E0 generateDefaultLayoutParams() {
        int i10 = this.f43276k0;
        if (i10 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i10 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, q.E0] */
    /* renamed from: i */
    public E0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, q.E0] */
    /* renamed from: j */
    public E0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean k(int i10) {
        if (i10 == 0) {
            if ((this.f43286u0 & 1) == 0) {
                return false;
            }
            return true;
        } else if (i10 == getChildCount()) {
            if ((this.f43286u0 & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f43286u0 & 2) == 0) {
            return false;
        } else {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int left;
        int i11;
        int i12;
        int i13;
        if (this.f43283r0 == null) {
            return;
        }
        int i14 = 0;
        if (this.f43276k0 == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i14 < virtualChildCount) {
                View childAt = getChildAt(i14);
                if (childAt != null && childAt.getVisibility() != 8 && k(i14)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((E0) childAt.getLayoutParams())).topMargin) - this.f43285t0);
                }
                i14++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    i13 = (getHeight() - getPaddingBottom()) - this.f43285t0;
                } else {
                    i13 = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((E0) childAt2.getLayoutParams())).bottomMargin;
                }
                f(canvas, i13);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a5 = G1.a(this);
        while (i14 < virtualChildCount2) {
            View childAt3 = getChildAt(i14);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i14)) {
                E0 e02 = (E0) childAt3.getLayoutParams();
                if (a5) {
                    i12 = childAt3.getRight() + ((LinearLayout.LayoutParams) e02).rightMargin;
                } else {
                    i12 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) e02).leftMargin) - this.f43284s0;
                }
                g(canvas, i12);
            }
            i14++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a5) {
                    i10 = getPaddingLeft();
                    g(canvas, i10);
                }
                left = getWidth() - getPaddingRight();
                i11 = this.f43284s0;
                i10 = left - i11;
                g(canvas, i10);
            }
            E0 e03 = (E0) childAt4.getLayoutParams();
            if (a5) {
                left = childAt4.getLeft() - ((LinearLayout.LayoutParams) e03).leftMargin;
                i11 = this.f43284s0;
                i10 = left - i11;
                g(canvas, i10);
            }
            i10 = childAt4.getRight() + ((LinearLayout.LayoutParams) e03).rightMargin;
            g(canvas, i10);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29 = 8;
        if (this.f43276k0 == 1) {
            int paddingLeft = getPaddingLeft();
            int i30 = i12 - i10;
            int paddingRight = i30 - getPaddingRight();
            int paddingRight2 = (i30 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i31 = this.f43277l0;
            int i32 = i31 & 112;
            int i33 = 8388615 & i31;
            if (i32 != 16) {
                if (i32 != 80) {
                    i25 = getPaddingTop();
                } else {
                    i25 = ((getPaddingTop() + i13) - i11) - this.f43278m0;
                }
            } else {
                i25 = getPaddingTop() + (((i13 - i11) - this.f43278m0) / 2);
            }
            int i34 = 0;
            while (i34 < virtualChildCount) {
                View childAt = getChildAt(i34);
                if (childAt != null && childAt.getVisibility() != i29) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    E0 e02 = (E0) childAt.getLayoutParams();
                    int i35 = ((LinearLayout.LayoutParams) e02).gravity;
                    if (i35 < 0) {
                        i35 = i33;
                    }
                    WeakHashMap weakHashMap = D1.Z.f3247a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i35, D1.I.d(this)) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i26 = ((LinearLayout.LayoutParams) e02).leftMargin + paddingLeft;
                            if (k(i34)) {
                                i25 += this.f43285t0;
                            }
                            int i36 = i25 + ((LinearLayout.LayoutParams) e02).topMargin;
                            childAt.layout(i26, i36, measuredWidth + i26, i36 + measuredHeight);
                            i25 = measuredHeight + ((LinearLayout.LayoutParams) e02).bottomMargin + i36;
                        } else {
                            i27 = paddingRight - measuredWidth;
                            i28 = ((LinearLayout.LayoutParams) e02).rightMargin;
                        }
                    } else {
                        i27 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) e02).leftMargin;
                        i28 = ((LinearLayout.LayoutParams) e02).rightMargin;
                    }
                    i26 = i27 - i28;
                    if (k(i34)) {
                    }
                    int i362 = i25 + ((LinearLayout.LayoutParams) e02).topMargin;
                    childAt.layout(i26, i362, measuredWidth + i26, i362 + measuredHeight);
                    i25 = measuredHeight + ((LinearLayout.LayoutParams) e02).bottomMargin + i362;
                }
                i34++;
                i29 = 8;
            }
            return;
        }
        boolean a5 = G1.a(this);
        int paddingTop = getPaddingTop();
        int i37 = i13 - i11;
        int paddingBottom = i37 - getPaddingBottom();
        int paddingBottom2 = (i37 - paddingTop) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i38 = this.f43277l0;
        int i39 = 8388615 & i38;
        int i40 = i38 & 112;
        boolean z11 = this.f43273h0;
        int[] iArr = this.f43281p0;
        int[] iArr2 = this.f43282q0;
        WeakHashMap weakHashMap2 = D1.Z.f3247a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i39, D1.I.d(this));
        if (absoluteGravity2 != 1) {
            if (absoluteGravity2 != 5) {
                i14 = getPaddingLeft();
            } else {
                i14 = ((getPaddingLeft() + i12) - i10) - this.f43278m0;
            }
        } else {
            i14 = getPaddingLeft() + (((i12 - i10) - this.f43278m0) / 2);
        }
        if (a5) {
            i16 = virtualChildCount2 - 1;
            i15 = -1;
        } else {
            i15 = 1;
            i16 = 0;
        }
        int i41 = 0;
        while (i41 < virtualChildCount2) {
            int i42 = (i15 * i41) + i16;
            View childAt2 = getChildAt(i42);
            if (childAt2 == null) {
                i19 = i16;
            } else {
                i19 = i16;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    E0 e03 = (E0) childAt2.getLayoutParams();
                    i18 = i15;
                    if (z11) {
                        i17 = virtualChildCount2;
                        if (((LinearLayout.LayoutParams) e03).height != -1) {
                            i21 = childAt2.getBaseline();
                            i22 = ((LinearLayout.LayoutParams) e03).gravity;
                            if (i22 < 0) {
                                i22 = i40;
                            }
                            i23 = i22 & 112;
                            i20 = i40;
                            if (i23 == 16) {
                                if (i23 != 48) {
                                    if (i23 != 80) {
                                        i24 = paddingTop;
                                    } else {
                                        i24 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) e03).bottomMargin;
                                        if (i21 != -1) {
                                            i24 -= iArr2[2] - (childAt2.getMeasuredHeight() - i21);
                                        }
                                    }
                                } else {
                                    i24 = ((LinearLayout.LayoutParams) e03).topMargin + paddingTop;
                                    if (i21 != -1) {
                                        i24 = (iArr[1] - i21) + i24;
                                    }
                                }
                            } else {
                                i24 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) e03).topMargin) - ((LinearLayout.LayoutParams) e03).bottomMargin;
                            }
                            if (k(i42)) {
                                i14 += this.f43284s0;
                            }
                            int i43 = i14 + ((LinearLayout.LayoutParams) e03).leftMargin;
                            childAt2.layout(i43, i24, i43 + measuredWidth2, i24 + measuredHeight2);
                            i14 = measuredWidth2 + ((LinearLayout.LayoutParams) e03).rightMargin + i43;
                            i41++;
                            i16 = i19;
                            i15 = i18;
                            virtualChildCount2 = i17;
                            i40 = i20;
                        }
                    } else {
                        i17 = virtualChildCount2;
                    }
                    i21 = -1;
                    i22 = ((LinearLayout.LayoutParams) e03).gravity;
                    if (i22 < 0) {
                    }
                    i23 = i22 & 112;
                    i20 = i40;
                    if (i23 == 16) {
                    }
                    if (k(i42)) {
                    }
                    int i432 = i14 + ((LinearLayout.LayoutParams) e03).leftMargin;
                    childAt2.layout(i432, i24, i432 + measuredWidth2, i24 + measuredHeight2);
                    i14 = measuredWidth2 + ((LinearLayout.LayoutParams) e03).rightMargin + i432;
                    i41++;
                    i16 = i19;
                    i15 = i18;
                    virtualChildCount2 = i17;
                    i40 = i20;
                }
            }
            i18 = i15;
            i17 = virtualChildCount2;
            i20 = i40;
            i41++;
            i16 = i19;
            i15 = i18;
            virtualChildCount2 = i17;
            i40 = i20;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e0, code lost:
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:425:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f6;
        int i17;
        int i18;
        char c10;
        int i19;
        int i20;
        int i21;
        float f10;
        int i22;
        boolean z11;
        int i23;
        boolean z12;
        int baseline;
        int i24;
        int i25;
        char c11;
        boolean z13;
        boolean z14;
        int i26;
        int i27;
        int i28;
        boolean z15;
        int i29;
        E0 e02;
        boolean z16;
        int i30;
        int i31;
        boolean z17;
        int baseline2;
        int i32;
        float f11;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z18;
        int i38;
        int i39;
        int i40;
        boolean z19;
        int i41;
        int i42;
        int i43;
        int i44;
        E0 e03;
        boolean z20;
        boolean z21;
        boolean z22;
        int i45;
        int i46;
        int i47 = -2;
        int i48 = 1073741824;
        int i49 = 8;
        int i50 = Integer.MIN_VALUE;
        float f12 = 0.0f;
        boolean z23 = true;
        if (this.f43276k0 == 1) {
            this.f43278m0 = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i51 = this.f43274i0;
            boolean z24 = this.f43280o0;
            boolean z25 = true;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            boolean z26 = false;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            boolean z27 = false;
            float f13 = 0.0f;
            while (i52 < virtualChildCount) {
                View childAt = getChildAt(i52);
                if (childAt == null) {
                    this.f43278m0 = this.f43278m0;
                } else if (childAt.getVisibility() != i49) {
                    if (k(i52)) {
                        this.f43278m0 += this.f43285t0;
                    }
                    E0 e04 = (E0) childAt.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) e04).weight;
                    f13 += f14;
                    if (mode2 == i48 && ((LinearLayout.LayoutParams) e04).height == 0 && f14 > f12) {
                        int i58 = this.f43278m0;
                        this.f43278m0 = Math.max(i58, ((LinearLayout.LayoutParams) e04).topMargin + i58 + ((LinearLayout.LayoutParams) e04).bottomMargin);
                        i41 = i51;
                        i40 = mode2;
                        i44 = mode;
                        i39 = virtualChildCount;
                        e03 = e04;
                        z20 = true;
                        z19 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) e04).height == 0 && f14 > f12) {
                            ((LinearLayout.LayoutParams) e04).height = i47;
                            i45 = 0;
                        } else {
                            i45 = i50;
                        }
                        if (f13 == f12) {
                            i46 = this.f43278m0;
                        } else {
                            i46 = 0;
                        }
                        i41 = i51;
                        i40 = mode2;
                        i44 = mode;
                        i39 = virtualChildCount;
                        z19 = true;
                        e03 = e04;
                        measureChildWithMargins(childAt, i10, 0, i11, i46);
                        if (i45 != i50) {
                            ((LinearLayout.LayoutParams) e03).height = i45;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i59 = this.f43278m0;
                        this.f43278m0 = Math.max(i59, i59 + measuredHeight + ((LinearLayout.LayoutParams) e03).topMargin + ((LinearLayout.LayoutParams) e03).bottomMargin);
                        int i60 = i55;
                        if (z24) {
                            i55 = Math.max(measuredHeight, i60);
                        }
                        z20 = z26;
                    }
                    if (i41 >= 0 && i41 == i52 + 1) {
                        this.f43275j0 = this.f43278m0;
                    }
                    if (i52 >= i41 || ((LinearLayout.LayoutParams) e03).weight <= 0.0f) {
                        i43 = i44;
                        if (i43 != 1073741824 && ((LinearLayout.LayoutParams) e03).width == -1) {
                            z21 = z19;
                            z27 = z21;
                        } else {
                            z21 = false;
                        }
                        int i61 = ((LinearLayout.LayoutParams) e03).leftMargin + ((LinearLayout.LayoutParams) e03).rightMargin;
                        int measuredWidth = childAt.getMeasuredWidth() + i61;
                        i42 = Math.max(i56, measuredWidth);
                        int combineMeasuredStates = View.combineMeasuredStates(i57, childAt.getMeasuredState());
                        if (z25 && ((LinearLayout.LayoutParams) e03).width == -1) {
                            z22 = z19;
                        } else {
                            z22 = false;
                        }
                        if (((LinearLayout.LayoutParams) e03).weight > 0.0f) {
                            if (!z21) {
                                i61 = measuredWidth;
                            }
                            i54 = Math.max(i54, i61);
                        } else {
                            int i62 = i54;
                            if (!z21) {
                                i61 = measuredWidth;
                            }
                            i53 = Math.max(i53, i61);
                            i54 = i62;
                        }
                        z26 = z20;
                        i57 = combineMeasuredStates;
                        z25 = z22;
                        i52++;
                        mode = i43;
                        i56 = i42;
                        i51 = i41;
                        z23 = z19;
                        mode2 = i40;
                        virtualChildCount = i39;
                        i47 = -2;
                        i48 = 1073741824;
                        i49 = 8;
                        i50 = Integer.MIN_VALUE;
                        f12 = 0.0f;
                    } else {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                }
                i41 = i51;
                i40 = mode2;
                i43 = mode;
                i39 = virtualChildCount;
                i42 = i56;
                z19 = true;
                i52++;
                mode = i43;
                i56 = i42;
                i51 = i41;
                z23 = z19;
                mode2 = i40;
                virtualChildCount = i39;
                i47 = -2;
                i48 = 1073741824;
                i49 = 8;
                i50 = Integer.MIN_VALUE;
                f12 = 0.0f;
            }
            int i63 = mode2;
            int i64 = mode;
            int i65 = virtualChildCount;
            boolean z28 = z23;
            int i66 = i53;
            int i67 = i54;
            int i68 = i55;
            int i69 = i56;
            int i70 = i57;
            if (this.f43278m0 > 0 && k(i65)) {
                this.f43278m0 += this.f43285t0;
            }
            int i71 = i63;
            if (z24 && (i71 == Integer.MIN_VALUE || i71 == 0)) {
                this.f43278m0 = 0;
                for (int i72 = 0; i72 < i65; i72++) {
                    View childAt2 = getChildAt(i72);
                    if (childAt2 == null) {
                        this.f43278m0 = this.f43278m0;
                    } else if (childAt2.getVisibility() != 8) {
                        E0 e05 = (E0) childAt2.getLayoutParams();
                        int i73 = this.f43278m0;
                        this.f43278m0 = Math.max(i73, i73 + i68 + ((LinearLayout.LayoutParams) e05).topMargin + ((LinearLayout.LayoutParams) e05).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f43278m0;
            this.f43278m0 = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, 0);
            int i74 = (16777215 & resolveSizeAndState) - this.f43278m0;
            if (!z26 && (i74 == 0 || f13 <= 0.0f)) {
                i66 = Math.max(i66, i67);
                if (z24 && i71 != 1073741824) {
                    for (int i75 = 0; i75 < i65; i75++) {
                        View childAt3 = getChildAt(i75);
                        if (childAt3 != null && childAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((E0) childAt3.getLayoutParams())).weight > 0.0f) {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i68, 1073741824));
                        }
                    }
                }
            } else {
                float f15 = this.f43279n0;
                if (f15 > 0.0f) {
                    f13 = f15;
                }
                this.f43278m0 = 0;
                int i76 = 0;
                while (i76 < i65) {
                    View childAt4 = getChildAt(i76);
                    if (childAt4.getVisibility() == 8) {
                        i36 = i71;
                    } else {
                        E0 e06 = (E0) childAt4.getLayoutParams();
                        float f16 = ((LinearLayout.LayoutParams) e06).weight;
                        if (f16 > 0.0f) {
                            int i77 = (int) ((i74 * f16) / f13);
                            f13 -= f16;
                            int i78 = i74 - i77;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) e06).leftMargin + ((LinearLayout.LayoutParams) e06).rightMargin, ((LinearLayout.LayoutParams) e06).width);
                            if (((LinearLayout.LayoutParams) e06).height == 0) {
                                i38 = 1073741824;
                                if (i71 == 1073741824) {
                                    if (i77 <= 0) {
                                        i77 = 0;
                                    }
                                    childAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i77, 1073741824));
                                    i70 = View.combineMeasuredStates(i70, childAt4.getMeasuredState() & (-256));
                                    i74 = i78;
                                }
                            } else {
                                i38 = 1073741824;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight() + i77;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i38));
                            i70 = View.combineMeasuredStates(i70, childAt4.getMeasuredState() & (-256));
                            i74 = i78;
                        }
                        int i79 = ((LinearLayout.LayoutParams) e06).leftMargin + ((LinearLayout.LayoutParams) e06).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i79;
                        int max = Math.max(i69, measuredWidth2);
                        if (i64 != 1073741824) {
                            i36 = i71;
                            i37 = -1;
                        } else {
                            i36 = i71;
                            i37 = -1;
                        }
                        i79 = measuredWidth2;
                        i66 = Math.max(i66, i79);
                        if (z25 && ((LinearLayout.LayoutParams) e06).width == i37) {
                            z18 = z28;
                        } else {
                            z18 = false;
                        }
                        int i80 = this.f43278m0;
                        this.f43278m0 = Math.max(i80, childAt4.getMeasuredHeight() + i80 + ((LinearLayout.LayoutParams) e06).topMargin + ((LinearLayout.LayoutParams) e06).bottomMargin);
                        z25 = z18;
                        i69 = max;
                    }
                    i76++;
                    i71 = i36;
                }
                this.f43278m0 = getPaddingBottom() + getPaddingTop() + this.f43278m0;
            }
            int i81 = i69;
            if (z25 || i64 == 1073741824) {
                i66 = i81;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i66, getSuggestedMinimumWidth()), i10, i70), resolveSizeAndState);
            if (z27) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i82 = 0; i82 < i65; i82++) {
                    View childAt5 = getChildAt(i82);
                    if (childAt5.getVisibility() != 8) {
                        E0 e07 = (E0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) e07).width == -1) {
                            int i83 = ((LinearLayout.LayoutParams) e07).height;
                            ((LinearLayout.LayoutParams) e07).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i11, 0);
                            ((LinearLayout.LayoutParams) e07).height = i83;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f43278m0 = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i10);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (this.f43281p0 == null || this.f43282q0 == null) {
            this.f43281p0 = new int[4];
            this.f43282q0 = new int[4];
        }
        int[] iArr = this.f43281p0;
        int[] iArr2 = this.f43282q0;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z29 = this.f43273h0;
        boolean z30 = this.f43280o0;
        if (mode3 == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z31 = true;
        int i84 = 0;
        float f17 = 0.0f;
        int i85 = 0;
        int i86 = 0;
        int i87 = 0;
        int i88 = 0;
        int i89 = 0;
        boolean z32 = false;
        boolean z33 = false;
        while (i86 < virtualChildCount2) {
            View childAt6 = getChildAt(i86);
            if (childAt6 == null) {
                this.f43278m0 = this.f43278m0;
                i26 = i86;
                z14 = z30;
                z13 = z29;
            } else {
                int i90 = i84;
                int i91 = i85;
                if (childAt6.getVisibility() == 8) {
                    z13 = z29;
                    i84 = i90;
                    i85 = i91;
                    i26 = i86;
                    z14 = z30;
                } else {
                    if (k(i86)) {
                        this.f43278m0 += this.f43284s0;
                    }
                    E0 e08 = (E0) childAt6.getLayoutParams();
                    float f18 = ((LinearLayout.LayoutParams) e08).weight;
                    float f19 = f17 + f18;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) e08).width == 0 && f18 > 0.0f) {
                        if (z10) {
                            i35 = i86;
                            this.f43278m0 = ((LinearLayout.LayoutParams) e08).leftMargin + ((LinearLayout.LayoutParams) e08).rightMargin + this.f43278m0;
                        } else {
                            i35 = i86;
                            int i92 = this.f43278m0;
                            this.f43278m0 = Math.max(i92, ((LinearLayout.LayoutParams) e08).leftMargin + i92 + ((LinearLayout.LayoutParams) e08).rightMargin);
                        }
                        if (z29) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            e02 = e08;
                            i28 = i90;
                            i27 = i91;
                            i26 = i35;
                            z14 = z30;
                            z13 = z29;
                        } else {
                            e02 = e08;
                            i28 = i90;
                            i27 = i91;
                            i26 = i35;
                            i29 = 1073741824;
                            z14 = z30;
                            z13 = z29;
                            z15 = true;
                            if (mode4 == i29 && ((LinearLayout.LayoutParams) e02).height == -1) {
                                z16 = true;
                                z33 = true;
                            } else {
                                z16 = false;
                            }
                            i30 = ((LinearLayout.LayoutParams) e02).topMargin + ((LinearLayout.LayoutParams) e02).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i30;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i87, childAt6.getMeasuredState());
                            if (!z13 && (baseline2 = childAt6.getBaseline()) != -1) {
                                int i93 = ((LinearLayout.LayoutParams) e02).gravity;
                                if (i93 < 0) {
                                    i93 = this.f43277l0;
                                }
                                int i94 = (((i93 & 112) >> 4) & (-2)) >> 1;
                                i31 = i30;
                                iArr[i94] = Math.max(iArr[i94], baseline2);
                                iArr2[i94] = Math.max(iArr2[i94], measuredHeight3 - baseline2);
                            } else {
                                i31 = i30;
                            }
                            int max2 = Math.max(i27, measuredHeight3);
                            if (!z31 && ((LinearLayout.LayoutParams) e02).height == -1) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (((LinearLayout.LayoutParams) e02).weight <= 0.0f) {
                                if (z16) {
                                    measuredHeight3 = i31;
                                }
                                i89 = Math.max(i89, measuredHeight3);
                                i84 = i28;
                            } else {
                                if (z16) {
                                    measuredHeight3 = i31;
                                }
                                i84 = Math.max(i28, measuredHeight3);
                            }
                            i85 = max2;
                            i87 = combineMeasuredStates2;
                            z32 = z15;
                            z31 = z17;
                            f17 = f19;
                        }
                    } else {
                        int i95 = i86;
                        if (((LinearLayout.LayoutParams) e08).width == 0) {
                            f11 = 0.0f;
                            if (f18 > 0.0f) {
                                ((LinearLayout.LayoutParams) e08).width = -2;
                                i32 = 0;
                                if (f19 != f11) {
                                    i33 = this.f43278m0;
                                } else {
                                    i33 = 0;
                                }
                                i28 = i90;
                                i27 = i91;
                                i34 = i32;
                                i26 = i95;
                                z14 = z30;
                                z13 = z29;
                                measureChildWithMargins(childAt6, i10, i33, i11, 0);
                                if (i34 == Integer.MIN_VALUE) {
                                    e02 = e08;
                                    ((LinearLayout.LayoutParams) e02).width = i34;
                                } else {
                                    e02 = e08;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (!z10) {
                                    this.f43278m0 = ((LinearLayout.LayoutParams) e02).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) e02).rightMargin + this.f43278m0;
                                } else {
                                    int i96 = this.f43278m0;
                                    this.f43278m0 = Math.max(i96, i96 + measuredWidth3 + ((LinearLayout.LayoutParams) e02).leftMargin + ((LinearLayout.LayoutParams) e02).rightMargin);
                                }
                                if (z14) {
                                    i88 = Math.max(measuredWidth3, i88);
                                }
                            }
                        } else {
                            f11 = 0.0f;
                        }
                        i32 = Integer.MIN_VALUE;
                        if (f19 != f11) {
                        }
                        i28 = i90;
                        i27 = i91;
                        i34 = i32;
                        i26 = i95;
                        z14 = z30;
                        z13 = z29;
                        measureChildWithMargins(childAt6, i10, i33, i11, 0);
                        if (i34 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (!z10) {
                        }
                        if (z14) {
                        }
                    }
                    z15 = z32;
                    i29 = 1073741824;
                    if (mode4 == i29) {
                    }
                    z16 = false;
                    i30 = ((LinearLayout.LayoutParams) e02).topMargin + ((LinearLayout.LayoutParams) e02).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i30;
                    int combineMeasuredStates22 = View.combineMeasuredStates(i87, childAt6.getMeasuredState());
                    if (!z13) {
                    }
                    i31 = i30;
                    int max22 = Math.max(i27, measuredHeight32);
                    if (!z31) {
                    }
                    z17 = false;
                    if (((LinearLayout.LayoutParams) e02).weight <= 0.0f) {
                    }
                    i85 = max22;
                    i87 = combineMeasuredStates22;
                    z32 = z15;
                    z31 = z17;
                    f17 = f19;
                }
            }
            i86 = i26 + 1;
            z30 = z14;
            z29 = z13;
        }
        int i97 = i85;
        boolean z34 = z30;
        boolean z35 = z29;
        if (this.f43278m0 > 0 && k(virtualChildCount2)) {
            this.f43278m0 += this.f43284s0;
        }
        int i98 = iArr[1];
        if (i98 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c11 = 3;
            if (iArr[3] == -1) {
                i13 = i97;
                i12 = i87;
                if (z34 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.f43278m0 = 0;
                    for (i25 = 0; i25 < virtualChildCount2; i25++) {
                        View childAt7 = getChildAt(i25);
                        if (childAt7 == null) {
                            this.f43278m0 = this.f43278m0;
                        } else if (childAt7.getVisibility() != 8) {
                            E0 e09 = (E0) childAt7.getLayoutParams();
                            if (z10) {
                                this.f43278m0 = ((LinearLayout.LayoutParams) e09).leftMargin + i88 + ((LinearLayout.LayoutParams) e09).rightMargin + this.f43278m0;
                            } else {
                                int i99 = this.f43278m0;
                                this.f43278m0 = Math.max(i99, i99 + i88 + ((LinearLayout.LayoutParams) e09).leftMargin + ((LinearLayout.LayoutParams) e09).rightMargin);
                            }
                        }
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.f43278m0;
                this.f43278m0 = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, 0);
                int i100 = (16777215 & resolveSizeAndState2) - this.f43278m0;
                if (z32 && (i100 == 0 || f17 <= 0.0f)) {
                    i84 = Math.max(i84, i89);
                    if (z34 && mode3 != 1073741824) {
                        for (int i101 = 0; i101 < virtualChildCount2; i101++) {
                            View childAt8 = getChildAt(i101);
                            if (childAt8 != null && childAt8.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((E0) childAt8.getLayoutParams())).weight > 0.0f) {
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i88, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt8.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i16 = i11;
                    i14 = virtualChildCount2;
                    i15 = 0;
                } else {
                    f6 = this.f43279n0;
                    if (f6 > 0.0f) {
                        f17 = f6;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.f43278m0 = 0;
                    int i102 = i12;
                    i13 = -1;
                    i17 = 0;
                    while (i17 < virtualChildCount2) {
                        View childAt9 = getChildAt(i17);
                        if (childAt9 == null || childAt9.getVisibility() == 8) {
                            i20 = i100;
                            i19 = virtualChildCount2;
                        } else {
                            E0 e010 = (E0) childAt9.getLayoutParams();
                            float f20 = ((LinearLayout.LayoutParams) e010).weight;
                            if (f20 > 0.0f) {
                                i19 = virtualChildCount2;
                                int i103 = (int) ((i100 * f20) / f17);
                                float f21 = f17 - f20;
                                int i104 = i100 - i103;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) e010).topMargin + ((LinearLayout.LayoutParams) e010).bottomMargin, ((LinearLayout.LayoutParams) e010).height);
                                if (((LinearLayout.LayoutParams) e010).width == 0) {
                                    i24 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i103 <= 0) {
                                            i103 = 0;
                                        }
                                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i103, 1073741824), childMeasureSpec2);
                                        i102 = View.combineMeasuredStates(i102, childAt9.getMeasuredState() & (-16777216));
                                        f17 = f21;
                                        i21 = i104;
                                    }
                                } else {
                                    i24 = 1073741824;
                                }
                                int measuredWidth4 = childAt9.getMeasuredWidth() + i103;
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i24), childMeasureSpec2);
                                i102 = View.combineMeasuredStates(i102, childAt9.getMeasuredState() & (-16777216));
                                f17 = f21;
                                i21 = i104;
                            } else {
                                i21 = i100;
                                i19 = virtualChildCount2;
                            }
                            if (z10) {
                                f10 = f17;
                                this.f43278m0 = childAt9.getMeasuredWidth() + ((LinearLayout.LayoutParams) e010).leftMargin + ((LinearLayout.LayoutParams) e010).rightMargin + this.f43278m0;
                                i22 = i21;
                            } else {
                                f10 = f17;
                                int i105 = this.f43278m0;
                                i22 = i21;
                                this.f43278m0 = Math.max(i105, childAt9.getMeasuredWidth() + i105 + ((LinearLayout.LayoutParams) e010).leftMargin + ((LinearLayout.LayoutParams) e010).rightMargin);
                            }
                            if (mode4 != 1073741824 && ((LinearLayout.LayoutParams) e010).height == -1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int i106 = ((LinearLayout.LayoutParams) e010).topMargin + ((LinearLayout.LayoutParams) e010).bottomMargin;
                            int measuredHeight4 = childAt9.getMeasuredHeight() + i106;
                            i13 = Math.max(i13, measuredHeight4);
                            if (!z11) {
                                i106 = measuredHeight4;
                            }
                            i84 = Math.max(i84, i106);
                            if (z31) {
                                i23 = -1;
                                if (((LinearLayout.LayoutParams) e010).height == -1) {
                                    z12 = true;
                                    if (!z35 && (baseline = childAt9.getBaseline()) != i23) {
                                        int i107 = ((LinearLayout.LayoutParams) e010).gravity;
                                        if (i107 < 0) {
                                            i107 = this.f43277l0;
                                        }
                                        int i108 = (((i107 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i108] = Math.max(iArr[i108], baseline);
                                        iArr2[i108] = Math.max(iArr2[i108], measuredHeight4 - baseline);
                                    }
                                    z31 = z12;
                                    i20 = i22;
                                    f17 = f10;
                                }
                            } else {
                                i23 = -1;
                            }
                            z12 = false;
                            if (!z35) {
                            }
                            z31 = z12;
                            i20 = i22;
                            f17 = f10;
                        }
                        i17++;
                        i100 = i20;
                        virtualChildCount2 = i19;
                    }
                    i16 = i11;
                    i14 = virtualChildCount2;
                    this.f43278m0 = getPaddingRight() + getPaddingLeft() + this.f43278m0;
                    i18 = iArr[1];
                    if (i18 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c10 = 3;
                        if (iArr[3] == -1) {
                            i15 = 0;
                            i12 = i102;
                        }
                    } else {
                        c10 = 3;
                    }
                    i15 = 0;
                    i13 = Math.max(i13, Math.max(iArr2[c10], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c10], Math.max(iArr[0], Math.max(i18, iArr[2]))));
                    i12 = i102;
                }
                if (!z31 || mode4 == 1073741824) {
                    i84 = i13;
                }
                setMeasuredDimension((i12 & (-16777216)) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i84, getSuggestedMinimumHeight()), i16, i12 << 16));
                if (!z33) {
                    int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    int i109 = i14;
                    while (i15 < i109) {
                        View childAt10 = getChildAt(i15);
                        if (childAt10.getVisibility() != 8) {
                            E0 e011 = (E0) childAt10.getLayoutParams();
                            if (((LinearLayout.LayoutParams) e011).height == -1) {
                                int i110 = ((LinearLayout.LayoutParams) e011).width;
                                ((LinearLayout.LayoutParams) e011).width = childAt10.getMeasuredWidth();
                                measureChildWithMargins(childAt10, i10, 0, makeMeasureSpec3, 0);
                                ((LinearLayout.LayoutParams) e011).width = i110;
                            }
                        }
                        i15++;
                    }
                    return;
                }
                return;
            }
        } else {
            c11 = 3;
        }
        i12 = i87;
        i13 = Math.max(i97, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i98, iArr[2]))));
        if (z34) {
            this.f43278m0 = 0;
            while (i25 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f43278m0;
        this.f43278m0 = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i10, 0);
        int i1002 = (16777215 & resolveSizeAndState22) - this.f43278m0;
        if (z32) {
        }
        f6 = this.f43279n0;
        if (f6 > 0.0f) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.f43278m0 = 0;
        int i1022 = i12;
        i13 = -1;
        i17 = 0;
        while (i17 < virtualChildCount2) {
        }
        i16 = i11;
        i14 = virtualChildCount2;
        this.f43278m0 = getPaddingRight() + getPaddingLeft() + this.f43278m0;
        i18 = iArr[1];
        if (i18 != -1) {
        }
        c10 = 3;
        i15 = 0;
        i13 = Math.max(i13, Math.max(iArr2[c10], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c10], Math.max(iArr[0], Math.max(i18, iArr[2]))));
        i12 = i1022;
        if (!z31) {
        }
        i84 = i13;
        setMeasuredDimension((i12 & (-16777216)) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i84, getSuggestedMinimumHeight()), i16, i12 << 16));
        if (!z33) {
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f43273h0 = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f43274i0 = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + Separators.RPAREN);
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f43283r0) {
            return;
        }
        this.f43283r0 = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.f43284s0 = drawable.getIntrinsicWidth();
            this.f43285t0 = drawable.getIntrinsicHeight();
        } else {
            this.f43284s0 = 0;
            this.f43285t0 = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f43287v0 = i10;
    }

    public void setGravity(int i10) {
        if (this.f43277l0 != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f43277l0 = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f43277l0;
        if ((8388615 & i12) != i11) {
            this.f43277l0 = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f43280o0 = z10;
    }

    public void setOrientation(int i10) {
        if (this.f43276k0 != i10) {
            this.f43276k0 = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f43286u0) {
            requestLayout();
        }
        this.f43286u0 = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f43277l0;
        if ((i12 & 112) != i11) {
            this.f43277l0 = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.f43279n0 = Math.max(0.0f, f6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
