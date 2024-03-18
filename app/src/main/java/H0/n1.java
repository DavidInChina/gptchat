package H0;

import V1.AbstractComponentCallbacksC1480v;
import V1.C1471l;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import id.AbstractC3557B;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class n1 implements View.OnAttachStateChangeListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6981Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f6982Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f6983h0;

    public /* synthetic */ n1(Object obj, int i10, Object obj2) {
        this.f6981Y = i10;
        this.f6983h0 = obj;
        this.f6982Z = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f6981Y;
        Object obj = this.f6983h0;
        Object obj2 = this.f6982Z;
        switch (i10) {
            case 0:
                return;
            case 1:
                V1.P p10 = (V1.P) obj2;
                AbstractComponentCallbacksC1480v abstractComponentCallbacksC1480v = p10.f18101c;
                p10.k();
                C1471l.l((ViewGroup) abstractComponentCallbacksC1480v.f18269J0.getParent(), ((V1.A) obj).f18015Y).k();
                return;
            case 2:
                View view2 = (View) obj2;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = D1.Z.f3247a;
                D1.L.c(view2);
                return;
            default:
                AbstractC3557B.c0("v", view);
                View view3 = (View) obj2;
                ViewTreeObserver viewTreeObserver = view3.getRootView().getViewTreeObserver();
                AbstractC3557B.b0("rootView.viewTreeObserver", viewTreeObserver);
                ((wf.k) obj).invoke(viewTreeObserver);
                view3.getRootView().removeOnAttachStateChangeListener(this);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f6981Y) {
            case 0:
                ((View) this.f6982Z).removeOnAttachStateChangeListener(this);
                ((Z.E0) this.f6983h0).w();
                return;
            case 1:
            case 2:
                return;
            default:
                AbstractC3557B.c0("v", view);
                return;
        }
    }

    public n1(View view, Z.E0 e02) {
        this.f6981Y = 0;
        this.f6982Z = view;
        this.f6983h0 = e02;
    }
}
