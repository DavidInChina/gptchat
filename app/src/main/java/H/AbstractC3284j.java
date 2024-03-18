package h;

import H0.C0700q0;
import K4.J;
import android.view.View;
import android.view.ViewGroup;
import c1.AbstractC2279d;
import g.AbstractActivityC3122o;
import h0.C3288a;
import q1.AbstractC5260f;

/* renamed from: h.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3284j {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewGroup.LayoutParams f31673a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(AbstractActivityC3122o abstractActivityC3122o, C3288a c3288a) {
        C0700q0 c0700q0;
        View childAt = ((ViewGroup) abstractActivityC3122o.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        if (childAt instanceof C0700q0) {
            c0700q0 = (C0700q0) childAt;
        } else {
            c0700q0 = null;
        }
        if (c0700q0 != null) {
            c0700q0.setParentCompositionContext(null);
            c0700q0.setContent(c3288a);
            return;
        }
        C0700q0 c0700q02 = new C0700q0(abstractActivityC3122o);
        c0700q02.setParentCompositionContext(null);
        c0700q02.setContent(c3288a);
        View decorView = abstractActivityC3122o.getWindow().getDecorView();
        if (J.A(decorView) == null) {
            J.Z(decorView, abstractActivityC3122o);
        }
        if (AbstractC2279d.n(decorView) == null) {
            AbstractC2279d.w(decorView, abstractActivityC3122o);
        }
        if (AbstractC5260f.t(decorView) == null) {
            AbstractC5260f.N(decorView, abstractActivityC3122o);
        }
        abstractActivityC3122o.setContentView(c0700q02, f31673a);
    }
}
