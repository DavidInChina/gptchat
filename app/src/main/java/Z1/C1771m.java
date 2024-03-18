package Z1;

import Z.C1712g0;
import Z.C1724m0;
import a1.C1915c;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import b2.C2114i;
import c1.AbstractC2279d;
import g2.AbstractC3155m;
import h2.AbstractC3304a;
import h2.C3309f;
import h2.C3311h;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j0.AbstractC3893i;
import j0.C3887c;
import java.util.List;
import java.util.Map;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* renamed from: Z1.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1771m extends AbstractC3155m {

    /* renamed from: c  reason: collision with root package name */
    public final N f23003c;

    /* renamed from: d  reason: collision with root package name */
    public final C1754c f23004d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f23005e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC3304a f23006f;

    /* renamed from: g  reason: collision with root package name */
    public final C1724m0 f23007g;

    /* renamed from: h  reason: collision with root package name */
    public final C1724m0 f23008h;

    /* renamed from: i  reason: collision with root package name */
    public Map f23009i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771m(N n10, C1754c c1754c, Bundle bundle, int i10) {
        super(r9.y.f0(c1754c.f22945a));
        bundle = (i10 & 4) != 0 ? null : bundle;
        C3309f c3309f = C3309f.f31773a;
        this.f23003c = n10;
        this.f23004d = c1754c;
        this.f23005e = bundle;
        this.f23006f = c3309f;
        C1712g0 c1712g0 = C1712g0.f22623a;
        this.f23007g = AbstractC4828h.Z(null, c1712g0);
        this.f23008h = AbstractC4828h.Z(new Bundle(), c1712g0);
        this.f23009i = kf.w.f37484Y;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:2|(2:4|(9:6|8|(1:(1:(4:18|56|79|80)(1:(2:15|16)(3:17|74|75)))(1:19))(2:20|(2:22|23)(2:24|(1:26)(1:27)))|28|83|29|30|85|(10:32|c0|50|51|52|53|(1:55)|56|79|80)(2:61|62)))|7|8|(0)(0)|28|83|29|30|85|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015c, code lost:
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0160, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0161, code lost:
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0181, code lost:
        if (r7.f23003c.f22887a != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0183, code lost:
        io.sentry.android.core.AbstractC3612c.d("GlanceAppWidget", "Error in Glance App Widget", r0);
        r8.updateAppWidget(r7.f23004d.f22945a, new android.widget.RemoteViews(r2.getPackageName(), r7.f23003c.f22887a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019e, code lost:
        r5.f22964Y = r11;
        r5.f22965Z = r11;
        r5.f22966h0 = r11;
        r5.f22969k0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01aa, code lost:
        if (r3.a(r5) == r6) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ac, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ad, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01af, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b0, code lost:
        r5.f22964Y = r0;
        r5.f22965Z = r11;
        r5.f22966h0 = r11;
        r5.f22969k0 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01bd, code lost:
        if (r3.a(r5) == r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bf, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c4, code lost:
        r5.f22964Y = r11;
        r5.f22965Z = r11;
        r5.f22966h0 = r11;
        r5.f22969k0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d1, code lost:
        if (r3.a(r5) == r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d3, code lost:
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5 A[Catch: CancellationException -> 0x015c, all -> 0x0160, TRY_ENTER, TryCatch #6 {CancellationException -> 0x015c, all -> 0x0160, blocks: (B:29:0x0099, B:32:0x00a5, B:33:0x00c0, B:37:0x00da, B:48:0x012d, B:50:0x0130), top: B:83:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0163 A[Catch: all -> 0x015a, CancellationException -> 0x01c4, TryCatch #5 {CancellationException -> 0x01c4, all -> 0x015a, blocks: (B:52:0x013d, B:61:0x0163, B:62:0x017c, B:34:0x00c1, B:36:0x00cb, B:39:0x00e2, B:40:0x00e4, B:42:0x00f0, B:45:0x00fb, B:46:0x0106, B:47:0x0107), top: B:85:0x00a3 }] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.content.Context, java.lang.Object, X1.j] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.content.Context, java.lang.Object, X1.j] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // g2.AbstractC3155m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, X1.j jVar, AbstractC4825e abstractC4825e) {
        C1764h c1764h;
        int i10;
        C1771m c1771m;
        Context context2;
        X1.j jVar2;
        AppWidgetProviderInfo appWidgetInfo;
        int i11;
        if (abstractC4825e instanceof C1764h) {
            c1764h = (C1764h) abstractC4825e;
            int i12 = c1764h.f22969k0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c1764h.f22969k0 = i12 - Integer.MIN_VALUE;
                Object obj = c1764h.f22967i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1764h.f22969k0;
                ?? r11 = 3;
                ?? r112 = 3;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2 && i10 != 3 && i10 != 4) {
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th2 = (Throwable) c1764h.f22964Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            F0.a();
                            throw th2;
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        F0.a();
                        return Boolean.TRUE;
                    }
                    jVar2 = c1764h.f22966h0;
                    context2 = c1764h.f22965Z;
                    c1771m = (C1771m) c1764h.f22964Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (K4.J.c0(jVar)) {
                        return Boolean.FALSE;
                    }
                    AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.appwidget.RemoteViewsRoot", jVar);
                    v0 v0Var = (v0) jVar;
                    C1915c c1915c = j0.f22987g;
                    int i13 = this.f23004d.f22945a;
                    c1764h.f22964Y = this;
                    c1764h.f22965Z = context;
                    c1764h.f22966h0 = jVar;
                    c1764h.f22969k0 = 1;
                    obj = c1915c.r(context, i13, c1764h);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c1771m = this;
                    context2 = context;
                    jVar2 = jVar;
                }
                j0 j0Var = (j0) obj;
                Object systemService = context2.getSystemService("appwidget");
                AbstractC3557B.a0("null cannot be cast to non-null type android.appwidget.AppWidgetManager", systemService);
                AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                appWidgetInfo = appWidgetManager.getAppWidgetInfo(c1771m.f23004d.f22945a);
                C1754c c1754c = c1771m.f23004d;
                if (appWidgetInfo == null) {
                    ComponentName componentName = appWidgetInfo.provider;
                    AbstractC2279d.r((v0) jVar2);
                    c1771m.f23009i = AbstractC2279d.C(jVar2);
                    int i14 = c1754c.f22945a;
                    v0 v0Var2 = (v0) jVar2;
                    j0Var.getClass();
                    C2114i A10 = AbstractC4828h.A(jVar2);
                    synchronized (j0Var) {
                        Integer num = (Integer) j0Var.f22989b.get(A10);
                        if (num != null) {
                            int intValue = num.intValue();
                            j0Var.f22992e.add(Integer.valueOf(intValue));
                            i11 = intValue;
                        } else {
                            int i15 = j0Var.f22990c;
                            while (j0Var.f22993f.contains(Integer.valueOf(i15))) {
                                i15 = (i15 + 1) % n0.f23041c;
                                if (i15 == j0Var.f22990c) {
                                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.".toString());
                                }
                            }
                            j0Var.f22990c = (i15 + 1) % n0.f23041c;
                            j0Var.f22992e.add(Integer.valueOf(i15));
                            j0Var.f22993f.add(Integer.valueOf(i15));
                            j0Var.f22989b.put(A10, Integer.valueOf(i15));
                            i11 = i15;
                        }
                    }
                    appWidgetManager.updateAppWidget(c1754c.f22945a, AbstractC5260f.W(context2, i14, v0Var2, j0Var, i11, Z0.g.f22793c, componentName));
                    c1764h.f22964Y = null;
                    c1764h.f22965Z = null;
                    c1764h.f22966h0 = null;
                    c1764h.f22969k0 = 2;
                    if (j0Var.a(c1764h) == enumC5000a) {
                        return enumC5000a;
                    }
                    F0.a();
                    return Boolean.TRUE;
                }
                throw new IllegalArgumentException(("No app widget info for " + c1754c.f22945a).toString());
            }
        }
        c1764h = new C1764h(this, abstractC4825e);
        Object obj2 = c1764h.f22967i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1764h.f22969k0;
        ?? r113 = 3;
        ?? r1122 = 3;
        if (i10 == 0) {
        }
        j0 j0Var2 = (j0) obj2;
        Object systemService2 = context2.getSystemService("appwidget");
        AbstractC3557B.a0("null cannot be cast to non-null type android.appwidget.AppWidgetManager", systemService2);
        AppWidgetManager appWidgetManager2 = (AppWidgetManager) systemService2;
        appWidgetInfo = appWidgetManager2.getAppWidgetInfo(c1771m.f23004d.f22945a);
        C1754c c1754c2 = c1771m.f23004d;
        if (appWidgetInfo == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // g2.AbstractC3155m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, Object obj, AbstractC4825e abstractC4825e) {
        C1766i c1766i;
        int i10;
        C1771m c1771m;
        C3887c i11;
        if (abstractC4825e instanceof C1766i) {
            c1766i = (C1766i) abstractC4825e;
            int i12 = c1766i.f22978i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c1766i.f22978i0 = i12 - Integer.MIN_VALUE;
                Object obj2 = c1766i.f22976Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c1766i.f22978i0;
                jf.y yVar = jf.y.f36177a;
                jf.y yVar2 = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1771m = c1766i.f22975Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    int i13 = AbstractC3893i.f35891e;
                    i11 = io.sentry.hints.i.i(null, null);
                    try {
                        AbstractC3893i j6 = i11.j();
                        c1771m.f23007g.setValue(obj2);
                        AbstractC3893i.p(j6);
                        i11.v().a0();
                    } finally {
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    boolean z10 = obj instanceof C1760f;
                    String str = this.f31117a;
                    if (z10) {
                        C3311h c3311h = this.f23003c.f22890d;
                        if (c3311h != null) {
                            c1766i.f22975Y = this;
                            c1766i.f22978i0 = 1;
                            obj2 = ((C3309f) this.f23006f).c(context, c3311h, str, c1766i);
                            if (obj2 == enumC5000a) {
                                return enumC5000a;
                            }
                            c1771m = this;
                        } else {
                            c1771m = this;
                            obj2 = null;
                        }
                        int i132 = AbstractC3893i.f35891e;
                        i11 = io.sentry.hints.i.i(null, null);
                        AbstractC3893i j62 = i11.j();
                        c1771m.f23007g.setValue(obj2);
                        AbstractC3893i.p(j62);
                        i11.v().a0();
                    } else if (obj instanceof C1758e) {
                        int i14 = AbstractC3893i.f35891e;
                        i11 = io.sentry.hints.i.i(null, null);
                        try {
                            AbstractC3893i j10 = i11.j();
                            this.f23008h.setValue(((C1758e) obj).f22955a);
                            AbstractC3893i.p(j10);
                            i11.v().a0();
                        } finally {
                        }
                    } else if (obj instanceof C1756d) {
                        int i15 = AbstractC3893i.f35891e;
                        i11 = io.sentry.hints.i.i(null, null);
                        try {
                            AbstractC3893i j11 = i11.j();
                            List<Y1.f> list = (List) this.f23009i.get(((C1756d) obj).f22950a);
                            if (list != null) {
                                for (Y1.f fVar : list) {
                                    fVar.f22052b.mo122invoke();
                                }
                                yVar2 = yVar;
                            }
                            AbstractC3893i.p(j11);
                            i11.v().a0();
                            if (yVar2 == null) {
                                P4.a.p(AbstractC3612c.r("AppWidgetSession", "Triggering Action(" + ((C1756d) obj).f22950a + ") for session(" + str + ") failed"));
                            }
                        } finally {
                        }
                    } else if (obj instanceof C1762g) {
                        Pg.o oVar = ((C1762g) obj).f22960a;
                        c1766i.f22978i0 = 2;
                        if (oVar.n(yVar, c1766i) == enumC5000a) {
                            return enumC5000a;
                        }
                        return yVar;
                    } else {
                        throw new IllegalArgumentException("Sent unrecognized event type " + obj.getClass() + " to AppWidgetSession");
                    }
                }
                return yVar;
            }
        }
        c1766i = new C1766i(this, abstractC4825e);
        Object obj22 = c1766i.f22976Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c1766i.f22978i0;
        jf.y yVar3 = jf.y.f36177a;
        jf.y yVar22 = null;
        if (i10 == 0) {
        }
        return yVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(AbstractC4825e abstractC4825e) {
        C1770l c1770l;
        Object obj;
        int i10;
        C1762g c1762g;
        Pg.o oVar;
        if (abstractC4825e instanceof C1770l) {
            c1770l = (C1770l) abstractC4825e;
            int i11 = c1770l.f23001i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1770l.f23001i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c1770l.f22999Z;
                obj = EnumC5000a.f41328Y;
                i10 = c1770l.f23001i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1762g = c1770l.f22998Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    c1762g = new C1762g();
                    c1770l.f22998Y = c1762g;
                    c1770l.f23001i0 = 1;
                    if (d(c1762g, c1770l) == obj) {
                        return obj;
                    }
                }
                oVar = c1762g.f22960a;
                c1770l.f22998Y = null;
                c1770l.f23001i0 = 2;
                if (oVar.g(c1770l) == obj) {
                    return obj;
                }
                return jf.y.f36177a;
            }
        }
        c1770l = new C1770l(this, abstractC4825e);
        Object obj22 = c1770l.f22999Z;
        obj = EnumC5000a.f41328Y;
        i10 = c1770l.f23001i0;
        if (i10 == 0) {
        }
        oVar = c1762g.f22960a;
        c1770l.f22998Y = null;
        c1770l.f23001i0 = 2;
        if (oVar.g(c1770l) == obj) {
        }
        return jf.y.f36177a;
    }
}
