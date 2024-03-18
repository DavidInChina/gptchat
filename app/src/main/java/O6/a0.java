package o6;

import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import jf.C3959i;
import kf.AbstractC4268D;
import l8.AbstractC4344b;
import m6.C4562a;
import m6.C4564c;
import p5.EnumC5090b;
import t5.AbstractC5675a;
import x6.C6351y1;
import x6.E1;
import z.C6686a;
import z6.C6777c;

/* loaded from: classes.dex */
public final class a0 implements M {

    /* renamed from: N  reason: collision with root package name */
    public static final long f40765N = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: O  reason: collision with root package name */
    public static final long f40766O = TimeUnit.MILLISECONDS.toNanos(700);
    public static final /* synthetic */ int P = 0;

    /* renamed from: A  reason: collision with root package name */
    public long f40767A;

    /* renamed from: B  reason: collision with root package name */
    public long f40768B;

    /* renamed from: C  reason: collision with root package name */
    public long f40769C;

    /* renamed from: D  reason: collision with root package name */
    public long f40770D;

    /* renamed from: E  reason: collision with root package name */
    public long f40771E;

    /* renamed from: F  reason: collision with root package name */
    public final LinkedHashMap f40772F;

    /* renamed from: G  reason: collision with root package name */
    public final LinkedHashMap f40773G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f40774H;

    /* renamed from: I  reason: collision with root package name */
    public Double f40775I;

    /* renamed from: J  reason: collision with root package name */
    public w6.k f40776J;

    /* renamed from: K  reason: collision with root package name */
    public w6.k f40777K;

    /* renamed from: L  reason: collision with root package name */
    public final LinkedHashMap f40778L;

    /* renamed from: M  reason: collision with root package name */
    public final int f40779M;

    /* renamed from: a  reason: collision with root package name */
    public final M f40780a;

    /* renamed from: b  reason: collision with root package name */
    public final u5.g f40781b;

    /* renamed from: c  reason: collision with root package name */
    public final N f40782c;

    /* renamed from: d  reason: collision with root package name */
    public final P f40783d;

    /* renamed from: e  reason: collision with root package name */
    public final D5.a f40784e;

    /* renamed from: f  reason: collision with root package name */
    public final k5.F f40785f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f40786g;

    /* renamed from: h  reason: collision with root package name */
    public final float f40787h;

    /* renamed from: i  reason: collision with root package name */
    public final String f40788i;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap f40789j;

    /* renamed from: k  reason: collision with root package name */
    public LinkedHashMap f40790k;

    /* renamed from: l  reason: collision with root package name */
    public String f40791l;

    /* renamed from: m  reason: collision with root package name */
    public String f40792m;

    /* renamed from: n  reason: collision with root package name */
    public final LinkedHashSet f40793n;

    /* renamed from: o  reason: collision with root package name */
    public final long f40794o;

    /* renamed from: p  reason: collision with root package name */
    public final long f40795p;

    /* renamed from: q  reason: collision with root package name */
    public final long f40796q;

    /* renamed from: r  reason: collision with root package name */
    public M f40797r;

    /* renamed from: s  reason: collision with root package name */
    public final LinkedHashMap f40798s;

    /* renamed from: t  reason: collision with root package name */
    public long f40799t;

    /* renamed from: u  reason: collision with root package name */
    public long f40800u;

    /* renamed from: v  reason: collision with root package name */
    public int f40801v;

    /* renamed from: w  reason: collision with root package name */
    public long f40802w;

    /* renamed from: x  reason: collision with root package name */
    public long f40803x;

    /* renamed from: y  reason: collision with root package name */
    public long f40804y;

    /* renamed from: z  reason: collision with root package name */
    public long f40805z;

    /* JADX WARN: Type inference failed for: r0v0, types: [k5.F, java.lang.Object] */
    public a0(M m10, u5.g gVar, N n10, C4564c c4564c, Map map, P p10, D5.a aVar, w6.m mVar, w6.m mVar2, w6.m mVar3, int i10, boolean z10, float f6, int i11) {
        ?? obj = new Object();
        i10 = (i11 & 2048) != 0 ? 2 : i10;
        AbstractC3557B.c0("parentScope", m10);
        AbstractC3557B.c0("sdkCore", gVar);
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, n10);
        AbstractC3557B.c0("eventTime", c4564c);
        AbstractC3557B.c0("initialAttributes", map);
        AbstractC3557B.c0("firstPartyHostHeaderTypeResolver", aVar);
        AbstractC2469q0.q("type", i10);
        this.f40780a = m10;
        this.f40781b = gVar;
        this.f40782c = n10;
        this.f40783d = p10;
        this.f40784e = aVar;
        this.f40785f = obj;
        this.f40779M = i10;
        this.f40786g = z10;
        this.f40787h = f6;
        this.f40788i = Lg.n.z2(n10.f40686b, '.', '/');
        this.f40789j = AbstractC4268D.m1(map);
        this.f40790k = AbstractC4268D.m1(i6.b.a(gVar).h());
        this.f40791l = m10.c().f38946b;
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("randomUUID().toString()", uuid);
        this.f40792m = uuid;
        this.f40793n = new LinkedHashSet();
        this.f40794o = c4564c.f38962b;
        long j6 = gVar.getTime().f43935d;
        this.f40795p = j6;
        this.f40796q = c4564c.f38961a + j6;
        this.f40798s = new LinkedHashMap();
        this.f40771E = 1L;
        this.f40772F = new LinkedHashMap();
        this.f40773G = new LinkedHashMap();
        U u10 = new U(this);
        V v10 = new V(this, 1);
        V v11 = new V(this, 0);
        this.f40778L = new LinkedHashMap();
        gVar.j("rum", new T(this, 0));
        mVar.b(u10);
        mVar2.b(v10);
        mVar3.b(v11);
        C4562a c10 = m10.c();
        if (c10.f38955k != null) {
            Log.i("DatadogSynthetics", "_dd.application.id=" + c10.f38945a);
            Log.i("DatadogSynthetics", "_dd.session.id=" + c10.f38946b);
            String str = this.f40792m;
            Log.i("DatadogSynthetics", "_dd.view.id=" + str);
        }
    }

    @Override // o6.M
    public final boolean a() {
        return !this.f40774H;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04a2  */
    @Override // o6.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M b(L4.a aVar, AbstractC5675a abstractC5675a) {
        int i10;
        a0 a0Var;
        u5.g gVar;
        boolean z10;
        r.f fVar;
        Boolean bool;
        boolean z11;
        String str;
        String str2;
        boolean z12;
        String str3;
        String str4;
        u5.g gVar2;
        AbstractC3557B.c0("writer", abstractC5675a);
        boolean z13 = this.f40774H;
        u5.g gVar3 = this.f40781b;
        if (!z13 && !(aVar instanceof C)) {
            this.f40790k = AbstractC4268D.m1(i6.b.a(gVar3).h());
        }
        boolean z14 = aVar instanceof C4942v;
        LinkedHashSet linkedHashSet = this.f40793n;
        int i11 = 1;
        if (z14) {
            C4942v c4942v = (C4942v) aVar;
            String str5 = this.f40792m;
            String str6 = c4942v.f40904j;
            if (AbstractC3557B.K(str6, str5) || linkedHashSet.contains(str6)) {
                this.f40767A--;
                this.f40799t++;
                g(c4942v, abstractC5675a);
            }
        } else if (aVar instanceof C4931j) {
            C4931j c4931j = (C4931j) aVar;
            String str7 = this.f40792m;
            String str8 = c4931j.f40870j;
            if (AbstractC3557B.K(str8, str7) || linkedHashSet.contains(str8)) {
                this.f40768B--;
                this.f40800u++;
                this.f40801v += c4931j.f40871k;
                g(c4931j, abstractC5675a);
            }
        } else if (aVar instanceof C4937p) {
            C4937p c4937p = (C4937p) aVar;
            String str9 = this.f40792m;
            String str10 = c4937p.f40893j;
            if (AbstractC3557B.K(str10, str9) || linkedHashSet.contains(str10)) {
                this.f40769C--;
                this.f40802w++;
                g(c4937p, abstractC5675a);
            }
        } else if (aVar instanceof C4939s) {
            C4939s c4939s = (C4939s) aVar;
            String str11 = this.f40792m;
            String str12 = c4939s.f40899j;
            if (AbstractC3557B.K(str12, str11) || linkedHashSet.contains(str12)) {
                this.f40770D--;
                this.f40804y++;
                if (c4939s.f40900k) {
                    this.f40805z++;
                }
                g(c4939s, abstractC5675a);
            }
        } else if (aVar instanceof C4941u) {
            String str13 = this.f40792m;
            String str14 = ((C4941u) aVar).f40902j;
            if (AbstractC3557B.K(str14, str13) || linkedHashSet.contains(str14)) {
                this.f40767A--;
            }
        } else if (aVar instanceof C4930i) {
            String str15 = this.f40792m;
            String str16 = ((C4930i) aVar).f40868j;
            if (AbstractC3557B.K(str16, str15) || linkedHashSet.contains(str16)) {
                this.f40768B--;
            }
        } else if (aVar instanceof C4936o) {
            String str17 = this.f40792m;
            String str18 = ((C4936o) aVar).f40891j;
            if (AbstractC3557B.K(str18, str17) || linkedHashSet.contains(str18)) {
                this.f40769C--;
            }
        } else if (aVar instanceof r) {
            String str19 = this.f40792m;
            String str20 = ((r) aVar).f40896j;
            if (AbstractC3557B.K(str20, str19) || linkedHashSet.contains(str20)) {
                this.f40770D--;
            }
        } else if (aVar instanceof C) {
            C c10 = (C) aVar;
            if (!this.f40774H) {
                this.f40774H = true;
                g(c10, abstractC5675a);
                d(c10, abstractC5675a);
                f();
            }
        } else if (aVar instanceof G) {
            G g10 = (G) aVar;
            d(g10, abstractC5675a);
            if (AbstractC3557B.K(g10.f40640j.f40685a, this.f40782c.f40685a) && !this.f40774H) {
                gVar3.j("rum", new Y(this, C4562a.a(c(), null, false, null, null, null, null, 0, 0, 1, null, null, 3463), 0));
                this.f40789j.putAll(g10.f40641k);
                this.f40774H = true;
                g(g10, abstractC5675a);
                f();
            }
        } else {
            boolean z15 = aVar instanceof C4920A;
            k5.F f6 = this.f40785f;
            if (z15) {
                C4920A c4920a = (C4920A) aVar;
                d(c4920a, abstractC5675a);
                if (!this.f40774H) {
                    if (this.f40797r != null) {
                        if (c4920a.f40610j == i6.d.f32727k0 && !c4920a.f40612l) {
                            AbstractC3557B.c0("sdkCore", gVar3);
                            AbstractC3557B.c0("featuresContextResolver", f6);
                            gVar2 = gVar3;
                            C4926e c4926e = new C4926e(this, gVar3, c4920a.f40612l, c4920a.f40614n, c4920a.f40610j, c4920a.f40611k, c4920a.f40613m, this.f40795p, f6, this.f40786g, this.f40787h);
                            this.f40768B++;
                            c4926e.b(new C4944x(), abstractC5675a);
                        } else {
                            gVar2 = gVar3;
                            P4.a.m0(gVar2.l(), 4, EnumC5090b.f42738Y, new X0.b(24, c4920a), null, false, 56);
                        }
                        gVar3 = gVar2;
                        i11 = 1;
                    } else {
                        AbstractC3557B.c0("sdkCore", gVar3);
                        AbstractC3557B.c0("featuresContextResolver", f6);
                        this.f40797r = new C4926e(this, gVar3, c4920a.f40612l, c4920a.f40614n, c4920a.f40610j, c4920a.f40611k, c4920a.f40613m, this.f40795p, f6, this.f40786g, this.f40787h);
                        i11 = 1;
                        gVar3.j("rum", new Y(this, c(), 1));
                        this.f40768B++;
                    }
                }
            } else {
                if (aVar instanceof C4921B) {
                    C4921B c4921b = (C4921B) aVar;
                    d(c4921b, abstractC5675a);
                    if (this.f40774H) {
                        a0Var = this;
                        gVar = gVar3;
                    } else {
                        LinkedHashMap m12 = AbstractC4268D.m1(c4921b.f40618m);
                        m12.putAll(this.f40790k);
                        String str21 = c4921b.f40615j;
                        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str21);
                        String str22 = c4921b.f40616k;
                        AbstractC3557B.c0("url", str22);
                        int i12 = c4921b.f40617l;
                        AbstractC2469q0.q("method", i12);
                        C4564c c4564c = c4921b.f40619n;
                        AbstractC3557B.c0("eventTime", c4564c);
                        LinkedHashMap linkedHashMap = this.f40798s;
                        AbstractC3557B.c0("sdkCore", gVar3);
                        D5.a aVar2 = this.f40784e;
                        AbstractC3557B.c0("firstPartyHostHeaderTypeResolver", aVar2);
                        AbstractC3557B.c0("featuresContextResolver", f6);
                        gVar = gVar3;
                        linkedHashMap.put(str21, new L(this, gVar3, str22, i12, str21, c4564c, m12, this.f40795p, aVar2, f6, this.f40787h));
                        a0Var = this;
                        a0Var.f40767A++;
                    }
                } else {
                    a0Var = this;
                    gVar = gVar3;
                    if (aVar instanceof C4932k) {
                        C4932k c4932k = (C4932k) aVar;
                        a0Var.d(c4932k, abstractC5675a);
                        if (!a0Var.f40774H) {
                            C4562a c11 = c();
                            LinkedHashMap m13 = AbstractC4268D.m1(c4932k.f40878o);
                            m13.putAll(a0Var.f40790k);
                            Object remove = m13.remove("_dd.error.is_crash");
                            if (remove instanceof Boolean) {
                                bool = (Boolean) remove;
                            } else {
                                bool = null;
                            }
                            if (!AbstractC3557B.K(bool, Boolean.TRUE) && !c4932k.f40877n) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (a0Var.f40803x <= 0 || !z11) {
                                Throwable th2 = c4932k.f40875l;
                                String str23 = c4932k.f40880q;
                                if (str23 == null) {
                                    if (th2 != null) {
                                        str23 = th2.getClass().getCanonicalName();
                                    } else {
                                        str = null;
                                        if (th2 != null || (str2 = th2.getMessage()) == null) {
                                            str2 = "";
                                        }
                                        i10 = 1;
                                        z12 = !Lg.n.n2(str2);
                                        str3 = c4932k.f40873j;
                                        if (!z12 && !AbstractC3557B.K(str3, str2)) {
                                            str4 = android.gov.nist.core.a.j(str3, ": ", str2);
                                        } else {
                                            str4 = str3;
                                        }
                                        gVar3 = gVar;
                                        C6777c q02 = P4.a.q0(gVar3, abstractC5675a, new A.D(this, c11, c4932k, str4, z11, str, m13));
                                        if (!z11) {
                                            q02.f51750e = new J(c11, 4);
                                            q02.f51751f = new J(c11, 5);
                                        }
                                        q02.b();
                                        if (!z11) {
                                            a0Var.f40802w++;
                                            a0Var.f40803x++;
                                            a0Var.g(c4932k, abstractC5675a);
                                        } else {
                                            a0Var.f40769C++;
                                        }
                                    }
                                }
                                str = str23;
                                if (th2 != null) {
                                }
                                str2 = "";
                                i10 = 1;
                                z12 = !Lg.n.n2(str2);
                                str3 = c4932k.f40873j;
                                if (!z12) {
                                }
                                str4 = str3;
                                gVar3 = gVar;
                                C6777c q022 = P4.a.q0(gVar3, abstractC5675a, new A.D(this, c11, c4932k, str4, z11, str, m13));
                                if (!z11) {
                                }
                                q022.b();
                                if (!z11) {
                                }
                            }
                        }
                    } else {
                        gVar3 = gVar;
                        i10 = 1;
                        if (aVar instanceof C4934m) {
                            C4934m c4934m = (C4934m) aVar;
                            a0Var.d(c4934m, abstractC5675a);
                            if (!a0Var.f40774H) {
                                C4562a c12 = c();
                                LinkedHashMap m14 = AbstractC4268D.m1(P4.a.o0(new C3959i("long_task.target", c4934m.f40887k)));
                                m14.putAll(a0Var.f40790k);
                                long j6 = c4934m.f40888l.f38961a + a0Var.f40795p;
                                if (c4934m.f40886j > f40766O) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                C6777c q03 = P4.a.q0(gVar3, abstractC5675a, new W(this, c12, j6, c4934m, z10, m14));
                                if (z10) {
                                    fVar = r6.e.f44456f;
                                } else {
                                    fVar = r6.f.f44457f;
                                }
                                q03.f51750e = new X(c12, fVar, 0);
                                q03.f51751f = new X(c12, fVar, 1);
                                q03.b();
                                a0Var.f40770D++;
                            }
                        } else if (aVar instanceof C4933l) {
                            C4933l c4933l = (C4933l) aVar;
                            if (!a0Var.f40774H) {
                                a0Var.f40773G.put(c4933l.f40883j, c4933l.f40884k);
                                a0Var.g(c4933l, abstractC5675a);
                                f();
                            }
                        } else if (aVar instanceof C4935n) {
                            a0Var.f40768B++;
                            C4562a c13 = c();
                            C6777c q04 = P4.a.q0(gVar3, abstractC5675a, new C6686a(c13, this, (C4935n) aVar, AbstractC4268D.m1(a0Var.f40790k), 7));
                            r6.c cVar = new r6.c(0);
                            q04.f51750e = new C4925d(c13, cVar, 2);
                            q04.f51751f = new C4925d(c13, cVar, 3);
                            q04.b();
                        } else if (aVar instanceof C4938q) {
                            C4938q c4938q = (C4938q) aVar;
                            a0Var.d(c4938q, abstractC5675a);
                            if (!a0Var.f40774H) {
                                a0Var.g(c4938q, abstractC5675a);
                            }
                        } else {
                            d(aVar, abstractC5675a);
                        }
                    }
                    if (e()) {
                        gVar3.j("session-replay", new T(a0Var, i10));
                        return null;
                    }
                    return a0Var;
                }
                gVar3 = gVar;
                i10 = 1;
                if (e()) {
                }
            }
        }
        a0Var = this;
        i10 = i11;
        if (e()) {
        }
    }

    @Override // o6.M
    public final C4562a c() {
        C4926e c4926e;
        String str;
        C4562a c10;
        C4562a c11 = this.f40780a.c();
        if (!AbstractC3557B.K(c11.f38946b, this.f40791l)) {
            this.f40791l = c11.f38946b;
            String uuid = UUID.randomUUID().toString();
            AbstractC3557B.b0("randomUUID().toString()", uuid);
            this.f40793n.add(this.f40792m);
            this.f40792m = uuid;
            if (c().f38955k != null) {
                Log.i("DatadogSynthetics", "_dd.application.id=" + c10.f38945a);
                Log.i("DatadogSynthetics", "_dd.session.id=" + c10.f38946b);
                Log.i("DatadogSynthetics", "_dd.view.id=" + this.f40792m);
            }
        }
        String str2 = this.f40792m;
        String str3 = this.f40782c.f40687c;
        M m10 = this.f40797r;
        if (m10 instanceof C4926e) {
            c4926e = (C4926e) m10;
        } else {
            c4926e = null;
        }
        if (c4926e != null) {
            str = c4926e.f40834j;
        } else {
            str = null;
        }
        return C4562a.a(c11, null, false, str2, str3, this.f40788i, str, 0, 0, this.f40779M, null, null, 3463);
    }

    public final void d(L4.a aVar, AbstractC5675a abstractC5675a) {
        Iterator it = this.f40798s.entrySet().iterator();
        while (it.hasNext()) {
            if (((M) ((Map.Entry) it.next()).getValue()).b(aVar, abstractC5675a) == null) {
                if (aVar instanceof F) {
                    this.f40767A--;
                    this.f40769C++;
                }
                it.remove();
            }
        }
        M m10 = this.f40797r;
        if (m10 != null && m10.b(aVar, abstractC5675a) == null) {
            this.f40797r = null;
            this.f40781b.j("rum", new Y(this, c(), 1));
        }
    }

    public final boolean e() {
        long j6 = this.f40768B + this.f40767A + this.f40769C + this.f40770D;
        if (this.f40774H && this.f40798s.isEmpty() && j6 <= 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        P p10 = this.f40783d;
        if (p10 != null) {
            Q q10 = new Q(this.f40782c, this.f40789j, !this.f40774H);
            C4928g c4928g = (C4928g) p10;
            if (q10.f40708c) {
                c4928g.f40865l = q10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(L4.a aVar, AbstractC5675a abstractC5675a) {
        long j6;
        E1 e12;
        E1 e13;
        long j10;
        long j11;
        E1 e14;
        long j12;
        Boolean bool;
        long j13;
        long j14;
        boolean z10;
        Object obj;
        Boolean bool2;
        boolean z11;
        boolean z12;
        double d10;
        double d11;
        boolean e10 = e();
        long j15 = this.f40771E + 1;
        this.f40771E = j15;
        long j16 = this.f40800u;
        long j17 = this.f40802w;
        long j18 = this.f40799t;
        long j19 = this.f40803x;
        long j20 = this.f40804y;
        long j21 = this.f40805z;
        Double d12 = this.f40775I;
        int i10 = this.f40801v;
        LinkedHashMap linkedHashMap = this.f40778L;
        w6.k kVar = (w6.k) linkedHashMap.get(i6.g.f32731Y);
        if (kVar != null) {
            j6 = j21;
            e12 = new E1(Double.valueOf(kVar.f48064b), Double.valueOf(kVar.f48065c), Double.valueOf(kVar.f48066d), null);
        } else {
            j6 = j21;
            e12 = null;
        }
        w6.k kVar2 = (w6.k) linkedHashMap.get(i6.g.f32732Z);
        if (kVar2 != null) {
            j10 = j15;
            e13 = new E1(Double.valueOf(kVar2.f48064b), Double.valueOf(kVar2.f48065c), Double.valueOf(kVar2.f48066d), null);
        } else {
            j10 = j15;
            e13 = null;
        }
        w6.k kVar3 = (w6.k) linkedHashMap.get(i6.g.f32733h0);
        if (kVar3 != null) {
            double d13 = kVar3.f48065c;
            if (d13 == 0.0d) {
                d10 = 0.0d;
            } else {
                d10 = 1.0d / d13;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            j12 = j17;
            j13 = 1;
            Double valueOf = Double.valueOf(d10 * timeUnit.toNanos(1L));
            double d14 = kVar3.f48064b;
            double d15 = 0.0d;
            if (d14 == 0.0d) {
                j11 = j18;
                d11 = 0.0d;
            } else {
                d11 = 1.0d / d14;
                j11 = j18;
            }
            Double valueOf2 = Double.valueOf(d11 * timeUnit.toNanos(1L));
            double d16 = kVar3.f48066d;
            if (d16 != 0.0d) {
                d15 = 1.0d / d16;
            }
            bool = null;
            e14 = new E1(valueOf, valueOf2, Double.valueOf(d15 * timeUnit.toNanos(1L)), null);
        } else {
            j12 = j17;
            j11 = j18;
            j13 = 1;
            bool = null;
            e14 = null;
        }
        long j22 = aVar.v0().f38962b - this.f40794o;
        int i11 = (j22 > 0L ? 1 : (j22 == 0L ? 0 : -1));
        u5.g gVar = this.f40781b;
        if (i11 <= 0) {
            z10 = false;
            P4.a.l0(gVar.l(), 4, AbstractC4344b.G0(EnumC5090b.f42738Y, EnumC5090b.f42740h0), new X0.b(25, this), null, 56);
            j14 = j13;
        } else {
            z10 = false;
            j14 = j22;
        }
        C4562a c10 = c();
        LinkedHashMap linkedHashMap2 = this.f40772F;
        if (!linkedHashMap2.isEmpty()) {
            obj = new C6351y1(new LinkedHashMap(linkedHashMap2));
        } else {
            obj = bool;
        }
        w6.k kVar4 = this.f40776J;
        w6.k kVar5 = this.f40777K;
        if (kVar5 == null) {
            bool2 = bool;
        } else {
            if (kVar5.f48066d < 55.0d) {
                z12 = true;
            } else {
                z12 = z10;
            }
            bool2 = Boolean.valueOf(z12);
        }
        if (bool2 != null) {
            z11 = bool2.booleanValue();
        } else {
            z11 = z10;
        }
        P4.a.q0(gVar, abstractC5675a, new Z(c10, this, AbstractC4268D.m1(this.f40773G), j16, j11, j12, j19, j20, j6, e10, j14, d12, kVar4, kVar5, i10, obj, z11, e12, e13, e14, AbstractC4268D.m1(AbstractC4268D.e1(this.f40789j, this.f40790k)), j10)).b();
    }
}
