package Uf;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import kf.AbstractC4268D;
import kg.C4290b;
import kg.C4291c;
import kg.C4293e;
import kg.C4294f;
import yf.AbstractC6583a;

/* renamed from: Uf.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1447i {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f17821a;

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f17822b;

    /* renamed from: c  reason: collision with root package name */
    public static final Set f17823c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set f17824d;

    static {
        C4293e c4293e = Jf.p.f9177j;
        C4291c g10 = c4293e.b(C4294f.e("name")).g();
        AbstractC3557B.b0("toSafe(...)", g10);
        C3959i c3959i = new C3959i(g10, Jf.q.f9197d);
        C4291c g11 = c4293e.b(C4294f.e("ordinal")).g();
        AbstractC3557B.b0("toSafe(...)", g11);
        C3959i c3959i2 = new C3959i(g11, C4294f.e("ordinal"));
        C3959i c3959i3 = new C3959i(Jf.p.f9144B.c(C4294f.e("size")), C4294f.e("size"));
        C4291c c4291c = Jf.p.f9148F;
        C3959i c3959i4 = new C3959i(c4291c.c(C4294f.e("size")), C4294f.e("size"));
        C4291c g12 = Jf.p.f9172e.b(C4294f.e("length")).g();
        AbstractC3557B.b0("toSafe(...)", g12);
        Map a12 = AbstractC4268D.a1(c3959i, c3959i2, c3959i3, c3959i4, new C3959i(g12, C4294f.e("length")), new C3959i(c4291c.c(C4294f.e("keys")), C4294f.e("keySet")), new C3959i(c4291c.c(C4294f.e(DiagnosticsEntry.Histogram.VALUES_KEY)), C4294f.e(DiagnosticsEntry.Histogram.VALUES_KEY)), new C3959i(c4291c.c(C4294f.e("entries")), C4294f.e("entrySet")));
        f17821a = a12;
        Set<Map.Entry> entrySet = a12.entrySet();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new C3959i(((C4291c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3959i c3959i5 = (C3959i) it.next();
            C4294f c4294f = (C4294f) c3959i5.f36156Z;
            Object obj = linkedHashMap.get(c4294f);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c4294f, obj);
            }
            ((List) obj).add((C4294f) c3959i5.f36155Y);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P4.a.n0(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), kf.t.Y1((Iterable) entry2.getValue()));
        }
        f17822b = linkedHashMap2;
        Map map = f17821a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str = Lf.d.f11067a;
            C4293e i10 = ((C4291c) entry3.getKey()).e().i();
            AbstractC3557B.b0("toUnsafe(...)", i10);
            C4290b f6 = Lf.d.f(i10);
            AbstractC3557B.Z(f6);
            linkedHashSet.add(f6.b().c((C4294f) entry3.getValue()));
        }
        Set keySet = f17821a.keySet();
        f17823c = keySet;
        Set<C4291c> set = keySet;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(set, 10));
        for (C4291c c4291c2 : set) {
            arrayList2.add(c4291c2.f());
        }
        f17824d = kf.t.P2(arrayList2);
    }
}
