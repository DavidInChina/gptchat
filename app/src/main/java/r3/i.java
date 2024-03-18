package r3;

import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.openai.chatgpt.R;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final h f44401a;

    /* renamed from: b  reason: collision with root package name */
    public final l f44402b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f44403c;

    /* renamed from: d  reason: collision with root package name */
    public final float f44404d;

    public i(Window window, h hVar) {
        l lVar;
        this.f44401a = hVar;
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            ViewParent parent = peekDecorView.getParent();
            View view = peekDecorView;
            while (parent instanceof View) {
                view = (View) parent;
                parent = view.getParent();
            }
            Object tag = view.getTag(R.id.metricsStateHolder);
            if (tag == null) {
                tag = new Object();
                view.setTag(R.id.metricsStateHolder, tag);
            }
            q qVar = (q) tag;
            if (qVar.f44424a == null) {
                qVar.f44424a = new r();
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                lVar = new p(this, peekDecorView, window);
            } else if (i10 >= 26) {
                lVar = new o(this, peekDecorView, window);
            } else if (i10 >= 24) {
                lVar = new n(this, peekDecorView, window);
            } else {
                lVar = new l(this, peekDecorView);
            }
            this.f44402b = lVar;
            lVar.R2(true);
            this.f44403c = true;
            this.f44404d = 2.0f;
            return;
        }
        throw new IllegalStateException("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
    }

    public final void a(C5362e c5362e) {
        double d10;
        AbstractC3557B.c0("volatileFrameData", c5362e);
        w6.f fVar = (w6.f) this.f44401a;
        fVar.getClass();
        double d11 = c5362e.f44396c;
        if (d11 > 0.0d) {
            double d12 = w6.f.f48046p0;
            double d13 = d12 / d11;
            fVar.f48051j0.getClass();
            int i10 = Build.VERSION.SDK_INT;
            double d14 = 60.0d;
            if (i10 >= 31) {
                fVar.f48050i0 = d12 / fVar.f48056o0;
            } else if (i10 == 30) {
                Display display = fVar.f48054m0;
                if (display != null) {
                    d10 = display.getRefreshRate();
                } else {
                    d10 = 60.0d;
                }
                fVar.f48050i0 = d10;
            }
            double d15 = (60.0d / fVar.f48050i0) * d13;
            if (d15 <= 60.0d) {
                d14 = d15;
            }
            if (d14 > 1.0d) {
                fVar.f48047Y.a(d14);
            }
        }
    }
}
