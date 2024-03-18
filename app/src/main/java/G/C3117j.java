package g;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2084t;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.EnumC2081p;
import androidx.lifecycle.d0;
import id.AbstractC3557B;

/* renamed from: g.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3117j implements AbstractC2084t {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30957Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC3122o f30958Z;

    public /* synthetic */ C3117j(AbstractActivityC3122o abstractActivityC3122o, int i10) {
        this.f30957Y = i10;
        this.f30958Z = abstractActivityC3122o;
    }

    @Override // androidx.lifecycle.AbstractC2084t
    public final void b(AbstractC2086v abstractC2086v, EnumC2081p enumC2081p) {
        View view = null;
        switch (this.f30957Y) {
            case 0:
                if (enumC2081p == EnumC2081p.ON_STOP) {
                    Window window = this.f30958Z.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (enumC2081p == EnumC2081p.ON_DESTROY) {
                    this.f30958Z.f30966Z.f32392b = null;
                    if (!this.f30958Z.isChangingConfigurations()) {
                        this.f30958Z.e().a();
                    }
                    ExecutorC3121n executorC3121n = this.f30958Z.f30973n0;
                    AbstractActivityC3122o abstractActivityC3122o = executorC3121n.f30965i0;
                    abstractActivityC3122o.getWindow().getDecorView().removeCallbacks(executorC3121n);
                    abstractActivityC3122o.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC3121n);
                    return;
                }
                return;
            case 2:
                AbstractActivityC3122o abstractActivityC3122o2 = this.f30958Z;
                if (abstractActivityC3122o2.f30970k0 == null) {
                    C3120m c3120m = (C3120m) abstractActivityC3122o2.getLastNonConfigurationInstance();
                    if (c3120m != null) {
                        abstractActivityC3122o2.f30970k0 = c3120m.f30961a;
                    }
                    if (abstractActivityC3122o2.f30970k0 == null) {
                        abstractActivityC3122o2.f30970k0 = new d0();
                    }
                }
                abstractActivityC3122o2.f30968i0.g(this);
                return;
            default:
                if (enumC2081p == EnumC2081p.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    C3104C c3104c = this.f30958Z.f30972m0;
                    OnBackInvokedDispatcher a5 = AbstractC3119l.a((AbstractActivityC3122o) abstractC2086v);
                    c3104c.getClass();
                    AbstractC3557B.c0("invoker", a5);
                    c3104c.f30932e = a5;
                    c3104c.d(c3104c.f30934g);
                    return;
                }
                return;
        }
    }
}
