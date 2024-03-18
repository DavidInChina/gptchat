package ca;

import fa.AbstractC2965B;
import fa.C2969F;
import fa.EnumC2971H;
import ha.AbstractC3371n;
import ha.AbstractC3376t;
import ha.C3363f;
import ha.C3370m;
import ha.C3374q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import yf.AbstractC6583a;

/* renamed from: ca.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2313e extends AbstractC2318j {
    @Override // ca.AbstractC2318j
    public final String a() {
        if (this instanceof C2316h) {
            return ((C2316h) this).f26391a.f30008a;
        }
        if (this instanceof C2317i) {
            return ((C2969F) kf.t.f2(((C2317i) this).f26393b)).f30008a;
        }
        if (this instanceof C2315g) {
            return ((C2315g) this).f26390a.f30008a;
        }
        throw new RuntimeException();
    }

    public final ArrayList b() {
        C3374q c3374q;
        ArrayList arrayList;
        fa.n nVar;
        Collection collection;
        List<C3363f> list;
        C3370m c3370m;
        AbstractC3376t abstractC3376t = c().f30029v;
        if (abstractC3376t instanceof C3374q) {
            c3374q = (C3374q) abstractC3376t;
        } else {
            c3374q = null;
        }
        if (c3374q != null && (list = c3374q.f32076b) != null) {
            arrayList = new ArrayList();
            for (C3363f c3363f : list) {
                AbstractC3371n abstractC3371n = c3363f.f32062a;
                if (abstractC3371n instanceof C3370m) {
                    c3370m = (C3370m) abstractC3371n;
                } else {
                    c3370m = null;
                }
                if (c3370m != null) {
                    arrayList.add(c3370m);
                }
            }
        } else {
            arrayList = null;
        }
        Collection<String> collection2 = kf.v.f37483Y;
        ArrayList arrayList2 = arrayList;
        if (arrayList == null) {
            arrayList2 = collection2;
        }
        AbstractC2965B abstractC2965B = c().f30015h;
        if (abstractC2965B instanceof fa.n) {
            nVar = (fa.n) abstractC2965B;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            nVar.a().a(new fa.m(linkedHashSet));
            collection = kf.t.K2(linkedHashSet);
        } else {
            collection = null;
        }
        if (collection != null) {
            collection2 = collection;
        }
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(collection2, 10));
        for (String str : collection2) {
            arrayList3.add(new C3370m(str, null));
        }
        return kf.t.w2(arrayList3, arrayList2);
    }

    public final C2969F c() {
        if (this instanceof C2316h) {
            return ((C2316h) this).f26391a;
        }
        if (this instanceof C2317i) {
            return (C2969F) kf.t.o2(((C2317i) this).f26393b);
        }
        if (this instanceof C2315g) {
            return ((C2315g) this).f26390a;
        }
        throw new RuntimeException();
    }

    public final C2969F d() {
        Object obj;
        if (this instanceof C2316h) {
            return ((C2316h) this).f26391a;
        }
        if (this instanceof C2317i) {
            List list = ((C2317i) this).f26393b;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C2969F) obj).f30011d == EnumC2971H.f30047Z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C2969F c2969f = (C2969F) obj;
            if (c2969f == null) {
                return (C2969F) kf.t.f2(list);
            }
            return c2969f;
        } else if (this instanceof C2315g) {
            return ((C2315g) this).f26390a;
        } else {
            throw new RuntimeException();
        }
    }

    public final EnumC2971H e() {
        Object obj;
        EnumC2971H enumC2971H;
        if (this instanceof C2316h) {
            return ((C2316h) this).f26391a.f30011d;
        }
        if (this instanceof C2317i) {
            List list = ((C2317i) this).f26393b;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C2969F) obj).f30011d == EnumC2971H.f30047Z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C2969F c2969f = (C2969F) obj;
            if (c2969f != null && (enumC2971H = c2969f.f30011d) != null) {
                return enumC2971H;
            }
            return ((C2969F) kf.t.f2(list)).f30011d;
        } else if (this instanceof C2315g) {
            return ((C2315g) this).f26390a.f30011d;
        } else {
            throw new RuntimeException();
        }
    }
}
