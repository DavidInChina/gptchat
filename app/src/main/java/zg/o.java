package zg;

import fg.C3056y;
import fg.G;
import fg.T;
import id.AbstractC3557B;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.y;
import kg.C4294f;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import lg.AbstractC4456a;
import lg.C4462g;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f52064j;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f52065a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f52066b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f52067c;

    /* renamed from: d  reason: collision with root package name */
    public final Ag.n f52068d;

    /* renamed from: e  reason: collision with root package name */
    public final Ag.n f52069e;

    /* renamed from: f  reason: collision with root package name */
    public final Ag.m f52070f;

    /* renamed from: g  reason: collision with root package name */
    public final Ag.l f52071g;

    /* renamed from: h  reason: collision with root package name */
    public final Ag.l f52072h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ p f52073i;

    static {
        D d10 = C.f37623a;
        f52064j = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(o.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), d10.g(new kotlin.jvm.internal.u(d10.b(o.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public o(p pVar, List list, List list2, List list3) {
        this.f52073i = pVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C4294f o12 = R4.b.o1(pVar.f52075b.f11537b, ((C3056y) ((AbstractC4456a) obj)).f30771k0);
            Object obj2 = linkedHashMap.get(o12);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(o12, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f52065a = c(linkedHashMap);
        p pVar2 = this.f52073i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : list2) {
            C4294f o13 = R4.b.o1(pVar2.f52075b.f11537b, ((G) ((AbstractC4456a) obj3)).f30314k0);
            Object obj4 = linkedHashMap2.get(o13);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap2.put(o13, obj4);
            }
            ((List) obj4).add(obj3);
        }
        this.f52066b = c(linkedHashMap2);
        ((xg.m) this.f52073i.f52075b.f11536a).f50012c.getClass();
        p pVar3 = this.f52073i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj5 : list3) {
            C4294f o14 = R4.b.o1(pVar3.f52075b.f11537b, ((T) ((AbstractC4456a) obj5)).f30428j0);
            Object obj6 = linkedHashMap3.get(o14);
            if (obj6 == null) {
                obj6 = new ArrayList();
                linkedHashMap3.put(o14, obj6);
            }
            ((List) obj6).add(obj5);
        }
        this.f52067c = c(linkedHashMap3);
        this.f52068d = ((Ag.q) this.f52073i.f52075b.c()).b(new n(this, 0));
        this.f52069e = ((Ag.q) this.f52073i.f52075b.c()).b(new n(this, 1));
        this.f52070f = ((Ag.q) this.f52073i.f52075b.c()).c(new n(this, 2));
        Ag.u c10 = this.f52073i.f52075b.c();
        C6866m c6866m = new C6866m(this, this.f52073i, 0);
        Ag.q qVar = (Ag.q) c10;
        qVar.getClass();
        this.f52071g = new Ag.l(qVar, c6866m);
        Ag.u c11 = this.f52073i.f52075b.c();
        C6866m c6866m2 = new C6866m(this, this.f52073i, 1);
        Ag.q qVar2 = (Ag.q) c11;
        qVar2.getClass();
        this.f52072h = new Ag.l(qVar2, c6866m2);
    }

    public static LinkedHashMap c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P4.a.n0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractC4456a> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
            for (AbstractC4456a abstractC4456a : iterable) {
                int a5 = abstractC4456a.a();
                int f6 = C4462g.f(a5) + a5;
                if (f6 > 4096) {
                    f6 = 4096;
                }
                C4462g j6 = C4462g.j(byteArrayOutputStream, f6);
                j6.v(a5);
                abstractC4456a.d(j6);
                j6.i();
                arrayList.add(y.f36177a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    public final Collection a(C4294f c4294f, Tf.a aVar) {
        AbstractC3557B.c0("name", c4294f);
        if (!((Set) A7.b.X0(this.f52071g, f52064j[0])).contains(c4294f)) {
            return kf.v.f37483Y;
        }
        return (Collection) this.f52068d.invoke(c4294f);
    }

    public final Collection b(C4294f c4294f, Tf.a aVar) {
        AbstractC3557B.c0("name", c4294f);
        if (!((Set) A7.b.X0(this.f52072h, f52064j[1])).contains(c4294f)) {
            return kf.v.f37483Y;
        }
        return (Collection) this.f52069e.invoke(c4294f);
    }
}
