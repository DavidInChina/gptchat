package Oc;

import Ag.l;
import Ag.s;
import Ag.u;
import Bg.A;
import Bg.Y;
import Bg.d0;
import Bg.o0;
import Cd.C0338x;
import Cd.J;
import G.C0550e;
import Gd.g;
import Gd.h;
import Jf.p;
import Kd.C0830f;
import Lg.n;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.V;
import Ng.AbstractC1073l0;
import Ng.F;
import Pf.C1162u;
import Pf.T;
import Rd.i;
import Rd.j;
import Rf.f;
import Sf.AbstractC1385d;
import Sf.q;
import Sf.w;
import Uf.C1442d;
import Uf.C1455q;
import Ve.C1503i0;
import Ve.C1519y;
import Ve.P;
import Ve.S;
import Xe.EnumC1680b;
import Yf.C1694f;
import Yf.C1697i;
import Yf.r;
import Yf.v;
import Z.AbstractC1710f0;
import Z.M;
import Z.N;
import Z.l1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC2086v;
import bg.AbstractC2199g;
import bg.EnumC2210r;
import c5.C2292d;
import cg.C2410a;
import cg.C2412c;
import cg.C2425p;
import cg.C2427r;
import com.segment.analytics.kotlin.core.Settings;
import de.C2631f;
import de.C2632g;
import dg.AbstractC2653B;
import dg.x;
import eg.EnumC2893a;
import fg.C3051t;
import h.C3277c;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.AbstractC3957g;
import jf.y;
import kf.t;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import kh.e;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import lf.C4436a;
import lh.AbstractC4471A;
import lh.AbstractC4480J;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.RTCStatsCollectorCallback;
import livekit.org.webrtc.RtpReceiver;
import livekit.org.webrtc.RtpSender;
import nf.C4832l;
import q0.C5251c;
import qe.C5312d;
import r0.AbstractC5340d;
import r0.C5341e;
import r0.C5342f;
import rg.AbstractC5493d;
import s3.C5564n;
import s3.z;
import sg.C5624a;
import t0.AbstractC5650i;
import ud.C5902a;
import we.AbstractC6214b;
import wf.k;
import xe.AbstractC6412a;
import xe.AbstractC6430s;
import xe.AbstractC6432u;
import xe.C6428q;
import xe.C6433v;
import xg.C6452g;
import xg.C6454i;
import xg.C6455j;
import xg.m;
import y.C6474l;
import ye.C6582b;
import ye.EnumC6581a;
import yf.AbstractC6583a;
import ze.AbstractC6848g;
import zg.C6854a;
import zg.C6862i;

/* loaded from: classes2.dex */
public final class c extends o implements k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f13680Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f13681Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f13682h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(J j6, AbstractC1710f0 abstractC1710f0) {
        super(1);
        this.f13680Y = 3;
        this.f13682h0 = j6;
        this.f13681Z = abstractC1710f0;
    }

    public final AbstractC0997f a(C4294f c4294f) {
        q qVar;
        int i10 = this.f13680Y;
        Object obj = this.f13682h0;
        Object obj2 = this.f13681Z;
        switch (i10) {
            case 20:
                AbstractC3557B.c0("name", c4294f);
                Yf.o oVar = (Yf.o) obj2;
                boolean contains = ((Set) oVar.f22371r.mo122invoke()).contains(c4294f);
                AbstractC0997f abstractC0997f = oVar.f22367n;
                if (contains) {
                    z zVar = (z) obj;
                    Rf.b bVar = ((Xf.a) zVar.f45394a).f21953b;
                    C4290b f6 = AbstractC5493d.f(abstractC0997f);
                    AbstractC3557B.Z(f6);
                    C4290b d10 = f6.d(c4294f);
                    bVar.getClass();
                    C4291c g10 = d10.g();
                    AbstractC3557B.b0("getPackageFqName(...)", g10);
                    String z22 = n.z2(d10.h().b(), '.', '$');
                    if (!g10.d()) {
                        z22 = g10.b() + '.' + z22;
                    }
                    Class l22 = R4.b.l2(bVar.f15498a, z22);
                    if (l22 != null) {
                        qVar = new q(l22);
                    } else {
                        qVar = null;
                    }
                    if (qVar == null) {
                        return null;
                    }
                    C1697i c1697i = new C1697i(zVar, abstractC0997f, qVar, null);
                    ((C1455q) ((Xf.a) zVar.f45394a).f21970s).getClass();
                    return c1697i;
                } else if (((Set) oVar.f22372s.mo122invoke()).contains(c4294f)) {
                    z zVar2 = (z) obj;
                    C4436a c4436a = new C4436a();
                    ((C5624a) ((Xf.a) zVar2.f45394a).f21975x).c(zVar2, abstractC0997f, c4294f, c4436a);
                    C4436a Q = AbstractC4344b.Q(c4436a);
                    int r10 = Q.r();
                    if (r10 == 0) {
                        return null;
                    }
                    if (r10 == 1) {
                        return (AbstractC0997f) t.B2(Q);
                    }
                    throw new IllegalStateException(("Multiple classes with same name are generated: " + Q).toString());
                } else {
                    w wVar = (w) ((Map) oVar.f22373t.mo122invoke()).get(c4294f);
                    if (wVar == null) {
                        return null;
                    }
                    z zVar3 = (z) obj;
                    u e10 = zVar3.e();
                    Yf.n nVar = new Yf.n(oVar, 2);
                    Ag.q qVar2 = (Ag.q) e10;
                    qVar2.getClass();
                    return C1162u.x0(zVar3.e(), oVar.f22367n, c4294f, new l(qVar2, nVar), Bi.c.B1(zVar3, wVar), ((f) ((Xf.a) zVar3.f45394a).f21961j).a(wVar));
                }
            default:
                AbstractC3557B.c0("name", c4294f);
                U3.n nVar2 = (U3.n) obj2;
                C3051t c3051t = (C3051t) ((Map) nVar2.f17426Y).get(c4294f);
                if (c3051t == null) {
                    return null;
                }
                C6862i c6862i = (C6862i) obj;
                return C1162u.x0(c6862i.f52045q0.c(), c6862i, c4294f, (s) nVar2.f17428h0, new C6854a(c6862i.f52045q0.c(), new C5902a(c6862i, 23, c3051t)), V.f12075a);
        }
    }

    public final M c(N n10) {
        Z0.k kVar;
        int i10 = this.f13680Y;
        Object obj = this.f13682h0;
        Object obj2 = this.f13681Z;
        switch (i10) {
            case 5:
                AbstractC3557B.c0("$this$DisposableEffect", n10);
                C0830f c0830f = (C0830f) obj;
                C5564n c5564n = new C5564n(2, c0830f);
                AbstractC2086v abstractC2086v = (AbstractC2086v) obj2;
                abstractC2086v.h().a(c5564n);
                return new C6474l(c0830f, abstractC2086v, c5564n, 3);
            default:
                AbstractC3557B.c0("$this$DisposableEffect", n10);
                e eVar = (e) obj2;
                AbstractC4471A abstractC4471A = (AbstractC4471A) ((l1) obj).getValue();
                if (abstractC4471A != null) {
                    kVar = new Z0.k(abstractC4471A.d());
                } else {
                    kVar = null;
                }
                eVar.f37552b.setValue(kVar);
                return new C3277c(12, eVar);
        }
    }

    public final void e(C0550e c0550e) {
        int i10 = this.f13680Y;
        int i11 = 0;
        Object obj = this.f13682h0;
        Object obj2 = this.f13681Z;
        switch (i10) {
            case 7:
                AbstractC3557B.c0("interval", c0550e);
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj2;
                kotlin.jvm.internal.z zVar2 = (kotlin.jvm.internal.z) obj;
                while (i11 < c0550e.f5497b) {
                    C2631f c2631f = (C2631f) ((C2632g) c0550e.f5498c).f28228a.invoke(Integer.valueOf(i11));
                    zVar.f37647Y = Math.max(zVar.f37647Y, c2631f.f28224a + c2631f.f28226c);
                    zVar2.f37647Y = Math.max(zVar2.f37647Y, c2631f.f28225b + c2631f.f28227d);
                    i11++;
                }
                return;
            default:
                AbstractC3557B.c0("interval", c0550e);
                List list = (List) obj2;
                wf.o oVar = (wf.o) obj;
                while (i11 < c0550e.f5497b) {
                    list.add(oVar.invoke(Integer.valueOf(c0550e.f5496a + i11), Integer.valueOf(i11), c0550e.f5498c));
                    i11++;
                }
                return;
        }
    }

    public final void f(Throwable th2) {
        int i10 = this.f13680Y;
        Object obj = this.f13682h0;
        Object obj2 = this.f13681Z;
        switch (i10) {
            case 1:
                ld.o oVar = (ld.o) obj2;
                Ad.l.O0((F) oVar.f38294a, null, null, new ld.n((k) obj, oVar, null), 3);
                return;
            case 9:
                if (th2 != null) {
                    ((ge.d) obj2).f31603p0.q(AbstractC6214b.f48499e);
                    return;
                }
                return;
            case 11:
                C5312d c5312d = (C5312d) obj2;
                String sb2 = ((StringBuilder) obj).toString();
                AbstractC3557B.b0("requestLog.toString()", sb2);
                c5312d.getClass();
                String obj3 = n.U2(sb2).toString();
                StringBuilder sb3 = c5312d.f44084b;
                sb3.append(obj3);
                sb3.append('\n');
                c5312d.a();
                return;
            case 13:
                if (th2 != null) {
                    ((io.ktor.utils.io.t) ((io.ktor.utils.io.z) obj2)).j(th2);
                    ((io.ktor.utils.io.t) ((io.ktor.utils.io.z) obj)).j(th2);
                    return;
                }
                return;
            case 14:
                if (th2 != null) {
                    ((io.ktor.utils.io.t) ((io.ktor.utils.io.u) obj2)).h(th2);
                    ((io.ktor.utils.io.t) ((io.ktor.utils.io.u) obj)).h(th2);
                    return;
                }
                return;
            case 17:
                C1503i0 c1503i0 = (C1503i0) obj2;
                if (AbstractC3557B.K(c1503i0.f18780f, (AbstractC1073l0) obj)) {
                    c1503i0.f18780f = null;
                    return;
                }
                return;
            case 26:
                ((Og.d) obj2).f13756Z.removeCallbacks((Runnable) obj);
                return;
            default:
                ((Wg.d) obj2).g(obj);
                return;
        }
    }

    public final void g(RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        int i10 = this.f13680Y;
        Object obj = this.f13682h0;
        Object obj2 = this.f13681Z;
        switch (i10) {
            case 15:
                AbstractC3557B.c0("statsCallback", rTCStatsCollectorCallback);
                Ad.l.a1(C4832l.f40334Y, new P((C1519y) obj2, rTCStatsCollectorCallback, (RtpSender) obj, null));
                return;
            default:
                AbstractC3557B.c0("statsCallback", rTCStatsCollectorCallback);
                Ad.l.a1(C4832l.f40334Y, new S((C1519y) obj2, rTCStatsCollectorCallback, (RtpReceiver) obj, null));
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0261, code lost:
        if (r12.f26652d != Uf.EnumC1440b.f17807k0) goto L68;
     */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z10;
        dg.w wVar;
        AbstractC2653B abstractC2653B;
        C4290b c4290b;
        C4291c c4291c;
        AbstractC0997f abstractC0997f;
        Rf.c f6;
        Map map;
        C2412c c2412c;
        boolean z11;
        Eg.k kVar;
        Y e10;
        C2410a c2410a;
        AbstractC5650i abstractC5650i;
        y yVar = y.f36177a;
        int i10 = this.f13680Y;
        EnumC1680b enumC1680b = null;
        int i11 = 0;
        Object obj2 = this.f13682h0;
        Object obj3 = this.f13681Z;
        switch (i10) {
            case 0:
                Context context = (Context) obj;
                AbstractC3557B.c0("context", context);
                WebView webView = new WebView(context);
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setBlockNetworkImage(true);
                settings.setBlockNetworkLoads(false);
                webView.setScrollBarSize(0);
                webView.setBackgroundColor(0);
                webView.setWebViewClient(new C2292d(1, (AbstractC1710f0) obj3));
                webView.setWebChromeClient(new b((AbstractC1710f0) obj2));
                webView.loadUrl("file:///android_asset/latex.html");
                return webView;
            case 1:
                f((Throwable) obj);
                return yVar;
            case 2:
                Ad.s sVar = (Ad.s) obj;
                AbstractC3557B.c0("$this$setState", sVar);
                return (Ad.s) ((wf.n) obj3).invoke(sVar, obj2);
            case 3:
                long j6 = ((C5251c) obj).f43623a;
                ((AbstractC1710f0) obj3).setValue(Boolean.TRUE);
                ((J) obj2).j(new C0338x(true));
                return yVar;
            case 4:
                W4.b bVar = (W4.b) obj;
                AbstractC3557B.c0("params", bVar);
                h b10 = ((g) obj3).b();
                V4.c cVar = (V4.c) obj2;
                W4.e eVar = (W4.e) bVar;
                eVar.b("time", b10.f6304a);
                eVar.b("stateListen", b10.f6308e);
                eVar.b("listenTimestamp", b10.f6309f);
                eVar.b("speakTimestamp", b10.f6315l);
                eVar.b("readyTimestamp", b10.f6316m);
                eVar.b("stateListenIntently", b10.f6310g);
                eVar.b("stateListenGrace", b10.f6321r);
                eVar.c("userMagnitudes", b10.f6325v);
                eVar.c("viewport", new float[]{cVar.getWidth(), cVar.getHeight()});
                return yVar;
            case 5:
                return c((N) obj);
            case 6:
                j jVar = (j) obj;
                AbstractC3557B.c0("it", jVar);
                jVar.c((Settings) obj3, (i) obj2);
                return yVar;
            case 7:
                e((C0550e) obj);
                return yVar;
            case 8:
                e((C0550e) obj);
                return yVar;
            case 9:
                f((Throwable) obj);
                return yVar;
            case 10:
                C6433v c6433v = (C6433v) obj;
                AbstractC3557B.c0("$this$buildHeaders", c6433v);
                c6433v.g((AbstractC6432u) obj3);
                c6433v.g(((AbstractC6848g) obj2).c());
                return yVar;
            case 11:
                f((Throwable) obj);
                return yVar;
            case 12:
                C6428q c6428q = (C6428q) obj;
                AbstractC3557B.c0("it", c6428q);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c6428q.f49948a);
                sb2.append('=');
                ((C6582b) obj3).getClass();
                int ordinal = ((EnumC6581a) obj2).ordinal();
                String str = c6428q.f49949b;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            str = AbstractC6412a.f(str, false);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        str = AbstractC6430s.b(str);
                    }
                } else {
                    Set set = AbstractC6430s.f49952a;
                    AbstractC3557B.c0("<this>", str);
                    if (AbstractC6430s.a(str)) {
                        str = AbstractC6430s.b(str);
                    }
                }
                sb2.append(str);
                return sb2.toString();
            case 13:
                f((Throwable) obj);
                return yVar;
            case 14:
                f((Throwable) obj);
                return yVar;
            case 15:
                g((RTCStatsCollectorCallback) obj);
                return yVar;
            case 16:
                g((RTCStatsCollectorCallback) obj);
                return yVar;
            case 17:
                f((Throwable) obj);
                return yVar;
            case 18:
                String str2 = (String) obj;
                AbstractC3557B.c0("deviceName", str2);
                ArrayList arrayList = Ze.g.f23707a;
                CameraEnumerator cameraEnumerator = (CameraEnumerator) obj3;
                AbstractC3557B.c0("<this>", cameraEnumerator);
                if (cameraEnumerator.isBackFacing(str2)) {
                    enumC1680b = EnumC1680b.f21885Z;
                } else if (cameraEnumerator.isFrontFacing(str2)) {
                    enumC1680b = EnumC1680b.f21884Y;
                }
                if (enumC1680b == ((EnumC1680b) obj2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 19:
                C4294f c4294f = (C4294f) obj;
                AbstractC3557B.c0("accessorName", c4294f);
                T t10 = (T) obj3;
                if (AbstractC3557B.K(t10.getName(), c4294f)) {
                    return AbstractC4344b.F0(t10);
                }
                Yf.o oVar = (Yf.o) obj2;
                return t.w2(Yf.o.w(oVar, c4294f), Yf.o.v(oVar, c4294f));
            case 20:
                return a((C4294f) obj);
            case 21:
                r rVar = (r) obj;
                AbstractC3557B.c0("request", rVar);
                v vVar = (v) obj3;
                C4290b c4290b2 = new C4290b(vVar.f22390o.f14010j0, rVar.f22384a);
                z zVar = vVar.f22292b;
                AbstractC2199g abstractC2199g = rVar.f22385b;
                if (abstractC2199g != null) {
                    x xVar = ((Xf.a) ((z) obj2).f45394a).f21954c;
                    AbstractC3557B.c0("<this>", ((Xf.a) zVar.f45394a).f21955d.c().f50012c);
                    jg.g gVar = jg.g.f36187g;
                    Rf.d dVar = (Rf.d) xVar;
                    dVar.getClass();
                    AbstractC3557B.c0("jvmMetadataVersion", gVar);
                    Class l22 = R4.b.l2(dVar.f15501a, ((q) abstractC2199g).b().b());
                    if (l22 != null && (f6 = Cf.k.f(l22)) != null) {
                        wVar = new dg.w(f6);
                    } else {
                        wVar = null;
                    }
                } else {
                    x xVar2 = ((Xf.a) ((z) obj2).f45394a).f21954c;
                    AbstractC3557B.c0("<this>", ((Xf.a) zVar.f45394a).f21955d.c().f50012c);
                    wVar = ((Rf.d) xVar2).a(c4290b2, jg.g.f36187g);
                }
                if (wVar != null) {
                    abstractC2653B = wVar.f28371k;
                } else {
                    abstractC2653B = null;
                }
                if (abstractC2653B != null) {
                    c4290b = AbstractC1385d.a(((Rf.c) abstractC2653B).f15499a);
                } else {
                    c4290b = null;
                }
                if (c4290b != null && ((!c4290b.f37494b.e().d()) || c4290b.f37495c)) {
                    return null;
                }
                AbstractC4344b abstractC4344b = Yf.t.f22387l;
                if (abstractC2653B != null) {
                    Rf.c cVar2 = (Rf.c) abstractC2653B;
                    if (((EnumC2893a) cVar2.f15500b.f40437c) == EnumC2893a.f29380j0) {
                        dg.o oVar2 = ((Xf.a) zVar.f45394a).f21955d;
                        oVar2.getClass();
                        C6452g f10 = oVar2.f(abstractC2653B);
                        if (f10 == null) {
                            abstractC0997f = null;
                        } else {
                            m c10 = oVar2.c();
                            C4290b a5 = AbstractC1385d.a(cVar2.f15499a);
                            C6455j c6455j = c10.f50029t;
                            c6455j.getClass();
                            abstractC0997f = (AbstractC0997f) c6455j.f50008b.invoke(new C6454i(a5, f10));
                        }
                        if (abstractC0997f != null) {
                            abstractC4344b = new Yf.s(abstractC0997f);
                        }
                    } else {
                        abstractC4344b = Yf.u.f22388l;
                    }
                }
                if (abstractC4344b instanceof Yf.s) {
                    return ((Yf.s) abstractC4344b).f22386l;
                }
                if (abstractC4344b instanceof Yf.u) {
                    return null;
                }
                if (abstractC4344b instanceof Yf.t) {
                    if (abstractC2199g == null) {
                        Rf.b bVar2 = ((Xf.a) ((z) obj2).f45394a).f21953b;
                        bVar2.getClass();
                        C4291c g10 = c4290b2.g();
                        AbstractC3557B.b0("getPackageFqName(...)", g10);
                        String z22 = n.z2(c4290b2.h().b(), '.', '$');
                        if (!g10.d()) {
                            z22 = g10.b() + '.' + z22;
                        }
                        Class l23 = R4.b.l2(bVar2.f15498a, z22);
                        if (l23 != null) {
                            abstractC2199g = new q(l23);
                        } else {
                            abstractC2199g = null;
                        }
                    }
                    EnumC2210r[] enumC2210rArr = EnumC2210r.f25973Y;
                    if (abstractC2199g != null) {
                        c4291c = ((q) abstractC2199g).b();
                    } else {
                        c4291c = null;
                    }
                    if (c4291c == null || c4291c.d()) {
                        return null;
                    }
                    C4291c e11 = c4291c.e();
                    Yf.q qVar = vVar.f22390o;
                    if (!AbstractC3557B.K(e11, qVar.f14010j0)) {
                        return null;
                    }
                    z zVar2 = (z) obj2;
                    C1697i c1697i = new C1697i(zVar2, qVar, abstractC2199g, null);
                    ((C1455q) ((Xf.a) zVar2.f45394a).f21970s).getClass();
                    return c1697i;
                }
                throw new RuntimeException();
            case 22:
                int intValue = ((Number) obj).intValue();
                C2427r c2427r = (C2427r) obj3;
                if (c2427r == null || (map = c2427r.f26658a) == null || (c2412c = (C2412c) map.get(Integer.valueOf(intValue))) == null) {
                    C2412c[] c2412cArr = (C2412c[]) obj2;
                    if (intValue >= 0 && intValue <= kf.q.l3(c2412cArr)) {
                        return c2412cArr[intValue];
                    }
                    return C2412c.f26619e;
                }
                return c2412c;
            case 23:
                AbstractC3557B.c0("$this$extractNullability", obj);
                C2425p c2425p = (C2425p) obj3;
                Eg.f fVar = ((C2410a) obj2).f26615a;
                c2425p.getClass();
                Nf.c cVar3 = (Nf.c) obj;
                if (cVar3 instanceof Wf.h) {
                    Wf.h hVar = (Wf.h) cVar3;
                }
                boolean z12 = cVar3 instanceof C1694f;
                z zVar3 = c2425p.f26651c;
                if (z12) {
                    ((Xf.a) zVar3.f45394a).f21971t.getClass();
                    if (!((C1694f) cVar3).f22336g) {
                        break;
                    }
                    z11 = true;
                    return Boolean.valueOf(z11);
                }
                if (fVar != null) {
                    C4294f c4294f2 = Jf.l.f9117e;
                    AbstractC1000i k10 = ((A) fVar).y0().k();
                    if (k10 != null && Jf.l.r(k10) != null) {
                        C1442d c1442d = ((Xf.a) zVar3.f45394a).f21968q;
                        c1442d.getClass();
                        Object c11 = c1442d.c(cVar3, p.f9187t);
                        if (c11 != null) {
                            ArrayList a10 = c1442d.a(c11, false);
                            if (!a10.isEmpty()) {
                                Iterator it = a10.iterator();
                                while (it.hasNext()) {
                                    if (AbstractC3557B.K((String) it.next(), "TYPE")) {
                                        ((Xf.a) zVar3.f45394a).f21971t.getClass();
                                        z11 = true;
                                        return Boolean.valueOf(z11);
                                    }
                                }
                            }
                        }
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            case 24:
                C2410a c2410a2 = (C2410a) obj;
                AbstractC3557B.c0("it", c2410a2);
                C2425p c2425p2 = (C2425p) obj3;
                boolean z13 = c2425p2.f26653e;
                Eg.f fVar2 = c2410a2.f26615a;
                if ((z13 && fVar2 != null && ((Eg.k) obj2).i(fVar2)) || fVar2 == null || (e10 = (kVar = (Eg.k) obj2).e(fVar2)) == null) {
                    return null;
                }
                List G10 = kVar.G(e10);
                List s10 = kVar.s(fVar2);
                Iterator it2 = G10.iterator();
                Iterator it3 = s10.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC6583a.H1(G10, 10), AbstractC6583a.H1(s10, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    Object next = it2.next();
                    d0 d0Var = (d0) it3.next();
                    Eg.j jVar2 = (Eg.j) next;
                    boolean l10 = kVar.l(d0Var);
                    Uf.z zVar4 = c2410a2.f26616b;
                    if (l10) {
                        c2410a = new C2410a(null, zVar4, jVar2);
                    } else {
                        o0 y10 = kVar.y(d0Var);
                        C1442d c1442d2 = ((Xf.a) c2425p2.f26651c.f45394a).f21968q;
                        AbstractC3557B.c0("<this>", y10);
                        c2410a = new C2410a(y10, c1442d2.b(zVar4, y10.getAnnotations()), jVar2);
                    }
                    arrayList2.add(c2410a);
                }
                return arrayList2;
            case 25:
                return a((C4294f) obj);
            case 26:
                f((Throwable) obj);
                return yVar;
            case 27:
                f((Throwable) obj);
                return yVar;
            case 28:
                AbstractC5650i abstractC5650i2 = (AbstractC5650i) obj;
                AbstractC3557B.c0("$this$null", abstractC5650i2);
                kh.m mVar = (kh.m) obj3;
                List list = (List) ((e) mVar).f37554d.getValue();
                C5342f c5342f = (C5342f) obj2;
                int size = list.size();
                int i12 = 0;
                while (i12 < size) {
                    lh.u uVar = (lh.u) list.get(i12);
                    if (uVar.f38508a != null && ((Boolean) ((e) mVar).f37553c.getValue()).booleanValue()) {
                        Canvas a11 = AbstractC5340d.a(abstractC5650i2.V().a());
                        r0.z zVar5 = uVar.f38508a;
                        Bitmap j10 = androidx.compose.ui.graphics.a.j(zVar5);
                        if (zVar5 != null) {
                            AbstractC3957g abstractC3957g = AbstractC4480J.f38453c;
                            ((Matrix) abstractC3957g.getValue()).reset();
                            float[] fArr = AbstractC4480J.f38451a;
                            Bitmap bitmap = ((C5341e) zVar5).f44234a;
                            int width = bitmap.getWidth();
                            int width2 = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            int height2 = bitmap.getHeight();
                            abstractC5650i = abstractC5650i2;
                            float f11 = i11;
                            fArr[i11] = f11;
                            fArr[1] = f11;
                            fArr[2] = width;
                            fArr[3] = f11;
                            fArr[4] = width2;
                            fArr[5] = height;
                            fArr[6] = f11;
                            fArr[7] = height2;
                            int ordinal2 = uVar.f38512e.ordinal();
                            Z0.j jVar3 = uVar.f38510c;
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        if (ordinal2 == 3) {
                                            float[] fArr2 = AbstractC4480J.f38452b;
                                            float f12 = jVar3.f22800a;
                                            fArr2[i11] = f12;
                                            float f13 = jVar3.f22803d;
                                            fArr2[1] = f13;
                                            fArr2[2] = f12;
                                            float f14 = jVar3.f22801b;
                                            fArr2[3] = f14;
                                            float f15 = jVar3.f22802c;
                                            fArr2[4] = f15;
                                            fArr2[5] = f14;
                                            fArr2[6] = f15;
                                            fArr2[7] = f13;
                                        }
                                    } else {
                                        float[] fArr3 = AbstractC4480J.f38452b;
                                        float f16 = jVar3.f22802c;
                                        fArr3[0] = f16;
                                        float f17 = jVar3.f22803d;
                                        fArr3[1] = f17;
                                        float f18 = jVar3.f22800a;
                                        fArr3[2] = f18;
                                        fArr3[3] = f17;
                                        fArr3[4] = f18;
                                        float f19 = jVar3.f22801b;
                                        fArr3[5] = f19;
                                        fArr3[6] = f16;
                                        fArr3[7] = f19;
                                    }
                                } else {
                                    float[] fArr4 = AbstractC4480J.f38452b;
                                    float f20 = jVar3.f22802c;
                                    fArr4[0] = f20;
                                    float f21 = jVar3.f22801b;
                                    fArr4[1] = f21;
                                    fArr4[2] = f20;
                                    float f22 = jVar3.f22803d;
                                    fArr4[3] = f22;
                                    float f23 = jVar3.f22800a;
                                    fArr4[4] = f23;
                                    fArr4[5] = f22;
                                    fArr4[6] = f23;
                                    fArr4[7] = f21;
                                }
                            } else {
                                float[] fArr5 = AbstractC4480J.f38452b;
                                float f24 = jVar3.f22800a;
                                fArr5[0] = f24;
                                float f25 = jVar3.f22801b;
                                fArr5[1] = f25;
                                float f26 = jVar3.f22802c;
                                fArr5[2] = f26;
                                fArr5[3] = f25;
                                fArr5[4] = f26;
                                float f27 = jVar3.f22803d;
                                fArr5[5] = f27;
                                fArr5[6] = f24;
                                fArr5[7] = f27;
                            }
                            ((Matrix) abstractC3957g.getValue()).setPolyToPoly(fArr, 0, AbstractC4480J.f38452b, 0, 4);
                            a11.drawBitmap(j10, (Matrix) abstractC3957g.getValue(), c5342f.f44235a);
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    } else {
                        abstractC5650i = abstractC5650i2;
                    }
                    i12++;
                    abstractC5650i2 = abstractC5650i;
                    i11 = 0;
                }
                return yVar;
            default:
                return c((N) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        super(1);
        this.f13680Y = i10;
        this.f13681Z = obj;
        this.f13682h0 = obj2;
    }
}
