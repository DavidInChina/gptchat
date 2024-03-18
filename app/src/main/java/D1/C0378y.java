package D1;

import a1.C1915c;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import g.RunnableC3111d;

/* renamed from: D1.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0378y extends C1915c {

    /* renamed from: Z  reason: collision with root package name */
    public final View f3323Z;

    public C0378y(View view) {
        super(2);
        this.f3323Z = view;
    }

    @Override // a1.C1915c
    public void o() {
        View view = this.f3323Z;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // a1.C1915c
    public void w() {
        View view;
        View view2 = this.f3323Z;
        if (view2 == null) {
            return;
        }
        if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
            view = view2.getRootView().findFocus();
        } else {
            view2.requestFocus();
            view = view2;
        }
        if (view == null) {
            view = view2.getRootView().findViewById(16908290);
        }
        if (view != null && view.hasWindowFocus()) {
            view.post(new RunnableC3111d(9, view));
        }
    }
}
