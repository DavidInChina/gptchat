package Z1;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.openai.chatgpt.R;
import g2.AbstractC3155m;
import h2.C3309f;
import h2.C3311h;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a  reason: collision with root package name */
    public final int f22887a = R.layout.glance_error_layout;

    /* renamed from: b  reason: collision with root package name */
    public final D5.a f22888b = g2.s.f31134a;

    /* renamed from: c  reason: collision with root package name */
    public final C0 f22889c = C0.f22824a;

    /* renamed from: d  reason: collision with root package name */
    public final C3311h f22890d = C3311h.f31776a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, int i10, AbstractC4825e abstractC4825e) {
        J j6;
        N n10;
        Context context2;
        int i11;
        Throwable th2;
        C3311h c3311h;
        C3311h c3311h2;
        C3311h c3311h3;
        AbstractC3155m abstractC3155m;
        if (abstractC4825e instanceof J) {
            j6 = (J) abstractC4825e;
            int i12 = j6.f22864k0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                j6.f22864k0 = i12 - Integer.MIN_VALUE;
                Object obj = j6.f22862i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                switch (j6.f22864k0) {
                    case 0:
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        D5.a aVar = this.f22888b;
                        String f02 = r9.y.f0(i10);
                        j6.f22859Y = this;
                        j6.f22860Z = context;
                        j6.getClass();
                        j6.f22861h0 = i10;
                        j6.f22864k0 = 1;
                        synchronized (aVar.f3417a) {
                            abstractC3155m = (AbstractC3155m) aVar.f3417a.remove(f02);
                        }
                        if (abstractC3155m != null) {
                            abstractC3155m.f31118b.l(null);
                        }
                        if (jf.y.f36177a == enumC5000a) {
                            return enumC5000a;
                        }
                        n10 = this;
                        try {
                            j6.f22859Y = n10;
                            j6.f22860Z = context;
                            j6.getClass();
                            j6.f22861h0 = i10;
                            j6.f22864k0 = 2;
                            n10.getClass();
                        } catch (CancellationException unused) {
                            int i13 = i10;
                            context2 = context;
                            i11 = i13;
                            c3311h2 = n10.f22890d;
                            if (c3311h2 != null) {
                            }
                            return jf.y.f36177a;
                        } catch (Throwable th3) {
                            th = th3;
                            int i14 = i10;
                            context2 = context;
                            i11 = i14;
                            try {
                                AbstractC3612c.d("GlanceAppWidget", "Error in user-provided deletion callback", th);
                                c3311h = n10.f22890d;
                                if (c3311h != null) {
                                }
                                return jf.y.f36177a;
                            } catch (Throwable th4) {
                                C3311h c3311h4 = n10.f22890d;
                                if (c3311h4 != null) {
                                    C3309f c3309f = C3309f.f31773a;
                                    String f03 = r9.y.f0(i11);
                                    j6.f22859Y = th4;
                                    j6.f22860Z = null;
                                    j6.getClass();
                                    j6.f22864k0 = 6;
                                    if (c3309f.a(context2, c3311h4, f03, j6) == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    th2 = th4;
                                    break;
                                } else {
                                    throw th4;
                                }
                            }
                        }
                        if (jf.y.f36177a != enumC5000a) {
                            return enumC5000a;
                        }
                        int i15 = i10;
                        context2 = context;
                        i11 = i15;
                        c3311h3 = n10.f22890d;
                        if (c3311h3 != null) {
                            C3309f c3309f2 = C3309f.f31773a;
                            String f04 = r9.y.f0(i11);
                            j6.f22859Y = null;
                            j6.f22860Z = null;
                            j6.f22864k0 = 3;
                            if (c3309f2.a(context2, c3311h3, f04, j6) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        return jf.y.f36177a;
                    case 1:
                        i10 = j6.f22861h0;
                        context = j6.f22860Z;
                        n10 = (N) j6.f22859Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        j6.f22859Y = n10;
                        j6.f22860Z = context;
                        j6.getClass();
                        j6.f22861h0 = i10;
                        j6.f22864k0 = 2;
                        n10.getClass();
                        if (jf.y.f36177a != enumC5000a) {
                        }
                        break;
                    case 2:
                        i11 = j6.f22861h0;
                        context2 = j6.f22860Z;
                        n10 = (N) j6.f22859Y;
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            c3311h3 = n10.f22890d;
                            if (c3311h3 != null) {
                            }
                        } catch (CancellationException unused2) {
                            c3311h2 = n10.f22890d;
                            if (c3311h2 != null) {
                                C3309f c3309f3 = C3309f.f31773a;
                                String f05 = r9.y.f0(i11);
                                j6.f22859Y = null;
                                j6.f22860Z = null;
                                j6.getClass();
                                j6.f22864k0 = 4;
                                if (c3309f3.a(context2, c3311h2, f05, j6) == enumC5000a) {
                                    return enumC5000a;
                                }
                            }
                            return jf.y.f36177a;
                        } catch (Throwable th5) {
                            th = th5;
                            AbstractC3612c.d("GlanceAppWidget", "Error in user-provided deletion callback", th);
                            c3311h = n10.f22890d;
                            if (c3311h != null) {
                                C3309f c3309f4 = C3309f.f31773a;
                                String f06 = r9.y.f0(i11);
                                j6.f22859Y = null;
                                j6.f22860Z = null;
                                j6.getClass();
                                j6.f22864k0 = 5;
                                if (c3309f4.a(context2, c3311h, f06, j6) == enumC5000a) {
                                    return enumC5000a;
                                }
                            }
                            return jf.y.f36177a;
                        }
                        return jf.y.f36177a;
                    case 3:
                    case 4:
                    case 5:
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return jf.y.f36177a;
                    case 6:
                        th2 = (Throwable) j6.f22859Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        throw th2;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        j6 = new J(this, abstractC4825e);
        Object obj2 = j6.f22862i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        switch (j6.f22864k0) {
        }
    }

    public abstract void b(Context context, AbstractC4825e abstractC4825e);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, int i10, Bundle bundle, AbstractC4825e abstractC4825e) {
        K k10;
        int i11;
        Context context2;
        C1754c c1754c;
        N n10;
        if (abstractC4825e instanceof K) {
            k10 = (K) abstractC4825e;
            int i12 = k10.f22871l0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                k10.f22871l0 = i12 - Integer.MIN_VALUE;
                Object obj = k10.f22869j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = k10.f22871l0;
                jf.y yVar = jf.y.f36177a;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        c1754c = k10.f22868i0;
                        bundle = k10.f22867h0;
                        context2 = k10.f22866Z;
                        n10 = k10.f22865Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        if (((Boolean) obj).booleanValue()) {
                            D5.a aVar = n10.f22888b;
                            C1771m c1771m = new C1771m(n10, c1754c, bundle, 8);
                            k10.f22865Y = null;
                            k10.f22866Z = null;
                            k10.f22867h0 = null;
                            k10.f22868i0 = null;
                            k10.f22871l0 = 2;
                            if (aVar.e(context2, c1771m, k10) == enumC5000a) {
                                return enumC5000a;
                            }
                        } else {
                            AbstractC3155m a5 = n10.f22888b.a(r9.y.f0(c1754c.f22945a));
                            AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession", a5);
                            k10.f22865Y = null;
                            k10.f22866Z = null;
                            k10.f22867h0 = null;
                            k10.f22868i0 = null;
                            k10.f22871l0 = 3;
                            Object d10 = ((C1771m) a5).d(new C1758e(bundle), k10);
                            if (d10 != enumC5000a) {
                                d10 = yVar;
                            }
                            if (d10 == enumC5000a) {
                                return enumC5000a;
                            }
                            return yVar;
                        }
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (!(this.f22889c instanceof C0)) {
                        C1754c c1754c2 = new C1754c(i10);
                        String f02 = r9.y.f0(i10);
                        k10.f22865Y = this;
                        k10.f22866Z = context;
                        k10.f22867h0 = bundle;
                        k10.f22868i0 = c1754c2;
                        k10.f22871l0 = 1;
                        Object d11 = this.f22888b.d(context, f02, k10);
                        if (d11 == enumC5000a) {
                            return enumC5000a;
                        }
                        n10 = this;
                        context2 = context;
                        c1754c = c1754c2;
                        obj = d11;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return yVar;
                }
                return yVar;
            }
        }
        k10 = new K(this, abstractC4825e);
        Object obj2 = k10.f22869j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = k10.f22871l0;
        jf.y yVar2 = jf.y.f36177a;
        if (i11 == 0) {
        }
        return yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, int i10, String str, Bundle bundle, AbstractC4825e abstractC4825e) {
        L l10;
        Object obj;
        int i11;
        C1771m c1771m;
        Object d10;
        String str2;
        Context context2;
        C1754c c1754c;
        N n10;
        if (abstractC4825e instanceof L) {
            l10 = (L) abstractC4825e;
            int i12 = l10.f22879m0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                l10.f22879m0 = i12 - Integer.MIN_VALUE;
                obj = l10.f22877k0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = l10.f22879m0;
                jf.y yVar = jf.y.f36177a;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1771m = (C1771m) l10.f22873Z;
                        str2 = (String) l10.f22872Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        str = str2;
                        l10.f22872Y = null;
                        l10.f22873Z = null;
                        l10.f22874h0 = null;
                        l10.f22875i0 = null;
                        l10.f22876j0 = null;
                        l10.f22879m0 = 3;
                        c1771m.getClass();
                        d10 = c1771m.d(new C1756d(str), l10);
                        if (d10 != enumC5000a) {
                            d10 = yVar;
                        }
                        if (d10 == enumC5000a) {
                            return enumC5000a;
                        }
                        return yVar;
                    }
                    c1754c = l10.f22876j0;
                    bundle = l10.f22875i0;
                    str = l10.f22874h0;
                    context2 = (Context) l10.f22873Z;
                    n10 = (N) l10.f22872Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C1754c c1754c2 = new C1754c(i10);
                    String f02 = r9.y.f0(i10);
                    l10.f22872Y = this;
                    l10.f22873Z = context;
                    l10.f22874h0 = str;
                    l10.f22875i0 = bundle;
                    l10.f22876j0 = c1754c2;
                    l10.f22879m0 = 1;
                    Object d11 = this.f22888b.d(context, f02, l10);
                    if (d11 == enumC5000a) {
                        return enumC5000a;
                    }
                    n10 = this;
                    context2 = context;
                    c1754c = c1754c2;
                    obj = d11;
                }
                if (((Boolean) obj).booleanValue()) {
                    C1771m c1771m2 = new C1771m(n10, c1754c, bundle, 8);
                    D5.a aVar = n10.f22888b;
                    l10.f22872Y = str;
                    l10.f22873Z = c1771m2;
                    l10.f22874h0 = null;
                    l10.f22875i0 = null;
                    l10.f22876j0 = null;
                    l10.f22879m0 = 2;
                    if (aVar.e(context2, c1771m2, l10) == enumC5000a) {
                        return enumC5000a;
                    }
                    str2 = str;
                    c1771m = c1771m2;
                    str = str2;
                    l10.f22872Y = null;
                    l10.f22873Z = null;
                    l10.f22874h0 = null;
                    l10.f22875i0 = null;
                    l10.f22876j0 = null;
                    l10.f22879m0 = 3;
                    c1771m.getClass();
                    d10 = c1771m.d(new C1756d(str), l10);
                    if (d10 != enumC5000a) {
                    }
                    if (d10 == enumC5000a) {
                    }
                } else {
                    AbstractC3155m a5 = n10.f22888b.a(r9.y.f0(c1754c.f22945a));
                    AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession", a5);
                    c1771m = (C1771m) a5;
                    l10.f22872Y = null;
                    l10.f22873Z = null;
                    l10.f22874h0 = null;
                    l10.f22875i0 = null;
                    l10.f22876j0 = null;
                    l10.f22879m0 = 3;
                    c1771m.getClass();
                    d10 = c1771m.d(new C1756d(str), l10);
                    if (d10 != enumC5000a) {
                    }
                    if (d10 == enumC5000a) {
                    }
                }
            }
        }
        l10 = new L(this, abstractC4825e);
        obj = l10.f22877k0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = l10.f22879m0;
        jf.y yVar2 = jf.y.f36177a;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Context context, int i10, Bundle bundle, AbstractC4825e abstractC4825e) {
        M m10;
        Object obj;
        int i11;
        Context context2;
        C1754c c1754c;
        N n10;
        if (abstractC4825e instanceof M) {
            m10 = (M) abstractC4825e;
            int i12 = m10.f22886l0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                m10.f22886l0 = i12 - Integer.MIN_VALUE;
                obj = m10.f22884j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = m10.f22886l0;
                jf.y yVar = jf.y.f36177a;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                com.google.android.gms.internal.play_billing.N.B0(obj);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                    c1754c = m10.f22883i0;
                    bundle = m10.f22882h0;
                    context2 = m10.f22881Z;
                    n10 = m10.f22880Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AtomicBoolean atomicBoolean = F0.f22830a;
                    if (Build.VERSION.SDK_INT >= 29 && F0.f22830a.get()) {
                        G0.f22833a.a("GlanceAppWidget::update", 0);
                    }
                    C1754c c1754c2 = new C1754c(i10);
                    String f02 = r9.y.f0(i10);
                    m10.f22880Y = this;
                    m10.f22881Z = context;
                    m10.f22882h0 = bundle;
                    m10.f22883i0 = c1754c2;
                    m10.f22886l0 = 1;
                    Object d10 = this.f22888b.d(context, f02, m10);
                    if (d10 == enumC5000a) {
                        return enumC5000a;
                    }
                    n10 = this;
                    context2 = context;
                    c1754c = c1754c2;
                    obj = d10;
                }
                if (((Boolean) obj).booleanValue()) {
                    D5.a aVar = n10.f22888b;
                    C1771m c1771m = new C1771m(n10, c1754c, bundle, 8);
                    m10.f22880Y = null;
                    m10.f22881Z = null;
                    m10.f22882h0 = null;
                    m10.f22883i0 = null;
                    m10.f22886l0 = 2;
                    if (aVar.e(context2, c1771m, m10) == enumC5000a) {
                        return enumC5000a;
                    }
                    return yVar;
                }
                AbstractC3155m a5 = n10.f22888b.a(r9.y.f0(c1754c.f22945a));
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.appwidget.AppWidgetSession", a5);
                m10.f22880Y = null;
                m10.f22881Z = null;
                m10.f22882h0 = null;
                m10.f22883i0 = null;
                m10.f22886l0 = 3;
                Object d11 = ((C1771m) a5).d(C1760f.f22957a, m10);
                if (d11 != enumC5000a) {
                    d11 = yVar;
                }
                if (d11 == enumC5000a) {
                    return enumC5000a;
                }
                return yVar;
            }
        }
        m10 = new M(this, abstractC4825e);
        obj = m10.f22884j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = m10.f22886l0;
        jf.y yVar2 = jf.y.f36177a;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
