package m1;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: m1.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewGroup$OnHierarchyChangeListenerC4546c implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f38850Y;

    public ViewGroup$OnHierarchyChangeListenerC4546c(CoordinatorLayout coordinatorLayout) {
        this.f38850Y = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f38850Y.f24906x0;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f38850Y;
        coordinatorLayout.p(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f24906x0;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
