package Z1;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import e2.C2769a;
import e2.C2770b;
import e2.C2771c;
import e2.C2782n;
import e2.C2790v;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j2.AbstractC3905g;
import j2.C3901c;
import j2.C3902d;
import j2.C3903e;
import j2.C3904f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public abstract class n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f23039a = AbstractC4268D.a1(new C3959i(q0.f23068i0, Integer.valueOf((int) R.layout.glance_text)), new C3959i(q0.f23069j0, Integer.valueOf((int) R.layout.glance_list)), new C3959i(q0.f23070k0, Integer.valueOf((int) R.layout.glance_check_box)), new C3959i(q0.f23071l0, Integer.valueOf((int) R.layout.glance_check_box_backport)), new C3959i(q0.f23072m0, Integer.valueOf((int) R.layout.glance_button)), new C3959i(q0.f23082w0, Integer.valueOf((int) R.layout.glance_swtch)), new C3959i(q0.f23083x0, Integer.valueOf((int) R.layout.glance_swtch_backport)), new C3959i(q0.f23073n0, Integer.valueOf((int) R.layout.glance_frame)), new C3959i(q0.f23084y0, Integer.valueOf((int) R.layout.glance_image_crop)), new C3959i(q0.f23057B0, Integer.valueOf((int) R.layout.glance_image_crop_decorative)), new C3959i(q0.f23085z0, Integer.valueOf((int) R.layout.glance_image_fit)), new C3959i(q0.f23058C0, Integer.valueOf((int) R.layout.glance_image_fit_decorative)), new C3959i(q0.f23056A0, Integer.valueOf((int) R.layout.glance_image_fill_bounds)), new C3959i(q0.f23059D0, Integer.valueOf((int) R.layout.glance_image_fill_bounds_decorative)), new C3959i(q0.f23074o0, Integer.valueOf((int) R.layout.glance_linear_progress_indicator)), new C3959i(q0.f23075p0, Integer.valueOf((int) R.layout.glance_circular_progress_indicator)), new C3959i(q0.f23076q0, Integer.valueOf((int) R.layout.glance_vertical_grid_one_column)), new C3959i(q0.f23077r0, Integer.valueOf((int) R.layout.glance_vertical_grid_two_columns)), new C3959i(q0.f23078s0, Integer.valueOf((int) R.layout.glance_vertical_grid_three_columns)), new C3959i(q0.f23079t0, Integer.valueOf((int) R.layout.glance_vertical_grid_four_columns)), new C3959i(q0.f23080u0, Integer.valueOf((int) R.layout.glance_vertical_grid_five_columns)), new C3959i(q0.f23081v0, Integer.valueOf((int) R.layout.glance_vertical_grid_auto_fit)), new C3959i(q0.f23060E0, Integer.valueOf((int) R.layout.glance_radio_button)), new C3959i(q0.f23061F0, Integer.valueOf((int) R.layout.glance_radio_button_backport)));

    /* renamed from: b  reason: collision with root package name */
    public static final int f23040b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f23041c;

    static {
        int i10;
        int size = I.f22855f.size();
        f23040b = size;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = I.f22857h;
        } else {
            i10 = I.f22857h / size;
        }
        f23041c = i10;
    }

    public static final u0 a(H0 h02, X1.m mVar, int i10) {
        int i11;
        Object obj;
        int i12;
        int i13;
        Object obj2;
        Map map;
        int i14 = Build.VERSION.SDK_INT;
        int i15 = 1;
        Context context = h02.f22835a;
        if (i14 >= 31) {
            int i16 = I.f22857h;
            if (i10 < i16) {
                E0 e02 = new E0(1, 1);
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), I.f22856g + i10);
                C2790v c2790v = (C2790v) mVar.a(null, m0.f23016i0);
                if (c2790v != null) {
                    A7.b.a0(remoteViews, c2790v, R.id.rootView);
                }
                C2782n c2782n = (C2782n) mVar.a(null, m0.f23017j0);
                if (c2782n != null) {
                    A7.b.Z(remoteViews, c2782n, R.id.rootView);
                }
                if (i14 >= 33) {
                    remoteViews.removeAllViews(R.id.rootView);
                }
                if (i14 >= 33) {
                    map = kf.w.f37484Y;
                } else {
                    map = P4.a.o0(new C3959i(0, P4.a.o0(new C3959i(e02, Integer.valueOf((int) R.id.rootStubId)))));
                }
                return new u0(remoteViews, new C1763g0(R.id.rootView, 0, map, 2));
            }
            throw new IllegalArgumentException(AbstractC2469q0.i("Index of the root view cannot be more than ", i16, ", currently ", i10).toString());
        }
        int i17 = f23040b * i10;
        int i18 = 4;
        if (i17 < I.f22857h) {
            C2790v c2790v2 = (C2790v) mVar.a(null, m0.f23014Z);
            Object obj3 = C3904f.f36007a;
            if (c2790v2 == null || (obj = c2790v2.f28797b) == null) {
                obj = obj3;
            }
            C2782n c2782n2 = (C2782n) mVar.a(null, m0.f23015h0);
            if (c2782n2 != null && (obj2 = c2782n2.f28781b) != null) {
                obj3 = obj2;
            }
            C3903e c3903e = C3903e.f36006a;
            if (AbstractC3557B.K(obj, c3903e)) {
                i12 = 4;
            } else {
                i12 = 1;
            }
            if (!AbstractC3557B.K(obj3, c3903e)) {
                i18 = 1;
            }
            if (i12 == 2) {
                i13 = 1;
            } else {
                i13 = i12;
            }
            if (i18 != 2) {
                i15 = i18;
            }
            E0 e03 = new E0(i13, i15);
            Integer num = (Integer) I.f22855f.get(e03);
            if (num != null) {
                return new u0(new RemoteViews(context.getPackageName(), i17 + I.f22856g + num.intValue()), new C1763g0(0, 0, P4.a.o0(new C3959i(0, P4.a.o0(new C3959i(e03, Integer.valueOf((int) R.id.rootStubId))))), 3));
            }
            throw new IllegalStateException("Cannot find root element for size [" + R.a.J(i12) + ", " + R.a.J(i18) + ']');
        }
        throw new IllegalArgumentException(("Index of the root view cannot be more than " + (i11 / 4) + ", currently " + i10).toString());
    }

    public static final C1763g0 b(RemoteViews remoteViews, H0 h02, q0 q0Var, int i10, X1.m mVar, C2769a c2769a, C2770b c2770b) {
        int i11;
        Integer num;
        int i12 = 10;
        if (i10 > 10) {
            AbstractC3612c.d("GlanceAppWidget", "Truncated " + q0Var + " container from " + i10 + " to 10 elements", new IllegalArgumentException(q0Var + " container cannot have more than 10 elements"));
        }
        if (i10 <= 10) {
            i12 = i10;
        }
        Integer f6 = f(q0Var, mVar);
        if (f6 != null) {
            i11 = f6.intValue();
        } else {
            C1781x c1781x = (C1781x) I.f22850a.get(new C1782y(q0Var, i12, c2769a, c2770b));
            if (c1781x != null) {
                num = Integer.valueOf(c1781x.f23122a);
            } else {
                num = null;
            }
            if (num != null) {
                i11 = num.intValue();
            } else {
                throw new IllegalArgumentException("Cannot find container " + q0Var + " with " + i10 + " children");
            }
        }
        Map map = (Map) I.f22851b.get(q0Var);
        if (map != null) {
            C1763g0 d10 = d(remoteViews, h02, i11, mVar);
            int i13 = d10.f22962b;
            int i14 = d10.f22961a;
            C1763g0 c1763g0 = new C1763g0(i14, i13, map);
            if (Build.VERSION.SDK_INT >= 33) {
                remoteViews.removeAllViews(i14);
            }
            return c1763g0;
        }
        throw new IllegalArgumentException("Cannot find generated children for " + q0Var);
    }

    public static final C1763g0 c(RemoteViews remoteViews, H0 h02, q0 q0Var, X1.m mVar) {
        Integer f6 = f(q0Var, mVar);
        if (f6 != null || (f6 = (Integer) f23039a.get(q0Var)) != null) {
            return d(remoteViews, h02, f6.intValue(), mVar);
        }
        throw new IllegalArgumentException("Cannot use `insertView` with a container like " + q0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [j2.g] */
    public static final C1763g0 d(RemoteViews remoteViews, H0 h02, int i10, X1.m mVar) {
        AbstractC3905g abstractC3905g;
        Integer num;
        int i11;
        int i12;
        ?? r32;
        C2790v c2790v = (C2790v) mVar.a(null, m0.f23018k0);
        C3904f c3904f = C3904f.f36007a;
        if (c2790v == null || (abstractC3905g = c2790v.f28797b) == null) {
            abstractC3905g = c3904f;
        }
        C2782n c2782n = (C2782n) mVar.a(null, m0.f23019l0);
        if (c2782n != null && (r32 = c2782n.f28781b) != 0) {
            c3904f = r32;
        }
        int i13 = 1;
        if (mVar.c()) {
            num = null;
        } else if (!h02.f22843i.getAndSet(true)) {
            num = 16908288;
        } else {
            throw new IllegalStateException("At most one view can be set as AppWidgetBackground.".toString());
        }
        int i14 = Build.VERSION.SDK_INT;
        int i15 = h02.f22839e;
        if (i14 >= 33) {
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = h02.f22841g.incrementAndGet();
            }
            RemoteViews a5 = l0.f23002a.a(h02.f22835a.getPackageName(), i10, i12);
            int i16 = h02.f22842h.f22961a;
            if (i14 >= 31) {
                w0.f23121a.a(remoteViews, i16, a5, i15);
            } else {
                remoteViews.addView(i16, a5);
            }
            return new C1763g0(i12, 0, null, 6);
        } else if (i14 >= 31) {
            C3902d c3902d = C3902d.f36005a;
            if (AbstractC3557B.K(abstractC3905g, c3902d)) {
                i11 = 3;
            } else {
                i11 = 1;
            }
            if (AbstractC3557B.K(c3904f, c3902d)) {
                i13 = 3;
            }
            return new C1763g0(AbstractC5260f.y(remoteViews, h02, e(remoteViews, h02, i15, i11, i13), i10, num), 0, null, 6);
        } else {
            int g10 = g(abstractC3905g);
            int g11 = g(c3904f);
            int e10 = e(remoteViews, h02, i15, g10, g11);
            if (g10 != 2 && g11 != 2) {
                return new C1763g0(AbstractC5260f.y(remoteViews, h02, e10, i10, num), 0, null, 6);
            }
            k0 k0Var = (k0) I.f22854e.get(new E0(g10, g11));
            if (k0Var != null) {
                return new C1763g0(AbstractC5260f.y(remoteViews, h02, R.id.glanceViewStub, i10, num), AbstractC5260f.y(remoteViews, h02, e10, k0Var.f22997a, null), null, 4);
            }
            throw new IllegalArgumentException("Could not find complex layout for width=" + R.a.J(g10) + ", height=" + R.a.J(g11));
        }
    }

    public static final int e(RemoteViews remoteViews, H0 h02, int i10, int i11, int i12) {
        int i13;
        int i14 = 1;
        if (i11 == 2) {
            i13 = 1;
        } else {
            i13 = i11;
        }
        if (i12 != 2) {
            i14 = i12;
        }
        E0 e02 = new E0(i13, i14);
        Map map = (Map) h02.f22842h.f22963c.get(Integer.valueOf(i10));
        if (map != null) {
            Integer num = (Integer) map.get(e02);
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : map.values()) {
                    if (((Number) obj).intValue() != intValue) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC5260f.y(remoteViews, h02, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf((int) R.id.deletedViewId));
                }
                return intValue;
            }
            StringBuilder q10 = android.gov.nist.core.a.q("No child for position ", i10, " and size ");
            q10.append(R.a.J(i11));
            q10.append(" x ");
            q10.append(R.a.J(i12));
            throw new IllegalStateException(q10.toString());
        }
        throw new IllegalStateException(android.gov.nist.core.a.e("Parent doesn't have child position ", i10));
    }

    public static final Integer f(q0 q0Var, X1.m mVar) {
        boolean z10;
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        C1750a c1750a = (C1750a) mVar.a(null, m0.f23020m0);
        C2790v c2790v = (C2790v) mVar.a(null, m0.f23021n0);
        C3902d c3902d = C3902d.f36005a;
        boolean z11 = false;
        if (c2790v != null) {
            z10 = AbstractC3557B.K(c2790v.f28797b, c3902d);
        } else {
            z10 = false;
        }
        C2782n c2782n = (C2782n) mVar.a(null, m0.f23022o0);
        if (c2782n != null) {
            z11 = AbstractC3557B.K(c2782n.f28781b, c3902d);
        }
        if (c1750a != null) {
            Map map = I.f22852c;
            C2771c c2771c = c1750a.f22939b;
            k0 k0Var = (k0) map.get(new C1778u(q0Var, c2771c.f28751a, c2771c.f28752b));
            if (k0Var != null) {
                return Integer.valueOf(k0Var.f22997a);
            }
            throw new IllegalArgumentException("Cannot find " + q0Var + " with alignment " + c2771c);
        } else if (!z10 && !z11) {
            return null;
        } else {
            k0 k0Var2 = (k0) I.f22853d.get(new x0(q0Var, z10, z11));
            if (k0Var2 != null) {
                return Integer.valueOf(k0Var2.f22997a);
            }
            throw new IllegalArgumentException("Cannot find " + q0Var + " with defaultWeight set");
        }
    }

    public static final int g(AbstractC3905g abstractC3905g) {
        if (abstractC3905g instanceof C3904f) {
            return 1;
        }
        if (abstractC3905g instanceof C3902d) {
            return 3;
        }
        if (abstractC3905g instanceof C3903e) {
            return 4;
        }
        if (abstractC3905g instanceof C3901c) {
            return 2;
        }
        throw new RuntimeException();
    }
}
