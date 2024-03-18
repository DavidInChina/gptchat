package H0;

import Z.AbstractC1699a;
import Z.AbstractC1738u;
import Z.AbstractC1746y;
import Z.C1744x;
import android.view.View;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import h0.C3288a;
import j0.AbstractC3893i;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public abstract class A1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewGroup.LayoutParams f6713a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final y1 a(AbstractC0666a abstractC0666a, AbstractC1738u abstractC1738u, C3288a c3288a) {
        C0714y c0714y;
        Object tag;
        y1 y1Var = null;
        if (A0.f6711a.compareAndSet(false, true)) {
            Pg.k d10 = Bi.c.d(1, null, 6);
            Ad.l.O0(Ad.l.g((AbstractC4831k) C0676e0.f6937q0.getValue()), null, null, new C0715y0(d10, null), 3);
            int i10 = AbstractC3893i.f35891e;
            io.sentry.hints.i.g(new C0717z0(d10, 0));
        }
        if (abstractC0666a.getChildCount() > 0) {
            View childAt = abstractC0666a.getChildAt(0);
            if (childAt instanceof C0714y) {
                c0714y = (C0714y) childAt;
                if (c0714y == null) {
                    c0714y = new C0714y(abstractC0666a.getContext(), abstractC1738u.g());
                    abstractC0666a.addView(c0714y.getView(), f6713a);
                }
                AbstractC1699a abstractC1699a = new AbstractC1699a(c0714y.getRoot());
                Object obj = AbstractC1746y.f22769a;
                C1744x c1744x = new C1744x(abstractC1738u, abstractC1699a);
                tag = c0714y.getView().getTag(R.id.wrapped_composition_tag);
                if (tag instanceof y1) {
                    y1Var = (y1) tag;
                }
                if (y1Var == null) {
                    y1Var = new y1(c0714y, c1744x);
                    c0714y.getView().setTag(R.id.wrapped_composition_tag, y1Var);
                }
                y1Var.d(c3288a);
                return y1Var;
            }
        } else {
            abstractC0666a.removeAllViews();
        }
        c0714y = null;
        if (c0714y == null) {
        }
        AbstractC1699a abstractC1699a2 = new AbstractC1699a(c0714y.getRoot());
        Object obj2 = AbstractC1746y.f22769a;
        C1744x c1744x2 = new C1744x(abstractC1738u, abstractC1699a2);
        tag = c0714y.getView().getTag(R.id.wrapped_composition_tag);
        if (tag instanceof y1) {
        }
        if (y1Var == null) {
        }
        y1Var.d(c3288a);
        return y1Var;
    }
}
