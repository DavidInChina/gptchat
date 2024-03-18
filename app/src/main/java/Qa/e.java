package Qa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import fa.C2969F;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.t;
import kf.v;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import oa.i;
import wd.C6182c0;
import x8.W;
import yf.AbstractC6583a;

@AbstractC1998i
/* loaded from: classes.dex */
public final class e<ID, T> {
    public static final c Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final PluginGeneratedSerialDescriptor f14546d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f14547a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f14548b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14549c;

    /* JADX WARN: Type inference failed for: r0v0, types: [Qa.c, java.lang.Object] */
    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.util.Tree", null, 3);
        pluginGeneratedSerialDescriptor.k("rootNodeId", false);
        pluginGeneratedSerialDescriptor.k("nodes", false);
        pluginGeneratedSerialDescriptor.k("size", true);
        f14546d = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ e(int i10, Object obj, Map map, int i11) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, f14546d);
            throw null;
        }
        this.f14547a = obj;
        this.f14548b = map;
        if ((i10 & 4) == 0) {
            this.f14549c = map.size();
        } else {
            this.f14549c = i11;
        }
    }

    public static List c(e eVar, Object obj) {
        LinkedList linkedList = new LinkedList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        eVar.getClass();
        while (!linkedHashSet.contains(obj)) {
            linkedHashSet.add(obj);
            h hVar = (h) eVar.f14548b.get(obj);
            if (hVar != null) {
                h f6 = eVar.f(hVar.f14555b);
                if (f6 == null) {
                    return linkedList;
                }
                linkedList.addFirst(f6);
                obj = f6.f14554a;
            } else {
                throw new IllegalArgumentException("Node " + obj + " not found");
            }
        }
        Pc.c a5 = Pc.e.a();
        W.G(a5, "Cycle detected in tree (nodeId " + obj + Separators.RPAREN, null, 6);
        return v.f37483Y;
    }

    public final e a(Object obj, h hVar) {
        h a5 = h.a(hVar, obj, null, null, 13);
        Map map = this.f14548b;
        h hVar2 = (h) map.get(obj);
        if (hVar2 != null) {
            List list = hVar2.f14556c;
            Object obj2 = a5.f14554a;
            return new e(this.f14547a, AbstractC4268D.g1(AbstractC4268D.g1(map, new C3959i(obj, h.a(hVar2, null, t.x2(obj2, list), null, 11))), new C3959i(obj2, a5)));
        }
        throw new IllegalArgumentException("Node " + obj + " not found");
    }

    public final ArrayList b(Object obj) {
        Map map = this.f14548b;
        h hVar = (h) map.get(obj);
        if (hVar != null) {
            ArrayList x22 = t.x2(hVar, c(this, obj));
            ArrayList arrayList = new ArrayList();
            while (true) {
                h hVar2 = (h) map.get(obj);
                if (hVar2 != null) {
                    h f6 = f(t.h2(hVar2.f14556c));
                    if (f6 == null) {
                        return t.w2(arrayList, x22);
                    }
                    arrayList.add(f6);
                    obj = f6.f14554a;
                } else {
                    throw new IllegalArgumentException("Node " + obj + " not found");
                }
            }
        } else {
            throw new IllegalArgumentException("Node " + obj + " not found");
        }
    }

    public final ArrayList d(Object obj) {
        h hVar = (h) this.f14548b.get(obj);
        if (hVar != null) {
            return t.x2(hVar, c(this, obj));
        }
        throw new IllegalArgumentException("Node " + obj + " not found");
    }

    public final h e(i iVar) {
        T t10;
        Iterator<T> it = this.f14548b.values().iterator();
        while (true) {
            if (it.hasNext()) {
                t10 = it.next();
                if (((Boolean) iVar.invoke(t10)).booleanValue()) {
                    break;
                }
            } else {
                t10 = null;
                break;
            }
        }
        return (h) t10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return AbstractC3557B.K(this.f14548b, ((e) obj).f14548b);
        }
        return false;
    }

    public final h f(Object obj) {
        if (obj != null) {
            return (h) this.f14548b.get(obj);
        }
        return null;
    }

    public final h g(h hVar) {
        boolean z10;
        if (hVar == null) {
            return null;
        }
        if (((C2969F) hVar.f14557d).f30033z != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!Boolean.valueOf(z10).booleanValue()) {
            return g(f(hVar.f14555b));
        }
        return hVar;
    }

    public final e h(C6182c0 c6182c0, C2969F c2969f) {
        AbstractC3557B.c0("content", c2969f);
        Map map = this.f14548b;
        h hVar = (h) map.get(c6182c0);
        if (hVar != null) {
            return new e(this.f14547a, AbstractC4268D.g1(map, new C3959i(c6182c0, h.a(hVar, null, null, c2969f, 7))));
        }
        throw new IllegalArgumentException("Node " + c6182c0 + " not found");
    }

    public final int hashCode() {
        return this.f14548b.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(List list) {
        this(r10, r1);
        T t10;
        Object obj;
        int n02 = P4.a.n0(AbstractC6583a.H1(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(n02 < 16 ? 16 : n02);
        for (T t11 : list) {
            linkedHashMap.put(((h) t11).f14554a, t11);
        }
        Iterator<T> it = linkedHashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            Object obj2 = ((h) t10).f14555b;
            if (obj2 == null) {
                break;
            } else if (!linkedHashMap.containsKey(obj2)) {
                break;
            }
        }
        h hVar = (h) t10;
        if (hVar != null && (obj = hVar.f14554a) != null) {
            return;
        }
        String str = "Root not found, size: " + linkedHashMap.size() + ", " + t.m2(t.G2(linkedHashMap.values(), 2), null, null, null, b.f14545Y, 31);
        AbstractC3557B.c0("msg", str);
        throw new IllegalArgumentException(str);
    }

    public e(Object obj, Map map) {
        this.f14547a = obj;
        this.f14548b = map;
        this.f14549c = map.size();
    }
}
