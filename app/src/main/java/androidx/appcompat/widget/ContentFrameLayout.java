package androidx.appcompat.widget;

import D1.C0358j0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import m.C4539t;
import m.LayoutInflater$Factory2C4511H;
import p.o;
import q.AbstractC5232r0;
import q.AbstractC5234s0;
import q.C5212h;
import q.C5222m;
import q.z1;

/* loaded from: classes2.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: h0  reason: collision with root package name */
    public TypedValue f24521h0;

    /* renamed from: i0  reason: collision with root package name */
    public TypedValue f24522i0;

    /* renamed from: j0  reason: collision with root package name */
    public TypedValue f24523j0;

    /* renamed from: k0  reason: collision with root package name */
    public TypedValue f24524k0;

    /* renamed from: l0  reason: collision with root package name */
    public TypedValue f24525l0;

    /* renamed from: m0  reason: collision with root package name */
    public TypedValue f24526m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Rect f24527n0 = new Rect();

    /* renamed from: o0  reason: collision with root package name */
    public AbstractC5232r0 f24528o0;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f24525l0 == null) {
            this.f24525l0 = new TypedValue();
        }
        return this.f24525l0;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f24526m0 == null) {
            this.f24526m0 = new TypedValue();
        }
        return this.f24526m0;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f24523j0 == null) {
            this.f24523j0 = new TypedValue();
        }
        return this.f24523j0;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f24524k0 == null) {
            this.f24524k0 = new TypedValue();
        }
        return this.f24524k0;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f24521h0 == null) {
            this.f24521h0 = new TypedValue();
        }
        return this.f24521h0;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f24522i0 == null) {
            this.f24522i0 = new TypedValue();
        }
        return this.f24522i0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC5232r0 abstractC5232r0 = this.f24528o0;
        if (abstractC5232r0 != null) {
            abstractC5232r0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C5222m c5222m;
        super.onDetachedFromWindow();
        AbstractC5232r0 abstractC5232r0 = this.f24528o0;
        if (abstractC5232r0 != null) {
            LayoutInflater$Factory2C4511H layoutInflater$Factory2C4511H = ((C4539t) abstractC5232r0).f38792Y;
            AbstractC5234s0 abstractC5234s0 = layoutInflater$Factory2C4511H.f38661w0;
            if (abstractC5234s0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) abstractC5234s0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((z1) actionBarOverlayLayout.f24490l0).f43598a.f24598h0;
                if (actionMenuView != null && (c5222m = actionMenuView.f24505A0) != null) {
                    c5222m.f();
                    C5212h c5212h = c5222m.f43472y0;
                    if (c5212h != null && c5212h.b()) {
                        c5212h.f41506j.dismiss();
                    }
                }
            }
            if (layoutInflater$Factory2C4511H.f38617B0 != null) {
                layoutInflater$Factory2C4511H.f38655q0.getDecorView().removeCallbacks(layoutInflater$Factory2C4511H.f38618C0);
                if (layoutInflater$Factory2C4511H.f38617B0.isShowing()) {
                    try {
                        layoutInflater$Factory2C4511H.f38617B0.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflater$Factory2C4511H.f38617B0 = null;
            }
            C0358j0 c0358j0 = layoutInflater$Factory2C4511H.f38619D0;
            if (c0358j0 != null) {
                c0358j0.b();
            }
            o oVar = layoutInflater$Factory2C4511H.A(0).f38603h;
            if (oVar != null) {
                oVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int measuredWidth;
        TypedValue typedValue;
        int i14;
        int i15;
        float fraction;
        TypedValue typedValue2;
        int i16;
        int i17;
        float fraction2;
        TypedValue typedValue3;
        int i18;
        int i19;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z12 = true;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z10 = true;
        } else {
            z10 = false;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        Rect rect = this.f24527n0;
        if (mode == Integer.MIN_VALUE) {
            if (z10) {
                typedValue3 = this.f24524k0;
            } else {
                typedValue3 = this.f24523j0;
            }
            if (typedValue3 != null && (i18 = typedValue3.type) != 0) {
                if (i18 == 5) {
                    fraction3 = typedValue3.getDimension(displayMetrics);
                } else if (i18 == 6) {
                    int i20 = displayMetrics.widthPixels;
                    fraction3 = typedValue3.getFraction(i20, i20);
                } else {
                    i19 = 0;
                    if (i19 > 0) {
                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i19 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z11 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            if (z10) {
                                typedValue2 = this.f24525l0;
                            } else {
                                typedValue2 = this.f24526m0;
                            }
                            if (typedValue2 != null && (i16 = typedValue2.type) != 0) {
                                if (i16 == 5) {
                                    fraction2 = typedValue2.getDimension(displayMetrics);
                                } else if (i16 == 6) {
                                    int i21 = displayMetrics.heightPixels;
                                    fraction2 = typedValue2.getFraction(i21, i21);
                                } else {
                                    i17 = 0;
                                    if (i17 > 0) {
                                        i13 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                                        super.onMeasure(i12, i13);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z11 && mode == Integer.MIN_VALUE) {
                                            if (!z10) {
                                                typedValue = this.f24522i0;
                                            } else {
                                                typedValue = this.f24521h0;
                                            }
                                            if (typedValue != null && (i14 = typedValue.type) != 0) {
                                                if (i14 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i14 == 6) {
                                                    int i22 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i22, i22);
                                                } else {
                                                    i15 = 0;
                                                    if (i15 > 0) {
                                                        i15 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i15) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                                                        if (!z12) {
                                                            super.onMeasure(makeMeasureSpec, i13);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                i15 = (int) fraction;
                                                if (i15 > 0) {
                                                }
                                                if (measuredWidth < i15) {
                                                }
                                            }
                                        }
                                        z12 = false;
                                        if (!z12) {
                                        }
                                    }
                                }
                                i17 = (int) fraction2;
                                if (i17 > 0) {
                                }
                            }
                        }
                        i13 = i11;
                        super.onMeasure(i12, i13);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z11) {
                            if (!z10) {
                            }
                            if (typedValue != null) {
                                if (i14 != 5) {
                                }
                                i15 = (int) fraction;
                                if (i15 > 0) {
                                }
                                if (measuredWidth < i15) {
                                }
                            }
                        }
                        z12 = false;
                        if (!z12) {
                        }
                    }
                }
                i19 = (int) fraction3;
                if (i19 > 0) {
                }
            }
        }
        i12 = i10;
        z11 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i13 = i11;
        super.onMeasure(i12, i13);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z11) {
        }
        z12 = false;
        if (!z12) {
        }
    }

    public void setAttachListener(AbstractC5232r0 abstractC5232r0) {
        this.f24528o0 = abstractC5232r0;
    }
}
