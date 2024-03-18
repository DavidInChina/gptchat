package p;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class t extends FrameLayout implements androidx.appcompat.view.d {

    /* renamed from: h0  reason: collision with root package name */
    public final CollapsibleActionView f41664h0;

    public t(View view) {
        super(view.getContext());
        this.f41664h0 = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // androidx.appcompat.view.d
    public final void c() {
        this.f41664h0.onActionViewExpanded();
    }

    @Override // androidx.appcompat.view.d
    public final void e() {
        this.f41664h0.onActionViewCollapsed();
    }
}
