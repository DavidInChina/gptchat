package E;

import D1.AbstractC0366n0;
import D1.AbstractC0374u;
import D1.H0;
import D1.J0;
import android.os.Build;
import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class Q extends AbstractC0366n0 implements Runnable, AbstractC0374u, View.OnAttachStateChangeListener {

    /* renamed from: h0  reason: collision with root package name */
    public final B0 f3810h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f3811i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3812j0;

    /* renamed from: k0  reason: collision with root package name */
    public J0 f3813k0;

    public Q(B0 b02) {
        super(!b02.f3755s ? 1 : 0);
        this.f3810h0 = b02;
    }

    @Override // D1.AbstractC0366n0
    public final void a(D1.v0 v0Var) {
        this.f3811i0 = false;
        this.f3812j0 = false;
        J0 j02 = this.f3813k0;
        if (v0Var.f3309a.a() != 0 && j02 != null) {
            B0 b02 = this.f3810h0;
            b02.getClass();
            H0 h02 = j02.f3232a;
            b02.f3754r.f(androidx.compose.foundation.layout.a.y(h02.f(8)));
            b02.f3753q.f(androidx.compose.foundation.layout.a.y(h02.f(8)));
            B0.a(b02, j02);
        }
        this.f3813k0 = null;
    }

    @Override // D1.AbstractC0366n0
    public final void b() {
        this.f3811i0 = true;
        this.f3812j0 = true;
    }

    @Override // D1.AbstractC0366n0
    public final J0 c(J0 j02, List list) {
        B0 b02 = this.f3810h0;
        B0.a(b02, j02);
        if (b02.f3755s) {
            return J0.f3231b;
        }
        return j02;
    }

    @Override // D1.AbstractC0366n0
    public final U3.l d(U3.l lVar) {
        this.f3811i0 = false;
        return lVar;
    }

    @Override // D1.AbstractC0374u
    public final J0 e(View view, J0 j02) {
        this.f3813k0 = j02;
        B0 b02 = this.f3810h0;
        b02.getClass();
        H0 h02 = j02.f3232a;
        b02.f3753q.f(androidx.compose.foundation.layout.a.y(h02.f(8)));
        if (this.f3811i0) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f3812j0) {
            b02.f3754r.f(androidx.compose.foundation.layout.a.y(h02.f(8)));
            B0.a(b02, j02);
        }
        if (b02.f3755s) {
            return J0.f3231b;
        }
        return j02;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3811i0) {
            this.f3811i0 = false;
            this.f3812j0 = false;
            J0 j02 = this.f3813k0;
            if (j02 != null) {
                B0 b02 = this.f3810h0;
                b02.getClass();
                b02.f3754r.f(androidx.compose.foundation.layout.a.y(j02.f3232a.f(8)));
                B0.a(b02, j02);
                this.f3813k0 = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
