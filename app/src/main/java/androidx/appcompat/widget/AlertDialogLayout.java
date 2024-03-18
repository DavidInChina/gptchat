package androidx.appcompat.widget;

import D1.H;
import D1.I;
import D1.Z;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import q.E0;
import q.F0;

/* loaded from: classes.dex */
public class AlertDialogLayout extends F0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int l(View view) {
        WeakHashMap weakHashMap = Z.f3247a;
        int d10 = H.d(view);
        if (d10 > 0) {
            return d10;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return l(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    @Override // q.F0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int paddingLeft = getPaddingLeft();
        int i19 = i12 - i10;
        int paddingRight = i19 - getPaddingRight();
        int paddingRight2 = (i19 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i20 = gravity & 112;
        int i21 = gravity & 8388615;
        if (i20 != 16) {
            if (i20 != 80) {
                i14 = getPaddingTop();
            } else {
                i14 = ((getPaddingTop() + i13) - i11) - measuredHeight;
            }
        } else {
            i14 = (((i13 - i11) - measuredHeight) / 2) + getPaddingTop();
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            i15 = 0;
        } else {
            i15 = dividerDrawable.getIntrinsicHeight();
        }
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                E0 e02 = (E0) childAt.getLayoutParams();
                int i23 = ((LinearLayout.LayoutParams) e02).gravity;
                if (i23 < 0) {
                    i23 = i21;
                }
                WeakHashMap weakHashMap = Z.f3247a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i23, I.d(this)) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i16 = ((LinearLayout.LayoutParams) e02).leftMargin + paddingLeft;
                        if (k(i22)) {
                            i14 += i15;
                        }
                        int i24 = i14 + ((LinearLayout.LayoutParams) e02).topMargin;
                        childAt.layout(i16, i24, measuredWidth + i16, i24 + measuredHeight2);
                        i14 = measuredHeight2 + ((LinearLayout.LayoutParams) e02).bottomMargin + i24;
                    } else {
                        i17 = paddingRight - measuredWidth;
                        i18 = ((LinearLayout.LayoutParams) e02).rightMargin;
                    }
                } else {
                    i17 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) e02).leftMargin;
                    i18 = ((LinearLayout.LayoutParams) e02).rightMargin;
                }
                i16 = i17 - i18;
                if (k(i22)) {
                }
                int i242 = i14 + ((LinearLayout.LayoutParams) e02).topMargin;
                childAt.layout(i16, i242, measuredWidth + i16, i242 + measuredHeight2);
                i14 = measuredHeight2 + ((LinearLayout.LayoutParams) e02).bottomMargin + i242;
            }
        }
    }

    @Override // q.F0, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == R.id.topPanel) {
                    view = childAt;
                } else if (id2 == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id2 != R.id.contentPanel && id2 != R.id.customPanel) || view3 != null) {
                    super.onMeasure(i10, i11);
                    return;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i10, 0);
            paddingBottom += view.getMeasuredHeight();
            i12 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i12 = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            i14 = l(view2);
            i13 = view2.getMeasuredHeight() - i14;
            paddingBottom += i14;
            i12 = View.combineMeasuredStates(i12, view2.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                i16 = 0;
            } else {
                i16 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
            }
            view3.measure(i10, i16);
            i15 = view3.getMeasuredHeight();
            paddingBottom += i15;
            i12 = View.combineMeasuredStates(i12, view3.getMeasuredState());
        } else {
            i15 = 0;
        }
        int i18 = size - paddingBottom;
        if (view2 != null) {
            int i19 = paddingBottom - i14;
            int min = Math.min(i18, i13);
            if (min > 0) {
                i18 -= min;
                i14 += min;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
            paddingBottom = i19 + view2.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i12, view2.getMeasuredState());
        }
        if (view3 != null && i18 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(i15 + i18, mode));
            paddingBottom = (paddingBottom - i15) + view3.getMeasuredHeight();
            i12 = View.combineMeasuredStates(i12, view3.getMeasuredState());
        }
        int i20 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                i20 = Math.max(i20, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i20, i10, i12), View.resolveSizeAndState(paddingBottom, i11, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                if (childAt3.getVisibility() != 8) {
                    E0 e02 = (E0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) e02).width == -1) {
                        int i23 = ((LinearLayout.LayoutParams) e02).height;
                        ((LinearLayout.LayoutParams) e02).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i11, 0);
                        ((LinearLayout.LayoutParams) e02).height = i23;
                    }
                }
            }
        }
    }
}
