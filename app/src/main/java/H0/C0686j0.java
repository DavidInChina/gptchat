package H0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* renamed from: H0.j0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0686j0 extends ViewGroup {

    /* renamed from: h0  reason: collision with root package name */
    public final HashMap f6965h0 = new HashMap();

    /* renamed from: i0  reason: collision with root package name */
    public final HashMap f6966i0 = new HashMap();

    public C0686j0(Context context) {
        super(context);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<c1.l, androidx.compose.ui.node.a> getHolderToLayoutNode() {
        return this.f6965h0;
    }

    public final HashMap<androidx.compose.ui.node.a, c1.l> getLayoutNodeToHolder() {
        return this.f6966i0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (c1.l lVar : this.f6965h0.keySet()) {
            lVar.layout(lVar.getLeft(), lVar.getTop(), lVar.getRight(), lVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) == 1073741824) {
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                for (c1.l lVar : this.f6965h0.keySet()) {
                    int i13 = lVar.f26088y0;
                    if (i13 != Integer.MIN_VALUE && (i12 = lVar.f26089z0) != Integer.MIN_VALUE) {
                        lVar.measure(i13, i12);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("heightMeasureSpec should be EXACTLY".toString());
        }
        throw new IllegalArgumentException("widthMeasureSpec should be EXACTLY".toString());
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) this.f6965h0.get(childAt);
            if (childAt.isLayoutRequested() && aVar != null) {
                androidx.compose.ui.node.a.p0(aVar, false, 3);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
