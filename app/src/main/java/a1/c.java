package A1;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class c implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ d f377Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Activity f378Z;

    public c(d dVar, Activity activity) {
        this.f377Y = dVar;
        this.f378Z = activity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        WindowInsets build;
        View rootView;
        if (b.B(view2)) {
            SplashScreenView p10 = b.p(view2);
            d dVar = this.f377Y;
            dVar.getClass();
            AbstractC3557B.c0("child", p10);
            build = a.g().build();
            AbstractC3557B.b0("Builder().build()", build);
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = p10.getRootView();
            if (build == rootView.computeSystemWindowInsets(build, rect)) {
                rect.isEmpty();
            }
            dVar.getClass();
            ((ViewGroup) this.f378Z.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
