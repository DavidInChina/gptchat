package Z1;

import Qg.AbstractC1206i;
import Qg.C1198e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1737t0;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.util.DisplayMetrics;
import id.AbstractC3557B;
import nf.AbstractC4828h;

/* renamed from: Z1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1769k extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22994Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f22995Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1771m f22996h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1769k(Context context, C1771m c1771m, int i10) {
        super(2);
        this.f22994Y = i10;
        this.f22995Z = context;
        this.f22996h0 = c1771m;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        wf.n nVar;
        jf.y yVar;
        long j6;
        int i11;
        int i12 = this.f22994Y;
        C1771m c1771m = this.f22996h0;
        Context context = this.f22995Z;
        switch (i12) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-492369756);
                Object K10 = rVar2.K();
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (K10 == iVar) {
                    Object systemService = context.getSystemService("appwidget");
                    AbstractC3557B.a0("null cannot be cast to non-null type android.appwidget.AppWidgetManager", systemService);
                    K10 = (AppWidgetManager) systemService;
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                AppWidgetManager appWidgetManager = (AppWidgetManager) K10;
                rVar2.W(-492369756);
                Object K11 = rVar2.K();
                if (K11 == iVar) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(c1771m.f23004d.f22945a);
                    if (appWidgetInfo == null) {
                        j6 = Z0.g.f22792b;
                    } else {
                        int i13 = appWidgetInfo.minWidth;
                        int i14 = Integer.MAX_VALUE;
                        if ((1 & appWidgetInfo.resizeMode) != 0) {
                            i11 = appWidgetInfo.minResizeWidth;
                        } else {
                            i11 = Integer.MAX_VALUE;
                        }
                        int min = Math.min(i13, i11);
                        int i15 = appWidgetInfo.minHeight;
                        if ((2 & appWidgetInfo.resizeMode) != 0) {
                            i14 = appWidgetInfo.minResizeHeight;
                        }
                        int min2 = Math.min(i15, i14);
                        float f6 = displayMetrics.density;
                        j6 = AbstractC4828h.g(min / f6, min2 / f6);
                    }
                    Z0.g gVar = new Z0.g(j6);
                    rVar2.h0(gVar);
                    K11 = gVar;
                }
                rVar2.t(false);
                long j10 = ((Z0.g) K11).f22795a;
                AbstractC1710f0 d02 = AbstractC4828h.d0(Boolean.FALSE, new C1768j(c1771m, appWidgetManager, context, null), rVar2);
                rVar2.W(-492369756);
                Object K12 = rVar2.K();
                if (K12 == iVar) {
                    K12 = new C1198e(new C1775q(c1771m.f23003c, context, c1771m.f23004d, null));
                    rVar2.h0(K12);
                }
                rVar2.t(false);
                AbstractC1710f0 y10 = AbstractC4828h.y((AbstractC1206i) K12, null, null, rVar2, 56, 2);
                if (!((Boolean) d02.getValue()).booleanValue()) {
                    y10 = null;
                }
                if (y10 != null) {
                    nVar = (wf.n) y10.getValue();
                } else {
                    nVar = null;
                }
                rVar2.W(-1186217115);
                if (nVar == null) {
                    yVar = null;
                } else {
                    R4.b.m(48, j10, rVar2, c1771m.f23003c.f22889c, nVar);
                    yVar = jf.y.f36177a;
                }
                rVar2.t(false);
                rVar2.W(-1186217263);
                if (yVar == null) {
                    K4.J.d(rVar2, 0);
                }
                rVar2.t(false);
                AbstractC1734s.g(new X0.b(3, c1771m), rVar2);
                return;
            default:
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                A7.b.l(new C1737t0[]{X1.g.f21743b.b(context), X1.g.f21745d.b(c1771m.f23004d), AbstractC1780w.f23120a.b(c1771m.f23008h.getValue()), X1.g.f21744c.b(c1771m.f23007g.getValue())}, R4.b.X(abstractC1725n, 1688971311, new C1769k(context, c1771m, 0)), abstractC1725n, 56);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f22994Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
