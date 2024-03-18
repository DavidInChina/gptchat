package Uf;

import Bg.AbstractC0218k;
import Bg.C0215h;
import Bg.c0;
import Bg.d0;
import Bg.h0;
import Bg.j0;
import Bg.p0;
import Df.AbstractC0405d;
import Ii.C0799d;
import Mf.AbstractC0994c;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.b0;
import Pf.AbstractC1158p;
import Pf.C1160s;
import Pf.T;
import Yf.C1692d;
import ah.C1994e;
import android.gov.nist.core.Separators;
import bg.AbstractC2194b;
import bg.AbstractC2197e;
import bg.AbstractC2203k;
import bh.C2212b;
import bh.C2213c;
import bh.C2217g;
import dg.AbstractC2653B;
import fg.C3056y;
import fi.C3100a;
import id.AbstractC3557B;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import ji.AbstractC4141p;
import ji.C4113B;
import ji.C4116E;
import ji.C4125N;
import kf.AbstractC4273I;
import kg.C4290b;
import kg.C4294f;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l8.AbstractC4344b;
import lf.C4436a;
import m.S;
import mh.C4667L;
import mh.C4670O;
import ng.C4846m;
import pg.C5165b;
import pg.C5172i;
import pg.C5177n;
import ug.AbstractC5926h;
import wf.AbstractC6216a;
import xg.C6455j;
import yf.AbstractC6583a;
import zf.AbstractC6853a;
import zg.C6862i;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f17718Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f17719Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(int i10, Object obj) {
        super(0);
        this.f17718Y = i10;
        this.f17719Z = obj;
    }

    public final Collection a() {
        int i10 = this.f17718Y;
        Object obj = this.f17719Z;
        switch (i10) {
            case 8:
                ug.s sVar = (ug.s) obj;
                return sVar.i(Bi.c.Q0(sVar.f46806b, null, 3));
            default:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : ((xg.q) obj).f50038o0.f49960d.keySet()) {
                    C4290b c4290b = (C4290b) obj2;
                    if (!(!c4290b.f37494b.e().d()) && !C6455j.f50006c.contains(c4290b)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C4290b) it.next()).i());
                }
                return arrayList2;
        }
    }

    public final Map c() {
        AbstractC2203k abstractC2203k;
        C5172i c5172i;
        Nf.n nVar;
        C5165b c5165b;
        kf.w wVar = kf.w.f37484Y;
        int i10 = this.f17718Y;
        Map map = null;
        Object obj = this.f17719Z;
        switch (i10) {
            case 1:
                Map map2 = Vf.e.f18948a;
                AbstractC2194b abstractC2194b = ((Vf.k) obj).f18942d;
                if (abstractC2194b instanceof AbstractC2203k) {
                    abstractC2203k = (AbstractC2203k) abstractC2194b;
                } else {
                    abstractC2203k = null;
                }
                if (abstractC2203k != null && (nVar = (Nf.n) Vf.e.f18949b.get(C4294f.e(((Sf.v) abstractC2203k).f16626b.name()).b())) != null) {
                    c5172i = new C5172i(C4290b.j(Jf.p.f9189v), C4294f.e(nVar.name()));
                } else {
                    c5172i = null;
                }
                if (c5172i != null) {
                    map = P4.a.o0(new C3959i(Vf.c.f18945c, c5172i));
                }
                if (map != null) {
                    return map;
                }
                return wVar;
            default:
                AbstractC2194b abstractC2194b2 = ((Vf.l) obj).f18942d;
                if (abstractC2194b2 instanceof AbstractC2197e) {
                    Map map3 = Vf.e.f18948a;
                    c5165b = Vf.e.a(((Sf.h) ((AbstractC2197e) abstractC2194b2)).a());
                } else if (abstractC2194b2 instanceof AbstractC2203k) {
                    Map map4 = Vf.e.f18948a;
                    c5165b = Vf.e.a(AbstractC4344b.F0(abstractC2194b2));
                } else {
                    c5165b = null;
                }
                if (c5165b != null) {
                    map = P4.a.o0(new C3959i(Vf.c.f18944b, c5165b));
                }
                if (map != null) {
                    return map;
                }
                return wVar;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        I i10;
        jf.y yVar = jf.y.f36177a;
        int i11 = this.f17718Y;
        boolean z10 = false;
        Object obj = this.f17719Z;
        switch (i11) {
            case 0:
                B b10 = (B) obj;
                C4436a c4436a = new C4436a();
                c4436a.add(b10.f17720a.f17769Y);
                if (b10.f17721b != null) {
                    c4436a.add("under-migration:" + i10.f17769Y);
                }
                for (Map.Entry entry : b10.f17722c.entrySet()) {
                    c4436a.add(Separators.AT + entry.getKey() + ':' + ((I) entry.getValue()).f17769Y);
                }
                return (String[]) AbstractC4344b.Q(c4436a).toArray(new String[0]);
            case 1:
                return c();
            case 2:
                return c();
            case 3:
                C1692d c1692d = (C1692d) obj;
                ArrayList arrayList = new ArrayList();
                for (AbstractC2653B abstractC2653B : ((Map) A7.b.X0(c1692d.f22324c.f22380n0, Yf.q.f22377r0[0])).values()) {
                    zg.q a5 = ((Xf.a) c1692d.f22323b.f45394a).f21955d.a(c1692d.f22324c, abstractC2653B);
                    if (a5 != null) {
                        arrayList.add(a5);
                    }
                }
                return (ug.n[]) A7.b.k1(arrayList).toArray(new ug.n[0]);
            case 4:
                mg.m mVar = (mg.m) obj;
                mVar.getClass();
                mg.s sVar = mVar.f39299a;
                sVar.getClass();
                mg.s sVar2 = new mg.s();
                Field[] declaredFields = mg.s.class.getDeclaredFields();
                AbstractC3557B.b0("getDeclaredFields(...)", declaredFields);
                int length = declaredFields.length;
                int i12 = 0;
                while (i12 < length) {
                    Field field = declaredFields[i12];
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj2 = field.get(sVar);
                        AbstractC6853a abstractC6853a = obj2 instanceof AbstractC6853a ? (AbstractC6853a) obj2 : null;
                        if (abstractC6853a != null) {
                            String name = field.getName();
                            AbstractC3557B.b0("getName(...)", name);
                            Lg.n.I2(name, "is", z10);
                            AbstractC0405d b11 = kotlin.jvm.internal.C.f37623a.b(mg.s.class);
                            String name2 = field.getName();
                            StringBuilder sb2 = new StringBuilder("get");
                            String name3 = field.getName();
                            AbstractC3557B.b0("getName(...)", name3);
                            if (name3.length() > 0) {
                                int i13 = z10 ? 1 : 0;
                                int i14 = z10 ? 1 : 0;
                                char upperCase = Character.toUpperCase(name3.charAt(i13));
                                String substring = name3.substring(1);
                                AbstractC3557B.b0("substring(...)", substring);
                                name3 = upperCase + substring;
                            }
                            sb2.append(name3);
                            field.set(sVar2, new mg.q(abstractC6853a.a(sVar, new kotlin.jvm.internal.u(b11, name2, sb2.toString())), sVar2));
                        }
                    }
                    i12++;
                    z10 = false;
                }
                sVar2.o(AbstractC4273I.u2(sVar2.n(), AbstractC4344b.G0(Jf.p.f9183p, Jf.p.f9184q)));
                sVar2.f39342a = true;
                return new mg.m(sVar2);
            case 5:
                switch (i11) {
                    case 5:
                        Bg.A type = ((d0) obj).getType();
                        AbstractC3557B.b0("getType(...)", type);
                        return type;
                    default:
                        return Bi.c.J1((b0) ((Bg.I) obj).f2073b);
                }
            case 6:
                return mo122invoke();
            case 7:
                return mo122invoke();
            case 8:
                return a();
            case 9:
                h0 g10 = ((j0) obj).g();
                g10.getClass();
                return j0.e(g10);
            case 10:
                return a();
            case 11:
                return mo122invoke();
            case 12:
                return mo122invoke();
            case 13:
                return mo122invoke();
            case 14:
                return new C0215h(((AbstractC0218k) obj).b());
            case 15:
                switch (i11) {
                    case 5:
                        Bg.A type2 = ((d0) obj).getType();
                        AbstractC3557B.b0("getType(...)", type2);
                        return type2;
                    default:
                        return Bi.c.J1((b0) ((Bg.I) obj).f2073b);
                }
            case 16:
                return Dg.m.c(Dg.l.f3680D0, ((c0) obj).toString());
            case 17:
                return mo122invoke();
            case 18:
            default:
                mo122invoke();
                return yVar;
            case 19:
                C1994e c1994e = (C1994e) obj;
                C2217g O10 = Ad.l.O("kotlinx.serialization.Polymorphic", C2213c.f25984a, new SerialDescriptor[0], new Xf.f(21, c1994e));
                AbstractC0405d abstractC0405d = c1994e.f24197a;
                AbstractC3557B.c0("context", abstractC0405d);
                return new C2212b(O10, abstractC0405d);
            case 20:
                C2217g c2217g = (C2217g) obj;
                return Integer.valueOf(Bi.c.Z0(c2217g, c2217g.f26005k));
            case 21:
                mo122invoke();
                return yVar;
            case 22:
                return mo122invoke();
            case 23:
                return mo122invoke();
            case 24:
                return ((C0799d) obj).f8640a.getSharedPreferences("AppUpgradeDetector", 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [kf.v] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final List mo122invoke() {
        ?? r52;
        Iterator it;
        C3959i c3959i;
        AbstractC4141p abstractC4141p;
        int p22;
        int v02;
        C3959i c3959i2;
        int i10 = 4;
        boolean z10 = false;
        int i11 = this.f17718Y;
        Object obj = this.f17719Z;
        switch (i11) {
            case 6:
                C5177n c5177n = (C5177n) obj;
                Bg.D n10 = c5177n.f43152b.j().j("Comparable").n();
                AbstractC3557B.b0("getDefaultType(...)", n10);
                ArrayList N02 = AbstractC4344b.N0(K4.J.U(n10, AbstractC4344b.F0(new Bg.I(c5177n.f43154d, p0.f2147i0)), null, 2));
                Mf.B b10 = c5177n.f43152b;
                AbstractC3557B.c0("<this>", b10);
                Jf.l j6 = b10.j();
                j6.getClass();
                Bg.D s10 = j6.s(Jf.n.f9129o0);
                if (s10 != null) {
                    Jf.l j10 = b10.j();
                    j10.getClass();
                    Bg.D s11 = j10.s(Jf.n.f9131q0);
                    if (s11 != null) {
                        Jf.l j11 = b10.j();
                        j11.getClass();
                        Bg.D s12 = j11.s(Jf.n.f9127m0);
                        if (s12 != null) {
                            Jf.l j12 = b10.j();
                            j12.getClass();
                            Bg.D s13 = j12.s(Jf.n.f9128n0);
                            if (s13 != null) {
                                List G02 = AbstractC4344b.G0(s10, s11, s12, s13);
                                if (!G02.isEmpty()) {
                                    Iterator it2 = G02.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (!(!c5177n.f43153c.contains((Bg.A) it2.next()))) {
                                                Bg.D n11 = b10.j().j("Number").n();
                                                if (n11 != null) {
                                                    N02.add(n11);
                                                } else {
                                                    Jf.l.a(56);
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                return N02;
                            }
                            Jf.l.a(58);
                            throw null;
                        }
                        Jf.l.a(57);
                        throw null;
                    }
                    Jf.l.a(60);
                    throw null;
                }
                Jf.l.a(59);
                throw null;
            case 7:
                AbstractC5926h abstractC5926h = (AbstractC5926h) obj;
                List h10 = abstractC5926h.h();
                ArrayList arrayList = new ArrayList(3);
                Collection<Bg.A> l10 = abstractC5926h.f46791b.f().l();
                AbstractC3557B.b0("getSupertypes(...)", l10);
                ArrayList arrayList2 = new ArrayList();
                for (Bg.A a5 : l10) {
                    kf.s.N1(Bi.c.Q0(a5.R(), null, 3), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof AbstractC0994c) {
                        arrayList3.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    C4294f name = ((AbstractC0994c) next2).getName();
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(next2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    C4294f c4294f = (C4294f) entry.getKey();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj3 : (List) entry.getValue()) {
                        Boolean valueOf = Boolean.valueOf(((AbstractC0994c) obj3) instanceof AbstractC1013w);
                        Object obj4 = linkedHashMap2.get(valueOf);
                        if (obj4 == null) {
                            obj4 = new ArrayList();
                            linkedHashMap2.put(valueOf, obj4);
                        }
                        ((List) obj4).add(obj3);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list = (List) entry2.getValue();
                        C4846m c4846m = C4846m.f40356d;
                        if (booleanValue) {
                            r52 = new ArrayList();
                            for (Object obj5 : h10) {
                                if (AbstractC3557B.K(((AbstractC1158p) ((AbstractC1013w) obj5)).getName(), c4294f)) {
                                    r52.add(obj5);
                                }
                            }
                        } else {
                            r52 = kf.v.f37483Y;
                        }
                        c4846m.h(c4294f, list, r52, abstractC5926h.f46791b, new C1160s(arrayList, abstractC5926h));
                    }
                }
                return kf.t.w2(Ig.i.e(arrayList), h10);
            case 13:
                zg.u uVar = (zg.u) obj;
                M3.I i12 = uVar.f52101p0;
                return kf.t.K2(((xg.m) i12.f11536a).f50014e.b(uVar.f52102q0, i12.f11537b));
            case 17:
                AbstractC6216a abstractC6216a = ((Cg.l) obj).f3136b;
                if (abstractC6216a == null) {
                    return null;
                }
                return (List) abstractC6216a.mo122invoke();
            case 22:
                Wh.o oVar = ((ai.m) obj).f24281e;
                AbstractC3557B.Z(oVar);
                List<Certificate> a10 = oVar.a();
                ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(a10, 10));
                for (Certificate certificate : a10) {
                    AbstractC3557B.a0("null cannot be cast to non-null type java.security.cert.X509Certificate", certificate);
                    arrayList4.add((X509Certificate) certificate);
                }
                return arrayList4;
            default:
                ki.e eVar = (ki.e) obj;
                ClassLoader classLoader = eVar.f37604b;
                Enumeration<URL> resources = classLoader.getResources("");
                AbstractC3557B.b0("getResources(...)", resources);
                ArrayList list2 = Collections.list(resources);
                AbstractC3557B.b0("list(...)", list2);
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = list2.iterator();
                while (true) {
                    boolean hasNext = it5.hasNext();
                    AbstractC4141p abstractC4141p2 = eVar.f37605c;
                    if (hasNext) {
                        URL url = (URL) it5.next();
                        AbstractC3557B.Z(url);
                        if (!AbstractC3557B.K(url.getProtocol(), "file")) {
                            c3959i2 = null;
                        } else {
                            String str = C4113B.f36660Z;
                            c3959i2 = new C3959i(abstractC4141p2, C3100a.g(new File(url.toURI())));
                        }
                        if (c3959i2 != null) {
                            arrayList5.add(c3959i2);
                        }
                    } else {
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        AbstractC3557B.b0("getResources(...)", resources2);
                        ArrayList list3 = Collections.list(resources2);
                        AbstractC3557B.b0("list(...)", list3);
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it6 = list3.iterator();
                        while (it6.hasNext()) {
                            URL url2 = (URL) it6.next();
                            AbstractC3557B.Z(url2);
                            String url3 = url2.toString();
                            AbstractC3557B.b0("toString(...)", url3);
                            if (Lg.n.I2(url3, "jar:file:", z10) && (p22 = Lg.n.p2(url3, "!", 6)) != -1) {
                                String str2 = C4113B.f36660Z;
                                String substring = url3.substring(i10, p22);
                                AbstractC3557B.b0("substring(...)", substring);
                                C4113B g10 = C3100a.g(new File(URI.create(substring)));
                                AbstractC3557B.c0("fileSystem", abstractC4141p2);
                                C4116E j13 = abstractC4141p2.j(g10);
                                try {
                                    long h11 = j13.h() - 22;
                                    if (h11 < 0) {
                                        throw new IOException("not a zip: size=" + j13.h());
                                    }
                                    long max = Math.max(h11 - 65536, 0L);
                                    while (true) {
                                        C4116E J10 = R4.b.J(j13.i(h11));
                                        if (J10.v0() == 101010256) {
                                            int i13 = J10.i() & 65535;
                                            int i14 = J10.i() & 65535;
                                            long i15 = J10.i() & 65535;
                                            if (i15 == (J10.i() & 65535) && i13 == 0 && i14 == 0) {
                                                J10.skip(4L);
                                                int i16 = J10.i() & 65535;
                                                S s14 = new S(i15, i16, J10.v0() & 4294967295L);
                                                J10.j(i16);
                                                J10.close();
                                                long j14 = h11 - 20;
                                                if (j14 > 0) {
                                                    j13 = R4.b.J(j13.i(j14));
                                                    if (j13.v0() == 117853008) {
                                                        int v03 = j13.v0();
                                                        long C02 = j13.C0();
                                                        if (j13.v0() == 1 && v03 == 0) {
                                                            j13 = R4.b.J(j13.i(C02));
                                                            if (j13.v0() == 101075792) {
                                                                j13.skip(12L);
                                                                int v04 = j13.v0();
                                                                int v05 = j13.v0();
                                                                long C03 = j13.C0();
                                                                if (C03 == j13.C0() && v04 == 0 && v05 == 0) {
                                                                    j13.skip(8L);
                                                                    S s15 = new S(C03, s14.f38691c, j13.C0());
                                                                    th = null;
                                                                    s14 = s15;
                                                                } else {
                                                                    throw new IOException("unsupported zip: spanned");
                                                                }
                                                            } else {
                                                                throw new IOException("bad zip: expected " + L4.a.x0(101075792) + " but was " + L4.a.x0(v02));
                                                            }
                                                        } else {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                    }
                                                    th = null;
                                                }
                                                ArrayList arrayList7 = new ArrayList();
                                                C4116E J11 = R4.b.J(j13.i(s14.f38690b));
                                                long j15 = s14.f38689a;
                                                long j16 = 0;
                                                while (j16 < j15) {
                                                    ki.f J02 = L4.a.J0(J11);
                                                    AbstractC4141p abstractC4141p3 = abstractC4141p2;
                                                    Iterator it7 = it6;
                                                    if (J02.f37613g < s14.f38690b) {
                                                        C4113B c4113b = ki.e.f37603e;
                                                        if (C3100a.d(J02.f37607a)) {
                                                            arrayList7.add(J02);
                                                        }
                                                        j16++;
                                                        abstractC4141p2 = abstractC4141p3;
                                                        it6 = it7;
                                                    } else {
                                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                                    }
                                                }
                                                it = it6;
                                                AbstractC4141p abstractC4141p4 = abstractC4141p2;
                                                Ad.l.S(J11, null);
                                                abstractC4141p = abstractC4141p4;
                                                C4125N c4125n = new C4125N(g10, abstractC4141p, L4.a.Y(arrayList7));
                                                Ad.l.S(j13, null);
                                                c3959i = new C3959i(c4125n, ki.e.f37603e);
                                            } else {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                        } else {
                                            Iterator it8 = it6;
                                            AbstractC4141p abstractC4141p5 = abstractC4141p2;
                                            J10.close();
                                            h11--;
                                            if (h11 < max) {
                                                throw new IOException("not a zip: end of central directory signature not found");
                                            }
                                            abstractC4141p2 = abstractC4141p5;
                                            it6 = it8;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } finally {
                                        Ad.l.S(j13, th2);
                                    }
                                }
                            } else {
                                it = it6;
                                abstractC4141p = abstractC4141p2;
                                c3959i = null;
                            }
                            if (c3959i != null) {
                                arrayList6.add(c3959i);
                            }
                            abstractC4141p2 = abstractC4141p;
                            it6 = it;
                            i10 = 4;
                            z10 = false;
                        }
                        return kf.t.w2(arrayList6, arrayList5);
                    }
                }
                break;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Set mo122invoke() {
        int i10 = this.f17718Y;
        Object obj = this.f17719Z;
        switch (i10) {
            case 11:
                U3.n nVar = (U3.n) obj;
                nVar.getClass();
                HashSet hashSet = new HashSet();
                for (Bg.A a5 : ((C6862i) nVar.f17429i0).f52047s0.l()) {
                    for (AbstractC1003l abstractC1003l : Bi.c.Q0(a5.R(), null, 3)) {
                        if ((abstractC1003l instanceof T) || (abstractC1003l instanceof Mf.P)) {
                            hashSet.add(abstractC1003l.getName());
                        }
                    }
                }
                List<C3056y> list = ((C6862i) nVar.f17429i0).f52038j0.f30663v0;
                AbstractC3557B.b0("getFunctionList(...)", list);
                C6862i c6862i = (C6862i) nVar.f17429i0;
                for (C3056y c3056y : list) {
                    hashSet.add(R4.b.o1(c6862i.f52045q0.f11537b, c3056y.f30771k0));
                }
                List<fg.G> list2 = ((C6862i) nVar.f17429i0).f52038j0.f30664w0;
                AbstractC3557B.b0("getPropertyList(...)", list2);
                C6862i c6862i2 = (C6862i) nVar.f17429i0;
                for (fg.G g10 : list2) {
                    hashSet.add(R4.b.o1(c6862i2.f52045q0.f11537b, g10.f30314k0));
                }
                return AbstractC4273I.u2(hashSet, hashSet);
            default:
                zg.p pVar = (zg.p) obj;
                Set n10 = pVar.n();
                if (n10 != null) {
                    return AbstractC4273I.u2(AbstractC4273I.u2(pVar.m(), pVar.f52076c.f52067c.keySet()), n10);
                }
                return null;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        int i10 = this.f17718Y;
        Object obj = this.f17719Z;
        switch (i10) {
            case 21:
                C4670O c4670o = (C4670O) obj;
                if (!c4670o.f39423u0.l()) {
                    return;
                }
                Ad.l.O0(c4670o.p0(), null, null, new C4667L(c4670o, null), 3);
                return;
            default:
                Ii.B b10 = (Ii.B) obj;
                Hi.j jVar = b10.f8625Y;
                AbstractC6216a abstractC6216a = jVar.f7885e;
                long j6 = jVar.f7882b;
                long j10 = jVar.f7883c;
                Hi.j jVar2 = new Hi.j(jVar.f7881a, j6, j10, jVar.f7884d + 1, abstractC6216a);
                jVar.f7885e = null;
                b10.f8625Y = jVar2;
                return;
        }
    }
}
