package androidx.appcompat.widget;

import D1.H;
import D1.Z;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import l.AbstractC4308a;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: h0  reason: collision with root package name */
    public boolean f24518h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f24519i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f24520j0 = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = AbstractC4308a.f37674k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        Z.k(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f24518h0 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f24518h0);
        }
    }

    private void setStacked(boolean z10) {
        int i10;
        int i11;
        if (this.f24519i0 != z10) {
            if (!z10 || this.f24518h0) {
                this.f24519i0 = z10;
                setOrientation(z10 ? 1 : 0);
                if (z10) {
                    i10 = 8388613;
                } else {
                    i10 = 80;
                }
                setGravity(i10);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z10) {
                        i11 = 8;
                    } else {
                        i11 = 4;
                    }
                    findViewById.setVisibility(i11);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r1 != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        if (this.f24518h0) {
            if (size > this.f24520j0 && this.f24519i0) {
                setStacked(false);
            }
            this.f24520j0 = size;
        }
        if (!this.f24519i0 && View.MeasureSpec.getMode(i10) == 1073741824) {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        } else {
            i12 = i10;
            z10 = false;
        }
        super.onMeasure(i12, i11);
        if (this.f24518h0 && !this.f24519i0 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
        }
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            i13 = -1;
            if (i15 < childCount) {
                if (getChildAt(i15).getVisibility() == 0) {
                    break;
                }
                i15++;
            } else {
                i15 = -1;
                break;
            }
        }
        if (i15 >= 0) {
            View childAt = getChildAt(i15);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f24519i0) {
                int i16 = i15 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i16 >= childCount2) {
                        break;
                    } else if (getChildAt(i16).getVisibility() == 0) {
                        i13 = i16;
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i13 >= 0) {
                    i14 = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i14 = measuredHeight;
                }
            } else {
                i14 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = Z.f3247a;
        if (H.d(this) != i14) {
            setMinimumHeight(i14);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f24518h0 != z10) {
            this.f24518h0 = z10;
            if (!z10 && this.f24519i0) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
