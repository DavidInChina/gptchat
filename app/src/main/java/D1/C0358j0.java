package D1;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: D1.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358j0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f3273a;

    public C0358j0(View view) {
        this.f3273a = new WeakReference(view);
    }

    public final void a(float f6) {
        View view = (View) this.f3273a.get();
        if (view != null) {
            view.animate().alpha(f6);
        }
    }

    public final void b() {
        View view = (View) this.f3273a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j6) {
        View view = (View) this.f3273a.get();
        if (view != null) {
            view.animate().setDuration(j6);
        }
    }

    public final void d(AbstractC0360k0 abstractC0360k0) {
        View view = (View) this.f3273a.get();
        if (view != null) {
            if (abstractC0360k0 != null) {
                view.animate().setListener(new C0354h0(this, abstractC0360k0, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f6) {
        View view = (View) this.f3273a.get();
        if (view != null) {
            view.animate().translationY(f6);
        }
    }
}
