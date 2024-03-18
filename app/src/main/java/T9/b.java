package T9;

import Lg.n;
import ca.AbstractC2313e;
import ca.AbstractC2314f;
import ca.AbstractC2318j;
import ca.C2311c;
import ca.C2312d;
import ca.C2315g;
import ca.C2316h;
import ca.C2317i;
import ca.EnumC2323o;
import fa.AbstractC2965B;
import fa.C2969F;
import fa.EnumC2970G;
import fa.EnumC2971H;
import fa.q;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kf.t;
import wd.C6182c0;
import x8.W;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16964a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f16965b;

    static {
        C6182c0.Companion.getClass();
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("toString(...)", uuid);
        String obj = n.C2(uuid, 0, 5, "bbb23").toString();
        AbstractC3557B.c0("value", obj);
        f16964a = obj;
        String uuid2 = UUID.randomUUID().toString();
        AbstractC3557B.b0("toString(...)", uuid2);
        f16965b = uuid2;
    }

    public static final AbstractC2313e a(List list) {
        AbstractC3557B.c0("<this>", list);
        return (AbstractC2313e) t.p2(b(list));
    }

    public static final ArrayList b(List list) {
        AbstractC3557B.c0("<this>", list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AbstractC2313e) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList c(C2311c c2311c, N9.c cVar, k kVar) {
        List b10;
        EnumC2971H enumC2971H;
        AbstractC3557B.c0("<this>", c2311c);
        AbstractC3557B.c0("conversationItemMapper", cVar);
        AbstractC3557B.c0("conversationState", kVar);
        Qa.h b11 = c2311c.b();
        ArrayList Q = W.Q(c2311c);
        ArrayList arrayList = new ArrayList();
        Iterator it = Q.iterator();
        EnumC2971H enumC2971H2 = null;
        N9.f fVar = null;
        EnumC2970G enumC2970G = null;
        while (it.hasNext()) {
            C2969F c2969f = (C2969F) it.next();
            Map map = cVar.f12758c;
            if (fVar != null && (enumC2971H = c2969f.f30011d) != EnumC2971H.f30046Y) {
                if (enumC2971H == EnumC2971H.f30047Z) {
                    EnumC2970G enumC2970G2 = EnumC2970G.f30034Y;
                    EnumC2970G enumC2970G3 = c2969f.f30022o;
                    if (enumC2970G3 != enumC2970G2 && enumC2970G != enumC2970G3) {
                        fVar.a(c2969f);
                        arrayList.addAll(fVar.b(EnumC2323o.f26407Z));
                        wf.k kVar2 = (wf.k) map.get(enumC2970G3);
                        if (kVar2 != null) {
                            fVar = (N9.f) kVar2.invoke(c2969f);
                        } else {
                            fVar = null;
                        }
                        enumC2970G = enumC2970G3;
                    }
                }
                if (fVar.a(c2969f)) {
                    arrayList.addAll(fVar.b(EnumC2323o.f26406Y));
                    fVar = null;
                }
            } else {
                if (fVar != null && c2969f.f30011d == EnumC2971H.f30046Y) {
                    arrayList.addAll(fVar.b(EnumC2323o.f26408h0));
                    arrayList.add(new C2316h(c2969f));
                } else if (map.keySet().contains(c2969f.f30022o)) {
                    enumC2970G = c2969f.f30022o;
                    wf.k kVar3 = (wf.k) map.get(enumC2970G);
                    if (kVar3 != null) {
                        fVar = (N9.f) kVar3.invoke(c2969f);
                    }
                } else {
                    arrayList.add(new C2316h(c2969f));
                }
                fVar = null;
            }
        }
        if (fVar != null && (b10 = fVar.b(EnumC2323o.f26406Y)) != null) {
            arrayList.addAll(b10);
        }
        List<da.e> list = c2311c.f26384k;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
        for (da.e eVar : list) {
            if (eVar instanceof da.c) {
                arrayList2.add(new C2312d(((da.c) eVar).f28169a));
            } else {
                throw new RuntimeException();
            }
        }
        ArrayList w22 = t.w2(arrayList2, arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = w22.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            AbstractC2318j abstractC2318j = (AbstractC2318j) next;
            if (!(abstractC2318j instanceof C2317i)) {
                if (abstractC2318j instanceof C2316h) {
                    C2969F c2969f2 = ((C2316h) abstractC2318j).f26391a;
                    EnumC2971H enumC2971H3 = c2969f2.f30011d;
                    if (enumC2971H3 == EnumC2971H.f30046Y || enumC2971H3 == EnumC2971H.f30047Z) {
                        AbstractC2965B abstractC2965B = c2969f2.f30015h;
                        if ((abstractC2965B instanceof fa.t) || (abstractC2965B instanceof fa.n) || (abstractC2965B instanceof q)) {
                            if (c2969f2.f30022o != EnumC2970G.f30041m0) {
                            }
                        }
                    }
                } else if (!(abstractC2318j instanceof C2315g) && !(abstractC2318j instanceof AbstractC2314f)) {
                    throw new RuntimeException();
                }
            }
            arrayList3.add(next);
        }
        if (kVar instanceof g) {
            AbstractC2313e a5 = a(arrayList3);
            if (a5 != null) {
                enumC2971H2 = a5.e();
            }
            EnumC2971H enumC2971H4 = EnumC2971H.f30047Z;
            if (enumC2971H2 != enumC2971H4) {
                return t.x2(new C2315g(new C2969F(f16965b, c2311c.f26374a, new fa.n(""), ((C2969F) b11.f14557d).f30023p, enumC2971H4, EnumC2970G.f30034Y, false, null, null, null, null, false, null, 8064)), arrayList3);
            }
            return arrayList3;
        }
        return arrayList3;
    }
}
