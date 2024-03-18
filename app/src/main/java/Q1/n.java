package Q1;

import E2.C0488u;
import E2.C0492y;
import G0.C0571a;
import Ii.C0799d;
import M3.AbstractC0935d;
import M3.J;
import N.C1025i;
import V1.C1467h;
import V1.C1471l;
import V1.Z;
import V1.e0;
import android.app.Application;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import id.AbstractC3557B;
import io.sentry.C3636c1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import jf.C3959i;
import jf.C3964n;
import kf.AbstractC4268D;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.EglRenderer;
import livekit.org.webrtc.VideoFileRenderer;
import livekit.org.webrtc.VideoFrame;
import p2.C5065s;
import p2.X;
import p5.EnumC5090b;
import q5.C5274d;
import r5.AbstractC5368c;
import s2.AbstractC5530A;
import u5.RunnableC5841a;
import v.C5936e;
import v8.C5997e;
import x8.K;
import x8.N;
import x8.k0;
import y2.C6504G;
import y2.C6521h;
import y2.SurfaceHolder$CallbackC6500C;
import y2.U;
import y2.c0;
import z2.C6757b;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14338Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f14339Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f14340h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f14341i0;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i10) {
        this.f14338Y = i10;
        this.f14339Z = obj;
        this.f14340h0 = obj2;
        this.f14341i0 = obj3;
    }

    private final void a() {
        t7.j jVar = (t7.j) this.f14339Z;
        Bi.c cVar = (Bi.c) this.f14340h0;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f14341i0;
        jVar.getClass();
        try {
            y y10 = Df.H.y(jVar.f45780a);
            if (y10 != null) {
                x xVar = (x) y10.f14322a;
                synchronized (xVar.f14364d) {
                    xVar.f14366f = threadPoolExecutor;
                }
                y10.f14322a.a(new o(cVar, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th2) {
            cVar.s1(th2);
            threadPoolExecutor.shutdown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        d6.c cVar;
        d6.b bVar;
        int ordinal;
        Object obj;
        q5.g gVar;
        C3964n c3964n;
        String str;
        d6.b bVar2;
        Map a12;
        C0571a c0571a;
        String str2;
        String str3;
        AbstractC5368c h10;
        switch (this.f14338Y) {
            case 0:
                a();
                return;
            case 1:
                List list = (List) this.f14339Z;
                e0 e0Var = (e0) this.f14340h0;
                AbstractC3557B.c0("$awaitingContainerChanges", list);
                AbstractC3557B.c0("$operation", e0Var);
                AbstractC3557B.c0("this$0", (C1471l) this.f14341i0);
                if (list.contains(e0Var)) {
                    list.remove(e0Var);
                    View view = e0Var.f18185c.f18269J0;
                    int i10 = e0Var.f18183a;
                    AbstractC3557B.b0("view", view);
                    R.a.i(i10, view);
                    return;
                }
                return;
            case 2:
                Rect rect = (Rect) this.f14341i0;
                AbstractC3557B.c0("$impl", (Z) this.f14339Z);
                AbstractC3557B.c0("$lastInEpicenterRect", rect);
                Z.g((View) this.f14340h0, rect);
                return;
            case 3:
                C1471l c1471l = (C1471l) this.f14339Z;
                C1467h c1467h = (C1467h) this.f14341i0;
                AbstractC3557B.c0("this$0", c1471l);
                AbstractC3557B.c0("$animationInfo", c1467h);
                c1471l.f18216a.endViewTransition((View) this.f14340h0);
                c1467h.b();
                return;
            case 4:
                U u10 = (U) this.f14339Z;
                C0492y c0492y = (C0492y) this.f14341i0;
                u10.getClass();
                k0 i02 = ((K) this.f14340h0).i0();
                z2.w wVar = (z2.w) u10.f50483c;
                X x10 = wVar.f51542l0;
                x10.getClass();
                z2.v vVar = wVar.f51539i0;
                vVar.getClass();
                vVar.f51531b = N.V(i02);
                if (!i02.isEmpty()) {
                    vVar.f51534e = (C0492y) i02.get(0);
                    c0492y.getClass();
                    vVar.f51535f = c0492y;
                }
                if (vVar.f51533d == null) {
                    vVar.f51533d = z2.v.b(x10, vVar.f51531b, vVar.f51534e, vVar.f51530a);
                }
                vVar.d(((C6504G) x10).m());
                return;
            case 5:
                Pair pair = (Pair) this.f14340h0;
                ((z2.w) ((c0) ((U3.c) this.f14339Z).f17397h0).f50530h).u(((Integer) pair.first).intValue(), (C0492y) pair.second, (C0488u) this.f14341i0);
                return;
            case 6:
                Pair pair2 = (Pair) this.f14340h0;
                ((z2.w) ((c0) ((U3.c) this.f14339Z).f17397h0).f50530h).f(((Integer) pair2.first).intValue(), (C0492y) pair2.second, (Exception) this.f14341i0);
                return;
            case 7:
                U3.l lVar = (U3.l) this.f14339Z;
                final C5065s c5065s = (C5065s) this.f14340h0;
                final C6521h c6521h = (C6521h) this.f14341i0;
                int i11 = AbstractC5530A.f45131a;
                ((SurfaceHolder$CallbackC6500C) lVar.f17424h0).getClass();
                C6504G c6504g = ((SurfaceHolder$CallbackC6500C) lVar.f17424h0).f50334Y;
                c6504g.getClass();
                z2.w wVar2 = (z2.w) c6504g.f50379r;
                final C6757b M10 = wVar2.M();
                wVar2.N(M10, 1009, new s2.m(M10, c5065s, c6521h, 1) { // from class: z2.p

                    /* renamed from: Y  reason: collision with root package name */
                    public final /* synthetic */ int f51522Y;

                    {
                        this.f51522Y = r4;
                    }

                    @Override // s2.m
                    public final void invoke(Object obj2) {
                        AbstractC6758c abstractC6758c = (AbstractC6758c) obj2;
                        switch (this.f51522Y) {
                            case 0:
                                abstractC6758c.getClass();
                                return;
                            default:
                                abstractC6758c.getClass();
                                return;
                        }
                    }
                });
                return;
            case 8:
                B2.n nVar = (B2.n) this.f14339Z;
                ((B2.o) this.f14340h0).f(nVar.f1813a, nVar.f1814b, (Exception) this.f14341i0);
                return;
            case 9:
                C1025i c1025i = (C1025i) this.f14339Z;
                ((E2.C) this.f14340h0).u(c1025i.f12350Z, (C0492y) c1025i.f12351h0, (C0488u) this.f14341i0);
                return;
            case 10:
                AbstractC2469q0.p(((C3636c1) this.f14339Z).f34286h0);
                int i12 = F2.a.f5031k;
                throw null;
            case 11:
                J2.w wVar3 = (J2.w) this.f14339Z;
                final C5065s c5065s2 = (C5065s) this.f14340h0;
                final C6521h c6521h2 = (C6521h) this.f14341i0;
                wVar3.getClass();
                int i13 = AbstractC5530A.f45131a;
                J2.x xVar = wVar3.f8837b;
                xVar.getClass();
                C6504G c6504g2 = ((SurfaceHolder$CallbackC6500C) xVar).f50334Y;
                c6504g2.getClass();
                z2.w wVar4 = (z2.w) c6504g2.f50379r;
                final C6757b M11 = wVar4.M();
                wVar4.N(M11, 1017, new s2.m(M11, c5065s2, c6521h2, 0) { // from class: z2.p

                    /* renamed from: Y  reason: collision with root package name */
                    public final /* synthetic */ int f51522Y;

                    {
                        this.f51522Y = r4;
                    }

                    @Override // s2.m
                    public final void invoke(Object obj2) {
                        AbstractC6758c abstractC6758c = (AbstractC6758c) obj2;
                        switch (this.f51522Y) {
                            case 0:
                                abstractC6758c.getClass();
                                return;
                            default:
                                abstractC6758c.getClass();
                                return;
                        }
                    }
                });
                return;
            case 12:
                AbstractC3557B.c0("this$0", (x3.v) this.f14339Z);
                AbstractC3557B.c0("$sql", (String) this.f14340h0);
                AbstractC3557B.c0("$inputArguments", (List) this.f14341i0);
                throw null;
            case 13:
                M3.q qVar = (M3.q) this.f14339Z;
                A8.a aVar = (A8.a) this.f14340h0;
                J j6 = (J) this.f14341i0;
                String str4 = M3.q.f11583l;
                qVar.getClass();
                try {
                    z10 = ((Boolean) aVar.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    z10 = true;
                }
                synchronized (qVar.f11594k) {
                    try {
                        U3.j y10 = Gi.e.y(j6.f11548h0);
                        String str5 = y10.f17418a;
                        if (qVar.d(str5) == j6) {
                            qVar.b(str5);
                        }
                        L3.s d10 = L3.s.d();
                        String str6 = M3.q.f11583l;
                        d10.a(str6, M3.q.class.getSimpleName() + Separators.SP + str5 + " executed; reschedule = " + z10);
                        Iterator it = qVar.f11593j.iterator();
                        while (it.hasNext()) {
                            ((AbstractC0935d) it.next()).a(y10, z10);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 14:
                h6.a aVar2 = (h6.a) this.f14339Z;
                h6.a aVar3 = (h6.a) this.f14340h0;
                F5.b bVar3 = (F5.b) this.f14341i0;
                AbstractC3557B.c0("$previousConsent", aVar2);
                AbstractC3557B.c0("$newConsent", aVar3);
                AbstractC3557B.c0("this$0", bVar3);
                if (aVar2 == h6.a.f31918h0) {
                    int ordinal2 = aVar3.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            bVar3.getClass();
                            throw null;
                        }
                        return;
                    }
                    bVar3.getClass();
                    throw null;
                }
                return;
            case 15:
                d6.b bVar4 = (d6.b) this.f14339Z;
                r5.d dVar = (r5.d) this.f14340h0;
                d6.c cVar2 = (d6.c) this.f14341i0;
                AbstractC3557B.c0("this$0", bVar4);
                AbstractC3557B.c0("$sdkCore", dVar);
                AbstractC3557B.c0("$reportTarget", cVar2);
                d6.e eVar = bVar4.f28023s0;
                if (eVar != null) {
                    I8.u uVar = bVar4.f28020p0;
                    q5.g gVar2 = bVar4.f28021q0;
                    C5274d c5274d = bVar4.f28022r0;
                    Locale locale = Locale.US;
                    String str7 = eVar.f28031c;
                    String format = String.format(locale, "NDK crash detected with signal: %s", Arrays.copyOf(new Object[]{str7}, 1));
                    int ordinal3 = cVar2.ordinal();
                    EnumC5090b enumC5090b = EnumC5090b.f42738Y;
                    String str8 = bVar4.f28018n0;
                    long j10 = eVar.f28030b;
                    cVar = cVar2;
                    String str9 = eVar.f28033e;
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            bVar = bVar4;
                        } else {
                            if (uVar != null) {
                                try {
                                    gVar = gVar2;
                                    try {
                                        c0571a = new C0571a(22, uVar);
                                        str2 = (String) c0571a.invoke(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                                        str3 = (String) c0571a.invoke(ParameterNames.SESSION);
                                        obj = DiagnosticsEntry.Event.TIMESTAMP_KEY;
                                    } catch (Exception e10) {
                                        e = e10;
                                        obj = DiagnosticsEntry.Event.TIMESTAMP_KEY;
                                    }
                                    try {
                                        c3964n = new C3964n(str2, str3, (String) c0571a.invoke("view"));
                                    } catch (Exception e11) {
                                        e = e11;
                                        P4.a.m0(bVar4.f28015k0, 4, EnumC5090b.f42739Z, d6.a.f28005Z, e, false, 48);
                                        c3964n = new C3964n(null, null, null);
                                        str = (String) c3964n.f36165Y;
                                        String str10 = (String) c3964n.f36166Z;
                                        String str11 = (String) c3964n.f36167h0;
                                        if (str == null) {
                                        }
                                        bVar2 = bVar4;
                                        a12 = AbstractC4268D.a1(new C3959i("error.stack", str9), new C3959i("error.source_type", str8));
                                        h10 = dVar.h("logs");
                                        if (h10 == null) {
                                        }
                                        ordinal = cVar.ordinal();
                                        if (ordinal == 0) {
                                        }
                                        if (!bVar.f28025u0) {
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    obj = DiagnosticsEntry.Event.TIMESTAMP_KEY;
                                    gVar = gVar2;
                                }
                                str = (String) c3964n.f36165Y;
                                String str102 = (String) c3964n.f36166Z;
                                String str112 = (String) c3964n.f36167h0;
                                if (str == null && str102 != null && str112 != null) {
                                    bVar2 = bVar4;
                                    a12 = AbstractC4268D.a1(new C3959i("session_id", str102), new C3959i("application_id", str), new C3959i("view.id", str112), new C3959i("error.stack", str9), new C3959i("error.source_type", str8));
                                } else {
                                    bVar2 = bVar4;
                                    a12 = AbstractC4268D.a1(new C3959i("error.stack", str9), new C3959i("error.source_type", str8));
                                }
                            } else {
                                obj = DiagnosticsEntry.Event.TIMESTAMP_KEY;
                                bVar2 = bVar4;
                                gVar = gVar2;
                                a12 = AbstractC4268D.a1(new C3959i("error.stack", str9), new C3959i("error.source_type", str8));
                            }
                            h10 = dVar.h("logs");
                            if (h10 == null) {
                                ((y5.h) h10).a(AbstractC4268D.a1(new C3959i("loggerName", "ndk_crash"), new C3959i("type", "ndk_crash"), new C3959i("message", format), new C3959i("attributes", a12), new C3959i(obj, Long.valueOf(j10)), new C3959i("networkInfo", c5274d), new C3959i("userInfo", gVar)));
                                bVar = bVar2;
                            } else {
                                bVar = bVar2;
                                P4.a.m0(bVar.f28015k0, 3, enumC5090b, d6.a.f28007i0, null, false, 56);
                            }
                        }
                    } else {
                        bVar = bVar4;
                        if (uVar != null) {
                            AbstractC5368c h11 = dVar.h("rum");
                            if (h11 != null) {
                                ((y5.h) h11).a(AbstractC4268D.a1(new C3959i("type", "ndk_crash"), new C3959i("sourceType", str8), new C3959i(DiagnosticsEntry.Event.TIMESTAMP_KEY, Long.valueOf(j10)), new C3959i("signalName", str7), new C3959i("stacktrace", str9), new C3959i("message", format), new C3959i("lastViewEvent", uVar)));
                            } else {
                                P4.a.m0(bVar.f28015k0, 3, enumC5090b, d6.a.f28008j0, null, false, 56);
                            }
                        }
                    }
                } else {
                    bVar = bVar4;
                    cVar = cVar2;
                }
                ordinal = cVar.ordinal();
                if (ordinal == 0) {
                    if (ordinal == 1) {
                        bVar.f28024t0 = true;
                    }
                } else {
                    bVar.f28025u0 = true;
                }
                if (!bVar.f28025u0 && bVar.f28024t0) {
                    bVar.f28020p0 = null;
                    bVar.f28022r0 = null;
                    bVar.f28021q0 = null;
                    bVar.f28023s0 = null;
                    return;
                }
                return;
            case 16:
                ((C5997e) this.f14339Z).b((C5936e) this.f14340h0, (Runnable) this.f14341i0);
                return;
            case 17:
                GoogleDeviceIdentifiersFetcher.a((GoogleDeviceIdentifiersFetcher) this.f14339Z, (Application) this.f14340h0, (wf.k) this.f14341i0);
                return;
            case 18:
                ((EglRenderer) this.f14339Z).lambda$init$0((EglBase.Context) this.f14340h0, (int[]) this.f14341i0);
                return;
            case 19:
                ((EglRenderer) this.f14339Z).lambda$removeFrameListener$4((CountDownLatch) this.f14340h0, (EglRenderer.FrameListener) this.f14341i0);
                return;
            case 20:
                ((VideoFileRenderer) this.f14339Z).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f14340h0, (VideoFrame) this.f14341i0);
                return;
            default:
                C0799d c0799d = (C0799d) this.f14339Z;
                Handler handler = (Handler) this.f14340h0;
                wf.k kVar = (wf.k) this.f14341i0;
                AbstractC3557B.c0("$detector", c0799d);
                AbstractC3557B.c0("$handler", handler);
                AbstractC3557B.c0("$block", kVar);
                try {
                    handler.post(new RunnableC5841a(kVar, 27, C0799d.a(c0799d)));
                    return;
                } catch (Throwable th3) {
                    handler.post(new RunnableC5841a(kVar, 28, th3));
                    return;
                }
        }
    }
}
