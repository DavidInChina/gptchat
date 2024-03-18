package g6;

import A.C0007a0;
import G0.C0571a;
import Gi.e;
import Lg.m;
import U3.u;
import Wh.D;
import Wh.s;
import Wh.t;
import Wh.y;
import Wh.z;
import android.gov.nist.core.Separators;
import bi.f;
import hf.C3421a;
import id.AbstractC3557B;
import io.opentracing.util.GlobalTracer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.AbstractC4273I;
import l8.AbstractC4344b;
import livekit.org.webrtc.WebrtcBuildVersion;
import p5.AbstractC5091c;
import p5.AbstractC5092d;
import p5.C5089a;
import p5.EnumC5090b;
import u5.g;
import wf.n;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public class d implements t {

    /* renamed from: a  reason: collision with root package name */
    public final String f31291a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f31292b;

    /* renamed from: c  reason: collision with root package name */
    public final P5.c f31293c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31294d;

    /* renamed from: e  reason: collision with root package name */
    public final S5.d f31295e;

    /* renamed from: f  reason: collision with root package name */
    public final n f31296f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference f31297g = new AtomicReference();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f31298h;

    /* renamed from: i  reason: collision with root package name */
    public final D5.a f31299i;

    /* renamed from: j  reason: collision with root package name */
    public final u f31300j;

    public d(String str, LinkedHashMap linkedHashMap, P5.c cVar, String str2, S5.d dVar, n nVar) {
        this.f31291a = str;
        this.f31293c = cVar;
        this.f31294d = str2;
        this.f31295e = dVar;
        this.f31296f = nVar;
        this.f31298h = e.S("Network Requests", kf.t.K2(linkedHashMap.keySet()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (this.f31298h.contains((String) entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        this.f31299i = new D5.a(linkedHashMap2);
        this.f31300j = new u(this.f31291a, new C0571a(23, this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:34|(24:37|(1:42)(1:41)|43|(1:87)(1:89)|88|90|(1:92)(1:93)|94|(2:97|95)|148|98|(1:100)|101|(1:103)(1:104)|(1:106)|107|(1:109)(1:110)|(1:112)|113|146|114|141|117|149)|36|(0)(0)|88|90|(0)(0)|94|(1:95)|148|98|(0)|101|(0)(0)|(0)|107|(0)(0)|(0)|113|146|114|141|117|149) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024d, code lost:
        P4.a.l0(r12.l(), 4, l8.AbstractC4344b.G0(p5.EnumC5090b.f42739Z, p5.EnumC5090b.f42740h0), g6.C3203c.f31286Z, r0, 48);
        r0 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ba A[LOOP:0: B:95:0x01b4->B:97:0x01ba, LOOP_END] */
    @Override // Wh.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D a(f fVar) {
        S6.a aVar;
        ff.f fVar2;
        D b10;
        Integer num;
        Boolean bool;
        boolean b11;
        boolean z10;
        ff.c cVar;
        ff.d dVar;
        ff.d k02;
        ff.e E10;
        M6.c cVar2;
        ff.c start;
        boolean z11;
        S6.a aVar2;
        S6.a aVar3;
        boolean z12;
        ff.f f6;
        String str;
        AbstractC5092d n10 = this.f31300j.n();
        if (n10 == null) {
            String str2 = this.f31291a;
            if (str2 == null) {
                str = "Default SDK instance";
            } else {
                str = "SDK instance with name=".concat(str2);
            }
            AbstractC5091c.f42742a.getClass();
            P4.a.m0(C5089a.f42737b, 3, EnumC5090b.f42738Y, new C0007a0(str, 26, fVar), null, false, 56);
            return fVar.b(fVar.f26028e);
        }
        g gVar = (g) n10;
        synchronized (this) {
            try {
                aVar = null;
                if (gVar.h("tracing") == null) {
                    P4.a.m0(gVar.l(), 4, EnumC5090b.f42738Y, C3203c.f31289j0, null, true, 40);
                    fVar2 = null;
                } else {
                    if (GlobalTracer.isRegistered()) {
                        this.f31297g.set(null);
                        f6 = GlobalTracer.f33707Y;
                    } else {
                        f6 = f(gVar);
                    }
                    fVar2 = f6;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z zVar = fVar.f26028e;
        if (fVar2 != null) {
            s sVar = zVar.f21336a;
            if (gVar.m().c(sVar) || this.f31299i.c(sVar)) {
                String r10 = zVar.f21338c.r("x-datadog-sampling-priority");
                if (r10 != null) {
                    num = m.W1(r10);
                } else {
                    num = null;
                }
                if (num != null) {
                    try {
                        if (num.intValue() != Integer.MIN_VALUE) {
                            if (num.intValue() != 2 && num.intValue() != 1) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            bool = Boolean.valueOf(z12);
                            if (bool == null) {
                                b11 = bool.booleanValue();
                            } else {
                                b11 = ((S5.c) this.f31295e).b();
                            }
                            z10 = b11;
                            cVar = (ff.c) ff.c.class.cast(zVar.f21340e.get(ff.c.class));
                            if (cVar == null) {
                                dVar = cVar.c();
                            } else {
                                dVar = null;
                            }
                            TreeMap M10 = zVar.f21338c.M();
                            ArrayList arrayList = new ArrayList(M10.size());
                            for (Map.Entry entry : M10.entrySet()) {
                                arrayList.add(new C3959i(entry.getKey(), kf.t.m2((Iterable) entry.getValue(), Separators.SEMICOLON, null, null, null, 62)));
                            }
                            k02 = fVar2.k0(new C3421a(AbstractC4268D.k1(arrayList)));
                            if (k02 != null) {
                                dVar = k02;
                            }
                            String str3 = zVar.f21336a.f21257h;
                            E10 = fVar2.E("okhttp.request");
                            if (!(E10 instanceof M6.c)) {
                                cVar2 = (M6.c) E10;
                            } else {
                                cVar2 = null;
                            }
                            if (cVar2 != null) {
                                cVar2.f11677g = this.f31294d;
                            }
                            start = E10.a(dVar).start();
                            z11 = start instanceof S6.a;
                            if (!z11) {
                                aVar2 = (S6.a) start;
                            } else {
                                aVar2 = null;
                            }
                            if (aVar2 != null) {
                                ((M6.a) aVar2).f11651b.f11665i = Lg.n.R2(str3, '?');
                            }
                            start.a("http.url", str3);
                            start.a("http.method", zVar.f21337b);
                            z zVar2 = g(gVar, zVar, fVar2, start, z10).b();
                            D b12 = fVar.b(zVar2);
                            c(gVar, zVar, b12, start, z10);
                            return b12;
                        }
                        D b122 = fVar.b(zVar2);
                        c(gVar, zVar, b122, start, z10);
                        return b122;
                    } catch (Throwable th3) {
                        if (z10) {
                            if (z11) {
                                aVar3 = (S6.a) start;
                            } else {
                                aVar3 = null;
                            }
                            if (aVar3 != null) {
                                ((M6.a) aVar3).f11651b.f11667k = true;
                            }
                            start.a("error.msg", th3.getMessage());
                            start.a("error.type", th3.getClass().getName());
                            start.a("error.stack", AbstractC4344b.J0(th3));
                            d(gVar, zVar, start, null, th3);
                            if (!b()) {
                                if (z11) {
                                    aVar = (S6.a) start;
                                }
                                if (aVar != null) {
                                    M6.a aVar4 = (M6.a) aVar;
                                    aVar4.f11651b.f11658b.s(aVar4, false);
                                }
                            } else {
                                start.b();
                            }
                        }
                        throw th3;
                    }
                    bool = null;
                    if (bool == null) {
                    }
                    z10 = b11;
                    cVar = (ff.c) ff.c.class.cast(zVar.f21340e.get(ff.c.class));
                    if (cVar == null) {
                    }
                    TreeMap M102 = zVar.f21338c.M();
                    ArrayList arrayList2 = new ArrayList(M102.size());
                    while (r1.hasNext()) {
                    }
                    k02 = fVar2.k0(new C3421a(AbstractC4268D.k1(arrayList2)));
                    if (k02 != null) {
                    }
                    String str32 = zVar.f21336a.f21257h;
                    E10 = fVar2.E("okhttp.request");
                    if (!(E10 instanceof M6.c)) {
                    }
                    if (cVar2 != null) {
                    }
                    start = E10.a(dVar).start();
                    z11 = start instanceof S6.a;
                    if (!z11) {
                    }
                    if (aVar2 != null) {
                    }
                    start.a("http.url", str32);
                    start.a("http.method", zVar.f21337b);
                    z zVar22 = g(gVar, zVar, fVar2, start, z10).b();
                } else {
                    String r11 = zVar.f21338c.r("X-B3-Sampled");
                    if (r11 != null) {
                        if (AbstractC3557B.K(r11, "1")) {
                            bool = Boolean.TRUE;
                        } else {
                            if (AbstractC3557B.K(r11, WebrtcBuildVersion.maint_version)) {
                                bool = Boolean.FALSE;
                            }
                            bool = null;
                        }
                        if (bool == null) {
                        }
                        z10 = b11;
                        cVar = (ff.c) ff.c.class.cast(zVar.f21340e.get(ff.c.class));
                        if (cVar == null) {
                        }
                        TreeMap M1022 = zVar.f21338c.M();
                        ArrayList arrayList22 = new ArrayList(M1022.size());
                        while (r1.hasNext()) {
                        }
                        k02 = fVar2.k0(new C3421a(AbstractC4268D.k1(arrayList22)));
                        if (k02 != null) {
                        }
                        String str322 = zVar.f21336a.f21257h;
                        E10 = fVar2.E("okhttp.request");
                        if (!(E10 instanceof M6.c)) {
                        }
                        if (cVar2 != null) {
                        }
                        start = E10.a(dVar).start();
                        z11 = start instanceof S6.a;
                        if (!z11) {
                        }
                        if (aVar2 != null) {
                        }
                        start.a("http.url", str322);
                        start.a("http.method", zVar.f21337b);
                        z zVar222 = g(gVar, zVar, fVar2, start, z10).b();
                        D b1222 = fVar.b(zVar222);
                        c(gVar, zVar, b1222, start, z10);
                        return b1222;
                    }
                    String r12 = zVar.f21338c.r("b3");
                    if (r12 != null) {
                        if (AbstractC3557B.K(r12, WebrtcBuildVersion.maint_version)) {
                            bool = Boolean.FALSE;
                        } else {
                            List G22 = Lg.n.G2(r12, new String[]{"-"});
                            if (G22.size() >= 3) {
                                String str4 = (String) G22.get(2);
                                int hashCode = str4.hashCode();
                                if (hashCode != 48) {
                                    bool = hashCode != 49 ? Boolean.TRUE : Boolean.TRUE;
                                } else {
                                    if (str4.equals(WebrtcBuildVersion.maint_version)) {
                                        bool = Boolean.FALSE;
                                    }
                                    bool = null;
                                }
                            }
                        }
                        if (bool == null) {
                        }
                        z10 = b11;
                        cVar = (ff.c) ff.c.class.cast(zVar.f21340e.get(ff.c.class));
                        if (cVar == null) {
                        }
                        TreeMap M10222 = zVar.f21338c.M();
                        ArrayList arrayList222 = new ArrayList(M10222.size());
                        while (r1.hasNext()) {
                        }
                        k02 = fVar2.k0(new C3421a(AbstractC4268D.k1(arrayList222)));
                        if (k02 != null) {
                        }
                        String str3222 = zVar.f21336a.f21257h;
                        E10 = fVar2.E("okhttp.request");
                        if (!(E10 instanceof M6.c)) {
                        }
                        if (cVar2 != null) {
                        }
                        start = E10.a(dVar).start();
                        z11 = start instanceof S6.a;
                        if (!z11) {
                        }
                        if (aVar2 != null) {
                        }
                        start.a("http.url", str3222);
                        start.a("http.method", zVar.f21337b);
                        z zVar2222 = g(gVar, zVar, fVar2, start, z10).b();
                        D b12222 = fVar.b(zVar2222);
                        c(gVar, zVar, b12222, start, z10);
                        return b12222;
                    }
                    String r13 = zVar.f21338c.r("traceparent");
                    if (r13 != null) {
                        List G23 = Lg.n.G2(r13, new String[]{"-"});
                        if (G23.size() >= 4) {
                            Integer W12 = m.W1((String) G23.get(3));
                            if (W12 != null && W12.intValue() == 1) {
                                bool = Boolean.TRUE;
                            } else if (W12 != null && W12.intValue() == 0) {
                                bool = Boolean.FALSE;
                            }
                            if (bool == null) {
                            }
                            z10 = b11;
                            cVar = (ff.c) ff.c.class.cast(zVar.f21340e.get(ff.c.class));
                            if (cVar == null) {
                            }
                            TreeMap M102222 = zVar.f21338c.M();
                            ArrayList arrayList2222 = new ArrayList(M102222.size());
                            while (r1.hasNext()) {
                            }
                            k02 = fVar2.k0(new C3421a(AbstractC4268D.k1(arrayList2222)));
                            if (k02 != null) {
                            }
                            String str32222 = zVar.f21336a.f21257h;
                            E10 = fVar2.E("okhttp.request");
                            if (!(E10 instanceof M6.c)) {
                            }
                            if (cVar2 != null) {
                            }
                            start = E10.a(dVar).start();
                            z11 = start instanceof S6.a;
                            if (!z11) {
                            }
                            if (aVar2 != null) {
                            }
                            start.a("http.url", str32222);
                            start.a("http.method", zVar.f21337b);
                            z zVar22222 = g(gVar, zVar, fVar2, start, z10).b();
                            D b122222 = fVar.b(zVar22222);
                            c(gVar, zVar, b122222, start, z10);
                            return b122222;
                        }
                    }
                    bool = null;
                    if (bool == null) {
                    }
                    z10 = b11;
                    cVar = (ff.c) ff.c.class.cast(zVar.f21340e.get(ff.c.class));
                    if (cVar == null) {
                    }
                    TreeMap M1022222 = zVar.f21338c.M();
                    ArrayList arrayList22222 = new ArrayList(M1022222.size());
                    while (r1.hasNext()) {
                    }
                    k02 = fVar2.k0(new C3421a(AbstractC4268D.k1(arrayList22222)));
                    if (k02 != null) {
                    }
                    String str322222 = zVar.f21336a.f21257h;
                    E10 = fVar2.E("okhttp.request");
                    if (!(E10 instanceof M6.c)) {
                    }
                    if (cVar2 != null) {
                    }
                    start = E10.a(dVar).start();
                    z11 = start instanceof S6.a;
                    if (!z11) {
                    }
                    if (aVar2 != null) {
                    }
                    start.a("http.url", str322222);
                    start.a("http.method", zVar.f21337b);
                    z zVar222222 = g(gVar, zVar, fVar2, start, z10).b();
                    D b1222222 = fVar.b(zVar222222);
                    c(gVar, zVar, b1222222, start, z10);
                    return b1222222;
                }
            }
        }
        try {
            return fVar.b(zVar);
        } finally {
            d(gVar, zVar, null, null, th3);
        }
    }

    public boolean b() {
        return true;
    }

    public final void c(g gVar, z zVar, D d10, ff.c cVar, boolean z10) {
        S6.a aVar;
        S6.a aVar2;
        if (z10) {
            int i10 = d10.f21133i0;
            cVar.d(Integer.valueOf(i10));
            S6.a aVar3 = null;
            if (400 <= i10 && i10 < 500) {
                if (cVar instanceof S6.a) {
                    aVar2 = (S6.a) cVar;
                } else {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    ((M6.a) aVar2).f11651b.f11667k = true;
                }
            }
            if (i10 == 404) {
                if (cVar instanceof S6.a) {
                    aVar = (S6.a) cVar;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    ((M6.a) aVar).f11651b.f11665i = "404";
                }
            }
            d(gVar, zVar, cVar, d10, null);
            if (b()) {
                cVar.b();
                return;
            }
            if (cVar instanceof S6.a) {
                aVar3 = (S6.a) cVar;
            }
            if (aVar3 != null) {
                M6.a aVar4 = (M6.a) aVar3;
                aVar4.f11651b.f11658b.s(aVar4, false);
                return;
            }
            return;
        }
        d(gVar, zVar, null, d10, null);
    }

    public void d(g gVar, z zVar, ff.c cVar, D d10, Throwable th2) {
        AbstractC3557B.c0("request", zVar);
        if (cVar != null) {
            this.f31293c.getClass();
        }
    }

    public void e(g gVar) {
        AbstractC3557B.c0("sdkCore", gVar);
        if (this.f31299i.f3417a.isEmpty() && gVar.m().f3417a.isEmpty()) {
            P4.a.m0(gVar.l(), 4, EnumC5090b.f42738Y, C3203c.f31287h0, null, true, 40);
        }
    }

    public final ff.f f(g gVar) {
        AtomicReference atomicReference = this.f31297g;
        if (atomicReference.get() == null) {
            Object invoke = this.f31296f.invoke(gVar, AbstractC4273I.u2(kf.t.P2(AbstractC6583a.I1(this.f31299i.f3417a.values())), kf.t.P2(AbstractC6583a.I1(gVar.m().f3417a.values()))));
            while (!atomicReference.compareAndSet(null, invoke) && atomicReference.get() == null) {
            }
            P4.a.m0(gVar.l(), 4, EnumC5090b.f42738Y, C3203c.f31288i0, null, false, 56);
        }
        Object obj = atomicReference.get();
        AbstractC3557B.b0("localTracerReference.get()", obj);
        return (ff.f) obj;
    }

    public final y g(g gVar, z zVar, ff.f fVar, ff.c cVar, boolean z10) {
        y b10 = zVar.b();
        D5.a aVar = this.f31299i;
        s sVar = zVar.f21336a;
        Set b11 = aVar.b(sVar);
        if (b11.isEmpty()) {
            b11 = gVar.m().b(sVar);
        }
        Set<C6.g> set = b11;
        if (!z10) {
            for (C6.g gVar2 : set) {
                int ordinal = gVar2.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                b10.f("traceparent");
                                b10.f("tracestate");
                                String b12 = cVar.c().b();
                                String a5 = cVar.c().a();
                                AbstractC3557B.b0("traceId", b12);
                                String r22 = Lg.n.r2(b12, 32);
                                AbstractC3557B.b0("spanId", a5);
                                b10.a("traceparent", String.format("00-%s-%s-00", Arrays.copyOf(new Object[]{r22, Lg.n.r2(a5, 16)}, 2)));
                                String format = String.format("dd=p:%s;s:0", Arrays.copyOf(new Object[]{Lg.n.r2(a5, 16)}, 1));
                                String str = this.f31294d;
                                if (str != null) {
                                    format = android.gov.nist.core.a.j(format, ";o:", str);
                                }
                                b10.a("tracestate", format);
                            }
                        } else {
                            for (String str2 : AbstractC4344b.G0("X-B3-TraceId", "X-B3-SpanId", "X-B3-Sampled")) {
                                b10.f(str2);
                            }
                            b10.a("X-B3-Sampled", WebrtcBuildVersion.maint_version);
                        }
                    } else {
                        b10.f("b3");
                        b10.a("b3", WebrtcBuildVersion.maint_version);
                    }
                } else {
                    for (String str3 : AbstractC4344b.G0("x-datadog-sampling-priority", "x-datadog-trace-id", "x-datadog-parent-id", "x-datadog-origin")) {
                        b10.f(str3);
                    }
                    b10.a("x-datadog-sampling-priority", WebrtcBuildVersion.maint_version);
                }
            }
        } else {
            fVar.B(cVar.c(), new C3201a(b10, set));
        }
        return b10;
    }
}
