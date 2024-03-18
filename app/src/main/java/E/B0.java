package E;

import D1.AbstractC0357j;
import D1.C0359k;
import D1.H0;
import D1.J0;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.openai.chatgpt.R;
import j0.AbstractC3893i;
import java.util.WeakHashMap;
import s1.C5523e;

/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: v  reason: collision with root package name */
    public static final WeakHashMap f3736v = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C0419e f3738b;

    /* renamed from: c  reason: collision with root package name */
    public final C0419e f3739c;

    /* renamed from: g  reason: collision with root package name */
    public final C0419e f3743g;

    /* renamed from: k  reason: collision with root package name */
    public final w0 f3747k;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f3755s;

    /* renamed from: t  reason: collision with root package name */
    public int f3756t;

    /* renamed from: u  reason: collision with root package name */
    public final Q f3757u;

    /* renamed from: a  reason: collision with root package name */
    public final C0419e f3737a = G.a(4, "captionBar");

    /* renamed from: d  reason: collision with root package name */
    public final C0419e f3740d = G.a(32, "mandatorySystemGestures");

    /* renamed from: e  reason: collision with root package name */
    public final C0419e f3741e = G.a(2, "navigationBars");

    /* renamed from: f  reason: collision with root package name */
    public final C0419e f3742f = G.a(1, "statusBars");

    /* renamed from: h  reason: collision with root package name */
    public final C0419e f3744h = G.a(16, "systemGestures");

    /* renamed from: i  reason: collision with root package name */
    public final C0419e f3745i = G.a(64, "tappableElement");

    /* renamed from: j  reason: collision with root package name */
    public final y0 f3746j = new y0(new V(0, 0, 0, 0), "waterfall");

    /* renamed from: l  reason: collision with root package name */
    public final y0 f3748l = G.b(4, "captionBarIgnoringVisibility");

    /* renamed from: m  reason: collision with root package name */
    public final y0 f3749m = G.b(2, "navigationBarsIgnoringVisibility");

    /* renamed from: n  reason: collision with root package name */
    public final y0 f3750n = G.b(1, "statusBarsIgnoringVisibility");

    /* renamed from: o  reason: collision with root package name */
    public final y0 f3751o = G.b(7, "systemBarsIgnoringVisibility");

    /* renamed from: p  reason: collision with root package name */
    public final y0 f3752p = G.b(64, "tappableElementIgnoringVisibility");

    /* renamed from: q  reason: collision with root package name */
    public final y0 f3753q = G.b(8, "imeAnimationTarget");

    /* renamed from: r  reason: collision with root package name */
    public final y0 f3754r = G.b(8, "imeAnimationSource");

    public B0(View view) {
        View view2;
        Object obj;
        C0419e a5 = G.a(128, "displayCutout");
        this.f3738b = a5;
        C0419e a10 = G.a(8, "ime");
        this.f3739c = a10;
        boolean z10 = true;
        C0419e a11 = G.a(7, "systemBars");
        this.f3743g = a11;
        this.f3747k = new w0(new w0(a11, a10), a5);
        ViewParent parent = view.getParent();
        Boolean bool = null;
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        bool = obj instanceof Boolean ? obj : bool;
        this.f3755s = bool != null ? bool.booleanValue() : z10;
        this.f3757u = new Q(this);
    }

    public static void a(B0 b02, J0 j02) {
        C5523e c5523e;
        b02.f3737a.f(j02, 0);
        b02.f3739c.f(j02, 0);
        b02.f3738b.f(j02, 0);
        b02.f3741e.f(j02, 0);
        b02.f3742f.f(j02, 0);
        b02.f3743g.f(j02, 0);
        b02.f3744h.f(j02, 0);
        b02.f3745i.f(j02, 0);
        b02.f3740d.f(j02, 0);
        b02.f3748l.f(androidx.compose.foundation.layout.a.y(j02.f3232a.g(4)));
        H0 h02 = j02.f3232a;
        b02.f3749m.f(androidx.compose.foundation.layout.a.y(h02.g(2)));
        b02.f3750n.f(androidx.compose.foundation.layout.a.y(h02.g(1)));
        b02.f3751o.f(androidx.compose.foundation.layout.a.y(h02.g(7)));
        b02.f3752p.f(androidx.compose.foundation.layout.a.y(h02.g(64)));
        C0359k e10 = h02.e();
        if (e10 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                c5523e = C5523e.c(AbstractC0357j.b(e10.f3274a));
            } else {
                c5523e = C5523e.f45105e;
            }
            b02.f3746j.f(androidx.compose.foundation.layout.a.y(c5523e));
        }
        int i10 = AbstractC3893i.f35891e;
        io.sentry.hints.i.h();
    }
}
